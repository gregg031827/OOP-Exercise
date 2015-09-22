/**
 * Created by Gregg on 22/09/2015.
 */
public interface CRV {
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);

}
