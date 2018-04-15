import java.util.Scanner;
import java.util.Arrays;
class grade 
{
    public static void main(String[] args) {
        String grade [] = {"A+", "A", "A-", "B+", "B", "B-","C+", "C", "C-","D+", "D1", "D-", "F"};
        String numgrade [] = {"4", "4", "3.7", "3.3", "3", "2.7","2.3", "2", "1.7","1.3", "1", "0.7", "0"};
        System.out.print("Enter grade: ");
        Scanner s = new Scanner(System.in);
        String g = s.next();

        //need to conver array to arraylist to hae the method 'indexOf'
        int index = Arrays.asList(grade).indexOf(g);
        System.out.println("Numeric grad: "+numgrade[index]);
    }
}
