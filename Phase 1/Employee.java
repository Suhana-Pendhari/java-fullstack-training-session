/*
local variables-inside method or as arg -have no default values instance variables-per object-have a default value static variable-per class-have default values */
class Employee {

    int id;
    String name;
    int salary;
    static int count;

    // No-argument constructor
    Employee() {
        System.out.println("No argument constructor is called");
        count++;
        System.out.println("count is: " + count);
    }

    // 3-argument constructor
    Employee(int eid, String ename, int salary) {
        System.out.println("Employee object created using 3 arg constructor");
        this.id = eid;
        this.name = ename;
        this.salary = salary;
        count++;
        System.out.println("count is: " + count);
    }

    public static void main(String[] ar) {

        Employee e = new Employee();
        System.out.println("e.id: " + e.id);
        System.out.println("e.name: " + e.name);
        System.out.println("e.salary: " + e.salary);

        Employee e1 = new Employee(1, "aaa", 10000);
        System.out.println("e1.id: " + e1.id);
        System.out.println("e1.name: " + e1.name);
        System.out.println("e1.salary: " + e1.salary);

        Employee e2 = new Employee(2, "abc", 12000);
        System.out.println("e2.id: " + e2.id);
        System.out.println("e2.name: " + e2.name);
        System.out.println("e2.salary: " + e2.salary);
    }
}
