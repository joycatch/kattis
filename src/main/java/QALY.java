import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://open.kattis.com/problems/qaly

public class QALY {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        double result = 0;
        for (int i = 0; i < count; i++) {
            String[] split = br.readLine().split(" ");
            result += Double.parseDouble(split[0]) * Double.parseDouble(split[1]);

        }
        System.out.println(result);
    }
}

