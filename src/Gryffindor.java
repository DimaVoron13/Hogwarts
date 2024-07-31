public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;
    private int totalPoints;

    public Gryffindor(String name, int transgressionDistance, int thePowerOfMagic,
                      int nobility, int honor, int bravery) {
        super(name, transgressionDistance, thePowerOfMagic);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getTotalPoints() {
        return nobility + honor + bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public static void comparisonGryffindorStudent(Gryffindor first, Gryffindor second) {
        if (first.getTotalPoints() > second.getTotalPoints()) {
            System.out.println(first.getName() + " лучший Гриффиндорец чем " + second.getName());
        } else if (first.getTotalPoints() < second.getTotalPoints()) {
            System.out.println(second.getName() + " лучший Гриффиндорец чем " + first.getName());
        } else {
            System.out.println("Гриффиндорцы равны");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Благородство - " + nobility + " Честь - " + honor
                + " Храбрость - " + bravery;
    }
}
