package hello

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
object HelloController {
	
	@RequestMapping("/")
	@ResponseBody
	def sayHello(){
	    println("Hello World!!")
	  	
	}
}
