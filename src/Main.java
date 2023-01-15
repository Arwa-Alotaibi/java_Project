import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        char[][] table =  {
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '}
        };
        displaytable( table);
        boolean play =true;
        while (play){
            System.out.println("Where would you like to play: (1-9):");
            int user_play = input.nextInt();
            adduser( table  ,  user_play );

            displaytable( table);
            int computer_choice = random.nextInt(9)+1;
            System.out.println("cmputer chose: "+""+computer_choice);
            computerchoice( table  ,  computer_choice);
            displaytable( table);
//            boolean user_position =checkposition( table , user_play );
//
//            while (!user_position ){
//                System.out.println("Sorry! Invalid Move. Try again");
//                user_play = input.nextInt();
//                user_position= checkposition( table , user_play );
//            }
//            boolean computer_position =checkposition( table , computer_choice );
//            while (!computer_position ){
//                computer_choice = random.nextInt(9)+1;
//                computer_position= checkposition( table , computer_choice );
//            }
            boolean wins =check_winner(table);
            if(wins){
                play =false;
            }





        }





    }

    public static void displaytable(char[][] table) {
        for (char[] rows : table) {
            for (char j : rows) {
                System.out.print(j );
            }
            System.out.println("");
        }
    }

public static boolean checkposition(char[][] table , int position ) {

    switch (position){
        case 1:
            if(table[0][0] == ' '){
                return true;
            } else{
                return false;
            }
        case 2:
            if(table[0][2] == ' '){
                return true;
            } else{
                return false;
            }
        case 3:
            if(table[0][4] == ' '){
                return true;
            } else{
                return false;
            }

        case 4:
            if(table[2][0] == ' '){
                return true;
            } else{
                return false;
            }
        case 5:
            if(table[2][2] == ' '){
                return true;
            } else{
                return false;
            }
        case 6:
            if(table[2][4] == ' '){
                return true;
            } else{
                return false;
            }
        case 7:
            if(table[4][0] == ' '){
                return true;
            } else{
                return false;
            }
        case 8:
            if(table[4][2] == ' '){
                return true;
            } else{
                return false;
            }
        case 9:
            if(table[4][4] == ' '){
                return true;
            } else{
                return false;
            }

        default:
            return false;
    }
}

    public static void adduser(char table [][] , int user_play ){


        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {

                   if (user_play == 1 ) {
                    table[0][0] = 'x';
                } else if (user_play == 2) {
                    table[0][2] = 'x';
                } else if (user_play == 3) {
                    table[0][4] = 'x';
                } else if (user_play == 4) {
                    table[2][0] = 'x';
                } else if (user_play == 5) {
                    table[2][2] = 'x';
                } else if (user_play == 6) {
                    table[2][4] = 'x';
                } else if (user_play == 7) {
                    table[4][0] = 'x';
                } else if (user_play == 8) {
                    table[4][2] = 'x';
                } else if (user_play == 9) {
                    table[4][4] = 'x';
                }

            }

        }


    }
    public static void computerchoice(char table [][] , int computer_choice){
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; ++j) {
                  if (computer_choice == 1) {
                    table[0][0] = 'o';
                } else if (computer_choice == 2) {
                    table[0][2] = 'o';
                } else if (computer_choice == 3) {
                    table[0][4] = 'o';
                } else if (computer_choice == 4) {
                    table[2][0] = 'o';
                }  else if (computer_choice == 5) {
                    table[2][2] = 'o';
                } else if (computer_choice == 6) {
                    table[2][4] = 'o';
                } else if (computer_choice == 7) {
                    table[4][0] = 'o';
                } else if (computer_choice == 8) {
                    table[4][2] = 'o';
                } else if (computer_choice == 9) {
                    table[4][4] = 'o';
                }
            }
        }

    }

    public static boolean check_winner(char[][]table  ){
        if(table[0][0]=='x'&&table[0][2]=='x'&& table[0][4]=='x' || table[2][0]=='x' && table[2][2]=='x' && table[2][4]=='x'){
            System.out.println("user wins !");
            return true;

        }

        else if(table[4][0]=='x'&&table[4][2]=='x'&& table[4][4]=='x'|| table[0][0]=='x' && table[2][0]=='x' &&table[4][0]=='x' ){
            System.out.println("user wins !");
            return true;

        }

        else if(table[0][2]=='x'&&table[2][2]=='x'&& table[4][2]=='x'|| table[0][4]=='x' && table[2][4]=='x' &&table[4][4]=='x' ){
            System.out.println("user wins !");
            return true;

        }

        else if(table[0][0]=='x'&&table[2][2]=='x'&& table[4][4]=='x'|| table[0][4]=='x' && table[2][2]=='x' &&table[4][0]=='x' ){
            System.out.println("user wins !");
            return true;

        }


        else if (table[0][0]=='o'&&table[0][2]=='o'&& table[0][4]=='o' || table[2][0]=='o' && table[2][2]=='o' && table[2][4]=='o'){
            System.out.println("cmputer wins !");
            return true;

        }

        else if(table[4][0]=='o'&&table[4][2]=='o'&& table[4][4]=='o'|| table[0][0]=='o' && table[2][0]=='o' &&table[4][0]=='o' ){
            System.out.println("cmputer wins !");
            return true;

        }

        else if(table[0][2]=='o'&&table[2][2]=='o'&& table[4][2]=='o'|| table[0][4]=='o' && table[2][4]=='o' &&table[4][4]=='o' ){
            System.out.println("cmputer wins !");
            return true;

        }

        else if(table[0][0]=='o'&&table[2][2]=='o'&& table[4][4]=='o'|| table[0][4]=='o' && table[2][2]=='o' &&table[4][0]=='o' ){
            System.out.println("cmputer wins !");
            return true;

        }

        else {
            return false;
        }



    }








    }















