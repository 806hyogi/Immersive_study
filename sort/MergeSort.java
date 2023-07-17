// 병합정렬의 시간복잡도는 항상 o(n log n) 입니다.
// 이는 배열을 반으로 조갠 후, 재귀적으로 정렬하고 다시 병합하는 방식으로 진행되기 때문입니다.

package sort;
 
public class MergeSort {
 
	public static void mergeSort(int[] arr) {
		
		// 정렬 알고리즘 시작 시간 기록
		double startTime = System.nanoTime();
        
		if (arr.length <= 1) { // 배열길이가 1보다 작거나 같으면 반환 (더이상 쪼개지지 않을때까지 않을때까지)
            return; // 종료
        }
 
        int mid = arr.length / 2; // 배열을 중간위치를 기준으로 
        int[] left = new int[mid]; // 왼쪽으로 나눈다.
        int[] right = new int[arr.length - mid]; // 오른쪽으로 나눈다.
 
        System.arraycopy(arr, 0, left, 0, mid); // mid를 기준으로 왼쪽 배열을 복사
        System.arraycopy(arr, mid, right, 0, arr.length - mid); // mid를 기준으로 오른쪽 배열을 복사
 
        mergeSort(left); // 왼쪽 정렬
        mergeSort(right); // 오른쪽 정렬
 
        merge(arr, left, right); // 정렬된 배열의 왼쪽과 오른쪽을 merge를 통해 병합
        
        // 정렬 알고리즘 종료 시간 기록
        double endTime = System.nanoTime();
        // 정렬 알고리즘 수행 시간 계산
        double duration = (endTime - startTime)/1000000;

        System.out.println("Merge Sort 수행 시간: " + duration + "ms");
	}
	
	// 정렬된 왼쪽 부분과 오른쪽 부분을 병합하여 하나의 배열로 합치는 메소드
	private static void merge(int[] arr, int[] left, int[] right) {
		
        int i = 0, j = 0, k = 0;
 
        // 왼쪽과 오른쪽 배열 길이가 0보다는 클때 반복
        while (i < left.length && j < right.length) {
        	
        	// 왼쪽이 오른쪽보다 작거나 같음
            if (left[i] <= right[j]) {
            	// 왼쪽 배열에 삽입
                arr[k++] = left[i++];
            } else {
            	// 오른쪽 배열에 삽입
                arr[k++] = right[j++];
            }
        }
        
        // 왼쪽 길이
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        // 오른쪽 길이 반복
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}