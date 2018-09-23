package org.jab.microservices;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "Producer api for order data")
@RestController
public class OrderService {

    @ApiOperation("Get an order by its unique identifier")
    @GetMapping(path = "/orders/{id}", produces = "application/json")
    public ResponseEntity<?> getOrderById(@PathVariable String id) {
        /*
        "500" -> status(INTERNAL_SERVER_ERROR).build()
        "404" -> notFound().build()
        //     "1" -> ok(Order(id = id, totalPrice = 34.99))
        else -> ok(Order(id))
        */
        if(id.equals("500")) {
            //return new ResponseEntity<>()
            return new ResponseEntity<Error>(HttpStatus.INTERNAL_SERVER_ERROR);
        } else if(id.equals("404")) {
            return new ResponseEntity<Error>(HttpStatus.NOT_FOUND);
        } else {
            return ResponseEntity.ok(new Order(id));
        }
    }
}
