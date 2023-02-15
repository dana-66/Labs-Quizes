
public class Engine {
   private  int id ;
   private  String style ;

    public Engine(int id, String style) {
        this.setId (id);
        this.setStyle(style);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
    public String toString (){
        return "Engine id = " +getId() +" and style is " +getStyle();
    }
}

class Car  {
    Engine motor ;
    String color ;

        public Car(Engine motor, String color) {
            this.motor = motor;
            this.color = color;
        }
    
         public Car(int id, String style , String color) {
            this.motor = new Engine (id , style);
            this.color = color;
        }
    

        public Engine getMotor() {
            return motor;
        }

        public void setMotor(Engine motor) {
            this.motor = motor;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
   
    @Override
        public String toString(){
            return "A car of color :" +getColor() +getMotor().toString();
        }
}
class TestCode {
    public static void main (String[]args){
        Engine one = new Engine(6565,"porche");
        Car two = new Car(6532,"BMW","black");
        System.out.println("the id of the motor of the car is " +two.getMotor().getId());
        System.out.println(two.toString());
    }
}
