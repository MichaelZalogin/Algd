package javaCourseOCA.L10;

import java.lang.*;

import javaCourseOCA.L8.HomeworkL8;

import javaCourseOCA.L6.*;
import javaCourseOCA.L9.Car;

public class L10 {

    public static void main(String[] args) {
        HomeworkL8 h1 = new HomeworkL8();
        Car c1 = new Car("Blue", "V8");
        Car c2 = new Car("Blue", "V8");
        ConstructorOverloading k1 = new ConstructorOverloading();
        L10 m1 = new L10();
        System.out.println(Car.count);
    }
}