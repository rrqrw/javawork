package interfaceex.sort;

public class HeapSort implements Sort {

	@Override
	public void ascedning(int[] array) {
		System.out.println("HeapSort ascedning");

	}

	@Override
	public void descending(int[] array) {
		System.out.println("HeapSort descending");

	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("HeapSort 입니다.");
	}

	}


