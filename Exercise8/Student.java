public class Student {
    // Attributes
    int studentId;
    String name;
    String surname;
    String username;
    String password;

    // Method
    public void register(int studentId, String name, String surname, String username, String password) {
        // Method body
        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
    }

    public boolean login(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    public void printStudent() {
        System.out.println("Name : " + this.name + " " + this.surname);
        System.out.println("Student ID : " + this.studentId);
        System.out.println("Username : " + this.username);
    }

    public static void main(String[] args) {
        Student std1 = new Student();
        std1.printStudent();
        std1.register(001, "Angkan", "Baitoey", "Angkan", "123456789");
        System.out.println("After register");
        std1.printStudent();
        if (std1.login("Angkan", "123456789")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }

        Student std2 = new Student();
        std2.register(9999, "Thirayut", "Nakrub", "Kays", "123456");
        std2.printStudent();
        if (std2.login("Kays", "123456")) {
            System.out.println("Login Successful !");
        } else {
            System.out.println("Login Failed !");
        }
    }
}