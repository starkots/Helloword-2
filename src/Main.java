import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет Мир");



        System.out.println("Задача 1");


            // используем тип переменной var
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
             var papaer = 763793;
        System.out.println(papaer);
        papaer = papaer + 7639;
        System.out.println(papaer);



        System.out.println("Задача 2");

//используем переменную var
            var friend = 19;
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);






        System.out.println("Задача 3");

//используем переменную var
            var frog = 3.5;
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);



        System.out.println("Задача 4");

            // используем тип переменной var

            var boks = 78.2;
            var boks2 = 82.7;
            var boks3Left = boks + boks2;
            System.out.println(" Общий вес " + boks3Left + " кг ");

            var boks3 = 78.2;
            var boks4 = 82.7;
            var boksWeight = boks3 / boks4;
            System.out.println(" Общий вес " + boksWeight);

        System.out.println("Задача 5");

            var time = 640;
            var time1 = 8;
            var timeLeft = time / time1;
            System.out.println(" Всего работников в компании " + timeLeft);

        System.out.println("Задача 6");


            var sotrudnik = 80;
            var sotrudnik1 = 94;
            var sotrudnikLeft = sotrudnik + sotrudnik1;
            var sotrudnik2 = 174;
            var sotrudnik3 = 8;
            var sotrudnikWeight = sotrudnik2 / sotrudnik3;
            System.out.println(" Если в компании работает " + sotrudnikLeft + " человека то всего " + sotrudnikWeight + " час работы может быть поделено между сотрудниками ");

            //Считаем перенменные var

        //...

        System.out.println("Задача 7");

        //
        int a = 569;
        byte b = 67;
        short c = -159;
        long e = 987678965549L;
        float g = 27.12f;
        double  f = 2.786;
        char j = 27897;

        System.out.println("Задача 8");

        int schollLP = 23;
        int schollAS = 27;
        int scholl = 30;
        int classL = 480;

        int classL1 = schollLP + schollAS + scholl;
        System.out.println(classL1);

        int classL3 = classL / classL1;

        System.out.println(classL3);

        System.out.println("Задача 9");

        int bat = 16;
        int min = 2;
        int etime = bat / min;
        int etime2 = etime * 20;;
        int etime4 = etime2 * 24;
        int etime5 = etime4 * 3;
        int etime6 = etime5 * 10;

        System.out.println("За 20 минут машина произвела " + etime2 + " штук бутылок");
        System.out.println("За сутки машина произвела " + etime4 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + etime5 + " штук бутылок");
        System.out.println("За месяц машина произвела " + etime6 + " штук бутылок");

        System.out.println("Задача 10");

        int BKol = 120;
        int white = 2;
        int kor = 4;
        int ob = BKol / (white + kor);
        int white1 = white * ob;
        int kor1 = kor * ob;

        System.out.println("В школе, где " + ob + " классов, нужно " + white1 + " банок белой краски и " + kor1 +  " банок коричневой краски");


        System.out.println("Задача 11");

        int bananas1  = 5;
        int milk = 2;
        int IceCream = 2;
        int egg = 4;
        int WeightBanana = 80;
        int WeightMilk = 105;
        int WeightIceCream = 100;
        int WeightEgg = 70;

        int totalWeightGr = bananas1 * WeightBanana + milk * WeightMilk + WeightIceCream * IceCream + egg * WeightEgg;
        double totalWeightKG = totalWeightGr / 1_000;
        System.out.println("Общий вес в граммах " + totalWeightGr + " в кг " + totalWeightKG);

        // есть вопросы



        System.out.println("Задача 12");

        int weightForLossInGrams = 7_000;
        int DayMin = 250;
        int  DayMax = 500;
        double maxDays = weightForLossInGrams / DayMax;
        double minDays = weightForLossInGrams / DayMin;
        double weightLoss = (DayMin + DayMax) / 20;
        double daysCount = weightForLossInGrams / weightLoss;

        System.out.println("Минимальное кол-во дней для похудения " + minDays);
        System.out.println("Минимальное кол-во дней для похудения " + maxDays);
        System.out.println("Минимальное кол-во дней для похудения " + daysCount);

        // не понятна задача под разбор


        System.out.println("Задача 13");

          int Masha = 67_760;
           int Denis = 83_690;
           int Kristina = 76_230;

           double indexSe = 1.1;

           double newMasha = Masha * indexSe;
           double newDenis = Denis * indexSe;
           double newKristina = Kristina * indexSe;

           double newM1 = 12 * Masha;
           double newM2 = 12 * newM1;

           double newD1 = 12 * Denis;
           double newD2 = 12 * newD1;

           double newK1 = 12 * Kristina;
           double newK2 = 12 * newK1;

           System.out.println("«Маша теперь получает " + newMasha + " рублей. Годовой доход вырос на " + (newM2 - newM1) + "рублей");
        System.out.println("«Маша теперь получает " + newDenis + "рублей. Годовой доход вырос на " + (newD2 - newD1) + " рублей»");
        System.out.println("«Маша теперь получает " + newKristina + " рублей. Годовой доход вырос на " + (newK2 - newK1) + " рублей»");

        // не совсем ясна задача надо разбирать












    }


    }