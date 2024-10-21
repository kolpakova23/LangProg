class pr001{
	public static void main(String args[]){
		System.out.println("Первая java-программа");
		//Преобразование типов

		//Целые типы данных:
		byte b; // 8 бит
		b = -128;
		b = 127; // область допустимых значений
		b = (byte) 130;
		System.out.println(b);
		short sh; // 16 бит
		sh = (short) 65536;
		int intg; // 32 бита
		long l; // 64 бита
		intg = 2000000000;
		l = intg;
		intg = intg * intg*intg;
		System.out.println(intg);
		l = l * l * l;
		System.out.println(l);

		//Вещественные типы:
		float f; //32 бита
		double dd; //64 бита
		sh = b;
		b = (byte)sh;
		dd = 1.5;
		intg = (int)dd;
		dd = (double)10/3;
		f = intg;
		System.out.println(intg + "  " + dd);
		
		//Символьный тип данных:
		char ch; // 16 бит
		ch = 'А';
		ch++; ++ch;
		ch = (char)45;
		for(int i = 0; i < 68; i++){
			System.out.print(ch++ + " ");
		}
		System.out.println();
			 
		//Логический тип данных:
		boolean bool, bool2; // 1 бит
		bool = true;
		bool2 = false;
		System.out.println(!bool);
		System.out.println(bool && bool2);
		System.out.println(bool || bool2);
		System.out.println(bool ^ bool2);
		System.out.println("Перенос строки\n" + "Табуляция\t" + "\"Кавычки в строке\"" + (!bool & (bool2 | bool)));
		ch = '\'';
	}
}
