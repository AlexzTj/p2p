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
public class TableTypes implements Serializable {

    private static final long serialVersionUID = 711632471;

    private final String type;

    public TableTypes(TableTypes value) {
        this.type = value.type;
    }

    public TableTypes(
        String type
    ) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TableTypes (");

        sb.append(type);

        sb.append(")");
        return sb.toString();
    }
}
