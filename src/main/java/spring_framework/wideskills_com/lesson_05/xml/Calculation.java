package spring_framework.wideskills_com.lesson_05.xml;

public class Calculation {
    private int salary;
    private int bonus;

    public Calculation()
    {
        System.out.println("Calculation Bean Created");
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getBonus() {
        return bonus;
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public int getTotal()
    {
        return salary+bonus;
    }
}
