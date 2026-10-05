package Animalshop;

public class AnimalTester {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bailey", "Boerboel","arf-arf" ,80.02, "Golden");
        Fish fish= new Fish("Goldfish", "cold", "Red");
        
    
        
        System.out.println("Dog 1: Name: " + dog1.getName());
        System.out.println("Dog 1: Breed: " + dog1.getBreed());
        System.out.println("Dog 1: Noise: " + dog1.getBarkNoise());
        System.out.println("Dog 1: Weight: " + dog1.getWeight());
        System.out.println("Dog 1: Colour: " + dog1.getColour());


        System.out.println("Fish 1: Breed: " + fish.getBreed());
        System.out.println("Fish 1: Water Type: " + fish.getWaterType());
        System.out.println("Fish 1: Colour: " + fish.getColour());

    }   
}
