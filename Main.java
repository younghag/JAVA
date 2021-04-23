import java.util.*;
class Main {
  public static void main(String[] args) {
  // boolean b1 = true;
  // boolean b2 = false;

  // System.out.println("b1 =:"+ b1);
  // System.out.println("b2= :" +b2);
  // int x = 7;
  // int y = 8;
  // int z = 9;
  // System.out.println("x값: "+ x);
  // System.out.println("y값: " + y);
  // System.out.println("z값: "+ z);
  // // System.out.println("x, y, z의 평균은 "+(x+y+z)/3+" 입니다.");
  //   int a;
  //   a = (int) 10.0;
  //   System.out.println("a= "+a);
  //   System.out.println("float       int");
  //   System.out.println("--------------");

  //   float x =0.0F;
  //   for (int i = 0; i<= 1000; i++, x+= 0.001F) {
  //     System.out.printf("%10.7f %10.7f\n",x, (float)i/1000);
  //   }
  // double[] a = new double[5];
  // for(int j = 0; j <a.length; j++)
  //   a[j] = 5-j;
  // for(int i = 0 ; i < a.length; i++)
  //   System.out.println("a["+i+"]=" + a[i]);
// System.out.print
// int n = sc.nextInt();

//   int [] a = new int[n];

//   for (int j = 0; j<a.length; j++)
//   System.out.print("a["+j+"]=");
//   a[j]=sc.nextInt();
//   }
//   System.out.print("a = {");
//   for (int i = 0; i < n - 1; i++)
//     System.out.print(a[i]+ ", ");
//   System.out.print(a[n-1]+"}");
// Scanner sc = new Scanner(System.in);
// System.out.print("사람 수:");
// int n = sc.nextInt();
// System.out.print("정수를 입력하세요");
//   int[] a = new int[n];
//   int sum = 0;

//   for (int j = 0; j < n ; j++){
//     System.out.print("1번의 점수 : ");
//     a[j]=sc.nextInt();
//     sum += a[j];
//   }
// System.out.print("합계는 "+ sum + "입니다");
// System.out.print("평균은"+ (sum/n) + "입니다");
// System.out.print("평균은"+ max + "입니다");
// System.out.print("최저점은"+ min + "입니다");

// int n = sc.nextInt();
// int[] a = new int[n];

//   for (int j =0 ; j<n; j++){
//     System.out.print("a["+j+"] = ");
//     a[j] = sc.nextInt();
// }
// System.out.print("찾는 숫자: ");
// int s = sc.nextInt();
//   for (int j = 0 ; j < n ; j++){
//     if (a[j]=s){
//       System.out.print("그 값은 a ["+j+"]에 있습니다.");
//       break;
//     }
//   }
// Random rand = new Random();
// Scanner sc = new Scanner(System.in);
// System.out.print("요소 수:");
// int n = sc.nextInt();
// int[] a = new int[n];

//   for(int j = 0; j < n ; j++){
//     a[j]= 1+ rand.nextInt(10);
//   }
//   for (int j = 0; j < n ; j++){
//     System.out.println("a["+j+"] = "+a[j]);
//   }
// Random rand = new Random();
// Scanner sc = new Scanner(System.in);
// System.out.print("요소 수:");
// int n = sc.nextInt();
// int[] a = new int[n];
// for(int j = 1; j<n; j++){
//   do {
//     a[j] = 1+ rand.nextInt(10);
//   } while(a[j]==a[j-1]);
// }
// for(int j = 0; j < n; j++){
//   System.out.println("a["+j+"]= " + a[j]);
// }
//   a[0] = 1 + rand.nextInt(10);
// Random rand = new Random();
// Scanner sc = new Scanner(System.in);
// System.out.print("요소 수:");
// int n = sc.nextInt();
// int[] a = new int[n];
// for(int j = 1; j<n; j++){
//   do {
//     a[j] = 1+ rand.nextInt(10);
//   } while(a[j]==a[j-1]);
// }
// for(int j = 0; j < n; j++){
//   System.out.println("a["+j+"]= " + a[j]);
// }
//   a[0] = 1 + rand.nextInt(10);
// Random rand = new Random();
//     Scanner sc = new Scanner(System.in);

//     int n = 0;
//     do {
//       System.out.print("요소 수:");
//       n = sc.nextInt();
//     }while(n>10);

//     int[] a = new int[n];

//     //a[0]= 1+ rand.nextInt(10);

//       for (int i = 0; i < n ; i++){
//         int j;
//         do {
//           j = 0;
//           a[i] = 1+ rand.nextInt(10);
//             for (j = 0 ; j < i ; j++){
//               if (a[j] == a[i]) break;
//             }
//         } while(j < i);
//       }
//       for (int j = 0; j < n ; j++){
//           System.out.println("a["+j+"] = " + a[j]);
      // }
// Random rand = new Random();
//     Scanner sc = new Scanner(System.in);
//     System.out.print("요소 수:");
//     int n = sc.nextInt();
//     int[] a = new int[n];

//       for (int j = 0; j < n ; j++){
//         System.out.print("a["+j+"] = ");
//         a[j]= sc.nextInt();
//       }

//     System.out.println("요소를 섞었습니다.");

//       for (int i = 0 ; i < n ; i++) {
//         int x = rand.nextInt(n);
//         int y = rand.nextInt(n);
//         int t = a[x];
//         a[x] = a[y];
//         a[y] = t;
//       }

//       for (int j = 0; j < n ; j++){
//           System.out.println("a["+j+"] = " + a[j]);
//       }
Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] months= {
          "Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"
        };
        int re = 0;
        System.out.println("해당월의 영어 단어를 입력하시오.\n세 글자로 잛게 첫 글자는 대문자, 나머지는 소문자로 입력하세요.");
    
        do {
        int month = 1 + rand.nextInt(12);
    
        while(true){
        System.out.print(month + "월 : ");
        String s = sc.next();
        
        if (s.equals(months[month-1])) break;
        System.out.println("틀렸습니다.");
        }
          System.out.print("정답입니다.");
          System.out.print("다시 한번?1...Yes/0...No:0");
          re = sc.nextInt();
        } while (re == 1);

}
}
