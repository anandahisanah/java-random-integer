import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {        
        System.out.println("Bilangan acak : ");
        // define array 
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i < 5; i++) {
            // generate random number
            int randomNumber = (int)(Math.random() * 10);
            // print random number
            System.out.println(randomNumber);
            // add random number to array variable
            numbers.add(randomNumber);
        }
        System.out.println("Bilangan acak dalam array : " + numbers);
    }
}
