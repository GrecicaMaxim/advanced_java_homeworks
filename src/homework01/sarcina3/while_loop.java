package homework01.sarcina3;

public class while_loop {
    public static void main(String[] args) {
        System.out.println("Perfect squares up to 10K: ");

        // writes all the perfect squares between 0 and 10000 using while loop
        // P.S. As a challenge, I decided not to use multiplication this time :)
        int i = 0, k = 1;
        while (i <= 10000) {
            System.out.println(i);
            i += k;
            k += 2;
        }
    }
}
