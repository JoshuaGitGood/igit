import java.util.Scanner;

public class C12E16 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int appMenu = 0;

        int[][] inputGrades;
        int[][] student;
        GradeBook1 gradeBook = new GradeBook1();

        for (;;) {

            System.out.print("\n[1] - Set Grades For All Students");
            System.out.println("\t[2] - Get Grades For a Specific Student");
            System.out.print("[3] - Show Grades For All Students");
            System.out.println("\t[4] - Average Grade For Student #");
            System.out.print("[5] - Average Grade For Test #");
            System.out.println("\t\t[6] - Save as OBJECT 'GRADEBOOK' ");
            if (gradeBook.getGrades() != null) {
                System.out.print("[7] - Save Gradebook as table");
            }

            // if(gradeBook.showObjectFile() != null){
            System.out.println("\t\t[8] - Load Gradebook from File");

            // }

            System.out.println("[99] - EXIT");

            System.out.print("SELECTION : ");

            appMenu = sc.nextInt();

            if (appMenu == 1) {
                inputGrades = new int[12][5];
                for (int i = 0; i < 12; i++) {
                    for (int j = 0; j < 5; j++) {
                        int grade = 0;
                        System.out.print("Student " + (i + 1) + " Test Score # " + (j + 1) + " : ");
                        grade = sc.nextInt();
                        inputGrades[i][j] = grade;
                    }
                    System.out.println("\n");
                }
                // setGrade Method
                gradeBook.setGrades(inputGrades);

            }
            if (appMenu == 2) {
                // getGrades Method
                student = gradeBook.getGrades();
                System.out.print("\nStudent # ");
                int studentId = sc.nextInt();
                if (studentId == 0) {
                    System.out.println("that Student Doesnt Exist");

                } else {
                    for (int i = 0; i < student[studentId].length; i++) {
                        System.out.println("Test " + (i + 1) + ": " + student[studentId - 1][i]);

                    }
                }

            }
            if (appMenu == 3) {
                // showGrades() method : displays the grades for the class

                if (gradeBook.getGrades() != null) {
                    gradeBook.showGrades();

                }
                if (gradeBook.getGrades() == null) {
                    System.out.println("GradeBook is empty.");
                }

            }
            if (appMenu == 4) {
                // studentAvg(studentNumber) method
                System.out.print("\nStudent ID: ");
                int studId = sc.nextInt();

                if (studId == 0) {
                    System.out.println("that Student Doesnt Exist");

                } else {

                    System.out.print("\nThe Average of Student # " + studId + " is ");
                    System.out.println(gradeBook.studentAvg(studId));

                }

            }
            if (appMenu == 5) {
                // testAvg(testNumber) method
                System.out.print("\nTest ID: ");
                int testId = sc.nextInt();

                if (testId == 0) {
                    System.out.println("that Test Doesnt Exist");

                } else {

                    gradeBook.testAvg(testId);
                    System.out.print("\nThe Average of all Student in Test # " + testId + " is ");
                    System.out.println(gradeBook.testAvg(testId));

                }

            }
            if (appMenu == 7) {
                gradeBook.saveObjectFile();

            }
            if (appMenu == 6) {
                gradeBook.saveObjectGradeBook();

                System.out.println(gradeBook.getClass());
                // System.out.println("hawit" + gradeBook.getClass());

            }
            if (appMenu == 8) {

                int[][] outside = gradeBook.showObjectFile();

                String studLine = "Student #";
                String[] testLine = new String[outside[0].length];
                for (int testCounter = 0; testCounter < outside[0].length; testCounter++) {

                    testLine[testCounter] = "Test #\t" + (testCounter + 1);

                }

                for (int iD = 0; iD < outside.length; iD++) {
                    studLine += "\t" + (iD + 1);
                    for (int iDsub = 0; iDsub < outside[iD].length; iDsub++) {

                        testLine[iDsub] += "\t" + outside[iD][iDsub];
                    }

                }
                System.out.println(studLine + "\n");
                for (int displayer = 0; displayer < outside[0].length; displayer++) {
                    System.out.println(testLine[(displayer)]);
                }

            }
            if (appMenu == 99) {
                break;
            }

        }

    }

}
