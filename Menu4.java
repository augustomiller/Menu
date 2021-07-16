/**
 * 
 * Author:    Maic Miller
 * Created:   14.07.2021
 * 
 * Copyright (c) 2021-2021 Maic Miller.
 * MIT License
 * 
 **/

package Menu;

import java.util.Scanner;

public class Menu4 {
    public static void main(String[] args) {

        int choice;
        int option;

        do {

            choice = 3;

            System.out.println("                                             ");
            System.out.println("                                             ");
            System.out.println("                  ////                       ");
            System.out.println("                 |||||                       ");
            System.out.println("                 |===|                       ");
            System.out.println("                [ 0 0 ]                      ");
            System.out.println("               ( (----) )                    ");
            System.out.println("                   //                        ");
            System.out.println("                   ||                        ");
            System.out.println("   _________0oo____||____________________    ");
            System.out.println("   |                                    |    ");
            System.out.println("   |    Menu:                           |    ");
            System.out.println("   |                                    |    ");
            System.out.println("   | Opções:                            |    ");
            System.out.println("   |                                    |    ");
            System.out.println("   |    1. opção um ativar ignição!     |    ");
            System.out.println("   |    2. opção dois desacoplar!       |    ");
            System.out.println("   |    3. opção três abortar missão!   |    ");
            System.out.println("   |                                    |    ");
            System.out.println("   |______________________oo0___________|    ");
            System.out.println("                |  |  |                      ");
            System.out.println("                |_ | _|                      ");
            System.out.println("                |  |  |                      ");
            System.out.println("                |__|__|                      ");
            System.out.println("               _|-'Y'-/_                     ");
            System.out.println("             (____| |____)                   ");

            Scanner menu = new Scanner(System.in);

            System.out.println("Selecione uma ação Comandante! ");

            option = menu.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Opção 1 selecionada -> Ignição realizada com sucesso!");
                    break;
                case 2:
                    System.out.print("Opção 2 selecionada -> Desacoplamento realizado com sucesso!");
                    break;
                case 3:
                    System.out.print("Missão Abortada! ");
                    break;
                default:
                    System.out.println("Seleção inválida");
                    menu.close();
                    break;

            }

        } while (option != choice);
    }
}
