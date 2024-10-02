package jp.co.diworks.action;

public class Test {

	public static void main(String[] args) {
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		taro.phoneNumber = "01234567890";
		taro.address = "東京都";
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
		
		Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age = 18;
		jiro.phoneNumber = "24680246802";
		jiro.address = "埼玉県";
		
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		jiro.talk();
		jiro.walk();
		jiro.run();
		
		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		hanako.phoneNumber = "13579135791";
		hanako.address = "千葉県";
		
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		hanako.talk();
		hanako.walk();
		hanako.run();
		
		Person nao = new Person();
		nao.name = "山本奈央";
		nao.age = 27;
		nao.phoneNumber = "12341234123";
		nao.address = "神奈川県";
		
		System.out.println(nao.name);
		System.out.println(nao.age);
		System.out.println(nao.phoneNumber);
		System.out.println(nao.address);
		nao.talk();
		nao.walk();
		nao.run();
		
		Robot aibo = new Robot();
		aibo.name = "aibo";
		
		System.out.println(aibo.name);
		aibo.talk();
		aibo.walk();
		aibo.run();
		
		Robot asimo = new Robot();
		asimo.name = "asimo";
		
		System.out.println(asimo.name);
		asimo.talk();
		asimo.walk();
		asimo.run();
		
		Robot pepper = new Robot();
		pepper.name = "pepper";
		
		System.out.println("pepper");
		pepper.talk();
		pepper.walk();
		pepper.run();
	}

}
