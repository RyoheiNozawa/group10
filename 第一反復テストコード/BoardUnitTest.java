package 三目並べ;


import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Before;
import org.junit.Test;

public class BoardUnitTest {
	
	//Boardのフィールドlinesのアクセス修飾子をpublicに変更しテスト実施
	
	Board board;
	LineStub line1;
	LineStub line2;
	LineStub line3;
	LineStub line4;
	LineStub line5;
	LineStub line6;
	LineStub line7;
	LineStub line8;
	
	Square square1;
	Square square2;
	Square square3;
	Square square4;
	Square square5;
	Square square6;
	Square square7;
	Square square8;
	Square square9;
	
	
	
	
	@Before
	public void setUp() {
		board = new Board();
		line1 = new LineStub();
		line2 = new LineStub();
		line3 = new LineStub();
		line4 = new LineStub();
		line5 = new LineStub();
		line6 = new LineStub();
		line7 = new LineStub();
		line8 = new LineStub();
		
		board.addLine(line1);
		board.addLine(line2);
		board.addLine(line3);
		board.addLine(line4);
		board.addLine(line5);
		board.addLine(line6);
		board.addLine(line7);
		board.addLine(line8);
		
		
		

		square1 = board.getSquare(1, 1);	
		square2 = board.getSquare(1, 2);
		square3 = board.getSquare(1, 3);
		square4 = board.getSquare(2, 1);
		square5 = board.getSquare(2, 2);
		square6 = board.getSquare(2, 3);	
		square7 = board.getSquare(3, 1);
		square8 = board.getSquare(3, 2);
		square9 = board.getSquare(3, 3);
		
		
	}
	
	@Test
	public void Test1_1() {
		
		line1.setStatus(true);
		boolean actual = board.judgeWin();
		
		assertThat(actual, is(true));
		
	}
	
	@Test
	public void Tesd2_1() {
		boolean actual = board.judgeWin();
		
		assertThat(actual, is(false));
	}
	
	@Test
	public void Test2_1() {
		
		square1.setMark(Mark.CIRCLE);	
		square2.setMark(Mark.CIRCLE);	
		square3.setMark(Mark.CIRCLE);	
		square4.setMark(Mark.CIRCLE);	
		square5.setMark(Mark.CIRCLE);	
		square6.setMark(Mark.CIRCLE);	
		square7.setMark(Mark.CIRCLE);	
		square8.setMark(Mark.CIRCLE);	
		square9.setMark(Mark.CIRCLE);	
		
		boolean actual = board.judgeDraw();
		assertThat(actual, is(true));
		
	}
	
	@Test
	public void Test2_2() {
		//cell1にはマークをセットしない
		square2.setMark(Mark.CIRCLE);	
		square3.setMark(Mark.CIRCLE);	
		square4.setMark(Mark.CIRCLE);	
		square5.setMark(Mark.CIRCLE);	
		square6.setMark(Mark.CIRCLE);	
		square7.setMark(Mark.CIRCLE);	
		square8.setMark(Mark.CIRCLE);	
		square9.setMark(Mark.CIRCLE);	
		
		boolean actual = board.judgeDraw();
		assertThat(actual, is(false));
	}
	
	
	
}
