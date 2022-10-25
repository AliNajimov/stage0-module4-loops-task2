package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String str = "";
        while ((int) chars>0){
             str+=chars;
        }
        System.out.println(str);
        
    }
}
