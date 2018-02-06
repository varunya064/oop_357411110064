package OOP_Lab9;

public class myCarApp {
    public static void main(String[] args) {
      Engine engine=new Engine("15000cc","V-tec V4");


      //car

        Car car=new Car("Honda","black",engine);

        System.out.print(car.toString());

        Car car1=new Car("Honda","Red",engine);
        System.out.print(car.toString());



    }
}



