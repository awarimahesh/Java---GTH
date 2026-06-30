
//2. What will happen when the following code is executed?
abstract class Animal {
    abstract void sound();
}

 class Dog extends Animal {
	  @Override
	 //void sound(){
	// System.out.println("bark");	
}
 //}

public class Q2 {
    public static void main(String[] args) {
        Dog d = new Dog();
		//d.sound();
    }
}


/*A) Dog object is created successfully
B) Compilation Error
C) Runtime Error
D) Output: sound
*/

// Compilation Error
