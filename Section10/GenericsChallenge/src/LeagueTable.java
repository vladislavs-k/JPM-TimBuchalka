import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable<T extends Team>  {
    private String leagueName;

    private ArrayList<T> teams = new ArrayList<>();

    public LeagueTable(String name) {
        this.leagueName = name;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public boolean addTeam(T team){
        if (teams.contains(team)){
            System.out.println("Such team is already in the list");
            return false;
        } else {
            System.out.println("'" + team.getName() + "' has been added to the '" + this.getLeagueName() + "'");
            teams.add(team);
            return true;
        }
    }

    public void printListOfTeams(){
        Collections.sort(this.teams);

        for (T t : teams){
            System.out.println("Rank: " + t.getRank() + ". Team name: " + t.getName());
        }

    }


}
