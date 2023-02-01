package com.HM.G_Test06;

import com.HM.G_Test05.MyRunnable;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server06 {
    /*
     * 因为频繁创建新的线程非常浪费资源，所以用线程池
     */
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1000);

        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,
                16,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
        while (true) {
            Socket socket = serverSocket.accept();
            // MyRunnable myRunnable = new MyRunnable(socket);

            //new Thread(new MyRunnable(socket)).start();
            pool.submit(new MyRunnable(socket));

        }


    }
}
