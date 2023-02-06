package Lesson1;

public class Hello {
    public static void main(String[] args) {

//      String name = "Vitaliy";
//      String lastName = "Pasichnik";
//     System.out.print(name  + " " + lastName);


        // Логический тип данных, true - 1, false - 0, bit
        boolean answer = false;


        // 8 bit  в в ряду - byte
        byte myByte = 127;
        byte myByteMin = -128;

        // Short - целое число из двух byte
        short myShort = 32667;
        short myShortMin = -32668;

        // Integer  - целое число, которое состоит из 4 byte
        int myNamber = 2_147_483_647;
        int myNamberMin = -2_147_483_648;

        double weight = 80;
        double rost = 180;

        double IMT;
        IMT = (weight + rost)/weight;
        System.out.println(IMT);

        // Long - целое число из 8 byte
        long mylong = 9_999_9999_9999999999L;
        long mylongMin = 999999999999999L;

        // Double - вещественное число, которое стостоит из 8 byte

        double myBottle = 0.333333333333333;

        // Float - вещественнное число, которое состоит из 4 byte
        float cola = 0.33F;

        double mydouble = 1.12345678912345629;
        float myfloat = 1.123456789123456789F;
        //ystem.out.println(mydouble);
        //System.out.println(myfloat);

        //character - Символ

        char letter = (char) (70);
        //System.out.println(letter);


    }
}
