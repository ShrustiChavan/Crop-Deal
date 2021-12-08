package com.example.casestudy.Dealer.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.casestudy.Dealer.model.Dealer;
import com.example.casestudy.Dealer.repository.DealerRepository;


@RestController
public class DealerResource {
	
	@Autowired
	private DealerRepository dealerreposoitory;
	
	@RequestMapping("/dealer")
	public String getDealer() {
		return "Hello Dealer";
	}
	@PostMapping("/adddealer")
	public String saveFarmer(@RequestBody Dealer dealer) {
		dealerreposoitory.save(dealer);
		return "Add dealer with id:" + dealer.getDealerid();
	}
	
	@GetMapping("/findAlldealer")
		public List<Dealer> getDealer1(){
		return dealerreposoitory.findAll();
	}
	
	@GetMapping("/findAlldealer/{id}")
	public Optional<Dealer> getDealer(@PathVariable int dealerid){
		return dealerreposoitory.findById(dealerid);
	}
	
	@DeleteMapping("/delete/{id}") 
	public String deleteBook(@PathVariable int id) {
		dealerreposoitory.deleteById(id);
	  return "dealer details deleted with id : " + id; 
	  }
	
	//@PostMapping(value ="/update/{id}", method =RequestMethod.POST)
	@RequestMapping(value = "/upadte/{id}", method = RequestMethod.POST)
	public String update(@RequestBody Dealer dealer,@PathVariable int Id) {
	Optional<Dealer> dRep = dealerreposoitory.findById(Id);
	dRep.ifPresent(p->p.setDealerid(Id));
	dRep.ifPresent(p->p.setDealername(dealer.getDealername()));
	dRep.ifPresent(p->dealerreposoitory.save(p));
	return "Add dealer with id:" + dealer.getDealerid();
	}
}
