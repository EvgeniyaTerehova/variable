public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }
    public static void task1() {
        System.out.println("задача 1");
        int a = 700000;
        System.out.println("Значение переменной a с типом int равно" + a);
        byte b = 100;
        System.out.println("Значение переменной b с типом byte равно" + b);
        short c = 30000;
        System.out.println("Значение переменной c с типом short равно" + c);
        long d = 245976314852L;
        System.out.println("Значение переменной d с типом long равно" + d);
        float e = 5.32f;
        System.out.println("Значение переменной e с типом float равно" + e);
        double f = 8.987;
        System.out.println("Значение переменной f с типом double равно" + f);

    }
    public static void task2(){
        System.out.println("задача 2");
        float n = 27.12f;
        System.out.println(n);
        long y = 98767965549L;
        System.out.println(y);
        double u = 2.786;
        System.out.println(u);
        short o = 569;
        System.out.println(o);
        short z = -159;
        System.out.println(z);
        int p = 27897;
        System.out.println(p);
        byte t = 67;
        System.out.println(t);

    }

    public static void task3() {
        System.out.println("задача 3");
        byte classLP = 23;
        byte classAS = 27;
        byte classEA = 30;
        short totalSheets = 480;
        int namberOfStudents = classLP + classAS + classEA;
        int namberOfSheetsPerStudent = totalSheets / namberOfStudents;
        System.out.println("На каждого ученика рассчитано" + namberOfSheetsPerStudent + "листов бумаги");
    }
    public static void task4() {
        System.out.println("задача 4");
        byte namberOfBottelsIn2Minutes = 16;
        int namberOfBottelsInPerMinute = namberOfBottelsIn2Minutes / 2;
        int namberOfBottelsIn20Minutes = namberOfBottelsInPerMinute *20;
        System.out.println("За 20 минут машина произвела" + namberOfBottelsIn20Minutes + "штук бутылок");
        int namberOfBottelsInPerHouer = namberOfBottelsInPerMinute *60;
        int namberOfBottelsInPerDay = namberOfBottelsInPerHouer *24;
        System.out.println("За сутки машина произвела" + namberOfBottelsInPerDay + "штук бутылок");
        int namberOfBottelsIn3Days = namberOfBottelsInPerDay * 3;
        System.out.println("За 3 дня машина произвела" + namberOfBottelsIn3Days + "штук бутылок");
        int namberOfBottelsInPerMonth = namberOfBottelsInPerDay * 30;
        System.out.println("За месяц машина произвела" + namberOfBottelsInPerMonth + "штук бутылок");
    }
    public static void task5() {
        System.out.println("задача 5");
        short totalCansOf2ColorsOfPaint = 120;
        byte whitePaintOfOneClass = 2;
        byte brownPaintOfOneClass = 4;
        int numberOfCansOfPaintPerClass = whitePaintOfOneClass + brownPaintOfOneClass;
        int classesAtSchool = totalCansOf2ColorsOfPaint / numberOfCansOfPaintPerClass;
        int allWhitePaint = whitePaintOfOneClass * classesAtSchool;
        int allBrownPaint = brownPaintOfOneClass * classesAtSchool;
        System.out.println("В школе, где" + classesAtSchool + "классов, нужно" + allWhitePaint + "банок белой краски и" + allBrownPaint + "анок коричневой краски");
    }
    public static void task6() {
        System.out.println("задача 6");
        byte weight1Banana = 80;
        int weight5Banana = weight1Banana * 5;
        short weightMilk100Ml = 105;
        int weightMilk200Ml = weightMilk100Ml * 2;
        short weightIceCreamBar = 100;
        int weight2IceCreamBar = weightIceCreamBar * 2;
        short eggWeight = 70;
        int weight4Eggs = eggWeight * 4;
        int athleteBreakfastWeight = weight5Banana + weightMilk200Ml + weight2IceCreamBar + weight4Eggs;
        System.out.println("Вес спортзавтрака составляет" + athleteBreakfastWeight + "граммов");
        float athleteBreakfastWeightInKg = athleteBreakfastWeight / 1000f;
        System.out.println("Вес спортзавтрака составляет" + athleteBreakfastWeightInKg + "килограмм");
    }
    public static void task7() {
        System.out.println("задача 7");
        byte weightForWeightLoss = 7;
        int weightForWeightLossInGrams = weightForWeightLoss * 1000;
        short weightLossPerDay1 = 250;
        short weightLossPerDay2 = 500;
        int namberOfDaysToLose250GramsPerDay = weightForWeightLossInGrams / weightLossPerDay1;
        System.out.println(namberOfDaysToLose250GramsPerDay + "дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
        int namberOfDaysToLose500GramsPerDay = weightForWeightLossInGrams / weightLossPerDay2;
        System.out.println(namberOfDaysToLose500GramsPerDay + "дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм");
        int averageNumberOfDaysToLoseWeight = (namberOfDaysToLose250GramsPerDay + namberOfDaysToLose500GramsPerDay) / 2;
        System.out.println("может потребоваться"  + averageNumberOfDaysToLoseWeight +  "день в среднем, чтобы добиться результата похудения");
    }
    public static void task8() {
        System.out.println("задача 8");
        int salaryPerMonthMasha = 67760;
        int salaryPerMonthDenis = 83690;
        int salaryPerMonthKristina = 76230;
        int annualIncomeMasha = salaryPerMonthMasha * 12;
        int annualIncomeDenis = salaryPerMonthDenis * 12;
        int annualIncomeKristina = salaryPerMonthKristina * 12;
        int percentOfSaiaryMasha = salaryPerMonthMasha *10 /100;
        int percentOfSaiaryDenis = salaryPerMonthDenis *10 /100;
        int percentOfSaiaryKristina = salaryPerMonthKristina *10 /100;
        int increasedSalaryMasha = salaryPerMonthMasha + percentOfSaiaryMasha;
        int increasedSalaryDenis = salaryPerMonthDenis + percentOfSaiaryDenis;
        int increasedSalaryKristina = salaryPerMonthKristina + percentOfSaiaryKristina;
        int increasedAnnualIncomeMasha = increasedSalaryMasha * 12;
        int increasedAnnualIncomeDenis = increasedSalaryDenis *12;
        int increasedAnnualIncomeKristina = increasedSalaryKristina * 12;
        int byHowMuchDidTheAnnuaiIncomeIncreaseMasha = increasedAnnualIncomeMasha - annualIncomeMasha;
        System.out.println("Маша теперь получает" + increasedSalaryMasha + "рублей. Годовой доход вырос на" + byHowMuchDidTheAnnuaiIncomeIncreaseMasha + "рублей");
        int byHowMuchDidTheAnnuaiIncomeIncreaseDenis = increasedAnnualIncomeDenis - annualIncomeDenis;
        System.out.println("Денис теперь получает" + increasedSalaryDenis + "рублей. Годовой доход вырос на" + byHowMuchDidTheAnnuaiIncomeIncreaseDenis + "рублей");
        int byHowMuchDidTheAnnuaiIncomeIncreaseKristina = increasedAnnualIncomeKristina - annualIncomeKristina;
        System.out.println("Кристина теперь получает" + increasedSalaryKristina + "рублей. Годовой доход вырос на" + byHowMuchDidTheAnnuaiIncomeIncreaseKristina + "рублей");






    }

}