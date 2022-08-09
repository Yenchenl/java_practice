package practice;

public class BreakStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int count = 1; count<=10; count++)
		{
			if(count == 5) break;
			System.out.printf("%d\n", count);
		}
		System.out.print("\nUesd break to skip printing after 5.\n");

	}

}
