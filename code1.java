class MyCl {
public static void main(String arg[])
{
System.out.println("Main Thread Start.....");
Thread nob=Thread.currentThread();
System.out.println(nob);
System.out.println("Thread name is ===>"+nob.getName());
System.out.println("Thread priority is ===>"+nob.getPriority());
System.out.println("Main thread End.......");
}
}
