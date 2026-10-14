package com.probestack.forgestudio.design.persistence.mongodb.document;

import com.probestack.forgestudio.design.model.WarehouseInput;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(
        collection = "inventory_and_order_management_api_warehouses"
)
public class WarehouseInputDocument extends WarehouseInput {
    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
