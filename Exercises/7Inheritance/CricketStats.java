public class CricketStats{
    private int runsScored;
    private int wicketsTaken;
    private double battingAverage;

    public CricketStats(String playerName, String teamName, int gamesPlayed,
                        int runsScored, int wicketsTaken, double battingAverage) {
        super();
        this.runsScored = runsScored;
        this.wicketsTaken = wicketsTaken;
        this.battingAverage = battingAverage;
    }
    public void displayCricketStats() {
        displayPlayerInfo();
        System.out.println("Runs Scored: " + runsScored);
        System.out.println("Wickets Taken: " + wicketsTaken);
        System.out.println("Batting Average: " + battingAverage);
    }

    private void displayPlayerInfo() {
    }

    public int getRunsScored() {
        return runsScored;
    }
    public int getWicketsTaken() {
        return wicketsTaken;
    }
    public double getBattingAverage() {
        return battingAverage;
    }

    @Override
    public String toString() {
        return "CricketStats{" +
                "runsScored=" + runsScored +
                ", wicketsTaken=" + wicketsTaken +
                ", battingAverage=" + battingAverage +
                '}';
    }
}
