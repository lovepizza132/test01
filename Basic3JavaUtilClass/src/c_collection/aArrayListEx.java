
//동적인 배열 : ArrayList

package c_collection;
import java.util.ArrayList;

class aArrayListEx
{
	public static void main(String[] args) 
	{
		ArrayList data = dataSet();
		for(int i=0; i<data.size(); i++) {//size
			System.out.println(data.get(i));
		}
		// dataSet() 안의 변수 값들을 여기서 출력한다면??
		
	}

	static ArrayList dataSet()
	{
		String	name = "김태희";
		int		age = 31;
		double	height = 162.3;

		ArrayList data = new ArrayList(2);//size를 알아서 잡아줌 하지만 메모리를 많이 잡아먹어서 개수를 알고있으면 배열을 사용할 것
		data.add(name);
		data.add(age);
		data.add(height);
		
		return data;


	}
}
