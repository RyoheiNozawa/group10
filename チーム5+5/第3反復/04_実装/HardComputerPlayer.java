package 第3反復三目並べ;

import java.util.Random;

public class HardComputerPlayer extends Player {
	
	public HardComputerPlayer(String order, Mark mark) {
		super(order, mark);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public Square inputCoodinate(Board board) {
		int x = 0;
		int y = 0;
		Square square = null;
		int count = 0;
		
		x = 2;
		y = 2;
		square = board.getSquare(x, y);
		
			if(count==0) {
				
				square = board.getSquare(x, y);
				if (square.checkStatus() == false) {
					count++;
				System.out.println("コンピューターのターン");
				return square;
				}
			while (true) {
				square = board.judgePut(); 
				if(square == null) {
					Random random = new Random();
					x = random.nextInt(3) + 1;
					y = random.nextInt(3) + 1;
					square = board.getSquare(x, y);
					if(square.checkStatus() == false) {
						break;
					}
				}else
					break;
			}
		}
		System.out.println("コンピューターのターン");
			return square;
		}
	}
