package Formatação.Test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale locale2 = Locale.getDefault();
        Locale locale3 = Locale.CHINA;
        Locale locale4 = Locale.CANADA;
        Locale locale5 = Locale.US;
        NumberFormat[] numberFormats = new NumberFormat[4];

        numberFormats[0] = NumberFormat.getInstance(locale2);
        numberFormats[1] = NumberFormat.getInstance(locale3);
        numberFormats[2] = NumberFormat.getInstance(locale4);
        numberFormats[3] = NumberFormat.getInstance(locale5);

        double valor = 100_000.2130;

        for (NumberFormat nfa : numberFormats) {
            if (nfa != null) {
                System.out.println(nfa.format(valor));
            } else {
                System.out.println("Error");
            }
        }
    }
}
