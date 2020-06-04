package java_game;

abstract class Player {
	
	private String order; //プレイヤーの順番
	protected Mark mark; //プレイヤーのマーク
	
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
	
	//座標入力メソッド
	protected abstract Square InputCoodinate(Board board);
	
	
}
