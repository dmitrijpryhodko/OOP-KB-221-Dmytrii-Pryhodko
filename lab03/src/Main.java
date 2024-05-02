import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserStory userStory1 = new UserStory(1, "User Registration", 5, new ArrayList<>());
        UserStory userStory2 = new UserStory(2, "Login ", 3, new ArrayList<>());


        Bug bug1 = Bug.createBug(1, "Registration form bug", 2, userStory1);
        Bug bug2 = Bug.createBug(2, "Login bug", 1, userStory2);


        Sprint sprint = new Sprint(10, 5);
        sprint.addUserStory(userStory1);
        sprint.addUserStory(userStory2);
        sprint.addBug(bug1);
        sprint.addBug(bug2);


        List<Ticket> sprintTickets = sprint.getTickets();
        for (Ticket ticket : sprintTickets) {
            System.out.println(ticket);
        }

        int allEstimate = sprint.getTotalEstimate();
        System.out.println("Total estimate of the sprint: " + allEstimate);
    }
}