import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
@Autowired
Repository rep;
@PostMapping("/add")
public String add(@RequestBody book book){
    rep.save(book);
    return "added";
}
@GetMapping("/findAllBooks")
	public List<book> getBooks() {
		return rep.findAll();
	}


    
}
