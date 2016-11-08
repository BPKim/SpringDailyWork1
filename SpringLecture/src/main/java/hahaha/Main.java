package hahaha;

public class Main {

	public static void main(String[] args) {
		// is-a 관계 
		// 정의 : subclass is a superclass ( O )
		// 역관계는 성립하지 않아요.. superclass is a subclass
		// 포유류 - 고래 
		// subclass의 type을 써야 하는 곳에 superclass의 type을 쓸 수 있어요! 
		
		Student a = new Student();
		Person b = new Student();
		Object c = new Student(); 
		// superclass로 가능 
	}

}
