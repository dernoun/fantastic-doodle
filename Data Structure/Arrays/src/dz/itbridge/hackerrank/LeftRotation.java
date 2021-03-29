package dz.itbridge.hackerrank;

public class LeftRotation {
	
	static int[] rotLeft(int[] a, int d) {
        int[] arr = new int[a.length];
        int mod = d % a.length;
        for (int i = 0; i < a.length; i++) {
			arr[i] = a[(i+mod)%5];
		}
        return arr;
    }

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		int[] arrRotate = rotLeft(arr, 4);
		for (int i : arrRotate) {
			System.out.println(i);
		}

	}

}
