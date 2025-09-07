package designpatterns.Adapter;

public class Adapter implements Phonepe {
    String Bank;
    Yesbank Yesbank=new Yesbank();
    Hdfcbank Hdfcbank=new Hdfcbank();
    Icicibank Icicibank=new Icicibank();
    Adapter(String Bank){
        this.Bank=Bank;
    }
    @Override
    public void payment(String from, String to, double amount){
        if(Bank.equals("Icicibank")){
            Icicibank.send(from, to, amount);
        }else if(Bank.equals("Hdfcbank")){
            Hdfcbank.UPI(from, to, amount);
        }else{
            Yesbank.transfer(from, to, amount);
        }
    }

}
