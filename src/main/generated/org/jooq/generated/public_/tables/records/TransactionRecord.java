/*
 * This file is generated by jOOQ.
 */

package org.jooq.generated.public_.tables.records;


import java.sql.Timestamp;
import javax.annotation.processing.Generated;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.generated.public_.tables.Transaction;
import org.jooq.impl.UpdatableRecordImpl;


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
public class TransactionRecord extends UpdatableRecordImpl<TransactionRecord> implements Record5<String, String, String, Timestamp, Double> {

    private static final long serialVersionUID = -1966703205;

    /**
     * Create a detached TransactionRecord
     */
    public TransactionRecord() {
        super(Transaction.TRANSACTION);
    }

    /**
     * Create a detached, initialised TransactionRecord
     */
    public TransactionRecord(String id, String userId, String type, Timestamp createdAt, Double amount) {
        super(Transaction.TRANSACTION);

        set(0, id);
        set(1, userId);
        set(2, type);
        set(3, createdAt);
        set(4, amount);
    }

    /**
     * Getter for <code>public.TRANSACTION.ID</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.TRANSACTION.ID</code>.
     */
    public TransactionRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.TRANSACTION.USER_ID</code>.
     */
    public String getUserId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.TRANSACTION.USER_ID</code>.
     */
    public TransactionRecord setUserId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.TRANSACTION.TYPE</code>.
     */
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.TRANSACTION.TYPE</code>.
     */
    public TransactionRecord setType(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.TRANSACTION.CREATED_AT</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>public.TRANSACTION.CREATED_AT</code>.
     */
    public TransactionRecord setCreatedAt(Timestamp value) {
        set(3, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>public.TRANSACTION.AMOUNT</code>.
     */
    public Double getAmount() {
        return (Double) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>public.TRANSACTION.AMOUNT</code>.
     */
    public TransactionRecord setAmount(Double value) {
        set(4, value);
        return this;
    }

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    @Override
    public Row5<String, String, String, Timestamp, Double> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, String, String, Timestamp, Double> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Transaction.TRANSACTION.ID;
    }

    @Override
    public Field<String> field2() {
        return Transaction.TRANSACTION.USER_ID;
    }

    @Override
    public Field<String> field3() {
        return Transaction.TRANSACTION.TYPE;
    }

    @Override
    public Field<Timestamp> field4() {
        return Transaction.TRANSACTION.CREATED_AT;
    }

    @Override
    public Field<Double> field5() {
        return Transaction.TRANSACTION.AMOUNT;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getUserId();
    }

    @Override
    public String component3() {
        return getType();
    }

    @Override
    public Timestamp component4() {
        return getCreatedAt();
    }

    @Override
    public Double component5() {
        return getAmount();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getUserId();
    }

    @Override
    public String value3() {
        return getType();
    }

    @Override
    public Timestamp value4() {
        return getCreatedAt();
    }

    @Override
    public Double value5() {
        return getAmount();
    }

    @Override
    public TransactionRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public TransactionRecord value2(String value) {
        setUserId(value);
        return this;
    }

    @Override
    public TransactionRecord value3(String value) {
        setType(value);
        return this;
    }

    @Override
    public TransactionRecord value4(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public TransactionRecord value5(Double value) {
        setAmount(value);
        return this;
    }

    @Override
    public TransactionRecord values(String value1, String value2, String value3, Timestamp value4, Double value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }
}
