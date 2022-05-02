public class Scoreboard {
    private int players;
    private String frameLine;
    private String throwLine;
    private String playerTurnScore;
    private String scoreForFrame;
    private int score;

    ////////////////////////

    private int[] totalAll;
    private String[] playerLine;
    private String[] playerScoreM;

    ////////////////////////

    /**
     * @return int return the players
     */
    public int getPlayers() {
        return players;
    }

    /**
     * @param players the players to set
     */
    public void setPlayers(int players) {
        this.players = players;
    }

    public String getPlayerTurnScore() {
        return playerTurnScore;
    }

    public void setInstanceOfLines(int numberOfPlayer) {

        playerLine = new String[numberOfPlayer];
        playerScoreM = new String[numberOfPlayer];
        totalAll = new int[numberOfPlayer];
        frameLine = "\t";
        throwLine = "Throw";
        playerTurnScore = "";

        for (int nex = 1; nex <= numberOfPlayer; nex++) {
            playerLine[nex - 1] = "Plyr" + (nex);
            playerScoreM[nex - 1] = "Score";
            totalAll[nex - 1] = 0;

        }

    }

    public void appendFrame(int frameToPut) {

        if (frameToPut == 10) {
            this.frameLine += String.format("%6s   ", "Final" + " | TOTAL SCORE");
        }
        if (frameToPut < 10) {
            this.frameLine += String.format("%6s   ", "Frame" + frameToPut + "|");
        }

    }

    public void appendThrow(int throwNum) {
        if (throwNum == 2) {
            this.throwLine += String.format("%6s", throwNum + "|");

        }
        if (throwNum == 1) {
            this.throwLine += String.format("%4s", throwNum);

        }

    }

    public void appendPlayerTurn(int toPlay, int turn, int throwNum) {
        // playerLine[toPlay] += "\t" + turn;

        if (throwNum == 2) {
            if (turn == -1) {

                playerLine[toPlay] += String.format("%6s", "x" + "|");
            }
            if (turn >= 0) {
                playerLine[toPlay] += String.format("%6s", turn + "|");
            }

        }
        if (throwNum == 1) {
            if (turn == -1) {

                playerLine[toPlay] += String.format("%6s", "x|");
            }
            if (turn >= 0) {
                playerLine[toPlay] += String.format("%4s", turn);
            }

        }

    }

    public void appendScorePlayer(int toPlay) {

        playerScoreM[toPlay] += String.format("%10s", score + "|");

    }

    public void appendScoreForFrame() {

        scoreForFrame += String.format("\t", score);

    }

    public void totalScore(int totalOf) {
        totalAll[totalOf] += score;
    }

    /**
     * @return int return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * @return String return the scoreForFrame
     */
    public String getScoreForFrame() {
        return scoreForFrame;
    }

    /**
     * @param scoreForFrame the scoreForFrame to set
     */
    public void setScoreForFrame(String scoreForFrame) {
        this.scoreForFrame = scoreForFrame;
    }

    public void displayResult() {
        System.out.println(
                "___________________________________________SCOREBOARD_____________________________________________________________________");
        System.out.println(frameLine);

        if (players > 1) {

            System.out.println(throwLine);
            System.out.println(
                    "_________________________________________________________________________________________________________________________");

            int i = 0;
            while (i < playerLine.length || i < playerScoreM.length) {
                if (i < playerLine.length) {
                    System.out.println(playerLine[i]);

                }

                if (i < playerScoreM.length) {
                    System.out.println(playerScoreM[i] + "   [" + totalAll[i] + "]");

                }
                System.out.println(
                        "--------------------------------------------------------------------------------------------------------------------------");

                i++;
            }

        }

    }

    public void displayAllPlayerScore() {
        System.out.println("TOTAL SCORE ");
        for (int x = 0; x < players; x++) {
            System.out.print("Player " + (x + 1) + " :");
            System.out.println(totalAll[x]);
        }
    }

}
