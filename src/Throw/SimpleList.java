package Throw;

public class SimpleList {
    int large;
    int actualpos = 0;
    Node head = null;

    public SimpleList() {
        new Node(null);
    }

    public void append(String data) {
        this.large += 1;
        if (this.head == null) {
            this.head = new Node(data);
            this.large += 1;
        } else {
            var smp = this.head;
            while (smp.next != null) {
                smp = smp.next;
            }
            smp.next = new Node(data);
        }
    }

    public int getLarge() {
        return this.large;
    }

    public String ShowDataInPos(int x) {
        // El while esta acomodado de manera que aunque exceda el largo de la lista trate de continuar
        //con el fin de que realize el throw
        var smp = this.head;
        if (x == 0) {
            return smp.getData();
        }
        while (this.actualpos < x) {
            if (this.actualpos <= this.large) {
                if (smp.next != null) {
                    smp = smp.next;
                    this.actualpos += 1;
                }
                else {
                    throw new IllegalArgumentException("Posicion no existente en la lista");
                }
            }
        }
        return smp.getData();
    }
}