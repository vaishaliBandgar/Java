package Datatype;

public class Numericandnondecimal {
	
	public static void main(String[]args) {
		
		//primitive data type
		
		//byte data type -- 1 Byte -128 to 127
		
		//Syntax == Datatype variableName = value;
		
		// variable declaration rules
		//1. Must not begin with digit.
        //2. should not be keyword.
        //3.white space is not allowed.
		
		byte b = 50;
		byte b1 = 127;
		
	//byte b2 =128; //Not allowed - Max value
		System.out.println("Byte Data type -->" + b);
		System.out.println("Byte Data type max limit -->" + b1);
		
		byte b2 = -46;
		byte b3 = -128;
		
		//byte b4=-129; not allowed
		
		System.out.println("Byte Data type -->" + b2);
		System.out.println("Byte Data type min limit -->" + b3);
		
		System.out.println();
		System.out.println("************************************");
		
	   //short data type --2 byte - 16 bit (-32768 to 32767)	
		
		// Syntax -  Datatype variableName = value;
		
		short S1 =150;
        short S2 =2000;
        short S3 =32767; //MAX limit
        //short S4 =32768; //Not allowed
        
        System.out.println("Short data type -->" + S1);
        System.out.println("Short data type -->" + S2 );
        System.out.println("Short data type max limit--" + S3);
        
        short S4 = -2000;
        short S5 = -32768; //min value
        
        //short S6 = 32770; NOT ALLOWED
        
        System.out.println("Short data type -->" + S4);
        System.out.println("Short data type min limit -->" + S5);
        System.out.println();
        System.out.println("************************************");
        
        //3. int data type -4 byte ---> 32 bit --2147483648 to 2147483647
        // syntax- datatype variableName = value;
        
        int i1 = 120;
        int i2 =32768;
        int i3 =2147483647; //max limit
        
        // int i4 =2147483648 // not allowed
        
        System.out.println("int data type -->" + i1);
        System.out.println("int data type -->" + i2);
        System.out.println("int data type Max limi -->" + i3); 
        
        int i4 = -28545544;
        int i5 = -2147483648; // min limit
        
        // i6 = -2147483649; // not allowed
        
        System.out.println("int data type --->" + i4);
        System.out.println("int data type min limit --->" + i5);
        System.out.println();
        System.out.println("********************************");
        
		
		
      //4. long data type -8 byte ---> 64 bit --2147483648 to 2147483647
        // syntax- datatype variableName = value;
		long L1 = 214748364655l;
		long L2 =9223372036854775807l;  //max limit
		
		//long l3 = 9223372036854775808l; //not Allowed
		
		System.out.println("Long data type--->" +L1);
		System.out.println("Long data type max value--->"+L2);
		
		long L4 = -23456789;
		long L3 = -9223372036854775808l;
		
		System.out.println("Long data type--->" +L4);
		System.out.println("Long data type min value--->"+L3);
		
		
		
		
		
		
		
	}

}
