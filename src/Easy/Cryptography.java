package Easy;

import java.util.Arrays;

public class Cryptography {
	/*
	public long encrypt(int[] number) {
		long ans = 0;
		
		for(int i=0;i<number.length;i++) {
			long temp = 1;
			for(int j=0;j<number.length;j++) {
				if(i==j) {
					temp *= (number[j] + 1);
				} else
					temp *= (number[j]);
			}
			
			ans = Math.max(ans, temp);
		}
		
		return ans;
	}*/
	
	public long encrypt(int[] number) {
		long ans = 1;
		Arrays.sort(number);
		number[0]++;
		for(int i=0;i<number.length;i++) {
			ans *= number[i];
		}
		
		return ans;
	}
}
