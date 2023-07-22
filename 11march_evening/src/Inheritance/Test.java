package Inheritance;

public class Test {
	
	public static void main(String[] args) {
		
		//prent and child
		 parent p1 = new parent();
		 p1.Car();
		 p1.Money();
		 
		 child C1 =new child();
		 C1.bike();
		 C1.Car();
		 C1.Money();
		 System.out.println();
		 
    // father and son		
		 
		 
		 Son S1= new Son();
		 S1.bike();
		 S1.Laptop();
		 S1.Home();
		 S1.Car();
		 S1.Money();
		 System.out.println();
		 
		 
		 Father F1 =new Son();
		 F1.Car();
		 F1.Home();
		 F1.Money();
		 System.out.println();
		 
		 
		 //whatsapp v1, v2,v3, v4,
		 
		 WhatsAppV1 V1= new WhatsAppV1();
		 V1.Textmsg();
		 
		 System.out.println();
		 WhatsAppV2 V2 =new  WhatsAppV2 ();
		       V2.AudioCalling();
		       V2.Textmsg();
		       
		       
		       System.out.println();
		       
		       
		       WhatsAppV3 V3 = new  WhatsAppV3();
		       V3.VideoCalling();
		       V3.AudioCalling();
		       V3.Textmsg();
		       System.out.println();
		       
		       
		       WhatsAppV4 V4 = new WhatsAppV4();
		       V4.Payment();
		       V4.AudioCalling();
		       V4.Textmsg();
		       V4.VideoCalling();
		       
		       
		         
		 
		 
		 
		 
		 
		 
	}

}
