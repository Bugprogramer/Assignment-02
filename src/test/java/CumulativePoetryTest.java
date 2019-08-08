import org.junit.Test;

import static org.junit.Assert.*;

public class CumulativePoetryTest {

    @Test
    public void recite() {
        CumulativePoetry cup=new CumulativePoetry();
        String str="\n" +
                "Day 1 -\n" +
                "The house that Jack built.\n" +
                "\n" +
                "Day 2 -\n" +
                "The malth that lay in\n" +
                "\tthe house that Jack built.\n" +
                "\n" +
                "Day 3 -\n" +
                "The rat that ate\n" +
                "\tthe malth that lay in\n" +
                "\tthe house that Jack built.\n" +
                "\n" +
                "Day 4 -\n" +
                "The cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe malth that lay in\n" +
                "\tthe house that Jack built.\n" +
                "\n" +
                "Day 5 -\n" +
                "The dog that worried\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe malth that lay in\n" +
                "\tthe house that Jack built.\n" +
                "\n" +
                "Day 6 -\n" +
                "That cow with the crumpled horn that tossed\n" +
                "\tthe dog that worried\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe malth that lay in\n" +
                "\tthe house that Jack built.\n" +
                "\n" +
                "Day 7 -\n" +
                "The maiden all forlorn that milked\n" +
                "\tthat cow with the crumpled horn that tossed\n" +
                "\tthe dog that worried\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe malth that lay in\n" +
                "\tthe house that Jack built.\n" +
                "\n" +
                "Day 8 -\n" +
                "The man all tattered and torn that kissed\n" +
                "\tthe maiden all forlorn that milked\n" +
                "\tthat cow with the crumpled horn that tossed\n" +
                "\tthe dog that worried\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe malth that lay in\n" +
                "\tthe house that Jack built.\n" +
                "\n" +
                "Day 9 -\n" +
                "The priest all shaven and shorn that married\n" +
                "\tthe man all tattered and torn that kissed\n" +
                "\tthe maiden all forlorn that milked\n" +
                "\tthat cow with the crumpled horn that tossed\n" +
                "\tthe dog that worried\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe malth that lay in\n" +
                "\tthe house that Jack built.\n" +
                "\n" +
                "Day 10 -\n" +
                "The rooster that crowed in the morn that woke\n" +
                "\tthe priest all shaven and shorn that married\n" +
                "\tthe man all tattered and torn that kissed\n" +
                "\tthe maiden all forlorn that milked\n" +
                "\tthat cow with the crumpled horn that tossed\n" +
                "\tthe dog that worried\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe malth that lay in\n" +
                "\tthe house that Jack built.\n" +
                "\n" +
                "Day 11 -\n" +
                "The farmer sowing his corn that kept\n" +
                "\tthe rooster that crowed in the morn that woke\n" +
                "\tthe priest all shaven and shorn that married\n" +
                "\tthe man all tattered and torn that kissed\n" +
                "\tthe maiden all forlorn that milked\n" +
                "\tthat cow with the crumpled horn that tossed\n" +
                "\tthe dog that worried\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe malth that lay in\n" +
                "\tthe house that Jack built.\n" +
                "\n" +
                "Day 12 -\n" +
                "This is the horse and the hound and the horn that belonged to\n" +
                "\tthe farmer sowing his corn that kept\n" +
                "\tthe rooster that crowed in the morn that woke\n" +
                "\tthe priest all shaven and shorn that married\n" +
                "\tthe man all tattered and torn that kissed\n" +
                "\tthe maiden all forlorn that milked\n" +
                "\tthat cow with the crumpled horn that tossed\n" +
                "\tthe dog that worried\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe malth that lay in\n" +
                "\tthe house that Jack built.\n";
        assertEquals(cup.recite(),str);
    }

    @Test
    public void reveal() {
        CumulativePoetry cup=new CumulativePoetry();
        String str="The rat that ate\n" +
                "\tthe malth that lay in\n" +
                "\tthe house that Jack built.\n";
        assertEquals(cup.reveal(3),str);
    }
}