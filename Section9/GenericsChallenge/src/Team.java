public abstract class Team implements Comparable<Team>{
    private String name;
    private int rank;

    public Team(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public int compareTo(Team team) {
        if (this.getRank() > team.getRank()){
            return -1;
        } else if (this.getRank() < team.getRank()){
            return 1;
        } else {
            return 0;
        }
    }
}
