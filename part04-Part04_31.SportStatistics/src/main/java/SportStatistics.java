
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("File: ");
        String file = scan.nextLine();
        
        ArrayList<Game> game = readFromFile(file);
        
        System.out.println("Team: ");
        String team = scan.nextLine();
        int count =0;
        int win =0;
        int loss=0;
        
       // Count only the matches of the specified team
    ArrayList<Game> gamesOfATeam = new ArrayList<>();
    for (Game games : game) {
        if (team.equals(games.getHomeTeam()) || team.equals(games.getOpposingTeam())) {
            gamesOfATeam.add(games);
        }
    }
    // print the number of games
    System.out.println("Games: " + gamesOfATeam.size());

    // count the number of wins
    int wins = 0;
    for (Game games : gamesOfATeam) {
        if (games.isWinner(team)) {
            wins++;
        }
    }
    System.out.println("Wins: " + wins);
    System.out.println("Losses: " + (gamesOfATeam.size() - wins));
       
    }
    
    public static ArrayList<Game> readFromFile(String fileName) {
        ArrayList<Game> game = new ArrayList<>();
        
        try(Scanner scanner = new Scanner(Paths.get(fileName))){
         
        while (scanner.hasNextLine()) {
        String line = (scanner.nextLine());
        
        if (line.isEmpty()) {
                continue;
            }
        
        String[] parts = line.split(",");
        String homeTeam = parts[0];
        String opposingTeam = parts[1];
        int homeScore = Integer.valueOf(parts[2]);
        int opposingScore = Integer.valueOf(parts[3]);
        
       
       game.add(new Game(homeTeam,opposingTeam,homeScore,opposingScore));
        
        }
        }    catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
      }
        return game;
        
    }

         
    }        