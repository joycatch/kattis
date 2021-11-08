import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://open.kattis.com/problems/triarea

public class TriangleArea {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        double result = (double) Integer.parseInt(split[0]) * Integer.parseInt(split[1]) / 2;
        System.out.println(result);
    }
}
