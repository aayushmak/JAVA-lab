//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public static void main(String[] args)
    {
        int studentId = 1234;
        String studentName = "Hari Maharjan";
        double[] grades = {75.0, 80.0, 90.0, 85.0};

        RegularStudent student = new RegularStudent(studentId, studentName, grades);
        student.displayDetails();

        if(student.isEligibleForScholarship()){
            System.out.println("Student is eligible for scholarship");
        }else{
            System.out.println("Student is not eligible for scholarship");
        }

    }
