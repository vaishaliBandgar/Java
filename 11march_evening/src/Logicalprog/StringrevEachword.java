package Logicalprog;

public class StringrevEachword {
	
	public static void main(String[] args) {
		
		String str ="welcome";
		
		String[] Word =str.split(" ");  //splitted string into word
		
		String Revs ="";
		
		for(String W :Word) {    //outerloop
			
			String StringWord ="";
			
			for(int i=W.length()-1;i>=0;i--) {  //innerloop
				
				StringWord = StringWord+W.charAt(i);
			}
			Revs = Revs+StringWord+" ";
			
		}
		System.out.println(Revs);
				
			}
					
			
			
		
		
	}


