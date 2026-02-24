/*
public abstarct is assumed here so while ovveriding the class must use publuc access modifier
and remove abstarct

Adaptor class imp question in interviews
*/
interface Inter1{
    void add(int a);
}
class InterfaceDemo implements Inter1 {

    public void add(int a){
        a++;
        System.out.println(a);
    }
    public static void main(String[] args) {
        Inter1 i = new InterfaceDemo();
        i.add(100);
    }
}
