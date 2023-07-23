package Doubly;

import java.util.HashMap;
import java.util.Map;

public class Subjects {
	// 과목의 인덱스를 정수로, 해당 과목의 이름을 문자열로 관리
	private static final Map<Integer, String> name;
	
	// 초기화 블록
	static {
		name = new HashMap<>();
		name.put(0, "국어");
		name.put(1, "영어");
		name.put(2, "수학");
	}
	
	// index를 인자로 받아와서 name에 해당하는 인덱스 과목이름을 가져와 반환
	public static String getName(int index) {
		return name.get(index);
	}
}

// 과목 인덱스에 따라 과목 이름을 간편하게 조회가능. 예를 들어, Subjects.getName(0)을 호출하면 "국어"를 반환
