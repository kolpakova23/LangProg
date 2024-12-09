class TwoDShape{
	private double width;
	private double height;
	String name;
	int i = 100;
	TwoDShape(double w, double h){
		width = w;
		height = h;
		name = "Двумерная фигура";
		if(w > 21.0)
                        width = 21.0;
                else
                        width = w;

		if(h > 29.7)
                        height = 29.7;
                else
                        height = h;
	}
	double getWidth() {
		return width;
	}
	double getHeight() {
		return height;
	}
	void setWidth(double w){
		if(w > 21.0)
			width = 21.0;
		else
			width = w;
	}
	void setHeight(double h){
		if(h > 29.7)
			height = 29.7;
		else
			height = h;
	}
	void showDim(){
		System.out.println("Размеры фигуры: " + width + " x " + height);
	
	}
	/*
	String showName(){
		return name;
	}
	*/
	double area() {
		System.out.println("Метод должен быть переопределён!");
		return 0.0;
	}
}
class Triangle extends TwoDShape{
	String style;
	int i = 10;
	Triangle(String s, double w, double h){
		super(w, h); //вызов конструктора суперкласса
		style = s;
		name = "Треугольник";
	}
	double area(){
		return getWidth() * getHeight() / 2;
	}
	void showStyle(){
		System.out.println("Стиль: " + style);
	}
	//Демонстрация доступа к одноименной переменной суперкласса
	int showSuperI(){
		return super.i;
	}
	/*
	String showSuperName(){
		return super.name;
	}
	*/
}
class ColorTriangle extends Triangle{
	String color;
	ColorTriangle(String c, String s, double w, double h){
		super(s, w, h); // Вызов конструктора Triangle()
		color = c;
		name = "Цветной треугольник";
	}
	void showColor(){
		System.out.println("Цвет: " + color);
	}
}
class Rectangle extends TwoDShape{
	Rectangle(String o, double w, double h){
		super(w, h); //вызов конструктора суперкласса
		outLine = o;
		name = "Прямоугольник";
	}
	String outLine;
	double area(){
		return getWidth() * getHeight();
	}
	boolean isSquare(){
		if(getWidth() == getHeight())
			return true;
		else
			return false;
	}
}

class Interihance{
	public static void main(String[] args){
		TwoDShape fig1 = new TwoDShape(20.0, 30.0);
		Triangle t1 = new Triangle("Закрашенный", 4.5, 7.0);
		ColorTriangle t2 = new ColorTriangle("Синий", "Контурный", 3.5, 8.0);
		Rectangle r1 = new Rectangle("Сплошная линия", 5.0, 5.0);
		Rectangle r2 = new Rectangle("Пунктирная линия", 5.0, 7.0);
		System.out.println("Информация об объектах: ");	
		System.out.println("fig1: " + fig1.name);
		fig1.showDim();
		System.out.println("t1: " + t1.name);
		t1.showStyle();
		System.out.println("Площадь: " + t1.area());
		//t1.showName();
		System.out.println();
		System.out.println("r1: " + r1.name);
		System.out.println("Квадрат: " + r1.isSquare());
		System.out.println("Площадь: " + r1.area());
		System.out.println(t1.i);
		System.out.println(t1.showSuperI());

		//Совместимость переменных родстенных классов
		//Переменная суперкласса может ссылаться на объект любого подкласса


		System.out.println(fig1.getWidth());
		fig1.area();
		//При указании на объект суперкласса выполняет метод суперкласса
		
		fig1 = t1;
		System.out.println(fig1.getWidth());
		System.out.println("Площадь треугольника: " + fig1.area());
		//При указании на объект подкласса выполняется вычисление площади для треугольника
		fig1 = r1;
		System.out.println(fig1.getWidth());
		System.out.println("Площадь прямоугольника: " + fig1.area());
		//При указании на объект подкласса выполняет вычисление площади для прямоугольника
		
		
		fig1 = t2; 
		System.out.println("\033[0;34m");
		t2.showColor();
		System.out.println("\033[1;37m");
		System.out.println("Площадь цветного треугольника: " + fig1.area());
		System.out.println("Имя фигуры: " + fig1.name);

		//System.out.println(fig1.style);
		//Доступ к членам подкласса для ссылочных переменных суперкласса закрыт

		//проверка доступности переменных
		/*
		System.out.println(fig1.width);
		System.out.println(t1.width); //подкласс имеет доступ к переменным и методам суперкласса
		//System.out.println(fig1.style); суперкласс не имеет доступа к переменным описанным в подклассе
		*/

	}

}
