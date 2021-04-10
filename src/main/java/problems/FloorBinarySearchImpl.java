package problems;

public class FloorBinarySearchImpl implements Floor {

	@Override
	public Integer floor(Integer[] array, Integer x) {
		Integer floor = null;
		quickSort(array, 0, array.length - 1);
		boolean hasFloor = hasFloor(array, x);
		if (hasFloor) {
			int indiceFloor = buscaBinaria(array, x, 0, array.length - 1);
			floor = array[indiceFloor];
		}
		
		return floor;
	}
	
	private void quickSort(Integer[] array, int leftIndex, int rightIndex) {
		boolean isSortable = false;
		if (leftIndex < rightIndex && rightIndex < array.length) {
			isSortable = true;
		}
		
		if (isSortable) {
			int pivotIndex = particiona(array, leftIndex, rightIndex);
			quickSort(array, leftIndex, pivotIndex - 1);
			quickSort(array, pivotIndex + 1, rightIndex);
		}
		
	}
	
	private int particiona(Integer[] array, int leftIndex, int rightIndex) {
		int range = rightIndex - leftIndex + 1;
		int randomPivotIndex = (int) (Math.random() * range) + leftIndex;
		Integer aux = array[leftIndex];
		array[leftIndex] = array[randomPivotIndex];
		array[randomPivotIndex] = aux;
		
		Integer pivot = array[leftIndex];
		int i = leftIndex;
		
		for (int j = leftIndex + 1; j <= rightIndex; j++) {
			if (array[j] < pivot) {
				i++;
				Integer temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		
		Integer temp = array[i];
		array[i] = array[leftIndex];
		array[leftIndex] = temp;
		
		return i;
	}
	
	private int buscaBinaria(Integer[] array, int x, int leftIndex, int rightIndex) {
		int middleIndex = (leftIndex + rightIndex)/2;
		int indiceElemento = -1;
		
		if (array[middleIndex] == x || leftIndex == rightIndex) {
			indiceElemento = middleIndex;
		} else if (array[middleIndex] > x) {
			indiceElemento = buscaBinaria(array, x, leftIndex, middleIndex - 1);
		} else {
			if (array[middleIndex + 1] > x && array[middleIndex - 1] < x) {
				indiceElemento = buscaBinaria(array, x, middleIndex, rightIndex - 1);
			} else {
				indiceElemento = buscaBinaria(array, x, middleIndex + 1, rightIndex);
			}
		}
		
		return indiceElemento;
	}
	
	private boolean hasFloor(Integer[] array, Integer x) {
		boolean has = false;
		if (array.length > 0 && !(array[0] > x)) {
			has = true;
		}
		return has;
	}
 
}
