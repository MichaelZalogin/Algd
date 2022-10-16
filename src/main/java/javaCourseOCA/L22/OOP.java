package javaCourseOCA.L22;

public class OOP {
    final String POL;
    private String name;
    private int vozrast;
    private int ves;

    OOP(String pol) {
        this.POL = pol;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVozrast(int vozrast) {
        if (vozrast <= 0 ) {
            System.out.println("Возраст не может быть отрицательным");
        }  else {this.vozrast = vozrast;
        System.out.println(vozrast);}
    }
}

class Test12 {
    public static void main(String[] args) {
        OOP h1 = new OOP("male");
        h1.setName("Pavel");
        System.out.println(h1.getName());
        h1.setVozrast(15);
    }
}