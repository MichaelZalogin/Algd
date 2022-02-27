package L24;

public class L24 {
}

abstract class Figure {
    int number_of_sides;

    abstract void area();

    abstract void perimeter();

    void show_info() {
        System.out.println("This is figure");
    }
}

class Square extends Figure {
    int sides = 10;

    public void perimeter() {
        System.out.println("Периметр квадрата равен: " + 4 * sides);
    }

    public void area() {
        System.out.println("Площадь квадрата равна: " + sides * sides);
    }
}

class Rectangle extends Figure {
}

class Triangle extends Figure {
}