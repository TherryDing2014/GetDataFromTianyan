package com.therryding.cn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileManager {
	public int save(String filePath,String data) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		try{
			fos = new FileOutputStream(filePath);
			if(fos != null){
				OutputStreamWriter writer = null;
				try{
					writer = new OutputStreamWriter(fos, "UTF-8"); 
					writer.write(data);
				}
				catch(IOException e){
					e.printStackTrace();
					return -2;//write file error
				}
				finally{
					if(writer != null){
						try{
							writer.close();
						}
						catch(IOException e){
							e.printStackTrace();
							return -1;
						}
					}
				}
			}
		}
		catch(FileNotFoundException fne){
			fne.printStackTrace();
			return -1;//create file error
		}
		finally{
			if(fos != null){
				try{
					fos.close();
				}
				catch(IOException fne){
					fne.printStackTrace();
					return -1;//create file error
				}
			}
		}
		
		return 0;
	}
	
	public String read(String filePath) {
		// TODO Auto-generated method stub
		try{
			File file = new File(filePath);
			StringBuilder result = new StringBuilder();
	        try{
	            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"utf-8"));
	            String s = null;
	            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
	                result.append(System.lineSeparator()+s);
	            }
	            br.close();    
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	        return result.toString();
		}
		catch(NullPointerException nulle){
			nulle.printStackTrace();
			return null;
		}
	}
}
