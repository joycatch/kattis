import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://open.kattis.com/problems/aaah

public class Aaah {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(br.readLine().length() >= br.readLine().length() ? "go" : "no");
    }
}
