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
public class TypeInfo implements Serializable {

    private static final long serialVersionUID = 1336911250;

    private final String typeName;
    private final Integer dataType;
    private final Integer precision;
    private final String prefix;
    private final String suffix;
    private final String params;
    private final Boolean autoIncrement;
    private final Short minimumScale;
    private final Short maximumScale;
    private final Integer radix;
    private final Integer pos;
    private final Boolean caseSensitive;
    private final Short nullable;
    private final Short searchable;

    public TypeInfo(TypeInfo value) {
        this.typeName = value.typeName;
        this.dataType = value.dataType;
        this.precision = value.precision;
        this.prefix = value.prefix;
        this.suffix = value.suffix;
        this.params = value.params;
        this.autoIncrement = value.autoIncrement;
        this.minimumScale = value.minimumScale;
        this.maximumScale = value.maximumScale;
        this.radix = value.radix;
        this.pos = value.pos;
        this.caseSensitive = value.caseSensitive;
        this.nullable = value.nullable;
        this.searchable = value.searchable;
    }

    public TypeInfo(
        String typeName,
        Integer dataType,
        Integer precision,
        String prefix,
        String suffix,
        String params,
        Boolean autoIncrement,
        Short minimumScale,
        Short maximumScale,
        Integer radix,
        Integer pos,
        Boolean caseSensitive,
        Short nullable,
        Short searchable
    ) {
        this.typeName = typeName;
        this.dataType = dataType;
        this.precision = precision;
        this.prefix = prefix;
        this.suffix = suffix;
        this.params = params;
        this.autoIncrement = autoIncrement;
        this.minimumScale = minimumScale;
        this.maximumScale = maximumScale;
        this.radix = radix;
        this.pos = pos;
        this.caseSensitive = caseSensitive;
        this.nullable = nullable;
        this.searchable = searchable;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public Integer getDataType() {
        return this.dataType;
    }

    public Integer getPrecision() {
        return this.precision;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public String getSuffix() {
        return this.suffix;
    }

    public String getParams() {
        return this.params;
    }

    public Boolean getAutoIncrement() {
        return this.autoIncrement;
    }

    public Short getMinimumScale() {
        return this.minimumScale;
    }

    public Short getMaximumScale() {
        return this.maximumScale;
    }

    public Integer getRadix() {
        return this.radix;
    }

    public Integer getPos() {
        return this.pos;
    }

    public Boolean getCaseSensitive() {
        return this.caseSensitive;
    }

    public Short getNullable() {
        return this.nullable;
    }

    public Short getSearchable() {
        return this.searchable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TypeInfo (");

        sb.append(typeName);
        sb.append(", ").append(dataType);
        sb.append(", ").append(precision);
        sb.append(", ").append(prefix);
        sb.append(", ").append(suffix);
        sb.append(", ").append(params);
        sb.append(", ").append(autoIncrement);
        sb.append(", ").append(minimumScale);
        sb.append(", ").append(maximumScale);
        sb.append(", ").append(radix);
        sb.append(", ").append(pos);
        sb.append(", ").append(caseSensitive);
        sb.append(", ").append(nullable);
        sb.append(", ").append(searchable);

        sb.append(")");
        return sb.toString();
    }
}
