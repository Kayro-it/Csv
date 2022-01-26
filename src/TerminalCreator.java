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
            String temp = it.next().getTerminalNumber();
            if(!(terminals.contains(temp))){
                terminals.add(temp);
//                System.out.println();
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
//        System.out.println(terminals.size());
    }

    public void getTransaction(String transactionNumber){
        Iterator<TransactionDetails> it = transactionList.iterator();
        while (it.hasNext()){
            TransactionDetails temp = it.next();
//            System.out.println("entered");
//            System.out.println(temp.getTerminalNumber());
            if(transactionNumber.equals(temp.getTerminalNumber())) {
                System.out.println(temp.getRow() + "\t\t" + temp.getPrice() + "\t\t" + temp.getTerminalNumber());
            }
        }
    }

    public void calculateNumberAndTotalOfTerminals(){
        for (String terminal : terminals) {
            int transactionCount = 0;
            long total = 0;
            for (TransactionDetails transaction : transactionList) {
                if(terminal.equals(transaction.getTerminalNumber())){
//                    System.out.println(transaction.getTerminalNumber() + "\t" + transaction.getRow() + "\t\t\t" + transaction.getPrice());
                    transactionCount ++;
//                    System.out.println(total + "+" + transaction.getPrice());
                    total = total + transaction.getPrice();
                }
            }
            System.out.println(terminal + "\t Total transactions: " + transactionCount + "\t\t Total price: " + total);
        }
    }


}
