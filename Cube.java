package Cube;

//imports
import grovepi.GrovePi;
import grovepi.Pin;
import grovepi.PinMode;
import grovepi.sensors.*;

public class Cube {

	public static void main(String[] args) {
		
		GrovePi grovePi = new GrovePi();
	
		// LEDs
		Led one = grovePi.getDeviceFactory().createLed(Pin.DIGITAL_PIN_2);
		Led two = grovePi.getDeviceFactory().createLed(Pin.DIGITAL_PIN_3);
		Led three = grovePi.getDeviceFactory().createLed(Pin.DIGITAL_PIN_4);
		Led four = grovePi.getDeviceFactory().createLed(Pin.DIGITAL_PIN_5);
		Led five = grovePi.getDeviceFactory().createLed(Pin.DIGITAL_PIN_6);
		Led six = grovePi.getDeviceFactory().createLed(Pin.DIGITAL_PIN_7);
	
		// Ultrasonic Range Sensor
		UltrasonicRangerSensor rangeSensor = grovePi.getDeviceFactory().createUltraSonicSensor(Pin.DIGITAL_PIN_8);
	
		// ints
		int range = rangeSensor.getRange();
		int tOne = 0;
		int tTwo = 0;
		int tThree = 0;
		int tFour = 0;
		int tFive = 0;
		int tSix = 0;
	
		//set LED states
		one.setState(false);
		two.setState(false);
		three.setState(false);
		four.setState(false);
		five.setState(false);
	
		if (range < 5) {
			one.setState(true);
			two.setState(false);
			three.setState(false);
			four.setState(false);
			five.setState(false);
			tOne++;
			tTwo = 0;
			tThree = 0;
			tFour = 0;
			tFive = 0;
			tSix = 0;
			if (tOne == 10) {
				System.out.println("Security Level is 1");
			}
		} else if (range < 10) {
			one.setState(true);
			two.setState(true);
			three.setState(false);
			four.setState(false);
			five.setState(false);
			tOne = 0;
			tTwo++;
			tThree = 0;
			tFour = 0;
			tFive = 0;
			tSix = 0;
			if (tTwo == 10) {
				System.out.println("Security Level is 2");
			}
		} else if (range < 15) {
			one.setState(true);
			two.setState(true);
			three.setState(true);
			four.setState(false);
			five.setState(false);
			tOne = 0;
			tTwo = 0;
			tThree++;
			tFour = 0;
			tFive = 0;
			tSix = 0;
			if (tTwo == 10) {
				System.out.println("Security Level is 3");
			}
		} else if (range < 20) {
			one.setState(true);
			two.setState(true);
			three.setState(true);
			four.setState(true);
			five.setState(false);
			tOne = 0;
			tTwo = 0;
			tThree = 0;
			tFour++;
			tFive = 0;
			tSix = 0;
			if (tFour == 10) {
				System.out.println("Security Level is 4");
			}
		} else if (range < 25) {
			one.setState(true);
			two.setState(true);
			three.setState(true);
			four.setState(true);
			five.setState(true);
			tOne = 0;
			tTwo = 0;
			tThree = 0;
			tFour = 0;
			tFive++;
			tSix = 0;
			if (tFour == 10) {
				System.out.println("Security Level is 4");
			}
		} else if (range < 30) {
			one.setState(true);
			two.setState(true);
			three.setState(true);
			four.setState(true);
			five.setState(true);
			tOne = 0;
			tTwo = 0;
			tThree = 0;
			tFour = 0;
			tFive = 0;
			tSix ++;
			if (tSix == 10) {
				System.out.println("Security Level is 6");
			}
		}
	}
}
