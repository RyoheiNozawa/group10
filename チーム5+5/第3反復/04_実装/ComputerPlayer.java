package 第3反復三目並べ;

import java.util.Random;

public class ComputerPlayer extends Player {

	public ComputerPlayer(String order, Mark mark) {
		super(order, mark);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public Square inputCoodinate(Board board) {
		int x = 0;
		int y = 0;
		
		Square square;
		
		while(true) {
			Random random = new Random();
			x = random.nextInt(3) + 1;
			y = random.nextInt(3) + 1;
			square = board.getSquare(x, y);
			if(square.checkStatus() == false) {
				break;
			}
		}
		
		System.out.println("コンピューターのターン");
		return square;
	}

}
