import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int randomVal = (int)(Math.random() * 1000);
        System.out.println("Игра угадай число.");
        System.out.println("Введите число от 0 до 1000");
        int userValue=in.nextInt();

        int differenceVal= randomVal>userValue ? randomVal - userValue  : userValue-randomVal ;
        int delt= (int)((double)differenceVal/4);

        int veryHot = delt;
        int hot= veryHot+delt;
        int cold = hot +delt;
        int veryCold=cold+ delt;

        /*System.out.println (randomVal);
        System.out.println (delt);
        System.out.println (veryHot);
        System.out.println (hot);
        System.out.println (cold);*/
        while (userValue !=randomVal) {
            differenceVal =randomVal>userValue ? randomVal - userValue  : userValue-randomVal ;
            //System.out.println (differenceVal);
            if ( differenceVal<= veryHot) {
                System.out.println("Очень горячо");
            }
            else if (differenceVal > veryHot && differenceVal<=hot){
                System.out.println("Горячо");
            }
            else if (differenceVal > hot && differenceVal<=cold){
                System.out.println("Холодно");
            }
            else{
                System.out.println("Очень холодно");
            }

            userValue = in.nextInt();
        }
        System.out.println("Угадал");
    }
}