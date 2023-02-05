package com.learn2code.Shop.db.service.api;

import com.learn2code.Shop.db.service.api.request.BuyProductRequest;
import com.learn2code.Shop.db.service.api.response.ByProductResponse;

public interface ShoppingService {
        ByProductResponse buyProduct(BuyProductRequest request);
}
