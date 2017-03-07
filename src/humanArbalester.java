
public class humanArbalester extends Person {
    humanArbalester(final int number){
        name = "Человек Арбалетчик№" + number + " ";
    }
    @Override
    public void firstAction()
    {
        damaging = superDamage*5;
        System.out.print(name + "стрелять из арбалета (нанесение урона " + damaging +" HP)-> ");
    }
    @Override
    public void secondAction()
    {
        damaging = superDamage*3;
        System.out.print(name + " атаковать (нанесение урона " + damaging +" HP)-> ");
    }
}
