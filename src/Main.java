import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Main {

    public static void main(String[] args)throws IOException {
        Scanner scanner;
        String filePath;
        ArrayList<String> terminals;

        ArrayList<TransactionDetails> transactionList = new ArrayList<>();



        scanner = new Scanner(System.in);
        filePath = scanner.nextLine();
        Scanner csvStreamer = new Scanner(new File(filePath));

//        csvStreamer.useDelimiter(",");

//        while (csvStreamer.hasNext()){
//
//            System.out.println(csvStreamer.next());
//            System.out.println("");
//        }

        while(csvStreamer.hasNext()){
            TransactionDetails tempTransaction = new TransactionDetails();
            tempTransaction.setRow(csvStreamer.next());
            tempTransaction.setTransactionDate(csvStreamer.next());
            tempTransaction.setTransactionHour(csvStreamer.next());
            tempTransaction.setTransactionType(csvStreamer.next());
            tempTransaction.setTerminalType(csvStreamer.next());
            tempTransaction.setPrice(csvStreamer.next());
            tempTransaction.setDisNumber(csvStreamer.next());
            tempTransaction.setLandDate(csvStreamer.next());
            tempTransaction.setTerminalNumber(csvStreamer.next());
            tempTransaction.setReferCode(csvStreamer.next());
            transactionList.add(tempTransaction);
            }




        Iterator<TransactionDetails> it = transactionList.iterator();
        while(it.hasNext()){
            TransactionDetails temp = it.next();
            System.out.printf("%s \t", temp.getRow());
            System.out.printf("%s \n", temp.getPrice());
        }
        System.out.println("there is total: "+ transactionList.size() + " Transactions");

        TerminalCreator terminalCreator = new TerminalCreator(transactionList);
        terminalCreator.terminalCreator();


        terminalCreator.showTerminals();



    }
}
