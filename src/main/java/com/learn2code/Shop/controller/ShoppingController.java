package com.learn2code.Shop.controller;

import com.learn2code.Shop.db.service.api.ShoppingService;
import com.learn2code.Shop.db.service.api.request.BuyProductRequest;
import com.learn2code.Shop.db.service.api.response.ByProductResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("shop")
public class ShoppingController {

    private final ShoppingService shoppingService;

    public ShoppingController(ShoppingService shoppingService) {
        this.shoppingService = shoppingService;
    }

    @PostMapping("/buy")
    public ResponseEntity buy(@RequestBody BuyProductRequest request){
        ByProductResponse byProductResponse = shoppingService.buyProduct(request);
        if (byProductResponse.isSuccess()){
            return ResponseEntity.ok().build();
        }else {
            return new ResponseEntity<>(byProductResponse.getErrorMessage(), HttpStatus.PRECONDITION_FAILED);
        }
    }
}
