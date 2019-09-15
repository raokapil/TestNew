package codingWithMosh;

import java.util.LinkedList;

public class CustomHashTable {

    private class Entry{
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] entries;

    public CustomHashTable(int size) {
        this.entries = new LinkedList[size];
    }

    private void put(int key, String value) {
        int index = hash(key);

        if (entries[index] == null) {
            entries[index] = new LinkedList<>();
        }

        LinkedList<Entry> bucket = entries[index];

        for (Entry entry : bucket) {
            if (key == entry.key) {
                entry.value = value;
                return;
            }
        }

        bucket.add(new Entry(key, value));
    }

    private int hash(int key) {
        return Math.abs(key) % entries.length;
    }

    private String get(int key) {
        int index = hash(key);

        LinkedList<Entry> bucket = entries[index];
        if (bucket != null) {
            for (Entry entry : bucket){
                if (entry.key == key) {
                    return entry.value;
                }
            }
        }
        return null;
    }

    private void remove(int key)  {
        int index = hash(key);
        LinkedList<Entry> bucket = entries[index];
        if (bucket == null) {
            throw new IllegalStateException();
        }
        for (Entry entry : bucket) {
            if (entry.key == key) {
                bucket.remove(entry);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public static void main(String[] args) {

        CustomHashTable customHashTable = new CustomHashTable(5);
        customHashTable.put(6, "kapil");

        customHashTable.put(8, "vasu");

        customHashTable.put(11, "kavita");
        customHashTable.put(6, "Sunita");

        System.out.print(customHashTable.get(6));


    }


}
