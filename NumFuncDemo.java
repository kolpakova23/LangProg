class NumericFns<T extends Number>{
	T num;

	NumericFns(T n){
		num = n;
	}

	double reciprocal() {
		return 1 / num.doubleValue();
	}

	double fraction() {
		return num.doubleValue() - num.intValue();
	}

	boolean absEqual(NumericFns<?> ob) {
		if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())){
			return true;
		}
		return false;
		
	}
}
/*
 * Можно ограничивать классы родственными связями:
 * classs Pair <T, V extends T> {
 *	...
 * }
 * 
 */

class NumFuncDemo {
	public static void main(String[] args){
		NumericFns Ob;
		NumericFns<Integer> iOb;
		iOb = new NumericFns<>(5);
		System.out.println("Обратная величина iOb: " + iOb.reciprocal());
		System.out.println("Дробная часть iOb: " + iOb.fraction());
		System.out.println();

		NumericFns<Double> dOb;
                dOb = new NumericFns<>(5.5);
                System.out.println("Обратная величина iOb: " + dOb.reciprocal());
                System.out.println("Дробная часть iOb: " + dOb.fraction());	
		
		NumericFns<Integer> intOb = new NumericFns<>(5);
		NumericFns<Double> dblOb = new NumericFns<>(-5.0);

		if(intOb.absEqual(dblOb))
			System.out.println("Модули чисел равны");
		else
			System.out.println("Модули числе не равны");

		if(intOb.absEqual(dOb))
                        System.out.println("Модули чисел равны");
                else
                        System.out.println("Модули чисел не равны");
	}
}
