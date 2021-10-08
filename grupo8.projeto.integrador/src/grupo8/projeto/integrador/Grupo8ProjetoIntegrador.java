/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo8.projeto.integrador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author muril
 */
public class Grupo8ProjetoIntegrador {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);
    static String playerName = "";
    static String score[][] = new String[5][4];

    public static void main(String[] args) {
        showLogo();
        showWelcome();
        playerName = entrada.next();
        showIntro();
        showGreetings(playerName);
        firstQuestion();
        secondQuestion();

    }

    public static void showGreetings(String playerName) {
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("|              Ola, " + playerName);
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("");

    }

    public static void showLogo() {
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
                + "@(                                                                                                @@\n"
                + "@(    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&@@&    @@\n"
                + "@(    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&%##(((((#%&&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@    @@\n"
                + "@(    @@@@@@@@@@@@@@@@@@@@@@@@(,                                    ./&@@@@@@@@@@@@@@@@@@@@@@@    @@\n"
                + "@(    @@@@@@@@@@@@@@@@@/                                                    *&@@@@@@@@@@@@@@@@    @@\n"
                + "@(    @@@@@@@@@@@@*                                                              *@@@@@@@@@@@@    @@\n"
                + "@(    @@@@@@@@(                                                                      #@@@@@@@@    @@\n"
                + "@(    @@@@@%                                                                            @@@@@@    @@\n"
                + "@(    @@@(                                                                                @@@@    @@\n"
                + "@(    @@                                                                                   ,@@    @@\n"
                + "@(    &                                                                                     ,@    @@\n"
                + "@(                                                                                           #    @@\n"
                + "@(                                                                                           .    @@\n"
                + "@(    @@*                                                                                  &@@    @@\n"
                + "@(    @@@@@#          .%@@@@@@@@@@%.                            (@@@@@@@@@@&*          .@@@@@@    @@\n"
                + "@(    @@@@@@,    %@@@@@@@@@@@@@@@@@@@@@*                    &@@@@@@@@@@@@@@@@@@@@&,    @@@@@@&    @@\n"
                + "@(    #%&@@@. @@@@@@,         .@@@@@@@@@@@@#.          /@@@@@@@@@@@@(         .%@@@@@* @@@@%#/    @@\n"
                + "@(    @@@@@@@                     #@@@@@@@@@@@@     &@@@@@@@@@@@@.                    /@@@@@@@    @@\n"
                + "@(      .#@@@                        *@@@@@@@@@     #@@@@@@@@%                        (@@&*       @@\n"
                + "@(    @@@%       *(                      #@@&,        %@@%.                     .#       /@@@@    @@\n"
                + "@(             @@         *@@@@@@@@@&.                        #@@@@@@@@@#         *@.             @@\n"
                + "@(            #@       .@@@@@@@@@@@@@@@&                   (@@@@@@@@@@@@@@@(       %@             @@\n"
                + "@(             @       @@@@@@@@@@@@@@@@@      @,    @*     @@@@@@@@@@@@@@@@@*      %,             @@\n"
                + "@(                   .@@@*.   .(@@@@@@&       @.    &%      /@@@@@@#,    *&@@/                    @@\n"
                + "@(                                   ((      #@     /@      ,&                                    @@\n"
                + "@(                                         &@,        @@,                                         @@\n"
                + "@(            .@@&                      @&               *@.                     ,@@(             @@\n"
                + "@(          @@@@@                      @,                  @*                     #@@@@.          @@\n"
                + "@(        #@@@@@/                      %,                  @                       @@@@@@         @@\n"
                + "@(       &@@@@@@@                   (&@@@@@@,          &@@@@@@%,                  (@@@@@@@        @@\n"
                + "@(      /@@@@@@@@@@/         .#@@@@@@@@@@@@@@@,      @@@@@@@@@@@@@@@&*         .&@@@@@@@@@@       @@\n"
                + "@(      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@       @@\n"
                + "@(      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@       @@\n"
                + "@(      .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&       @@\n"
                + "@(    @@. @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@, &@@    @@\n"
                + "@(    @@@@*  #@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&.  @@@@@    @@\n"
                + "@(    @@@@@@                         .(#/.    ,*/(/*,     *#(*                         /@@@@@@    @@\n"
                + "@(    @@@@@@@                   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,                  (@@@@@@@    @@\n"
                + "@(    @@@@@@@@                    %@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.                   ,@@@@@@@@    @@\n"
                + "@(    @@@@@@@@,                       /@@@@@@@@@@@@@@@@@@@@@%.                       @@@@@@@@@    @@\n"
                + "@(    @@@@@@@@@                                                                     /@@@@@@@@@    @@\n"
                + "@(    @@@@@@@@@*                                                                    @@@@@@@@@@    @@\n"
                + "@(    @@@@@@@@@@                                                                   &@@@@@@@@@@    @@\n"
                + "@(    @@@@@@@@@@@                                                                 @@@@@@@@@@@@    @@\n"
                + "@(    @@@@@@@@@@@@&                                                             /@@@@@@@@@@@@@    @@\n"
                + "@(    @@@@@@@@@@@@@@@,                                                        @@@@@@@@@@@@@@@@    @@\n"
                + "@(    @@@@@@@@@@@@@@@@@@@.                                                (@@@@@@@@@@@@@@@@@@@    @@\n"
                + "@(    @@@@@@@@@@@@@@@@@@@@@@.                                          &@@@@@@@@@@@@@@@@@@@@@@    @@\n"
                + "@(    @@@@@@@@@@@@@@@@@@@@@@@@%                                     ,@@@@@@@@@@@@@@@@@@@@@@@@@    @@\n"
                + "@(    @@@@@@@@@@@@@@@@@@@@@@@@@@/                                  @@@@@@@@@@@@@@@@@@@@@@@@@@@    @@\n"
                + "@(    **,*******,*******,*******,,            ,*,*,**            .*,,,**,*******,*******,***,,    @@\n"
                + "@(                                                                                                @@\n"
                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
                + "@@@#*  #( ,*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@   .@@@@@@@@@@@@@@@@@@@@@*#@@@@@@@@@@@@@@@@@@@\n"
                + "@@@(   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@   (@@@@@@@@@@@@@@@@@@@\n"
                + "@@@/   @@@@@@@@%      .@@@@@       @@@@@.      %@@@      .@@@@@@%      .@@@.         ,@/   @@@(   @@\n"
                + "@@@/   @@@@@@@@%   &@@@@@@.   @@@   .@/   @@@@@@@@@@@@   .@@@@@          /@@@   (@@@@@@(   @@@(   @@\n"
                + "@@@(   @@@@@@@@@@@@.  .@@@.   @@@   .@/   @@@@@@@@@@@@   .@@@@@   (@@@@@@@@@@   (@@@@@@(   @@@(   @@\n"
                + "@@%*   &%@@@@@,, /%%%  ,#@*,  %%%  ,*@(,  %%%/ ,,@@%%%.  .%%%@@,, /%%%  ,(@@@,, /%  ,*@#,  %%%/ ,,@@\n"
                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@   &@@@\n"
                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@   /@@@@@\n"
                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&&&&&&@@@@@@@");
    }

    public static void showWelcome() {
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("|              BEM VINDO AO JOGO XXX - GRUPO 8 - TURMA A                                        |");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("|              DIGITE SEU NOME PARA CONTINUAR                                                   |");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("");
    }

    public static void showGameMenu() {
        System.out.println("");
    }

    public static void shuffleAnswer(ArrayList<String> answers) {
        Collections.shuffle(answers);

        for (int i = 0; i < answers.size(); i++) {
            switch (i) {
                case 0:
                    System.out.println("A - " + answers.get(i));
                    break;
                case 1:
                    System.out.println("B - " + answers.get(i));
                    break;
                case 2:
                    System.out.println("C - " + answers.get(i));
                    break;
                case 3:
                    System.out.println("D - " + answers.get(i));
                    break;
                case 4:
                    System.out.println("E - " + answers.get(i));
                    break;
            }

        }
    }

    public static void verifyAnswer(ArrayList<String> answers, String corretAnswer) {
        shuffleAnswer(answers);

        boolean sair = true;

        do {
            Integer index = 0;
            String resposta = entrada.next();

            switch (resposta.toLowerCase()) {
                case "a":
                    index = 0;
                    break;
                case "b":
                    index = 1;
                    break;
                case "c":
                    index = 2;
                    break;
                case "d":
                    index = 3;
                    break;
                case "e":
                    index = 4;
                    break;
            }

            if (answers.get(index).equals(corretAnswer)) {
                System.out.println("Resposta Correta");
                sair = false;
            } else {
                System.out.println("Resposta incorreta");
                shuffleAnswer(answers);
            }

        } while (sair);

    }

    public static void showIntro() {
        System.out.printf("\n Elliot (Rami Malek) é um jovem programador que trabalha como engenheiro de segurança virtual durante o dia, \n"
                + " e como hacker vigilante durante a noite. Elliot se vê numa encruzilhada quando o líder (Christian Slater) \n "
                + "de um misterioso grupo de hacker o recruta para destruir a firma que ele é pago para proteger. "
                + "\n Motivado pelas suas crenças pessoais, "
                + "\n ele luta para resistir à chance de destruir os CEOs da multinacional que ele acredita estarem controlando - e destruindo - o mundo.");
        System.out.println("");
        System.out.println("");
    }

    public static void firstQuestion() {
        System.out.println("Cache e um tipo de : ");

        ArrayList<String> mylist = new ArrayList<String>();

        mylist.add("Memoria");
        mylist.add("Periferico");
        mylist.add("Celula Cerebral");
        mylist.add("Pagamento por serviço");
        mylist.add("N/A");

        verifyAnswer(mylist, "Memoria");

    }

    public static void secondQuestion() {
        System.out.println("Cache e um tipo de : ");

        ArrayList<String> mylist = new ArrayList<String>();

        mylist.add("Cleyton");
        mylist.add("Periferico");
        mylist.add("Celula Cerebral");
        mylist.add("Pagamento por serviço");
        mylist.add("N/A");

        verifyAnswer(mylist, "Cleyton");

    }

}
