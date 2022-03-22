package Enum;

public enum Difficullty {
    HARDCORE(3),
    HARD(2),
    MEDIUM(1),
    EASY(0);

    String howDifficult;

    Difficullty(int isItDifficult) {

        this.howDifficult = String.valueOf(isItDifficult);
    }
}
