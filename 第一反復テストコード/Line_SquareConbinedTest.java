package 三目並べ;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class Line_SquareConbinedTest {
	
	
@Test
public void testCheckLine_1_1() {
	Square square1 = new Square(1,1);
	Square square2= new Square(2,1);
	Square square3 = new Square(3,1);
	
	square1.setMark(Mark.CIRCLE);
	square2.setMark(Mark.CIRCLE);
	square3.setMark(Mark.NONE);
	
	Line line = new Line();
	line.addSquare(square1);
	line.addSquare(square2);
	line.addSquare(square3);
	
	boolean expexcted_CheckLine = false;
	
	boolean actual = line.checkLine();
	
	assertThat(actual, is(expexcted_CheckLine));
	
}

@Test
public void testCheckLine_1_2() {
	Square square1 = new Square(1,1);
	Square square2= new Square(2,1);
	Square square3 = new Square(3,1);
	
	square1.setMark(Mark.CIRCLE);
	square2.setMark(Mark.CROSS);
	square3.setMark(Mark.CIRCLE);
	
	Line line = new Line();
	line.addSquare(square1);
	line.addSquare(square2);
	line.addSquare(square3);
	
	boolean expexcted_CheckLine = false;
	
	boolean actual = line.checkLine();
	
	assertThat(actual, is(expexcted_CheckLine));
	
}

@Test
public void testCheckLine_1_3() {
	Square square1 = new Square(1,1);
	Square square2= new Square(2,1);
	Square square3 = new Square(3,1);
	
	square1.setMark(Mark.CIRCLE);
	square2.setMark(Mark.CIRCLE);
	square3.setMark(Mark.CIRCLE);
	
	Line line = new Line();
	line.addSquare(square1);
	line.addSquare(square2);
	line.addSquare(square3);
	
	boolean expexcted_CheckLine = true;
	
	boolean actual = line.checkLine();
	
	assertThat(actual, is(expexcted_CheckLine));
	
}

@Test
public void testCheckLine_1_4() {
	Square square1 = new Square(1,1);
	Square square2= new Square(2,1);
	Square square3 = new Square(3,1);
	
	square1.setMark(Mark.CROSS);
	square2.setMark(Mark.CROSS);
	square3.setMark(Mark.CROSS);
	
	Line line = new Line();
	line.addSquare(square1);
	line.addSquare(square2);
	line.addSquare(square3);
	
	boolean expexcted_CheckLine = true;
	
	boolean actual = line.checkLine();
	
	assertThat(actual, is(expexcted_CheckLine));
	
}

}
