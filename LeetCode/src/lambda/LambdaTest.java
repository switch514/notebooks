package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaTest {
    public static void main(String[] args) {
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players =  Arrays.asList(atp);
        players =  null;

//// 以前的循环方式
//        for (String player : players) {
//            System.out.print(player + "; ");
//        }
//
//// 使用 lambda 表达式以及函数操作(functional operation)
//        players.forEach((name) -> System.out.println(name));
//
//// 在 Java 8 中使用双冒号操作符(double colon operator)
//        players.forEach(System.out::println);

        Predicate<String> startWithR = s -> s.startsWith("R");

        List<String> aList = Optional.ofNullable(players).orElse(new ArrayList<>());
        //aList.ifPresent((s)-> System.out.println("List ok " + s.size()));

    }
}
