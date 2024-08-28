package 顺序表.扑克牌;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardList {
    //牌的花色，忽略大小王
    private static final String[] SUITS = {"♦", "♥", "♣", "♠"};

    //买一副牌
    public static List<Card> buyCards() {
        List<Card> list = new ArrayList<>();

        for (int i = 0; i < SUITS.length; i++) {
            for (int j = 1; j <= 13; j++) {
                Card card = new Card(j, SUITS[i]);
                list.add(card);
            }

        }

        return list;
    }

    //洗牌
    public static void shuffle(List<Card> list) {
        Random random = new Random();
        for (int i = list.size()-1; i > 0; i--) {
            int index = random.nextInt(i);
            swap(list, i, index);
        }
    }

    public static void swap(List<Card> list, int i, int j) {
        Card tmp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, tmp);
    }
}
