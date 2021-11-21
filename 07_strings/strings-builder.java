public class strings {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Akash");
        System.out.println(name.charAt(2));
        System.out.println(name.substring(2));
        System.out.println(name.substring(1, 3));
        System.out.println(name.length());
        name.setCharAt(2, 'p');
        name.insert(0, 'J');
        name.delete(2, 4);
        name.setCharAt(1, 'a');
        name.insert(2, 'i');
        name.append("wal");
        System.out.println(name);
        int i = 0;
        int j = name.length() - 1;
        while (i < j) {
            char front = name.charAt(i);
            char back = name.charAt(j);
            name.setCharAt(i, back);
            name.setCharAt(j, front);
            i++;
            j--;
        }
        System.out.println(name);
        String n = new String("Katuri");
        // boolean value
        System.out.println(n.contains("Ka"));
        // replace
        System.out.println(n.replace('K', 'P'));
        System.out.println(n.concat("sh"));
        String companies = "BOA,TCS,WIPRO,MUSIGMA,AMAZON,APPLE,GOOGLE";
        String allcompanies[] = companies.split(",");
        for (String company : allcompanies) {
            System.out.println(company);
        }
    }
}
