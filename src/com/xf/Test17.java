package com.xf;

/*
17. *（封装、继承、多态）创建三个类，组成一个继承树，表示游戏中的角色。描述如下：
父类：Role。是所有职业的父类。
属性：name，表示角色的名字。
方法：public int attack()，该方法返回值为角色的攻击对敌人的伤害。
Role 有两个子类：
1） 法师Magicer
属性：魔法等级（范围为1 ~ 10）
方法：
public int attack()，该方法返回法师的攻击对敌人造成的伤害值。
法师攻击伤害值为：魔法等级*魔法基本伤害值（固定为5）
2） 战士Soldier
属性：攻击伤害值
方法：
public int attack()，该方法返回战士的攻击对敌人造成的伤害值。
战士的攻击伤害值为：其攻击伤害属性值
注意：上述的三个类所有属性都应当作为私有，并提供相应的get/set 方法。
再设计一个Team 类，表示一个组队。具有如下方法
1） addMember，表示组队增加一个成员。注意：组队成员最多为6 人
提示：应当利用一个数组属性，保存所有成员
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
	//因角色不明确，所以伤害无法计算，后续子类需要覆盖该方法
	public abstract int attack();
}

//法师
class Magicer extends Role
{
	private int level;

	public Magicer(String name,int level){
		super(name);
		this.level=level;
	}

	public void setLevel(int level){
		/*魔法等级1-10*/
		if(level<1||level>10){
			System.out.println("等级设置错误");
			return;
		}
		this.level=level;
	}
	public int getLevel(){
		return this.level;
	}
	//重写了伤害的方法
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

//重写了伤害的方法
	public int attack(){
		return this.hurt;
	}
}

class Team
{
	//存放队员信息
	private Role array[];
	//表示组队中现有队员人数
	private int size;

	public Team(){
		array=new Role[6];
		size=0;
	}

	public void addMember(Role role){
		if(size==6){
			//说明人数已经满了
			System.out.println("组队人数已满");
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

//分支覆盖  代码覆盖
public class Test17
{
	public static void main(String args[]){
		//法师
		Role m1=new Magicer("露娜",3);//15
		Magicer m2=new Magicer("路西",2);//10
		m2.setLevel(1);
		//Role m3=new Magicer("张三",4);//20
		//战士
		Role s1=new Soldier("宙斯",120);//145
		Role s2=new Soldier("慕斯",100);//245
		Role s3=new Soldier("哈斯卡",110);//355
		Role s4=new Soldier("剑圣",150);//505
		Team team=new Team();
		team.addMember(m1);
		team.addMember(m2);
		//team.addMember(m3);
		team.addMember(s1);
		team.addMember(s2);
		team.addMember(s3);
		team.addMember(s4);
		//测试伤害
		int sum=team.attackSum();
		System.out.println("组队成员的总体伤害:"+sum);
	}
}

//1. 2个法师  2个战士 
//2. 3个法师 4个战士
//3. 2个法师，其中1个等级设置为11

