/*
 * This file is generated by jOOQ.
 */

package org.jooq.generated.information_schema.tables.pojos;


import java.io.Serializable;
import java.time.OffsetDateTime;
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
public class Sessions implements Serializable {

    private static final long serialVersionUID = 612249195;

    private final Integer id;
    private final String userName;
    private final OffsetDateTime sessionStart;
    private final String statement;
    private final OffsetDateTime statementStart;
    private final Boolean containsUncommitted;
    private final String state;
    private final Integer blockerId;

    public Sessions(Sessions value) {
        this.id = value.id;
        this.userName = value.userName;
        this.sessionStart = value.sessionStart;
        this.statement = value.statement;
        this.statementStart = value.statementStart;
        this.containsUncommitted = value.containsUncommitted;
        this.state = value.state;
        this.blockerId = value.blockerId;
    }

    public Sessions(
        Integer id,
        String userName,
        OffsetDateTime sessionStart,
        String statement,
        OffsetDateTime statementStart,
        Boolean containsUncommitted,
        String state,
        Integer blockerId
    ) {
        this.id = id;
        this.userName = userName;
        this.sessionStart = sessionStart;
        this.statement = statement;
        this.statementStart = statementStart;
        this.containsUncommitted = containsUncommitted;
        this.state = state;
        this.blockerId = blockerId;
    }

    public Integer getId() {
        return this.id;
    }

    public String getUserName() {
        return this.userName;
    }

    public OffsetDateTime getSessionStart() {
        return this.sessionStart;
    }

    public String getStatement() {
        return this.statement;
    }

    public OffsetDateTime getStatementStart() {
        return this.statementStart;
    }

    public Boolean getContainsUncommitted() {
        return this.containsUncommitted;
    }

    public String getState() {
        return this.state;
    }

    public Integer getBlockerId() {
        return this.blockerId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Sessions (");

        sb.append(id);
        sb.append(", ").append(userName);
        sb.append(", ").append(sessionStart);
        sb.append(", ").append(statement);
        sb.append(", ").append(statementStart);
        sb.append(", ").append(containsUncommitted);
        sb.append(", ").append(state);
        sb.append(", ").append(blockerId);

        sb.append(")");
        return sb.toString();
    }
}
