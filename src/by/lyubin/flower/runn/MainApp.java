package by.lyubin.flower.runn;

import by.lyubin.flower.bean.Flower;
import by.lyubin.flower.logic.BotanicEncyclopedia;
import by.lyubin.flower.logic.FortuneTeller;

public class MainApp {
    public static void main(String[] args) {
        FortuneTeller fortuneTeller = new FortuneTeller();

        Flower flower = new Flower("Cammomile", 10, 1);

        BotanicEncyclopedia enc = new BotanicEncyclopedia();
        enc.printFlowerInfo(flower);

        flower.grow(20, 15, 5);
        enc.printFlowerInfo(flower);

        flower.bloom(25, "red");
        enc.printFlowerInfo(flower);

        System.out.println(" Flower wither");
        flower.wither(4, 1, 0, "grey");
        enc.printFlowerInfo(flower);

        fortuneTeller.telFuture(" three ");
        System.out.println(" ");

    }
}
