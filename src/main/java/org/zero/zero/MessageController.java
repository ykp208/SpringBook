package org.zero.zero;

import javax.swing.text.html.parser.Entity;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.zero.model.dto.MessageVO;




@RestController
@RequestMapping("/messages/*") //컨트롤러+ responbody (json) 쓸수 있다

public class MessageController {

	@RequestMapping(value="/" , method = RequestMethod.POST)
	public ResponseEntity<String> addMessage(@RequestBody MessageVO vo){
		//requestbody 받는것을 해더 부분에서 받아서 객체 가해더로 담겨진다.  
		System.out.println("여기 없다");
		ResponseEntity<String> entity = null;
		try {
			System.out.println("MessageController:"+vo);
			entity = new ResponseEntity("success", HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			entity = new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
			
		}
		
		
		
		return entity;
		
	}

}
