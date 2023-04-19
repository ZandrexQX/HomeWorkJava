package HomeWorkGB;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class HomeWork002 {
    public static void main(String[] args) {
        String path = "input.txt";
        OutConsole(ParseString(ReaderString(path)));
        OutFile(ParseString(ReaderString(path)));
    }
    public static ArrayList<ArrayList> ParseString(String str) {
        str = str.replaceAll("\"", "").replaceAll("}", "");
        char [] charArr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        ArrayList <String> strList = new ArrayList<String>();
        ArrayList<ArrayList> arrList = new ArrayList<ArrayList>();
        Boolean flag = false;
        int count = 0;
        for (int i = 0; i < charArr.length; i++) {
            if ((flag && charArr[i] == ',') || i == charArr.length-1 ){
                flag = false;
                strList.add(sb.toString());
                count++;
                if(count == 3){
                    arrList.add(strList);
                    count = 0;
                    strList = new ArrayList<String>();
                }
                sb = new StringBuilder();
            }
            if (flag) sb.append(charArr[i]);
            if (charArr[i] == ':') flag = true;
        }
        return arrList;
    }
    public static String ReaderString(String path) {
        File file = new File(path);
        try (BufferedReader br =new BufferedReader(new FileReader(file,StandardCharsets.UTF_8))) {
            return br.readLine();
        } catch (Exception e) {
            e.printStackTrace();
            Log("Error reader");
            return "";
        }
    }
    public static void OutConsole(ArrayList<ArrayList> ArrStr) {
        for (ArrayList <String> arrayList : ArrStr) {
            System.out.println("Студент "+ arrayList.get(0) +
              " получил "+ arrayList.get(1) +  " по предмету "+ arrayList.get(2) +  ".");
        }
    }
    public static void OutFile(ArrayList<ArrayList> ArrStr) {

        String path = "output.txt";
        try (FileWriter fileWriter = new FileWriter(path, StandardCharsets.UTF_8)) {
            for (ArrayList <String> arrayList : ArrStr) {
                fileWriter.append("Студент "+ arrayList.get(0) +
                                " получил "+ arrayList.get(1) +  
                                " по предмету "+ arrayList.get(2) +  ". \n");
            }
            fileWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
            Log("Error writer");
        }
    }
    public static void Log(String mess) { // От вопросов в лог-файле так и не получилось избавиться х(
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("log.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);
        Logger logger = Logger.getAnonymousLogger();
        logger.addHandler(fileHandler);
        logger.log(Level.INFO, mess);
        fileHandler.close();
    }
}
