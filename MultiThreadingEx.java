import java.lang.management.ThreadMXBean;

class MultiThreadingEx{
    public static void main(String args[]){
        ThreadEx te=new ThreadEx();
        te.start();
        for(int i=0;i<5;i++){
            System.out.println("Main method is called...");
        }
        System.out.println("Main method is completed....");
    }
}
class ThreadEx extends Thread{
    public void run(){
        for(int i=0;i<4;i++){
            System.out.println("Child is called....");
        }
        System.out.println("Chile method is completed ");
    }
}