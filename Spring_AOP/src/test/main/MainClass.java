package test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.service.MemberService;
/*
 * 	Aspect Oriented Programming(AOP)
 * 	- 핵심 비즈니스 로직과 상관없는 작업을 처리할때 주로 사용한다.
 * 	1. 로그출력
 * 	2. 인증작업
 * 	3. 트랜잭션 관리 등등...
 */
public class MainClass {
	public static void main(String[] args) {
		//init.xml 문서 읽어 들이기
	    ApplicationContext context=new ClassPathXmlApplicationContext("test/main/init.xml");
	    //만들어진  bean 중에서 MemberService type 얻어오기
	    MemberService mService=context.getBean(MemberService.class);
	    //메소드 호출
	    mService.insert();
	    System.out.println("----------------------");
	    mService.select();
	    System.out.println("----------------------");
	}
}
