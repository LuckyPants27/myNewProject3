public class Main {
    public static void main(String[] args) {

        int age = 32;
        if (age >= 18) {
            System.out.println("Если возраст человека равен "+age+", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен "+age+", то он не достиг совершеннолетия, нужно немного подождать");
        }


        int temperature = 17;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }


        int speed = 80;
        if (speed > 60) {
            System.out.println("Если скорость "+speed+", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость "+speed+", то можно ездить спокойно");
        }


        age = 11;
        if (age <= 24) {
            if (age >= 2 && age <= 6) {
                System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в детский сад");
            }
            if (age >= 7 && age <= 17) {
                System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в школу");
            }
            if (age >= 18) {
                System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в университет");
            }
        } else {
            System.out.println("Если возраст человека равен "+age+", то ему пора ходить на работу");
        }


        age = 17;
        if (age >= 5) {
            if (age <= 14) {
                System.out.println("Если возраст ребенка равен "+age+", то ему можно кататься на аттракционе в сопровождении взрослого");
            } else {
                System.out.println("Если возраст ребенка равен "+age+", то ему можно кататься на аттракционе без сопровождения взрослого");
            }
        } else {
            System.out.println("Если возраст ребенка равен "+age+", то ему нельзя кататься на аттракционе");
        }


        int totalPlaces = 120;
        int seatPlaces = 60;
        int standPlaces = totalPlaces - seatPlaces;
        int takenSeatPlaces = 25;
        int takenStandPlaces = 45;
        int freeSeatPlaces = seatPlaces - takenSeatPlaces;
        int freeStandPlaces = standPlaces - takenStandPlaces;
        if (freeStandPlaces == 0 && freeSeatPlaces == 0) {
            System.out.println("В вагоне нет мест");
        }
        if (freeSeatPlaces > 0) {
            System.out.println("В вагоне есть "+freeSeatPlaces+" сидячих мест");
        }
        if (freeStandPlaces > 0) {
            System.out.println("В вагоне есть "+freeStandPlaces+" стоячих мест");
        }


        int one = 5;
        int two = 6;
        int three = 7;
        if (one >= two) {
            if (one >= three) {
                System.out.println("Число "+one+" наибольшее");
            } else {
                System.out.println("Число "+three+" наибольшее");
            }
        } else {
            if (two >= three) {
                System.out.println("Число "+two+" наибольшее");
            } else {
                System.out.println("Число "+three+" наибольшее");
            }
        }
    }
}