package Collectionqueue;

import java.util.PriorityQueue;

public class Priorityqueue {
	
	public static void main(String[] args) {
		
		//insertion is not preserved in PQ
		//duplicate are not allowed
		//Homo type of data
		 PriorityQueue PQ = new PriorityQueue();
		 PriorityQueue PQ1 = new PriorityQueue();
		 
		 //insert/Add element
		 //Add method
		 PQ.add('A');
		 PQ.add('C');
		 PQ.add('H');
		 PQ.add('I');
		 
	//	 System.out.println(PQ.offer(PQ1));
		// PQ.offer("HH"); //offer method
		 System.out.println(PQ);  //class cast exception
	
		 //offer method
		// PQ.offer("null");
	//	 System.out.println(PQ.offer('r'));
		// System.out.println(PQ);
		 
		 //3.Element
		 
		 System.out.println(PQ.element());
	//	 System.out.println(PQ1.element()); //NOsuchelementException
		 
		 //4.peek
		 System.out.println(PQ.peek());
		 System.out.println(PQ1.peek());
		 
		 //Remove and Poll
		 System.out.println(PQ.remove());
	//	 System.out.println(PQ1.remove());
		 System.out.println(PQ);
		 
		 System.out.println(PQ.poll());
		 System.out.println(PQ); 
		 System.out.println(PQ.poll());
		 
		 for(Object obj:PQ) {
			 System.out.println(obj);
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
