public class RemoveWhiteSpacesFromString {

    public static void main(String[] args) {
        removeWhiteSpacesFromString("String without space ::");
        removeWhiteSpaceUsingReplace("String without space ::");
    }

    public static void removeWhiteSpacesFromString(String str){
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' '){
                newString.append(str.charAt(i));
            }
        }

        System.out.println("String without space :: "+newString.toString());

    }

    public static void removeWhiteSpaceUsingReplace(String str){
        String result = str.replaceAll("\\s+","");
        System.out.println("String without space :: "+result);
    }

}
