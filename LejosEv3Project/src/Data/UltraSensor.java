package Data;


import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3UltrasonicSensor;

import java.io.File;

/**
 * T‰ss‰ tiedostossa luodaan ultra‰‰nisensori, joka mittaa et‰isyyksi‰ esteisiin. Ultra‰‰nisensori toimii s‰ikeen‰.
 * Saadut arvot syˆtet‰‰n Data-luokan staattiseen range-muuttujaan. 
 * Range-muuttujan arvoa luetaan Motor-luokassa ja jos arvo on 25 tai pienempi, robotti suorittaa esteen kiert‰misen.
 * Ultra‰‰nisensoriin kuuluu UltraSonicSensor.java-tiedosto, joka sis‰lt‰‰ ultra‰‰nip‰‰lle metodeita. T‰m‰ tiedosto on haettu
 * internetist‰.
 */

public class UltraSensor implements Runnable{
	
	
	//Ultra‰‰nisensorin portti
	UltraSonicSensor uss = new UltraSonicSensor(SensorPort.S2);

		@Override
		public void run() {

			while(Data.shouldRun)
			{
			    try
				{
			    	Thread.sleep(1);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}

			    //Haetaan ultra‰‰nisensorin mittaama et‰isyys ja talletetaan se Data-luokassa olevaan range-muuttujaan.
				Data.range = uss.getRange();

			}

			//Kun ohjelma loppuu, suljetaan ultra‰‰nisensori.
			uss.close();

		}
}
