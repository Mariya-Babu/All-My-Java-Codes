import java.awt.*;
import java.awt.event.*;
class EventEx{
    public static void main(String args[]){
        System.out.println("Hello World!");
        FrameEx fe=new FrameEx();
    }
}
class FrameEx extends Frame{
    FrameEx(){
        setVisible(true);
        setSize(500,500);
        setBackground(Color.green);
        setTitle("FirstFrame");
        addWindowListener(new WindowEx());
    }
}
class WindowEx extends WindowAdapter{
    public void windowActivated(WindowEvent we){
        System.out.println("Window is Activated ");
    }
    public void windowClosed(WindowEvent we){
        System.out.println("Window is closed..");
        System.exit(0);
    }
    public void windowIconified(WindowEvent we){
        System.out.println("Window is minimized");
    }
}