import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> player = new ArrayList<>();
        player.add(0, name);
        player.add(1, Integer.toString(hitPoints));
        player.add(2, Integer.toString(strength));
        player.add(3 ,weapon);
        return player;
    }

    @Override
    public void read(List<String> stringList) {
        if (stringList != null && stringList.size() > 0) {
            name = stringList.get(0);
            hitPoints = Integer.parseInt(stringList.get(1));
            strength = Integer.parseInt(stringList.get(2));
            weapon = stringList.get(3);
        }
    }

    @Override
    public String toString() {
        return ("Player{name='" + name + "', hitPoints=" + hitPoints +
                ", strength=" + strength + ", weapon='" + weapon + "'}");
    }


//    @Override
//    public String toString() {
//        return "Player{" +
//                "name='" + name + '\'' +
//                ", weapon='" + weapon + '\'' +
//                ", hitPoints=" + hitPoints +
//                ", strength=" + strength +
//                '}';
//    }
}
