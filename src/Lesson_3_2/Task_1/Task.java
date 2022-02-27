package Lesson_3_2.Task_1;

import Lesson_3_2.Task_1.Weapon.Rifle;
import Lesson_3_2.Task_1.Weapon.Rpg;
import Lesson_3_2.Task_1.Weapon.WaterGun;
import Lesson_3_2.Task_1.Weapon.Weapon;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        Player player = new Player(new Weapon[]{
                new WaterGun(), new Rifle(), new Rpg()
        });
        System.out.format(
                "У игрока %d слота(ов) с оружием, введите номер, чтобы выстреливать, -1 чтобы выйти\n",
                player.getSlotsCount()
        );

        int slot;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            slot = scanner.nextInt();
            if (slot == -1) {
                break;
            }
            player.shotWithWeapon(slot - 1);
        }
    }
}