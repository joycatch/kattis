import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://open.kattis.com/problems/tetris

public class Tetris {
    static int[] field;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] split = line.split(" ");
        int columns = Integer.parseInt(split[0]);
        int shape = Integer.parseInt(split[1]);
        field = new int[columns];

        split = br.readLine().split(" ");
        int i = 0;
        for (String s : split) {
            field[i++] = Integer.parseInt(s);
        }

        int answer = 0;

        for (int c = 0; c < field.length; c++) {
            switch (shape) {
                case 1:
                    answer++;
                    if (hasValue(field[c], c + 1) && hasValue(field[c], c + 2) && hasValue(field[c], c + 3)) {
                        answer++;
                    }
                    break;
                case 2:
                    if (hasValue(field[c], c + 1)) {
                        answer++;
                    }
                    break;
                case 3:
                    if (hasValue(field[c], c + 1) && hasValue(field[c] + 1, c + 2)) {
                        answer++;
                    }
                    if (hasValue(field[c] - 1, c + 1)) {
                        answer++;
                    }
                    break;
                case 4:
                    if (hasValue(field[c] - 1, c + 1) && hasValue(field[c] - 1, c + 2)) {
                        answer++;
                    }
                    if (hasValue(field[c] + 1, c + 1)) {
                        answer++;
                    }
                    break;
                case 5:
                    if (hasValue(field[c], c + 1) && hasValue(field[c], c + 2)) {
                        answer++;
                    }
                    if (hasValue(field[c] - 1, c + 1) && hasValue(field[c], c + 2)) {
                        answer++;
                    }
                    if (hasValue(field[c] + 1, c + 1)) {
                        answer++;
                    }
                    if (hasValue(field[c] - 1, c + 1)) {
                        answer++;
                    }
                    break;
                case 6:
                    if (hasValue(field[c], c + 1) && hasValue(field[c], c + 2)) {
                        answer++;
                    }
                    if (hasValue(field[c], c + 1)) {
                        answer++;
                    }
                    if (hasValue(field[c] + 1, c + 1) && hasValue(field[c] + 1, c + 2)) {
                        answer++;
                    }
                    if (hasValue(field[c] - 2, c + 1)) {
                        answer++;
                    }
                    break;
                case 7:
                    if (hasValue(field[c], c + 1) && hasValue(field[c], c + 2)) {
                        answer++;
                    }
                    if (hasValue(field[c], c + 1)) {
                        answer++;
                    }
                    if (hasValue(field[c], c + 1) && hasValue(field[c] - 1, c + 2)) {
                        answer++;
                    }
                    if (hasValue(field[c] + 2, c + 1)) {
                        answer++;
                    }
                    break;
            }
        }
        System.out.println(answer);
    }

    private static boolean hasValue(int value, int position) {
        return position < field.length && field[position] == value;
    }
}