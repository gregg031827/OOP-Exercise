/**
 * Created by Gregg on 22/09/2015.
 */
public class Main {
    public static void main(String[] args) {
        SUV crv = new SUV();
        crv.setColor("Black");
        crv.setMake("Honda");
        crv.changeCadence(20);
        crv.changeGear(3);
        crv.speedUp(50);
        crv.applyBrakes(20);
        crv.printStates();


        System.out.println("Car Color: " + crv.getColor());
        System.out.println("Car Make: " + crv.getMake());


//        Car crv = new Car();
//        crv.setColor("Blue");
//        crv.setMake("Honda");
//
//        System.out.println(sedan.getColor());
//        System.out.println(sedan.getMake());

    }
}
