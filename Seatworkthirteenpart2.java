public class Seatworkthirteenpart2 {

	public static void sayHello(int count){
		if (count == 0){// halting conditon
		System.out.println("Done!");
		}else{
			System.out.println("Hello");
			sayHello(count -1); // recursive call
		}
	}
	public static void main(String[] args) {
		sayHello(3); // prints Hello 3 times
	}
}