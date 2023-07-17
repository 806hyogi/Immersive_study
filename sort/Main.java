package sort;

import java.util.Scanner;

public class Main {
	
	// 난수 설정
	public static void prepare(int []arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 1000);
		}
	}
	
	// 배열 print
	public void printSort(int []arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
	
		
		int[] arr = new int[1000];
		
		Scanner sc = new Scanner(System.in);
		
		boolean startEnd = true;
		while(startEnd) {
			Main s = new Main();
			
			System.out.println("1.버블정렬  2.힙정렬  3.삽입정렬  4.합병정렬  5.퀵정렬  6.선택정렬  7.셸정렬   0.종료");
			int inputData = sc.nextInt();
			
			switch(inputData) {
			
			case 1:

				prepare(arr);
				BubbleSort.bubbleSort(arr); // 합병정렬
				s.printSort(arr);
				continue;
			
			case 2:
				
				prepare(arr);
				HeapSort.heapSort(arr); // 합병정렬
				s.printSort(arr);
				continue;
				
			case 3:
				
				prepare(arr);
				InsertionSort.InsertionSort(arr); // 합병정렬
				s.printSort(arr);
				continue;
				
			case 4:
				
				prepare(arr);
				MergeSort.mergeSort(arr); // 합병정렬
				s.printSort(arr);
				continue;
				
			case 5:
				
				prepare(arr);
				QuickSort.quickSort(arr, 0, arr.length - 1); // 합병정렬
				s.printSort(arr);
				continue;
				
			case 6:
				
				prepare(arr);
				SelectionSort.selectionSort(arr); // 합병정렬
				s.printSort(arr);
				continue;
				
			case 7:
				
				prepare(arr);
				ShellSort.shellSort(arr); // 합병정렬
				s.printSort(arr);
				continue;
			
			case 0:
				System.out.println("종료되었습니다.");
				startEnd = false;
			}
		}
	}
}
