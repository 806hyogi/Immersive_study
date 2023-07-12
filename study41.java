/*
 * MapEX1
 * 
 */

package Test;

import java.util.*;
import static java.lang.System.out;

public class study41 {
	
	public static void main(String[] args) {
		
		String[] msg = {"Berlin", "Dortmund", "Frankfurt", "Gelsenkirchen", "Hamburg"};
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		for(int i = 0; i < msg.length; i++) // msg의 길이만큼 반복
			map.put(i, msg[i]); // (0, msg[0] ~ 4, msg[4]를 map에 넣음)
		
		Set<Integer> keys = map.keySet(); // map의 key를 담은 객체 keys를 생성 (set은 중복x)후 keys에 저장
			for(Integer n : keys) // keys의 요소(int)를 순회후 int n에 저장.
				out.println(map.get(n)); // 가져온 값을 출력.
			
			/*
				Berlin
				Dortmund
				Frankfurt
				Gelsenkirchen
				Hamburg
			*/
	}

}
