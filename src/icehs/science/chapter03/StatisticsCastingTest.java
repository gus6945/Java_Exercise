package icehs.science.chapter03;

public class StatisticsCastingTest {

	public static void main(String[] args) {
		double probability = 0.0000001235;
		long population = 6973738433L;
		int intprobability = (int) probability;
		int intpopulation = (int) population;
		System.out.println( "�ζǿ� ��÷�� Ȯ�� :" + probability);
		System.out.println( "�ζǿ� ��÷�� Ȯ��int ��ȯ :" + intprobability);
		System.out.println( "�� ������ �α� �� :" + population);
		System.out.println( "�� ������ �α� �� int��ȯ :" + intpopulation);


	}

}
