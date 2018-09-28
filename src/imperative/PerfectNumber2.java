package imperative;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PerfectNumber2 {

    public enum STATE{
        DEFICIENT, PERFECT, ABUNDANT
    }

    public static Set<Integer> divisors(int n){
        return IntStream
                .rangeClosed(1,(int)Math.sqrt(n))
                .filter((i) -> n % i == 0)
                .boxed()
                .flatMap(x -> Stream.of(x, n/x))
                .collect(Collectors.toCollection(HashSet::new));
    }

    public static STATE process(int n) {
        if(n == 1) return STATE.DEFICIENT;
        Set<Integer> Div = divisors(n);
        int total = 0;
        Iterator<Integer> Each = Div.iterator();
        while (Each.hasNext()) {
            total+= Each.next();
        }
        total-=n;
        if (total < n ) return STATE.DEFICIENT;
        if (total == n ) return STATE.PERFECT;
        return STATE.ABUNDANT;
    }
}