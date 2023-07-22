package asssignmentproblem;

public class SumOfFiteenNOwhile {
	public static void main(String[] args) {
		
		int sum=0;
		int i=1;
		
        while (i <= 15) {
            sum = sum+i;
            i++;
        }
        System.out.println("Sum of first 15 numbers using while loop:-- " +sum);
	}

}
