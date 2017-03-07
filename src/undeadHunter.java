
public class undeadHunter extends Person
{
    undeadHunter(final int number){
        name = "Нежить охотник№" + number + " ";
    }
    @Override
    public void firstAction()
    {
        damaging = superDamage*4;
        System.out.print(name + "стреляет из лука (нанесение урона " + damaging +" HP)-> ");
    }
    @Override
    public void secondAction()
    {
        damaging = superDamage*2;
        System.out.print(name + " атаковать (нанесение урона " + damaging +" HP)-> ");
    }
}
