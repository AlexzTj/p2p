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
public class Columns implements Serializable {

    private static final long serialVersionUID = -1827014770;

    private final String tableCatalog;
    private final String tableSchema;
    private final String tableName;
    private final String columnName;
    private final Integer ordinalPosition;
    private final String domainCatalog;
    private final String domainSchema;
    private final String domainName;
    private final String columnDefault;
    private final String isNullable;
    private final Integer dataType;
    private final Integer characterMaximumLength;
    private final Integer characterOctetLength;
    private final Integer numericPrecision;
    private final Integer numericPrecisionRadix;
    private final Integer numericScale;
    private final Integer datetimePrecision;
    private final String intervalType;
    private final Integer intervalPrecision;
    private final String characterSetName;
    private final String collationName;
    private final String typeName;
    private final Integer nullable;
    private final Boolean isComputed;
    private final Integer selectivity;
    private final String checkConstraint;
    private final String sequenceName;
    private final String remarks;
    private final Short sourceDataType;
    private final String columnType;
    private final String columnOnUpdate;
    private final String isVisible;

    public Columns(Columns value) {
        this.tableCatalog = value.tableCatalog;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.columnName = value.columnName;
        this.ordinalPosition = value.ordinalPosition;
        this.domainCatalog = value.domainCatalog;
        this.domainSchema = value.domainSchema;
        this.domainName = value.domainName;
        this.columnDefault = value.columnDefault;
        this.isNullable = value.isNullable;
        this.dataType = value.dataType;
        this.characterMaximumLength = value.characterMaximumLength;
        this.characterOctetLength = value.characterOctetLength;
        this.numericPrecision = value.numericPrecision;
        this.numericPrecisionRadix = value.numericPrecisionRadix;
        this.numericScale = value.numericScale;
        this.datetimePrecision = value.datetimePrecision;
        this.intervalType = value.intervalType;
        this.intervalPrecision = value.intervalPrecision;
        this.characterSetName = value.characterSetName;
        this.collationName = value.collationName;
        this.typeName = value.typeName;
        this.nullable = value.nullable;
        this.isComputed = value.isComputed;
        this.selectivity = value.selectivity;
        this.checkConstraint = value.checkConstraint;
        this.sequenceName = value.sequenceName;
        this.remarks = value.remarks;
        this.sourceDataType = value.sourceDataType;
        this.columnType = value.columnType;
        this.columnOnUpdate = value.columnOnUpdate;
        this.isVisible = value.isVisible;
    }

    public Columns(
        String tableCatalog,
        String tableSchema,
        String tableName,
        String columnName,
        Integer ordinalPosition,
        String domainCatalog,
        String domainSchema,
        String domainName,
        String columnDefault,
        String isNullable,
        Integer dataType,
        Integer characterMaximumLength,
        Integer characterOctetLength,
        Integer numericPrecision,
        Integer numericPrecisionRadix,
        Integer numericScale,
        Integer datetimePrecision,
        String intervalType,
        Integer intervalPrecision,
        String characterSetName,
        String collationName,
        String typeName,
        Integer nullable,
        Boolean isComputed,
        Integer selectivity,
        String checkConstraint,
        String sequenceName,
        String remarks,
        Short sourceDataType,
        String columnType,
        String columnOnUpdate,
        String isVisible
    ) {
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.columnName = columnName;
        this.ordinalPosition = ordinalPosition;
        this.domainCatalog = domainCatalog;
        this.domainSchema = domainSchema;
        this.domainName = domainName;
        this.columnDefault = columnDefault;
        this.isNullable = isNullable;
        this.dataType = dataType;
        this.characterMaximumLength = characterMaximumLength;
        this.characterOctetLength = characterOctetLength;
        this.numericPrecision = numericPrecision;
        this.numericPrecisionRadix = numericPrecisionRadix;
        this.numericScale = numericScale;
        this.datetimePrecision = datetimePrecision;
        this.intervalType = intervalType;
        this.intervalPrecision = intervalPrecision;
        this.characterSetName = characterSetName;
        this.collationName = collationName;
        this.typeName = typeName;
        this.nullable = nullable;
        this.isComputed = isComputed;
        this.selectivity = selectivity;
        this.checkConstraint = checkConstraint;
        this.sequenceName = sequenceName;
        this.remarks = remarks;
        this.sourceDataType = sourceDataType;
        this.columnType = columnType;
        this.columnOnUpdate = columnOnUpdate;
        this.isVisible = isVisible;
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

    public String getColumnName() {
        return this.columnName;
    }

    public Integer getOrdinalPosition() {
        return this.ordinalPosition;
    }

    public String getDomainCatalog() {
        return this.domainCatalog;
    }

    public String getDomainSchema() {
        return this.domainSchema;
    }

    public String getDomainName() {
        return this.domainName;
    }

    public String getColumnDefault() {
        return this.columnDefault;
    }

    public String getIsNullable() {
        return this.isNullable;
    }

    public Integer getDataType() {
        return this.dataType;
    }

    public Integer getCharacterMaximumLength() {
        return this.characterMaximumLength;
    }

    public Integer getCharacterOctetLength() {
        return this.characterOctetLength;
    }

    public Integer getNumericPrecision() {
        return this.numericPrecision;
    }

    public Integer getNumericPrecisionRadix() {
        return this.numericPrecisionRadix;
    }

    public Integer getNumericScale() {
        return this.numericScale;
    }

    public Integer getDatetimePrecision() {
        return this.datetimePrecision;
    }

    public String getIntervalType() {
        return this.intervalType;
    }

    public Integer getIntervalPrecision() {
        return this.intervalPrecision;
    }

    public String getCharacterSetName() {
        return this.characterSetName;
    }

    public String getCollationName() {
        return this.collationName;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public Integer getNullable() {
        return this.nullable;
    }

    public Boolean getIsComputed() {
        return this.isComputed;
    }

    public Integer getSelectivity() {
        return this.selectivity;
    }

    public String getCheckConstraint() {
        return this.checkConstraint;
    }

    public String getSequenceName() {
        return this.sequenceName;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public Short getSourceDataType() {
        return this.sourceDataType;
    }

    public String getColumnType() {
        return this.columnType;
    }

    public String getColumnOnUpdate() {
        return this.columnOnUpdate;
    }

    public String getIsVisible() {
        return this.isVisible;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Columns (");

        sb.append(tableCatalog);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(columnName);
        sb.append(", ").append(ordinalPosition);
        sb.append(", ").append(domainCatalog);
        sb.append(", ").append(domainSchema);
        sb.append(", ").append(domainName);
        sb.append(", ").append(columnDefault);
        sb.append(", ").append(isNullable);
        sb.append(", ").append(dataType);
        sb.append(", ").append(characterMaximumLength);
        sb.append(", ").append(characterOctetLength);
        sb.append(", ").append(numericPrecision);
        sb.append(", ").append(numericPrecisionRadix);
        sb.append(", ").append(numericScale);
        sb.append(", ").append(datetimePrecision);
        sb.append(", ").append(intervalType);
        sb.append(", ").append(intervalPrecision);
        sb.append(", ").append(characterSetName);
        sb.append(", ").append(collationName);
        sb.append(", ").append(typeName);
        sb.append(", ").append(nullable);
        sb.append(", ").append(isComputed);
        sb.append(", ").append(selectivity);
        sb.append(", ").append(checkConstraint);
        sb.append(", ").append(sequenceName);
        sb.append(", ").append(remarks);
        sb.append(", ").append(sourceDataType);
        sb.append(", ").append(columnType);
        sb.append(", ").append(columnOnUpdate);
        sb.append(", ").append(isVisible);

        sb.append(")");
        return sb.toString();
    }
}
