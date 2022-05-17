package 网络编程;


/*

Stream流的生成方式

生成流
通过数据源(集合,数组等)生成流
list.stream()

常见的生成方式
Collection体系的集合可以使用默认方法stream()生成流
default Stream <E> stream()
Map体系的集合间接的生成流
数组可以通过Stream接口的静态方法of(T...values)生成流

中间操作
一个流后面可以跟随零个或多个中间操作,其目的主要是打开流，做出某种成都的数据过滤/映射,然后返回一个新的流，交给下一个操作使用
Stream<T> filter (Predicate predicate): 对于流中的数据进行过滤
predicate接口中的方法 boolean test(T t) 对给定的参数进行判断,返回一个布尔值
Stream<T> limit(long maxSize): 返回此流中的元素组成的流,截取前指定参数个数的数据

Stream<T> skip(long n): 跳过指定参数个数的数据,返回由该流剩余元素组成的流

static<T> Stream<T> concat(Stream a, Stream b) 合并a和b两个流为一个流
Stream<T> distinct(): 返回由该流的不同元素(根据Object.equals(Object)) 组成的流

Stream<T> sorted(): 返回由此流的元素组成的流,根据自然顺序排序

Stream<T> sorted(Comparator comparator): 返回由该流的元素组成的流,根据提供的Comparator进行排序

<R> Stream<R> map (Function mapper): 返回由给定函数应用于此流的元素的结果组成的流
Function接口中的方法   R apply(T t)


InStream mapToInt(ToIntFunction mapper): 返回一个IntStream其中包含给定函数应用于此流的元素的结果
IntStream 表示原始的int流  特有方法sum 返回流的总和
ToIntFunction 接口中的方法  int applyAsInt(T value)

终结操作
一个流只能有一个终结操作，当这个操作执行后，流就被使用"光"了，无法再被操作了。所以这必定是流的最后一个操作
void forEach(Consumer action): 对此流的每个元素执行操作

Consumer接口中的方法      void accept(T t): 对给定的参数执行此操作

long count(): 返回六种的元素数


Stream流的收集操作
对于数据使用Stream流的方式操作完毕后，把流中的数据收集到集合中的办法如下：
Stream流的收集方法
R collect(Collector collector)
收集方法的参数是一个Collector接口

工具类Collector提供了具体的实现类方式
toMap()
toSet()
toList() ....

*/


import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//
public class Stream流 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");
        list.add("50");
        list.add("60");
        String[] x = {"柳岩,19", "张曼玉,18", "艺久,19"};
        Map<String, Integer> map = Stream.of(x).filter(s -> Integer.parseInt(s.split(",")[1]) > 18).collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));
        Set<String> strings = map.keySet();
        for (String string : strings) {
            System.out.println(map.get(string)+string);
        }

    }


}
