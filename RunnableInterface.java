import java.lang.*;
class RunnableInterface{
    public static void main(String args[]) throws Exception{
        RunnableEx re = new RunnableEx();
        re.start();
        re.join(1000);
        for(int i=0;i<6;i++){
            System.out.println("Main Function...");
        }
    }
}
class RunnableEx extends Thread{
    public void run(){
        for(int i=0;i<6;i++){
            System.out.println("This is child class...");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}