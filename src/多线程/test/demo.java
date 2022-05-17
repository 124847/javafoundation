package 多线程.test;

import javax.xml.stream.StreamFilter;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class demo {
    public static void main(String[] args) {

        String[] arg = {"火影,12","用着,18","牛逼,19","喜喜,15"};

        Stream<String> stream = Stream.of(arg).filter(s -> Integer.parseInt(s.split(",")[1]) > 15);
        Map<String, Integer> collect = stream.collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));
        System.out.println(collect);

    }
}
