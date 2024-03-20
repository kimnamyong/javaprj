package day10;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2 {

 static String readTextFile(String path, Charset encoding) throws IOException {
  byte[] encoded = Files.readAllBytes(Paths.get(path));
  return new String(encoded, encoding);
 }


  public static void main(String[] args) throws IOException {
   String path = "D:/kny/html/test.html";
   String s = readTextFile(path, Charset.forName("EUC-KR"));
   String regex = "<a href='[^>]+>([^<]+)</a>";
   Pattern pattern = Pattern.compile(regex);
   Matcher matcher = pattern.matcher(s);
   while (matcher.find())
    System.out.println(matcher.group(1));



  }
}
