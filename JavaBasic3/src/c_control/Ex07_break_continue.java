package c_control;

public class Ex07_break_continue {

	public static void main(String[] args) {
		//3행 2열 행렬에 번호붙이기
		HERE://break;하고 싶은 문장 앞에 대문자로 라벨 쓰기
		for(int j=0; j<2; j++) {
			for(int i=0; i<3; i++) {
				//if(i==1)break; //블럭 벗어나는 문장(반복 벗어나기)
				if(i==1)continue; // 블럭 끝으로 가기(반복 수행함)
				//if(i==1)break HERE; //라벨이 써있는 바로 뒤 문장에서 벗어남(반복 벗어나기)
				//if(i==1)continue HERE; // 라벨이 써있는 바로 뒤 문장 끝으로 감(반복 수행함)
				System.out.printf("< %d, %d > \n", j, i);
			}
			System.out.println("데이타");
		}//break HERE;의 위치 }앞이 continue HERE;의 위치
//===============================================================================================
	
	}

} 
