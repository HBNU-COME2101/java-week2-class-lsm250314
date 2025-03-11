package chapter1;

import java.util.Scanner;

public class chapter1_4 {
	public static void main(String[] args) {
		System.out.println("인원수 >>");
		Scanner sc1= new Scanner(System.in);
		int a=sc1.nextInt();
		System.out.println("숙박일 >>");
		Scanner sc2= new Scanner(System.in);
		int b=sc2.nextInt();
		System.out.println("1인당 항공료 >>");
		Scanner sc3= new Scanner(System.in);
		int c=sc3.nextInt();
		System.out.println("1인당 숙박비 >>");
		Scanner sc4= new Scanner(System.in);
		int d=sc4.nextInt();
		System.out.println(a+"명의 "+b+"박 "+(b+1)+"일 여행에는 "+((a/2)+1)+"개 필요하며 경비는 "+(((a/2)+1)*b*d+(a*c))+ "원입니다.");
	}
}
