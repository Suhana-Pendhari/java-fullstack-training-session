//overloading
class Testoverload{
	void add(int a){
		a++;
		System.out.println(a);
	}

	void add(int a, int b){
		System.out.println(a+b);
	}

	public static void main(String[] args){

		Testoverload t = new Testoverload();
		Testoverload t2 = new Testoverload();
		System.out.println(t2);
		t.add(1);
		t.add(1, 2);
		System.out.println(t);

		
	}

	 public String toString(){
		return "This is an instance of Testoverload class";
	}

}

/*

 205:   public String toString()
 206:   {
 207:     return getClass().getName() + '@' + Integer.toHexString(hashCode());
 208:   }

t-> new object i heap memory
t will be stored in main method call stack
if we try to print  Ref variable - toString() method object will be called

we must override it to have our way of describing the object because we know 
*/
