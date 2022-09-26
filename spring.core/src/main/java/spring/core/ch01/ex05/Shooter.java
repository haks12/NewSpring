package spring.core.ch01.ex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class Shooter {
	@Autowired @Nullable private Gun pistol;
	@Autowired @Nullable private Gun rifleGun;
	
	public void fire() {
		try {
			pistol.fire();
			rifleGun.fire();
		} catch(Exception e) {}
	}
}
// DI는 Autowired로 IOD는 Component로 한다.
// @Nullable 메소드에서 null값을 허용하는지를 보다 명확하게 보여주기 위한 표시이다. : null값을 허용한다는 의미