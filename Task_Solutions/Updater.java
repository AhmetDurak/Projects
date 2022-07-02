import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public class Updater {

    private static final Set<String> titles = Set.of("Dr.", "Ph.D.", "B.Sc.", "M.Sc.");
    public static String clean(String name){
        String[] pieces = name.split(" ");
        Arrays.sort(pieces, (a, b) -> Boolean.compare(titles.contains(b), titles.contains(a)));
        return String.join(" ", pieces);
    }


    public static String cleanUp(String name) {
        String[] titleList = {"Dr.", "Ph.D.", "B.Sc", "M.Sc."};

        String title = "";
        for (int i = 0; i < 2; i++) {
            for (String eachTitle : titleList) {
                if (name.contains(eachTitle)) {
                    name = name.replaceFirst(eachTitle, "");
                    title = title.concat(eachTitle) + " ";
                }
            }
        }

        String[] name1 = name.split(" ");
        String name2 = "";
        int counter = 0;
        for (int i = 0; i < name1.length; i++) {
            name1[i] = name1[i].trim();
            if (name1[i].isEmpty()) {
            } else {
                name2 = name2.concat(name1[i]) + (counter == name.length() - 2 ? "" : " ");
                counter++;
            }
        }
        name2 = name2.substring(0, name2.length() - 2);
        return title + name2;
    }

    public static String title(String name) {
        // Jane  Welsh --replace("  "," ")
        //   Jane  Welsch --> replace("  "," ") ,  --> replace(" ","")
        String[] titleList = {"Dr.", "Ph.D.", "B.Sc", "M.Sc."};

        String title = "";
        for (int i = 0; i < 2; i++) {
            for (String eachTitle : titleList) {
                if (name.contains(eachTitle)) {
                    name = name.replaceFirst(eachTitle, "");
                    title = title.concat(eachTitle) + " ";
                }
            }
        }
        name = name.trim().trim().trim();
        System.out.println(name);
        String name1 = "";
        try {
            for (int i = 0; i < name.length(); i++) {
                name1 = name1.concat(String.valueOf(name.charAt(i)));
                if (Character.isUpperCase(name.charAt(i + 1))) {
                    name1 = name1.concat(" ");
                }
            }
        } catch (StringIndexOutOfBoundsException ignored) {
        }

        return title + name1;
    }

    public static String method(String name) {
        String[] titleList = {"Dr.", "Ph.D.", "B.Sc.", "M.Sc."};

        String title = "";

        try {
            for (int i = 0; i < 4; i++) {
                for (String each : titleList) {
                    if (name.contains(each)) {

                        //System.out.println("title = " + title);
                        if (name.charAt(name.indexOf(each) - 1) == ' ') {
                            name = name.replaceFirst(" " + each, "");
                            //  System.out.println("Situation 1 : " + name);
                        } else if (name.charAt(name.indexOf(each.length() - 1) + 1) == ' ') {
                            name = name.replaceFirst(each + " ", "");
                            //System.out.println("Situation 2 : " + name);
                        } else {
                            name = name.replaceFirst(each, "");
                            //System.out.println("Situation 3 : " + name);
                        }
                        title = title.concat(each) + " ";
                    }
                }
            }
        } catch (StringIndexOutOfBoundsException ignored) {
        }
        return title + name;
    }


    public static void main(String[] args) {
        //System.out.println(method("Dr. Ern Ph.D. Dalsh Dr. Kamil"));
        String name = "Malson Mike Dr. B.Sc.";
        String[] arr = name.split(" ");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,(a,b) -> Boolean.compare(titles.contains(b),titles.contains(a)));
        System.out.println(String.join(" ", arr));
    }
}

