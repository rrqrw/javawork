package interfaceex.sort;

public class BubbleSort implements Sort {

	@Override
	public void ascedning(int[] array) {
		System.out.println("BubbleSort ascending");

	}

	@Override
	public void descending(int[] array) {
		System.out.println("BubbleSort descending");

	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("BubbleSort 입니다.");
	}
		

	}


