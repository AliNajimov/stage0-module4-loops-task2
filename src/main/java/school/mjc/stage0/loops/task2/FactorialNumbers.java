package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int temp=0;
        while(printToInclusive>0){
            if(temp==0){
                System.out.println(1);
            }else {
                temp*=temp;
                System.out.println(temp);
            }
            temp++;
            printToInclusive--;
        }
    }
}
