package 三目並べ;

import java.util.Random;

public class ComputerPlayer extends Player {
	//private Scanner scanner = new Scanner(System.in);

	public ComputerPlayer(String order, Mark mark) {
		super(order, mark);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	protected Square inputCoodinate(Board board) {
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
		
		/*
		while(cell.getStatus() == true) {
			x = random.nextInt(3) + 1;
			y = random.nextInt(3) + 1;
			cell = board.getCell(x, y);
		}
		*/
		
		//System.out.println("コンピューターのターン");
		return square;
	}

}
