public class ExceptionPractice {
    public static void main(String arg[])
    {
      HandleException handle=new HandleException();
      handle.display();
    }
  }
      
class HandleException{
      void display(){
        int firstValue=10;
        int secondValue=0;
        try{
          int result=firstValue/secondValue;
          
          System.out.println(result);
        }
        
        
        catch(ArithmeticException e){
          System.out.println("err");
        }
        catch(Exception e){
          System.out.println("Error");
        }
        

     }
}

