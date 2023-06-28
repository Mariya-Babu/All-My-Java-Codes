import java.awt.*;
import java.awt.event.*;
class AEvent extends Frame implements ActoionListener{
    TextField tf;
    AEvent(){
            tf=new TextField();
            tf.setBounds(60,50,170,20);
            Button b = new Button("Subscribe");
            b.setBounds(100,120,80,30);
            b.add(b);
            add(tf);
            setLayout(null);
            setSize(300,300);
            setVisible(true);
        }
        public void actionPerformed(ActionEvent e){
            tf.setText("Welcome");
        }
        public static void main(String args[]){
            new AEvent();
        }
    }