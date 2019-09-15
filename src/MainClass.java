import java.util.Scanner;

public class MainClass {
    final static int[] Ebbinghaus_Number ={1,3,7,14,29};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your list gross：");
        int gross = sc.nextInt();
        System.out.println("Please input lists you gonna learn per day：");
        int per_day = sc.nextInt();
        System.out.println("This is confirmation of the input：");
        System.out.println("gross："+gross+"\n"+"learn day："+per_day);



        int days_to_learn=gross % per_day ==0?gross/per_day:gross/per_day+1;
        int[] learn=new int[days_to_learn];
        int[][] review=new int[days_to_learn+29][100];
        for (int i = 0; i < days_to_learn; i++) {
            learn[i]=i*per_day+1;
        }
        for (int i = 0; i < days_to_learn; i++) {
            for (int j = 0; j < 5; j++) {
                review[i+Ebbinghaus_Number[j]][5-j]=i*per_day+1;
            }
        }



        for (int i = 0; i < days_to_learn+29; i++) {
            if (i < days_to_learn) {
                System.out.print("第"+(i+1)+"天学习的是 "+learn[i]+"-"+(learn[i]+per_day-1)+" ");
            }
            System.out.print("第"+(i+1)+"天复习的是 ");
            for (int j = 0; j < review[i].length; j++) {
                if(review[i][j]!=0) {
                    System.out.print(review[i][j]+"-"+(review[i][j]+per_day-1)+" ");
                }
            }
            System.out.println();
            System.out.println();
        }
    }
}
