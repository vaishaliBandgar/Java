package ExceptionHandling;

public class Stackoverflowerror {
	
	static int no=1;
	public static void printnumber()
	{
		if(no<=10000) {
			System.out.println("good morning");
			no++;
			printnumber();
			
		}
	}
	
		public static void main(String[] args) {
		printnumber();
	}

}
