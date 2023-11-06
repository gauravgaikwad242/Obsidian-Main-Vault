package com.reactive.udemy.intro.sec08Combining;

import java.time.LocalDateTime;
import java.util.stream.Stream;

import com.reactive.udemy.Util.Utility;

import reactor.core.publisher.Flux;

public class Lec1StartWith {
    public static void main(String[] args) {
        
/*
 * for typecasting in flux pipeline
 * .cast(String.class)
 * we can uses cast operator
 * 
 * 
 */
        /*
         * fist all the elements fromm the publisher in startsWith are drained or published
         * then the core source is drained
         */
        Flux.generate((sink)->{
            sink.next(getName1());
        })
        .startWith(getNamesFlux(3))
        .take(5)
        .subscribe(Utility.subscriber());



    }

    public static Flux<String> getNamesFlux(int index){
        return Flux.generate((syncSink)->{
            syncSink.next((int)(Math.random() * 10) + " "+getName());
        })
        .take(index)
        .cast(String.class);
    }

    public static String getName(){
        String a = Stream.of("a","b","c","d","e").findAny().get();
        String b = Stream.of("d","e","f","g","h").findAny().get();
        String c = Stream.of("i","j","k","l","m").findAny().get();
        String d = Stream.of("n","i","p","q","r").findAny().get();
        return a+b+c+d;
    }
    public static String getName1(){
        String a = Stream.of("a","b","c","d","e").findAny().get();
        String b = Stream.of("d","e","f","g","h").findAny().get();
        String c = Stream.of("i","j","k","l","m").findAny().get();
        String d = Stream.of("n","i","p","q","r").findAny().get();
        return b+a+c+d;
    }
}
