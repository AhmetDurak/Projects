package Memory;

public class ChangeableString {
    String str;

    public ChangeableString(String str) {
        this.str = str;
    }

    public void changeTo(String newStr) {
        str = newStr;
    }

    public String toString() {
        return str;
    }
}
class Thing{
    public static void main(String[] args) {

    }

    void changeMe(){

    }

    void doNothing(Thing obj) {
        obj = new Thing();
    }

    void doSomething(Thing obj) {
        obj.changeMe();
    }
}

