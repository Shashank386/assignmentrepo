package assignment.utils;

import java.io.File;
import java.util.List;

public class Dictionary {

	private static List<String> dictionary;
	static {
		dictionary = loadDictionary();
	}

	public static List<String> loadDictionary(){
		return FileHelper.realFileAsListInUpperCase(System.getProperty("user.dir")+File.separator+"dictionary.txt");
	}

	public static boolean isEnglishWord(String word) {
		if(dictionary.contains(word.trim().toUpperCase())) {
			return true;
		}
		return false;
	}


}
