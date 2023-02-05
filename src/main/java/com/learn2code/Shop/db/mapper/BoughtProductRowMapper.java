package com.learn2code.Shop.db.mapper;

import com.learn2code.Shop.domain.BoughtProduct;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BoughtProductRowMapper implements RowMapper<BoughtProduct> {

    @Override
    public BoughtProduct mapRow(ResultSet rs, int rowNum) throws SQLException {
        BoughtProduct boughtProduct = new BoughtProduct();

        // With rs I can row in to the columns of the database
        boughtProduct.setProductId(rs.getInt("product_id"));
        boughtProduct.setCustomerId(rs.getInt("customer_id"));
        boughtProduct.setQuantity(rs.getInt("quantity"));
        boughtProduct.setBoughtAt(rs.getTimestamp("bought_at"));
        return boughtProduct;
    }
}
