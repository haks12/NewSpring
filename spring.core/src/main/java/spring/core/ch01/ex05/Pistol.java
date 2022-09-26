package spring.core.ch01.ex05;

import org.springframework.stereotype.Component;

//@Component
public class Pistol implements Gun {
	@Override
	public void fire() {
		System.out.println("권총 탕탕.");
	}
}
// 지정아이디는 class 를 딴다.