public class GenericBoxExcerciser {
    public static void main(String[] args) {

      GenericBox<Integer> integerBox = new GenericBox<>();
      GenericBox<String> stringBox = new GenericBox<>();
      stringBox.setT("Hello World");
      integerBox.setT(10);
        System.out.printf("Value of stringBox is: " + stringBox.getT());
        System.out.printf("\nValue of integerBox is: " + integerBox.getT());

    }
}
