package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert {
	@Test
	public void test_num2text_zero () {
		// Given
		String input = "0";
		String expected = "zéro";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	
	public void test_num2text_un (){
		String input = "1";
		String expected = "un";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}
	
}
