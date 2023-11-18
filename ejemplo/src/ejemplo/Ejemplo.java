
package ejemplo;
import java.lang.*; //Esta línea importa todas las clases e interfaces 
//del paquete java.lang. El * después de java.lang es un comodín que indica 
//que se deben importar todas las clases e interfaces directamente contenidas 
//en el paquete java.lang.


public class Ejemplo {

    public static void main(String[] args) {
         // Interfaces
        Cloneable cloneableObj = new CloneableObject();
        Comparable<Integer> comparableObj = 10;
        Iterable<String> iterableObj = new StringList();
        Runnable runnableObj = new RunnableObject();
        CharSequence charSequenceObj = "Hello, World!";

        // Clases
        double squareRoot = Math.sqrt(16);
        String message = new String("Hello");
        Boolean isTrue = new Boolean(true);
        StringBuilder stringBuilder = new StringBuilder("Hello");
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // Excepciones
        try {
            int result = 1 / 0; // Division by zero
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }

        try {
            int[] arr = {1, 2, 3};
            int value = arr[5]; // Accessing out-of-bounds index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        try {
            String str = null;
            int length = str.length(); // Accessing length of null reference
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }

        try {
            String numStr = "abc";
            int num = Integer.parseInt(numStr); // Parsing a non-numeric string
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }

        throw new RuntimeException("This is a runtime exception");
    }
}

// Implementación de la interfaz Cloneable
class CloneableObject implements Cloneable {
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

// Implementación de la interfaz Iterable
class StringList implements Iterable<String> {
    private String[] strings = {"Hello", "World", "!"};

    @Override
    public java.util.Iterator<String> iterator() {
        return new StringIterator();
    }

    private class StringIterator implements java.util.Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < strings.length;
        }

        @Override
        public String next() {
            return strings[index++];
        }
    }
}

// Implementación de la interfaz Runnable
class RunnableObject implements Runnable {
    @Override
    public void run() {
        System.out.println("RunnableObject is running");
    }
}
    
    

