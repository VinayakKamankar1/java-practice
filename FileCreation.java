import java.io.File;
public class FileCreation {
    public static void main(String[] args){
        File file=new File ("C:\\Users\\kaman\\OneDrive");
        try{
            boolean value=file.createNewFile();
            if(value){ System.out.println("The new file is Created");
        }
        else{
            System.out.println("The new File is Already exists");
            }
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
}
