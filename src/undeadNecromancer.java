
public class undeadNecromancer extends Person  {
    undeadNecromancer(final int number){
        name = "Нежить некромант№" + number + " ";
    }
    @Override
    public void firstAction()
    {
        damaging = 0;
        castCurse = true;
        System.out.print(name + "наслать недуг (уменьшение силы урона персонажа противника на 50% на один ход)-> ");
    }
    @Override
    public void secondAction()
    {
        damaging = superDamage*5;
        System.out.print(name + " атака (нанесение урона " + damaging + " HP)-> ");
    }
}
