package JavaCourseOCA.L27;

public class HomeworkL27 {
    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        t1.eat("meat");
        try {
            t1.drink("water");
            try {
                t1.drink("pivo");
            } catch (NoWaterException e) {
                e.getMessage();
            } catch (Exception e) {
                e.getMessage();
            } finally {
                System.out.println("This is inner finally block");
            }
        } catch (RuntimeException f) {
            f.getMessage();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}

class NoMeatException extends RuntimeException {
    NoMeatException(String message) {
        super(message);
    }
}

class NoWaterException extends Exception {
    NoWaterException(String message) {
        super(message);
    }
}

class Tiger {

    public static void eat(String s1) {
        if (!(s1.equals("meat"))) {
            throw new NoMeatException("Tiger don't eat " + s1);
        } else {
            System.out.println("Tiger eat meat");
        }
    }

    public static void drink(String s1) throws NoWaterException {
        if (!(s1.equals("water"))) {
            throw new NoWaterException("Tiger don't drink" + s1);
        } else {
            System.out.println("Tiger drink water");
        }
    }
}