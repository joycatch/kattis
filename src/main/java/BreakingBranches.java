import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://open.kattis.com/problems/breakingbranches

public class BreakingBranches {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        if (length % 2 == 0) {
            System.out.println("Alice");
            System.out.println(length - 1);
        } else {
            System.out.println("Bob");
        }
    }
}
