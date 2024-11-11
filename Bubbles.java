//Пузырьковая сортировка
class Bubbles{
	public static void main(String[] args) {
		int[] nums = {34, 353, 521, 24,  -242, -10, 583, 32, 122, -44};
		int a, b, t;
		int size;

		size = 10;

		//Отображение исходного массива 
		System.out.print("Исходный массив: ");
	       	for(int i = 0; i < size; i++)
			System.out.print(" " + nums[i]);
		System.out.println();
		//Сортировка
		for(a = 1; a < size; a++){
			for(b = size - 1; b>=a; b--){
				if(nums[b-1] > nums[b]){
					t = nums[b-1];
					nums[b-1] = nums[b];
					nums[b] = t;
				}
			}
		}
		//Отображение отсортированного массива
		System.out.print("Отсортированный массив: ");
		for(int i = 0; i < size; i++)
			System.out.print(" " + nums[i]);
		System.out.println();
	}
}
