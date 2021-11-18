import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

// https://open.kattis.com/problems/buttonbashing

public class ButtonBashing {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());

        String result = "";
        for (int i = 0; i < testCases; i++) {
            int t = Integer.parseInt(br.readLine().split(" ")[1]);
            List<Integer> buttons = Arrays.stream(br.readLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList());
            result += selectButtons(t, buttons) + "\n";
        }

        System.out.print(result);
    }

    private static String selectButtons(int t, List<Integer> buttons) {
        HashMap<Integer, Integer> reachable = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();
        reachable.put(0, 0);
        q.add(0);

        while (!q.isEmpty()) {
            int currentT = q.remove();
            int currentClicks = reachable.get(currentT);

            for (Integer button : buttons) {
                int newT = currentT + button;
                newT = Math.min(Math.max(newT, 0), 3600);
                if (!reachable.containsKey(newT) || reachable.get(newT) > currentClicks + 1) {
                    reachable.put(newT, currentClicks + 1);
                    q.add(newT);
                }
            }
        }
        int result = t;
        for (int i = t; i <= 3600; i++) {
            if (reachable.containsKey(i)) {
                result = i;
                break;
            }
        }
        return "" + reachable.get(result) + " " + (result - t);
    }
}
