package assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import helper.PermutationCombinationUtil;

public class Test1 {

	@DataProvider(name="data")
	public static Object[][]  data(){
		Object[][] k = new Object[1][2];
		k[0][0] = "WORKING"; k[0][1] = "RING,KING,ROW,WORK,KNOW";
		return k;		
	}
	

	@Test(dataProvider = "data")
	public void  validate_English_Worlds(String word, String validation)
	{
		List<String> actual = PermutationCombinationUtil.getAllValidWords(word);
		Collections.sort(actual);

		List<String> expected = Arrays.asList(validation.split(","));
		Collections.sort(expected);
		Assert.assertEquals(actual,expected);
	}
}