/**
 * Created by user on 6/14/17.
 */
public class Strings1 {
    public static void main(String[] args){
    String teststring= new String("это новая строка");
    System.out.println(teststring);
        System.out.println(teststring.length());
        System.out.println(teststring.equals("Это моя новая строка"));
        teststring= teststring.concat(" а также симаолы : @ # $");
        System.out.println(teststring);
        System.out.println(teststring.indexOf("н"));
        System.out.println(teststring.lastIndexOf("н"));
        teststring= teststring.replace("ы","у" );
        System.out.println(teststring);



};}
