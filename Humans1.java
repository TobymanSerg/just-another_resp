/**
 * Created by user on 6/14/17.
 */
public class Humans1 implements MammalsInterface {
    private String Name;
    private int Age;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void jump(){
    System.out.println("20 См");
   }
   public Humans1(String Name,int Age){
       this.Name=Name ;
       this.Age=Age ;



   }
}
