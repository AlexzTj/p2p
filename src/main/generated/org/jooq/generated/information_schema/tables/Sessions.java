/*
 * This file is generated by jOOQ.
 */

package org.jooq.generated.information_schema.tables;


import java.time.OffsetDateTime;
import javax.annotation.processing.Generated;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.generated.information_schema.InformationSchema;
import org.jooq.generated.information_schema.tables.records.SessionsRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Sessions extends TableImpl<SessionsRecord> {

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.SESSIONS</code>
     */
    public static final Sessions SESSIONS = new Sessions();
    private static final long serialVersionUID = 2052933283;
    /**
     * The column <code>INFORMATION_SCHEMA.SESSIONS.ID</code>.
     */
    public final TableField<SessionsRecord, Integer> ID = createField(DSL.name("ID"), org.jooq.impl.SQLDataType.INTEGER, this, "");
    /**
     * The column <code>INFORMATION_SCHEMA.SESSIONS.USER_NAME</code>.
     */
    public final TableField<SessionsRecord, String> USER_NAME = createField(DSL.name("USER_NAME"), org.jooq.impl.SQLDataType.VARCHAR(2147483647),
        this, "");
    /**
     * The column <code>INFORMATION_SCHEMA.SESSIONS.SESSION_START</code>.
     */
    public final TableField<SessionsRecord, OffsetDateTime> SESSION_START = createField(DSL.name("SESSION_START"),
        org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE.precision(9), this, "");
    /**
     * The column <code>INFORMATION_SCHEMA.SESSIONS.STATEMENT</code>.
     */
    public final TableField<SessionsRecord, String> STATEMENT = createField(DSL.name("STATEMENT"), org.jooq.impl.SQLDataType.VARCHAR(2147483647),
        this, "");
    /**
     * The column <code>INFORMATION_SCHEMA.SESSIONS.STATEMENT_START</code>.
     */
    public final TableField<SessionsRecord, OffsetDateTime> STATEMENT_START = createField(DSL.name("STATEMENT_START"),
        org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE.precision(9), this, "");
    /**
     * The column <code>INFORMATION_SCHEMA.SESSIONS.CONTAINS_UNCOMMITTED</code>.
     */
    public final TableField<SessionsRecord, Boolean> CONTAINS_UNCOMMITTED = createField(DSL.name("CONTAINS_UNCOMMITTED"),
        org.jooq.impl.SQLDataType.BOOLEAN, this, "");
    /**
     * The column <code>INFORMATION_SCHEMA.SESSIONS.STATE</code>.
     */
    public final TableField<SessionsRecord, String> STATE = createField(DSL.name("STATE"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");
    /**
     * The column <code>INFORMATION_SCHEMA.SESSIONS.BLOCKER_ID</code>.
     */
    public final TableField<SessionsRecord, Integer> BLOCKER_ID = createField(DSL.name("BLOCKER_ID"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>INFORMATION_SCHEMA.SESSIONS</code> table reference
     */
    public Sessions() {
        this(DSL.name("SESSIONS"), null);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.SESSIONS</code> table reference
     */
    public Sessions(String alias) {
        this(DSL.name(alias), SESSIONS);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.SESSIONS</code> table reference
     */
    public Sessions(Name alias) {
        this(alias, SESSIONS);
    }

    private Sessions(Name alias, Table<SessionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Sessions(Name alias, Table<SessionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Sessions(Table<O> child, ForeignKey<O, SessionsRecord> key) {
        super(child, key, SESSIONS);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SessionsRecord> getRecordType() {
        return SessionsRecord.class;
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Sessions as(String alias) {
        return new Sessions(DSL.name(alias), this);
    }

    @Override
    public Sessions as(Name alias) {
        return new Sessions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Sessions rename(String name) {
        return new Sessions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Sessions rename(Name name) {
        return new Sessions(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, String, OffsetDateTime, String, OffsetDateTime, Boolean, String, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}