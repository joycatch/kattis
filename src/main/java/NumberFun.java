import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://open.kattis.com/problems/numberfun

public class NumberFun {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < Integer.parseInt(br.readLine()); i++) {
            String[] split = br.readLine().split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            int c = Integer.parseInt(split[2]);
            boolean possible = (Math.abs(a - b) == c)
                    || (a + b == c)
                    || (a * b == c)
                    || ((double) a / b == c || (double) b / a == c);
            System.out.println((possible ? "P" : "Imp") + "ossible");
        }
    }
}
