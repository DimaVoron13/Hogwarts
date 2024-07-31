public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;
    private int totalPoints;

    public Slytherin(String name, int transgressionDistance, int thePowerOfMagic,
                     int cunning, int determination, int ambition, int resourcefulness,
                     int lustForPower) {
        super(name, transgressionDistance, thePowerOfMagic);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getTotalPoints() {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public static void comparisonSlytherinStudent(Slytherin first, Slytherin second) {
        if (first.getTotalPoints() > second.getTotalPoints()) {
            System.out.println(first.getName() + " лучший Слизеринец чем " + second.getName());
        } else if (first.getTotalPoints() < second.getTotalPoints()) {
            System.out.println(second.getName() + " лучший Слизеринец чем " + first.getName());
        } else {
            System.out.println("Слизеринцы равны");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Хитрость - " + cunning + " Решительность - "
                + determination + " Амбициозность - " + ambition + " Находчивость - "
                + resourcefulness + " Жажда власти - " + lustForPower;
    }
}
