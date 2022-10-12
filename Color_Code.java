import java.util.*;
class sl{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char n=sc.next().charAt(0);
        n=Character.toUpperCase(n);
        if(n=='V'){
            System.out.print("Violet");
        }
        else if(n=='I'){
            System.out.print("Indigo");
            
        }
         else if(n=='G'){
            System.out.print("Green");
         }
          else if(n=='B'){
            System.out.print("Blue");
          }
           else if(n=='Y'){
            System.out.print("Yellow");
           }
            else if(n=='O'){
            System.out.print("Orange");
            }
             else if(n=='R'){
            System.out.print("Red");
             }
             else
             {
                 System.out.print("-1");
             }
        
    }
}