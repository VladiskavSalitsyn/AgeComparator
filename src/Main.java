public class Main {
    public static void main(String[] args) {
        int vasyaAge = 29;
        int katyaAge = 14;
        int mishaAge = 36;

        int min = -1;
        min = vasyaAge;
        min = Math.min(min, katyaAge);
        min =Math.min(min, mishaAge);

        int max = -1;
        max = vasyaAge;
        max = Math.max(max, katyaAge);
        max = Math.max(max, mishaAge);

        int middle = -1;
        middle = vasyaAge ^ katyaAge ^ mishaAge ^ min ^ max;

        System.out.println("Min " + min);
        System.out.println("Mid " + middle);
        System.out.println("Max " + max);
        }

        /* boolean MinAgeVasya = vasyaAge <= katyaAge && vasyaAge <= mishaAge;
        boolean MaxAgeVasya = vasyaAge >= katyaAge && vasyaAge >= mishaAge;
        boolean MiddleAgeVasya = vasyaAge >= katyaAge && vasyaAge <= mishaAge ||
                vasyaAge >= mishaAge && vasyaAge <=katyaAge;

        boolean MinAgeKatua = katyaAge <= vasyaAge && katyaAge <= mishaAge;
        boolean MaxAgeKatua = katyaAge >= vasyaAge && katyaAge >= mishaAge;
        boolean MiddleAgeKatua = katyaAge >= vasyaAge && katyaAge <= mishaAge ||
                katyaAge >= mishaAge && katyaAge <= vasyaAge;

        boolean MinAgeMisha = mishaAge <= vasyaAge && mishaAge <= katyaAge;
        boolean MaxAgeMisha = mishaAge >= vasyaAge && mishaAge >= katyaAge;
        boolean MiddleAgeMisha = mishaAge >= vasyaAge && mishaAge <=katyaAge ||
                mishaAge >= katyaAge && mishaAge <= vasyaAge;

        if (MinAgeVasya) {
            System.out.println("Minimal age: " + vasyaAge);
        } else if (MinAgeKatua) {
            System.out.println("Minimal age: " + katyaAge);
        } else if (MinAgeMisha) {
            System.out.println("Minimal age: " + mishaAge);
        }
        if (MiddleAgeVasya) {
            System.out.println("Middle age: " + vasyaAge);
        } else if (MiddleAgeKatua) {
            System.out.println("Middle age: " + katyaAge);
        } else if (MiddleAgeMisha) {
            System.out.println("Middle age: " + mishaAge);
        }
        if (MaxAgeVasya) {
            System.out.println("Maximal age: " + vasyaAge);
        } else if (MaxAgeKatua) {
            System.out.println("Maximal age: " + katyaAge);
        } else if (MaxAgeMisha) {
            System.out.println("Maximal age: " + mishaAge);
        } **/
    }




