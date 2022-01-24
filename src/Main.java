import java.util.ArrayList;
import java.util.Scanner;

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
            TransactionDetails tempTransaction = null;
            tempTransaction.setRow(csvStreamer.nextLine());
            tempTransaction.setTransactionDate(csvStreamer.nextLine());
            tempTransaction.setTransactionHour(csvStreamer.nextLine());
                    }




    }
}
