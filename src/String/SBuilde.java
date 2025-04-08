package String;

public class SBuilde {

    public static void main(String[] args) {

        StringBuilder name = new StringBuilder("Smile") ;
        System.out.println(name.charAt(0 ));

         name.insert(0,"Things") ;
        System.out.println(name);

        System.out.println (name.length());

        // delete the inserted characters
        name.delete(0, 6);
        System.out.println(name);
    }
    
}
