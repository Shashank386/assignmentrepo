package assignment.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {
	public static List<String> realFileAsListInUpperCase(String filePath){
		List<String> ls = new ArrayList<String>();
		BufferedReader br = null;
		try {
			 br = new BufferedReader(new FileReader(new File(filePath)));
			String temp = null;
			while( (temp=br.readLine()) != null) {
				ls.add(temp.toUpperCase());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try{br.close();}catch(Exception e) {e.printStackTrace();}
		}
		return ls;
	}
}
