package com.javaLearning;
class AccountE {
    private long acc_no;
    private String name,email;
    private float amount;
    public long getAcc_no() {
        return acc_no;
    }
    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }

}
public class Encapsulation {
    public static void main(String[] args) {
        AccountE acc=new AccountE();
        acc.setAcc_no(7560504000L);
        acc.setName("Gaurav Jaiswal");
        acc.setEmail("gjaiswal@javatpoint.com");
        acc.setAmount(500000f);
        System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
    }
}
