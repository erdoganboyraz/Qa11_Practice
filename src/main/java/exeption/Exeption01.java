package exeption;

public class Exeption01 {
    public static void main(String[] args) {
       /* divide(6,2);
        divide(0,2);
        divide(6,0);


   */
        divede2(13,0);


    }
  //  public static void divide(int a,int b){
      //  System.out.println(a/b);
   // }
    public static void divede2(int a,int b){
        try{
            System.out.println(a/b);
            System.out.println("hi exeption");

        }catch(ArithmeticException e){
            System.out.println("bölme isleminde bir problem olustu"+e.getMessage());
            e.printStackTrace();
            System.err.println("bölme isleminde bir problem olustu");

        }


    }


}
