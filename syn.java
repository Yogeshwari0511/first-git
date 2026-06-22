lass count{
    int count=0;
    void increment(){
        count++;
    }
}
class MyThreads extends Thread{
    count c;
    MyThreads(count c) {
        this.c = c;
    }
    public void run(){
        for(int i=0;i<=100000;i++){
            c.increment();
        }
    }
}

public class syn {
    public static void main(String[]args){
        count c=new count();
        MyThreads t1=new MyThreads(c);
        MyThreads t2=new MyThreads(c);

        t1.start();
        t2.start();

        t1.join();
        t2.join ();
        System.out.println(c.count);
    }