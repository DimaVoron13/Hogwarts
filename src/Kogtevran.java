public class Kogtevran extends Hogwarts {
    private int mind;
    private int wit;
    private int wisdom;
    private int creation;
    private int totalPoints;

    public Kogtevran(String name, int transgressionDistance, int thePowerOfMagic,
                     int mind, int wit, int wisdom, int creation) {
        super(name, transgressionDistance, thePowerOfMagic);
        this.mind = mind;
        this.wit = wit;
        this.wisdom = wisdom;
        this.creation = creation;
    }

    public int getTotalPoints() {
        return mind + wit + wisdom + creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public static void comparisonKogtevranStudent(Kogtevran first, Kogtevran second) {
        if (first.getTotalPoints() > second.getTotalPoints()) {
            System.out.println(first.getName() + " лучший Когтевранец чем " + second.getName());
        } else if (first.getTotalPoints() < second.getTotalPoints()) {
            System.out.println(second.getName() + " лучший Когтевранец чем " + first.getName());
        } else {
            System.out.println("Когтевранцы равны");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Ум - " + mind + " Мудрость - " + wit + " Остроумие - "
                + wisdom + " Творчество - " + creation;
    }
}
