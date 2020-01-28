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
public class CrossReferences implements Serializable {

    private static final long serialVersionUID = -546749089;

    private final String pktableCatalog;
    private final String pktableSchema;
    private final String pktableName;
    private final String pkcolumnName;
    private final String fktableCatalog;
    private final String fktableSchema;
    private final String fktableName;
    private final String fkcolumnName;
    private final Short ordinalPosition;
    private final Short updateRule;
    private final Short deleteRule;
    private final String fkName;
    private final String pkName;
    private final Short deferrability;

    public CrossReferences(CrossReferences value) {
        this.pktableCatalog = value.pktableCatalog;
        this.pktableSchema = value.pktableSchema;
        this.pktableName = value.pktableName;
        this.pkcolumnName = value.pkcolumnName;
        this.fktableCatalog = value.fktableCatalog;
        this.fktableSchema = value.fktableSchema;
        this.fktableName = value.fktableName;
        this.fkcolumnName = value.fkcolumnName;
        this.ordinalPosition = value.ordinalPosition;
        this.updateRule = value.updateRule;
        this.deleteRule = value.deleteRule;
        this.fkName = value.fkName;
        this.pkName = value.pkName;
        this.deferrability = value.deferrability;
    }

    public CrossReferences(
        String pktableCatalog,
        String pktableSchema,
        String pktableName,
        String pkcolumnName,
        String fktableCatalog,
        String fktableSchema,
        String fktableName,
        String fkcolumnName,
        Short ordinalPosition,
        Short updateRule,
        Short deleteRule,
        String fkName,
        String pkName,
        Short deferrability
    ) {
        this.pktableCatalog = pktableCatalog;
        this.pktableSchema = pktableSchema;
        this.pktableName = pktableName;
        this.pkcolumnName = pkcolumnName;
        this.fktableCatalog = fktableCatalog;
        this.fktableSchema = fktableSchema;
        this.fktableName = fktableName;
        this.fkcolumnName = fkcolumnName;
        this.ordinalPosition = ordinalPosition;
        this.updateRule = updateRule;
        this.deleteRule = deleteRule;
        this.fkName = fkName;
        this.pkName = pkName;
        this.deferrability = deferrability;
    }

    public String getPktableCatalog() {
        return this.pktableCatalog;
    }

    public String getPktableSchema() {
        return this.pktableSchema;
    }

    public String getPktableName() {
        return this.pktableName;
    }

    public String getPkcolumnName() {
        return this.pkcolumnName;
    }

    public String getFktableCatalog() {
        return this.fktableCatalog;
    }

    public String getFktableSchema() {
        return this.fktableSchema;
    }

    public String getFktableName() {
        return this.fktableName;
    }

    public String getFkcolumnName() {
        return this.fkcolumnName;
    }

    public Short getOrdinalPosition() {
        return this.ordinalPosition;
    }

    public Short getUpdateRule() {
        return this.updateRule;
    }

    public Short getDeleteRule() {
        return this.deleteRule;
    }

    public String getFkName() {
        return this.fkName;
    }

    public String getPkName() {
        return this.pkName;
    }

    public Short getDeferrability() {
        return this.deferrability;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CrossReferences (");

        sb.append(pktableCatalog);
        sb.append(", ").append(pktableSchema);
        sb.append(", ").append(pktableName);
        sb.append(", ").append(pkcolumnName);
        sb.append(", ").append(fktableCatalog);
        sb.append(", ").append(fktableSchema);
        sb.append(", ").append(fktableName);
        sb.append(", ").append(fkcolumnName);
        sb.append(", ").append(ordinalPosition);
        sb.append(", ").append(updateRule);
        sb.append(", ").append(deleteRule);
        sb.append(", ").append(fkName);
        sb.append(", ").append(pkName);
        sb.append(", ").append(deferrability);

        sb.append(")");
        return sb.toString();
    }
}
