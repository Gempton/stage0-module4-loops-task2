package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int counter = 0;
        int powerOfTwo = 1;
        if (power < 0) {
            System.out.println("too much power");
        } else {
            while (counter <= power) {
                powerOfTwo *= 2;
                if (counter == 0) {
                    powerOfTwo = 1;
                }
                System.out.println(powerOfTwo);
                counter++;
            }
        }
    }
}

