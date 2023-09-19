package interfaceex.sort;

public class QuickSort implements Sort{

	@Override
	public void ascedning(int[] array) {
		System.out.println("QuickSort ascending");
		
	}

	@Override
	public void descending(int[] array) {
		System.out.println("QuickSort dscending");
		
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("QuickSort 입니다.");
	}

	
		
		
	}

	

