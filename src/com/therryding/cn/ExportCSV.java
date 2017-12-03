package com.therryding.cn;

import java.util.*;
import com.therryding.DataModel.CompanyInfo;

public class ExportCSV extends ExportTxt {
	@Override
	public int export(String filePath,ArrayList<CompanyInfo> data){
		String strData = CompanyInfo.getHeader();
		for(int i=0;i<data.size();i++){
			strData += data.get(i).toString();
		}
		return (new FileManager()).save(filePath, strData);
	}
}
