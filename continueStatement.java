package practice;

public class continueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				for(int count = 1; count<=10; count++)
				{
					if(count == 5) continue;
					//不會列印5出來
					System.out.printf("%d\n", count);
				}
				System.out.print("\nUesd break to skip printing after 5.\n");
 
	}

}
