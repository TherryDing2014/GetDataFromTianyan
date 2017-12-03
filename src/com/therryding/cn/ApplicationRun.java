package com.therryding.cn;

import java.io.File;
import java.util.*;

import com.therryding.DataModel.CompanyInfo;

public class ApplicationRun {
	public static void main(String []args){
		System.out.println("Run");
		GetManager cm = new GetManager();
		String filePath = ".\\上海鎏鹤汽车俱乐部有限公司_【信用信息_诉讼信息_财务信息_注册信息_电话地址_招聘信息】查询-天眼查.html";
		FileManager fm = new FileManager();
		cm.pauseHtml(fm.read(filePath));
//		String test = cm.getUrl("上海宝钿实业有限公司");
//		FileManager fm = new FileManager();
//		fm.save("test.html", test);
//		ArrayList<CompanyInfo> clist = new ArrayList<CompanyInfo>();
//		for(int i=0;i<10;i++)
//		{
//			clist.add(new CompanyInfo("ABC","15618080151",
//					"497719681@qq.com","TT"));
//			System.out.print(clist.get(i).toString());
//		}
//		ExportData export = new ExportTxt();
//		if(export.export("test.txt", clist) == 0)
//			System.out.println("export test.txt success!");
//		else 
//			System.out.println("export test.txt falid!");
//		export = new ExportCSV();
//		if(export.export("test.csv", clist) == 0)
//			System.out.println("export test.csv success!");
//		else 
//			System.out.println("export test.csv falid!");
//		System.out.println("exit");
	}
}
