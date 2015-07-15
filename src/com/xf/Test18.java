package com.xf;

class Account
{
	private final long id;
	private float balance;
	private String password;
	public static long accId=100001;

	public Account(){
		id=accId;
		accId++;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getId() {
		return id;
	}
}

//class SavingAccount extends Account
//{
//	private float interestRate;
//
//	public SavingAccount(){
//	}
//
//	public SavingAccount(int id,float balance,String password,float interestRate){
//		super(id,balance,password);
//		this.interestRate=interestRate;
//	}
//
//	//get/set
//	public void setInterestRate(float interestRate){
//		if(interestRate<=0||interestRate>=0.1){
//			return;
//		}
//		this.interestRate=interestRate;
//	}
//
//	public float getInterestRate(){
//		return this.interestRate;
//	}
//}
//
//class CreditAccount extends Account
//{
//	private int creditLine;
//	
//	public CreditAccount(){}
//	public CreditAccount(int id,float balance,String password,int creditLine){
//		super(id,balance,password);
//		this.creditLine=creditLine;
//	}
//	//get/set
//
//	
//}
//
//class Bank
//{
//	//����
//	public Account openAccount(long id, String password, int type){
//		Account acc=null;
//		if(type==0){
//			acc=new Account();
//		}else if(type==1){
//			acc=new SavingAccount();
//		}else{
//			acc=new CreditAccount();
//		}
//		acc.setId(id);
//		acc.setPassword(password);
//		return acc;
//	}
//
//	//���
//	public double deposit(Account a, double amount){
//		if(amount<=0){
//			return;
//		}
//		double sum=a.getBalance();
//		sum=sum+amont;
//		a.setBalance(sum);
//		return sum;
//	}
//	//ȡ��
//	public double withdraw(Account a, double amount){
//		int sum=a.getBalance();
//		if(amount<=0){
//			System.out.println("ȡ������������");
//			return;
//		}
//		if(a instanceof SavingAccount){
//			//�����˻�
//			if(a.getBalance<amount){
//				//�˻�����
//				System.out.println("�˻�����");
//				return a.getBalance();
//			}
//			sum=sum-amount;
//			a.setBalance(sum);
//			return sum;
//		}else{
//			//�����˻�
//			CreditAccount ca=(CreditAccount)a;
//			if(a.getBalance()+ca.getcreditLine()<amount){
//				//ȡ�������͸֧���
//				System.out.println("�˻�����");
//				return a.getBalance();
//			}
//			sum=sum-amount;
//			a.setBalance(sum);
//			return sum;
//		}
//	}
//}

public class Test18
{
	public static void main(String args[]){
//		SavingAccount  a=new SavingAccount(10001,1000f,"123456",0.05f);
//		a.setInterestRate(0.1f);
//		System.out.println(a.getInterestRate());
		Account ac1=new Account();
		Account ac2=new Account();
		Account ac3=new Account();
		System.out.println(ac1.getId());
		System.out.println(ac2.getId());
		System.out.println(ac3.getId());
	}
}