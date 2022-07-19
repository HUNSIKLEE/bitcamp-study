package com.eomcs.oop.ex02;

//여러 메서드에서 공유하려면 클래스 멤버로만들어야 한다.
// 특히 static 멤버 끼리 공유하려면 같은 스태틱 멤버로 만들어야 한다.
//날개 변수 사용
//성적 데이터를 저장할 사용자 정의 데이터타입을 만든다.
//리팩토링:메서드 추출(extract method), static nested class
//리팩토링:메서드 추출(extract method) = 한 개의 메서드는 한 개의 기능을 수행해야 한다.
//리팩토링은 성능을 높이는게 아니다.
// GRASP(General Responsibility Assignment Software Patterns) 패턴: Information Expert
//  => Information Expert: 데이터를 다룰 떄는 그 데이터를 갖고 있는 객체에게 묻는다.
// 리팩토링:메서드 이동(move method)
// => 메서드를 관련된 클래스로 이동시킨다 => 코드의 이해가 쉽다.
// 인스턴스 메서드: 인스턴스 주소를 받는 더 쉬운 문법
// 패키지 멤버 클래스: 여러 곳에서 사용할 클래스라면 다른 클래스 안에 두지 말고 
// 패키지의 멤버 클래스로 둬라.
// # 사용자 정의 데이터 타입
// 
public class Exam0160 {

  public static void main(String[] args) {

    Score s1 = new Score();

    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 85;
    printScore(s1);
    Score.compute(s1);
    Score s2 = new Score();

    s2.name = "임꺽정";
    s2.kor = 90;
    s2.eng = 80;
    s2.math = 75;
    Score.compute(s2);
    printScore(s2);

    Score s3 = new Score();
    s3.name = "유관순";
    s3.kor = 80;
    s3.eng = 70;
    s3.math = 65;
    Score.compute(s3);
    printScore(s3);


  }

  static void printScore(Score s) {


    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.math, s.sum, s.aver);

  }


}



