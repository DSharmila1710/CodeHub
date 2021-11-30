package test2;

public class ArrangeZerosOnesInArray {

	//array [1,0] in any order {1,0,0,1,1,0} -- list all 0s at front

	public static void main(String[] args) {
		
		int[] arr = {1,0,0,1,1,0};
		int ones_count = 0;
		for(int i:arr) {
			ones_count=(i==1)?ones_count+1:ones_count; //=3
		}
		for(int i=0;i<arr.length;i++) {
			if(i<ones_count) {
				arr[i]=0;
			}else
				arr[i]=1;
		}
		
		System.out.println("result");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		
	}

}
