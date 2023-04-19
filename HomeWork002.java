package HomeWorkGB;

import java.util.ArrayList;

public class HomeWork002 {
    public static void main(String[] args) {
        String input = "[{ \"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        ParseString(input);
    }
    public static void ParseString(String str) {
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
            if(flag){
                sb.append(charArr[i]);
            }
            if (charArr[i] == ':'){
                flag = true;
            }
        }
        System.out.println(arrList);
    }
}
