import java.util.Random;
import java.util.Scanner;

public class Play {

    Scoreboard scoring = new Scoreboard();
    private int playerCount;
    private int throwPlay;
    private int frames;
    private int chance;
    private int pins;
    private int score;

    private int finalScore = 0;
    boolean scoredStrike = false;

    int totalTurns;
    int player;
    String playerTurnOutput = " Player :";
    String frame = " Frame : ";
    String chance1 = " Throw 1: ";
    String chance2 = " Throw 2: ";
    String scoreOutput = " Score : ";
    int numberOfPlayer;

    int previousThrow;

    public void gameInit(int numberOfPlayer) {

        playerCount = numberOfPlayer;

        if (playerCount == 1) {
            singlePlayer();

        } else {
            multiplayer(playerCount);

        }

    }

    public void bowl() {
        // Scanner sc = new Scanner(System.in);
        Random randomThrow = new Random();
        throwPlay = randomThrow.nextInt(pins + 1);

    }

    public void resetPin() {
        pins = 10;
    }

    public void plotScore() {
        if (chance == 1 && scoredStrike == true) {
            chance2 += "\t-";
            scoredStrike = false;
        }
        if (chance == 1) {
            chance1 += "\t" + throwPlay;
        }
        if (chance == 2) {
            chance2 += "\t" + throwPlay;

        }

        System.out.println(
                "=========================================SCOREBOARD=========================================");
        System.out.println(frame + "\n" + chance1 + "\n" + chance2 + "\n" + scoreOutput);
        System.out.println(
                "============================================================================================");

    }

    public void singlePlayer() {
        pins = 10;
        Scanner sc = new Scanner(System.in);

        frames += 1;

        for (int i = 1; i <= 10; i++) {
            frame += "\t" + frames;

            System.out.println();

            for (int c = 1; c <= 2; c++) {
                chance = c;

                System.out.println("Frame : " + frames + "\t Throw # " + c);
                System.out.println("PINS LEFT : " + pins);
                System.out.print("\nPress Enter to Bowl");
                sc.nextLine();

                bowl();

                System.out.println("\nyou striked " + throwPlay + " Pins" + " out of " + pins + " Pins.  \n");

                pins = pins - throwPlay;

                if (c == 1 && pins == 0) {
                    System.out.println("STRIKE! 20 POINTS!");
                    score = 20;

                    scoredStrike = true;
                    plotScore();
                    break;

                } else if (c == 2 && pins == 0) {
                    System.out.println("STRIKE! 15 POINTS!");

                    score = 15;
                    plotScore();

                } else if (chance == 1 && pins >= 1) {
                    previousThrow = throwPlay;
                    plotScore();

                } else if (chance == 2 && pins >= 1) {
                    score = previousThrow + throwPlay;
                    plotScore();

                } else {
                    System.out.println("SOMETHING WENT WRONG!");
                }

            }
            finalScore += score;
            scoreOutput += "\t" + score;
            previousThrow = 0;
            score = 0;
            System.out.print("Pin count has been Reset");
            resetPin();
            chance = 0;
            frames += 1;

        }
        System.out.println("\n");
        plotScore();

        System.out.println("FINAL SCORE : " + finalScore);
        sc.close();
    }

    public void multiplayer(int headCount) {

        scoring.setPlayers(headCount);

        scoring.setInstanceOfLines(scoring.getPlayers());

        pins = 10;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            frames = i;

            scoring.appendFrame(frames);

            for (int j = 1; j <= scoring.getPlayers(); j++) {
                player = j;
                for (int c = 1; c <= 2; c++) {
                    chance = c;

                    if (player == 1) {
                        scoring.appendThrow(chance);
                    }

                    if (chance == 1) {
                        System.out.println(
                                "\t\t\t\tFRAME : " + frames + " ****** Player " + player + "'s " + "1st Throw ****** ");
                    }
                    if (chance == 2) {
                        System.out.println(
                                "\t\t\t\tFRAME : " + frames + " ****** Player " + player + "'s " + "2nd Throw ****** ");
                    }
                    System.out.print("\t\t\t\tPINS LEFT : " + pins + "\t Press Enter To Bowl..  \t\t");
                    sc.nextLine();

                    bowl();

                    System.out.println(
                            "\n\t\t\t\tPlayer " + player + " Striked " + throwPlay + " Pins" + " out of " + pins
                                    + " Pins.");

                    pins = pins - throwPlay;

                    if (c == 1 && pins == 0) {
                        System.out.println("\t\t\t\tPLAYER " + player + " STRIKE! 20 POINTS!\t\t");

                        scoring.setScore(20);
                        scoredStrike = true;
                        multiplayerPlot();
                        scoring.displayResult();
                        break;

                    } else if (c == 2 && pins == 0) {
                        System.out.println("\t\t\t\tPLAYER " + player + " STRIKE! 15 POINTS!\t\t");

                        scoring.setScore(15);

                        multiplayerPlot();
                        scoring.displayResult();

                    } else if (chance == 1 && pins >= 1) {
                        previousThrow = throwPlay;
                        multiplayerPlot();
                        scoring.displayResult();

                    } else if (chance == 2 && pins >= 1) {

                        scoring.setScore(previousThrow + throwPlay);
                        multiplayerPlot();
                        scoring.displayResult();

                    } else {
                        System.out.println("SOMETHING WENT WRONG!");
                    }

                }
                chance = 0;

                scoring.appendScoreForFrame();

                System.out.println("\t\t\t\tPin count has been Reset");
                previousThrow = 0;
                // score = 0;
                scoring.setScore(0);

                resetPin();

            }
            multiplayerPlot();
        }
        multiplayerPlot();

        scoring.displayAllPlayerScore();
        sc.close();
    }

    public void multiplayerPlot() {
        if (chance == 1) {
            scoring.appendPlayerTurn((player - 1), throwPlay, chance);
        }

        if (chance == 1 && scoredStrike == true) {
            scoredStrike = false;
            if (player == 1) {

                scoring.appendThrow((chance + 1));
            }

            scoring.appendPlayerTurn((player - 1), -1, chance);
            scoring.appendScorePlayer(player - 1);
            scoring.totalScore(player - 1);

        }
        if (chance == 2) {

            scoring.appendPlayerTurn((player - 1), throwPlay, chance);
            scoring.appendScorePlayer(player - 1);
            scoring.totalScore(player - 1);
        }

    }

}
