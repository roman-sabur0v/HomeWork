package Animals;

public class Rabbit extends Herbivore implements Run, Voice {
    @Override
    public void run() {
        System.out.println("Кролик бежит");
    }

    @Override
    public String voice() {
        return "Истошные крики крольчатины";
    }
}
