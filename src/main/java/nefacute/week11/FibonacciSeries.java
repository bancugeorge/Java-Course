import java.math.BigInteger;
import java.util.stream.Stream;

public class FibonacciSeries {

    public static BigInteger getFibonacci(int series) {
        return Stream.iterate(new BigInteger[]{
                BigInteger.ZERO, BigInteger.ONE}, t -> new BigInteger[]{t[1], t[0].add(t[1])})
                .limit(series)
                .map(n -> n[1])
                .reduce((a, b) -> b).orElse(BigInteger.ZERO);

    }

    public static void main(String[] args) {
        System.out.println(FibonacciSeries.getFibonacci(1_000_000));
    }

}