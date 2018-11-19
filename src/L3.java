import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class L3 {


    public static void main(String[] args) {
        /*A a = new A();
        A.B b=a.new B();
        A.B b2=new A().new B();
        A.B b23=new A().new B();
        b2.so();
        A.C c=new A.C();
        c.so();*/

       /* IntStream s = "123".chars();

        String str = "Egorka";
        Stream s1 = str.chars().mapToObj(item -> (char) item).filter(x -> x == 'g');
        // System.out.println(s1.get);

        Stream<String> s2 = Stream.of("a1", "a12", "a123");
        s2.sorted((x1, x2) -> x1.length() - x2.length()).mapToInt(x -> x.length());

        //for(String i: s2.collect(Collectors.toList()))
        //   System.out.println(i);


        List<String> lstStr = new ArrayList<>();
        lstStr.add("a1");
        lstStr.add("a2");
        lstStr.add("a3");
        lstStr.add("a1");

        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(5);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(5);

        lst.sort((x1, x2) -> x1 - x2);
        for (Integer i : lst)
            System.out.println(i);

        lst = lst.stream().skip(1).distinct().map(x -> x + 1).peek(x -> System.out.println("Я ебал тебя " + x + " раз!")).limit(4).sorted((x1, x2) -> x2 - x1).collect(Collectors.toList());


        //s3.skip(4);
        // System.out.println(s3);
        for (Integer i : lst)
            System.out.println(i);

        System.out.println("---------------");
        System.out.println(
                lst.stream().findFirst().orElse(0)
        );

        Stream<Integer> s3 = lst.stream();
        System.out.println(
                s3.min(Integer::compareTo).orElse(0) + " " +
                        lst.stream().max(Integer::compareTo).orElse(0)
        );

        System.out.println(
                lst.stream().toArray()[1]
        );

        Integer[] mas = new Integer[]{1, 2, 3, 4, 5, 6};
        Stream<Integer> s4 = Arrays.stream(mas);

        Stream s5 = Stream.builder().add("a1").add("a2").add("a3").build();

        //Stream s6=lst.parallelStream()

        /*System.out.println(
                lstStr.stream().filter("a1"::equals).findFirst().orElse("123")+" "//+
               // lstStr.stream().filter((x) -> x.contains(«1»)).collect(Collectors.toList()).get(0)
        );*/

        /*for (String ss : lstStr.stream().filter((x) -> x.contains("1")).collect(Collectors.toList()))
            System.out.println(ss);
       /* System.out.println(
                lstStr.stream().filter((x) -> x.contains("1")).collect(Collectors.toList()).size()+" "+
                        lstStr.stream().filter((x) -> x.contains("1")).collect(Collectors.toList()).get(0)
        );*/
/*

        String[] sf = lstStr.stream().flatMap((p) -> Arrays.asList(p.split(",")).stream()).toArray(String[]::new);
        System.out.println(sf[2] + "-ягодка");*/
/*
       String sf;
        try(FileReader reader = new FileReader("file.txt"))
        {
            // читаем посимвольно


            while((sf=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
        Stream<String> streamFilr = Files.lines(Paths.get("file.txt"))*/
/*
        Stream<String> wordsStream = Stream.of("мама", "мыла", "раму");
        String sentence = wordsStream.reduce("Результат:", (x, y) -> x + " " + y);
        System.out.println(sentence);

        List<String> collection1 = Arrays.asList("a1", "a2", "a3", "a1");
        for (Integer i : collection1.stream().mapToInt((s9) -> Integer.parseInt(s9.substring(1))).toArray())
            System.out.println(i
            );
        System.out.println("--------------------");
        List<String> collection2 = Arrays.asList("1,2,0", "4,5");
        for (Integer i : collection2.stream().flatMap((p) -> Arrays.asList(p.split(",")).stream()).mapToInt(x -> Integer.parseInt(x)).toArray())
            System.out.println(i
            );

        System.out.println(
                collection2.stream().flatMap((p) -> Arrays.asList(p.split(",")).stream()).mapToInt(x -> Integer.parseInt(x)).sum()
        );*/
        int arr[][]={{1,2,3,4,5},{6,7,8,9,10}};
        //System.out.println(
        Stream.of(arr).flatMapToInt(x-> Arrays.stream(x)).forEach(x -> System.out.println(x));
        System.out.println(
        Stream.of("aa","bb","cc").flatMap(x->x.length()<2?Stream.of(x):Stream.of(x.substring(0,x.length()/2),x.substring(x.length()/2,x.length()))).mapToInt(x->x.length()).sum());
        System.out.println("xxxxx");

       // );

    }
}

