//import java.io.FileOutputStream; //파일 생성
//import java.io.IOException; //예외 처리
//import java.io.FileWriter;
//import java.io.PrintWriter;

import java.io.*;
public class FileWrite {
    public static void main(String[] args) throws IOException {
    //    FileOutputStream output = new FileOutputStream("out.txt");
    //   FileWriter fw = new FileWriter("out.txt");
       PrintWriter pw = new PrintWriter("out.txt");    
    for (int i = 1 ; i < 11 ; i++){
            String data = i+" 번째 줄입니다.";
            pw.println(data);
        }
        pw.close();


    //FileWriter fw2 = new FileWriter("out.txt", true);
    PrintWriter pw2 = new PrintWriter(new FileWriter("out.txt", true));   
    for (int i = 11; i < 21 ; i++) {
        String data = i+" 번째 줄입니다.";
        pw2.println(data);
    }
    pw2.close();

    PrintWriter pw3 = new PrintWriter(new FileWriter("odd.txt", true));   
    for (int i = 1; i < 51 ; i++) {
        Integer data = 2*i-1;
        pw3.println(data);
    }
    pw3.close();

}    
}
//1부터 100까지의 수 중 홀수만 odd.txt로 저장하세요