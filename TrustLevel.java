package ControlPanel;

// imports
import grovepi.GrovePi;
import grovepi.Pin;
import grovepi.PinMode;
import grovepi.sensors.*;

public class TrustLevel {

	public static void main(String[] args) {
		GrovePi grovePi = new GrovePi();
	
		// LED's
		Led one = grovePi.getDeviceFactory().createLed(Pin.DIGITAL_PIN_2);
		Led two = grovePi.getDeviceFactory().createLed(Pin.DIGITAL_PIN_3);
		Led three = grovePi.getDeviceFactory().createLed(Pin.DIGITAL_PIN_4);
		Led four = grovePi.getDeviceFactory().createLed(Pin.DIGITAL_PIN_5);
		Led five = grovePi.getDeviceFactory().createLed(Pin.DIGITAL_PIN_6);
	
		//Buttons
		Button b1 = grovePi.getDeviceFactory().createButtonSensor(Pin.DIGITAL_PIN_7);
		Button b2 = grovePi.getDeviceFactory().createButtonSensor(Pin.DIGITAL_PIN_8);
	
	
		while (true) {
			one.setState(false);
			two.setState(false);
			three.setState(false);
			four.setState(false);
			five.setState(false);
		
			// activate the trust levels
			if (b1.isPressed) {
				one.setState(true);
				two.setState(true);
				three.setState(true);
				four.setState(true);
				five.setState(true);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
				break;
			}
		}
	
		while (true) {
		
			// change trust level to two
			if (b1.isPressed) {
				one.setState(true);
				two.setState(true);
				three.setState(false);
				four.setState(false);
				five.setState(false);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		
			// change trust level to four
			if (b2.isPressed) {
				one.setState(true);
				two.setState(true);
				three.setState(true);
				four.setState(true);
				five.setState(false);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		}
	}
}
