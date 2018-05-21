package Chapter11;

import java.util.*;

public class Exercise12
{

    /*
        Write a method contains3 that accepts a list of strings as a parameter
        and returns true if any single string occurs at least 3 times in the list,
        and false otherwise. Use a map as auxiliary storage.
     */

    public static void main(String[] args)
    {

        ArrayList<String> list = new ArrayList<>();

        list.add("This is a string");
        list.add("This is a string");
        list.add("This is a string");

        list.add("Test");
        list.add("Test");
        list.add("Hello");

        System.out.println(contains3(list));

    }

    public static boolean contains3(ArrayList<String> list)
    {
        boolean contains3 = false;
        Collections.sort(list);
        System.out.println(list.size());

        for (int i = 0; i < list.size()-2; i++)
        {

            if(list.get(i).equals(list.get(i + 1)) && list.get(i).equals(list.get(i + 2)))
            {
                contains3 = true;
                return contains3;
            }

        }

        return contains3;

    }
}
