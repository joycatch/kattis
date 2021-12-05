import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

// https://open.kattis.com/problems/datum

public class Datum {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int D = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);
        LocalDate myDate = LocalDate.parse("2009-" + String.format("%02d", M) + "-" + String.format("%02d", D));
        System.out.println(myDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
    }
}
