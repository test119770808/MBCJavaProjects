package ch15;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	
	/*
	 *  TreeSet (이진 검색 트리를 구현한 컬렉션)
	 *   - 순서가 있기 때문에 정렬이 가능한 Set
	 *   - 정렬 방법을 프로그래머가 Comparator 인터페이스를 이용하여 직접 지정이 가능
	 *   - 검색과 정렬에 뛰어난 성능을 가지고 있음. 
	 *   - 검색을 빠르게 하기 위해서 미리 정렬해서 저장하기 때문에 저장 속도는 약간 느림.
	 *   
	 *  이진 검색 트리란? 
	 *   - 모든 노드는 최대 두개의 자식 노드를 가질 수 있다. 
	 *   - 왼쪽 자식 노드의 값은 부모 노드의 값보다 작다
	 *   - 오른쪽 자식 노드의 값은 부모 노드의 값보다 크다
	 *   - 노드의 추가/삭제가 오래 걸린다. 
	 *   - 검색과 정렬은 빠르다.
	 */
	
	public static void main(String[] args) {
		// TreeSet 객체 생성
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(9);
		tree.add(3);
		tree.add(17);
		tree.add(15);
		tree.add(21);
		tree.add(10);
		tree.add(1);
		tree.add(7);
		System.out.println(tree);

		// headSet(n) : n보다 머리쪽(왼쪽)에 있는 요소를 Set으로 반환(n 미포함)
		System.out.println(tree.headSet(9));
		
		// tailSet(n) : n부터 꼬리쪽(오른쪽)에 있는 요소를 Set으로 반환(n 포함)
		System.out.println(tree.tailSet(9));
		
		// subSet(start, end) : start이상, end 미만의 요소를 Set으로 반환
		System.out.println(tree.subSet(1, 15));
		
		// first() 
		System.out.println("first() : "+tree.first());
		// last()
		System.out.println("last() : "+tree.last());
		// lower()
		System.out.println("lower(10) : "+tree.lower(10));
		// higher()
		System.out.println("higher(10) : "+tree.higher(10));
		
		// floor(12) : 12이거나 바로 아래 점수 
		System.out.println("floor(12) : "+tree.floor(12));
		// ceiling(12) : 12이거나 바로 위에 점수
		System.out.println("ceiling(12) : "+ tree.ceiling(12));
		
		// 내림차순 정렬
		NavigableSet<Integer> descendingSet = tree.descendingSet();
		System.out.println(descendingSet);
		
		// subSet() 범위 검색 : 반환 타입이 NavigableSet<>
		// true는 포함관계를 false는 미포함 관계를  
		descendingSet = tree.subSet(5, true, 17, false);  // 5 <= X < 17
		for (Integer i : descendingSet) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// pollFirst : 첫번째 요소를 반환하면서 지움
		System.out.println(tree.pollFirst());  // 1반환 [3, 7, 9, 10, 15, 17, 21]
		System.out.println(tree.pollFirst());  // 3반환 [7, 9, 10, 15, 17, 21]
		System.out.println(tree.pollFirst());  // 7반환 [9, 10, 15, 17, 21]
		System.out.println(tree);
		
		// pollLast : 마지막 요소를 반환하면서 지움
		System.out.println(tree.pollLast());   // 21반환 [9, 10, 15, 17] 
		System.out.println(tree);
		
	}

}






