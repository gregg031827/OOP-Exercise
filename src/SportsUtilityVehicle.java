/**
 * Created by Gregg on 22/09/2015.
 */
public class SportsUtilityVehicle extends Car implements CarInterface{
    public SportsUtilityVehicle(String setColor, String setMake){
        setColor(setColor);
        setMake(setMake);

    }
    public SportsUtilityVehicle(){

    }

    public int cadence = 0;
    public int speed = 0;
    public int gear = 1;

    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }

    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }
}
