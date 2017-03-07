
public class humanWarrior  extends Person{

    humanWarrior(final int number){
        name = "Человек воин№" + number + " ";
    }
    @Override
    public void firstAction()
    {
        damaging = superDamage*18;
        System.out.print(name + "нанесение урона "+damaging+" HP -> ");
    }
    @Override
    public void secondAction()
    {
        firstAction();
    }
}
