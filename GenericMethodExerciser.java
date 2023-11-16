public class GenericMethodExerciser extends GenericMethod{
    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
        Character[] characterArray = {'H','E','L','L','O'};

        System.out.println("Integer array contains:");
        printArray(integerArray);
        System.out.println("Double array contains:");
        printArray(doubleArray);
        System.out.println("Character array contains:");
        printArray(characterArray);
    }
}
