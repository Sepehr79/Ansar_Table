package com.ansar.table;

import com.ansar.table.exception.TableColumnNotFoundException;
import com.ansar.table.exception.TableIndexOutOfBoundException;

public interface TableRow {

    TableCell getCell(String columnName) throws TableColumnNotFoundException;

    TableCell getCell(int column) throws TableIndexOutOfBoundException;

}
