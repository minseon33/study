package javaLearn.threadLearn;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * https://velog.io/@pllap/Java%EC%97%90%EC%84%9C%EC%9D%98-%EB%B9%84%EB%8F%99%EA%B8%B0-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D
 */
@Slf4j
public class ThreadExample {

    private static void log(String content){
        System.out.println(Thread.currentThread().getName() + "> " + content);
    }

    public void threadExample1(){
        //작업 1 - 1.5초 소요
        System.out.println("작업1 시작");
        try{
            Thread.sleep(1500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("작업1 종료");

        //작업2 - 0.5초 소요
        System.out.println("작업2 시작");
        try{
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("작업2 종료");
    }

    public void threadExample2(){
        ExecutorService executorService = Executors.newCachedThreadPool();
        //작업 1 (스레드)
        executorService.submit(()->{
            log.trace("작업1 시작");
            log("작업1 시작");
            try {
                Thread.sleep(1500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            log.trace("작업 1 종료");
            log("작업1 종료");
        });

        executorService.submit(()->{
            log.trace("작업2시작");
            log("작업2시작");
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            log.trace("작업2종료");
            log("작업2 종료");
        });

        executorService.submit(()->{
            log.trace("작업3 시작");
            log("작업3 시작");
            try {
                Thread.sleep(2500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            log.trace("작업3 종료");
            log("작업3 종료");
        });


        //작업2
        log.trace("작업4 시작");
        log("작업4 시작");
        try{
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
            //커밋연습
        }
        log.trace("작업4 종료");
        log("작업4 종료");

        executorService.shutdown();

    }



    public static void main(String[] args){
       ThreadExample T = new ThreadExample();
//       T.threadExample1();
//        System.out.println("------------------------------------");
        T.threadExample2();
    }

}
