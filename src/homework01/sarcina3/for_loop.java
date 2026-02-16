package homework01.sarcina3;

public class for_loop {
    public static void main(String[] args) {
        System.out.println("Perfect squares up to 10K: ");

        // writes all the perfect squares between 0 and 10000 using for loop
        for (int i = 0; i * i <= 10000; i++) {
            System.out.println(i * i);
        }
    }
}
