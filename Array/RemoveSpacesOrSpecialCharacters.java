public class RemoveSpacesOrSpecialCharacters{
  public static void main(String[] args) {
    String str="hell!@ %65world";
    str=str.replaceAll("[^a-zA-Z0-9]", "");
    System.out.println(str);
  }
}