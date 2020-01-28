/*
 * This file is generated by jOOQ.
 */

package org.jooq.generated.information_schema.tables;


import javax.annotation.processing.Generated;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row1;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.generated.information_schema.InformationSchema;
import org.jooq.generated.information_schema.tables.records.CatalogsRecord;
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
public class Catalogs extends TableImpl<CatalogsRecord> {

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.CATALOGS</code>
     */
    public static final Catalogs CATALOGS = new Catalogs();
    private static final long serialVersionUID = -546941027;
    /**
     * The column <code>INFORMATION_SCHEMA.CATALOGS.CATALOG_NAME</code>.
     */
    public final TableField<CatalogsRecord, String> CATALOG_NAME = createField(DSL.name("CATALOG_NAME"),
        org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * Create a <code>INFORMATION_SCHEMA.CATALOGS</code> table reference
     */
    public Catalogs() {
        this(DSL.name("CATALOGS"), null);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.CATALOGS</code> table reference
     */
    public Catalogs(String alias) {
        this(DSL.name(alias), CATALOGS);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.CATALOGS</code> table reference
     */
    public Catalogs(Name alias) {
        this(alias, CATALOGS);
    }

    private Catalogs(Name alias, Table<CatalogsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Catalogs(Name alias, Table<CatalogsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Catalogs(Table<O> child, ForeignKey<O, CatalogsRecord> key) {
        super(child, key, CATALOGS);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CatalogsRecord> getRecordType() {
        return CatalogsRecord.class;
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Catalogs as(String alias) {
        return new Catalogs(DSL.name(alias), this);
    }

    @Override
    public Catalogs as(Name alias) {
        return new Catalogs(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Catalogs rename(String name) {
        return new Catalogs(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Catalogs rename(Name name) {
        return new Catalogs(name, null);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }
}
