import java.awt.*;
import java.util.*;
class FrameEx{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int width,height;
        String title,colour;
        System.out.println("width of the fram : ");
        width = sc.nextInt();
        System.out.println("Enter the height of the frame : ");
        height = sc.nextInt();
        System.out.println("Enter the title of the frame : ");
        title = sc.next();
        System.out.println("Enter the colour of the fram : ");
        colour = sc.next();
        System.out.println("Frame is create with your requirements ");
        FC fc=new FC(width, height, title, colour);
    }
}
class FC extends Frame {
    int width,height;
    String title,colour;
    FC(int width,int height,String title,String colour){
        this.width = width;
        this.height = height;
        this.title = title;
        this.colour = colour;
        setVisible(true);
        setSize(width,height);
        setTitle(title);
        setBackground(Color.red);
    }
    public void paint(Graphics g){
        Font f=new Font("ARIAL",Font.ITALIC+Font.BOLD,40);
        g.setFont(f);
        setForeground(Color.white);
        g.drawString("Hello World this is my first Frame",100,100);
    }
}