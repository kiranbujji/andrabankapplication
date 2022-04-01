package com.crud.andrabank.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crud.andrabank.dao.AccuontDao;
import com.crud.andrabank.dto.AccountDetails;
import com.crud.andrabank.sevice.BankingService;
@RestController
@RequestMapping("/andra")

public class Controller{
	
		
	@Autowired
	private BankingService bankingService;

	@GetMapping("/getAll")
	public ResponseEntity<?> getAll() {

		List<AccuontDao> accList = bankingService.getAll();
		if(accList.isEmpty())
			new ResponseEntity("No Data Found", HttpStatus.NOT_FOUND);
		
		return new ResponseEntity(accList, HttpStatus.OK);
	}
	@GetMapping("/getAccountNo/{accNo}")
	public ResponseEntity<?> myAcccout(@PathVariable(name = "accNo", required = true) String accNo) {
		AccuontDao accountDao = bankingService.getByAccountno(accNo);
		return ResponseEntity.ok(accountDao);
	}
	@PostMapping
	public ResponseEntity<?> CreateAccount(@RequestBody AccountDetails accDto) {

		AccuontDao accDao = bankingService.create(accDto);

		ResponseEntity<AccountDetails> rs = new ResponseEntity(accDao, HttpStatus.OK);

		return rs;

	}
	@PutMapping
	public ResponseEntity<?> updateAccount(@RequestBody AccountDetails acDto) {

		AccuontDao accDao = bankingService.update(acDto);
		ResponseEntity<AccountDetails> rs = new ResponseEntity(accDao, HttpStatus.OK);

		return rs;

	}
	@DeleteMapping
	public ResponseEntity<?> deleteAccount(@RequestParam Long accNo) {

		Boolean flag = bankingService.delete(accNo);
		if (flag) {
			return new ResponseEntity("Deleted SuccessFully", HttpStatus.OK);
		}
		return null;

	}

}














/*@GetMapping("/name/{acname}")
public String accountname(@PathVariable String acname) {
	return acname;
	
}
@GetMapping("/acno/{acnum}")
public String accountno(@PathVariable String acnum) {
	return acnum;
	
}
@GetMapping("/acbal/{acbalance}")
public String accountbal(@PathVariable String acbalance ) {
	return acbalance;
}
@GetMapping("/phno/{phnnum}")
public String phoneno(@PathVariable String phnnum ) {
	return phnnum;
	
}
@GetMapping("/ifsccode/{ifsccode}")
public String ifsccode(@PathVariable String ifsccode) {
	return ifsccode;
	
}
@GetMapping("/add1/{lanename1}")
public String address(@PathVariable String lane1) {
	return lane1;

}
@GetMapping("/add2/{lanename2}")
public String address1(@PathVariable String lane2) {
	return lane2;

}
@GetMapping("/add3/{lanename3}")
public String address2(@PathVariable String lane3) {
	return lane3;

}
@GetMapping("/add4/{dist}")
public String district(@PathVariable String dist) {
	return dist;

}
@GetMapping("/add5/{statename}")
public String state(@PathVariable String state) {
	return state;

}
@GetMapping("/add6/{pin}")
public String pincode(@PathVariable String pincode) {
	return pincode;

}
@GetMapping("/add7/{land}")
public String landmark(@PathVariable String landmark) {
	return landmark;
}



/*@GetMapping("/name")
public String accountname(@RequestParam String acname) {
	return acname;
	
}
@GetMapping("/acno")
public String accountno(@RequestParam String acnum) {
	return acnum;
	
}
@GetMapping("/acbal")
public String accountbal(@RequestParam String acbalance) {
	return acbalance;
	
}
@GetMapping("/phno")
public String phoneno(@RequestParam String phnum) {
	return phnum;
	
}
@GetMapping("/ifcode")
public String ifsccode(@RequestParam String ifscCode) {
	return ifscCode;
	
}
@GetMapping("/add1")
public String lane1(@RequestParam String lanename1) {
	return lanename1;
	
}
@GetMapping("/add2")
public String lane2(@RequestParam String lanename2) {
	return lanename2;
	
}
@GetMapping("/add3")
public String lane3(@RequestParam String lanename3) {
	return lanename3;
	
}
@GetMapping("/add4")
public String district(@RequestParam String dist) {
	return dist;
	
}
@GetMapping("/add5")
public String state(@RequestParam String statename) {
	return statename;
	
}
@GetMapping("/add6")
public String pincode(@RequestParam String pin) {
	return pin;
}
}*/