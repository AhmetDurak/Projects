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

enum Scope{
    BEGINNER,
    INTERMEDIATE,
    UPPER_INTERMEDIATE,
    ADVANCED;


    String difficultyLevel;


}