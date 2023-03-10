package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
          int a = 1;
        int b = 1;
        int sum_fib;
        System.out.println("1\n1");
        for(int i = 0; i < lastFibonacci; i++){
            sum_fib = a + b;
            a = b;
            b = sum_fib;
            System.out.println(sum_fib);
        }
    }
}
