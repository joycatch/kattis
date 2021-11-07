import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://open.kattis.com/problems/cold

public class Coldputer {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        long count = Arrays.stream(br.readLine().split(" ")).filter(s -> Integer.parseInt(s) < 0).count();
        System.out.println(count);
    }
}
