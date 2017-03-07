
public class humanMage extends Person  {
    humanMage(final int number){
        name = "Человек маг№" + number + " ";
    }
    @Override
    public void firstAction()
    {
        damaging = 0;
        castBuff = true;
        System.out.print(name + "наложение улучшения на персонажа своего отряда-> ");
    }
    @Override
    public void secondAction()
    {
        damaging = superDamage*4;
        System.out.print(name + "атаковать магией (нанесение урона " + damaging + " HP-> ");
    }
}
