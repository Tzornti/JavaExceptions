package UncheckedExceptions.ExcedingTest;

public class NodeExceding {
    public String data;
    public NodeExceding next;

    public NodeExceding(String dato){
            this.data=dato;
            this.next=null;
    }

    public String getData() {
        return this.data;
    }
}
