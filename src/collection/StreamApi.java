package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Stud {
    String name;
    int age;
    public Stud(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class StreamApi {
    public static void main(String[] args){
        List<Stud> list = Arrays.asList(new Stud("Appu", 25),new Stud("Appu", 15),new Stud("Appu", 28));
        list.stream()
                .filter((e)->e.age>18).
                forEach((e)-> System.out.println(e.age));

        List<Integer> numbers = Arrays.asList(1,2,3,3,3,5,5,6,6,7,7);
        List<Integer> output = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());

    }
}
/*
 Java 8 features
 functional interface
 lambda expression
 stream Api

 Note::- Stream APIs are built on the collection okay., there is default stream() method inside collection interface, that method is passed to all collection okay.
 Before using stream api, convert collection into stream and then use intermediate and terminal methods like filter, map, and reduce

 Google--> terminal and intermediate methods okay

 */