public class ConcurrentModificationExceptionExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));

        for (String item : list) {
            if (item.equals("b")) {
                list.remove(item); // ConcurrentModificationException
            }
        }
    }
}