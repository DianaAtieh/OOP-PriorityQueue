public class PriorityQueue  {
    private int size;
    Prioritizable queue[];
    public PriorityQueue(){
        this.queue= new Prioritizable[100];
        size=0;
    }

    public Prioritizable[] getQueue() {
        return queue;
    }

    public void setQueue(Prioritizable[] queue) {
        this.queue = queue;
    }

    public void insert(Prioritizable element){
        int ind=size-1;
        while(ind>=0 && queue[ind].getPriority()<element.getPriority()){
            queue[ind+1]=queue[ind];
            ind--;
        }
        queue[ind+1]=element;
        size++;
    }
    public Prioritizable remove(){
    if(size==0)
        return null;
        int ind=0;
        Prioritizable tmp=queue[ind];
        while(ind<size-1){
            queue[ind]=queue[ind+1];
            ind++;
        }
        size--;
        return tmp;
    }

}
