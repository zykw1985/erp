package com.xf;

interface Light{
	void shine();
}

class RedLight implements Light{
	public void shine(){
		System.out.println("������ɫ�Ĺ�");
	}
}

class BlueLight implements Light{
	public void shine(){
		System.out.println("������ɫ�Ĺ�");
	}
}

class YellowLight implements Light{
	public void shine(){
		System.out.println("������ɫ�Ĺ�");
	}
}

class WhiteChiLight implements Light{

	public void shine() {
		System.out.println("�׳��........");
	}
	
}

class BaseTou{
	
	public void test(Light light){
		light.shine();
	}
}
//����ģʽ
class LightFactory{
	
	public Light getLight(String type){
		Light l=null;
		if("red".equals(type)){
			//���
			l=new RedLight();
		}else if("yellow".equals(type)){
			//�Ƶ�
			l=new YellowLight();
		}else if("blue".equals(type)){
			l=new BlueLight();
		}else{
			//����ĸ�ʽ����ȷ
			l=null;
		}
		return l;
	}
}

class MyFactory extends LightFactory{
	public Light getLight(String type) {
		if("white".equals(type)){
			return new WhiteChiLight();
		}else{
			return super.getLight(type);
		}
	}
}

//ʹ�ýӿ� �����ô�������ʵ��ʹ������������Ľ���
public class LightDemo {

	public static void main(String args[]){
		try {
			Class.forName("com.xf.RedLight");
		} catch (ClassNotFoundException e) {
		}
		
		
		Light light=new MyFactory().getLight("white");
		light.shine();
	}
}
