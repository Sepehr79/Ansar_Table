package com.ansar.table.imp;

import com.ansar.table.TableCell;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SimpleTableCell implements TableCell {

    private Object value;

    private String columnName;

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public String getColumnName() {
        return columnName;
    }
}
