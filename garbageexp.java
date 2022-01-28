import java.util.*;
public class garbageexp
{
public static void main(String args[])
{
garbageexp g=new garbageexp();
g=null;
garbageexp a = new garbageexp();
garbageexp b = new garbageexp();
b = a;
System.gc();
}
protected void finalize() throws Throwable
{
System.out.println("Garbage collection ids done by JVM");
}
}