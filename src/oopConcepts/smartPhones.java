package oopConcepts;

import java.util.function.Consumer;

public class smartPhones {

    boolean on = false;
    boolean ring = true;
    boolean vibrant = true;
    int batteryLevel = 100;
    int luminosityLevel = 0;
    int volume = 0;
    


    void turnOnPhone(boolean turnOn) {
        on = turnOn;

    }

    void makeACall(int newVolume, int newLuminosity) {
        if (on == true) {
            volume = newVolume;
            luminosityLevel = newLuminosity;
            if (volume>=50 && luminosityLevel>=50){
                batteryLevel-=50;
            }

        }
    }

    void increaseVolume(int newVolume) {
        volume = newVolume;
    }

    int changeBatteryLevel() {
        if (on == false) {
            System.out.println("phone is turned off");
        } else {
            if (ring == true && vibrant == true) {
                batteryLevel -= 20;
            }

        }
        return batteryLevel;
    }
    
    void printStates(){
        System.out.println("phoneOn: "+on+ "isRinging: "+ring+ "volume: "+volume+ "battery level: "+batteryLevel);
    }
}    