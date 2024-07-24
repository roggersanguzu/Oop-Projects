package apt3040quiz2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author ~Roggers Anguzu
 */
public class Employee {
    public Double salary;
    public List<Double> salaries;
    
    public Employee(Double salary) {
        this.salary=salary;
        this.salaries=new ArrayList<>();
    }
    
    public Double getSalary(){
        return salary;
    }
    
    public void getSalaries() {
        Scanner input = new Scanner(System.in);
        System.out.println("How Many Employee Salaries do you want to Work With?: ");
        int number = input.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Enter the Salary for Employee " + (i + 1) + ": ");
            double salary = input.nextDouble();
            salaries.add(salary);
        }
    }
    
    public void increment() {
        for (int i = 0; i < salaries.size(); i++) {
            double current = salaries.get(i);
            double Increase = current * 0.2;
            salaries.set(i, Increase);
        }
    }
    
    public void display() {
        System.out.println("Below are the Updated Salaries:");
        for (int i = 0; i < salaries.size(); i++) {
            double salary = salaries.get(i);
            System.out.printf("%.2f%n", salary);}
    }
    
    public static void main(String[] args) {
        Employee one=new Employee(0.0);
        one.getSalaries();
        one.increment();
        one.display();
    }
}