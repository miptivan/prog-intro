import java.util.*;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            int lastSpace = 0;
            int end = args[i].length();
            int j = 0;
            int point = 0;
            while (j < end) {
                if (Character.isWhitespace(args[i].charAt(j))) {
                    if (lastSpace < j) {
                        sum += Integer.parseInt(args[i].substring(lastSpace, j));
                    }
                    lastSpace = j + 1;
                }
                j++;
                point = j;
            }

            if (lastSpace < j) {
                sum += Integer.parseInt(args[i].substring(lastSpace, j));
            }
        }
        System.out.println(sum);
    }
}

