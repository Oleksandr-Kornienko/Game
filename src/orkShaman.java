public class orkShaman extends Person  {
    orkShaman(final int number){
        name = "Орк шаман№" + number + " ";
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
        damaging = 0;
        castDebuff = true;
        System.out.print(name + "наложение проклятия (снятие улучшения с персонажа противника для следующего хода)-> ");
    }
}
