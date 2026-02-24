// Inheritance Example

class Father {
    int age = 50;

    void job() {
        System.out.println("tech trainer");
    }

    void property() {
        System.out.println("a house in native");
    }

    void hobby() {
        System.out.println("travel blogging football table tennis");
    }
}

class Daughter extends Father {
    int age = 22;

    public static void main(String[] ar) {

        // Father object
        Father f = new Father();
        f.job();
        f.property();
        f.hobby();

        System.out.println("-----------");

        // Daughter object
        Daughter d = new Daughter();
        d.job();
        d.property();
        d.hobby();

        System.out.println("-----------");

        // Father reference, Daughter object
        Father f2 = new Daughter();
        f2.job();
        f2.property();
        f2.hobby();
    }
}

/*

java.lang.object
	|
     Father
	|
   Daugther 
*/