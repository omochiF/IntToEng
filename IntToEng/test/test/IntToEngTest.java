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

}
