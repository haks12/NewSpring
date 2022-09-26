package spring.core.ch01.ex06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class Shooter {
	@Autowired private Pistol pistol;
	@Autowired @Nullable private Rifle rifle;
	
	public void fire() {
		pistol.fire();
		if(rifle != null) rifle.fire();
	}
}
// try는 의도적, if는 계획되지 않은
// 10에서 @Nullable의 값이 null일지도 모르니 if