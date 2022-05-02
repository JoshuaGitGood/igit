import java.io.*;
import java.util.Scanner;

class GradeBook1 implements Serializable {

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
            studenLine += String.format("%4s%4s", "|", (i + 1));
            for (int j = 0; j < grades[i].length; j++) {
                tLine[j] += String.format("%4s%4s", "|", grades[i][j]);

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
            average += grades[i][testId-1];
        }
        average = average / grades.length;
        return average;

    }

    public void saveObjectFile() {

        File file = new File(System.getProperty("user.dir") + "GradeBook.txt");

        FileOutputStream fos;
        ObjectOutputStream oos;
        try {

            if (!file.exists()) {
                file.createNewFile();
                fos = new FileOutputStream(file);
                oos = new ObjectOutputStream(fos);

                oos.writeObject(grades);

                oos.flush();
                fos.flush();
            } else {
                fos = new FileOutputStream(file);
                oos = new ObjectOutputStream(fos);

                oos.writeObject(grades);

                oos.flush();
                fos.flush();

            }

            // for(int ws = 0 ; ws < grades.length ; ws++){

            // }

        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }

    }

    public int[][] showObjectFile() {
        File file = new File(System.getProperty("user.dir") + "GradeBook.txt");

        int[][] gradeFromFile = null;

        FileInputStream fos;
        ObjectInputStream oos;

        try {

            if (!file.exists()) {
                file.createNewFile();
                fos = new FileInputStream(file);
                oos = new ObjectInputStream(fos);
                gradeFromFile = (int[][]) oos.readObject();

                fos.close();
                oos.close();
            } else {
                fos = new FileInputStream(file);
                oos = new ObjectInputStream(fos);
                gradeFromFile = (int[][]) oos.readObject();

                fos.close();
                oos.close();

            }

        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return gradeFromFile;

    }

    public void saveObjectGradeBook() {
        File file = new File(System.getProperty("user.dir") + "\\GradeBook.txt");
        System.out.println(file);

        FileOutputStream fos;
        ObjectOutputStream oos;
        try {

            if (!file.exists()) {
                file.createNewFile();
                fos = new FileOutputStream(file);
                oos = new ObjectOutputStream(fos);

                oos.writeObject(this.getClass());

                oos.flush();
                fos.flush();
            } else {
                fos = new FileOutputStream(file);
                oos = new ObjectOutputStream(fos);

                oos.writeObject(this.getClass());

                oos.flush();
                fos.flush();

            }

            // for(int ws = 0 ; ws < grades.length ; ws++){

            // }

        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }

        System.out.println(this.getClass() + " has been saved!");

    }

}