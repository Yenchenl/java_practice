package practice;

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principle = 5000;
		double rate = 0.01;
		//%s����r�V�k���ʶZ��, %25s��ܥt�@��̧��ݤ�r���ʶZ��
		System.out.printf("%s%25s\n", "Year" , "Amount on deposit");
		for(int year = 0;  year<=100; year++)
		{
			//%4d����̧��ݤ�r�Z��, %,25.2f��ܨC�T�Ƥ@�r��, ���̧��ݦr�Z���̥��䬰25�ӶZ��
			System.out.printf("%4d%,25.2f\n", year, principle * Math.pow(1.0+rate, year));
		}

	}

}
