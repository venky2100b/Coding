package steams;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
public class groupBYTest {

	public static void main(String[] args) {
		   List<Integer> list = Arrays.asList(1,2,34,3,56,2,3);
		     Map<Integer,List<Integer>>  groupList=  list.stream().collect(Collectors.groupingBy(Function.identity()));
		      // it internally hardcode collector.toList() if you not specify on groupingBy
		       System.out.println(groupList);
	}
}
