package cn.gym.mgt.leecodeAssessment.Threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Foo {
    private Semaphore spa, spb;


    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        Foo foo = new Foo();
        Runnable runnable1 = () -> {
            try {
                foo.first(() -> {
                    System.out.println("first");
                });
                System.out.println("runnable1 " + Thread.currentThread().getName() + "-" + Thread.currentThread().getId());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable runnable2 = () -> {
            try {
                foo.third(() -> System.out.println("third"));
                System.out.println("runnable2 " + Thread.currentThread().getName() + "-" + Thread.currentThread().getId());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable runnable3 = () -> {
            try {
                foo.second(() -> {
                    System.out.println("second");
                });
                System.out.println("runnable3  " + Thread.currentThread().getName() + "-" + Thread.currentThread().getId());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
//        cachedThreadPool.execute(runnable1);
        runnable1.run();
        runnable3.run();
        runnable2.run();

        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            newCachedThreadPool.execute(() -> {
                try {
                    // 打印正在执行的缓存线程信息
                    System.out.println(Thread.currentThread().getName()
                            + " 正在被执行");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("Finally");
                }
            });
        }
        newCachedThreadPool.shutdown();
    }

    public Foo() {
        spa = new Semaphore(0);
        spb = new Semaphore(0);
    }


    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        spa.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        spa.acquire();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        spb.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        spb.acquire();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}