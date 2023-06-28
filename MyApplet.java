/* <applet code="MyApplet" height="300" width="300"> </applet> */
import java.applet.*;
class MyApplet{
    public void init(){
        System.out.println("Init method is called....");
    }
    public void start(){
        System.out.println("Start method is called....");
    }
    public void stop(){
        System.out.println("Stop method is called...");
    }
    public void destroy(){
        System.out.println("Destroy metod is called...");
    }
}