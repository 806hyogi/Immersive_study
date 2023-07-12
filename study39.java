package Test;

import static java.lang.System.out;


public class study39<T> {

	T[] v;
	
	public void set(T[] n) {
		v = n;
	}
	
	public void print() {
		for(T s : v)
			out.println(s);
	}
	
	public static void main(String[] args) {
		// 타입 제한이 없음.
		study39<String> t = new study39<String>();
		
		String[] ss = {"애", "아", "서"};
		t.set(ss);
		t.print(); // 애 아 서
		
		
		study39 t1 = new study39();
		
		Integer[] s = {1, 2, 3};
		t1.set(s);
		t1.print(); // 1 2 3
		
	}

}
