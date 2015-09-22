/**
 * Created by Gregg on 22/09/2015.
 */
public interface CarInterface {
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);

}
