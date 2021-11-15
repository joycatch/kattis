import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://open.kattis.com/problems/judgingmoose

public class JudgingMoose {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int l = Integer.parseInt(line[0]);
        int r = Integer.parseInt(line[1]);
        int max = Math.max(l, r);
        String result = "Not a moose";
        if (max > 0) {
            result = (l == r ? "Even " : "Odd ") + max*2;
        }
        System.out.println(result);
    }
}
