package ControlPanel;

// imports
import grovepi.GrovePi;
import grovepi.Pin;
import grovepi.PinMode;
import grovepi.sensors.*;

public class HouseNumbers {

	public static void main(String[] args) {
	
		GrovePi grovePi = new GrovePi();
		
		// LEDs
		Led one = grovePi.getDeviceFactory().createLed(Pin.DIGITAL_PIN_2);
		Led two = grovePi.getDeviceFactory().createLed(Pin.DIGITAL_PIN_3);
		Led three = grovePi.getDeviceFactory().createLed(Pin.DIGITAL_PIN_4);
		Led four = grovePi.getDeviceFactory().createLed(Pin.DIGITAL_PIN_5);
		Led five = grovePi.getDeviceFactory().createLed(Pin.DIGITAL_PIN_6);
		Led six = grovePi.getDeviceFactory().createLed(Pin.DIGITAL_PIN_7);
		
		// setting LED states
		one.setState(true);
		two.setState(true);
		three.setState(true);
		four.setState(true);
		five.setState(true);
		six.setState(true);
	}
}
