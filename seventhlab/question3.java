public class question3 {
    public static void main(String[] args) {
        int intPrimitive = 10;
        Integer intObject = intPrimitive; 

        double doublePrimitive = 20.5;
        Double doubleObject = doublePrimitive; 

        char charPrimitive = 'A';
        Character charObject = charPrimitive;

        boolean booleanPrimitive = true;
        Boolean booleanObject = booleanPrimitive;

        long longPrimitive = 1000L;
        Long longObject = longPrimitive; 

        float floatPrimitive = 15.75f;
        Float floatObject = floatPrimitive; 

        short shortPrimitive = 5;
        Short shortObject = shortPrimitive; 

        byte bytePrimitive = 127;
        Byte byteObject = bytePrimitive; 

        int unboxedInt = intObject; 
        double unboxedDouble = doubleObject; 
        char unboxedChar = charObject; 
        boolean unboxedBoolean = booleanObject; 
        long unboxedLong = longObject;
        float unboxedFloat = floatObject; 
        short unboxedShort = shortObject; 
        byte unboxedByte = byteObject; 

        System.out.println("Autoboxing:");
        System.out.println("intObject: " + intObject);
        System.out.println("doubleObject: " + doubleObject);
        System.out.println("charObject: " + charObject);
        System.out.println("booleanObject: " + booleanObject);
        System.out.println("longObject: " + longObject);
        System.out.println("floatObject: " + floatObject);
        System.out.println("shortObject: " + shortObject);
        System.out.println("byteObject: " + byteObject);

        System.out.println("\nUnboxing:");
        System.out.println("unboxedInt: " + unboxedInt);
        System.out.println("unboxedDouble: " + unboxedDouble);
        System.out.println("unboxedChar: " + unboxedChar);
        System.out.println("unboxedBoolean: " + unboxedBoolean);
        System.out.println("unboxedLong: " + unboxedLong);
        System.out.println("unboxedFloat: " + unboxedFloat);
        System.out.println("unboxedShort: " + unboxedShort);
        System.out.println("unboxedByte: " + unboxedByte);
    }
}
