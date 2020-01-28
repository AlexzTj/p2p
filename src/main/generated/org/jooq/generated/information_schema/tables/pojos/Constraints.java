/*
 * This file is generated by jOOQ.
 */

package org.jooq.generated.information_schema.tables.pojos;


import java.io.Serializable;
import javax.annotation.processing.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings( {"all", "unchecked", "rawtypes"})
public class Constraints implements Serializable {

    private static final long serialVersionUID = -628497513;

    private final String constraintCatalog;
    private final String constraintSchema;
    private final String constraintName;
    private final String constraintType;
    private final String tableCatalog;
    private final String tableSchema;
    private final String tableName;
    private final String uniqueIndexName;
    private final String checkExpression;
    private final String columnList;
    private final String remarks;
    private final String sql;
    private final Integer id;

    public Constraints(Constraints value) {
        this.constraintCatalog = value.constraintCatalog;
        this.constraintSchema = value.constraintSchema;
        this.constraintName = value.constraintName;
        this.constraintType = value.constraintType;
        this.tableCatalog = value.tableCatalog;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.uniqueIndexName = value.uniqueIndexName;
        this.checkExpression = value.checkExpression;
        this.columnList = value.columnList;
        this.remarks = value.remarks;
        this.sql = value.sql;
        this.id = value.id;
    }

    public Constraints(
        String constraintCatalog,
        String constraintSchema,
        String constraintName,
        String constraintType,
        String tableCatalog,
        String tableSchema,
        String tableName,
        String uniqueIndexName,
        String checkExpression,
        String columnList,
        String remarks,
        String sql,
        Integer id
    ) {
        this.constraintCatalog = constraintCatalog;
        this.constraintSchema = constraintSchema;
        this.constraintName = constraintName;
        this.constraintType = constraintType;
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.uniqueIndexName = uniqueIndexName;
        this.checkExpression = checkExpression;
        this.columnList = columnList;
        this.remarks = remarks;
        this.sql = sql;
        this.id = id;
    }

    public String getConstraintCatalog() {
        return this.constraintCatalog;
    }

    public String getConstraintSchema() {
        return this.constraintSchema;
    }

    public String getConstraintName() {
        return this.constraintName;
    }

    public String getConstraintType() {
        return this.constraintType;
    }

    public String getTableCatalog() {
        return this.tableCatalog;
    }

    public String getTableSchema() {
        return this.tableSchema;
    }

    public String getTableName() {
        return this.tableName;
    }

    public String getUniqueIndexName() {
        return this.uniqueIndexName;
    }

    public String getCheckExpression() {
        return this.checkExpression;
    }

    public String getColumnList() {
        return this.columnList;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public String getSql() {
        return this.sql;
    }

    public Integer getId() {
        return this.id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Constraints (");

        sb.append(constraintCatalog);
        sb.append(", ").append(constraintSchema);
        sb.append(", ").append(constraintName);
        sb.append(", ").append(constraintType);
        sb.append(", ").append(tableCatalog);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(uniqueIndexName);
        sb.append(", ").append(checkExpression);
        sb.append(", ").append(columnList);
        sb.append(", ").append(remarks);
        sb.append(", ").append(sql);
        sb.append(", ").append(id);

        sb.append(")");
        return sb.toString();
    }
}