public class len{

public static void main(String[] args){

System.out.print(name("isaac"));
}






public static char name(String identity){
char characters = '';
int count = 0;
for (int number = 0; number < identity.length(); number++){
    characters = System.out.print(identity.charAt(number));
    System.out.println(characters);
    count++;
}
return characters;

}

}
