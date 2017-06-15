import java.util.Scanner;

/**
 * Created by user on 6/14/17.
 */
public class Integer_value implements  Observerable  {
    Integer_value(){};
    public int ans= Integer.parseInt(getnans());

    void Change(){};

    public static String getnans(){
        Scanner scanner = new Scanner(System.in);
        String nans = scanner.nextLine();
        return nans;
    }
}
