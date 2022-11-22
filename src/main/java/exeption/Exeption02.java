package exeption;

public class Exeption02 {
    public static void main(String[] args) {
        String arr[]={"Ali,Can,Veli,Han"};
        getFromArray(arr,2);
        getFromArray(arr,4);

    }
    public static void getFromArray(String arr[],int idx ){

        try{
            System.out.println(arr[idx]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index te bir sorun olustu"+e.getMessage());
            e.printStackTrace();
            System.err.println("Array index te bir sorun olustu");

        }

    }
}
