public class Task {
    private String taskName;
    private String dueDate;
    private int priority;
    private boolean complete;

    public Task(String tn, String dd, int p)
    {
        taskName = tn;
        dueDate = dd;
        priority = p;
        complete = false;
    }

    public String getTaskName(){
        return taskName;
    }
    public void setTaskName(String tn){
        taskName = tn;
    }
    public String getDueDate(){
        return dueDate;
    }
    public void setDueDate(String dd){
        dueDate = dd;
    }
    public int getPriority(){
        return priority;
    }
    public void setPriority(int p){
        priority = p;
    }
    public boolean isComplete(){
        return complete;
    }
    public void setComplete(boolean b){
        complete = b;
    }

    public String toString(){
        String comp = "";
        if(complete) comp = "✅";
        else{ comp = "❌";}
        return taskName + " | Due: " + dueDate + " | Priority: " + priority + " | " + comp;
    }

}
