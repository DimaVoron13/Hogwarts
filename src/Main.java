public class Main {

    public static void printStudentOfGryffindor(Gryffindor gryffindor) {
        System.out.println(gryffindor);
    }

    public static void comparisonStudent(Hogwarts first, Hogwarts second) {
        if (first.getTotalPoints() > second.getTotalPoints()) {
            System.out.println(first.getName() + " обладает бОльшей мощностью магии, чем "
                    + second.getName());
        } else if (first.getTotalPoints() < second.getTotalPoints()) {
            System.out.println(second.getName() + " обладает бОльшей мощностью магии, чем "
                    + first.getName());
        } else {
            System.out.println("Студенты равны");
        }
    }

    public static void main(String[] args) {
        Hogwarts[] student = {
                new Hogwarts("Гарри Поттер", 100, 100),
                new Hogwarts("Гермиона Грейнджер", 89, 76),
                new Hogwarts("Рон Уизли", 45, 34),
                new Hogwarts("Драко Малфой", 89, 67),
                new Hogwarts("Грэхэм Монтегю", 45, 45),
                new Hogwarts("Грегори Гойл", 45, 36),
                new Hogwarts("Захария Смит", 67, 23),
                new Hogwarts("Седрик Диггори", 89, 56),
                new Hogwarts("Джастин Финч-Флетчли", 37, 65),
                new Hogwarts("Чжоу Чанг", 73, 49),
                new Hogwarts("Падма Патил", 45, 28),
                new Hogwarts("Маркус Белби", 48, 10),
        };

        Gryffindor[] gryffindor = {
                new Gryffindor("Гарри Поттер", 100, 100, 100, 100, 100),
                new Gryffindor("Гермиона Грейнджер", 89, 76, 89, 56, 74),
                new Gryffindor("Рон Уизли", 45, 34, 65, 37, 29),
        };

        Hufflepuff[] hufflepuff = {
                new Hufflepuff("Захария Смит", 67, 23, 48, 38, 88),
                new Hufflepuff("Седрик Диггори", 89, 56, 56, 84, 30),
                new Hufflepuff("Джастин Финч-Флетчли", 37, 65, 78, 50, 33),
        };

        Slytherin[] slytherin = {
                new Slytherin("Драко Малфой", 89, 67, 22, 34, 56, 76, 29),
                new Slytherin("Грэхэм Монтегю", 45, 45, 67, 98, 37, 67, 54),
                new Slytherin("Грегори Гойл", 45, 36, 47, 78, 39, 59, 23),
        };

        Kogtevran[] kogtevran = {
                new Kogtevran("Чжоу Чанг", 73, 49, 47, 73, 88, 34),
                new Kogtevran("Падма Патил", 45, 28, 55, 77, 22, 93),
                new Kogtevran("Маркус Белби", 48, 10, 77, 30, 83, 29),
        };

        Gryffindor.comparisonGryffindorStudent(gryffindor[2], gryffindor[1]);
        System.out.println();
        Hufflepuff.comparisonHufflepuffStudent(hufflepuff[0], hufflepuff[1]);
        System.out.println();
        Slytherin.comparisonSlytherinStudent(slytherin[2], slytherin[1]);
        System.out.println();
        Kogtevran.comparisonKogtevranStudent(kogtevran[0], kogtevran[1]);
        System.out.println();
        printStudentOfGryffindor(gryffindor[1]);
        System.out.println();
        comparisonStudent(student[7], student[3]);
    }
}