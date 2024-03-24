package service1.example.service1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("demo")
public class TestController {
	@GetMapping("/data")
	public String getData(){
	return"Hello my name is Swapnil";
	}

}

