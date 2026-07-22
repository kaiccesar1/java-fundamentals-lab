package entities;

public class Manager extends Employee {
    public Manager(String name, double salary){
        super(name, salary);
    }

    @Override
    public void calcBonus(){
        double bonus = getSalary() * 0.2;
        System.out.println("Bônus diretor: " + bonus);
    }

    @Override
    public void responsabilities() {
        System.out.println("Lidera a equipe, organiza atividades e acompanha resultados.");
    }
}
