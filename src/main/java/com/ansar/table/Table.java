package com.ansar.table;

import com.ansar.table.exception.IrregularTableException;
import com.ansar.table.exception.TableIndexOutOfBoundException;

import java.util.List;

public interface Table {

    void add(Object ...inputs) throws IrregularTableException;

    List<TableRow> getTableRows();

    TableCell getCell(int column, int row) throws TableIndexOutOfBoundException;

}
