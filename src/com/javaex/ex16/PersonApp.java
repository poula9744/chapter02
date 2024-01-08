package com.javaex.ex16;

public class PersonApp {

	public static void main(String[] args) {
		
		Person p01 = new Person("정우성", 45);
		System.out.println(p01.toString());
		p01.showInfo();
		
		Student s01 = new Student();
		s01.setName("정우성"); //부모
		s01.setAge(45); 	   //부모
		s01.setSchoolName("서울고등학교");
		System.out.println(s01.toString());
		//부모(Person)랑 똑같은 것이 있으면 본인 것(Student)만 출력
		//부모(Person)것을 못쓰게 하고 싶으면 같은 이름으로 만들면 됨
		
		//나(Student)한테 없고 부모(Person)한테 있으면 가져다 사용
		System.out.println(s01.toString1());
		//둘 다 쓰고 싶다면 이름 바꾸기
		
		Student s02 = new Student("유재석", 44, "서울고등학교");
		System.out.println(s02.toString1());
		
	}

}

//상속의 이유
//부모의 필드, 메소드 공짜로 사용
//부모와 자식의 메소드 이름이 같을 경우 자식의 메소드가 사용됨

// 굳이 같은 이름으로 만드는 이유는?
//부모의 메소드를 자식이 사용할 경우 오류가 생기는 경우 발생
//그래서 같은 이름으로 만든다. 그러면 자식의 메소드가 사용됨

