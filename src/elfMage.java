public class elfMage extends Person  {
    elfMage(final int number){
        name = "Эльф маг№" + number + " ";
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
        damaging = superDamage*10;
        System.out.print(name + "нанесение урона персонажу противника магией на " + damaging + " HP-> ");
    }
}
