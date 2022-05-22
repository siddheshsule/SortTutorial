package stringsort;

public class App {
    public static void main(String[] args) {
        String[] actualNames = new String[]{
                "Johnsons", "Wilson", "Willkinson", "Angelina", "Jeanette","Dakota"
        };
        Sort.sort(actualNames);
        for(final String name: actualNames){
            System.out.println(name);
        }


    }
}
