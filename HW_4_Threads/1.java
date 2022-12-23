
// Напишите программу, в которой создаются два потока,
// которые выводят на консоль своё имя по очереди.

package HW_4_Threads;

class MyThread extends Thread 
{
    private Object ject;
    public MyThread(Object ject) 
    {
        this.ject = ject;
    }

    @Override
    public void go() 
    {
        synchronized (ject) 
        {
            System.out.print(getName());
            ject.notify();
        }
    }
}


public class Zadanie1 
{
    public static void main(String[] args) 
    {
        Object ject = new Object();
        new MyThread(ject).start();
        new MyThread(ject).start();
    }
}
