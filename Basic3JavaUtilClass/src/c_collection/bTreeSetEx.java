package c_collection;
import java.util.TreeSet;

public class bTreeSetEx 
{
	public static void main(String[] args) 
	{
		TreeSet  set = new TreeSet();//중복은 빠지면서 정렬해줌
		
		set.add("elephant");
		set.add("tiger");
		set.add("lion");
		set.add("cat");
		set.add("dog");
		set.add("ant");
		set.add("snack");
		set.add("zebra");
		set.add("bee");
		set.add("lion");

		System.out.println( set );
		

	}
}
