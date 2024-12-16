class GenericMethDemo{
	static <T extends Comparable <T>, V extends T> boolean arraysEqual(T[] x, V[] y){
		if(x.length != y.length) 
			return false;
		for(int i = 0; i < x.length; i++){
			if(!x[i].equals(y[i]))
				return false;
		}
		return true;
	}
	public static void main(String[] args){
		Integer[] nums = {1, 2, 3, 4,};
		Integer[] nums2 = {1, 2, 3, 4};
		Integer[] nums3 = {1, 3, 2, 4, 5};
		Integer[] nums4 = {1, 2, 3, 4, 5};
		String[] s = {"1234", "5678", "9123", "4567"};
		String[] s1 = {"1234", "5678", "9123", "4567"};	

		if(arraysEqual(nums, nums2)){
			System.out.println("Массивы равны");
		}
		else
			System.out.println("Массивы не равны");
		if(arraysEqual(nums, nums3)){
                        System.out.println("Массивы равны");
                }
                else
                        System.out.println("Массивы не равны");
		if(arraysEqual(nums, nums4)){
                        System.out.println("Массивы равны");
                }
                else
                        System.out.println("Массивы не равны");
		if(arraysEqual(s, s1)){
			System.out.println("Строки равны");
		}
		else
			System.out.println("Строки не равны");
	}
}
