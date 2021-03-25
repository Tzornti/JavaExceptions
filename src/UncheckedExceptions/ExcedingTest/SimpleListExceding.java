package UncheckedExceptions.ExcedingTest;

import UncheckedExceptions.Excedinglimit;

public class SimpleListExceding {
    int large;
    int actualpos = 0;
    NodeExceding head = null;

    public SimpleListExceding() {
        new NodeExceding(null);
    }

    public void append(String data) {
        this.large += 1;
        if (this.head == null) {
            this.head = new NodeExceding(data);
            this.large += 1;
        } else {
            var smp = this.head;
            while (smp.next != null) {
                smp = smp.next;
            }
            smp.next = new NodeExceding(data);
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
                    throw new Excedinglimit("Posicion no existente en la lista");
                }
            }
        }
        return smp.getData();
    }
}