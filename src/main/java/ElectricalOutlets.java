import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://open.kattis.com/problems/electricaloutlets

public class ElectricalOutlets {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());

        for (int test = 0; test < testCases; test++) {
            String[] split = br.readLine().split(" ");
            int result = 0;
            for (int i = 1; i < split.length; i++) {
                result += Integer.parseInt(split[i]) - 1;
            }
            System.out.println(result + 1);
        }
    }
}
