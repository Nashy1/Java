package Book4.Chapter5;

import java.util.LinkedList;
//The class declaration specifies the formal type parameter <E>.
//Thus users of this class can specify the type for the stack’s elements.
public class GenStack<E> {

    /*This class uses a private LinkedList object list to keep the items stored
in the stack. The LinkedList is declared with the same type as the
GenStack class itself. Thus, if the E type parameter is Employee, the type
for this LinkedList is Employee */
    private LinkedList<E> list  = new LinkedList<>();

    /* The push method accepts a parameter of type E. It uses the linked list’s
addFirst method to add the item to the beginning of the list.*/
    public void push(E item){
        list.push(item);
    }

    /*The pop method returns a value of type E. It uses the linked list’s poll
method, which removes and returns the first element in the linked list.
If the list is empty, the poll method — and therefore the pop method —
returns null*/
    public E pop(){
        return list.pop();
    }

    /*The peek method also returns a value of type E. It simply returns the
result of the linked list’s peek method.*/

    public E peek(){
        return list.peek();
    }

    /*The hasItems method returns the opposite of the linked list’s isEmpty
method.*/

    public boolean hasItem(){
        return !list.isEmpty();
    }

    /*The size method simply returns the result of the linked list’s size method.*/
    public int size(){
        return list.size();
    }
}
