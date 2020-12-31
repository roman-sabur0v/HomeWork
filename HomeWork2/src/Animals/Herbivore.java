package Animals;

import Food.*;

public abstract class Herbivore extends Animal {
    @Override
    public void eat(Food food) throws Exception {
        if (food instanceof Meat)
            throw new Exception("Травоядное не может есть мясную пищу");
        setSaturationDegree(food.getSaturation());
    }
}
