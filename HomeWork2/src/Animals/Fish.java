package Animals;

public class Fish extends Predator implements Swim {
    @Override
    public void swim() {
        System.out.println("Рыба плывет");
    }
}
