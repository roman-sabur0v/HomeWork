package model;

import java.util.Scanner;

public class Kotik {

    private static int count;
    public static int getCount() { return count; }

    private int prettiness;
    public int getPrettiness() { return prettiness; }

    private int weight;
    public int getWeight() { return weight; }

    private int satiety;
    public int getSatiety() { return satiety; }
    private String name;

    public String getName() { return name; }

    private String meow;
    public String getMeow() { return meow; }
    // Конструктор без параметров, он идентичен конструктору по умолчанию,
    // который сюда бы подставила Java,
    // Но она его не подставит, по той причине,
    // что ниже определяется другой (перегруженный) конструктор, с параметрами.
    public Kotik() {
    }
    /*
    Указатель this можно использовать
    для вызова перегруженного конструктора
     */
    public Kotik(int weight, String name) {
        this(5, weight, name, "Мяу!");
    }

    public Kotik(int prettiness, int weight, String name, String meow) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
        count++;
    }

    public void setKotik(int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
        count++;
    }

    public boolean play() {
        satiety-=3;
        System.out.println("Кажется "+name+" заскучал");
        return true;
    }

    public boolean sleep(int time) {
        satiety-=time;
        System.out.println("пора вздремнуть");
        return true;
    }

    public boolean huntTheMouse() {
        satiety-=5;
        System.out.println("вижу мышь - не вижу препятствий");
        return true;
    }

    public boolean sharpenClaws() {
        satiety--;
        System.out.println("кажется "+name+" точит когти об новый диван...");
        return true;
    }

    public boolean breakTheVase() {
        satiety--;
        System.out.println("Ваза разибта, упс...");
        return true;
    }

    public void eat(int food){
        satiety+=food;
    }

    public void eat(int food, String foodName){
        eat(food);
        System.out.println("Кот поел "+foodName);
    }

    public void eat(){
        eat(5, "китикэт");
    }

    public void liveAnotherDay() {
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<24; i++){
            int rnd=(int)(Math.random()*5+1);
            if (satiety<=0) {
                System.out.println("Кот голоден и отказывается что-либо делать, покормите его");
                System.out.print("Напишите сколько корма нужно положить в миску (max объем миски 10ед.): ");
                int food=scanner.nextInt();
                if (food>10) {
                    food=10;
                }
                eat(food);
            }
            switch (rnd){
                case (1):
                    play();
                    break;
                case (2):
                    huntTheMouse();
                    break;
                case (3): {
                    System.out.print("напишите сколько коту нужно поспать: ");
                    int hours = scanner.nextInt();
                    sleep(hours);
                    break;
                }
                case (4):
                    sharpenClaws();
                    break;
                case (5):
                    breakTheVase();
                    break;
            }
        }
        scanner.close();
    }
}
