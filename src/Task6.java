
public class Task6 {
    public static void main(String[] args) {
        int a = 19;
        int b = 5;
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilderTwo = new StringBuilder();
        StringBuilder stringBuilderTree = new StringBuilder();
        stringBuilder
                .append(a)
                .append(" + ")
                .append(b)
                .append(" = ");
        stringBuilderTwo
                .append(a)
                .append(" - ")
                .append(b)
                .append(" = ");
        stringBuilderTree
                .append(a)
                .append(" * ")
                .append(b)
                .append(" = ");
        stringBuilder.append(a
                + b);
        stringBuilderTwo
                .append(a - b);
        stringBuilderTree
                .append(a * b);
        StringBuilder result = new StringBuilder(stringBuilder.toString());
        String resultTwo = stringBuilderTwo.toString();
        StringBuilder resultTree = new StringBuilder(stringBuilderTree.toString());
        System.out.println(result);
        System.out.println(resultTwo);
        System.out.println(resultTree);
        System.out.println(result.insert(7, "равно").deleteCharAt(12));
        System.out.println(resultTwo.replace("=", "равно"));
        System.out.println(resultTree.insert(7, "равно").deleteCharAt(12));


    }
}
