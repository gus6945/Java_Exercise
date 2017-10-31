package icehs.science.chapter03;

public class StatisticsCastingTest {

	public static void main(String[] args) {
		double probability = 0.0000001235;
		long population = 6973738433L;
		int intprobability = (int) probability;
		int intpopulation = (int) population;
		System.out.println( "로또에 당첨될 확률 :" + probability);
		System.out.println( "로또에 당첨될 확률int 변환 :" + intprobability);
		System.out.println( "전 세계의 인구 수 :" + population);
		System.out.println( "전 세계의 인구 수 int변환 :" + intpopulation);


	}

}
