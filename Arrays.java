class Arrays {
	public static void main(String[] args){
		int [] nums = new int[10];
		//Заполнение массива значениями
		for (int i = 0; i < 10; i++){
			nums[i] = i;
		}
		//Вывод содержимого массива
		for(int i = 0; i < 10; i++){
			System.out.println("Элемент nums [" + i + "]: " + nums[i]);
		}
		System.out.println();
		//Ввод каждого элемента массива "вручную"
		nums[0] = 32;
		nums[1] = -1;
		nums[2] = 5;
		nums[3] = 20;
		nums[4] = 45;
		nums[5] = 78;
		nums[6] = 99;
		nums[7] = 2;
		nums[8] = 21;
		nums[9] = 11;
		//Находим максимальное и минимальное значение
		int min, max;
		min = max = nums[0];
		for(int i = 1; i < 10; i++){
			if(nums[i] < min)
				min = nums[i];
			if(nums[i] > max)
				max = nums[i];
		}
		System.out.println("Минимальное значение: " + min + "\nМаксимальное значение: " + max);
		System.out.println();

		//
		int x = 10;
		int[] nums1 = {1, 1, 1, 1, 1, 1, x, 1, 1, 1};
		min = max = nums1[0];
                for(int i = 1; i < 10; i++){
                        if(nums1[i] < min)
                                min = nums1[i];
                        if(nums1[i] > max)
                                max = nums1[i];
                }
                System.out.println("Минимальное значение: " + min + "\nМаксимальное значение: " + max);
                System.out.println();
	}
}
