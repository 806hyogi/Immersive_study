// 종이 접기 문제

package test;

public class study06 {

	public static void main(String[] args) {
		
		int count = 0;
		int rect = 1;
		
		for(count=0; rect<=500; count++) {
			rect = rect * 2;
		}
		
		System.out.println(rect);
		System.out.println(count);
	}

}
