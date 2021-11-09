import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JazzItUp {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int m = 2; m < n; m++) {
            int step = 3;
            int nm = n*m;
            boolean valid = true;
            for (int i = 4; i < nm; i += step) {
                if (nm % i == 0) {
                    valid = false;
                    break;
                }
                step += 2;
            }
            if (valid) {
                System.out.println(m);
                break;
            }
        }
    }
}
