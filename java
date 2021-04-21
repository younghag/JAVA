class Main {
  public static void main(String[] args) {
//  int menu = 0, num = 0;
//  Scanner scanner = new Scanner(System.in);
//  outer:
//  while(true){
//    System.out.println("(1) square");
//    System.out.println("(2) square root");
//    System.out.println("(3) log");
//    System.out.println("원하는 메뉴 (1~3)를 선택하세요.(종료:0)>");
   
//    String tmp = scanner.nextLine();
//    menu = Integer.parseInt(tmp);
//    if(menu==0){
//      System.out.println("프로그램을 종료합니다.");
//      break;
//    } else if (!(1<=menu && menu <= 3)) {
//      System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
//      continue;
//    }
//  for(;;){
//     }
// int[] iArr1 = new int[10];
// int[] iArr2 = new int[10];
// int[] iArr3 = new int[] {100,95,80,70,60};
// int[] iArr3 = {100,95,80,70,60};
// char[] chArr= {'a','b','c','d'};
// for (int i=0; i<iArrl.length ; i++ ){
//   iArr1[i]= i+1;
// }
// for (int i=0; i< iArr2.length ; i++){
//   iArr2[i] = (int)(Math.random()*10) + 1;
// }
// for(int i=0; i< iArr1.length;i++){
//   System.out.print(iArr1[i]+",");
// }
  // int[] arr = new int[5];
  // for(int i=0; i < arr.length;i++)
  //   arr[i] = i + 1;
  //   for(int i=0; i< arr.length;i++)
  //     arr[i] = i + 1;
  //   System.out.println("[변경전]");
  //   System.out.println("arr.length:"+arr.length);
  //   for(int i=0; i < arr.length; i++)
  //     System.out.println("arr["+i+"]:"+arr[i]);

  //   int[] tmp = new int[arr.length*2];

  //   for(int i=0; i< arr.length;i++)
  //   tmp[i] = arr[i];
  // arr = tmp;
  // System.out.println("[변경후]");
  // System.out.println("arr.length:"+arr.length);
  // for(int i=0; i<arr.length;i++)
  //   System.out.println("arr["+i+"]:"+arr[i]);
  // char[] abc = {'A','B','C','D'};
  // char[] num = {'0','1','2','3','4','5','6','7','8','9'};
  // System.out.println(abc);
  // System.out.println(num);
  // char[] result = new char[abc.length+num.length];
  // System.arraycopy(abc, 0, result, 0, abc.length);
  // System.arraycopy(num, 0, result, abc.length, num.length);
  // System.out.println(result);
  // System.arraycopy(abc, 0, num, 0, abc.length);
  // System.out.println(result);
  // System.arraycopy(abc, 0, num, 0, abc.length);
  // System.out.println(num);
  // System.arraycopy(abc, 0, num, 6, 3);
  // System.out.println(num);
//   String source = "SOSHELP";
//   String[] morse = {".-","-...","-.-","-..",".","..-.","--.","....","..-","...-",".--","-..-","-.--","--.."};
//   String result="";
//   for(int i=0; i < source.length(); i++){
//     result +=morse[source.charAt(i)-'A'];
//   }
// System.out.println("source:"+ source);
// System.out.println("morse:"+result);
// TV[] tvArr = new Tv[3];

// for(int i=0; i < tvArr.length;i++){
//   tvArr[i] = new Tv();
//   tvArr[i].channel = i+10;
//   System.out.printf("tvArr[%d].channel=%d%n",i,)
System.out.println("Card.width = " + Card.width);
System.out.println("Card.height ="+ Card.height);
Card c1 = new Card();
c1.kind = "Heart";
c1.number = 7;

Card c2 = new Card();
c2.kind = "Spade";
c2.number = 4;
System.out.println("c1은 "+ c1.kind + ", "+ c1.number+"이며, 크기는 ("+c1.width + ", "+c1.height+")");
System.out.println("c2은 "+ c2.kind + ", "+ c2.number+"이며, 크기는 ("+c2.width + ", "+c2.height+")");
c1.width = 50;
c1.height = 80;

System.out.println("c1은 "+c1.kind+", "+c1.number + "이며, 크기는 ("+c1.width + ", "+c1.height + ")");
System.out.println("c2은 "+c2.kind+", "+c2.number + "이며, 크기는 ("+c2.width + ", "+c2.height + ")");
}
}
class Card {
  String kind ;
  int number;
  static int width = 100;
  static int height = 250;
}
