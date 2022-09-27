import java.util.Scanner;
class area{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        float area;
        area=(float)3.14*r*r;
        System.out.format("%.2f",area);    }
}