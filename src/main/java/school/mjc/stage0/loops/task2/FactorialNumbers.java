package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int temp=1;
        int count=0;
        while(printToInclusive>count){
            if(count==0){
                System.out.println(1);
            }else {
                temp=temp*count;
                System.out.println(temp);
            }
            count++;
        }
    }
}
