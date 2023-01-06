public class Student {
    /* Attribute */
    public String name;
    public int age;
    public String group;

    /* Main Method */
    public static void main(String[] args) {

        Student oneStudent = new Student();
        // oneStudent.name = "Sompong";
        // oneStudent.age = 20;
        // oneStudent.group = "65/45";

        // Student twoStudent = new Student();
        // twoStudent.name = "Somporn";
        // twoStudent.age = 25;
        // twoStudent.group = "65/45";

        oneStudent.setData("Sompong",15,"65/45");
        oneStudent.getData();
        // oneStudent.printName();
        // oneStudent.printAge();
        // oneStudent.printGroup();
        System.out.println("--------------------------");
        oneStudent.setData("Sompong",16,"66/45");
        oneStudent.getData();
    }
    public void setData(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public void getData() {
        System.out.println(this.name + " is " + this.age + " years old and is in group " + this.group);
    }

        public void printName(){
            System.out.println("Student name:\t" + this.name);
        }
        public void printAge(){
            System.out.println("Student age:\t" + this.age);
        }
        public void printGroup(){
            System.out.println("Student group:\t" + this.group);
        }
}