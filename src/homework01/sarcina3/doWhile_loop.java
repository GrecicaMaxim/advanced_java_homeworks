package homework01.sarcina3;

public class doWhile_loop {
    public static void main(String[] args) {
        System.out.println("Perfect squares up to 10K: ");

        // writes all the perfect squares between 0 and 10000 using do while loop
        // no multiplication :)
        int i = 0, k = 1;
        do {
            System.out.println(i);
            i += k;
            k += 2;
        } while (i <= 10000);
    }
}
