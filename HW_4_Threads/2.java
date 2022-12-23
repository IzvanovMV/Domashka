
// Дано два потока — производитель и потребитель.
// Производитель генерирует некоторые данные (в примере — числа).
// Производитель «потребляет» их.
// Два потока разделяют общий буфер данных, размер которого ограничен.
// Если буфер пуст, потребитель должен ждать, пока там появятся данные.
// Если буфер заполнен полностью, производитель должен ждать,
// пока потребитель заберёт данные и место освободится.

package HW_4_Threads;
import java.nio.ByteBuffer;

import static java.lang.Thread.sleep;

class User implements Runnable 
{
    ByteBuffer buffer;

    User(ByteBuffer buffer) 
    {
        this.buffer = buffer;
    }

    @Override
    public void run() 
    {
        for (int i = 0; i < 10; i++) 
        {
            try 
            {
                sleep(500);
                System.out.println("Потребитель: Ожидание данных");
            } catch (Exception e) 
            {
                throw new RuntimeException(e);
            }
            if (buffer.position() == buffer.capacity()) 
            {
                System.out.println("Потребитель: Ожидание очистки буфера");
                try 
                {
                    sleep(500);
                } catch (InterruptedException e) 
                {
                    throw new RuntimeException(e);
                }
            } 
            else 
            {
                System.out.println("Потребитель: получение данные " + buffer.get());
            }

        }
    }
}

class manufacturer extends Thread 
{
    ByteBuffer buffer;

    Manufacturer(ByteBuffer buffer) 
    {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (byte i = 0; i < 10; i++) 
        {
            try 
            {
                sleep(1000);
            } catch (InterruptedException e) 
            {
                throw new RuntimeException(e);
            }
            System.out.println("buffer.position=" + buffer.position() + "\ncapacity=" + buffer.capacity());
            if (buffer.position() == buffer.capacity()) 
            {
                System.out.println("Производитель: Очистка буфера");
                buffer.clear();
            }
            buffer.put(i);
            System.out.println("Производитель: загрузка данные в буффер: " + i);
        }
    }
}

public class Task2 
{
    public static void main(String[] args) 
    {
        ByteBuffer buffer = ByteBuffer.allocate(5);
        Manufacturer myManufacturer = new Manufacturer(buffer);
        User myUser = new User(buffer);
        new Thread(myManufacturer).start();
        new Thread(myUser).start();
    }
}
