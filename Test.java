public class Test{
    public static void main(String[] args) {
        byte bv = 127;
        short sv = 367;
        int iv = 2147;
        long lv = 21477;
        float fv = 2147.7f;
        double dv = 2147.77;
        char cv = 'A';
        boolean blv = true;
        System.out.println(((Object)fv).getClass().getName());

        Byte b = 2;
        // Unboxing from Byte to byte
        byte b2 = b.byteValue(); 
        // Also we can do the following: 
        // shortValue intValue longValue floatValue doubleValue
        String st = b.toString(); // --> Byte to String
        byte b3 = Byte.parseByte("2"); // String --> byte
        System.out.println(b);
    }
}