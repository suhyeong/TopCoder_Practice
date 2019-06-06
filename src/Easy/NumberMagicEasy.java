package Easy;

public class NumberMagicEasy {
	public int thenumber(String answer) {
		/*
		int[] a= {1,2,3,4,5,6,7,8};
		int[] b= {1,2,3,4,9,10,11,12};
		int[] c= {1,2,5,6,9,10,13,14};
		int[] d= {1,3,5,7,9,11,13,15};
		
		for(int i=1;i<=16;i++) {
			if(Check(a, i) != answer.charAt(0))
				continue;
			if(Check(b, i) != answer.charAt(1))
				continue;
			if(Check(c, i) != answer.charAt(2))
				continue;
			if(Check(d, i) != answer.charAt(3))
				continue;
			return i;
		}
		return 0;
	}
	
	char Check(int[] x, int number) {
		for(int y : x) {
			if( y == number )
				return 'Y';
		}
		return 'N';
	}
	*/
		String[] s = {
				"YYYYYYYYNNNNNNN",
				"YYYYNNNNYYYYNNN",
				"YYNNYYNNYYNNYYN",
				"YNYNYNYNYNYNYNY"
		};
		
		for(int i=0;i<=15;i++) {
			String temp = "";
			for(int j=0;j<4;j++) {
				temp += s[j].charAt(j);
			}
			if(answer.equals(temp))
				return i+1;
		}
		
		return 0;
	}
}
