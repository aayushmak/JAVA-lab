
    import java.util.ArrayList;
import java.util.List;

    /**
     * Regular student extends Student class and provides an implementation for the abstract method displayDetails
     * Regular student implements ScholarshipEligible interface and provides an implementation for the
     */
    public class RegularStudent extends Student implements ScholarshipEligible, TestInterface {
        private double[] grades ;
        public RegularStudent(int id, String name, double[] grades) {
            super(id, name);
            this.grades = grades;
        }

        @Override
        public void displayDetails() {
            System.out.println("Regular Student:");
            System.out.println("Student ID: " + getStudentId());
            System.out.println("Name: " + getName());
            System.out.println("Grades: ");
            for (double grade : grades) {
                System.out.println(grade);
            }
        }

        @Override
        public boolean isEligibleForScholarship() {
            double totalGrade = 0.0;
            for (double grade : grades) {
                totalGrade = grade + totalGrade;
          /*  totalGrade = 1 + 0;//first iterationn = 1(0th index + totalGrade)
            totalGrade = 2+1;//second iteration, 3(1st index+totalGrade)
            totalGrade = 3+3;//third iteration,6(2nd index + totalGrade)
            totalGrade = 4 + 6;//fourth iteration, 10(3rd index + totalGrade)
            totalGrade = 5+10;//fifth iteration, 15(4th index+totalGradle)
            */

            }
       /* for(int i = 0; i < grades.length ; i++){
            totalGrade = grades[i] + totalGrade;
        }*/

            double numberOfSubject = grades.length;

            double averageGrade = totalGrade / numberOfSubject;

            if (averageGrade >= StudentConfig.DEFAULT_PASSING_GRADE) {
                return true;
            } else {
                return false;
            }
        }


    }

