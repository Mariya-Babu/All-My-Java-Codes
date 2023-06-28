import java.io.*;
class FileRead{
    public static void main(String args[]){
        try{
            String path="C://Users//RISHI//Desktop//sample.txt";
            FileReader fr=new FileReader(path);
            int i = 0;
            while(i!=-1){
                i = fr.read();
                System.out.print((char)i);
            }
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
}