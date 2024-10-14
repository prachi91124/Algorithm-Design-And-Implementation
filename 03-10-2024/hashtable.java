public class hashtable {
    public static void main(String[] args) {
        hashtableLinearProb h1 = new hashtableLinearProb(10);
        h1.insert("hello");
        h1.insert("h1");
        h1.insert("java");
        h1.insert("java2");
        h1.insert("java3");

        h1.display(); 
        hashtableQuadProb h2 = new hashtableQuadProb(10);
        h2.insert("hello");
        h2.insert("h1");
        h2.insert("java");
        h2.insert("java2");
        h2.insert("java3");

        h2.display(); 
    }
}

class hashtableLinearProb {
    String[] hashtable;
    int capacity;

    hashtableLinearProb(int cap) {
        hashtable = new String[cap];
        capacity = cap;
    }

    int hash(String key) {
        return Math.abs(key.hashCode() % capacity);
    }

    void insert(String key) {
        int hashIdx = hash(key);

        while (hashtable[hashIdx] != null) {
            hashIdx = (hashIdx + 1) % capacity;
        }
        hashtable[hashIdx] = key;
    }

    void display() {
        System.out.println("Hash Table:");
        for (int i = 0; i < capacity; i++) {
            if (hashtable[i] != null) {
                System.out.println("Slot " + i + ": " + hashtable[i]);
            } else {
                System.out.println("Slot " + i + ": null");
            }
        }
    }
}
class hashtableQuadProb {
    String[] hashtable;
    int capacity;

    hashtableQuadProb(int cap) {
        hashtable = new String[cap];
        capacity = cap;
    }

    int hash(String key) {
        return Math.abs(key.hashCode() % capacity);
    }

    void insert(String key) {
        int hashIdx = hash(key);
        int i = 1;

        while (hashtable[hashIdx] != null) {
            hashIdx = (hashIdx +i*i) % capacity;
            i++;
        }
        hashtable[hashIdx] = key;
    }

    void display() {
        System.out.println("Hash Table:");
        for (int i = 0; i < capacity; i++) {
            if (hashtable[i] != null) {
                System.out.println("Slot " + i + ": " + hashtable[i]);
            } else {
                System.out.println("Slot " + i + ": null");
            }
        }
    }
}
class hashtableSeparateChain{
    LinkedList<String>[] arr;
    int capacity;

    hashtableSeparateChain(int capacity){
        arr=new LinkedList[capacity];
        this.capacity = capacity;

        for(int i = 0; i< capacity; i++){
            arr[i] = new LinkedList<String>();
        }
    }   
    int hash(String key){
        return Math.abs(key.hashCode() % capacity);
    }
    void insert(String key){
        int hashIdx = hash(key);
        hashtable[hashIdx].add(key);
    }

    void display(){
        for(int i = 0; i < capacity; i++){
            for(String s: arr[i]){
                System.out.println(i+" "+ s);
            }
            System.out.println();
        }
    }
}