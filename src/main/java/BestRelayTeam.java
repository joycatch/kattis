import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

// https://open.kattis.com/problems/bestrelayteam

public class BestRelayTeam {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Runner> runners = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split(" ");
            String name = split[0];
            double a = Double.parseDouble(split[1]);
            double b = Double.parseDouble(split[2]);
            runners.add(new Runner(name, a, b));
        }

        LinkedList<Runner> result = new LinkedList<>();
        double bestTotalTime = Double.MAX_VALUE;
        for (Runner runner : runners) {
            List<Runner> copy = new ArrayList<>(runners);
            copy.remove(runner);
            List<Runner> fastest = copy.stream().sorted(Comparator.comparingDouble(Runner::getB)).limit(3).collect(Collectors.toList());
            double otherLegsTotalTime = fastest.stream().mapToDouble(r -> r.getB()).sum();

            double thisTeamsTotalTime = runner.getA() + otherLegsTotalTime;
            if (thisTeamsTotalTime < bestTotalTime) {
                result = new LinkedList<>(fastest);
                result.addFirst(runner);
                bestTotalTime = thisTeamsTotalTime;
            }
        }

        System.out.println(bestTotalTime);
        for (Runner runner : result) {
            System.out.println(runner.name);
        }
    }

    static class Runner {
        String name;
        double a, b;

        public Runner(String name, double a, double b) {
            this.name = name;
            this.a = a;
            this.b = b;
        }

        double getA() {
            return this.a;
        }

        double getB() {
            return this.b;
        }
    }
}
