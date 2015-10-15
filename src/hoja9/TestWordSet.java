import org.junit.Test;
import static org.junit.Assert.*;


public class TestWordSet {
    
    public TestWordSet() {
    }

//-----------------------------------------------------------
//TEST PARA LOS METODOS ADD Y GET DE LAS 5 IMPLEMENTACIONES
//-----------------------------------------------------------
    @Test
    public void addSimple(){
        WordSet words =  WordSetFactory.generateSet(1);
        words.add( new Word("palabra","v"));
    }
    
    @Test
    public void addRBT(){
        WordSet words =  WordSetFactory.generateSet(2);
        words.add(new Word("palabra","v"));
    }
    
    @Test
    public void addSplay(){
        WordSet words =  WordSetFactory.generateSet(3);
        words.add(new Word("palabra","v"));
    }
    
    @Test
    public void addHash(){
        WordSet words =  WordSetFactory.generateSet(4);
        words.add(new Word("palabra","v"));
    }
    
    @Test
    public void addTreeMap(){
        WordSet words =  WordSetFactory.generateSet(5);
        words.add(new Word("palabra","v"));
    }
    
    @Test
    public void getSimple(){
        WordSet words =  WordSetFactory.generateSet(1);
        words.add(new Word("palabra","v"));
        Word currentword;
	Word lookupword = new Word();
        lookupword.setWord("palabra");
	currentword = words.get(lookupword);
    }
    
    @Test
    public void getRBT(){
        WordSet words =  WordSetFactory.generateSet(2);
        words.add(new Word("palabra","v"));
        Word currentword;
	Word lookupword = new Word();
        lookupword.setWord("palabra");
	currentword = words.get(lookupword);
    }
    
    @Test
    public void getSplay(){
        WordSet words =  WordSetFactory.generateSet(3);
        words.add(new Word("palabra","v"));
        Word currentword;
	Word lookupword = new Word();
        lookupword.setWord("palabra");
	currentword = words.get(lookupword);
    }
    
    @Test
    public void getHash(){
        WordSet words =  WordSetFactory.generateSet(4);
        words.add(new Word("palabra","v"));
        Word currentword;
	Word lookupword = new Word();
        lookupword.setWord("palabra");
	currentword = words.get(lookupword);
    }
    @Test
    public void getTreeMap(){
        WordSet words =  WordSetFactory.generateSet(5);
        words.add(new Word("palabra","v"));
        Word currentword;
	Word lookupword = new Word();
        lookupword.setWord("palabra");
	currentword = words.get(lookupword);
    }
    
    
}
