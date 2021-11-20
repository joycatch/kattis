import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://open.kattis.com/problems/lastfactorialdigit

public class LastFactorialDigit {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());

        for (int test = 0; test < testCases; test++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(n == 3 ? 6 : n < 5 ? n : 0);
        }
    }
}
