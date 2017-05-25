package sorting.simpleSorting;

import sorting.AbstractSorting;
import util.Util;

/**
 * The selection sort algorithm chooses the smallest element from the array and
 * puts it in the first position. Then chooses the second smallest element and
 * stores it in the second position, and so on until the array is sorted.
 */
public class SelectionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		
		for (int i = leftIndex; i < rightIndex; i++) {
			int indiceAtual = i;
			
			for (int j = i + 1; j < rightIndex; j++) {
				if (array[indiceAtual].compareTo(array[j]) == 1) {
					indiceAtual = j;
				}
			}
			
			Util.swap(array, indiceAtual, i);
			
		}
	}
}


//private void selectionSort(T[] array) {
//
//	for (int i = 0; i < array.length; i++) {
//		int indiceAtual = i;
//		for (int j = i; j < array.length; j++) {
//			if (array[indiceAtual].compareTo(array[j]) == 1) {
//				T aux1 = array[j];
//				array[j] = array[indiceAtual];
//				array[indiceAtual] = aux1;
//			}
//		}
//	}
//}