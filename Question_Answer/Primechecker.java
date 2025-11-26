public class Primechecker {
    
    public static void main(String[] args) {


        for (int num = 2; num <= 50; num++) {
            int count = 0;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(num);
            }
        }
    }
}
