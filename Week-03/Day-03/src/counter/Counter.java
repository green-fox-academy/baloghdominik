package counter;

public class Counter {
    private int count;
    private int init;

    public Counter(){
        this.count = 0;
        this.init = 0;
    }

    public Counter(int init){
        this.count = init;
        this.init = init;
    }

    public void add(int i){
        this.count = this.count + i;
    }

    public void add(){
        this.count++;
    }

    public int get(){
        return this.count;
    }

    public void reset(){
        this.count = 0;
        this.count = init;
    }
}
