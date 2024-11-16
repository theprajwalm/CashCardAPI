package RESTAPI.CashCard;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cashcard")
 class CashCardController {
    @GetMapping("/{id}")
     private  ResponseEntity<CashCard> findById(@PathVariable Long id){
        CashCard cashCard = new CashCard(1000L, 123.00);
         return ResponseEntity.ok(cashCard);
     }
}
