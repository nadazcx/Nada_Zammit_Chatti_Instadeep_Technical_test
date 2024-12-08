


public enum Priority{
    Low(1),Medium(2),High(3);
    private int priorityNumber;
    Priority(int priorityNumber){
        this.priorityNumber=priorityNumber;
    }
    public int getPriorityNumber(){
        return this.priorityNumber;
    }

    
}
