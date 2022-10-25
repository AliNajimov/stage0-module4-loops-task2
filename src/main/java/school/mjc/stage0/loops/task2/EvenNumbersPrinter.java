package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int temp=0;
        while(temp<=printTillInclusive){
            if(temp%2==0){
                System.out.println(temp);
            }
        }
    }
}
