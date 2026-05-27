public class Playerstat {
    private String playerName;
    private String teamName;
    private int gamesPlayed;

    public Playerstat(String playerName, String teamName, int gamesPlayed) {
        this.playerName = playerName;
        this.teamName = teamName;
        this.gamesPlayed = gamesPlayed;
    }

    public void displayPlayerInfo() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Team Name: " + teamName);
        System.out.println("Games Played: " + gamesPlayed);
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    @Override
    public String toString() {
        return "Playerstat{" +
                "playerName='" + playerName + '\'' +
                ", teamName='" + teamName + '\'' +
                ", gamesPlayed=" + gamesPlayed +
                '}';
    }

    }
