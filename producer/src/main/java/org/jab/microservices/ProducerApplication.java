package org.jab.microservices;

//data class Order(val id: String)
//data class Order(val id: String, val totalPrice: Double = 0.0)

/*
@Api(description = "Producer api for order data")
@RestController
class OrderService {

    @ApiOperation("Get an order by its unique identifier")
    @GetMapping(path = ["/orders/{id}"], produces = ["application/json"])
    fun getOrderById(@PathVariable id: String): ResponseEntity<Order> = when (id) {
        "500" -> status(INTERNAL_SERVER_ERROR).build()
        "404" -> notFound().build()
   //     "1" -> ok(Order(id = id, totalPrice = 34.99))
        else -> ok(Order(id))
    }
}
*/

    /*
//@EnableSwagger2
@SpringBootApplication
class ProducerApplication {


    @Bean
    fun docket(): Docket = Docket(DocumentationType.SWAGGER_2)
            .useDefaultResponseMessages(false)
            .select()
            .apis(RequestHandlerSelectors.basePackage(ProducerApplication::class.java.`package`.name))
            .paths(PathSelectors.any())
            .build()


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<ProducerApplication>(*args)
        }
    }
}


fun main(args: Array<String>) {
    runApplication<ProducerApplication>(*args)
}

*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }

}
