import java.awt.*;
import java.awt.event.*;

import javax.swing.WindowConstants;
class MainEventEx{
    public static void main(String args[]){
        EventEx ee=new EventEx();
        
    }
}
class WindowEx implements WindowListener{
    public void windowActivated(WindowEvent we){
        System.out.println("Window is Activated");
    }
    public void windowDeactivated(WindowEvent we){
        System.out.println("Window is DeActivated");
    }
    public void windowIconified(WindowEvent we){
        System.out.println("Normal state to minimize state");
    }
    public void windowDeiconified(WindowEvent we){
        System.out.println("From minimized state to normal state");
    }
    public void windowClosing(WindowEvent we){
        System.out.println("Window is closed");
    }
    public void windowClosed(WindowEvent we){
        System.out.println("Window is closed from window closed method ");
    }
    public void windowOpened(WindowEvent we){
        System.out.println("Window is Opened");
    }
}
class EventEx extends Frame{
    EventEx(){
        setVisible(true);
        setTitle("EventEx");
        setSize(500,500);
        setBackground(Color.green);
        addWindowListener(new WindowEx());
    }
}
