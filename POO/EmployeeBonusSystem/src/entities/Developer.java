package entities;

public class Developer extends Employee {
    public Developer(String name, double salary){
        super(name, salary);
    }

    @Override
    public void calcBonus(){
        double bonus = super.getSalary() * 0.1;
        System.out.println("Bônus desenvolvedor: " + bonus);
    }

    @Override
    public void responsabilities(){
        System.out.println("Desenvolve, testa e mantém sistemas, aplicações ou softwares.");
    }
}
