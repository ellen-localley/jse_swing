package com.jse.swing;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Grade grade=null;
		
		
		while(true) {
			System.out.println("0.종료   1.학점계산기 ");
			switch(scanner.nextInt()) {
			case 0: 
				System.out.println("종료");
				return;
				
			case 1:
				grade=new Grade();
				System.out.println("이름을 입력하세요");
				grade.setName(scanner.next());
				System.out.println("국어 성적을 입력하세요");
				grade.setKor(scanner.nextInt());
				System.out.println("영어 성적을 입력하세요");
				grade.setEng(scanner.nextInt());
				System.out.println("수학 성적을 입력하세요");
				grade.setMath(scanner.nextInt());
				int sum=grade.sum();
				int avg=grade.avg();
				String credit=grade.grade();
				String gradeResult=grade.grade();
				System.out.println(String.format("[%s : 총점 %d점, 평균 %d점,학점 : %s]", 
						grade.getName(),grade.sum(),grade.avg(),grade.grade()));
				break;
			}
		}
	}
}
