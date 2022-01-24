import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Scanner scanner;
        String filePath;
        Scanner csvStreamer;
        ArrayList<TransactionDetails> transactionList = new ArrayList<TransactionDetails>();



        scanner = new Scanner(System.in);
        filePath = scanner.nextLine();
        csvStreamer = new Scanner(filePath);
        csvStreamer.useDelimiter(",");

        while(csvStreamer.hasNext()){
            TransactionDetails tempTransaction = new TransactionDetails();
            tempTransaction.setRow(csvStreamer.nextLine());
            tempTransaction.setTransactionDate(csvStreamer.nextLine());
            tempTransaction.setTransactionHour(csvStreamer.nextLine());
            tempTransaction.setTransactionType(csvStreamer.nextLine());
            tempTransaction.setTerminalType(csvStreamer.nextLine());
            tempTransaction.setPrice(csvStreamer.nextLine());
            tempTransaction.setDisNumber(csvStreamer.nextLine());
            tempTransaction.setLandDate(csvStreamer.nextLine());
            tempTransaction.setTerminalNumber(csvStreamer.nextLine());
            tempTransaction.setReferCode(csvStreamer.nextLine());
            transactionList.add(tempTransaction);
            }

        Iterator<TransactionDetails> it = transactionList.iterator();
        if(it.hasNext()){

            System.out.printf("%s \t", it.next().getRow());
            System.out.printf("%s \n",it.next().getPrice());
        }

    }
}
