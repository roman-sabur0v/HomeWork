import Animals.*;
import Food.*;

public class Zoo {

    public static void main(String[] args) throws Exception {
        Cow cow = new Cow();
        Duck duck = new Duck();
        Eagle eagle = new Eagle();
        Fish fish = new Fish();
        Rabbit rabbit = new Rabbit();
        Wolf wolf = new Wolf();

        Apple apple = new Apple();
        Berry berry = new Berry();
        Flesh flesh = new Flesh();
        Frog frog = new Frog();
        Vegetables vegetables = new Vegetables();
        Worm worm = new Worm();

        Worker worker = new Worker();

        worker.feed(cow, apple);
        //worker.feed(duck, flesh); *исключение с текстом ошибки*
        worker.feed(duck, berry);
        worker.feed(eagle, frog);
        worker.feed(fish, worm);
        worker.feed(rabbit, vegetables);
        //worker.feed(wolf, vegetables); *исключение с текстом ошибки*
        worker.feed(wolf, flesh);

        worker.getVoice(cow);
        worker.getVoice(duck);
        //worker.getVoice(fish); *компилятор не пропускает эту строку кода*
        worker.getVoice(eagle);
        worker.getVoice(rabbit);
        worker.getVoice(wolf);

        Swim[] waterfowl = new Swim[5];
        waterfowl[0]=duck;
        waterfowl[1]=wolf; //да волки тоже могут плавать, пусть поплавает если хочет
        waterfowl[2]=fish;
        waterfowl[3]=new Duck();
        waterfowl[4]=new Fish();

        for (Swim animal : waterfowl) {
            animal.swim();
        }
    }
}
