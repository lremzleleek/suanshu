package com.calculator.pojo.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsertAccuMsg {
    private Integer id;
    private String userResult;
    private boolean accuracy;
}
