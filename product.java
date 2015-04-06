/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


public class product {
    
    private String product_code;
    private String product_name;
    private String product_type;
    private String product_restourant;
    private Integer product_price;

 
    public product(String product_code, String product_name, String product_type, String product_restourant, Integer product_price) {
        this.product_code = product_code;    
        this.product_name = product_name;
        this.product_type = product_type;
        this.product_restourant = product_restourant;
        this.product_price = product_price;
    }
   
   
    public String get_product_code() {
        return product_code;
    }
    public void set_product_code(String product_code) {
        this.product_code = product_code;
    }


    public String get_product_name() {
        return product_name;
    }
    public void set_product_name(String product_name) {
        this.product_name = product_name;
    }

    public String get_product_type() {
        return product_type;
    }
    public void set_product_type(String product_type) {
        this.product_type = product_type;
    }

    public String get_product_restourant() {
        return product_type;
    }
    public void set_product_restourant(String product_restourant) {
        this.product_restourant = product_restourant;
    }

    public Integer get_product_price() {
        return product_price;
    }
    public void set_product_price(Integer product_price) {
        this.product_price = product_price;
    }
    
    @Override
    public String toString() {
        return "Product Code: "+this.get_product_code()+
                " / Product Name: "+this.get_product_name()+
                " / Type: "+this.get_product_type()+
                " / Restourant: "+this.get_product_type()+
                " / Price: "+this.get_product_price();             
    }
    
    
}
