package binaryMinHeap;

public class BinaryMinHeap<E extends Comparable<E>>{

	private E[] heap;
	private int size;

	@SuppressWarnings("unchecked")
	public BinaryMinHeap(int capacity){
		heap = (E[]) new Comparable[capacity];
		size = 0;
	}

	public int getSize(){
		return size;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		for(int i=0; i<size; ++i){
			buffer.append(heap[i] + " ");
		}
		return buffer.toString();
	}

	@SuppressWarnings("unchecked")
	private void doubleCapacity(){
		E[] oldHeap = heap;
		heap = (E[]) new Comparable[oldHeap.length*2];
		for(int i=0; i<oldHeap.length; ++i){
			heap[i] = oldHeap[i];
		}
	}

	private void exchange(int i, int j) {
		E tmp = heap[i];
		heap[i] = heap[j];
		heap[j] = tmp;
	}

	private boolean smaller(E a, E b) {
		return a.compareTo(b) < 0;
	}

	public E getMin() {
		return heap[0];	
	}

	public void insert(E x) {
		if(size == 0) {
			heap[0] = x;
			size+=1;
			return;
		}
		
		if(size == heap.length)
			doubleCapacity();
		heap[size] = x;

		int i = size;
		while((i != 0) && smaller(x, heap[Math.floorDiv((i-1),2)])) {
			exchange(Math.floorDiv((i-1),2), i);
			i = Math.floorDiv((i-1),2);
		}
		heap[i] = x;
		size+=1;
	}

}
