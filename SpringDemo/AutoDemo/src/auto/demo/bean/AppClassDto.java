package auto.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppClassDto {
	
	@Autowired
	private AppDto dto ;
	
	@Autowired
	public AppClassDto(@Autowired AppDto dto){this.dto = dto;}
	
	@Autowired
	public AppDto getAppDto() {return dto;}

}
