package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 2;
        while (counter <= printToInclusive) {
            int i = 1;
            int c = 0;
            while (i <= counter / 2) {
                if (counter % i == 0) {
                    c++;
                }
                i++;
            }
            if (c <= 1) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}
