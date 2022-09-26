package spring.core.ch01.ex04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import spring.core.ch01.ex01.Gun;
import spring.core.ch01.ex02.Shooter;

@Configuration // 두개를 선언할 configuration을 만들자 
@Import({Config1.class, Config2.class})
public class AppConfig {
	@Autowired private Gun pistol;
	@Autowired private Gun rifle;
	// Autowired가 있으면 bean과 DI를 시켜준다.
	
	@Bean
	public Shooter shooter1() {
		return new Shooter("최한석", pistol);
	}
	
	@Bean
	public Shooter shooter2() {
		Shooter shooter = new Shooter();
		shooter.setName("한아름");
		shooter.setGun(rifle);
		
		return shooter;
	}
}
//12 @Import({Config1.class, Config2.class})을 하면 3개의 Configuration이 통합된다.