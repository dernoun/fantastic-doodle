package dz.itbridge.codility;

public class FindPhoneTwoArray {

	public static void main(String[] args) {
		String[] A = null;
		String[] B = null;
		System.out.println(solutionString(A, B, ""));
	}

	private static String solutionString(String[] A, String[] B, String P) {
		if (P == "" || P == null || A == null || A.length == 0 || B == null || B.length == 0) {
			return "NO CONTACT";
		}
		String name = "";
		for (int i=0; i<B.length; i++){
			if (B[i].length() >= P.length() && B[i].contains(P)) {
				if (name == "")
					name = A[i];
				else
					name = name.length() > A[i].length() ? A[i] : name;
			}
			if (name.length() == 1)
				break;
		}
		return name == "" ? "NO CONTACT" : name;
	}

}
