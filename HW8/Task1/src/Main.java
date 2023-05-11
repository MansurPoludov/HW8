import java.util.Random;


public class Main {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        int [] list = new int[10];

        //todo
        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
        //todo
        for(int i = 0 ; i < list.length ; i++){

            list[i] = new Random().nextInt(20);

            System.out.println( list[i]);

        }
        System.out.println( "Реверс массива");
        for(int i = list.length - 1 ; i >= 0 ; i--){

            System.out.println( list[i]);



        }



        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        //todo

        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        //todo
    }
}
