package helper;

import java.util.ArrayList;
import java.util.List;

public class Permute {  
	
	private static List<String> permutation = new ArrayList<String>();
	
	public static String swapString(String a, int i, int j) {  
        char[] b =a.toCharArray();  
        char ch;  
        ch = b[i];  
        b[i] = b[j];  
        b[j] = ch;  
        return String.valueOf(b);  
    }  
      
    public static List<String> permute(String str)  
    {  
        int len = str.length();  
        generatePermutation(str, 0, len);  
        return permutation;
    }  
      
    public static void generatePermutation(String str, int start, int end)  
    {  
        if (start == end-1)  
        	permutation.add(str);  
        else  
        {  
            for (int i = start; i < end; i++)  
            {  
                str = swapString(str,start,i);  
                generatePermutation(str,start+1,end);  
                str = swapString(str,start,i);  
            }  
        }  
    }  
}  
