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
    String recite(){
        String poem="";
        String text="";
        for(int i=0;i<12;i++){
            text+="\nDay "+(i+1)+" -\n";
            poem=arr[i]+'\n'+'\t'+poem;
            text+='T'+poem.substring(1,poem.length()-2)+'.'+'\n';
        }
        return text;
    }
    String reveal(int n){
        String poem="";
        String text="";
        for(int i=0;i<n;i++)
            poem=arr[i]+'\n'+'\t'+poem;
        text+='T'+poem.substring(1,poem.length()-2)+'.'+'\n';
        return text;
    }

    public static void main(String args[]) {
        CumulativePoetry cup=new CumulativePoetry();
        if(args[0].equals("--reveal-for-day") && Integer.parseInt(args[1])>0 && Integer.parseInt(args[1])<13){
            System.out.print(cup.reveal(Integer.parseInt(args[1])));
        }
        else if(args[0].equals("--recite")){
            System.out.print(cup.recite());
        }
    }

}