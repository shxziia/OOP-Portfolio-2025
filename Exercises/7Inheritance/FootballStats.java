public class FootballStats {
    private int goalsScored;
    private int assists;
    private int yellowCards;
    private int redCards;

    public FootballStats(String playerName, String teamName, int gamesPlayed,
                         int goalsScored, int assists, int yellowCards, int redCards) {
        super();
        this.goalsScored = goalsScored;
        this.assists = assists;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
    }
    public void displayFootballStats() {
        displayPlayerInfo(); // Call base class method
        System.out.println("Goals Scored: " + goalsScored);
        System.out.println("Assists: " + assists);
        System.out.println("Yellow Cards: " + yellowCards);
        System.out.println("Red Cards: " + redCards);
    }

    private void displayPlayerInfo() {
    }

    public int getGoalsScored() {
        return goalsScored;
    }
    public int getAssists() {
        return assists;
    }
    public int getYellowCards() {
        return yellowCards;
    }
    public int getRedCards() {
        return redCards;
    }

    @Override
    public String toString() {
        return "FootballStats{" +
                "goalsScored=" + goalsScored +
                ", assists=" + assists +
                ", yellowCards=" + yellowCards +
                ", redCards=" + redCards +
                '}';
    }
}

