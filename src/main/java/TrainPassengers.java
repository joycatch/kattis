import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://open.kattis.com/problems/trainpassengers

public class TrainPassengers {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int C = Integer.parseInt(split[0]);
        int n = Integer.parseInt(split[1]);
        int passengers = 0;
        boolean possible = true;
        int lastWaiting = 0;

        for (int i = 0; i < n && possible; i++) {
            String[] line = br.readLine().split(" ");
            int left = Integer.parseInt(line[0]);
            int enter = Integer.parseInt(line[1]);
            int waiting = Integer.parseInt(line[2]);

            passengers -= left;
            if (passengers < 0) {
                possible = false;
            }
            passengers += enter;
            lastWaiting = waiting;

            if (passengers > C) {
                possible = false;
            }
            if (passengers < C && waiting > 0) {
                possible = false;
            }
        }
        if (lastWaiting > 0 || passengers > 0) {
            possible = false;
        }
        System.out.println(possible ? "possible" : "impossible");
    }
}
