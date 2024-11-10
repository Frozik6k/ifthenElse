public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("Задача №1");
        int age = 17;
        System.out.print("Если возраст человека равен " + age);
        if (age >= 18) {
            System.out.println(" он совершеннолетний");
        } else {
            System.out.println(" он не достиг совершеннолетия, нужно немного подождать");
        }

        // task 2
        System.out.println("Задача №2");
        int degree = 18;
        System.out.print("На улице " + degree + " градусов, ");
        if (degree <= 5) {
            System.out.println("на улице холодно, нужно надеть шапку.");
        } else {
            System.out.println("можно идти без шапки");
        }

        // task 3
        System.out.println("Задача №3");
        int speed = 59;
        System.out.print("Если скорость " + speed + ", то ");
        if (speed > 60) {
            System.out.println("скорость превышена, если она больше 60 км/ч.");
        } else {
            System.out.println("превышения скорости нет, если она меньше 60 км/ч.");
        }

        // task 4
        System.out.println("Задача №4");
        int ageHuman = 22;

        if (ageHuman < 2) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему не надо куда-то ходить.");
        } else {
            System.out.print("Если возраст человека равен " + ageHuman + ", то ему нужно ходить ");
            if (ageHuman >= 2 && ageHuman <= 6) {
                System.out.println("в детский сад.");
            } else {
                if (ageHuman <= 17) {
                    System.out.println("в школу");
                } else {
                    if (ageHuman <= 24) {
                        System.out.println("в университет");
                    } else
                        System.out.println("на работу");
                }
            }
        }

        // task 5
        System.out.println("Задача №5");
        int ageChild = 6;
        System.out.print("Если возраст ребенка равен " + ageChild + ", то ему ");
        if (ageChild < 5) {
            System.out.println("нельзя кататься на аттракционе.");
        } else {
            if (ageChild < 14){
                System.out.println("можно кататься на аттракционе в сопровождении взрослого.");
            } else{
                System.out.println("можно кататься на аттракционе без сопровождения взрослого.");
            }
        }

        // task 6
        System.out.println("Задача №6");
        int people = 20;
        System.out.print("В вагоне " + people + " человек. ");
        if (people < 60){
            System.out.println("Есть и сидячие и стоячие места.");
        } else if (people < 102){
            System.out.println("Есть только стоячие места.");
        } else
            System.out.println("Нет свободных мест");

        // task 7
        System.out.println("Задача №7");
        int one = 5;
        int two = 8;
        int three = 3;
        if (one > two && one > three){
            System.out.println("Наибольшее число из трех чисел равно " + one);
        } else if (two > three){
            System.out.println("Наибольшее число из трех чисел равно " + two);
        } else
            System.out.println("Наибольшее число из трех чисел равно " + three);
    }
}
