/*
 * This file is generated by jOOQ.
 */

package org.jooq.generated.information_schema.tables;


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
import org.jooq.generated.information_schema.tables.records.SchemataRecord;
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
public class Schemata extends TableImpl<SchemataRecord> {

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.SCHEMATA</code>
     */
    public static final Schemata SCHEMATA = new Schemata();
    private static final long serialVersionUID = -12011023;
    /**
     * The column <code>INFORMATION_SCHEMA.SCHEMATA.CATALOG_NAME</code>.
     */
    public final TableField<SchemataRecord, String> CATALOG_NAME = createField(DSL.name("CATALOG_NAME"),
        org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");
    /**
     * The column <code>INFORMATION_SCHEMA.SCHEMATA.SCHEMA_NAME</code>.
     */
    public final TableField<SchemataRecord, String> SCHEMA_NAME = createField(DSL.name("SCHEMA_NAME"), org.jooq.impl.SQLDataType.VARCHAR(2147483647),
        this, "");
    /**
     * The column <code>INFORMATION_SCHEMA.SCHEMATA.SCHEMA_OWNER</code>.
     */
    public final TableField<SchemataRecord, String> SCHEMA_OWNER = createField(DSL.name("SCHEMA_OWNER"),
        org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");
    /**
     * The column <code>INFORMATION_SCHEMA.SCHEMATA.DEFAULT_CHARACTER_SET_NAME</code>.
     */
    public final TableField<SchemataRecord, String> DEFAULT_CHARACTER_SET_NAME = createField(DSL.name("DEFAULT_CHARACTER_SET_NAME"),
        org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");
    /**
     * The column <code>INFORMATION_SCHEMA.SCHEMATA.DEFAULT_COLLATION_NAME</code>.
     */
    public final TableField<SchemataRecord, String> DEFAULT_COLLATION_NAME = createField(DSL.name("DEFAULT_COLLATION_NAME"),
        org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");
    /**
     * The column <code>INFORMATION_SCHEMA.SCHEMATA.IS_DEFAULT</code>.
     */
    public final TableField<SchemataRecord, Boolean> IS_DEFAULT = createField(DSL.name("IS_DEFAULT"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");
    /**
     * The column <code>INFORMATION_SCHEMA.SCHEMATA.REMARKS</code>.
     */
    public final TableField<SchemataRecord, String> REMARKS = createField(DSL.name("REMARKS"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), this,
        "");
    /**
     * The column <code>INFORMATION_SCHEMA.SCHEMATA.ID</code>.
     */
    public final TableField<SchemataRecord, Integer> ID = createField(DSL.name("ID"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>INFORMATION_SCHEMA.SCHEMATA</code> table reference
     */
    public Schemata() {
        this(DSL.name("SCHEMATA"), null);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.SCHEMATA</code> table reference
     */
    public Schemata(String alias) {
        this(DSL.name(alias), SCHEMATA);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.SCHEMATA</code> table reference
     */
    public Schemata(Name alias) {
        this(alias, SCHEMATA);
    }

    private Schemata(Name alias, Table<SchemataRecord> aliased) {
        this(alias, aliased, null);
    }

    private Schemata(Name alias, Table<SchemataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Schemata(Table<O> child, ForeignKey<O, SchemataRecord> key) {
        super(child, key, SCHEMATA);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SchemataRecord> getRecordType() {
        return SchemataRecord.class;
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Schemata as(String alias) {
        return new Schemata(DSL.name(alias), this);
    }

    @Override
    public Schemata as(Name alias) {
        return new Schemata(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Schemata rename(String name) {
        return new Schemata(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Schemata rename(Name name) {
        return new Schemata(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, String, String, String, Boolean, String, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}