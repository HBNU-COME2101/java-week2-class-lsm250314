package chapter1;

import java.util.Scanner;

public class chapter1_5 {
	public static void main(String[] args) {
		System.out.println("나이를 입력하세요>>");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		if (num<=0)
			System.out.println("나이는 양수로만 입력하세요.");
		int red=num/10;
		int blue=(num%10)/5;
		int yellow=num%5;
		int sum= red+yellow+blue;
		System.out.println("빨간 초 "+red+"개, 파란 초 "+blue+"개, 노란 초"+yellow+"개. 총 "+sum+"개가 필요합니다.");
	}
}
