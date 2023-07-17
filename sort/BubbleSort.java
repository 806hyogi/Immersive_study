/*
 * 버블 정렬의 시간복잡도는 o(n^2) 입니다.
 * 배열의 길이를 n이라고 했을대 두개의 중첩된 for문을 사용했기 때문에 o(n^2)이 되어쓰며
 * 첫번째 for 루프는 n-1번 반복하고 두번째 for 루프는 최대 n-1번 반복하기 대문에
 * 전체 루프의 실행 횟수는 대락 (n-1) * (n-1)이 됩니다.
 * 
 */

package sort;
 
public class BubbleSort {
 
	public static void bubbleSort(int[] arr) {
 
		// 정렬 알고리즘 시작 시간 기록
		double startTime = System.nanoTime();
		
		for (int i = 0; i < arr.length - 1; i++) { // 0~배열의 인덱스 -1 만큼 반복
 
			for (int j = 0; j < arr.length - 1; j++) { // 0~배열의 인덱스 -1 만큼 반복 
 
				if (arr[j] > arr[j + 1]) { // 인덱스[0] > 인덱스 [1] (왼쪽과 오른쪽 인덱스를 비교)
 
					// 인덱스 J와 인덱스 J+1의 원소의 값을 교환
					int temp = arr[j];
 
					arr[j] = arr[j + 1];
 
					arr[j + 1] = temp;
				}
			}
		}
		
		// 정렬 알고리즘 종료 시간 기록
		double endTime = System.nanoTime();
		// 정렬 알고리즘 수행 시간 계산
		double duration = (endTime - startTime) / 1000000;

		System.out.println("Bubble Sort 수행 시간: " + duration + "ns");
	}
}