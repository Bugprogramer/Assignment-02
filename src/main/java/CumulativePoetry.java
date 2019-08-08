import java.util.Arrays;

public class CumulativePoetry {
    static String[] arr = {
            "the house that Jack built",
            "the malth that lay in",
            "the rat that ate",
            "the cat that killed",
            "the dog that worried",
            "that cow with the crumpled horn that tossed",
            "the maiden all forlorn that milked",
            "the man all tattered and torn that kissed",
            "the priest all shaven and shorn that married",
            "the rooster that crowed in the morn that woke",
            "the farmer sowing his corn that kept",
            "this is the horse and the hound and the horn that belonged to"
    };
    String revealForDay(int k)
    {
        String Reveal="This is";
        for(int i=k-1;i>=0;i--)
            Reveal+=" "+arr[i]+"\n";
        return Reveal;
    }
    String recite()
    {
        String Recite="";
        for(int index=1;index<=12;index++) {
            Recite+="Day "+index+"\n"+revealForDay(index);
        }
        return Recite;
    }
    public static void main(String args[]){
        CumulativePoetry t= new CumulativePoetry();
        boolean reveal_for_Day = Arrays.asList(args).contains("--reveal-for-day");
        boolean recite = Arrays.asList(args).contains("--recite");
        if(reveal_for_Day) {
            int day = Integer.parseInt(Arrays.asList(args).get(Arrays.asList(args).indexOf("--reveal-for-day") + 1));
            System.out.println(t.revealForDay(day));
        }
        else if(recite)
        {
            System.out.println(t.recite());
        }

    }

}
