package spring.core.ch01.ex06;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "spring.core.ch01.ex06",
		excludeFilters = @Filter(type = FilterType.ANNOTATION,
						classes = (NoComponent.class)))
public class AppConfig {
}
/*위치알려주기 @ComponentScan("해당위치") : 해당 위치를 뒤져볼 것 이다.
excludeFilters = @Filter(type = FilterType.ANNOTATION, 필터를 어노테이션으로 제출하겠다.
classes = (NoComponenet.class) 문법
*/