public class Array28 {
    public static void main(String[] args) {
        
        String string = "MadhavKumar";

        System.out.println(string.length());
        System.out.println(string.charAt(5));

        // creating java string by new keyword this statement create two object i.e first the object is created in the heap memory area and second the object is created in the string constant pool.

        String str = new String("Krishna");
        System.out.println(str);

        // to make java more memeory efficient(because no new objects are created if it exists already in the string constant pool).

        String demoString = "Madhav";
        System.out.println(demoString);
        
        // it is a peer class of string that provides much of the functionality of strings. string represents fixed length, immutable character sequences while stringBuffer represents growable and writeable character sequences means it is mutable in nature and it is thread safe class, we can use it when we have multi threaded environment and shared object of string buffer i.e is used by multiple thread. as it is thread safe so there is extra overhead, so it is mainly used for multithreaded program.
        StringBuffer demBuffer = new StringBuffer("Hari");
        System.out.println(demBuffer);

        // stringBuilder in java represents a mutable sequence of characters. since the string class in java creates an immutable sequence of characters, the stringBuilder class provides an alternative to string class, as it creates a mutable sequence of characters and it is not thread safe and it is used only within the thread, so there is no extra overhead, so it is mainly used for single threaded program.
        StringBuilder stringBuilder = new StringBuilder("Ramjee");
        System.out.println(stringBuilder);

        StringBuilder demostringBuilder = new StringBuilder();
        demostringBuilder.append("Ranveer");
        System.out.println(demostringBuilder);
    }
}
