public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int cat = 10;
        System.out.println("Значение переменной cat с типом int равно " + cat);
        byte dog = 20;
        System.out.println("Значение переменной dog с типом int равно " + dog);
        short mouse = 30;
        System.out.println("Значение переменной mouse с типом int равно " + mouse);
        long bear = 40;
        System.out.println("Значение переменной bear с типом int равно " + bear);
        float puppy = 50;
        System.out.println("Значение переменной puppy с типом int равно " + puppy);
        double rabbit = 60;
        System.out.println("Значение переменной rabbit с типом int равно " + rabbit);

        System.out.println("Задача 2");
        float a = 27.12F;
        System.out.println(a);
        long b = 987_678_965_549L;
        System.out.println(b);
        double c = 2.786;
        System.out.println(c);
        int d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        int f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);

        System.out.println("Задача 3");
        byte firstTeacher = 23;
        byte secondTeacher = 27;
        byte thirdTeacher = 30;
        short paper = 480;
        byte totalStudents = (byte) (firstTeacher + secondTeacher + thirdTeacher);
        byte perStudent = (byte) (paper / totalStudents);
        System.out.println("На каждого ученика рассчитано " + perStudent + " листов бумаги");

        System.out.println("Задача 4");
        byte bottles = 16;
        byte minutes = 2;
        byte minute = (byte) (bottles / minutes);
        byte firstTime = 20;
        short secondTime = 1440;
        short thirdTime = 4320;
        int fourthTime = 43200;
        short firstSolution = (short) (minute * firstTime);
        System.out.println("За " + firstTime + " минут машина произвела " + firstSolution + " штук бутылок");
        short secondSolution = (short) (minute * secondTime);
        System.out.println("За " + secondTime + " минут машина произвела " + secondSolution + " штук бутылок");
        long thirdSolution = minute * thirdTime;
        System.out.println("За " + thirdTime + " минут машина произвела " + thirdSolution + " штук бутылок");
        int fourthSolution = minute * fourthTime;
        System.out.println("За " + fourthTime + " минут машина произвела " + fourthSolution + " штук бутылок");

        System.out.println("Задача 5");
        byte aA = 120;
        byte bB = 2;
        byte cC = 4;
        byte forOneClass = (byte) (bB + cC);
        byte classes = (byte) (aA / forOneClass);
        byte totalWhitePaint = (byte) (classes * bB);
        byte totalBrownPaint = (byte) (classes * cC);
        System.out.println("В школе, где " + forOneClass + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");

        System.out.println("Задача 6");
        short aB = 5 * 80;
        short bC = 2 * 105;
        short cD = 2 * 100;
        short dF = 4 * 70;
        short weightGr = (short) (aB + bC + cD + dF);
        int grPerKg = 1000;
        float weightKg = (float) weightGr / grPerKg;
        System.out.println(weightGr + " грамм");
        System.out.println(weightKg + " килограмм");

        System.out.println("Задача 7");
        byte weightKgNew = 7;
        int grPerKgNew = 1000;
        float weightGrNew = weightKg * (float) grPerKgNew;
        short w = 250;
        short t = 500;
        byte theFirstOption = (byte) (weightGrNew / w);
        byte theSecondOption = (byte) (weightGrNew / t);
        int theAverageValue = (byte) ((theFirstOption + theSecondOption) / 2);
        System.out.println(theFirstOption + " дня уйдет на похудение, если спортсмен будет терять каждый день по " + w + " грамм");
        System.out.println(theSecondOption + " дня уйдет на похудение, если спортсмен будет терять каждый день по " + t + " грамм");
        System.out.println(theAverageValue + " дня в среднем потребуется, чтобы добиться результата похудения");

        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float mashaYear = masha * 12;
        float denisYear = denis * 12;
        float kristinaYear = kristina * 12;
        float mashaPercent = (float) (mashaYear * 1.1);
        float denisPercent = (float) (denisYear * 1.1);
        float kristinaPercent = (float) (kristinaYear * 1.1);
        float mashaA = mashaPercent - mashaYear;
        float denisA = denisPercent - denisYear;
        float kristinaA = kristinaPercent - kristinaYear;
        float mashaB = mashaA - masha;
        float denisB = denisA - denis;
        float kristinaB = kristinaA - kristina;
        int mashaC = (int) (mashaB * 12);
        int denisC = (int) (denisB * 12);
        int kristinaC = (int) (kristinaB * 12);
        System.out.println("Маша теперь получает " + mashaA + " рублей. Годовой доход вырос на " + mashaC + " рублей");
        System.out.println("Денис теперь получает " + denisA + " рублей. Годовой доход вырос на " + denisC + " рублей");
        System.out.println("Кристина теперь получает " + kristinaA + " рублей. Годовой доход вырос на " + kristinaC + " рублей");

    }
}