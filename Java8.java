package NickWhiteHackerRank;

import java.util.*;
import java.util.stream.Collectors;

public class Java8 {

	public static void main(String[] args) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		//map - collect
		List<Integer> list = Arrays.asList(4,6,1,2,3);
		List<Integer> output = list.stream().map(x-> x*x).collect(Collectors.toList());
		System.out.println(output);
		
		
		//filter - reduce
		Integer output2=list.stream().filter(x -> x%2==0).reduce(0, (ans,i)->ans+i);
		System.out.println(output2);
		
		//sort - collect
		List<Integer> output3=list.stream().sorted().collect(Collectors.toList());
		System.out.println(output3);
		
		//map - forEach
		list.stream().map(x->x*x).forEach(x->System.out.print(x+" "));
		
		//lambda expressions
		list.forEach(x -> System.out.println(x*x*x));
	}

}
