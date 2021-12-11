package week10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Week10 {

  public static List<String> getAllFunctions(String fileContent) {
    List<String> importList = new ArrayList<>();
    List<String> result = new ArrayList<>();
    Pattern pattern = Pattern.compile("(import).+");
    Matcher matcher = pattern.matcher(fileContent);
    while (matcher.find()) {
      importList.add(fileContent.substring(matcher.start(), matcher.end()));
      //System.out.println(fileContent.substring(matcher.start(), matcher.end()));
    }
    pattern = Pattern.compile("(public static).+\\)");
    matcher = pattern.matcher(fileContent);
    while (matcher.find()) {
      String res = "";
      String st = fileContent.substring(matcher.start(), matcher.end());
      Pattern pattern1 = Pattern.compile("\\S+\\(.+$");
      Matcher matcher1 = pattern1.matcher(st);
      while (matcher1.find()) {
       st = st.substring(matcher1.start(), matcher1.end());
      }
      pattern1 = Pattern.compile("^\\w+");
      matcher1 = pattern1.matcher(st);
      while (matcher1.find()) {
        res = res + st.substring(matcher1.start(), matcher1.end()) + "(";
      }
      pattern1 = Pattern.compile("(\\w+\\s\\w+)|(\\w+\\[]+\\s\\w+)");
      matcher1 = pattern1.matcher(st);
      while (matcher1.find()) {
        String st1 = st.substring(matcher1.start(), matcher1.end());
        Pattern pattern2 = Pattern.compile("^\\w+");
        Matcher matcher2 = pattern2.matcher(st1);
        while (matcher2.find()) {
          String tmp = st1.substring(matcher2.start(), matcher2.end());
          for (String tmp1 : importList)
            if (tmp1.contains(tmp)){
              tmp = tmp1.substring(7,tmp1.length()-1);
            }
          res = res + tmp + ',';
        }
      }
      if (res.charAt(res.length()-1) == ',') res = res.substring(0,res.length()-1);
      res = res + ')';
      result.add(res);
    }
    return result;
  }

  public static void main(String[] args) throws IOException {
    StringBuilder content = new StringBuilder();
    File file = new File("G:\\bt binh\\oop\\src\\main\\java\\week10\\test.txt");
    BufferedReader reader = new BufferedReader(new FileReader(file));
    String line = reader.readLine();
    while (line != null) {
      line = reader.readLine();
      content.append(line).append("\n");
    }
    System.out.println(getAllFunctions(content.toString()));
  }
}