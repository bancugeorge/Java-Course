
import java.util.stream.Collectors;

public class StreamsHomework {
    public static void main(String[] args) {

        System.out.println("#1 All transactions in 2011: " + StreamsOperationsExercises.findAllTransactionsInYear(2011));
        System.out.println("#2 Unique trader cities: " + StreamsOperationsExercises.findAllUniqueCities());
        System.out.println("#3 All traders from Cambridge, sorted: " + StreamsOperationsExercises.findAllTradersFromCity("Cambridge").stream()
                            .map(t -> t.getName()).collect(Collectors.toList()));

        System.out.println("#4 String of all traders’ names, sorted: " + StreamsOperationsExercises.traderNamesOrdered());
        System.out.println("#5 Traders based in Milan?: " + StreamsOperationsExercises.tradersInCity("Milan"));
        System.out.print("#6 All transactions’ values from the traders living in Cambridge: ");
        StreamsOperationsExercises.valuesForTradersInCity("Cambridge");
        System.out.println();

        System.out.println("#7 Highest value of all the transactions : " + StreamsOperationsExercises.highestTransactionValue());
        System.out.println("#8 Transaction with the smallest value : " + StreamsOperationsExercises.getSmallestValueTransaction());

    }

}
