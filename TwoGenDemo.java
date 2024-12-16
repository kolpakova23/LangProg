//Пример класса с двумя обобщёнными типами
class TwoGen <T, V>{
	T ob1;
	V ob2;

	TwoGen(T o1, V o2){
		ob1 = o1;
		ob2 = o2;
	}

	void showType() {
		System.out.println("Тип Т: " + ob1.getClass().getName());
		System.out.println("Тип V: " + ob2.getClass().getName());
	}
	T getOb1(){
		return ob1;
	}
	V getOb2(){
		return ob2;
	}
}

class TwoGenDemo{
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
		
		TwoGen <Integer, Integer> tgOb;
		tgOb = new TwoGen<>(100, 10);
		tgOb.showType();
		int v1 = tgOb.getOb1();
		int v2 = tgOb.getOb2();
		System.out.println("Значение v1: " + v1);
		System.out.println("Значение v2: " + v2);	
		System.out.println();

		TwoGen <Double, String> rgOb;
                rgOb = new TwoGen<>(100.7, "School 21 <3");
                rgOb.showType();
                double d1 = rgOb.getOb1();
                String s1 = rgOb.getOb2();
                System.out.println("Значение d1: " + d1);
                System.out.println("Значение s1: " + s1);
	}
}
