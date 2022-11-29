import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    static FileWriter myWriter ;

    public static void write(String string) {
        try {
            myWriter.write(string);
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }

   

    public static void write(char dot) {
        write((new Character(dot)).toString());
    }

    public static void setFile(String filename) {
        try {
            myWriter = new FileWriter(filename);
       } catch (IOException e) {
           e.printStackTrace();
       }
    }

}
