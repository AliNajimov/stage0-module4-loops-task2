package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power>=0){
            int temp=0;
            while(power>=temp){
                System.out.println((int) Math.pow(2,temp));
                temp++;
            }
        } else {
            System.out.println("too much power");
        }
    }
}
