import java.util.Scanner;

public class Baekjoon_1-3
{

  public static void main(String[] args) {
    // 참조 : https://www.acmicpc.net/problem/1001
    // 문제 : 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.

    Scanner sc = new Scanner(System.in);
    int A = 0;
    int B = 0;
    A = sc.nextInt();
    B = sc.nextInt();
    System.out.println(A - B);
    // return 0;
  }
}
