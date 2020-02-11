package app;

import java.io.File;

public class App {
    public static void main(String[] args) 
    {
        System.out.println("start of the program: ");
        throw_function obj = new throw_function();
        try {
			obj.fun();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
        System.out.println(obj);

    //    int arr[] = {34,5,8,6,7};
    //    try{
       
    // //  String s = null;
    // //  System.out.println(s.length());
    //  arr[5] = 56;

    //    }
    //    catch(Exception exception)
    //    {
    //        System.out.println(exception);
    //    }
    
      
      
       System.out.println("End of the program: ");
    }
}