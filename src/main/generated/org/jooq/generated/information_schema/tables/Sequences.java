/*
 * This file is generated by jOOQ.
 */

package org.jooq.generated.information_schema.tables;


import javax.annotation.processing.Generated;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row12;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.generated.information_schema.InformationSchema;
import org.jooq.generated.information_schema.tables.records.SequencesRecord;
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
public class Sequences extends TableImpl<SequencesRecord> {

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.SEQUENCES</code>
     */
    public static final Sequences SEQUENCES = new Sequences();
    private static final long serialVersionUID = 722492860;
    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.SEQUENCE_CATALOG</code>.
     */
    public final TableField<SequencesRecord, String> SEQUENCE_CATALOG = createField(DSL.name("SEQUENCE_CATALOG"),
        org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");
    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.SEQUENCE_SCHEMA</code>.
     */
    public final TableField<SequencesRecord, String> SEQUENCE_SCHEMA = createField(DSL.name("SEQUENCE_SCHEMA"),
        org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");
    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.SEQUENCE_NAME</code>.
     */
    public final TableField<SequencesRecord, String> SEQUENCE_NAME = createField(DSL.name("SEQUENCE_NAME"),
        org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");
    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.CURRENT_VALUE</code>.
     */
    public final TableField<SequencesRecord, Long> CURRENT_VALUE = createField(DSL.name("CURRENT_VALUE"), org.jooq.impl.SQLDataType.BIGINT, this, "");
    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.INCREMENT</code>.
     */
    public final TableField<SequencesRecord, Long> INCREMENT = createField(DSL.name("INCREMENT"), org.jooq.impl.SQLDataType.BIGINT, this, "");
    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.IS_GENERATED</code>.
     */
    public final TableField<SequencesRecord, Boolean> IS_GENERATED = createField(DSL.name("IS_GENERATED"), org.jooq.impl.SQLDataType.BOOLEAN, this,
        "");
    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.REMARKS</code>.
     */
    public final TableField<SequencesRecord, String> REMARKS = createField(DSL.name("REMARKS"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), this,
        "");
    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.CACHE</code>.
     */
    public final TableField<SequencesRecord, Long> CACHE = createField(DSL.name("CACHE"), org.jooq.impl.SQLDataType.BIGINT, this, "");
    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.MIN_VALUE</code>.
     */
    public final TableField<SequencesRecord, Long> MIN_VALUE = createField(DSL.name("MIN_VALUE"), org.jooq.impl.SQLDataType.BIGINT, this, "");
    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.MAX_VALUE</code>.
     */
    public final TableField<SequencesRecord, Long> MAX_VALUE = createField(DSL.name("MAX_VALUE"), org.jooq.impl.SQLDataType.BIGINT, this, "");
    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.IS_CYCLE</code>.
     */
    public final TableField<SequencesRecord, Boolean> IS_CYCLE = createField(DSL.name("IS_CYCLE"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");
    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.ID</code>.
     */
    public final TableField<SequencesRecord, Integer> ID = createField(DSL.name("ID"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>INFORMATION_SCHEMA.SEQUENCES</code> table reference
     */
    public Sequences() {
        this(DSL.name("SEQUENCES"), null);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.SEQUENCES</code> table reference
     */
    public Sequences(String alias) {
        this(DSL.name(alias), SEQUENCES);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.SEQUENCES</code> table reference
     */
    public Sequences(Name alias) {
        this(alias, SEQUENCES);
    }

    private Sequences(Name alias, Table<SequencesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Sequences(Name alias, Table<SequencesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Sequences(Table<O> child, ForeignKey<O, SequencesRecord> key) {
        super(child, key, SEQUENCES);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SequencesRecord> getRecordType() {
        return SequencesRecord.class;
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Sequences as(String alias) {
        return new Sequences(DSL.name(alias), this);
    }

    @Override
    public Sequences as(Name alias) {
        return new Sequences(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Sequences rename(String name) {
        return new Sequences(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Sequences rename(Name name) {
        return new Sequences(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<String, String, String, Long, Long, Boolean, String, Long, Long, Long, Boolean, Integer> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}
