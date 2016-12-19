package headfirst.proxy;

import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {

	public static void main(String[] args) {
		MatchMakingTestDrive testDrive = new MatchMakingTestDrive();
		
		
		PersonBean tom = new PersonBeanImpl("Tom","男","兴趣：电影");
		PersonBean tomProxy = testDrive.getOwnerProxy(tom);
		
		System.out.println(tomProxy.getName());
		System.out.println(tomProxy.getGender());
		//代理控制了对setHotOrNotRating的访问，抛出指定的异常
		tomProxy.setHotOrNotRating(2);
		
	}
	
	public PersonBean getOwnerProxy(PersonBean person) {
		return (PersonBean) Proxy.newProxyInstance(
				person.getClass().getClassLoader(), 
				person.getClass().getInterfaces(), 
				new OwnerInvocationHandler(person));
	}
}
