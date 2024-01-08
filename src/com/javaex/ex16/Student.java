package com.javaex.ex16;

//상속
public class Student extends Person {

	//필드
	//private String name;
	//private int age;
	private String schoolName;
	
	

	//생성자
	//자식 생성자는 부모 생성자를 불러야 함
	public Student() {
		//정의하지 않으면 public Person(){} 이 디폴트로 쓰임--> 단, 부모쪽에 있어야 함 
		System.out.println("Student()");
	} 
	
	public Student(String name, int age, String schoolName) {
		//부모의 생성자 호출 (생성자는 이름으로 부르지 않음)
		//부모쪽 생성자를 부르는 super() --> 디폴트 생성자
		//방법1: super(name, age);
		//방법2: 
			super();
			setName(name);
			setAge(age);
		//방법3:
		//super.setName(name); 
		//super.setAge(age);
		
		//본인 메모리에 올리기
		this.schoolName = schoolName;
		System.out.println("Student(2)");
		
	}
	//부모(Person)쪽 생성자를 먼저 끝내고 본인(Student)을 처리함 
	//Person() -> Student() 순으로 출력
	
	//본인의 생성자를 부를 때는 this(), this(파라미터)
	//본인의 필드, 메소드를 부를 때는 this.필드명 / this.메소드명 
	//본인 것은 private도 사용 가능 
	//부모의 생성자를 부를 때는 super(), super(파라미터)
	//부모의 필드, 메소드를 부를 때는 super.필드명 / super.메소드명
	//부모 것은 private 사용 불가능
	
	
	/*생성자 규칙(상속일 때)
	main() --> 자식의 생성자를 호출 
	일의 시작은 자식의 생성자가 시작(완료X)
	자식 생성자가 부모 생성자를 호출(부모 생성자 호출내용대로) super(), super(name, int)
	부모의 생성자가 일을 완료
	자식 생성자가 마저 일을 한다 */

	
	
	//메소드 g/s
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	//메소드 일반
	public String toString1() {
		return "학교: " + schoolName + "/ 이름: " + getName() + "/ 나이: " + getAge();
	}
	
}
