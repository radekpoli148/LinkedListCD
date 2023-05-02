package linkedlistcd;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class LinkedListCD {
    
    public static void main(String[] args) 
    {
        LinkedList<String> listaPowiazana = new LinkedList<String>();
        listaPowiazana.add("Lala1");
        listaPowiazana.add("Lala2");
        listaPowiazana.add("Lala3");
        listaPowiazana.add("Lala4");
        
        /*for(int i = 0; i<listaPowiazana.size(); i++)
        {
            System.out.println(listaPowiazana.get(i));
        }*/
        LinkedListCD.wypiszElementyListy(listaPowiazana);
        
        Iterator<String> iter = listaPowiazana.iterator();
        ListIterator<String> iter2 = listaPowiazana.listIterator(listaPowiazana.size());
        
        //iter.next(); //iterator usuwa poprzednika dlatego by usunąć pierwszy
        //iter.remove(); // element przesuwamy go o 1 miejsce w liście
        
        while(iter2.hasPrevious())
        {
            System.out.println(iter2.previous());
            iter2.set("podmiana");
        }
        
        iter2 = listaPowiazana.listIterator();// wyzerowanie iteratora
        
        iter2.add("nowyLala");//ListIterator pozwala na dodanie obiektu do listy przed iteratorem
            
        LinkedListCD.wypiszElementyListy(listaPowiazana);
    }
    
    public static void wypiszElementyListy(LinkedList<?> lista)
    {
        Iterator iteratorListy = lista.iterator();
        while(iteratorListy.hasNext())
            System.out.println(iteratorListy.next());
        System.out.println();
    }
}

/*
TU ZNAJDUJE SIĘ ITERATOR
----
|  | - 0
----
----
|  | - 1
----
----
|  | - 200
----
----
|  | - 557
----
*/