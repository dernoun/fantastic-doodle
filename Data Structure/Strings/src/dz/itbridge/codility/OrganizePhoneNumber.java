package dz.itbridge.codility;

public class OrganizePhoneNumber {
	
	public static String reformatNumber(String S) {
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (Character.isDigit(S.charAt(i))) {
                tmp.append(S.charAt(i));
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tmp.length(); i++) {
            sb.append(tmp.charAt(i));
            if (i % 3 == 2) {
                sb.append('-');
            }
        }
        
        if (sb.length() >= 1 && sb.charAt(sb.length() - 1) == '-') {
            sb.setLength(sb.length() - 1);
        } else if (sb.length() >= 2 && sb.charAt(sb.length() - 2) == '-') {
            sb.setCharAt(sb.length() - 2, sb.charAt(sb.length() - 3));
            sb.setCharAt(sb.length() - 3, '-');
        }
        
        return sb.toString();
    }

	public static void main(String[] args) {
		System.out.println(reformatNumber("111"));
	}

}
