import java.util.Scanner;

class GradeBook {
    private int[][] grades;
    Scanner sc = new Scanner(System.in);

    /**
     * @return int[][] return the grades
     */
    public int[][] getGrades() {
        return grades;
    }

    /**
     * @params grades the grades to set
     */
    public void setGrades(int[][] grades) {
        this.grades = grades;
    }

    
    

    public void showGrades() {
        String[] tLine;
        String studenLine = "\nSTUDENT#";
        tLine = new String[5];

        for (int tL = 0; tL < 5; tL++) {

            tLine[tL] = "Test " + (tL + 1) + "\t";
        }
        for (int i = 0; i < grades.length; i++) {
            studenLine += String.format("%2s%5s" , "|" ,(i + 1));
            for (int j = 0; j < grades[i].length; j++) {
                tLine[j] += String.format("%2s%5s" , "|" ,grades[i][j]);

            }
        }
        System.out.println(studenLine);
        for (int xL = 0; xL < 5; xL++) {
            System.out.print("\n" + tLine[xL]);

        }

    }

    public double studentAvg(int studentNum) {
        double average = 0;
        for (int i = 0; i < grades[studentNum - 1].length; i++) {
            average += grades[studentNum - 1][i];
        }
        average = average / grades[studentNum - 1].length;
        return average;

    }


    public double testAvg(int testId) {
        double average = 0;
        for (int i = 0; i < grades.length; i++) {
            average += grades[i][(testId-1)];
        }
        average = average / grades.length;
        return average;

    }

}