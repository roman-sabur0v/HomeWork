package Animals;

import Food.*;

public abstract class Predator extends Animal {
    @Override
    public void eat(Food food) throws Exception {
        if (food instanceof Grass)
            throw new Exception("Хищники предпочитают есть мясную пищу");
        setSaturationDegree(food.getSaturation());
    }
}
