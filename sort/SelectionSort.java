// 시간복잡도 O(n^2) => 이중 for문을 사용했기 때문에 order n^2이 됩니다.
// 배열의 길이를 n이라고 했을때 첫번재 for 루프는 n번 반복하고 
// 두번재 for 루프는 n-1번 반복하기 때문에 전체 루프의 실행 횟수는
// n * ( n - 1 ) /2 가 됩니다.

package sort;
 
public class SelectionSort {
	
	public static void selectionSort(int[] arr) {
 
		// 정렬 알고리즘 시작 시간 기록
		double startTime = System.nanoTime();
		
		for (int i = 0; i < arr.length; i++) { // 0부터 배열의 길이만큼 반복
 
			for (int j = i + 1; j < arr.length; j++) { // 1부터 배열의 길이만큼 반복
 
				if (arr[i] > arr[j]) { // 0 ~ 배열의 길이 > 1 ~ 배열의 길이
					
					// 현재 인덱스 i와 이후 인덱스 j에 위치한 두 원소의 값을 교환
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
 
				}
			}
		}
		// 정렬 알고리즘 종료 시간 기록
		double endTime = System.nanoTime();
				// 정렬 알고리즘 수행 시간 계산
		double duration = (endTime - startTime)/1000000;

		System.out.println("Selection Sort 수행 시간: " + duration + "ns");
	}
}