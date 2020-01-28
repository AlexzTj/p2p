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
public class ReferentialConstraints implements Serializable {

    private static final long serialVersionUID = -583804208;

    private final String constraintCatalog;
    private final String constraintSchema;
    private final String constraintName;
    private final String uniqueConstraintCatalog;
    private final String uniqueConstraintSchema;
    private final String uniqueConstraintName;
    private final String matchOption;
    private final String updateRule;
    private final String deleteRule;

    public ReferentialConstraints(ReferentialConstraints value) {
        this.constraintCatalog = value.constraintCatalog;
        this.constraintSchema = value.constraintSchema;
        this.constraintName = value.constraintName;
        this.uniqueConstraintCatalog = value.uniqueConstraintCatalog;
        this.uniqueConstraintSchema = value.uniqueConstraintSchema;
        this.uniqueConstraintName = value.uniqueConstraintName;
        this.matchOption = value.matchOption;
        this.updateRule = value.updateRule;
        this.deleteRule = value.deleteRule;
    }

    public ReferentialConstraints(
        String constraintCatalog,
        String constraintSchema,
        String constraintName,
        String uniqueConstraintCatalog,
        String uniqueConstraintSchema,
        String uniqueConstraintName,
        String matchOption,
        String updateRule,
        String deleteRule
    ) {
        this.constraintCatalog = constraintCatalog;
        this.constraintSchema = constraintSchema;
        this.constraintName = constraintName;
        this.uniqueConstraintCatalog = uniqueConstraintCatalog;
        this.uniqueConstraintSchema = uniqueConstraintSchema;
        this.uniqueConstraintName = uniqueConstraintName;
        this.matchOption = matchOption;
        this.updateRule = updateRule;
        this.deleteRule = deleteRule;
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

    public String getUniqueConstraintCatalog() {
        return this.uniqueConstraintCatalog;
    }

    public String getUniqueConstraintSchema() {
        return this.uniqueConstraintSchema;
    }

    public String getUniqueConstraintName() {
        return this.uniqueConstraintName;
    }

    public String getMatchOption() {
        return this.matchOption;
    }

    public String getUpdateRule() {
        return this.updateRule;
    }

    public String getDeleteRule() {
        return this.deleteRule;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ReferentialConstraints (");

        sb.append(constraintCatalog);
        sb.append(", ").append(constraintSchema);
        sb.append(", ").append(constraintName);
        sb.append(", ").append(uniqueConstraintCatalog);
        sb.append(", ").append(uniqueConstraintSchema);
        sb.append(", ").append(uniqueConstraintName);
        sb.append(", ").append(matchOption);
        sb.append(", ").append(updateRule);
        sb.append(", ").append(deleteRule);

        sb.append(")");
        return sb.toString();
    }
}
