package com.vti.entity.Assignment_04.Assignment_04_EX4;

public class Account_Ass04 {
        private String id;
        private String name;
        private int balance;

        // create constructor
        public Account_Ass04(String id, String name, int balance){
            this.id = id;
            this.name = name;
            this.balance = balance;
        }

        // getter && setter
        public void setId(String id){
             this.id = id;
        }

        public String getId(){
            return id;
        }

        public void setName(String name){
            this.name = name;
        }

        public String getName(){
            return name;
        }

        public void setBalance(int balance){
            this.balance =balance;
        }

        public int getBalance(){
            return balance;
        }

        // credit: cộng tiền
        public void credit(int amount){
            if(amount>0){
            balance += amount;}
        }

        // debit: trừ tiền
        public void debit(int amount){
            if (amount>0 && balance>=amount){
            balance -= amount;}
            else {
                System.out.println("Không đủ tiền.");
            }
        }

        // tranferTo: chuyển tiền

        public void tranferTo(Account_Ass04 account, int amount){
            if(amount>0 && balance>=amount){
            account.balance += amount;
            this.balance -= amount;}
            else {
                System.out.println("Không đủ tiền");
            }
        }


}
