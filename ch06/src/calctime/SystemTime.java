package calctime;

public class SystemTime {

	public static void main(String[] args) {
		// 성능 테스트 소요 시간 측정 - ms,ns
		// 현재 까지의 시간 (밀리초)
		//long start = System.currentTimeMillis();
		long start = System.nanoTime();
		long sum =0;
		for(int i=1; i<1000000; i++) {
			sum+= i;
		}
		long end =System.nanoTime();
		//long end =System.currentTimeMillis();
		System.out.println(sum);
		//System.out.println((end - start) + "ms");
		System.out.println((end - start)/1000000 + "ns");
		
	}
	

}
