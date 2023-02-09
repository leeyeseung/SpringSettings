package com.mycompany.webapp.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mycompany.webapp.dto.ImageInfo;

import lombok.extern.log4j.Log4j2;

@Controller
@RequestMapping("/ajax")
@Log4j2
public class AjaxController {
	@GetMapping("/content")
	public String content() {
		log.info("실행");
		return "ajax/content";
	}
	
	@GetMapping("/ajax1")
	public String ajax1() {
		log.info("실행");
		return "ajax/ajax1";
	}
	
//	@GetMapping("/ajax2")
//	public void ajax2(HttpServletResponse response) throws IOException {
//		log.info("실행");
//		JSONObject jsonObject = new JSONObject();
//		jsonObject.put("name", "photo5.jpg");
//		jsonObject.put("info", "아름다운 풍경");
//		String json = jsonObject.toString();
//		
//		response.setContentType("application/json; charset=UTF-8");
//		PrintWriter pw = response.getWriter();
//		pw.println(json);
//		pw.flush();
//		pw.close();
//		
//	}
	
	@GetMapping(value="/ajax2", produces="application/json; charset=UTF-8")
	@ResponseBody
	public ImageInfo ajax2(HttpServletResponse response) throws IOException {
		log.info("실행");
		ImageInfo imageInfo = new ImageInfo();
		imageInfo.setName("photo5.jpg");
		imageInfo.setInfo("아름다운 풍경");
		
		return imageInfo;
		
	}
	
	@PostMapping(value="/ajax3", produces="application/json; charset=UTF-8")
	@ResponseBody
	public ImageInfo ajax3(@RequestBody ImageInfo imageInfo) throws IOException {
		log.info("실행");
		log.info(imageInfo);
		return imageInfo;
		
	}

}
