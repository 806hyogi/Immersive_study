// 삽입 정렬의 시간복잡도는 최선의 경우 o(n)이며 평균 및 최악의 경우에는 o(n^2) 입니다.
// 이 같은 이유는 배열이 이미 정렬되어 있는 경우 최선의 경우가 되고
// 역순으로 정렬되어있으면 평균 및 최악의 경우가 됩니다.


// 삽입 정렬은 순차적으로 배열에 우측으로 가면서 작은값이 있으면 올바른 위치의 왼쪽으로 삽입합니다.
// 값이 왼쪽으로 끼어들게 되면 큰수들은 오른쪽으로 밀리게 됩니다.
 
package sort;
 
public class InsertionSort {
	
	// 삽입 정렬을 진행하는 InsertionSort 메소드를 만들었습니다.
	public static void InsertionSort(int[] arr) {
	
		// 정렬 알고리즘 시작 시간 기록
		double startTime = System.nanoTime();
        
        
		for(int i = 1; i < arr.length; i++) { // (배열의 순회를 위해) 1부터 배열의 길이까지 반복합니다.
			
			int key = arr[i]; // 순회중인 배열의 전체를 key 에 넣습니다. (삽입할 원소를 임시로 저장합니다.)
			
			int j = i - 1; // 왼쪽에 있는 원소들과 비교하며 위치를 찾기위한 변수 j 입니다.
			
			// (작은값이 큰값보다 왼쪽에 있어야 하기때문에 )key값을 올바른 위치로 이동시킵니다.
			while(j >= 0 && arr[j] > key) {
				
				arr[j + 1] = arr[j]; // 배열j에 +1을 함으로써 배열j가 우측으로 밀립니다.
				
				j--;
			}
			arr[j + 1] = key; // key값이 올바른 위치로 할당.
			
		}
		// 정렬 알고리즘 종료 시간 기록
        double endTime = System.nanoTime();
        // 정렬 알고리즘 수행 시간 계산
        double duration = (endTime - startTime)/ 1000000;

        System.out.println("Insertion Sort 수행 시간: " + duration + "ns");
	
	}
}