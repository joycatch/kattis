import javax.script.ScriptException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://open.kattis.com/problems/okviri

public class Okviri {

    public static void main(String[] args) throws ScriptException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] letters = br.readLine().toCharArray();
        String[] result = {"", "", "", "", ""};

        for (int i = 0; i < letters.length; i++) {
            char special = (i + 1) % 3 == 0 ? '*' : '#';
            result[0] += ".." + special + ".";
            result[1] += "." + special + "." + special;
            result[2] += special + "." + letters[i] + ".";
            result[3] += "." + special + "." + special;
            result[4] += ".." + special + ".";
        }
        StringBuilder sb = new StringBuilder(result[2]);
        for (int i = 12; i < result[2].length(); i += 12) {
            sb.setCharAt(i, '*');
        }
        result[2] = sb.toString();

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + (i != 2 ? '.' : letters.length % 3 == 0 ? '*' : '#'));
        }
    }
}
