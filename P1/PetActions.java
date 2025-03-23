class PetActions {
    public String makeSound(String petType) {
        if (petType.equalsIgnoreCase("Dog")) {
            return "Woof! Woof!";
        } else if (petType.equalsIgnoreCase("Cat")) {
            return "Meow!";
        } else {
            return "Unknown pet sound.";
        }
    }

    public String eat() {
        return "The pet is eating.";
    }
}