package 三目並べ;

import java.util.Scanner;

	class Player {
	private Scanner scanner = new Scanner(System.in);
	private String order; //プレイヤーの順番
	private Mark mark; //プレイヤーのマーク
	
	//コンストラクタ
	public Player(String order , Mark mark) {
		this.order = order;
		this.mark = mark;
	}
	
	//プレイヤーの順番を取得
	public String getOrder() {
		return order;
	}
	
	//プレイヤーのマークを取得
	public Mark getMark() {
		return mark;
	}
	
	protected Square inputCoodinate(Board board) {
		int x = 0;
		int y = 0;
		
		Square square;
		
		while(true) {
			
			while(true) {
				System.out.println("列と行を、半角スペースで区切って入力して下さい(例：2列目の3行目→ 2 3)");
				try {
					x = Integer.parseInt(scanner.next());
					y = Integer.parseInt(scanner.next());
				
					if(x > 0 && x <= Board.SIZE 
							&& y > 0 && y <= Board.SIZE) {
						break;
					
					}else{
						System.out.println("1～3の範囲で入力してください");
						}
				}catch(NumberFormatException e) {
				
					System.out.println("入力値が正しくありません、半角or全角数字で入力してください");
			
				}
			
			}	
			square = board.getSquare(x, y);
		
			if(square.checkStatus() == false) {
				
				break;
			}else {
				System.out.println("既に置かれています");
			}
		
			
		}	return square;
	}
}
