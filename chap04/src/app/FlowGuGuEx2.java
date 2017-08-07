package app;

import java.util.Scanner;

public class FlowGuGuEx2 {

	public static void main(String[] args) {
	
		System.out.println("2~9까지 숫자를 입력하세요.종료 하려면 0을 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();
		
		while(dan!=0){
			if(dan>=2 && dan<=9){
				for(int i=1; i<=9; i++){
					System.out.printf("%d * %d = %d%n",dan,i,dan*i);
				}System.out.println("다시 2~9까지 숫자를 입력하세요.종료 하려면 0을 입력하세요.");
					dan = scan.nextInt();
			}else{
				System.out.println("잘 못된 수 입니다. 2~9까지 숫자를 입력하세요.종료 하려면 0을 입력하세요.");
				dan = scan.nextInt();
			}
			
		}System.out.println("0을 입력하셨으므로 종료하겠습니다.");
	}

}
