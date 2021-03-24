package Throw;

public class Node {
    public String data;
    public Node next;

    public Node (String dato){
            this.data=dato;
            this.next=null;
    }

    public String getData() {
        return this.data;
    }
}
