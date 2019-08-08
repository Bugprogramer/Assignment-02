import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CumulativePoetryTest{

    CumulativePoetry test = new CumulativePoetry();
    @Test
    public void revealOfTheDayOneTest()
    {
        assertEquals("This is the house that Jack built\n" ,test.revealForDay(1));
    }
    @Test
    public void revealOfTheDayTwoTest()
    {
        assertEquals("This is the malth that lay in\n" +
                " the house that Jack built\n",test.revealForDay(2));
    }

    @Test
    public void revealOfTheDayThreeTest()
    {
        assertEquals("This is the rat that ate\n"+
                " the malth that lay in\n"+
                " the house that Jack built\n",test.revealForDay(3));
    }

    @Test
    public void revealOfTheDayFourTest()
    {
        assertEquals("This is the cat that killed\n" +
                " the rat that ate\n" +
                " the malth that lay in\n" +
                " the house that Jack built\n",test.revealForDay(4));
    }

    @Test
    public void revealOfTheDayFiveTest()
    {
        assertEquals("This is the dog that worried\n" +
                " the cat that killed\n" +
                " the rat that ate\n" +
                " the malth that lay in\n" +
                " the house that Jack built\n",test.revealForDay(5));
    }

    @Test
    public void revealOfTheDaySixTest()
    {
        assertEquals("This is that cow with the crumpled horn that tossed\n" +
                " the dog that worried\n" +
                " the cat that killed\n" +
                " the rat that ate\n" +
                " the malth that lay in\n" +
                " the house that Jack built\n",test.revealForDay(6));
    }
    @Test
    public void revealOfTheDaySevenTest()
    {
        assertEquals("This is the maiden all forlorn that milked\n" +
                " that cow with the crumpled horn that tossed\n" +
                " the dog that worried\n" +
                " the cat that killed\n" +
                " the rat that ate\n" +
                " the malth that lay in\n" +
                " the house that Jack built\n",test.revealForDay(7));
    }
    @Test
    public void revealOfTheDayEightTest()
    {
        assertEquals("This is the man all tattered and torn that kissed\n" +
                " the maiden all forlorn that milked\n" +
                " that cow with the crumpled horn that tossed\n" +
                " the dog that worried\n" +
                " the cat that killed\n" +
                " the rat that ate\n" +
                " the malth that lay in\n" +
                " the house that Jack built\n",test.revealForDay(8));
    }
    @Test
    public void revealOfTheDayNineTest()
    {
        assertEquals("This is the priest all shaven and shorn that married\n" +
                " the man all tattered and torn that kissed\n" +
                " the maiden all forlorn that milked\n" +
                " that cow with the crumpled horn that tossed\n" +
                " the dog that worried\n" +
                " the cat that killed\n" +
                " the rat that ate\n" +
                " the malth that lay in\n" +
                " the house that Jack built\n",test.revealForDay(9));
    }
    @Test
    public void revealOfTheDayTenTest()
    {
        assertEquals("This is the rooster that crowed in the morn that woke\n" +
                " the priest all shaven and shorn that married\n" +
                " the man all tattered and torn that kissed\n" +
                " the maiden all forlorn that milked\n" +
                " that cow with the crumpled horn that tossed\n" +
                " the dog that worried\n" +
                " the cat that killed\n" +
                " the rat that ate\n" +
                " the malth that lay in\n" +
                " the house that Jack built\n",test.revealForDay(10));
    }
    @Test
    public void revealOfTheDayElevenTest()
    {
        assertEquals("This is the farmer sowing his corn that kept\n" +
                " the rooster that crowed in the morn that woke\n" +
                " the priest all shaven and shorn that married\n" +
                " the man all tattered and torn that kissed\n" +
                " the maiden all forlorn that milked\n" +
                " that cow with the crumpled horn that tossed\n" +
                " the dog that worried\n" +
                " the cat that killed\n" +
                " the rat that ate\n" +
                " the malth that lay in\n" +
                " the house that Jack built\n",test.revealForDay(11));
    }
    @Test
    public void revealOfTheDayTweleTest()
    {
        assertEquals("This is this is the horse and the hound and the horn that belonged to\n" +
                " the farmer sowing his corn that kept\n" +
                " the rooster that crowed in the morn that woke\n" +
                " the priest all shaven and shorn that married\n" +
                " the man all tattered and torn that kissed\n" +
                " the maiden all forlorn that milked\n" +
                " that cow with the crumpled horn that tossed\n" +
                " the dog that worried\n" +
                " the cat that killed\n" +
                " the rat that ate\n" +
                " the malth that lay in\n" +
                " the house that Jack built\n",test.revealForDay(12));
    }
    @Test
    public void recite()
    {
        assertEquals("Day 1\n" +
                "This is the house that Jack built\n" +
                "Day 2\n" +
                "This is the malth that lay in\n" +
                " the house that Jack built\n" +
                "Day 3\n" +
                "This is the rat that ate\n" +
                " the malth that lay in\n" +
                " the house that Jack built\n" +
                "Day 4\n" +
                "This is the cat that killed\n" +
                " the rat that ate\n" +
                " the malth that lay in\n" +
                " the house that Jack built\n" +
                "Day 5\n" +
                "This is the dog that worried\n" +
                " the cat that killed\n" +
                " the rat that ate\n" +
                " the malth that lay in\n" +
                " the house that Jack built\n" +
                "Day 6\n" +
                "This is that cow with the crumpled horn that tossed\n" +
                " the dog that worried\n" +
                " the cat that killed\n" +
                " the rat that ate\n" +
                " the malth that lay in\n" +
                " the house that Jack built\n" +
                "Day 7\n" +
                "This is the maiden all forlorn that milked\n" +
                " that cow with the crumpled horn that tossed\n" +
                " the dog that worried\n" +
                " the cat that killed\n" +
                " the rat that ate\n" +
                " the malth that lay in\n" +
                " the house that Jack built\n" +
                "Day 8\n" +
                "This is the man all tattered and torn that kissed\n" +
                " the maiden all forlorn that milked\n" +
                " that cow with the crumpled horn that tossed\n" +
                " the dog that worried\n" +
                " the cat that killed\n" +
                " the rat that ate\n" +
                " the malth that lay in\n" +
                " the house that Jack built\n" +
                "Day 9\n" +
                "This is the priest all shaven and shorn that married\n" +
                " the man all tattered and torn that kissed\n" +
                " the maiden all forlorn that milked\n" +
                " that cow with the crumpled horn that tossed\n" +
                " the dog that worried\n" +
                " the cat that killed\n" +
                " the rat that ate\n" +
                " the malth that lay in\n" +
                " the house that Jack built\n" +
                "Day 10\n" +
                "This is the rooster that crowed in the morn that woke\n" +
                " the priest all shaven and shorn that married\n" +
                " the man all tattered and torn that kissed\n" +
                " the maiden all forlorn that milked\n" +
                " that cow with the crumpled horn that tossed\n" +
                " the dog that worried\n" +
                " the cat that killed\n" +
                " the rat that ate\n" +
                " the malth that lay in\n" +
                " the house that Jack built\n" +
                "Day 11\n" +
                "This is the farmer sowing his corn that kept\n" +
                " the rooster that crowed in the morn that woke\n" +
                " the priest all shaven and shorn that married\n" +
                " the man all tattered and torn that kissed\n" +
                " the maiden all forlorn that milked\n" +
                " that cow with the crumpled horn that tossed\n" +
                " the dog that worried\n" +
                " the cat that killed\n" +
                " the rat that ate\n" +
                " the malth that lay in\n" +
                " the house that Jack built\n" +
                "Day 12\n" +
                "This is this is the horse and the hound and the horn that belonged to\n" +
                " the farmer sowing his corn that kept\n" +
                " the rooster that crowed in the morn that woke\n" +
                " the priest all shaven and shorn that married\n" +
                " the man all tattered and torn that kissed\n" +
                " the maiden all forlorn that milked\n" +
                " that cow with the crumpled horn that tossed\n" +
                " the dog that worried\n" +
                " the cat that killed\n" +
                " the rat that ate\n" +
                " the malth that lay in\n" +
                " the house that Jack built\n",test.recite());
    }

}
