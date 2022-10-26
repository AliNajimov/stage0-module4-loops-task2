package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String str = "";
        for (int i=0; i<chars.length;i++){
            str+=chars[i];
        }
        System.out.print(str);
        
    }
}
