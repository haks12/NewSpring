package spring.core.ch01.ex03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.core.ch01.ex01.Pistol;
import spring.core.ch01.ex01.Rifle;
import spring.core.ch01.ex02.Shooter;

@Configuration
public class AppConfig {
	@Bean // pistol이라는 이름을 가진 bean을 만든다. 선언.method가 bean의 아이디가 된다.
	public Pistol pistol() { //container는 @Bean annotation이 붙어있다는 이유로 call 할 것이다.
		return new Pistol();
	} 
	// 장점: xml에 따라 기술 할 필요가 없다.
	// 단점: new를 직접 해야한다.
	
	@Bean
	public Rifle rifle() {
		return new Rifle();
	}
	
	@Bean 
	public Shooter shooter1() { // bean의 아이디는 shooter1이 된다.
		return new Shooter("최한석", pistol());// pistol()은 해당 메소드를 call하는 명령어
	} //해당 Bean이 있으면 쓰고, 없으면 새로 만든다.
	
	@Bean
	public Shooter shooter2() {
		Shooter shooter = new Shooter();
		shooter.setName("한아름");
		shooter.setGun(rifle());
		
		return shooter;
	}
}
