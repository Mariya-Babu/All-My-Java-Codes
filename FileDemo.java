import java.io.*;
class FileDemo{
    public static void main(String args[]){
        File f=new File("C:\\Users\\RISHI\\Desktop\\sample.txt");
        try{
            if(f.createNewFile()){ 
                System.out.println("File is created sucessfully ");
           }
            else{
                System.out.println("File Already exist ");
            }
        }
        catch(Exception e){
            System.out.println("Exception Handled..");
        }
    }
}
