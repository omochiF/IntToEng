package test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
import inttoeng.IntToEng;

public class IntToEngTest {

	
	@Test
	public void translateEngに0を与える() {
		IntToEng ite = new IntToEng();
		String expected = "zero";
		String actual = ite.translateEng(0);
		assertThat(actual, is(expected));
	}
	@Test
	public void translateEngに13を与える() {
		IntToEng ite = new IntToEng();
		String expected = "thirteen";
		String actual = ite.translateEng(13);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngに20を与える() {
		IntToEng ite = new IntToEng();
		String expected = "twenty";
		String actual = ite.translateEng(20);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngに99を与える() {
		IntToEng ite = new IntToEng();
		String expected = "ninety nine";
		String actual = ite.translateEng(99);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngに100を与える() {
		IntToEng ite = new IntToEng();
		String expected = "one hundred";
		String actual = ite.translateEng(100);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngに111を与える() {
		IntToEng ite = new IntToEng();
		String expected = "one hundred eleven";
		String actual = ite.translateEng(111);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void translateEngに333を与える() {
		IntToEng ite = new IntToEng();
		String expected = "three hundred thirty three";
		String actual = ite.translateEng(333);
		assertThat(actual, is(expected));
	}
	

}
