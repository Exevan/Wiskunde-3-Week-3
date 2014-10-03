package binaryMinHeap;

public class BinaryMinHeap<E extends Comparable<E>>{
	
	private E[] heap;
	private int size;
	
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
	
	private void doubleCapacity(){
		E[] oldHeap = heap;
		heap = (E[]) new Comparable[oldHeap.length*2];
		for(int i=0; i<oldHeap.length; ++i){
			heap[i] = oldHeap[i];
		}
	}

	public void insert(int i) {
		// TODO Auto-generated method stub
		
	}

}
