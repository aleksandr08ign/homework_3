public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1.");
        int age = 32;
        System.out.println("Если возраст человека равен " + age);
        if (age >= 18) {
            System.out.println("он совершеннолетний");
        } else {
            System.out.println(" он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("Задача 2.");
        int temperature = 5;
        System.out.println("На улице  " + temperature + " градусов");
        if (temperature < 5) {
            System.out.println("нужно надеть шапку");
        } else {
            System.out.println("можно идти без шапки");
        }

        System.out.println("Задача 3.");
        int speed = 90;
        System.out.println("Если скорость  " + speed + " км/ч");
        if (speed > 60) {
            System.out.println("то придется заплатить штраф");
        } else {
            System.out.println("то можно ездить спокойно");
        }

        System.out.println("Задача 4.");
        int age4 = 3;
        System.out.println("Если возраст человека равен  " + age4);
        if (age4 < 2) {
            System.out.println("то ему пора спать!");
        }
        if (age4 >= 2 && age4 <= 6) {
            System.out.println("то ему нужно ходить в детский сад.");
        }
        if (age4 > 7 && age4 < 18) {
            System.out.println("то ему нужно ходить в школу.");
        }
        if (age4 >= 18 && age4 < 24) {
            System.out.println("то его место в университете.");
        }
        if (age4 > 24 && age4 < 60) {
            System.out.println("то ему нужно ходить на работу.");
        }
        if (age4 >= 60) {
            System.out.println("то ему пора отдохнуть.");
        }

        System.out.println("Задача 5.");
        int age5 = 4;
        System.out.println("Если возраст ребенка равен  " + age5);
        if (age5 < 5) {
            System.out.println("то ему нельзя кататься на аттракционе!");
        } else if (age5 >= 5 && age5 < 14) {
            System.out.println("то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        System.out.println("Задача 6.");
        int SeatsOccupied = 98;

        int NumberOfSeats = 102;
        int seating = 60;
        int StandingPlaces = NumberOfSeats - seating;
        if (NumberOfSeats <= SeatsOccupied) {
            System.out.println("Свобоных мест в вагоне нет!");
        } else {
            System.out.println("В вагоне имеется " + (NumberOfSeats - SeatsOccupied) + " свободных мест! ");
        }
        if (SeatsOccupied < NumberOfSeats && SeatsOccupied < seating) {
            System.out.println("из них " + (seating - SeatsOccupied) + (" сидячих мест и ") + StandingPlaces + (" стоячих."));
        }
        if (SeatsOccupied < NumberOfSeats && SeatsOccupied >= seating) {
            System.out.println("Сидячих мест нет! Свободны " + (NumberOfSeats - SeatsOccupied) + (" стоячих."));
        }

                    System.out.println("Задача 7.");
            int one = 1;
            int two = 2;
            int three = 3;
            if (one >= two && one >= three) {
                System.out.println("Самое большое число " + one);
            } else if (two >= one && two >= three) {
                System.out.println("Самое большое число " + two);
            } else {
                System.out.println("Самое большое число " + three);
            }
        }
    }