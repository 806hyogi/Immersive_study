// heap sort(힙 정렬) 알고리즘의 시간복잡도는 항상 o(n log n) 입니다.
// 이런 이유는 힙을 구성하는데 o(n)시간이 소요되고 힙 정렬을 수행하는데 o(n log n)이 소요되기 때문입니다.
// o(n)이 o(n log n)보다 시간복잡도가 더 빠르므로 더 복잡한 o(n log n)이 힙 정렬의 시간복잡도가 됩니다.


package sort;
 
public class HeapSort {
 
 
	public static void heapSort(int[] arr) {
		
		// 정렬 알고리즘 시작 시간 기록
		double startTime = System.nanoTime();
 
        // 힙을 구성
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            heapify(arr, arr.length, i); // 가장 큰 값이 루트에 위치
        }
 
        // 힙 정렬 수행
        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, 0, i); // 루트와 마지막 원소를 교환하고, 배열의 크기를 하나씩 줄여가며
            heapify(arr, i, 0); // 힙 구조를 조정.
        }
        
        // 정렬 알고리즘 종료 시간 기록
        double endTime = System.nanoTime();
        // 정렬 알고리즘 수행 시간 계산
        double duration = (endTime - startTime) / 1000000;

        System.out.println("Heap Sort 수행 시간: " + duration + "ns");
    }
 
    public static void heapify(int[] arr, int n, int root) {
    	
        int largest = root; // 현재 부분 힙에서 가장 큰 값을 가지는 노드 인덱스 저장
        int left = 2 * root + 1; // 왼쪽 자식 노드 인덱스
        int right = 2 * root + 2; // 오른쪽 자식 노드 인덱스
 
        // largest가 현재 노드와 다를경우 현재 노드와 largest 노드를 교환
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
 
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
 
        // 루트가 가장 큰값이 아닐경우
        if (largest != root) {
            swap(arr, root, largest);
            heapify(arr, n, largest);
        }
    }
    
    // 두 원소의 위치를 교환하는 역할
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}