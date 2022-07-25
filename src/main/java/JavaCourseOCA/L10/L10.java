package JavaCourseOCA.L10;

import java.lang.*;

import JavaCourseOCA.L8.HomeworkL8;

import static JavaCourseOCA.L9.Car.*;

import JavaCourseOCA.L6.*;
import JavaCourseOCA.L9.Car;

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