package 第3反復三目並べ;

public class Square {
	
	private Mark mark = Mark.NONE;//マーク
	private boolean status = false;//マスの状態
	private int x;//x座標
	private int y;//y座標
	
	//コンストラクタ
	public Square(int x,int y) {
		this.x = x;
		this.y = y;
	}

	//マスの状態を取得
	public boolean checkStatus() {
		return this.status;
	}
	
	//マスにマークをセット
	public void setMark(Mark mark) {
		this.mark = mark;
		this.status = true;
	}
	
	//マスのx座標取得
	public int getX() {
		return this.x;
	}
	//マスのy座標取得
	public int getY() {
		return this.y;
	}
	
	//マスに入ってるマークを取得
	public Mark getMark() {
		return mark;
	}
	
}
