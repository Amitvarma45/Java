//create threads by extending thread class
package Corejava;

class ThreadExample
{
public static void main(String args[])
{
// Thread object created
// and initiated with data
Thread t = new Thread("Hello AMIT!");
// Thread gets started
t.start();
// getting data of
// Thread through String
String s = t.getName();
System.out.println(s);
}
}
