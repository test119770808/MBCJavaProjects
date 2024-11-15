package ch13;

public class GenericExample1 {

	public static void main(String[] args) {
		// 타입을 지정하는 <T> , T
		// Box<String> box1 = new Box<String>();
		Box<String> box1 = new Box<>();
		box1.content = "안녕!!!";
		String str = box1.content;
		System.out.println(str);
		
		// Box<Integer> box2 = new Box<Integer>();
		Box<Integer> box2 = new Box<>();
		box2.content = 100;
		int value = box2.content;
		System.out.println(value);

		// generic 지정 하지 않으면 타입은 Object로 지정(암묵적으로)
		Box box3 = new Box();
		box3.content = "안녕한가요?";
		String hi = (String)box3.content;
		box3.content = 100;
		int value2 = (Integer)box3.content;
		System.out.println(hi);
		System.out.println(value2);
	}

}

class Box<T> {
	public T content;
}
