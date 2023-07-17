/*
 * QuickSort 알고리즘
 * 최악의 경우 o(n^2) 인데 이는 피벗 기준으로 배열을 분할하고 정복하는 방법을 사용하기 때문에 발생합니다.
 * 또한 피벗을 선정하기 어려운 상황에서도 최악의 시간복잡도를 보여줍니다.
 * 
 * 만일 균등하게 나누어지면 평균적으로 o(n log n)의 성능이 발생합니다.
 * 
 */
package sort;
 
public class QuickSort {
	
	// 오름차순으로 정렬
    public static void quickSort(int[] arr, int low, int high) {
    	
    	// 정렬 알고리즘 시작 시간 기록
    	double startTime = System.nanoTime();
        
    	// low는 하한 인덱스, high는 상한 인덱스
        if (low < high) {
        	
            int pivotIndex = partition(arr, low, high);
            
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
        
        // 정렬 알고리즘 종료 시간 기록
        double endTime = System.nanoTime();
        // 정렬 알고리즘 수행 시간 계산
        double duration = (endTime - startTime)/1000000;

        System.out.println("Quick Sort 수행 시간: " + duration + "ns");
    }
 
    // 피벗 인덱스를 구하는 역할을 합니다.
    public static int partition(int[] arr, int low, int high) {
        
    	// high 인덱스에 해당하는 값을 피벗으로 선택합니다.
    	int pivot = arr[high];
        
    	// 피벗보다 작은 값을 가진 원소들의 끝 인덱스를 나타냅니다.
    	int i = low - 1;
 
    	// low부터 high 까지 반복하면서 각 원소의 피벗과 비교
        for (int j = low; j < high; j++) {
       
        	if (arr[j] < pivot) { // 피벗보다 작으면 i를 증가
                i++;
                swap(arr, i, j); // 해당 원소를 교환
            }
        }
 
        swap(arr, i + 1, high); // i + 1위치에 피벗을 배치
        
        return i + 1; // 해당 인덱스를 반환
    }
 
    // 위치를 바꾸는 함수
    public static void swap(int[] arr, int i, int j) {
        
    	int temp = arr[i];
        
        arr[i] = arr[j];
        
        arr[j] = temp;
    }
}