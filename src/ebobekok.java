import java.util.Scanner;


public class ebobekok  {
    public static void main(String[] args) {
        int x, y;
        int v = 1;
        int ebob = 1;
        
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a number : ");
        x= a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.print("Enter a number : ");
        y= b.nextInt();

        if (x>0 && y>0) {

        if (x <= y) {

        while(v <= x){
                v++;
            if (x%v == 0 && y%v == 0) {
                ebob = v;

            }

            }
        System.out.println("EBOB : "+ebob);
        } else if (y <= x) {
            while(v <= y){
                v++;
                if (x%v == 0 && y%v == 0) {
                    ebob = v;

                }

            }
            System.out.println("EBOB : "+ebob);
        }
        int ekok = (x*y)/ebob;
        System.out.print("EKOK : "+ekok);
    }else {
            System.out.println("!!!!!Hatalı tuşlama yaptınız!!!!!");
        }
        }
    }

