import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут
       double [] weight = new double [10];
        double middleWeight = 0 ;
        int counter = 0;
        for(int i = 0 ; i < weight.length ; i++ ) {
       weight [i] = new Random().nextDouble(40 , 100);

            middleWeight += weight[i] / weight.length ;

            if( weight[i] >= 60 && weight[i] <= 100 ) {
                counter++ ;
        }
            System.out.println(weight[i]);
        }

        System.out.println("Средний вес 10 человек - " + middleWeight + " кг");
        System.out.println("Количество людей в весовой категории от 60 до 100кг - " + counter + " человек");
    }
}
