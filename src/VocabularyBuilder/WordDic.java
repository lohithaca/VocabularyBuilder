package VocabularyBuilder;

import java.util.ArrayList;

public class WordDic {
    private ArrayList<Word> wordList = new ArrayList<Word>();
    private Word selectedWord;

    public void addWord(Word newWord){
        wordList.add(newWord);
    }

    public void showWord(){
        for(int i = 0; i< wordList.size();i++) {
            System.out.println("Word - "+wordList.get(i).getWord());
            System.out.println("description - "+wordList.get(i).getDescription());
            System.out.println("description - "+wordList.get(i).getExample());
        }
    }

    public void searchWord(String searchWord){
        for(int i = 0; i< wordList.size();i++) {
            if(wordList.get(i).getWord().equals(searchWord)){
                System.out.println("Word - "+wordList.get(i).getWord());
                System.out.println("description - "+wordList.get(i).getDescription());
                System.out.println("description - "+wordList.get(i).getExample());
                break;
            }
        }
        System.out.println("Your Input is not in our Database");
    }


}
