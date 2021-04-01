public class ifexam {
    
    public static void main(String[] args){
        String a = "hello";
        String b = "java";
        String c = "hello";
        String d = new String("hello");
        System.out.print(a.equals(b));
        System.out.print(a == c);
        System.out.print(a == d);
        System.out.print(a);
        System.out.print(d);
        System.out.print(System.identityHashCode(a));
        System.out.print(System.identityHashCode(c));
        System.out.print(System.identityHashCode(d));
    }
}
