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
		for(int i = 1; i < nums.length; i++){
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
                for(int i = 1; i < nums1.length; i++){
                        if(nums1[i] < min)
                                min = nums1[i];
                        if(nums1[i] > max)
                                max = nums1[i];
                }
                System.out.println("Минимальное значение: " + min + "\nМаксимальное значение: " + max);
                System.out.println();

		//Двумерные массивы
		int t, j;
		int [][] table = new int[3][4];
		for(t = 0; t < 3; t++){
			for(j = 0; j < 4; j++){
				table[t][j] = (t*4) + j + 1;
				System.out.print(table[t][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		//Непрямоугольные массивы
		int [][] riders = new int[7][];
		riders[0] = new int[10];
		riders[1] = new int[10];
		riders[2] = new int[10];
		riders[3] = new int[10];
		riders[4] = new int[10];
		riders[5] = new int[2];
		riders[6] = new int[2];

		//Заполнение массива
		for(int i = 0; i < 5; i++){
			for(int k = 0; k < 10; k++){
				riders[i][k] = i + k + 10;
			}
		}
		for(int i = 5; i < 7; i++){
			for(int k = 0; k < 2; k++){
				riders[i][k] = i + k + 10;
			}
		}

		//Вывод массива
		System.out.println("Перевезено пассажиров в бедние дни: ");
		for(int i = 0; i < 5; i++){
			for(int k = 0; k < 10; k++){
				System.out.print(riders[i][k] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Перевезено пассажиров в выходные дни: ");
		for(int i = 5; i < 7; i++){
                        for(int k = 0; k < 2; k++){
                                System.out.print(riders[i][k] + " ");
                        }
                        System.out.println();
                }
		System.out.println();
		int[][] sqrs = {
			{1, 1},
			{2, 4},
			{3, 9},
			{4, 16},
			{5, 25},
			{6, 36},
			{7, 49},
			{8, 64},
			{9, 81},
			{10, 100}
		};
		System.out.println("Содержимое двумерного массива sqrs: ");
		for(int i = 0; i < sqrs.length; i++){
			for(int k = 0; k < 2; k++){
				System.out.print(sqrs[i][k] + "\t");
			}
			System.out.println();
		}
		//Объявление массива int[] nums = new int[3];
		//Альтернативное объявление массива int nums[] = new int[3];

		//Ссылочные переменные, указывающие на массивы
		int[] nums2 = new int[10];
		int[] nums3 = new int[10];
		for(int i = 0; i < 10; i++){
			nums2[i] = i;
			nums3[i] = -i;
		}
		System.out.print("Массив nums2: ");
		for(int i = 0; i < 10; i++)
			System.out.print(nums2[i] + " ");
		System.out.println();
		System.out.print("Массив nums3: ");
		for(int i = 0; i < 10; i++)
			System.out.print(nums3[i] + " ");
		System.out.println();
		nums2[3] = 99;
		System.out.println("nums2 и nums3 независимы друг от друга");
		System.out.print("Массив nums2 после изменения: ");
                for(int i = 0; i < 10; i++)
                        System.out.print(nums2[i] + " ");
                System.out.println();
		System.out.println("Выполняем присваивание nums3 = nums2");
		nums3 = nums2;
		nums3[3] = -99;
		System.out.println("nums2 и nums3 указывают на один массив, т.е. значения менятся и в одном, и в другом");
		System.out.print("Массив nums2: ");
                for(int i = 0; i < 10; i++)
                        System.out.print(nums2[i] + " ");
                System.out.println();
                System.out.print("Массив nums3: ");
                for(int i = 0; i < 10; i++)
                        System.out.print(nums3[i] + " ");
                System.out.println();

		//
		int[] list = new int[10];
		int[] nums4 = {1,2,3};
		int[][] table1 = {
			{1,2,3},
			{4,5},
			{6,7,8,9},
			{0}
		};
		System.out.println("Длина list: " + list.length);
		System.out.println("Длина nums4: " + nums4.length);
		System.out.println("Длина table1: " + table1.length);
		System.out.println("Длина table1[0]: " + table1[0].length);
		System.out.println("Длина table1[1]: " + table1[1].length);
		System.out.println("Длина table1[2]: " + table1[2].length);
		System.out.println("Длина table1[3]: " + table1[3].length);

		//Цикл for - each
		System.out.println();
		int[] nums5 = {1,2,3,4,5,6,7,8,9,10,11,12};
		int sum = 0;

		for(int x1 : nums5){
			System.out.println("Значение: " + x1);
			sum += x1;
			if(x1 == 5)
				break;
		}
		System.out.println("Сумма первых шести элементов массива nums5: " + sum);
		int sum1 = 0;
		int[][] nums6 = new int[3][5];

		for(int i = 0; i < 3; i++){
			for(int j1 = 0; j1 < nums6[i].length; j1++)
				nums6[i][j1] = (i+1)*(j1+1);
		}
		//Выводим элементы массивы и считаем сумму
		for(int[] x1 : nums6)
			for(int y : x1){
				System.out.println("Значение: " + y);
				sum1 += y;
			}
		System.out.println("Сумма nums6: " + sum1);

		System.out.println();
		//Поиск при помощи цикла "for - each"
		int val = 19;
		boolean found = false;

		for(int x1 : nums5){
			if(x1 == val){
				found = true;
				break;
			}
		}
		if(found)
			System.out.println("Значение " + val + " найдено");
		else
			System.out.println("Значение " + val + " не найдено");
	}
}
