public class Polymorphism {
    public static void main(String[] args){
      // code to be executed
      
      Child child=new Child();
      child.display();
    }
}
class Parent {
    void  display () {
     // code to be executed
     System.out.println("hi");
   }
 }
class Child extends Parent{
  void  display () {
    // code to be executed
    System.out.println("hello");
  }
 }
 

