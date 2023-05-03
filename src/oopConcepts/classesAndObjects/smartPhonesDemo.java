package oopConcepts.classesAndObjects;

public class smartPhonesDemo {


    public static void main(String[] args) {


        smartPhones phone = new smartPhones();

        phone.turnOnPhone(true,100,100);
        phone.silentMode();
        phone.printStates();
        System.out.println("*******************************************");

        phone.makeACall(89,85);
        phone.printStates();
    }
}
