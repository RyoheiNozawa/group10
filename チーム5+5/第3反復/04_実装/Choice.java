package 第3反復三目並べ;

import java.util.Scanner;

public class Choice {
	private Scanner scanner = new Scanner(System.in);
	
	
	public int select() {
		int c=0;
		System.out.println("1:ｃｐ　2:対人");
		int x= Integer.parseInt(scanner.next());
		if(x==1) {
			System.out.println("1:Normal　2:Hard");
			int y= Integer.parseInt(scanner.next());
			if(x==1&&y==1) {
				c=0;
				
			}else if(x==1&&y==2) {
				c=1;
			}
		}
		else if(x==2){
			c=2;
		}
//		else if(x==2){
//			c=3;
//		}
		else {
			c=4;
		}
		return c;
	}
}