public class StringMethodExam {
    // String str = new String("hello");
    public static void main(String[] args){
    String str = "hello";
    System.out.println(str.length());
    System.out.println(str.concat(" world"));
    System.out.println(str); //str은 변하지 않는다.
    str = str.concat(" world");
    System.out.println(str);
    System.out.println(str.substring(3));
    System.out.println(str.substring(3, 6));
    }
}
