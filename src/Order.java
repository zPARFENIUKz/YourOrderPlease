import java.util.Arrays;
import java.util.Comparator;

public class Order {
    public static void main(String[] args){
        final String res = order("is2 Thi1s T4est 3a");
        System.out.println(res);

    }

    public static String order(final String words) throws NullPointerException{
        if (words == null) throw new NullPointerException("words variable cannot be null");
        // not mine solution below, check prev commits
        // I found this solution pretty good
        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(s -> Integer.parseInt(s.replaceAll("\\D", ""))))
                .reduce((a, b) -> a + " " + b).get();
    }
}
