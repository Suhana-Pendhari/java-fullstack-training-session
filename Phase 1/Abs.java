/*
abstract class:
1.its an incomplete class
why so:
we cant create object
we need another class to extend and inpmlement the abstract methods
not nessarily it must have a abstract method
but if a class has an abstract method it must be declared as abstact the
extending must override the abstract methods to follow access modifier
rules-equal access or more aceess
abstact class may have complete method also-method with body an 
abstract method cant have body: only declaration

*/

abstract class Abs {
	void add(int a) {
		a++;
		System.out.println(a);
	}

	abstract void add1(int a, int b);

}

class Abstest extends Abs {
	public void add1(int a, int b) {
		System.out.println(a + b);
	}
	public void sub(int a, int b) {
		System.out.println(a - b);
	}

	public static void main(String[] args) {
		Abs a = new Abstest(); // a is an thin client: it can access the methods in
		// Abs and the same methods only in the extended class Testabs
		Abstest aa = new Abstest();
		a.add(1);
		a.add1(12, 23);
		aa.sub(23, 7);

	}
}
