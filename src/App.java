public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
    public static void insertionSort (int[] arr) {
        arr.length;
        int n =
        for (int i
        =
        int key =
        1; i < n; i++) {
        arr[i]; // Seleccionamos el elemento a insertar en su posición correcta
        int j = i - 1;
        // Movemos los elementos mayores que key a una posición adelante de su posición
        // actual
        while (j >= 0 && arr[j] > key) {
        arr[j+1] = arr[j];
        j--;
        }
        arr[j+1] = key; // Insertamos key en su posición correcta
}
