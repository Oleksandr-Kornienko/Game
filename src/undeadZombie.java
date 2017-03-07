
public class undeadZombie extends Person {

    undeadZombie(final int number){
        name = "Нежить зомби№" + number + " ";
    }
    @Override
    public void firstAction()
    {
        damaging = superDamage*18;
        System.out.print(name + " удар копьем (нанесение урона "+damaging+" HP) -> ");
    }
    @Override
    public void secondAction()
    {
        firstAction();
    }
}

