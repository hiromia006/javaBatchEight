package class8;

public class GenericNumber<T extends  Number> {
    private T obj;

    public GenericNumber(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
