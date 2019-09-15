public class PlanMaker {
    final int[] Ebbinghaus_Number ={1,3,7,14,29};

    public void planmaker(int gross, int per_day){
        //如果不能整除就加一天
        int days_to_learn=gross % per_day ==0?gross/per_day:gross/per_day+1;
        int[] learn=new int[days_to_learn];
        int[][] review=new int[days_to_learn+29][];
        for (int i = 0; i < days_to_learn; i++) {
            learn[i]=i*per_day;
        }
        for (int i = 0; i < days_to_learn; i++) {
            for (int j = 0; j < 5; j++) {
                review[i+Ebbinghaus_Number[j]][j]=i*per_day;
            }
        }

        return ;
    }
}
