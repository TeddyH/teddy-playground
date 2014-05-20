package com.teddy.algorism.specialsort;

public class SpecialSort {
	
	private static int[] integers = {-1, 1, 3, -2, 2};
	
	public static void main(String[] args) {
//		n개의 정수를 가진 배열이 있다. 이 배열은 양의정수와 음의 정수를 모두 가지고 있다. 이제 당신은 이 배열을 좀 특별한 방법으로 정렬해야 한다.
//		정렬이 되고 난 후, 음의 정수는 앞쪽에 양의정수는 뒷쪽에 있어야 한다. 또한 양의정수와 음의정수의 순서에는 변함이 없어야 한다.
		int checkIdx = 1;
		for (int i = 0; i < integers.length; i++) {
			if (integers[i] >= 0 && integers[i] > integers[checkIdx]) {
				swapIndex(i, checkIdx);
			}
			
		}
	}
	
	private static void swapIndex(int idx1, int idx2) {
		int temp = integers[idx1];
		integers[idx1] = integers[idx2];
		integers[idx2] = temp;
	}

}
