package com.eomcs.quiz.ex01;

// [문제] 
// 패리티(parity)를 구하라!
// - 1의 개수가 홀수 개이면 1
// - 1의 개수가 짝수 개이면 0
// [훈련 목표]
// - 비교 연산자 및 비트 연산자 활용
// - 반복문 활용
// - 메서드 파라미터 및 리턴 값 다루기
//optimizing ( 최적화)
public class Test002 {

  public static void main(String[] args) {
    int p = parity(0b01100011);
    System.out.println(p == 0); // true

    p = parity(0b01010111_01100011);
    System.out.println(p == 1); // true
  }

  static int parity(int value) {
    int r = 0;
    while (value != 0) {
      // r = r ^ (value & 1);  // ^연산자는 같으면 0 다르면 1
      r ^= 1; 
      value &= (value -1); 

      // r ^= 1;
      // value &= (value -1);  // 하나 작은거 —> ex) 0b100 -> 0b011
    }
    return r;
  }

}
