import java.util.ArrayList;
public class UserStory extends Ticket {
private ArrayList<UserStory>dependencies;
    UserStory(int id, String name, int estimate, ArrayList<UserStory>dependencies) {
        super(id, name, estimate);
        this.dependencies = dependencies;
    }
    public ArrayList<UserStory> getDependencies() {

        return this.dependencies;
    }

    @Override
    public boolean complete(){
        if (isAllUserStoryComplete()){
            super.complete();
        }

        return false;
    }
    @Override
    public String toString(){
        return "[US " + getId() + "] " + getName();
    }

    public boolean isAllUserStoryComplete(){


        for (Ticket ticket : this.dependencies) {
            if (ticket.isCompleted() == false){
                return false;
            }
        }

        return true;

    }
}