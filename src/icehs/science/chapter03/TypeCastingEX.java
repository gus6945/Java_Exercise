package icehs.science.chapter03;

public class TypeCastingEX {

	public static void main(String[] args) {
		
		long billWealth = 700000000L;
		System.out.println( "Original Value :" + billWealth);
		
		double doublebillWealth = billWealth;
		System.out.println( " double������ ��ȯ :" + doublebillWealth);
		
		int intbillWealth = (int) billWealth;
		System.out.println( "int������ ���� ��ȯ :" + intbillWealth);

	}

}
