package entities;

public abstract class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public void responsabilities(){
        System.out.println("Todo funcionário deve saber suas responsabilidades");
    }

    public void calcBonus(){
        System.out.println("Todo funcionário deve saber calcular seu bônus");
    }
}
