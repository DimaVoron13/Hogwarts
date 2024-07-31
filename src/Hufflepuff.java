public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;
    private int totalPoints;

    public Hufflepuff(String name, int transgressionDistance, int thePowerOfMagic,
                      int hardWork, int loyalty, int honesty) {
        super(name, transgressionDistance, thePowerOfMagic);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getTotalPoints() {
        return hardWork + loyalty + honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public static void comparisonHufflepuffStudent(Hufflepuff first, Hufflepuff second) {
        if (first.getTotalPoints() > second.getTotalPoints()) {
            System.out.println(first.getName() + " лучший Пуффендуец чем " + second.getName());
        } else if (first.getTotalPoints() < second.getTotalPoints()) {
            System.out.println(second.getName() + " лучший Пуффендуец чем " + first.getName());
        } else {
            System.out.println("Пуффендуйцы равны");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Трудолюбие - " + hardWork + " Верность - " + loyalty
                + " Честность - " + honesty;
    }
}
