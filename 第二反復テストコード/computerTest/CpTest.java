package 三目並べ;

public class CpTest {
	static ComputerPlayer NPC = new ComputerPlayer("後攻",Mark.CROSS);
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		for(int i=0;i<10;i++) {
			Board board = new Board(); 
			Square square;
			square=NPC.inputCoodinate(board);
			//setSquare(square); turnとセルを紐づける必要がないからいらない
			square.setMark(NPC.getMark());
			board.showBoard();
		}
	}
	
}
