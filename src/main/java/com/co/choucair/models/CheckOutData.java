package com.co.choucair.models;

import io.cucumber.datatable.DataTable;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@Data
@AllArgsConstructor
public class CheckOutData {
    private String firstName;
    private String lastName;
    private String postalCode;

    public static CheckOutData data(DataTable dataTable){
        Map<String, String> data = dataTable.asMaps().getFirst();

        return new CheckOutData(
                data.get("first_name"),
                data.get("last_name"),
                data.get("postal_code")
        );
    }
}
