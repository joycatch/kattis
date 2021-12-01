import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;

// https://open.kattis.com/problems/prerequisites

public class Prerequisites {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        while (!"0".equals(line)) {
            String[] split = line.split(" ");
            int m = Integer.parseInt(split[1]);
            HashSet<String> selectedCourses = new HashSet<>();
            selectedCourses.addAll(List.of(br.readLine().split(" ")));
            String result = "yes";
            for (int i = 0; i < m; i++) {
                split = br.readLine().split(" ");
                int minimumCoursesFromCategory = Integer.parseInt(split[1]);

                int count = 0;
                for (String selectedCourse : selectedCourses) {
                    for (int j = 2; j < split.length; j++) {
                        if (selectedCourse.equals(split[j])) {
                            count++;
                        }
                    }
                }
                if (count < minimumCoursesFromCategory) {
                    result = "no";
                }
            }
            System.out.println(result);
            line = br.readLine();
        }
    }
}
