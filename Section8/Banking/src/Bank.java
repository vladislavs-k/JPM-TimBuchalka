import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.name = bankName;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName){
        Branch branch = findBranch(branchName);
        if (branch == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initTransaction){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return  branch.newCustomer(customerName, initTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return  branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    private Branch findBranch(String branchName){

        for (Branch theBranch : branches) {
            if (theBranch.getName().equals(branchName)) {
                return theBranch;
            }
        }

        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions){
        Branch branch = findBranch(branchName);

        if (branch != null){
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> customers = branch.getCustomers();

                for (int c = 0; c < customers.size(); c++){
                    Customer theCustomer = customers.get(c);
                    System.out.println("Customer: " + theCustomer.getName() + "[" + (c+1) + "]");

                    if (printTransactions) {
                        ArrayList<Double> transactions = theCustomer.getTransactions();
                        System.out.println("Transactions");

                        for (int t = 0; t < transactions.size(); t++) {
                            double theTransaction = transactions.get(t);
                            System.out.println("[" + (t + 1) + "]  Amount " + theTransaction);
                        }
                    } //if (printTransactions)
                }

                return true;

        }// if (branch != null)

        return false;
    }


}
