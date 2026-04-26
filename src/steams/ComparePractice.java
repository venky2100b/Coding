package steams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparePractice {

	public static void main(String[] args) {
		

		sort();
		System.out.println(factorial(3));
	}
	
	static void sort() {
		List<String> list = Arrays.asList("sam","ram","ban");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
	
	  public static int factorial(int n) {
		  System.out.println("hi:"+n);
	        return (n == 0) ? 1 : n * factorial(n - 1);
	    }
}
