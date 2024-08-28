package 顺序表.扑克牌;

//简单的洗牌算法
public class Card {
    private int rank; // 牌面值
    private String suit; // 花色

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
//        return "Card{" +
//                "rank=" + rank +
//                ", suit='" + suit + '\'' +
//                '}';
        return this.suit + " " + this.rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
}
