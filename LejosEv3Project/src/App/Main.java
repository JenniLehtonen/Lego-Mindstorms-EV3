package App;
import Data.*;
import lejos.hardware.Button;
import lejos.utility.Delay;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Luodaan v‰risensori ja tehd‰‰n s‰ie
		//K‰ynnistet‰‰n s‰ie ja pidet‰‰n tauko, jotta v‰risensori varmasti k‰ynnistyy ensimm‰isen‰
		ColorSensor colorsensor1 = new ColorSensor();
		Thread colorsensorThread = new Thread(colorsensor1);
		colorsensorThread.start();
		Delay.msDelay(2000);
		
		//Tehd‰‰n ultra‰‰nisensori ja siit‰ s‰ie
		UltraSensor ultraSensor = new UltraSensor();
		Thread ultraThread = new Thread(ultraSensor);
		
		
		//Moottori-s‰ikeen luonti
		Motor motor1 = new Motor();
		Thread motorThread = new Thread(motor1);
		
		
		//Kosketusanturi-s‰ikeen luonti
		Touch touch1 = new Touch();
		Thread touchThread = new Thread(touch1);
		
		
		//Asetetaan s‰ikeille prioriteetit
		colorsensorThread.setPriority(8);
		ultraThread.setPriority(4);
		motorThread.setPriority(4);
		touchThread.setPriority(4);
		
		//K‰ynnistet‰‰n loput s‰ikeet
		touchThread.start();
		ultraThread.start();
		motorThread.start();
		
		Button.waitForAnyPress();

	}
}
