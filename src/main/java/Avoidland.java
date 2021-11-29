import javax.script.ScriptException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

// https://open.kattis.com/problems/avoidland

public class Avoidland {

    public static void main(String[] args) throws ScriptException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] rows = new int[n];
        int[] columns = new int[n];

        HashMap<Integer, ArrayList<Integer>> rowMap = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> columnMap = new HashMap<>();

        for (int i = 0; i <= 2; i++) {
            rowMap.put(i, new ArrayList<>());
            columnMap.put(i, new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            int r = Integer.parseInt(line[0]) - 1;
            int c = Integer.parseInt(line[1]) - 1;
            rows[r]++;
            columns[c]++;
        }
        for (int i = 0; i < n; i++) {
            if (rows[i] > 2) {
                for (int j = 0; j < rows[i] - 1; j++) {
                    rowMap.get(2).add(i);
                }
            } else {
                rowMap.get(rows[i]).add(i);
            }
            if (columns[i] > 2) {
                for (int j = 0; j < columns[i] - 1; j++) {
                    columnMap.get(2).add(i);
                }
            } else {
                columnMap.get(columns[i]).add(i);
            }
        }
        int moves = 0;
        for (int i = 0; i < Math.max(rowMap.get(0).size(), columnMap.get(0).size()); i++) {
            if (i < rowMap.get(0).size()) {
                moves += Math.abs(rowMap.get(0).get(i) - rowMap.get(2).get(i));
            }
            if (i < columnMap.get(0).size()) {
                moves += Math.abs(columnMap.get(0).get(i) - columnMap.get(2).get(i));
            }
        }
        System.out.println(moves);
    }
}
