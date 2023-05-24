import java.util.Scanner;

public class Baekjoon_1_6
{

  public static void main(String[] args) {
    // 참조 : https://www.acmicpc.net/problem/10869
    // 문제 : 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 

    Scanner sc = new Scanner(System.in);
    int A = 0;
    int B = 0;
    A = sc.nextInt();
    B = sc.nextInt();
    System.out.println(A+B);
    System.out.println(A-B);
    System.out.println(A*B);
    System.out.println(A/B);
    System.out.println(A%B);
    // return 0;
  }
}
