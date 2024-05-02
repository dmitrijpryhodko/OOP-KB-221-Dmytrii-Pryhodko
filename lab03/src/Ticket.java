public class Ticket {
    private int id;
    private String name;
    private int estimate;
    private boolean isCompleted;


    Ticket(int id, String name, int estimate){
        this.id = id;
        this.name = name;
        this.estimate = estimate;
        isCompleted = false;
    }
    public int getId() {

        return id;
    }
    public String getName(){

        return name;
    }
    public int getEstimate() {

        return estimate;
    }
    public boolean isCompeted() {

        return isCompleted;
    }
    public boolean complete() {
        this.isCompleted = true;
        return false;
    }

    public boolean isCompleted() {

        return isCompleted;
    }
}

