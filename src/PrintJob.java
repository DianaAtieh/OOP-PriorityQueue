public class PrintJob  implements Prioritizable{
    private int priority;
    private String text;
    public PrintJob(String text,int priority){
     if(priority>=MIN_PRIORITY && priority<=MAX_PRIORITY)
         this.priority=priority;
     else
         this.priority=MIN_PRIORITY;
     this.text=text;
    }
    public int getPriority(){
        return this.priority;
    }
    public void setPriority(int priority){
        if(priority>=MIN_PRIORITY && priority<=MAX_PRIORITY)
            this.priority=priority;
        else
            this.priority=MIN_PRIORITY;

    }
    public String getText(){
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }


    public String toString() {
        return getText();
    }
}
