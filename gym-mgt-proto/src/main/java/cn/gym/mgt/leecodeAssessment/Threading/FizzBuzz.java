package cn.gym.mgt.leecodeAssessment.Threading;

import java.util.function.IntConsumer;

class FizzBuzz {
    private final int n;
    private int flag = 1;

    public FizzBuzz(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        synchronized (this) {
            while (flag <= n) {
                if (!(flag % 5 != 0 && flag % 3 == 0)) wait();
                if (!(flag % 5 != 0 && flag % 3 == 0)) continue;
                if (flag > n) break;
                printFizz.run();
                flag++;
                notifyAll();
            }
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        synchronized (this) {
            while (flag <= n) {
                if (!(flag % 5 == 0 && flag % 3 != 0)) wait();
                if (!(flag % 5 == 0 && flag % 3 != 0)) continue;
                if (flag > n) break;
                printBuzz.run();
                flag++;
                notifyAll();
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        synchronized (this) {
            while (flag <= n) {
                if (!(flag % 3 == 0 && flag % 5 == 0)) wait();
                if (!(flag % 3 == 0 && flag % 5 == 0)) continue;
                if (flag > n) break;
                printFizzBuzz.run();
                flag++;
                notifyAll();
            }
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        synchronized (this) {
            while (flag <= n) {
                if (flag % 5 == 0 || flag % 3 == 0) wait();
                if (flag % 5 == 0 || flag % 3 == 0) continue;
                if (flag > n) break;
                printNumber.accept(flag);
                flag++;
                notifyAll();
            }
        }
    }

    public static void main(String[] args) {
        int n = 15;
        FizzBuzz fizzBuzz = new FizzBuzz(n);

        Thread threadA = new Thread(() -> {
            try {
                fizzBuzz.fizz(() -> {
                    System.out.println("fizz");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread threadB = new Thread(() -> {
            try {
                fizzBuzz.buzz(() -> {
                    System.out.println("buzz");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread threadC = new Thread(() -> {
            try {
                fizzBuzz.fizzbuzz(() -> {
                    System.out.println("fizzbuzz");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread threadD = new Thread(() -> {
            try {
                fizzBuzz.number(System.out::println);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
    }
}