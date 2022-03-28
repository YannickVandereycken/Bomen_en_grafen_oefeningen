package domain;

import java.util.ArrayList;

public class BinaryMinHeap<E extends Comparable<E>> {
    private ArrayList<E> values;

    private boolean isEmpty() {
        return values == null || values.size() == 0;
    }

    public void print() {
        if (this.isEmpty())
            System.out.println("De heap is leeg");
        else
            System.out.println(values);
    }

    public E getMin() {
        if (this.isEmpty())
            throw new IllegalStateException("Kan niet zoeken in een lege heap");
        //TO DO zie oefening 3
        return values.get(0);
    }

    public boolean addValue(E value) {
        // geen null toevoegen aan de heap
        if (value == null) throw new IllegalArgumentException();
        // indien de heap leeg is: eerst initialiseren
        if (this.isEmpty())
            values = new ArrayList<E>();

        values.add(value);//achteraan toevoegen
        this.bubbleUp();//bubbleUp vanaf de laatste zie slides theorie
        return true;
    }

    private void bubbleUp() {
        int finalindex = values.size() - 1;
        while (values.get(finalindex).compareTo(values.get(((finalindex - 1) / 2))) < 0) {
            E parent = values.get(((finalindex - 1) / 2));
            values.set(((finalindex - 1) / 2), values.get(finalindex));
            values.set(finalindex, parent);
            finalindex = ((finalindex - 1) / 2);
        }
        //TO DO : oefening 4
    }

    public E removeSmallest() {
        if (this.isEmpty())
            throw new IllegalStateException("Kan niets verwijderen uit een lege boom");
        E res = this.getMin();// res bevat de kleinste = eerste element van de lijst
        this.values.set(0, this.values.get(this.values.size() - 1));// verwissel eerste met de laatste
        this.values.remove(this.values.size() - 1); // verwijder de laatste
        this.bubbleDown(); // bubble down van eerste naar beneden zie theorie
        return res;
    }

    private void bubbleDown() {
        int start = 0;
        E parent = values.get(0);
        E leftchild = values.get(1);
        E rightchild = values.get(2);
        while (((2 * start) + 1) < values.size() && (values.get(start).compareTo(leftchild) > 0 || values.get(start).compareTo(rightchild) > 0)) {

            if (leftchild.compareTo(rightchild) > 0) {
                values.set(values.indexOf(rightchild), parent);
                values.set(start, rightchild);
                start = 2 * start + 2;

            } else {
                values.set(values.indexOf(leftchild), parent);
                values.set(start, leftchild);
                start = 2 * start + 1;
            }
            this.print();
            parent = values.get(start);
            if (((2 * start) + 2) < values.size()) {
                leftchild = values.get((2 * start) + 1);
                rightchild = values.get((2 * start) + 2);
            }
        }
        // TODO zie oefening 5
    }

    public ArrayList<E> getPath(E value) {
        // TODO zie oefening 6;
        return null;
    }
}
