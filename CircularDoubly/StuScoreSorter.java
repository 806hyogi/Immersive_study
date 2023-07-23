package CircularDoubly;

import java.util.Comparator;
import java.util.List;

public class StuScoreSorter {
	// �̸������� ����
	public static void sortByName(List<Student> l) {
		sortByName(l, false); // ������������ ����
	}

	public static void sortByName(List<Student> l, boolean reverse) {
		l.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if (reverse == true) { // �������� ����
					return o2.getName().compareTo(o1.getName()); // �� �л��� ��
				}
				return o1.getName().compareTo(o2.getName()); // �� �л��� ��
			}
		});
	}

	// ���������� ����
	public static void sortByScore(List<Student> l, int subIndex) {
		sortByScore(l, subIndex, false); // �������� ����
	}

	public static void sortByScore(List<Student> l, int subIndex, boolean reverse) {
		l.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if (reverse == true) { // �������� ����
					if (subIndex == 3) {
						return (int) (o2.getAvg() * 100) - (int) (o1.getAvg() * 100); // ���
					} else if (subIndex == 4) {
						return o2.getSum() - o1.getSum(); // ����
					}

					return o2.getScoreByIndex(subIndex) - o1.getScoreByIndex(subIndex);
				}

				if (subIndex == 3) {
					return (int) (o1.getAvg() * 100) - (int) (o2.getAvg() * 100); // ���
				} else if (subIndex == 4) {
					return o1.getSum() - o2.getSum(); // ����
				}
				return o1.getScoreByIndex(subIndex) - o2.getScoreByIndex(subIndex);
			}
		});
	}
}
