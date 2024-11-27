
import java.util.*;

public class SetClasses {
    public static void main(String[] args) {
        /**
         * Request to the user a list of possible winners
         *
         * - get an element randomly and print a message indicating the winner
         *
         * the award is up to you
         */

        Set<String> participants = new HashSet<>();

        participants.add("Pedro");
        participants.add("Juan");
        participants.add("Carlos");
        participants.add("Jenny");
        participants.add("Alex");
        participants.add("Nahum");

        LinkedHashSet<String> awards = new LinkedHashSet<>();
        awards.add("Car");
        awards.add("Motorcycle");
        awards.add("Blender");
        awards.add("Fan");
        awards.add("CellPhone");
        awards.add("Televise");
        

        List<String> participantList = new ArrayList<>(participants);
        List<String> awardList = new ArrayList<>(awards);


        String winner = participantList.get((int) (Math.random() * participantList.size()));
        String award = awardList.get((int) (Math.random() * awardList.size()));


        System.out.println("The winner is: " + winner);
        System.out.println("The award is: " + award);

    }
}
