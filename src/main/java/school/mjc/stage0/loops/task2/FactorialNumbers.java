package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 1;
        int temp = 1;
        System.out.println(1);
        while (counter <= printToInclusive){
            temp = temp * counter;
            System.out.println(temp);
            counter++;
        }
    }
}
