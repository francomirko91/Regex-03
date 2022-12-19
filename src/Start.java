public class Start {
    public static void main(String[] args) {

        String regex1 = "are you able to climb, are you able to swim or are you able to fly?";
        String regex2 = regex1.replaceAll("\s(are)", " _XYZ");
        System.out.println(regex2);


    }
}
