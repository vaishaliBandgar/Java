package Inheritance;

public class WhatsAppV2 extends WhatsAppV1 {
	
	public void AudioCalling() {
		
		System.out.println("Audio Calling");
	}
	public static void main(String[] args) {
		
		WhatsAppV1 V1= new WhatsAppV1();
		V1.Textmsg();
	}

}
