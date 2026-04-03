public class PrintingServer {
    private PriorityQueue queue;
    public PrintingServer(){
        this.queue=new PriorityQueue();
    }
    public void acceptJob(PrintJob p){
        queue.insert(p);
    }
    public void print(){
        if(queue==null)
            return;
        PrintJob print=(PrintJob)queue.remove();
        System.out.println(print);
    }
}
