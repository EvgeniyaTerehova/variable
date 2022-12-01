public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача1");
        //
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("Задача2");
        //
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 4;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }

    public static void task3() {
        System.out.println("Задача3");
        //
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeightOfBoxer = boxer1 + boxer2;
        System.out.println("Общий вес боксёров составляет" + totalWeightOfBoxer + "кг");
        var differenceWeightOfBoxer = boxer2 - boxer1;
        System.out.println("Разница в весе боксёров составляет" + differenceWeightOfBoxer + "кг");
        var differenceWeight = (boxer2 / boxer1) % totalWeightOfBoxer;
        System.out.println("Разница в весе боксёров составляет" + differenceWeight + "кг");

    }

    public static void task4() {
        System.out.println("Задача4");
        var totalWorkingHours = 640;
        var workingHours1Employee = 8;
        var totalEmployeesInTheCompany = totalWorkingHours / workingHours1Employee;
        System.out.println("Всего работников в компании - " + totalEmployeesInTheCompany + "человек");
        var additionalStaff = 94;
        var increasedNumberOfEmployees = totalEmployeesInTheCompany + additionalStaff;
        var newWorkingHoursForEmployees = totalWorkingHours / increasedNumberOfEmployees;
        System.out.println("Если в компании работает" + increasedNumberOfEmployees + "человек, то всего по"  + newWorkingHoursForEmployees +  "часа работы может быть поделено между сотрудниками." );
        var totalWorkingHours2 = increasedNumberOfEmployees * workingHours1Employee;
        System.out.println("Если в компании работает" + increasedNumberOfEmployees + "человек, то всего" + totalWorkingHours2 + "часов работы может быть поделено между сотрудниками.");


    }
}

