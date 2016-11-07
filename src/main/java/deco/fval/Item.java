package deco.fval;

/**
 * Created by 21406991 on 04/11/2016.
 */
public class Item {
    public Object value;

    Item(Object value){
        setValue(value);
    }

    /**
     * commentaier répondant à l'éxigence #1.
     * @return
     */
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
