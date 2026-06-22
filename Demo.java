class MyTask implements Runnable{
    public void run(){
        System.out.println(Task Executed));
    }
}
class MyTask1 implements Runnable{
    public void run(){
        System.out.println(Task Executed);

    }
}
class Demo{
    public static void main(String[]args){
       Thread t=new Thread(new MyTask());
       Thread s=new Thread(new MyTask1());
       t.start();
       s.start();

    }
}