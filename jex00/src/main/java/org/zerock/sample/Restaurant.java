package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data
public class Restaurant {//Component는 스프링에서 관리해야 하는 대상임을 표시 Data는 게터세터 투스트링자동생성
	// Setter의 onMethod는 생성되는 setChef에 Autowired속성을 추가하도록 함
	@Setter(onMethod_ = @Autowired)
	private Chef chef;			// restraunt 객체는 Chef타입의 객체를 필요로 한다는 뜻
}
