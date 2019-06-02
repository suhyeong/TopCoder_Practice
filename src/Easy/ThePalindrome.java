package Easy;

public class ThePalindrome {
	public int find(String s) {
		int strlen = s.length();
		for(int i=strlen; ;i++) {
			boolean flag = true;
			for(int j=0;j<strlen;j++) {
				if((i-j-1) < strlen && s.charAt(j) != s.charAt(i-j-1)) {
					flag = false;
					break;
				}
			}
			if (flag)
				return i;
		}
	}
}
