package B_May_Code.ex_25052024.Exceptions;
import java.io.File;
import java.io.FileReader;
public class Lab224 {
    public static void main(String[] args) {


        try {
            String path = "C://a.txt";
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }}