
    abstract class Student {

        private int id;
        private String name;

        /**
         * abstract class can have both abstract and non-abstract methods
         * it can have fields, constructors and method implementations
         * Student class is an abstract class- it difines common properties and behavior for all types of student
         * displayDetails() method is abstract and must be implemented by subclasses
         * It provides a common base implementation for a group of related classes
         * */

        public Student(int id, String name){
            this.id = id;
            this.name = name;
        }
        public int getStudentId(){
            return id;
        }

        public String getName(){
            return name;
        }

        //abstract method to be implemented by subclasses
        public abstract void displayDetails();
    }

