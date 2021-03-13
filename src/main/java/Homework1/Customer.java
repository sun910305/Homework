package Homework1;

public class Customer {
        String id;
        int money;
        int sale;
        public Customer(String id , int money , int sale){
            this.id = id;
            this.money = money;
            this.sale = sale;

        }
        public void print(){
            System.out.println(id + "\t" + money + " " + "\t" + sale + "\t"+"  " + (money-sale));
        }
    }


