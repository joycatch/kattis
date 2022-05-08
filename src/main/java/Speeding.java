import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

// https://open.kattis.com/problems/speeding

public class Speeding {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int photos = Integer.parseInt(br.readLine());
        br.readLine();
        int previous_t = 0;
        int previous_d = 0;

        int max = 0;
        for (int i = 0; i < photos - 1; i++) {
            String[] line = br.readLine().split(" ");
            int t = Integer.parseInt(line[0]);
            int d = Integer.parseInt(line[1]);
            int speed = (d - previous_d) / (t - previous_t);

            if (speed > max) {
                max = speed;
            }
            previous_d = d;
            previous_t = t;
        }

        System.out.print(max);
    }

}
