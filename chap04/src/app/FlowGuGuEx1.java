package app;

import java.util.Scanner;

public class FlowGuGuEx1 {

	public static void main(String[] args) {
		System.out.println("2~9까지 숫자를 입력하세요.종료 하려면 0을 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();
		
		do{
			if(dan>=2 && dan<=9)
				for(int i=1 ; i<=9 ; i++){
					System.out.printf("%d * %d = %d%n",dan,i,i*dan);
				}
			System.out.println("2~9까지 숫자를 입력하세요.종료 하려면 0을 입력하세요");
			dan = scan.nextInt();
		}while(dan!=0);
		System.out.println("0을 입력하셨으므로 종료하겠습니다.");
	}

}
