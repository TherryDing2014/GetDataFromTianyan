package com.therryding.cn;

import java.io.IOException;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GetManager {
	private final String baseUrl = "https://www.tianyancha.com/search?key=";
	private final String companyUrl = "https://www.tianyancha.com/company/";
	private final String cookieStr = "TYCID=0f79e030af4111e78e5911bb56d0f9d4; uccid=6dcfcd387d5a8bd5e076a16ba4398478; ssuid=7226605510; RTYCID=787965ab90864cbfae3961dd06cdf75b; aliyungf_tc=AQAAADKrmVRfLAEADr2ucy016gfZEk8n; csrfToken=HVY-JROi_rvLvEZ8e1dlXgx2; Hm_lvt_e92c8d65d92d534b0fc290df538b4758=1512216320,1512270988,1512271340,1512292987; Hm_lpvt_e92c8d65d92d534b0fc290df538b4758=1512293069; token=205ae83ce32e42c4b8e099be066193e6; _utm=e45c7bccb3fc4fd19bee80a1e18cfec6; bannerFlag=true; tyc-user-info=%257B%2522token%2522%253A%2522eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIxNTYxODA4MDE1MSIsImlhdCI6MTUxMjI5MzE1OSwiZXhwIjoxNTI3ODQ1MTU5fQ.e0OPLX9ALWflHaczOspwzUwIs7l5zwtuCDQ78kbb8d2CaJ9cZlAFz55_tFlwTXuxkRWbZ9hvmhsm8g6Ic4Uc8w%2522%252C%2522integrity%2522%253A%25220%2525%2522%252C%2522state%2522%253A%25220%2522%252C%2522vipManager%2522%253A%25220%2522%252C%2522vnum%2522%253A%25220%2522%252C%2522onum%2522%253A%25220%2522%252C%2522mobile%2522%253A%252215618080151%2522%257D; auth_token=eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIxNTYxODA4MDE1MSIsImlhdCI6MTUxMjI5MzE1OSwiZXhwIjoxNTI3ODQ1MTU5fQ.e0OPLX9ALWflHaczOspwzUwIs7l5zwtuCDQ78kbb8d2CaJ9cZlAFz55_tFlwTXuxkRWbZ9hvmhsm8g6Ic4Uc8w; _csrf=i2Yye364pSLTPKu/Zjnf7g==; OA=Qe7Qv/jS1m78h8jO4aZSlr44s80Zj7bu3TQKnty5L84QM2MTOmi+5LbzE7REnR776FqLc6hzLUg9rSrRRCMdp8KrV3AraPERddmmzNCaQFtacjPVPavkAqMcTv1yBDrZXqGtGrCDszWc3/gUDfbYokiGrHwwRnt4SFvzOFklggtTacPBN29xbKOSxD5mU336eHXvljJcLhdreZZ5OltAHbOjtTp5R2okHBx87A/CPFI=; _csrf_bk=c54ab9d6e8a76676d80b22d1c65b9390";
	
	public String getUrl(String companyName){
		try{
			String url = baseUrl + companyName + "&checkFrom=searchBox";
			//String url = "https://www.tianyancha.com/search?key=%E4%B8%8A%E6%B5%B7%E9%8E%8F%E9%B9%A4%E6%B1%BD%E8%BD%A6%E4%BF%B1%E4%B9%90%E9%83%A8%E6%9C%89%E9%99%90%E5%85%AC%E5%8F%B8&checkFrom=searchBox";
			//String url = "https://www.tianyancha.com/search?key=上海鎏鹤汽车俱乐部有限公司&checkFrom=searchBox";
			//String url = "https://www.tianyancha.com/company/723049580";
			Document doc = Jsoup.connect(url)
					.header("Accept", "*/*")
					.header("Accept-Encoding", "gzip, deflate, br")
					.header("ContentType", "application/json; charset=UTF-8")
					.header("Accept-Language", "zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3")
					//.header("Referer", url)
					.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36")
					.timeout(10000)
					.cookie("Cookie",cookieStr)
					.get();
			return new String(doc.html());
		}
		catch(IOException e){
			e.printStackTrace();
		}
		return "";
	}
	
	public void pauseHtml(String html){
		Document doc = Jsoup.parse(html);
		Elements blocks = doc.select("div.in-block");
		if(blocks != null){
			for(Element b:blocks){
				if(b.text().indexOf("电话") != -1 &&
						b.text().indexOf("版权所有") == -1){
					System.out.println(b.text());
				}
				if(b.text().indexOf("邮箱") != -1){
					System.out.println(b.text());
				}
				if(b.text().indexOf("网址") != -1){
					System.out.println(b.text());
				}
				if(b.text().indexOf("地址") != -1 &&
						b.text().indexOf("版权所有") == -1){
					System.out.println(b.text());
				}
				if(b.text().indexOf("执行董事") != -1 && 
						b.text().length() > new String("执行董事").length()){
					System.out.println(b.text());
				}
			}
		}
	}
}
