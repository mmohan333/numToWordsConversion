package numToWordsConversion;

import junit.framework.Assert;
import org.junit.Test;
import numToWordsConversion.NumberToWord;

public class TestConversion {

	@Test
	public void test1_NumberToWord() {

		String n = "1234567";
		NumberToWord x = new NumberToWord(n);
		Assert.assertEquals(x.NumberToWord1(), "Twelve  Lakh Thirty Four Thousand Five  Hundred Sixty Seven");
	}
	
	@Test
	public void test2_NumberToWord() {

		String n = "1234";
		NumberToWord x = new NumberToWord(n);
//		System.out.println(x.NumberToWord1());
		Assert.assertEquals(x.NumberToWord1(), "One  Thousand Two  Hundred Thirty Four");
	}

}
