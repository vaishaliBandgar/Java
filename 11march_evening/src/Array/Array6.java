package Array;

//import java.util.Arrays;

public class Array6 {
	
	
public static void main(String[] args) {
		
	Object obj[] = new Object[5];   //non similar/  hetro
		
		obj[0] = 10;    //int
		obj[1] = "Welcome";
     	obj[2] = 'A';
		obj[3] = 12.4f;
		obj[4] = true;
		
		System.out.println(obj.length);
		
		for(int i=0;i<5;i++) {
			
			System.out.println(obj[i]);
			
			}
		
		
	}

}




