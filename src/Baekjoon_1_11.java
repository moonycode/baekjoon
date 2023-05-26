// 참조 : https://www.acmicpc.net/problem/11382
// 문제 : 
// 꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!

import java.util.Scanner;

public class Baekjoon_1_11 {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int first;
  int second;
  int third;
  
  first=sc.nextInt();
  second=sc.nextInt();
  third=sc.nextInt();

  System.out.println(first+second+third);
  //return 0;
}
}