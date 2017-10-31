package icehs.science.chapter03;

public class StringTest {

	public static void main(String[] args) {
		String name = "¼¼Á¾´ë¿Õ";
		String year = "2017";
		int number = 1000;
		
		int parseYear = Integer.parseInt(year);
		
		System.out.println("¼¼Á¾´ë¿Õ : " + number);
		System.out.println(year + "³â");
		System.out.println(number + year);
		System.out.println(number + parseYear);
		
	}

}
