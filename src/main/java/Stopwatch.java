import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://open.kattis.com/problems/stopwatch

public class Stopwatch {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String result = "still running";
        if (n % 2 == 0) {
            int sum = 0;
            for (int i = 0; i < n; i += 2) {
                sum += Math.abs(Integer.parseInt(br.readLine()) - Integer.parseInt(br.readLine()));
            }
            result = "" + sum;
        }
        System.out.println(result);
    }
}
