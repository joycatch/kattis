import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// https://open.kattis.com/problems/recount

public class Recount {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        Map<String, Integer> map = new HashMap<>();
        int max = 1;
        String winner = "";
        while (!name.equals("***")) {
            if (map.containsKey(name)) {
                int count = map.get(name) + 1;
                map.put(name, count);
                if (count > max) {
                    max = count;
                    winner = name;
                }
            } else {
                map.put(name, 1);
            }
            name = br.readLine();
        }
        for (String key : map.keySet()) {
            if (map.get(key) == max && !key.equals(winner)) {
                System.out.println("Runoff!");
                System.exit(0);
            }
        }
        System.out.println(winner);
    }
}
