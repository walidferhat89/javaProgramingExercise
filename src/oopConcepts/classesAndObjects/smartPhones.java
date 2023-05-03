package oopConcepts.classesAndObjects;

public class smartPhones {


        boolean onMode = false;
        boolean silentMode = false;
        boolean ring = true;
        boolean vibrant = true;
        int batteryLevel = 100;
        int luminosityLevel = 0;
        int volume = 0;



        void turnOnPhone(boolean turnOn, int newVolume, int newLuminosityLevel) {
            onMode = turnOn;
            volume = newVolume;
            luminosityLevel = newLuminosityLevel;


        }

        void makeACall(int newVolume, int newLuminosity) {
            if (onMode == true) {
                volume = newVolume;
                luminosityLevel = newLuminosity;
                if (volume>=50 && luminosityLevel>=50){
                    batteryLevel-=20;
                }

            }
        }

        void silentMode(){
                silentMode = true;
                ring = false;
                volume = 0;
                luminosityLevel = 0;
                vibrant = false;



        }

        void increaseVolume(int newVolume) {
            volume = newVolume;
        }

        int changeBatteryLevel() {
            if (onMode == false) {
                System.out.println("phone is turned off");
            } else {
                if (ring == true && vibrant == true) {
                    batteryLevel -= 20;
                }

            }
            return batteryLevel;
        }

        void printStates(){
            System.out.println("phoneOn: "+onMode+ "\nisRinging: "+ring
            + "\nvolume: "+volume+ "\nluminosity level: "+luminosityLevel+"%"+ "\nbattery level: "+batteryLevel+"%"
            +"\nsilentMode: "+silentMode+"\nvibrant: "+vibrant);
        }

    }
