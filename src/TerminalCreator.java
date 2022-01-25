import java.util.ArrayList;
import java.util.Iterator;

public class TerminalCreator {
    ArrayList<TransactionDetails> transactionList;
    ArrayList<String> terminals;
    public TerminalCreator(ArrayList<TransactionDetails> transactionList){
//        this.transactionList = new ArrayList<>();
        this.transactionList = transactionList;
        terminals = new ArrayList<>();
    }

    public void terminalCreator(){
        Iterator<TransactionDetails> it = transactionList.iterator();
        while(it.hasNext()){
            if(!(terminals.contains(it.next().getTerminalNumber()))){
                terminals.add(it.next().getTerminalNumber());
            }
        }

    }

    public ArrayList<String> getTerminals() {
        return terminals;
    }

    public void showTerminals(){
        Iterator<String> it = terminals.iterator();
        while(it.hasNext()){
            System.out.println(it.next());

        }
        System.out.println(terminals.size());
    }
}
