package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 2;
        boolean prime = false;
        int i = 0;
        while (counter <= printToInclusive){
            prime = true;
            i = 2;
            while (i < counter){
                if (counter % i == 0){
                    prime = false;
                    break;
                }
                i++;
            }
            if (prime){
                System.out.println(counter);
            }
            counter++;
        }
    }
}
