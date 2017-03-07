public class elfWarrior extends Person{

    elfWarrior(final int number){
        name = "Эльф воин№" + number + " ";
    }
    @Override
    public void firstAction()
    {
        damaging = superDamage*15;
        System.out.print(name + "нанесение урона "+damaging+" HP -> ");
    }
    @Override
    public void secondAction()
    {
        firstAction();
    }
}
