package OOP_Lab8;

public class Dog extends Pet {
    private String breed;

    public Dog(String name, int age,String breed) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}'+super.toString();
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Ba-huu Ba-huu");



    }
}
