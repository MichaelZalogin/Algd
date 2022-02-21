package L22;

public class L22 {
    public static void main(String[] args) {
        int i = 2;
        String s = new String[]{"a", "b", "c", "d"}[i];
        System.out.println(s);
    }
}

class Chelovek {
    final String pol;

    Chelovek(String pol) {
        this.pol = pol;
    }

    private String name;
    private int age;
    private int weight;
    private boolean clever;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public boolean isClever() {
        return clever;
    }

    public void setClever(boolean clever) {
        this.clever = clever;
    }
}

class TestChelovek {
    public static void main(String[] args) {

        Chelovek person1 = new Chelovek("male");
        person1.setName("Petr");
        person1.setWeight(70);
        person1.setAge(23);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getWeight());
    }
}
