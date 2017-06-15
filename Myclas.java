/**
 * Created by user on 6/14/17.
 */
public class Myclas {
    private String averageRadius; private float Mass;  private Integer Age;
    String getAverageRadius(){
        return averageRadius;}
    public float getMass() {
        return Mass;
    }
    public Integer getAge() {
        return Age;
    };
    Myclas(String averageRadius , float  Mass,  int Age ){    }
    public void setAverageRadius(String averageRadius) {
        this.averageRadius = averageRadius;
    }

    public void setMass(float mass) {
        Mass = mass;
    }



    public void setAge(Integer age) {
        Age = age;
    }



public static void main(String[] args) {
        Myclas Earth = new Myclas("6371,0 км",10000000,137);
        String averageRadiusEarth = Earth.getAverageRadius();
        System.out.println(averageRadiusEarth);}}

