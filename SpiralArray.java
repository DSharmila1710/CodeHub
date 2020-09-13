
import java.util.ArrayList;
import java.util.List;

public class SpiralArray {
	
	public static List<Integer> oneDArr(int[][] matrix) {
		List<Integer> list = new ArrayList<>();
		if(matrix.length==0) {   
			return list;
		}
		
		int rowBegin = 0 ;
		int columnBegin=0;
		int rowEnd=matrix.length-1;
		int columnEnd=matrix[0].length-1;
		
		while(rowBegin<=rowEnd && columnBegin <= columnEnd) {
			for(int i=columnBegin;i<=columnEnd;i++) {
				list.add(matrix[rowBegin][i]);
			}
			rowBegin++;
			for(int i =rowBegin;i<=rowEnd;i++) {
				list.add(matrix[i][columnEnd]);
			}
			columnEnd--;
			for(int i =columnEnd;i>=columnBegin;i--) {
				list.add(matrix[rowEnd][i]);
			}
			rowEnd--;
			for(int i = rowEnd;i>=rowBegin;i--) {
				list.add(matrix[i][columnBegin]);
			}
			columnBegin++;
		}		
		return list;
	}
	
	
	public static void main(String[] args) {
		int[][] twoDArr = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		List<Integer> list = oneDArr(twoDArr);
		for(int i:list) {
			System.out.print(i+" ");
		}	}}
