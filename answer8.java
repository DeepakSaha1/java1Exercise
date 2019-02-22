class ReverseString
{
    public static void main(String[] args)
    {
        String input = "Geeks for is";

        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(input);

        // reverse StringBuilder input1
        input1.reverse();

        // print reversed String
        System.out.println(input1);
        System.out.println("=="+input1.substring(3,9)+ "== : will get removed");
        System.out.println(input1.replace(4, 9, ""));
    }
}
