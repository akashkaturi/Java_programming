public class strings {
    public static void main(String[] args) {
        StringBuilder name =new StringBuilder("Akash");
        System.out.println(name.charAt(2));
        System.out.println(name.substring(2));
        System.out.println(name.substring(1, 3));
        System.out.println(name.length());
        name.setCharAt(2, 'p');
        System.out.println(name);
    }
}
