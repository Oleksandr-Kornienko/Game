public class orkGoblin extends Person {

    orkGoblin(final int number){
        name = "Орк гоблин№" + number + " ";
    }
    @Override
    public void firstAction()
    {
        damaging = superDamage*20;
        System.out.print(name + "атака дубиной (нанесение урона "+damaging+" HP) -> ");
    }
    @Override
    public void secondAction()
    {
        firstAction();
    }
}
