public interface Prioritizable {
    int MAX_PRIORITY = 10, MIN_PRIORITY = 1;
    public abstract int getPriority();
    public abstract void setPriority(int p);
}
