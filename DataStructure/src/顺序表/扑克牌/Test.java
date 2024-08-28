package 顺序表.扑克牌;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Card> list = new ArrayList<>();
        //买牌
        list = CardList.buyCards();
        System.out.println(list);

        //洗牌
        CardList.shuffle(list);
        System.out.println(list);

        List<List<Card>> hand = new ArrayList<>();
        //三个人的牌
        List<Card> hand1 = new ArrayList<>();
        List<Card> hand2 = new ArrayList<>();
        List<Card> hand3 = new ArrayList<>();

        //设置成二维数组的关系以便确定顺序
        hand.add(hand1);
        hand.add(hand2);
        hand.add(hand3);

        //每个人轮流抓五张牌
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                //揭牌的逻辑,每次从list中remove 0 下标元素
                Card card = list.remove(0);
                hand.get(j).add(card);
            }
        }

        //第一个人的牌
        System.out.println("第一个人的牌："+hand.get(0));
        //第二个人的牌
        System.out.println("第二个人的牌："+hand.get(1));
        //第三个人的牌
        System.out.println("第三个人的牌："+hand.get(2));
        //剩下的牌
        System.out.println("剩下的牌："+list);

    }
}
