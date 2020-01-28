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
public class InDoubt implements Serializable {

    private static final long serialVersionUID = 1111899761;

    private final String transaction;
    private final String state;

    public InDoubt(InDoubt value) {
        this.transaction = value.transaction;
        this.state = value.state;
    }

    public InDoubt(
        String transaction,
        String state
    ) {
        this.transaction = transaction;
        this.state = state;
    }

    public String getTransaction() {
        return this.transaction;
    }

    public String getState() {
        return this.state;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InDoubt (");

        sb.append(transaction);
        sb.append(", ").append(state);

        sb.append(")");
        return sb.toString();
    }
}
