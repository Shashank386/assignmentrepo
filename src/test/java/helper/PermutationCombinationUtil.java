package helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import assignment.utils.Dictionary;


public class PermutationCombinationUtil {

public static List<String> getAllValidWords(String word){
	List<String> kl = new ArrayList<String>(); 
	Combination comp = new Combination();
	Set<String> combinations = comp.getCombinations(word);
	for(String combination : combinations) {
		if(combination.length() > 1) {
			List<String> ls = Permute.permute(combination);
			for(String l : ls) {
				if(Dictionary.isEnglishWord(l.toUpperCase())) {
					if(!kl.contains(l.toUpperCase())) {
						kl.add(l.toUpperCase());
					}
				}
			}
		}
	}
	return kl;
}

}
