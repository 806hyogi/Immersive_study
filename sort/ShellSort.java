// 셸 정렬의 시간복잡도는 최선, 평균, 최악의 경우 모두 o(n log n) 입니다.
// 삽입 정렬의 단점을 보완하여 더 빠르게 동작하는 장점이 있기 때문에 평균적으로 좋은 성능을 보입니다.

package sort;
 
 
public class ShellSort {
	
	
	// 배열을 오름차순으로 정리하는 shellsort 메서드를 만들었습니다.
    public static void shellSort(int[] arr) {
    	
    	// 정렬 알고리즘 시작 시간 기록
    	double startTime = System.nanoTime();
    	
    	// 배열의 길이를 변수 n에 저장합니다.
        int n = arr.length;
        
        int gap = n / 2; // 배열을 부분리스트 간의 거리를 나타내는 간격인 gap 변수를 선언합니다.
 
        while (gap > 0) { // gap이 0 이하가 될때까지 과정을 반복합니다.
        	
        	// for 반복문을 통해 각 부분 리스트에 삽입 정렬을 수행합니다.
        	// i는 부분리스트의 시작위치부터 배열의 길이까지 반복합니다.
            for (int i = gap; i < n; i++) { 
            	
            	// 부분 리스트의 요소와 이전 부분리스트의 요소를 비교하여 정렬을 진행합니다.
                int temp = arr[i]; // temp는 현재 부분 리스트 요소를 임시로 저장
                int j = i;  // j는 현재 요소의 인덱스를 나타냅니다.
 
                // 현재 요소와 이전 부분 리스트의 요소를 비교하여 while 반복문을 통해 삽입 정렬을 합니다.
                // 이전 부분리스트의 요소가 현재 요소보다 크면 오른쪽으로 이동시키며 정렬을 진행합니다.
                while (j >= gap && arr[j - gap] > temp) {
                	
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                
                arr[j] = temp; // j위치에 temp를 삽입하여 정렬을 완료합니다.
            }
            // gap을 줄이며 위 과정을 반복합니다.
            gap /= 2;
        }
        
        // 정렬 알고리즘 종료 시간 기록
        double endTime = System.nanoTime();
        // 정렬 알고리즘 수행 시간 계산
        double duration = (endTime - startTime)/1000000;

        System.out.println("Shell Sort 수행 시간: " + duration + "ns");
    }
 
}
// 셸 정렬은 삽입 정렬과 비교하여 평균적으로 좋은 성능을 보이며 빠르게 동작하는 장점이 있습니다.