package 第3反復三目並べ;

public class Turn {
	
	private Player player;//プレイヤー
	private Square square;//セル
	
	//コンストラクタ
	public Turn(Player player) {
		this.player = player;
		this.square = null;
	}
	
	//セルのセッター
	public void setSquare(Square square) {
		this.square = square;
	}
	
	//ターン実行
	public void conduct(Board board) {
		Square square;
		square = this.player.inputCoodinate(board);
		this.setSquare(square);
		square.setMark(this.player.getMark());
	}
	
	
	public String toString() {
		String str = null;
		Mark mark = null;
		mark =  this.square.getMark();
		String markx = null;
		switch(mark){
		case CIRCLE:
			markx = "○";
			break;
		case CROSS:
			markx = "×";
			break;
		default:
			break;
		
		}
		
		str = this.player.getOrder() + ":" + "(" + this.square.getX() + "," + this.square.getY() + ")　" + markx;
		
		return str;
	}
}
