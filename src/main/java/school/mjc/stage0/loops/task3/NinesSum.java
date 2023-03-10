package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
             int sum = 0;
        String s = String.valueOf(lengthOfLastNumber);
        for (int i = 0; i < lengthOfLastNumber-1; i++) {
            s = s + lengthOfLastNumber;
            int q = Integer.parseInt(s);
            sum = sum + q;
        }
        System.out.println(sum+lengthOfLastNumber);

    }
}
