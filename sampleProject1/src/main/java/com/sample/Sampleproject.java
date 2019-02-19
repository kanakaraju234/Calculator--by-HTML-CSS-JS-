package com.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Sampleproject {

	@RequestMapping("/")
	public String webdesign()
	{	
		return"SampleDesign";
	}
}
