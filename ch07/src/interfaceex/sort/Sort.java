package interfaceex.sort;

public interface Sort {
	public void ascedning(int[] array);
	
	public void descending(int[] array);
	
	default public void description() {
	System.out.println("숫자를 정렬하는 알고리즘입니다.");	
	}

}
