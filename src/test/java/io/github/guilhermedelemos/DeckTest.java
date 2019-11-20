package io.github.guilhermedelemos;

import io.github.guilhermedelemos.blackjack.Card;
import io.github.guilhermedelemos.blackjack.Deck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DeckTest {

    @Test void drawTest() {
        Deck deck = new Deck();
        Card card = deck.draw();
        assertNotNull(card);
    }

    @Test void cardsLeft() {
        Deck deck = new Deck();
        int amount = deck.cardsLeft();
        deck.draw();
        assertTrue(deck.cardsLeft() < amount);
    }

    @Test void cardsDiscarded() {
        Deck deck = new Deck();
        int amount = deck.cardsDiscarded();
        deck.draw();
        assertTrue(deck.cardsDiscarded() > amount);
    }

    @Test void shuffle(){
        Deck deck = new Deck();
        List<Card> bralhoInicil = deck.listadeCartas();
        String rankl = baralhoInicial.get(1).getRank();

        deck.shuffle(bralhoInicil);
        List<cards> bralhoEmbaralhado = deck.listCards();
        String rank2 = bralhoEmbaralhado.get(1).getRank();

        assertNoEquals(rankl,rank2);
    }

}
