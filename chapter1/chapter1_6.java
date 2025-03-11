package chapter1;

import java.util.Scanner;

public class chapter1_6 {
	public static void main(String[] args) {
		System.out.println("x1의 좌표 입력 >>");
		Scanner sc1= new Scanner(System.in);
		int x1=sc1.nextInt();
		System.out.println("y1의 좌표 입력 >>");
		Scanner sc2= new Scanner(System.in);
		int y1=sc2.nextInt();
		System.out.println("x2의 좌표 입력 >>");
		Scanner sc3= new Scanner(System.in);
		int x2=sc3.nextInt();
		System.out.println("y2의 좌표 입력 >>");
		Scanner sc4= new Scanner(System.in);
		int y2=sc4.nextInt();
		if (x1>=10&&x2>=10&&y1>=10&&y2>=10&&x1<=200&&x2<=200&&y1<=300&&y2<=300) {
			System.out.println("포함된다");
		} else {
			System.out.println("포함되지 않는다");
		}
			
	}
}
