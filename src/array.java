import java.util.Random;

public class array {
	public static void main(String args[]){
		System.out.println("Insert 10 random numbers into an array: ");
		Random rand = new Random();
		int size = 10; 
		int arrayObject[] = new int [size];
		
		
		for(int i = 0; i < size; i++){
		int number = rand.nextInt(100);
		arrayObject[i] = number;
		System.out.println("["+ i + "] ----- " + arrayObject[i]);
		}
		
		System.out.println("The 7th element of this array contains: " + arrayObject[6]);
	}
}
