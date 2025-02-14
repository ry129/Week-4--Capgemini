package FileHandling;
import java.io.*;
public class ReadWriteTextFile {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("inputfile");
                     FileOutputStream fos = new FileOutputStream("outputfile")) {

                    int byteData;
                    while ((byteData = fis.read()) != -1) {
                        fos.write(byteData);
                    }
                    System.out.println("File copied successfully.");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
