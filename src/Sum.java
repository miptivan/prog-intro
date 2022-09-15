import java.util.*;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        String strNumber = "";
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args[i].length(); j++) {
                char c = args[i].charAt(j);
                if ((c >= '0' && c <= '9') || c == '+' || c == '-') {
                    strNumber += c;
                } else {
                    if (strNumber != "") {  // если встретился пробел
                        System.err.println(strNumber);
                        sum += Integer.parseInt(strNumber);  // суммируем что насчитали до пробела
                        strNumber = "";
                    }
                }
            }
            if ( strNumber != "") {
                sum += Integer.parseInt(strNumber);
            }
            strNumber = "";
        }
        System.out.println(sum);
    }
}