package L19;

public class L19P4 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("privet");
        StringBuilder sb2 = new StringBuilder("poka");
        StringBuilder sb3 = new StringBuilder("ok");
        StringBuilder [] array = {sb1,sb2,sb3};
        for (StringBuilder sb: array){
            sb = new StringBuilder("hello");
        }
        for (int i = 0; i< array.length; i++){
            System.out.println(array[i] + " ");
        }
    }
}