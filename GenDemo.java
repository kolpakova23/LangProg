//Пример обобщённого класса 
class Gen <T> {
	//Объявление ссылки на объект обобщённого типа 
	T ob;

	//Конструктор
	Gen(T o){
		ob = o;

	}
	//Методы для проверки информации об объектах
	T getOb() {
		return ob;
	}

	void showType() {
		System.out.println("Тип T: " + ob.getClass().getName());
	}
	
}

class GenDemo{
	public static void main(String[] args){
		//объявление переменной класс Gen
		Gen <Integer> iOb;
		//создание объекта
		iOb = new Gen <Integer> (100);
		//ошибочное использование:
		//iOb = new Gen <Integer> (100.0); 
		
		iOb.showType();
		int v = iOb.getOb();
		System.out.println("Значение v: " + v);
		System.out.println();

		//объявление переменной класс Gen
                Gen <Double> dOb;
                //создание объекта
                dOb = new Gen <Double> (100.6);
                //ошибочное использование:
                //iOb = new Gen <Integer> (100.0);

                dOb.showType();
                double b = dOb.getOb();
                System.out.println("Значение b: " + b);
                System.out.println();

		Gen <String> sOb;
		sOb = new Gen <> ("Hello, World!");
		sOb.showType();
		String s = sOb.getOb();
		System.out.println("Значение s: " + s);
		System.out.println();

	}
}
