import java.util.*;

public class SumDouble {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 0; i < args.length; i++) {
            int lastSpace = 0;
            int end = args[i].length();
            int j = 0;
            while (j < end) {
                if (Character.isWhitespace(args[i].charAt(j))) {
                    if (lastSpace < j) {
                        sum += Double.parseDouble(args[i].substring(lastSpace, j));
                    }
                    lastSpace = j + 1;
                }
                j++;
            }

            if (lastSpace < j) {
                sum += Double.parseDouble(args[i].substring(lastSpace, j));
            }
        }
        System.out.println(sum);
    }
}
