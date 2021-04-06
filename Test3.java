// public class Test {
//     public int sum(int a, int b) {
//         return a+b;
//     }

//     public static void main(String[] args) {
//         int a = 3;
//         int b = 4;

//         Test myTest = new Test();
//         int c = myTest.sum(a, b);

//         System.out.println(c);
//     }
// }
public class Test {
    public int sum(int a, int b) {
        return a+b;
    }

    public String say() {
        return "Hi";
    }
    public void sum2(int a,int b) {
        System.out.println(a+"과 " + b +"의 합은 "+ (a+b)+"입니다.");
    }
    public void say2() {
        System.out.println("hi");
    }
    public static void main(String[] args){
        int a = 3;
        int b = 4;

        Test myTest = new Test();

        int c = myTest.sum(a,b);
        System.out.println(c);

        String d = myTest.say();
        System.out.println(d);

        myTest.say2();
        }

    }
