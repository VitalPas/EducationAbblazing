package Lesson2.conditions;

public class Conditions {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        boolean result = x > y;
        System.out.println(result);
        // "==" - сравнение (равны или нет), "!=" - значения не одинаковы
        // > - больше, < - меньше >= больше или равно, <= меньше или равно
        if (x > y) {
            System.out.println("X  - Больше Y");
        }
        else if (x == y){
            System.out.println("X равен Y");
        }
        else if (y == 5) {
            System.out.println("Y равно 5");
        }
        else if (y > x) {
            System.out.println("Y больше X");
        }

        // Сын купи молоко и хлеб
         boolean isMilkBought = false;
        boolean isBredBought = false;
        //Логическое "И" - если два значения = true, то true, иначе false.
        boolean resultForMom = isMilkBought && isBredBought;
       // boolean resultForMom = true && true;
       // boolean resultForMom = true;

       // boolean resultForMom = true && false;
       // boolean resultForMom = false && false;

        if(resultForMom) {
            System.out.println("мальчик купил хлеб и молоко");
        } else if (isMilkBought) {
            System.out.println("мальчик не купил хлеб");
        } else if (isBredBought) {
            System.out.println("мальчик не купил молоко");
        } else {
            System.out.println("мальчик ничего не купил");
             }

            // Мама сказала купи или хлеб или молоко, а можно и то и то
            //Логическое или(OR) - если хотя бы одно значение true то true иначе false
            //boolean resultForMomOr = isMilkBought || isBredBought;
            //если boolean resultForMomOr = true || true;
            //то boolean resultForMomOr = true;

           //если boolean resultForMomOr = false || true;
           //или boolean resultForMomOr = true || false;
           //то boolean resultForMomOr = true;

           // если boolean resultForMomOr = false || false;
           // то boolean resultForMomOr = false;

        // Сынок, купи хлеб и что-то из сладостей - например шоколад или конфеты
        boolean isBredBought2 = false;
        boolean isChocolateBought = false;
        boolean isCandyBought = true;
        boolean resultForMomAll = isBredBought2 && (isChocolateBought || isCandyBought);
    }
}
