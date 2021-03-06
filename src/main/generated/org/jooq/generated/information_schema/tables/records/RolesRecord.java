/*
 * This file is generated by jOOQ.
 */

package org.jooq.generated.information_schema.tables.records;


import javax.annotation.processing.Generated;
import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.generated.information_schema.tables.Roles;
import org.jooq.impl.TableRecordImpl;


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
public class RolesRecord extends TableRecordImpl<RolesRecord> implements Record3<String, String, Integer> {

    private static final long serialVersionUID = 311104054;

    /**
     * Create a detached RolesRecord
     */
    public RolesRecord() {
        super(Roles.ROLES);
    }

    /**
     * Create a detached, initialised RolesRecord
     */
    public RolesRecord(String name, String remarks, Integer id) {
        super(Roles.ROLES);

        set(0, name);
        set(1, remarks);
        set(2, id);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.ROLES.NAME</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.ROLES.NAME</code>.
     */
    public RolesRecord setName(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.ROLES.REMARKS</code>.
     */
    public String getRemarks() {
        return (String) get(1);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.ROLES.REMARKS</code>.
     */
    public RolesRecord setRemarks(String value) {
        set(1, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>INFORMATION_SCHEMA.ROLES.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.ROLES.ID</code>.
     */
    public RolesRecord setId(Integer value) {
        set(2, value);
        return this;
    }

    @Override
    public Row3<String, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<String, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Roles.ROLES.NAME;
    }

    @Override
    public Field<String> field2() {
        return Roles.ROLES.REMARKS;
    }

    @Override
    public Field<Integer> field3() {
        return Roles.ROLES.ID;
    }

    @Override
    public String component1() {
        return getName();
    }

    @Override
    public String component2() {
        return getRemarks();
    }

    @Override
    public Integer component3() {
        return getId();
    }

    @Override
    public String value1() {
        return getName();
    }

    @Override
    public String value2() {
        return getRemarks();
    }

    @Override
    public Integer value3() {
        return getId();
    }

    @Override
    public RolesRecord value1(String value) {
        setName(value);
        return this;
    }

    @Override
    public RolesRecord value2(String value) {
        setRemarks(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public RolesRecord value3(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public RolesRecord values(String value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }
}
