package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        for (int i=0;i<=printToInclusive; i++){
            int count=0;
            for(int j=0;j<=i;j++){
                count++;
            }
            if(count==2){
                System.out.println(i);
            }
        }
    }
}
