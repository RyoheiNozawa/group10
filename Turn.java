package java_game;

public class Turn {
	
	private Player player;//プレイヤー
	private Square square;//スクエア
	
	//コンストラクタ
	public Turn(Player player) {
		this.player = player;
	}
	
	//スクエアのセッター
	public void setSquare(Square square) {
		this.square = square;
	}
	
	//ターン実行
	public void conduct(Board board) {
		Square cell;
		cell = this.player.InputCoodinate(board);
		this.setSquare(square);
		cell.setMark(this.player.getMark());
	}
	
	@Override
	public String toString() {
		String str = null;
		
		Mark mark =  this.square.getMark();
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
