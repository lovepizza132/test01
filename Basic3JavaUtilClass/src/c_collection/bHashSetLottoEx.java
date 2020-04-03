package c_collection;
import java.util.*;

public class bHashSetLottoEx 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> lottos = new HashSet<Integer>();//중복되지 않는다.
		while( lottos.size()<6 ) {
			int num = (int)(Math.random()*45+1);//Math.random()을 쓸 수 있는 것은 random이 Static이붙어 있기 때문에
			lottos.add(num);
		}
//		System.out.println(lottos);
		ArrayList<Integer> list = new ArrayList<Integer> (lottos);
		Collections.sort(list);//정렬해주는것
		System.out.println(list);
	}
}
