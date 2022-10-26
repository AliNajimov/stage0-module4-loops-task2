package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        for (int i=2;i<=printToInclusive; i++){
            int count=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                   count++;
                }
            }
            if(count==0){
                System.out.println(i);
            }
        }
    }
}
