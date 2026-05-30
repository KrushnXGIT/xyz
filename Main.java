import java.io.PrintStream;
import java.util.ArrayList;

class ShareMarket{
    public static void main(String[] args) {
        int [] prices = new int[]{1000,600,2000,300,1200};
        int amt =100000;
        int shares=0;
        int profit=0;
        int I=0,J=0;
        int profitMax=0;
        for(int i=0;i<prices.length;i++){
            shares = amt/prices[i];
            for(int j=i;j<prices.length;j++){
                profit = shares*(prices[j]-prices[i]);
                if(profit)
                profitMax = Math.max(profit,profitMax);
            }
        }
        System.out.println(I);
        System.out.println(J);
        System.out.println(profitMax);
    }
}