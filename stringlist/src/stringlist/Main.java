package stringlist;

import java.util.Iterator;

public class Main
{
    public static void oldschool(StringList scientists)
    {
        Iterator<String> it = scientists.iterator();
        while (it.hasNext())
        {
            String scientist = it.next();
            System.out.println(scientist);
        }
    }

    public static void newschool(StringList scientists)
    {
        for (String scientist : scientists)
        {
            System.out.println(scientist);
        }
    }

    public static void main(String[] args)
    {
        StringList scientists = new StringList();

        scientists.add("Newton");
        scientists.add("Einstein");
        scientists.add("Bohr");
        scientists.add("Feynman");
        scientists.add("Oppenheimer");

        //        oldschool(scientists);
        newschool(scientists);
    }
}
