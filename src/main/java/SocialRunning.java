import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://open.kattis.com/problems/socialrunning

public class SocialRunning {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] values = new int[n*2];
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(br.readLine());
            values[i] = temp;
            values[n + i] = temp;
        }
        int min = Integer.MAX_VALUE;
        for (int i = n; i < n*2; i++) {
            int temp = values[i] + values[i - 2];
            if (temp < min) {
                min = temp;
            }
        }
        System.out.println(min);
    }
}
