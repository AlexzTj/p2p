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
public class Synonyms implements Serializable {

    private static final long serialVersionUID = 494453293;

    private final String synonymCatalog;
    private final String synonymSchema;
    private final String synonymName;
    private final String synonymFor;
    private final String synonymForSchema;
    private final String typeName;
    private final String status;
    private final String remarks;
    private final Integer id;

    public Synonyms(Synonyms value) {
        this.synonymCatalog = value.synonymCatalog;
        this.synonymSchema = value.synonymSchema;
        this.synonymName = value.synonymName;
        this.synonymFor = value.synonymFor;
        this.synonymForSchema = value.synonymForSchema;
        this.typeName = value.typeName;
        this.status = value.status;
        this.remarks = value.remarks;
        this.id = value.id;
    }

    public Synonyms(
        String synonymCatalog,
        String synonymSchema,
        String synonymName,
        String synonymFor,
        String synonymForSchema,
        String typeName,
        String status,
        String remarks,
        Integer id
    ) {
        this.synonymCatalog = synonymCatalog;
        this.synonymSchema = synonymSchema;
        this.synonymName = synonymName;
        this.synonymFor = synonymFor;
        this.synonymForSchema = synonymForSchema;
        this.typeName = typeName;
        this.status = status;
        this.remarks = remarks;
        this.id = id;
    }

    public String getSynonymCatalog() {
        return this.synonymCatalog;
    }

    public String getSynonymSchema() {
        return this.synonymSchema;
    }

    public String getSynonymName() {
        return this.synonymName;
    }

    public String getSynonymFor() {
        return this.synonymFor;
    }

    public String getSynonymForSchema() {
        return this.synonymForSchema;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public String getStatus() {
        return this.status;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public Integer getId() {
        return this.id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Synonyms (");

        sb.append(synonymCatalog);
        sb.append(", ").append(synonymSchema);
        sb.append(", ").append(synonymName);
        sb.append(", ").append(synonymFor);
        sb.append(", ").append(synonymForSchema);
        sb.append(", ").append(typeName);
        sb.append(", ").append(status);
        sb.append(", ").append(remarks);
        sb.append(", ").append(id);

        sb.append(")");
        return sb.toString();
    }
}
