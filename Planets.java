/**
 * Created by user on 6/14/17.
 */
public class Planets {
    private String averageRadius; private float Mass;  private Integer Age;
    String getAverageRadius(){
        return averageRadius;}
    public float getMass() {
        return Mass;
    }
    public Integer getAge() {
        return Age;
    };
    Planets(String averageRadius , float  Mass,  int Age ){    }
    public void setAverageRadius(String averageRadius) {
        this.averageRadius = averageRadius;
    }

    public void setMass(float mass) {
        Mass = mass;
    }



    public void setAge(Integer age) {
        Age = age;
    }

   }







