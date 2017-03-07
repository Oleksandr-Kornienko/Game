public class orkArcher extends Person {
    orkArcher(final int number){
        name = "Орк лучник№"+ number + " ";
    }
    @Override
    public void firstAction() {
        damaging = superDamage*3;
        System.out.print(name + "стреляет из лука (нанесение урона "+damaging+" HP)-> ");
    }
    @Override
    public void secondAction() {
        damaging = superDamage*2;
        System.out.print(name + "ударяет клинком (нанесение урона "+damaging+" HP)-> ");
    }
}
