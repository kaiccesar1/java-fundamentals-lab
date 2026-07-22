package application;

import entities.Developer;
import entities.Employee;
import entities.Intern;
import entities.Manager;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();

        employees.add(new Intern("Kaic", 1000));
        employees.add(new Developer("Mark", 3500));
        employees.add(new Manager("Steve", 15000));

        for(Employee employee : employees){
            System.out.println("------------");
            System.out.println(employee.getName());
            employee.calcBonus();
            employee.responsabilities();
        }
    }
}
