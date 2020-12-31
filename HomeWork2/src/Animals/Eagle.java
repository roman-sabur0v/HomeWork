package Animals;

public class Eagle extends Predator implements Fly, Voice, Run {

    @Override
    public void fly() {
        System.out.println("Орел летит");
    }

    @Override
    public void run() {
        System.out.println("Орел перебирает своими лапищами");
    }

    @Override
    public String voice() {
        return "*невозможно буквами описать его крик, но я попробую...* ъиьеъи";
    }
}
