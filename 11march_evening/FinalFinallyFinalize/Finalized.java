package FinalFinallyFinalize;

public class Finalized {
public static void main(String[] args) {
	
	//finalize is the method in java which is used to perform cleanup 
	//processing just before object is garbage collected
	
	Finalized F1 =new Finalized();
	F1 = null;
	System.gc();
	
}
public void Demo() {
	System.out.println("demo method");
}
	public void finalize() {
		System.out.println("Finalized method");
	}
}
