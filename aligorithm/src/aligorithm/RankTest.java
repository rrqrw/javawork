package aligorithm;

public class RankTest {

	public static void main(String[] args) {
		// 순위 정하기
		// rank를 모두 1로 초기화 함
		//rank-> 3, 1, 5, 4, 2
		int[] score = {70, 90, 60, 50, 80};
		int[] rank = new int[5]; // 0,0,0,0,0
		
		// 중첩 for(행, 열)
		for(int i=0; i<score.length; i++) {
			int count =1 ;
			for(int j=0; j<score.length; j++) {
				if(score[i]< score[j])
					count++;
				
			}
			rank[i] = count;
		}
		/*i=0 70<70, 70<90, 70<60, 70<50 ,70<80 count=3
		 *i=1  90<70, 90<90 90<60 90<50 90<80 count =1
		 *
		 *  
		 *  rank[0]=3
		 *  rank[1]=1
		 *  
		 *
		 * */
		 
		// 순위 출력
		for(int i=0; i<rank.length; i++) {
			System.out.print(rank[i] + " ");
		}
		
		

	}

}
