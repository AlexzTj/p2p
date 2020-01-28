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
public class Schemata implements Serializable {

    private static final long serialVersionUID = -306710820;

    private final String catalogName;
    private final String schemaName;
    private final String schemaOwner;
    private final String defaultCharacterSetName;
    private final String defaultCollationName;
    private final Boolean isDefault;
    private final String remarks;
    private final Integer id;

    public Schemata(Schemata value) {
        this.catalogName = value.catalogName;
        this.schemaName = value.schemaName;
        this.schemaOwner = value.schemaOwner;
        this.defaultCharacterSetName = value.defaultCharacterSetName;
        this.defaultCollationName = value.defaultCollationName;
        this.isDefault = value.isDefault;
        this.remarks = value.remarks;
        this.id = value.id;
    }

    public Schemata(
        String catalogName,
        String schemaName,
        String schemaOwner,
        String defaultCharacterSetName,
        String defaultCollationName,
        Boolean isDefault,
        String remarks,
        Integer id
    ) {
        this.catalogName = catalogName;
        this.schemaName = schemaName;
        this.schemaOwner = schemaOwner;
        this.defaultCharacterSetName = defaultCharacterSetName;
        this.defaultCollationName = defaultCollationName;
        this.isDefault = isDefault;
        this.remarks = remarks;
        this.id = id;
    }

    public String getCatalogName() {
        return this.catalogName;
    }

    public String getSchemaName() {
        return this.schemaName;
    }

    public String getSchemaOwner() {
        return this.schemaOwner;
    }

    public String getDefaultCharacterSetName() {
        return this.defaultCharacterSetName;
    }

    public String getDefaultCollationName() {
        return this.defaultCollationName;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public Integer getId() {
        return this.id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Schemata (");

        sb.append(catalogName);
        sb.append(", ").append(schemaName);
        sb.append(", ").append(schemaOwner);
        sb.append(", ").append(defaultCharacterSetName);
        sb.append(", ").append(defaultCollationName);
        sb.append(", ").append(isDefault);
        sb.append(", ").append(remarks);
        sb.append(", ").append(id);

        sb.append(")");
        return sb.toString();
    }
}
