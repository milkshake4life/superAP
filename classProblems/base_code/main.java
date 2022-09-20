import pkg.*;


class main {
	public static void main(String args[]) {
		int[] intArr = {7, 3, 6, 9, 3};
		int[] resultArr = new int[intArr.length];
		// Scanner sc = new Scanner(System.in);
		
		// System.out.println("How many values do you want: ")
		
		for(int i = 0; i < resultArr.length; i++){
			int count = 1;
			for(int z = 0; z < intArr.length; z++){
				if(i != z){
					
					count = count*intArr[z];
					// System.out.println(count);
				}
			}
			if(intArr[i] != 0){
				resultArr[i] = count / intArr[i];
			}
			else{
				resultArr[i] = count;
			}
		}
		
		for(int p : resultArr){
			System.out.println(p);
		}
	}
}
