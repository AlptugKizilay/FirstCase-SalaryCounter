public class Employee {
    private String name;
    private double salary;
    private int workingHours;
    private int hireYear;

    public Employee(String name, double salary, int workingHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workingHours = workingHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary <= 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }

    public int bonus() {
        if (this.workingHours > 40) {
            int extraHour = this.workingHours - 40;
            return extraHour * 30;

        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int currentYear = 2021;
        double increase;
        int workYear = currentYear - this.hireYear;
        if (workYear < 10) {
            increase = this.salary * 0.05;
            return increase;
        } else if (workYear <= 19) {
            increase = this.salary * 0.10;
            return increase;
        } else {
            increase = this.salary * 0.15;
            return increase;
        }

    }

    public String toString() {
        double total = salary - tax() + bonus() + raiseSalary();
        double tot = salary + bonus() - tax();
        System.out.println("Name : " + this.name);
        System.out.println("Work hours : " + this.workingHours);
        System.out.println("Tax : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Increase : " + this.raiseSalary());
        System.out.println("Salary with tax and bonus : " + tot);
        System.out.println("Total salary : " + total);
        return null;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
}
