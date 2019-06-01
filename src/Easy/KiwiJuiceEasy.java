package Easy;

public class KiwiJuiceEasy {
	public static void main(String args[]) {
		
	}
	
	public int[] pouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) {
		for(int i=0;i<fromId.length;i++) {
			int f = fromId[i];
			int t = toId[i];
			int space = capacities[t] - bottles[t]; //담을 수 있는 병의 공간
			
			if(space >= bottles[f]) {
				int sum = bottles[f];
				bottles[t] += sum;
				bottles[f] = 0;
			} else {
				int sum = space;
				bottles[t] += sum;
				bottles[f] -= sum;
			}
		}
		
		return bottles;
	}
}
