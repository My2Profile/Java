package Ex3;

public class Test {
    public static void main(String[] args) {
        MyCollection<String> collection = new MyCollectionImpl<>();
        collection.add("Hello");
        collection.add("World");
        System.out.println("Size: " + collection.size());
        System.out.println("Contains 'Hello': " + collection.contains("Hello"));
        collection.remove("Hello");
        System.out.println("Contains 'Hello' after remove: " + collection.contains("Hello"));
        collection.clear();
        System.out.println("Size after clear: " + collection.size());
    }
}