package helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Combination {
	
	Set<String> combinationString = new HashSet<String>();
	private StringBuilder output = new StringBuilder();
    private String inputstring;
    
    public Set<String> getCombinations(String string) {
    	this.inputstring = string;
    	combine();
    	return combinationString;
    }
    
	public void combine() { combine( 0 ); }
    
	private void combine(int start ){
        for( int i = start; i < inputstring.length(); ++i ){
            output.append( inputstring.charAt(i) );
//            System.out.println( output );
            char[] k = output.toString().toCharArray();
            Arrays.sort(k);
            combinationString.add(new String(k));
            if ( i < inputstring.length() )
            combine( i + 1);
            output.setLength( output.length() - 1 );
        }
    }
}
