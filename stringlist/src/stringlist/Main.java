package stringlist;

public class Main
{
    public static void main(String[] args)
    {
        StringList scientists = new StringList();

        scientists.add("Newton");
        scientists.add("Einstein");
        scientists.add("Bohr");
        scientists.add("Feynman");
        scientists.add("Oppenheimer");

        for (int i = 0; i < scientists.length(); ++i)
        {
            System.out.println(scientists.get(i));
        }
    }
}
