import java.util.Scanner;  //import scanner
public class StreamTest {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); //Provide object'
        int park = sc.nextInt(1);
        int oh = sc.nextInt(2);
        int hur = sc.nextInt(3);
        System.out.print(sc.nextInt()); //always next

        System.out.println(park);

        System.out.println(oh);

        System.out.println(hur);
    }
}
// 숫자로 입력을 받아서 1이면  2면 3이면을 
// 각각 출력하는 프로그램을 만드세요