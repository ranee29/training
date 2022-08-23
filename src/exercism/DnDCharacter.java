package exercism;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

        public class DnDCharacter {
            private int strength, dexterity, constitution, intelligence, wisdom, charisma,hitpoints;
            private final byte TOTAL_ROLLS = 4;
            private final byte BEST_ROLLS = 3;
            private final byte SIDE_OF_DICE = 6;
            private Random random = new Random();

            public DnDCharacter(){
                strength=ability();
                dexterity=ability();
                constitution=ability();
                intelligence=ability();
                wisdom= ability();
                charisma=ability();
                hitpoints = 10 + modifier(constitution);
            }
            int ability() {
                int[] dice_result = new int[TOTAL_ROLLS];
                int sum = 0;
                for (int i = 0; i<dice_result.length;i++){
                    dice_result[i] = random.nextInt(SIDE_OF_DICE)+1;
//            sum+= dice_result[i];
                }
                System.out.println(Arrays.toString(dice_result));
                Arrays.sort(dice_result);
                System.out.println(Arrays.toString(dice_result));

                for(int i = 1; i<TOTAL_ROLLS; i++){
                    sum+= dice_result[i];
                }
                return sum;
            }

            int modifier(int input) {
                return Math.floorDiv(input- 10, 2);
            }

            int getStrength() {
                return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return hitpoints;
    }
    public  static void main(String[]args){
        DnDCharacter dnDCharacter = new DnDCharacter();
        Random rand = new Random();
        System.out.println(dnDCharacter.ability());
    }
}
