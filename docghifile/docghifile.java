package docghifile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class docghifile {

  public static String readContentFromFile(String path) throws IOException {
    BufferedReader in = new BufferedReader(new FileReader(path));
    String str;
    StringBuilder result = new StringBuilder();
    while ((str = in.readLine()) != null) {
      result.append(str).append("\n");
    }
    return result.toString();
  }

  public static void writeContentToFile(String path, String content) {
    try {
      FileWriter fw = new FileWriter(path, false);
      BufferedWriter bw = new BufferedWriter(fw);
      bw.write(content);
      bw.newLine();
      bw.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void appendContentToFile(String path, String content) {
    try {
      FileWriter fw = new FileWriter(path, true);
      BufferedWriter bw = new BufferedWriter(fw);
      bw.write(content);
      bw.newLine();
      bw.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static File findFileByName(String folderPath, String fileName) {
    File folder = new File(folderPath);
    File[] files = folder.listFiles();
    if (files != null) {
      for (File file : files) {
        if (file.getName().equals(fileName)) {
          return file;
        }
      }
    }
    return null;
  }

  public static void main(String[] args) throws IOException {
    System.out.println(readContentFromFile("src/main/java/test.txt"));
    writeContentToFile("src/main/java/test.txt", "asdfasdf");
    appendContentToFile("src/main/java/test.txt", "dsafffffffffffffffffffffffffff");
    System.out.println(findFileByName("src/main/java/", "docghifile/test.txt"));
    System.out.println(findFileByName("src/main/java/", "test1.txt"));
  }

}
