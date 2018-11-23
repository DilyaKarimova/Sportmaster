package ru.itpark;

public class BonusService{
        public int calculateBonus(int purchaseAmount, int totalAmount) {
            int result = 0;
            int blueCardLowerBound = 1;
            int blueCardUpperBound = 15_000;
            int silverCardLowerBound = 15_001;
            int silverCardUpperBound = 150_000;
            int blueCardBonus = 50;
            int silverCardBonus = 70;
            int goldCardBonus = 100;


            if (totalAmount >= blueCardLowerBound && totalAmount <= blueCardUpperBound) {
                int blueCard = (int) (purchaseAmount / 1000) * blueCardBonus;
                result = result + blueCard;

            } else if (totalAmount >= silverCardLowerBound && totalAmount <= silverCardUpperBound) {
                int silverCard = (int) (purchaseAmount / 1000) * silverCardBonus;
                result = result + silverCard;

            } else {
                int goldCard = (int) (purchaseAmount / 1000) * goldCardBonus;
                result = result + goldCard;

            }
            totalAmount = totalAmount + purchaseAmount;


            return result;
        }

    }

