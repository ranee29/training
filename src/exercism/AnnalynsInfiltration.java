package exercism;

public class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return (!knightIsAwake && !archerIsAwake && prisonerIsAwake) || (!archerIsAwake && petDogIsPresent);
    }
    public static void main(String [] args){
        System.out.println(AnnalynsInfiltration.canFastAttack(false));
        System.out.println(AnnalynsInfiltration.canSpy(false,true,false));
        System.out.println(AnnalynsInfiltration.canSignalPrisoner(false,true));
        System.out.println(AnnalynsInfiltration.canFreePrisoner(false,true,false,false));
    }
}
