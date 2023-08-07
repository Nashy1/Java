package Book3.Chapter4;

import java.io.IOException;

public class ProductDDB {
    //main
    public static void main(String[] args) throws ProductDataException{
       Product p= ProductDDB.getProduct("z");
        System.out.println(p);
    }
    //getProduct method the will get our err
    public static Product getProduct(String code) {
        Product p;
        try {
             p = new Product("z");
//            System.out.println(p);
            return p;
        } catch (ProductDataException e) {
            System.out.println(e);
            return new Product();
        }
    }
}


class Product{
  String code;
    public Product(String code)throws ProductDataException{
        if(code.equalsIgnoreCase("z")){
            throw new ProductDataException(
                    "Z is not accepted. ");
        }
        this.code=code;

    }

    public Product(){
        this.code ="a";
    }
    public String toString(){
        return"the code is: "+ this.code;
    }
}

