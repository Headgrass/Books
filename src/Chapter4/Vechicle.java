package Chapter4;

import java.awt.font.NumericShaper;

public class Vechicle {
    int passenger; //Количество пассажиров
    int fuelcap;   //Емкость топливного бака
    int mpg;       //потребление топлива в милях на галлон


static class VechicleDemo {
    public static void main(String[] args) {
        Vechicle minivan = new Vechicle();
        Vechicle sportscar = new Vechicle();
        int Range, Range2;

        minivan.passenger = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passenger = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        Range = minivan.fuelcap * minivan.mpg;
        Range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.println("Минивэн может перевезти "+ minivan.passenger + " пассажиров, на расстояние " +
                Range + " миль.");
        System.out.println("Спорткар может перевезти "+ sportscar.passenger + " пассажиров, на расстояние " +
                Range2 + " миль.");
        }
    }
}
