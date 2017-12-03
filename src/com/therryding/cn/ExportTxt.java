package com.therryding.cn;

import java.util.ArrayList;

import com.therryding.DataModel.CompanyInfo;

public class ExportTxt implements ExportData {

	@Override
	public int export(String filePath,ArrayList<CompanyInfo> data) {
		// TODO Auto-generated method stub
			String strData = "";
			for(int i=0;i<data.size();i++){
				strData += data.get(i).toString();
			}
			return (new FileManager()).save(filePath,strData);
	}
}
