package com.therryding.cn;

import java.util.*;
import com.therryding.DataModel.*;
/**
* 数据导出借口
* @author Therry
* @Time 2017-12-1
*
*/
public interface ExportData {
	/**
	* 导出方法
	* @author Therry
	* @Time 2017-12-1
	* @param 文件路径 文件数据
	* @return 0:成功 -1:创建文件失败 -2:写入文件失败
	*/
	public int export(String filePath,ArrayList<CompanyInfo> data);
}
