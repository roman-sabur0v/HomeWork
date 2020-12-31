import Animals.*;
import Food.*;

public class Worker {

    public void feed(Animal animal, Food food) throws Exception {
        animal.eat(food);
        System.out.println("покормили животное");
    }

    public void getVoice(Voice animalCanVoice) {
        System.out.println(animalCanVoice.voice());
    }
}
