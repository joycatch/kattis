import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://open.kattis.com/problems/filip

public class Filip {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int first = Integer.parseInt(new StringBuilder(split[0]).reverse().toString());
        int second = Integer.parseInt(new StringBuilder(split[1]).reverse().toString());
        System.out.println(Math.max(first, second));
    }
}
