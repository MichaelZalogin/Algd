package javaCourseBlackBelt.nested_classes.local_inner_classes;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }
}

class Math {
    public void getResult() {
        class Delenie {
            private int delimoe;
            private int delitel;

            public int getDelimoe() {
                return this.delimoe;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }

            public int getDelitel() {
                return this.delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }

            public int getChasnoe() {
                return delimoe / delitel;
            }

            public int getOstatok() {
                return delimoe % delitel;
            }
        }

        Delenie delenie = new Delenie();
        delenie.setDelimoe(21);
        delenie.setDelitel(4);
        System.out.println("Delimoe = " + delenie.getDelimoe());
        System.out.println("Delitel = " + delenie.getDelitel());
        System.out.println("Chastnoe = " + delenie.getChasnoe());
        System.out.println("Ostatok = " + delenie.getOstatok());
    }
}