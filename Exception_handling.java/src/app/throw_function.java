package app;

import java.io.File;

public class throw_function
{
public void fun() throws Exception
    {
       Throwable throwable = new Throwable(); try {
           String s = null;
           System.out.println(s.length());
           
       } catch (Exception e) {
           //TODO: handle exception
       }
    
}
}