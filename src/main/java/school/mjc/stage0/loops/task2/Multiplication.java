package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive>0){
            int temp=0;
            while(temp<=multiplyByAndToInclusive){
                System.out.println(temp*multiplyByAndToInclusive);
                temp++;
            }
        } else {
            int temp=0;
            int res = -1*multiplyByAndToInclusive;
            while(temp<res){
                System.out.println(temp*multiplyByAndToInclusive);
                temp++;
            }
        }
    }
}
