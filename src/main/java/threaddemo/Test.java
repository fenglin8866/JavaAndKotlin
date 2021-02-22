package threaddemo;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Test {

    private static LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<String>();
//    private String url;
    private AtomicInteger a=new AtomicInteger(0);

    public static void main(String[] args) {
        /*new DownloadThread(queue).start();
        queue.add("你好");
        try {
            Thread.sleep(8000);
            queue.add("世界");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        ExecutorService executorService= Executors.newFixedThreadPool(1);
        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return null;
            }
        });
        try {
            future.get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }




    }

    private static class DownloadThread extends Thread {
        private volatile boolean mQuit = false;
        private final BlockingQueue<String> mQueue;

        public DownloadThread(BlockingQueue<String> queue) {
            mQueue = queue;
        }

        @Override
        public void run() {
            while (true) {
                String url = null;
                try {
                    url = mQueue.take();
                } catch (InterruptedException e) {
                    System.out.println("xxh218 capture interrupt while blocking in queue");
                    if (mQuit) {
                        return;
                    }
                    continue;
                }
                System.out.println("xxh218 url=" + url);
            }
        }

        public void quit() {
            mQuit = true;
            interrupt();
        }

    }
}
