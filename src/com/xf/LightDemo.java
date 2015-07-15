package com.xf;

interface Light{
	void shine();
}

class RedLight implements Light{
	public void shine(){
		System.out.println("发出红色的光");
	}
}

class BlueLight implements Light{
	public void shine(){
		System.out.println("发出蓝色的光");
	}
}

class YellowLight implements Light{
	public void shine(){
		System.out.println("发出黄色的光");
	}
}

class WhiteChiLight implements Light{

	public void shine() {
		System.out.println("白炽灯........");
	}
	
}

class BaseTou{
	
	public void test(Light light){
		light.shine();
	}
}
//工厂模式
class LightFactory{
	
	public Light getLight(String type){
		Light l=null;
		if("red".equals(type)){
			//红灯
			l=new RedLight();
		}else if("yellow".equals(type)){
			//黄灯
			l=new YellowLight();
		}else if("blue".equals(type)){
			l=new BlueLight();
		}else{
			//传入的格式不正确
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

//使用接口 带来好处，可以实现使用者与具体对象的解耦
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
