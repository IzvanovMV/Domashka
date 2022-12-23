

public class Main {
    public static void main(String[] args) 
    {
        Seasons myFav = Seasons.SPRING;
        System.out.println(myFav + " " + myFav.avgTemperature + " " + myFav.getDescription() +'\n');
        printILike(myFav);

        for (Seasons c: Seasons.values()) 
        {
            System.out.println(c + " " + c.getAvgTemperature() +" " + c.getDescription());

        }

    }


    public static void printILike(Seasons in)
    {
        switch (in) 
        {
            case AUTUMN -> System.out.println("Я люблю осень\n");
            case SPRING -> System.out.println("Я люблю весну\n");
            case SUMMER -> System.out.println("Я люблю лето\n");
            case WINTER -> System.out.println("Я люблю зиму\n");
        }

    }
}