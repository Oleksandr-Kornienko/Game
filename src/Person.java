import java.util.Random;
public abstract class Person
{
    double hp = 100;
    String name;
    double damaging = 0;
    double superDamage = 1;
    boolean castBuff = false;
    boolean castDebuff = false;
    boolean castCurse = false;
    abstract void firstAction();
    abstract void secondAction();
    
    void doAction(){
        if (getRandomAction()==1)firstAction();
        else secondAction();
    }
    void attacked(double damage)
    {
        System.out.println(name);
        hp = hp - damage;
        if (hp<0)
        {
            hp = 0;
        }
    }
    private int getRandomAction()
    {
        Random random = new Random();
        // give 1 or 2
        return random.nextInt(2) + 1;
    }


    void getStatus()
    {
        if (hp==0) System.out.print(name + " умер. ");
       else System.out.print(name + " имеет " + hp + " hp. ");
    }

    public void superDamage(){
        System.out.println(name);
        superDamage *= 1.5;
    }

    void weakDamage(){
        System.out.println(name);
        superDamage *= 0.5;
    }
}
