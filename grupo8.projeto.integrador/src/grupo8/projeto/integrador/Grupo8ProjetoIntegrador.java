/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo8.projeto.integrador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    static Integer score[] = new Integer[6];
    

    public static void main(String[] args) throws InterruptedException {
        showLogo();
        showWelcome();
        playerName = entrada.nextLine();
        Thread.sleep(2000);
        showGameMenu();

    }

    public static void showGreetings(String playerName) {
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("|              Ola, " + playerName.toUpperCase());
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
        System.out.println("|              BEM VINDO AO JOGO FSOCIETY - GRUPO 8 - TURMA A                                   |");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("|              DIGITE SEU NOME PARA CONTINUAR                                                   |");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("");
    }

    public static void showRanking() {
        Integer index = 1;
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------RESULTADO-----------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------");
        for (Integer item : score) {
            //System.out.println((item / 100) * 100);
            System.out.println("-------------------------------------------------------------------------------------------------");
            System.out.printf("Questão %d seu aproveitamento foi: %d%% acertou na %dº tentativa \n", index, (100 / item), item);
            System.out.println("-------------------------------------------------------------------------------------------------");
            index++;

        }
    }

    public static void showGameMenu() throws InterruptedException {
        Integer resposta;
        Boolean sair = true;

        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("------------------------------------------MENU PRINCIPAL-----------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("|                      1 – Instruções                                                            |");
        System.out.println("|                      2 – Jogar                                                                 |");
        System.out.println("|                      3 – Créditos                                                              |");
        System.out.println("|                      4 – Sair                                                                  |");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("");

        do {
            resposta = entrada.nextInt();

            switch (resposta) {
                case 1:
                    showInstructions();
                    break;
                case 2:
                    runGame();
                    break;
                case 3:
                    showCredit();
                    break;
                case 4:
                    System.out.println("Entrei em Sair");
                    sair = false;
                    break;
                default:
                    System.out.println("Valor invalido");
                    break;
            }
        } while (sair);
    }

    public static void runGame() throws InterruptedException {
        Thread.sleep(2000);
        showIntro();
        Thread.sleep(4000);
        showGreetings(playerName);
        Thread.sleep(3000);
        firsQuestionLogo();
        Thread.sleep(1000);
        firstQuestion();
        Thread.sleep(3000);
        secondQuestionLogo();
        Thread.sleep(1000);
        secondQuestion();
        Thread.sleep(3000);
        thirdQuestionLogo();
        Thread.sleep(1000);
        thirdQuestion();
        Thread.sleep(3000);
        fourthQuestionLogo();
        Thread.sleep(1000);
        fourthquestion();
        Thread.sleep(3000);
        fivethQuestionLogo();
        Thread.sleep(1000);
        fivethQuestion();
        Thread.sleep(3000);
        sixthQuestionLogo();
        Thread.sleep(1000);
        sixthQuestion();
        Thread.sleep(3000);
        showRanking();
        Thread.sleep(1000);
        showGameMenu();
    }

    public static void showCredit() throws InterruptedException {
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("Desenvolvido por:");
        System.out.println("");
        System.out.println("                           _");
        System.out.println("            ,---.          U");
        System.out.println("           ;     \\         ;");
        System.out.println("       .==\\'//==.  `-.___.-'");
        System.out.println("      ((+) .  .:)");
        System.out.println("      |`.-(o)-.'|");
        System.out.println("      \\//  \\_//  \\//");
        System.out.println("");
        System.out.println("Daniel Alef");
        System.out.println("E-mail: ");
        System.out.println("");
        Thread.sleep(2000);
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("     _________");
        System.out.println("    // ======= \\");
        System.out.println("   // __________\\");
        System.out.println("  | ___________ |");
        System.out.println("  | | -       | |");
        System.out.println("  | |         | |");
        System.out.println("  | |_________| |________________________");
        System.out.println("  \\=____________//                        )");
        System.out.println("  // ''''''''''' \\                       //");
        System.out.println(" // ::::::::::::: \\                  =D-'");
        System.out.println("(_________________)");
        System.out.println("");
        System.out.println("Erick Michael Porto");
        System.out.println("E-mail: erick.porto12@gmail.com");
        System.out.println("");
        Thread.sleep(2000);
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("            __");
        System.out.println("           (  )");
        System.out.println("            ||");
        System.out.println("            |"
                + "|");
        System.out.println("        ___|''|__.._");
        System.out.println("       //____________\\");
        System.out.println("       \\____________//~~~.");
        System.out.println("");
        System.out.println("Igor Moura Santos");
        System.out.println("E-mail: igormourasantos@hotmail.com ");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("");
        Thread.sleep(2000);
        System.out.println("");
        System.out.println("       _         ||");
        System.out.println("      |-|        ||");
        System.out.println("  ____| |____    ||");
        System.out.println(" //   _| |_   \\   ////");
        System.out.println("|  // ,| |. \\  |_////");
        System.out.println("| ( ( '-' ) ) |-'");
        System.out.println("|  \\ `''' //  |");
        System.out.println("|   `-----'   ;");
        System.out.println("|\\___________//|");
        System.out.println("|             ;");
        System.out.println(" \\___________//");
        System.out.println("");
        System.out.println("Marcos Vinicius Ramos");
        System.out.println("E-mail: marcosvramosdecaldas@gmail.com");
        System.out.println("");
        Thread.sleep(2000);
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("   ._________________.");
        System.out.println("   |.---------------.|");
        System.out.println("   ||               ||");
        System.out.println("   ||   -._ .-.     ||");
        System.out.println("   ||   -._| | |    ||");
        System.out.println("   ||   -._|'|'|    ||");
        System.out.println("   ||   -._|.-.|    ||");
        System.out.println("   ||_______________||");
        System.out.println("   //.-.-.-.-.-.-.-.-.\\");
        System.out.println("  //.-.-.-.-.-.-.-.-.-.\\");
        System.out.println(" //.-.-.-.-.-.-.-.-.-.-.\\");
        System.out.println("//______//__________\\___o_\\ ");
        System.out.println("\\_______________________//");
        System.out.println("");
        System.out.println("Murilo Henrique Silva Paxi");
        System.out.println("E-mail: murilo.paxi@gmail.com");
        System.out.println("-------------------------------------------------------------------------------------------------");
        showGameMenu();

    }

    public static void showInstructions() throws InterruptedException {
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------Instruções----------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("| O Jogo possui o padrão de RPG textual contendo a mecânica de questionário (múltipla Escolha)   |");
        System.out.println("| e dissertativa (texto livre), todas as questões contém apenas um cenário correto.              |");
        System.out.println("| As respostas são geradas de forma aleatória e a sequência e reordenada a cada tentativa falha. |");
        System.out.println("| Ao final do jogo será exibido o escore do jogador com o percentual de sucesso em cada pergunta.|");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("ddsad");
        showGameMenu();
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

        System.out.println("");
    }

    public static void verifyAnswer(ArrayList<String> answers, String corretAnswer, int questionNumber) {
        try {
            Thread.sleep(2000);
            shuffleAnswer(answers);
            Integer errors = 1;
            boolean sair = true;

            do {
                Integer index = 0;
                String resposta = entrada.next();
                boolean outIndex = false;

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
                    default:
                        outIndex = true;

                }

                if (outIndex) {
                    System.out.println("");
                    System.out.println((char) 27 + "[41m-------------------------------------------------------------------------------------------------");
                    System.out.println((char) 27 + "[41m|                                                                                               |");
                    System.out.println((char) 27 + "[41m|                                      RESPOSTA INCORRETA                                       |");
                    System.out.println((char) 27 + "[41m|                                                                                               |");
                    System.out.println((char) 27 + "[41m-------------------------------------------------------------------------------------------------");
                    System.out.println("");
                    errors++;
                    shuffleAnswer(answers);

                } else {

                    if (answers.get(index).equals(corretAnswer)) {
                        System.out.println("");
                        System.out.println((char) 27 + "[42m-------------------------------------------------------------------------------------------------");
                        System.out.println((char) 27 + "[42m|                                                                                               |");
                        System.out.println((char) 27 + "[42m|                                      RESPOSTA CORRETA                                         |");
                        System.out.println((char) 27 + "[42m|                                                                                               |");
                        System.out.println((char) 27 + "[42m-------------------------------------------------------------------------------------------------");
                        System.out.println("");
                        sair = false;
                    } else {
                        System.out.println("");
                        System.out.println((char) 27 + "[41m-------------------------------------------------------------------------------------------------");
                        System.out.println((char) 27 + "[41m|                                                                                               |");
                        System.out.println((char) 27 + "[41m|                                      RESPOSTA INCORRETA                                       |");
                        System.out.println((char) 27 + "[41m|                                                                                               |");
                        System.out.println((char) 27 + "[41m-------------------------------------------------------------------------------------------------");
                        System.out.println("");
                        errors++;
                        shuffleAnswer(answers);
                    }

                }

            } while (sair);

            score[questionNumber] = errors;

        } catch (InterruptedException ex) {
            Logger.getLogger(Grupo8ProjetoIntegrador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void verifyAnswer(String corretAnswer, int questionNumber) {
        boolean sair = true;
        Integer errors = 1;
        do {
            if (corretAnswer.equals(entrada.nextLine().toLowerCase())) {
                sair = false;
                System.out.println("");
                System.out.println((char) 27 + "[42m-------------------------------------------------------------------------------------------------");
                System.out.println((char) 27 + "[42m|                                                                                               |");
                System.out.println((char) 27 + "[42m|                                      RESPOSTA CORRETA                                         |");
                System.out.println((char) 27 + "[42m|                                                                                               |");
                System.out.println((char) 27 + "[42m-------------------------------------------------------------------------------------------------");
                System.out.println("");
            } else {
                System.out.println("");
                System.out.println((char) 27 + "[41m-------------------------------------------------------------------------------------------------");
                System.out.println((char) 27 + "[41m|                                                                                               |");
                System.out.println((char) 27 + "[41m|                                      RESPOSTA INCORRETA                                       |");
                System.out.println((char) 27 + "[41m|                                                                                               |");
                System.out.println((char) 27 + "[41m-------------------------------------------------------------------------------------------------");
                errors++;
                System.out.println("");
            }
        } while (sair);

        score[questionNumber] = errors;
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



}
