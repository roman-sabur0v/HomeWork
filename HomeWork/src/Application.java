import model.Kotik;

public class Application {

    public static void main(String[] args) {
        Kotik boris = new Kotik();
        boris.setKotik(5, "Борис", 3, "Урмяу");

        Kotik filin = new Kotik(6, 5, "Филин","Мяу");
        System.out.println(filin.getName() + " " + filin.getWeight());
        filin.liveAnotherDay();
        System.out.println();
        if (filin.getMeow().equals(boris.getMeow())) {
            System.out.println("Мурчания котиков одинаковые - " + filin.getMeow());
        } else {
            System.out.println("Котики мурчат по разному " + filin.getName()+": " + filin.getMeow() +
                    ", a " + boris.getName() + ": " + boris.getMeow());
        }
        System.out.println();
        System.out.println("Количество котиков: " + Kotik.getCount());
    }
}
