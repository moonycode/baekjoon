import java.util.Scanner;

public class Baekjoon_1_8 {
  public static void main(String[] args) {
// 참조 : https://www.acmicpc.net/problem/10430
// 문제 : 
// (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
// (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
// 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.

    Scanner sc = new Scanner(System.in);
    int first = 0;
    int second = 0;
    int third = 0;

    first = sc.nextInt();
    second = sc.nextInt();
    third = sc.nextInt();

    System.out.println((first+second) % third);
    System.out.println(((first%third) + (second%third)) % third);
    System.out.println((first*second)%third);
    System.out.println(((first%third) * (second%third))%third);

    // return 0;
  }
}
