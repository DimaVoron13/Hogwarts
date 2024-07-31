public class Hogwarts {
    private final String name;
    private int thePowerOfMagic;
    private int transgressionDistance;
    private int totalPoints;

    public Hogwarts(String name, int thePowerOfMagic, int transgressionDistance) {
        this.name = name;
        this.transgressionDistance = transgressionDistance;
        this.thePowerOfMagic = thePowerOfMagic;
    }

    public int getTotalPoints() {
        return thePowerOfMagic + transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getThePowerOfMagic() {
        return thePowerOfMagic;
    }

    public void setThePowerOfMagic(int thePowerOfMagic) {
        this.thePowerOfMagic = thePowerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return "Юный чародей " + name + " : Сила магии - " + thePowerOfMagic
                + " Расстояние трансгрессии - " + transgressionDistance;
    }

}
