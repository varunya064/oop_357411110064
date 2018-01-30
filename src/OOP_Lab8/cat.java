package OOP_Lab8;

public class cat extends Pet {
    private String breed;

    public cat(String name, int age,String breed) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "cat{" +
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
        System.out.println("meaw-meaw");



    }
}