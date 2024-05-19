package hospital2.newpackage;

import hospital2.entites.person;

public class Employee extends person {
    private int salary;
    private String email;
    private String pssword;
    private String status;

    public Employee() {
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPssword() {
        return pssword;
    }

    public void setPssword(String pssword) {
        this.pssword = pssword;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    


// Bounas
    // Method to change password
    public void changePassword(String newPassword) {
        this.pssword = newPassword;
    }

    // Method to calculate bonus
    public int calculateBonus(int performanceScore) {
        // Sample implementation: Bonus = 5% of salary for each performance point
        return (int) (salary * (performanceScore * 0.05));
    }

    public boolean isValidEmail() {
        String emailformat = "^[a-zA-Z0-9]+@gmail\\.com$";
        return this.email.matches(emailformat);
    }

    public boolean isValidPhone() {
        String phoneformat = "^(010|011|012|015)\\d{8}$";
        
        return this.getPhone().matches(phoneformat);
    }
}
