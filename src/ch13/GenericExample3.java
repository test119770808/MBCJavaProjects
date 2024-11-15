package ch13;

public class GenericExample3 {
	
	// 제너릭 메서드
	//  타입 파라미터를 가지고 있는 메서드. 타입 파라미터가 메서드 선언부에서 정의됨. 
	//  메서드 선언부에서 타입 앞에 <>기호 추가하고, 타입 파라미터 정의 후 
	//  리턴 타입과 매개변수 타입에서 사용하게 됨
	
	// 제너릭 메서드
	public static <T> Box2<T> boxing(T t){   // Box2객체를 반환(t필드 값을 넣어서)
		Box2<T> box = new Box2<T>();
		box.set(t);
		return box;
	}
	
	// 제너릭 메서드2
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
	
	public static void main(String[] args) {
		// 제너릭 메서드 호출
		Box2<Integer> box1 = boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
		// 제너릭 메서드 호출
		Box2<String> box2 = boxing("홍길동");
		String strValue = box2.get();
		System.out.println(strValue);
		
		//------------------------------------------------------
		Pair<Integer, String> p1 = new Pair<>(1, "사과");
		Pair<Integer, String> p2 = new Pair<>(1, "사과");
//		System.out.println(p1 == p2);
//		System.out.println(p1.equals(p2));
		
		// 제너릭 메서드 호출
		boolean result1 = compare(p1, p2);
		System.out.println(result1);
		
		Pair<String, String> p3 = new Pair<>("user1", "홍길동");
		Pair<String, String> p4 = new Pair<>("user2","홍길동");
		boolean result2 = compare(p3, p4);
		System.out.println(result2);

	}

}

class Box2<T> {
	// 필드
	private T t;
	
	// Getter
	public T get() {
		return t;
	}
	
	// Setter
	public void set(T t) {
		this.t = t;
	}
}

class Pair<K, V> {
	//필드
	private K key;
	private V value;
	
	// 생성자 -> 기본생성자X
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	// 메서드
	public K getKey() {return key;}
	public V getValue() {return value;}
	public void setKey(K key) {this.key = key;}
	public void setValue(V value) {this.value = value;}
	
	
}






