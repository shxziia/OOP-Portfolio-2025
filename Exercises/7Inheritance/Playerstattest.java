
public class Playerstattest {
    public static void main(String[] args) {
        FootballStats footballPlayer = new FootballStats("Cristiano Ronaldo", "Manchester United", 30, 25, 5, 2, 0);

        CricketStats cricketPlayer = new CricketStats("Virat Kohli", "India", 50, 1200, 10, 55.5);


        System.out.println("Football Player Stats:");
        footballPlayer.displayFootballStats();
        System.out.println();


        System.out.println("Cricket Player Stats:");
        cricketPlayer.displayCricketStats();
    }
}

