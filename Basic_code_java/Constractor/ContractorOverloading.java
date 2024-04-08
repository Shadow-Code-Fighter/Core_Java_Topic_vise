package Constractor;

public class ContractorOverloading {
    ContractorOverloading(){
        System.out.println("No args Consructor");
    }
    ContractorOverloading(String str){
        System.out.println(str);
    }
    ContractorOverloading(int x,double y){
        System.out.println(x);
        System.out.println(y);

    }
    public static void main(String[] args) {
        new ContractorOverloading();
        new ContractorOverloading("Gaurav");
        new ContractorOverloading(1, 2.2);
    }
}
