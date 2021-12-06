package com.ansar.table;

import com.ansar.table.exception.IrregularTableException;
import com.ansar.table.exception.TableColumnNotFoundException;
import com.ansar.table.imp.SimpleTable;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TableTest {

    private static final String EXCEL_FILE = "testing_excel.xlsx";

    @Test
    void testExcelTable() throws IrregularTableException, TableColumnNotFoundException {

        Table excelTable = new SimpleTable("name", "code1", "code2");
        excelTable.add("sepehr", "123", "456");
        excelTable.add("soroosh", "789", "012");

        List<TableRow> rows = excelTable.getTableRows();

        assertEquals("sepehr" , rows.get(0).getCell("name").getValue());
        assertEquals("789", rows.get(1).getCell("code1").getValue());
    }
}
