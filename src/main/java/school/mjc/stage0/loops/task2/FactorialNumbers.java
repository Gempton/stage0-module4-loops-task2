package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int result = 1;
        int counter = 1;
        if (printToInclusive == 0) {
            System.out.println(result);
        } else {
            System.out.println(result);
            while (counter <= printToInclusive) {
                result = result * counter;
                System.out.println(result);
                counter++;
            }
        }

    }
}
