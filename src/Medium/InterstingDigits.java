package Medium;

import java.util.*;

public class InterstingDigits {
	public static int[] digits(int base) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for(int i=2;i<base;i++) {
			boolean ok = true;
			for(int k1=0;k1<base;k1++) {
				for(int k2=0;k2<base;k2++) {
					for(int k3=0;k3<base;k3++) {
						if((k1+k2*base+k3*base*base) % i != 0) {
							ok = false;
							break;
						}
					}
					if( !ok )
						break;
				}
				if( !ok )
					break;
			}
			if( ok )
				ans.add(i);
		}
		
		int[] result = new int [ans.size()];
		for(int j=0;j<ans.size();j++) {
			result[j] = ans.get(j);
		}
		
		return result;
	}
}
