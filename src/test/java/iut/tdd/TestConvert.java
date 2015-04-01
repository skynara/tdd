package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert {
	@Test
	public void test_num2text_zero () {
		Assert.assertEquals("zéro",new Convert().num2text("0"));
	}
	
	@Test
	public void test_num2text_un () {
		Assert.assertEquals("un",new Convert().num2text("1"));
	}
	
	@Test
	public void test_num2text_deux () {
		Assert.assertEquals("deux",new Convert().num2text("2"));
	}
	
	@Test
	public void test_num2text_trois() {
		Assert.assertEquals("trois",new Convert().num2text("3"));
	}
	
	@Test
	public void test_num2text_quatre () {
		Assert.assertEquals("quatre",new Convert().num2text("4"));
	}
	
	@Test
	public void test_num2text_cinq () {
		Assert.assertEquals("cinq",new Convert().num2text("5"));
	}
	
	@Test
	public void test_num2text_six () {
		Assert.assertEquals("six",new Convert().num2text("6"));
	}
	
	@Test
	public void test_num2text_sept () {
		Assert.assertEquals("sept",new Convert().num2text("7"));
	}
	
	@Test
	public void test_num2text_huit () {
		Assert.assertEquals("huit",new Convert().num2text("8"));
	}
	
	@Test
	public void test_num2text_neuf () {
		Assert.assertEquals("neuf",new Convert().num2text("9"));
	}
	
	@Test
	public void test_num2text_dix () {
		Assert.assertEquals("dix",new Convert().num2text("10"));
	}
	
	@Test
	public void test_num2text_onze () {
		Assert.assertEquals("onze",new Convert().num2text("11"));
	}
	
	@Test
	public void test_num2text_douze () {
		Assert.assertEquals("douze",new Convert().num2text("12"));
	}
	
	@Test
	public void test_num2text_treize () {
		Assert.assertEquals("treize",new Convert().num2text("13"));
	}
	
	@Test
	public void test_num2text_quatorze () {
		Assert.assertEquals("quatorze",new Convert().num2text("14"));
	}
	
	@Test
	public void test_num2text_quinze () {
		Assert.assertEquals("quinze",new Convert().num2text("15"));
	}
	
	@Test
	public void test_num2text_seize () {
		Assert.assertEquals("seize",new Convert().num2text("16"));
	}
	
	@Test
	public void test_num2text_dixsept () {
		Assert.assertEquals("dixsept",new Convert().num2text("17"));
	}
	@Test
	public void test_num2text_dixhuit () {
		Assert.assertEquals("dixhuit",new Convert().num2text("18"));
	}
	
	@Test
	public void test_num2text_dixneuf () {
		Assert.assertEquals("dixneuf",new Convert().num2text("19"));
	}
	
	@Test
	public void test_num2text_vingt () {
		Assert.assertEquals("vingt",new Convert().num2text("20"));
	}
}
