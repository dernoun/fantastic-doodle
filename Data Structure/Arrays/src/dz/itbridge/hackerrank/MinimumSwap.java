package dz.itbridge.hackerrank;

public class MinimumSwap {

	static int minimumSwaps(int[] arr) {
		int count = 0;
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			num++;
			if (arr[i] == i+1)
				continue;
			int tmp = arr[i];
			arr[i] = arr[tmp-1];
			arr[tmp-1] = tmp;
			count++;
			i--;
		}
		System.out.println("The time complexity: "+num);
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,1,5};
		System.out.println(minimumSwaps(arr));
	}

}
