import java.io.*;
import java.util.Random;

public class Game {
    public static void main(String[] args) throws IOException {
        //записываем ход сражения в файл Game.txt
        PrintStream out = new PrintStream(new FileOutputStream("Game.txt"));
        System.setOut(out);

        System.out.println("Добро пожаловать в игру!");
        final String winner1;
        final String winner2;
        System.out.println("Сражаються расы: Люди и Эльфы против Нежити и Орков.");
        final Person team1 [];
        final Person team2 [];
        System.out.print("Случайным образом выбраны расы: ");
        if (getRandomAction()==1)
        {
            team1  = new Person[]{new humanMage(1),
                    new humanArbalester(1),
                    new humanArbalester(2),
                    new humanArbalester(3),
                    new humanWarrior(1),
                    new humanWarrior(2),
                    new humanWarrior(3),
                    new humanWarrior(4)};
            winner1 = "ЛЮДИ";
            System.out.print("Люди и ");
        }
        else {team1  = new Person[] {new elfMage(1),
                new elfArcher(1),
                new elfArcher(2),
                new elfArcher(3),
                new elfWarrior(1),
                new elfWarrior(2),
                new elfWarrior(3),
                new elfWarrior(4)};
            winner1 = "ЭЛЬФЫ";
            System.out.print("Эльфы и ");
        }
        if (getRandomAction()==1)
        {
            team2  = new Person[]{new undeadNecromancer(1),
                    new undeadHunter(1),
                    new undeadHunter(2),
                    new undeadHunter(3),
                    new undeadZombie(1),
                    new undeadZombie(2),
                    new undeadZombie(3),
                    new undeadZombie(4)};
            winner2 = "НЕЖИТЬ";
            System.out.println("Нежить.");
        }
        else {team2  = new Person[] {new orkShaman(1),
                new orkArcher(1),
                new orkArcher(2),
                new orkArcher(3),
                new orkGoblin(1),
                new orkGoblin(2),
                new orkGoblin(3),
                new orkGoblin(4)};
            winner2 = "ОРКИ";
            System.out.println("Орки.");
        }


        int move = 1;
        while (alive(team1)&& alive(team2))
        {
            getStatus(team1);
            getStatus(team2);
            System.out.println("");
            System.out.println("Ход "+move+":");
            attack(team1,team2);
            attack(team2,team1);
            move++;
        }
        getStatus(team1);
        getStatus(team2);
        System.out.println("");
        System.out.print("ПОБЕДИЛИ ");
        if (alive(team1)) System.out.println(winner1+ "!");
        else System.out.println(winner2 + "!");





    }

    private static void getStatus(Person team1[]){
        for (Person aTeam1 : team1) {
            aTeam1.getStatus();
        }
        System.out.println("");
    }
    private static void attack(final Person team1[], final Person team2[]){
        int attacker;
        //рандомно получать атакующего пока его хп 0 и команда живая
        do {
            attacker = new Random().nextInt(team1.length);
        } while (team1[attacker].hp == 0&&(alive(team1)));
        if (team1[attacker].hp ==0 &&(!alive(team1))) return;
        //если у кого-то супер дамаг, он становится атакующим
        for (int i=0;i<team1.length;i++)
        {
            if (team1[i].superDamage > 1) {
                attacker = i;
            }
        }
        team1[attacker].doAction();
        team1[attacker].superDamage = 1;
        //наложение улучшения на персонажа своего отряда
        if (team1[attacker].castBuff){
            int ally;
            do {
                ally = new Random().nextInt(team1.length);
            } while (ally==attacker);
            team1[ally].superDamage();
            team1[attacker].castBuff =false;
        }

        else {
            int defender;
            //рандомно получить защищающегося пока его хп 0 и команда живая
            do {
                defender = new Random().nextInt(team1.length);
            } while (team2[defender].hp == 0&&(alive(team1)));
            //если castDebuff==true то снять дебаф с противника у которого он есть
            if (team1[attacker].castDebuff)
            {
                for (int i=0;i<team2.length;i++)
                {
                    if (team2[i].superDamage > 1) {
                        team2[i].superDamage=1;
                        defender = i;
                    }
                }
                team1[attacker].castDebuff=false;
            }
            //если castCurse==true то уменьшить атаку противника на 50 %
            if (team1[attacker].castCurse)
            {
                team2[defender].weakDamage();
                team1[attacker].castCurse=false;
            }
            //атака
            else team2[defender].attacked(team1[attacker].damaging);
        }
    }

    private static boolean alive(final Person team1[]){
        boolean teamAlive=true;
        int count = 0;
        for (Person aTeam1 : team1) {
            if (team1[count].hp == 0) {
                count++;
            }
        }
        if (count==team1.length) teamAlive = false;
        return teamAlive;
    }

    private static int getRandomAction()
    {
        final Random random = new Random();
        // give 1 or 2
        return random.nextInt(2) + 1;
    }
}
