public class C9E1 {
    public static void main(String[] args) throws Exception {

        Staff staff = new Staff();
        Faculty faculty = new Faculty();

        // POLYMORPHISM APPLIED HERE.
        UEmployee uemp = staff;
        UEmployee uemp2 = faculty;
        

        // INHERITANCE APPLIED HERE
        staff.setName("Joshua Salimbao");
        faculty.setSalary(46000);

        // NORMAL SETTING FOR STAFF AND FACULTY CLASS
        faculty.setDepartmentName("MAJESCO");
        /* Faculty class Dept name Setter - Not possible for UEMP TO DO THROUGH POLYMORPHISM because it is not
        defined in its own class */

        staff.setJobTitle("JAVA DEV");
        /* Staff class JobTitleSetter - Not possible for UEMP TO DO THROUGH POLYMORPHISM because it is not
        defined in its own class */

        // SECTION WHERE POLYMORPHISM and Inheritance IS APPLIED
        System.out.println(
                "*******************************************************************************************************************************************");
        System.out.println("\n\tNAME : " + uemp.getName()); // 2 in 1 OOP
        
        System.out.println("\n\tSALARY : " + uemp2.getSalary());// 2 in 1 OOP
        

      

        System.out.println("\n\tJOBTITLE : " + staff.getJobTitle()); // NORMAL 
        System.out.println("\n\tDEPARTMENT : " + faculty.getDepartmentName()); // NORMAL 
        System.out.println(
                "\n*******************************************************************************************************************************************");

    }
}
