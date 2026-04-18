//METHOD OVERLOADING

class Animal{

}
class Monkey extends Animal{

}
class Test {
    public void m1(Animal a){
        System.out.println("animal");
    }

    public void m1(Monkey m){
        System.out.println("monkey");
    }

    public static void main(String[] args) {
        Test t = new Test();
        Animal a = new Animal();
        t.m1(a);
        Monkey m = new Monkey();
        t.m1(m);
        Animal a1 = new Monkey();
        t.m1(a1);
    }
}



