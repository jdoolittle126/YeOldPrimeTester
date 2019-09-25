import java.util.ArrayList;

public class PrimeTester {

	
	public static void main(String[] args) {
		cleanPrimes();
	}
	
	public static ArrayList<Integer> getPotentialPrimes(int sets) {
		//45 Numbers per set
		ArrayList<Integer> potenPrime = new ArrayList<Integer>();
		int[] primeMakers = { 2, 4, 2, 4, 6, 2, 6, 4, 2, 4, 6, 6, 2, 6, 4, 2, 6, 4, 6, 8, 4, 2};
		int primeCenter = 4;
		int prime = 11;
		potenPrime.add(2);
		potenPrime.add(3);
		potenPrime.add(5);
		potenPrime.add(7);
		
		while (sets > 0) {
			for (int up = 0; up < 22; up++) {
				potenPrime.add(prime);
				prime += primeMakers[up];
			}
			prime += primeCenter;
			for (int down = 21; down >= 0; down--) {
				potenPrime.add(prime);
				prime += primeMakers[down];
			}
			sets--;
		}
		return potenPrime;
	}
	
	public static void cleanPrimes(){
		ArrayList<Integer> p = getPotentialPrimes(5);
		ArrayList<Integer> p1 = new ArrayList<Integer>();
		boolean flag = false;
		
		System.out.println(p);
		
		for(int n : p){
			System.out.println("test");
			if(p1.isEmpty()) {
				p1.add(n); System.out.println("empty");
			}
			else {
				for(int m : p1){
					if(n % m == 0 && n != m) flag = true;
				}
				if(flag) System.out.println(p.remove(Integer.valueOf(n)));
				else p1.add(n);
				flag = false;
			}
		}
		
		
		
		for(int x : p1){
			System.out.println(x);
		}

	}
}

