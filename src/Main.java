import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Hashtable<Integer,String> player = new Hashtable<Integer,String>();
        player.put(18,"Virat");
        player.put(45,"Rohit");
        player.put(7,"Dhoni");
        System.out.println(player);
        for(Map.Entry m : player.entrySet()){
            System.out.println(m.getKey() + " is jersey number, " + m.getValue() + " is player name ");
        }
    }
}