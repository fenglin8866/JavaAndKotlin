package threaddemo;

import org.jetbrains.annotations.Nullable;

public class ThreadLocalDemo {

    ThreadLocal<String> mLocal = new ThreadLocal<String>() {
        @Nullable
        @Override
        protected String initialValue() {
            return "xxx";
        }
    };

    ThreadLocal<String> mLocal2 = ThreadLocal.withInitial(
            () -> {
                return "xxxx";
            }
    );



    public static void main(String[] args) {
        ThreadLocal<Integer> local=new ThreadLocal<>();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    local.set(1);
                    System.out.println(local.get());
                }finally {
                    local.remove();
                }

            }
        },"thread1").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    local.set(2);
                    System.out.println(local.get());
                }finally {
                    local.remove();
                }
            }
        },"thread2").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(local.get());
            }
        },"thread3").start();
    }

}
