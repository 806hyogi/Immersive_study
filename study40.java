/* 컬렉션 프레임워크

List(ArrayList(가장많이씀, 한칸씩 밀림, 쓰레드 동기화o), Vector, LinkedList(하나만 빼고 연결할수있음, 쓰레드 동기화x)
 = 순서 유지하고 저장, 중복 저장가능. (데이터를 모을때)
 
Set(HashSet, TreeSet)
 = 순서 유지하지 않고 저장, 중복 저장 안됨.(중복 입력자체가 안됨) 
 
Map(HashMap(null을 혀용, 쓰레드 동기화x), Hashtable, TreeMap, Properties)
 = 키와 값으로 구성된 엔트리 저장, 키는 중복 저장 안됨. 

*/

package Test;

import java.util.*;
import static java.lang.System.out;


public class study40 {
	
	public static void main(String[] args) {
		String[] str = {"Java", "Beans", "Java", "XML"};
		
		HashSet<String> hs1 = new HashSet<String>();
		HashSet<String> hs2 = new HashSet<String>();
		
		for (String n : str) {
			if(!hs1.add(n)) // str 값이 아니면 
				hs2.add(n); // hs2에 넣어라.
		}
		out.println("hs1:" + hs1); // 중복된 값 넣지 못해서 java, beans, xml
		
		hs1.removeAll(hs2); // 2번 배열에 있는 java를 제거
		
		out.println("hs1:" + hs1); // beans, xml 출력
		out.println("hs2:" + hs2); // hs2는 자바 인덱스라서 java출력

	}

}
