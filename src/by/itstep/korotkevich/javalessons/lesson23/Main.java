package by.itstep.korotkevich.javalessons.lesson23;

public class Main {
    public static void main(String[] args) {


        Flower flower = new Flower(10, ColorType.BLUE);

        flower.setColor(ColorType.GREEN);

        System.out.println(flower);
        
    }
}
