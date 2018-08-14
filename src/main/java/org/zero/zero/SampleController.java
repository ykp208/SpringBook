package org.zero.zero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zero.model.dto.SempleVO;

@RestController
@RequestMapping("/sample")
public class SampleController {

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello World";
	}
	@RequestMapping("/sendVO")
	public SempleVO sendVO() {
		SempleVO svo = new SempleVO();
		svo.setFirstName("±æµ¿");
		svo.setLastName("È«");
		svo.setMno(123);
		return svo;
	}
	
	@RequestMapping("/sendList")
	public List<SempleVO> sendList(){
		List<SempleVO> svo = new ArrayList<SempleVO>();
		for(int i=0; i < 10; i++) {
			SempleVO vo = new SempleVO();
			vo.setFirstName("±æµ¿");
			vo.setLastName("È«");
			vo.setMno(123);
			svo.add(vo);
		}
		return svo;
		
	}
	
	@RequestMapping("/sendMap")
	public HashMap<String, Object> sendMap(){
		HashMap<String, Object> hm = new HashMap<String, Object>();
		
		hm.put("¼º", "È«");
		hm.put("ÀÌ¸§", "±æµ¿");
		hm.put("³ªÀÌ", 123);
		return hm;
		
	}
	
	
}
