package 三目並べ;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SquareUnitTest {
	

	@Test
	public void testGetstatus_1_1() {
		Square square = new Square(1, 1);
		square.setMark(Mark.CIRCLE);
		boolean expected_Getstatus = true;

		boolean actual = square.checkStatus();

		assertThat(actual, is(expected_Getstatus));
	}

	@Test
	public void testGetstatus_1_2() {
		Square square = new Square(1, 1);
		boolean expected_Getstatus = false;

		boolean actual = square.checkStatus();

		assertThat(actual, is(expected_Getstatus));
	}

	@Test
	public void testGetMark_2_1() {
		Square square = new Square(1, 1);
		square.setMark(Mark.CIRCLE);
		Mark expected_GetMark = Mark.CIRCLE;

		Mark actual = square.getMark();

		assertThat(actual, is(expected_GetMark));
	}

	@Test
	public void testGetMark_2_2() {
		Square square = new Square(1, 1);
		square.setMark(Mark.CROSS);
		Mark expected_GetMark = Mark.CROSS;

		Mark actual = square.getMark();

		assertThat(actual, is(expected_GetMark));
	}

	@Test
	public void testGetMark_2_3() {
		Square square = new Square(1, 1);
		Mark expected_GetMark = Mark.NONE;

		Mark actual = square.getMark();

		assertThat(actual, is(expected_GetMark));
	}
}