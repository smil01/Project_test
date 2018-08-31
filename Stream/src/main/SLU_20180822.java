package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SLU_20180822 {
    public static void main(String[] args){
        //Thread_Lamda(); //1_일반 람다 쓰레드

        //int_for_Stream(); // 2_int 쓰레드 반복문

       // skip_for_Stream(); //3 3_반복문에 예외처리(5까지 스킵지정)

        list_Stream();
    }

    public static void Thread_Lamda(){
        new Thread(()->{try {Thread.sleep(1000);} catch (Exception e) {}
            System.out.println("Hello Lamda 1");}).start();
        new Thread(()->{System.out.println("Hello Lamda 2");}).start();
    }

    public static void int_for_Stream() {
        IntStream.iterate(0, i -> i + 1)
                .limit(10)
                .forEach(System.out::println);
    }

    public static void skip_for_Stream(){
        IntStream.iterate(0, i->i+1).limit(10).skip(5).forEach(System.out::println);
    }

    public static void list_Stream(){
        List<Integer> list = new ArrayList<>();



        list.forEach(System.out::println);
    }

}
