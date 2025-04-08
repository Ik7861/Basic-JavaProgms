package String;

public class concatenation {

    public static void main(String[] args) {

        String firstName = "Smile";
        String lastName = "ThatsWow";
        String FullName = firstName + "@" + lastName;
        System.out.println(FullName.length());

        //charAt
        for(int i = 0; i < FullName.length(); i++) {
            System.out.println(FullName.charAt(i));
        }
    }
    
}
