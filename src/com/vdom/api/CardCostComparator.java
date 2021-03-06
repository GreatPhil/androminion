package com.vdom.api;

import java.util.Comparator;
import com.vdom.core.Cards;

public class CardCostComparator implements Comparator<Card> {

  /*
  ** compare - Compares two cards, and returns -1 (cardOne is greater), +1
  ** (cardTwo is greater), or 0 (both cards are equal cost).
  */
  public int compare(Card cardOne, Card cardTwo) {

    // Check Coin Cost
    if (cardOne.getCost(null) == cardTwo.getCost(null)) {

      // Check Potion Cost
      if (cardOne.costPotion() || cardTwo.costPotion()) {
        if (cardOne.costPotion() && cardTwo.costPotion()) {
          return 0;
        } else if (cardOne.costPotion()) {
          return -1;
        } else {
          return 1;
        }

      // Check Debt Cost
      } else if (cardOne.getDebtCost(null) > 0 || cardTwo.getDebtCost(null) > 0) {
        if (cardOne.getDebtCost(null) == cardTwo.getDebtCost(null)) {
          return 0;
        } else if (cardOne.getDebtCost(null) > cardTwo.getDebtCost(null)) {
          return -1;
        } else {
          return 1;
        }

      // Check if Card is a Curse
      } else {
        if (cardOne.equals(Cards.curse)) {
          return 1;
        } else if (cardTwo.equals(Cards.curse)) {
          return -1;
        } else {
          return 0;
        }
      }

    } else if (cardOne.getCost(null) > cardTwo.getCost(null)) {
      return -1;
    } else {
      return 1;
    }
  }
}
