package icehs.science.chapter03;

public class StringTest {

	public static void main(String[] args) {
		String name = "�������";
		String year = "2017";
		int number = 1000;
		
		int parseYear = Integer.parseInt(year);
		
		System.out.println("������� : " + number);
		System.out.println(year + "��");
		System.out.println(number + year);
		System.out.println(number + parseYear);
		
	}

}
