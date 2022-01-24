public class TransactionDetails {
    private String row;
    private String transactionDate;
    private String transactionHour;
    private String transactionType;
    private String terminalType;
    private String price;
    private String disNumber;
    private String landDate;
    private String terminalNumber;
    private String referCode;

    public TransactionDetails(){
//    row = "";
//    transactionDate = "";
//    transactionHour = "";
//    transactionType = "";
//    terminalType = "";
//    price = "";
//    disNumber = "";
//    landDate = "";
//    terminalNumber = "";
//    referCode = "";
    }

    public void setRow(String row) {
        this.row = row;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void setTransactionHour(String transactionHour) {
        this.transactionHour = transactionHour;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setDisNumber(String disNumber) {
        this.disNumber = disNumber;
    }

    public void setLandDate(String landDate) {
        this.landDate = landDate;
    }

    public void setTerminalNumber(String terminalNumber) {
        this.terminalNumber = terminalNumber;
    }

    public void setReferCode(String referCode) {
        this.referCode = referCode;
    }

    public String getRow() {
        return row;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public String getTransactionHour() {
        return transactionHour;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public String getTerminalType() {
        return terminalType;
    }

    public String getPrice() {
        return price;
    }

    public String getDisNumber() {
        return disNumber;
    }

    public String getLandDate() {
        return landDate;
    }

    public String getTerminalNumber() {
        return terminalNumber;
    }

    public String getReferCode() {
        return referCode;
    }
}
