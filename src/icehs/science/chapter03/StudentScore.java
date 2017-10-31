package icehs.science.chapter03;

public class StudentScore {

	public static void main(String[] args) {
		double Math = 94.7;
		double Eng = 83.2;
		double Kor = 87.1;
	
		int intMath = (int) Math;
		int intEng = (int) Eng;
		int intKor = (int) Kor;
		
		System.out.println("수학 :" + intMath);
		System.out.println("영어" + intEng);
		System.out.println("국어" + intKor);
	}

}
