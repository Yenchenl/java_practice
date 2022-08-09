package practice;

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principle = 5000;
		double rate = 0.01;
		//%s表其文字向右移動距離, %25s表示另一文最尾端文字移動距離
		System.out.printf("%s%25s\n", "Year" , "Amount on deposit");
		for(int year = 0;  year<=100; year++)
		{
			//%4d表其文最尾端文字距離, %,25.2f表示每三數一逗號, 其文最尾端字距離最左邊為25個距離
			System.out.printf("%4d%,25.2f\n", year, principle * Math.pow(1.0+rate, year));
		}

	}

}
