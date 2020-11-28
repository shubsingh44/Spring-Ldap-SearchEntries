package com.st.Controllers;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.st.Dao.OdmPersonRepo;
import com.st.model.User;

@RestController
public class SearchController {
	
	@Autowired
	OdmPersonRepo odm;
		
    @PostMapping("/search")
	public List<User>  Search(@RequestParam("searchtype") String searchtype,@RequestParam("filter") String filter,
			@RequestParam("text") String value) {
    	
		List<User> usr = new ArrayList<User>();
		usr = odm.findByUid(searchtype,filter,value);
		return usr;
		
    }
}
