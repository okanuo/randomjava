package com.company;

public class Main {

    public static void main(String[] args) {
	int c = numberEnti(100);
        System.out.println(c);

    }

    public static int numberEnti(int number){

        int i = number;
        int value =0;

        while(i>0){
           int a = i%10 ;
            value = (value*10)+a;

           i/=10;
        }
        return value;
    }

  /*  public static int numberRevi(int number){
        int i = number;
        int value =0;

        while(i>0){
            int a = i%10 ;
            //value = (value*10)+a;

            if(a == 1){
                System.out.print("One"+" ");
            }
            else if(a ==  2){
                System.out.print(" Two ");
            }

             else if(a ==  3){
                System.out.print(" Three ");
            }

              else if(a ==  4){
                System.out.print(" Four ");
            }

               else if(a ==  5){
                System.out.print("Five" +" ");
            }

                else if(a == 6){
                System.out.print(" Six ");
            }

                 else if(a ==  7){
                System.out.print(" Seven ");
            }

                  else if(a ==  8){
                System.out.print(" Eight ");
            }

                   else if(a ==  9){
                System.out.print("Nine"+" ");
            }

                    else if(a ==  10){
                System.out.print(" Ten ");
            }

                    else{
                System.out.print("Zero"+" ");
            }

            value = (value*10)+a;

            i/=10;
        }
        return value;
    } */

}
