package Homework1;

public class Homework {
        String id;
        int money;
        int sale;
        public Homework(String id , int money , int sale){
            this.id = id;
            this.money = money;
            this.sale = sale;

        }
        public void print(){
            System.out.println(id + "\t" + money + " " + "\t" + sale + "\t"+"  " + (money-sale));
        }
    }

