import java.io.*;
class FileCopy{
    public static void main(String args[]){
        try{
            String path=args[0];
            File f=new File(path);
            f.createNewFile();
            FileInputStream fis=new FileInputStream(f);
            byte[] b1=new byte[fis.available()];
            fis.read(b1);
           // String str = new String(b1);
            System.out.println("Copying...");
            FileOutputStream fos=new FileOutputStream("C://Users//RISHI//Desktop//abc.pdf",true);
           // byte[] b2 = str.getBytes();
            fos.write(b1);
            System.out.println("Successfully copied...");
            fis.close();
            fos.close();
            System.out.println("File copy is successful...");

        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
}