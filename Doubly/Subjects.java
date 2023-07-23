package Doubly;

import java.util.HashMap;
import java.util.Map;

public class Subjects {
	// ������ �ε����� ������, �ش� ������ �̸��� ���ڿ��� ����
	private static final Map<Integer, String> name;
	
	// �ʱ�ȭ ���
	static {
		name = new HashMap<>();
		name.put(0, "����");
		name.put(1, "����");
		name.put(2, "����");
	}
	
	// index�� ���ڷ� �޾ƿͼ� name�� �ش��ϴ� �ε��� �����̸��� ������ ��ȯ
	public static String getName(int index) {
		return name.get(index);
	}
}

// ���� �ε����� ���� ���� �̸��� �����ϰ� ��ȸ����. ���� ���, Subjects.getName(0)�� ȣ���ϸ� "����"�� ��ȯ
