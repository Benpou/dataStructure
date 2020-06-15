package PracticeArray;

public class DeckOfCards {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4","5","6","7","8","9","10","Jack","Queen","King"};

        for(int i=0; i< deck.length; i++){
            deck[i] = i;
        }

        //Shuffle the cards
        for(int i=0; i <deck.length; i++) {
            //generate index randomly
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];

            deck[i] = index;
            deck[index] = temp;
        }

        //Display the four cards
        for(int i=0; i< 13;i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("card suit is " + suit + " rank " + rank);
        }


    }
}
