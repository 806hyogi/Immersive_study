package CircularDoubly;

import java.util.Comparator;
import java.util.List;

public class StuScoreSorter {
	// 이름순으로 정렬
	public static void sortByName(List<Student> l) {
		sortByName(l, false); // 오름차순으로 정렬
	}

	public static void sortByName(List<Student> l, boolean reverse) {
		l.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if (reverse == true) { // 내림차순 정렬
					return o2.getName().compareTo(o1.getName()); // 두 학생을 비교
				}
				return o1.getName().compareTo(o2.getName()); // 두 학생을 비교
			}
		});
	}

	// 점수순으로 정렬
	public static void sortByScore(List<Student> l, int subIndex) {
		sortByScore(l, subIndex, false); // 오름차순 정렬
	}

	public static void sortByScore(List<Student> l, int subIndex, boolean reverse) {
		l.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if (reverse == true) { // 내림차순 정렬
					if (subIndex == 3) {
						return (int) (o2.getAvg() * 100) - (int) (o1.getAvg() * 100); // 평균
					} else if (subIndex == 4) {
						return o2.getSum() - o1.getSum(); // 총점
					}

					return o2.getScoreByIndex(subIndex) - o1.getScoreByIndex(subIndex);
				}

				if (subIndex == 3) {
					return (int) (o1.getAvg() * 100) - (int) (o2.getAvg() * 100); // 평균
				} else if (subIndex == 4) {
					return o1.getSum() - o2.getSum(); // 총점
				}
				return o1.getScoreByIndex(subIndex) - o2.getScoreByIndex(subIndex);
			}
		});
	}
}
