import java.io.*;
class FileHandling{
    public static void main(String args[]){
        String path = "C://Users//RISHI//Desktop";
        try{
            int files = 0;
            int dir = 0;
            File f=new File(path);
            String[] s=f.list();
            System.out.println("The directories and file are ");
            for(int i=0;i<s.length;i++){
                System.out.println(s[i]);
            }
            System.out.println("The list of files are : ");
            for(int i=0;i<s.length;i++){
                File f1=new File(f,s[i]);
                if(f1.isFile()){
                    System.out.println(s[i]);
                    files++;

                }
            }
            System.out.println("The no.of file's in this directory are  "+files);
            System.out.println("The list of directories are : ");
            for(int i=0;i<s.length;i++){
                File f1 = new File(f,s[i]);
                    if(!(f1.isFile())){
                        System.out.println(s[i]);
                        dir++;
                    }
            }
            System.out.println("The no.of directories in this directory are "+dir);
        }
        catch(Exception e){
            System.out.println("File not found error ");
        }
    }
}