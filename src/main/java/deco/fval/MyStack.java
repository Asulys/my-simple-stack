package deco.fval;
import java.util.EmptyStackException;
import java.util.Stack;
/**
 * Created by 21406991 on 04/11/2016.
 *
 * un commentaire répondant à l'éxigence #3
 */
public class MyStack implements SimpleStack {
    Stack<Object> wrappedStack = new Stack<Object>();

    public boolean isEmpty(){
        return wrappedStack.isEmpty();
    }

    public int getSize(){
        return wrappedStack.size();
    }

    public void push(Item item){
        wrappedStack.push(item);
    }

    public Item peek() throws EmptyStackException{
        return (Item) wrappedStack.peek();
    }

    public Item pop() throws EmptyStackException{
        return (Item) wrappedStack.pop();
    }
}
