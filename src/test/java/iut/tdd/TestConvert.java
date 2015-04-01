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
}
