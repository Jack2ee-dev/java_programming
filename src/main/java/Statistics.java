import java.util.ArrayList;
import java.util.List;

public class Statistics {
    private List<Integer> allScores;
    private List<Integer> passingScores;
    private static int MAX_LIMIT = 100;
    private static int MIN_LIMIT = 0;
    private static int PASSING_SCORE = 50;

    public Statistics() {
        this.allScores = new ArrayList<>();
        this.passingScores = new ArrayList<>();
    }

    public void addScore(int score) {
        if (score < Statistics.MIN_LIMIT || score > Statistics.MAX_LIMIT) {
            return;
        }
        allScores.add(score);
        if (score >= PASSING_SCORE) {
            passingScores.add(score);
        }
    }

    public String allAverage() {
        int sum = 0;
        for (int score : this.allScores) {
            sum += score;
        }
        return Double.toString((double) sum / this.allScores.size());
    }

    public String passingAverage() {
        if (passingScores.size() <= 0) {
            return "-";
        }

        int sum = 0;
        for (int score : this.passingScores) {
            sum += score;
        }
        return Double.toString((double) sum / this.passingScores.size());
    }

    public Double passPercentage() {
        return (double) 100 * this.passingScores.size() / this.allScores.size();
    }

    public void gradeDistribution() {
        int[] distribution = { 0, 0, 0, 0, 0, 0 };
        for (int score : allScores) {
            if (score < 50) {
                distribution[0] += 1;
            } else if (score < 60) {
                distribution[1] += 1;
            } else if (score < 70) {
                distribution[2] += 1;
            } else if (score < 80) {
                distribution[3] += 1;
            } else if (score < 90) {
                distribution[4] += 1;
            } else if (score >= 90) {
                distribution[5] += 1;
            }
        }

        for (int i = distribution.length - 1; i >= 0; i--) {
            System.out.println(i + ": " + "*".repeat(distribution[i]));
        }

    }
}
