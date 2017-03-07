public class elfArcher extends Person
{
    elfArcher(final int number){
        name = "Эльф лучник№" + number + " ";
    }
    @Override
    public void firstAction()
    {
        damaging = superDamage*7;
        System.out.print(name + "стреляет из лука (нанесение урона " + damaging +" HP)-> ");
    }
    @Override
    public void secondAction()
    {
        damaging = superDamage*3;
        System.out.print(name + "атакует противника (нанесение урона " + damaging +" HP)-> ");
    }
}
