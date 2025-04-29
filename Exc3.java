public class Exc3 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50};

        try{
            System.out.println("Access an element: " + arr[2]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index access!");
        }
    }
}
