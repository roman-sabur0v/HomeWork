package Animals;
import Food.*;

public abstract class Animal {

    private int saturationDegree;
    public int getSaturationDegree() { return saturationDegree; }
    public void setSaturationDegree(int value) { saturationDegree=value; }

    public abstract void eat(Food food) throws Exception;
}
