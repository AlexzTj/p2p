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
public class FunctionColumns implements Serializable {

    private static final long serialVersionUID = 1607525027;

    private final String aliasCatalog;
    private final String aliasSchema;
    private final String aliasName;
    private final String javaClass;
    private final String javaMethod;
    private final Integer columnCount;
    private final Integer pos;
    private final String columnName;
    private final Integer dataType;
    private final String typeName;
    private final Integer precision;
    private final Short scale;
    private final Short radix;
    private final Short nullable;
    private final Short columnType;
    private final String remarks;
    private final String columnDefault;

    public FunctionColumns(FunctionColumns value) {
        this.aliasCatalog = value.aliasCatalog;
        this.aliasSchema = value.aliasSchema;
        this.aliasName = value.aliasName;
        this.javaClass = value.javaClass;
        this.javaMethod = value.javaMethod;
        this.columnCount = value.columnCount;
        this.pos = value.pos;
        this.columnName = value.columnName;
        this.dataType = value.dataType;
        this.typeName = value.typeName;
        this.precision = value.precision;
        this.scale = value.scale;
        this.radix = value.radix;
        this.nullable = value.nullable;
        this.columnType = value.columnType;
        this.remarks = value.remarks;
        this.columnDefault = value.columnDefault;
    }

    public FunctionColumns(
        String aliasCatalog,
        String aliasSchema,
        String aliasName,
        String javaClass,
        String javaMethod,
        Integer columnCount,
        Integer pos,
        String columnName,
        Integer dataType,
        String typeName,
        Integer precision,
        Short scale,
        Short radix,
        Short nullable,
        Short columnType,
        String remarks,
        String columnDefault
    ) {
        this.aliasCatalog = aliasCatalog;
        this.aliasSchema = aliasSchema;
        this.aliasName = aliasName;
        this.javaClass = javaClass;
        this.javaMethod = javaMethod;
        this.columnCount = columnCount;
        this.pos = pos;
        this.columnName = columnName;
        this.dataType = dataType;
        this.typeName = typeName;
        this.precision = precision;
        this.scale = scale;
        this.radix = radix;
        this.nullable = nullable;
        this.columnType = columnType;
        this.remarks = remarks;
        this.columnDefault = columnDefault;
    }

    public String getAliasCatalog() {
        return this.aliasCatalog;
    }

    public String getAliasSchema() {
        return this.aliasSchema;
    }

    public String getAliasName() {
        return this.aliasName;
    }

    public String getJavaClass() {
        return this.javaClass;
    }

    public String getJavaMethod() {
        return this.javaMethod;
    }

    public Integer getColumnCount() {
        return this.columnCount;
    }

    public Integer getPos() {
        return this.pos;
    }

    public String getColumnName() {
        return this.columnName;
    }

    public Integer getDataType() {
        return this.dataType;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public Integer getPrecision() {
        return this.precision;
    }

    public Short getScale() {
        return this.scale;
    }

    public Short getRadix() {
        return this.radix;
    }

    public Short getNullable() {
        return this.nullable;
    }

    public Short getColumnType() {
        return this.columnType;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public String getColumnDefault() {
        return this.columnDefault;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FunctionColumns (");

        sb.append(aliasCatalog);
        sb.append(", ").append(aliasSchema);
        sb.append(", ").append(aliasName);
        sb.append(", ").append(javaClass);
        sb.append(", ").append(javaMethod);
        sb.append(", ").append(columnCount);
        sb.append(", ").append(pos);
        sb.append(", ").append(columnName);
        sb.append(", ").append(dataType);
        sb.append(", ").append(typeName);
        sb.append(", ").append(precision);
        sb.append(", ").append(scale);
        sb.append(", ").append(radix);
        sb.append(", ").append(nullable);
        sb.append(", ").append(columnType);
        sb.append(", ").append(remarks);
        sb.append(", ").append(columnDefault);

        sb.append(")");
        return sb.toString();
    }
}