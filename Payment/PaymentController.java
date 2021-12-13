package payment.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment/")
public class PaymentController {
	
	@Autowired
    public PaymentService service;

    @PostMapping("/doPay/")
    public Payment doPayment(@RequestBody Payment payment){
        return service.doPay(payment);
    }
}
	 

