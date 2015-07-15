package com.xf;

/*
17. *����װ���̳С���̬�����������࣬���һ���̳�������ʾ��Ϸ�еĽ�ɫ���������£�
���ࣺRole��������ְҵ�ĸ��ࡣ
���ԣ�name����ʾ��ɫ�����֡�
������public int attack()���÷�������ֵΪ��ɫ�Ĺ����Ե��˵��˺���
Role ���������ࣺ
1�� ��ʦMagicer
���ԣ�ħ���ȼ�����ΧΪ1 ~ 10��
������
public int attack()���÷������ط�ʦ�Ĺ����Ե�����ɵ��˺�ֵ��
��ʦ�����˺�ֵΪ��ħ���ȼ�*ħ�������˺�ֵ���̶�Ϊ5��
2�� սʿSoldier
���ԣ������˺�ֵ
������
public int attack()���÷�������սʿ�Ĺ����Ե�����ɵ��˺�ֵ��
սʿ�Ĺ����˺�ֵΪ���乥���˺�����ֵ
ע�⣺�������������������Զ�Ӧ����Ϊ˽�У����ṩ��Ӧ��get/set ������
�����һ��Team �࣬��ʾһ����ӡ��������·���
1�� addMember����ʾ�������һ����Ա��ע�⣺��ӳ�Ա���Ϊ6 ��
��ʾ��Ӧ������һ���������ԣ��������г�Ա
*/

abstract class Role
{
	private String name;

	public Role(String name){
		this.name=name;
	}

	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	//���ɫ����ȷ�������˺��޷����㣬����������Ҫ���Ǹ÷���
	public abstract int attack();
}

//��ʦ
class Magicer extends Role
{
	private int level;

	public Magicer(String name,int level){
		super(name);
		this.level=level;
	}

	public void setLevel(int level){
		/*ħ���ȼ�1-10*/
		if(level<1||level>10){
			System.out.println("�ȼ����ô���");
			return;
		}
		this.level=level;
	}
	public int getLevel(){
		return this.level;
	}
	//��д���˺��ķ���
	public int attack(){
		return this.level*5;
	}
}

class Soldier extends Role
{
	private int hurt;

	public Soldier(String name,int hurt){
		super(name);
		this.hurt=hurt;
	}

	public void setHurt(int hurt){
		this.hurt=hurt;
	}

	public int getHurt(){
		return this.hurt;
	}

//��д���˺��ķ���
	public int attack(){
		return this.hurt;
	}
}

class Team
{
	//��Ŷ�Ա��Ϣ
	private Role array[];
	//��ʾ��������ж�Ա����
	private int size;

	public Team(){
		array=new Role[6];
		size=0;
	}

	public void addMember(Role role){
		if(size==6){
			//˵�������Ѿ�����
			System.out.println("�����������");
			return;
		}
		array[size++]=role;
	}

	public int attackSum(){
		int sum=0;
		for(int i=0;i<size;i++){
			Role r=array[i];
			sum+=r.attack();
		}
		return sum;
	}
}

//��֧����  ���븲��
public class Test17
{
	public static void main(String args[]){
		//��ʦ
		Role m1=new Magicer("¶��",3);//15
		Magicer m2=new Magicer("·��",2);//10
		m2.setLevel(1);
		//Role m3=new Magicer("����",4);//20
		//սʿ
		Role s1=new Soldier("��˹",120);//145
		Role s2=new Soldier("Ľ˹",100);//245
		Role s3=new Soldier("��˹��",110);//355
		Role s4=new Soldier("��ʥ",150);//505
		Team team=new Team();
		team.addMember(m1);
		team.addMember(m2);
		//team.addMember(m3);
		team.addMember(s1);
		team.addMember(s2);
		team.addMember(s3);
		team.addMember(s4);
		//�����˺�
		int sum=team.attackSum();
		System.out.println("��ӳ�Ա�������˺�:"+sum);
	}
}

//1. 2����ʦ  2��սʿ 
//2. 3����ʦ 4��սʿ
//3. 2����ʦ������1���ȼ�����Ϊ11

