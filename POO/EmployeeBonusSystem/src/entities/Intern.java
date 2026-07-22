package entities;

public class Intern extends Employee{
    public Intern(String name, double salary){
        super(name, salary);
    }

    @Override
    public void calcBonus(){
        System.out.println("Estágiarios não possui bônus");
    }

    @Override
    public void responsabilities(){
        System.out.println("Aprende na prática e auxilia a equipe em tarefas supervisionadas.");
    }
}
