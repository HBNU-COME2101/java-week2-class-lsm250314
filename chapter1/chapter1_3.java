package chapter1;

import java.util.Scanner;
public class chapter1_3 {
	public static void main(String[] args) {
		System.out.println("생일 입력 하세요 >> ");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(num/10000+"년 "+(num%10000)/100+"월 "+num%100+"일");
	}
}
