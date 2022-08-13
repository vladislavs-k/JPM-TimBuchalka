// Create a generic class to implement a league table for a sport.
// The class should allow teams to be added to the list, and store
// a list of teams that belong to the league.
//
// Your class should have a method to print out the teams in order,
// with the team at the top of the league printed first.
//
// Only teams of the same type should be added to any particular
// instance of the league class - the program should fail to compile
// if an attempt is made to add an incompatible team.

public class Main {
    public static void main(String[] args) {
        FootballTeam fTeamOne = new FootballTeam("F_team-1", 100);
        FootballTeam fTeamTwo = new FootballTeam("F_team-2", 200);
        FootballTeam fTeamThree = new FootballTeam("F_team-3", 300);

        GolfTeam gTeamOne = new GolfTeam("G_team-01", 2000);
        GolfTeam gTeamTwo = new GolfTeam("G_team-02", 1000);
        GolfTeam gTeamThree = new GolfTeam("G_team-03", 3000);
        GolfTeam gTeamFour = new GolfTeam("G_team-04", 3000);


        LeagueTable<FootballTeam> footballLeague = new LeagueTable<>("Football league");
        LeagueTable<GolfTeam> golfLeague = new LeagueTable<>("Golf League");
        
        LeagueTable generalLeague = new LeagueTable<>("Messy League");

        footballLeague.addTeam(fTeamOne);
        footballLeague.addTeam(fTeamTwo);
        footballLeague.addTeam(fTeamThree);
//        footballLeague.addTeam(gTeamOne);

        System.out.println("-------------------------------------------------------");

        golfLeague.addTeam(gTeamOne);
        golfLeague.addTeam(gTeamTwo);
        golfLeague.addTeam(gTeamThree);
        golfLeague.addTeam(gTeamFour);
//        golfLeague.addTeam(fTeamOne);
        
        System.out.println("-------------------------------------------------------");

        generalLeague.addTeam(fTeamOne);
        generalLeague.addTeam(fTeamTwo);
        generalLeague.addTeam(fTeamThree);
        generalLeague.addTeam(gTeamOne);
        generalLeague.addTeam(gTeamTwo);
        generalLeague.addTeam(gTeamThree);
        generalLeague.addTeam(gTeamFour);


        System.out.println("\n\n======================================");
        footballLeague.printListOfTeams();
        System.out.println();
        golfLeague.printListOfTeams();
        System.out.println();
        generalLeague.printListOfTeams();

    }
}
