import java.util.Scanner;
public class reverse {
    public String originalWord;

    public reverse(){}

    public String loop(){
        String reversedWord = "";
        int i = originalWord.length() - 1;
        while(true){
            if(i == -1){break;}
            reversedWord += originalWord.charAt(i);
            i -=1;
        }
        return reversedWord;
    }


    public void inputs(){
        while(true){
            try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to reverse: ");
        originalWord = sc.nextLine();
        if(originalWord == null||originalWord== ""){
            System.out.println("Inputted string cannot be empty");
            continue;
        }
        break;
            }
            catch(Exception e){
                System.out.println("Error");
                continue;
            }
        }
    }
}
