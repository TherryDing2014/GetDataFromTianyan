package com.therryding.cn;

import java.util.*;
import com.therryding.DataModel.*;
/**
* ���ݵ������
* @author Therry
* @Time 2017-12-1
*
*/
public interface ExportData {
	/**
	* ��������
	* @author Therry
	* @Time 2017-12-1
	* @param �ļ�·�� �ļ�����
	* @return 0:�ɹ� -1:�����ļ�ʧ�� -2:д���ļ�ʧ��
	*/
	public int export(String filePath,ArrayList<CompanyInfo> data);
}
