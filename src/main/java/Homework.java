import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://open.kattis.com/problems/heimavinna

public class Homework {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int count = 0;
        for (String problems : line.split(";")) {
            count++;
            if (problems.contains("-")) {
                String[] split = problems.split("-");
                count += Integer.parseInt(split[1]) - Integer.parseInt(split[0]);
            }
        }
        System.out.println(count);
    }
}
