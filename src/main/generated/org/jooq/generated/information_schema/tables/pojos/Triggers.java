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
public class Triggers implements Serializable {

    private static final long serialVersionUID = 290075119;

    private final String triggerCatalog;
    private final String triggerSchema;
    private final String triggerName;
    private final String triggerType;
    private final String tableCatalog;
    private final String tableSchema;
    private final String tableName;
    private final Boolean before;
    private final String javaClass;
    private final Integer queueSize;
    private final Boolean noWait;
    private final String remarks;
    private final String sql;
    private final Integer id;

    public Triggers(Triggers value) {
        this.triggerCatalog = value.triggerCatalog;
        this.triggerSchema = value.triggerSchema;
        this.triggerName = value.triggerName;
        this.triggerType = value.triggerType;
        this.tableCatalog = value.tableCatalog;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.before = value.before;
        this.javaClass = value.javaClass;
        this.queueSize = value.queueSize;
        this.noWait = value.noWait;
        this.remarks = value.remarks;
        this.sql = value.sql;
        this.id = value.id;
    }

    public Triggers(
        String triggerCatalog,
        String triggerSchema,
        String triggerName,
        String triggerType,
        String tableCatalog,
        String tableSchema,
        String tableName,
        Boolean before,
        String javaClass,
        Integer queueSize,
        Boolean noWait,
        String remarks,
        String sql,
        Integer id
    ) {
        this.triggerCatalog = triggerCatalog;
        this.triggerSchema = triggerSchema;
        this.triggerName = triggerName;
        this.triggerType = triggerType;
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.before = before;
        this.javaClass = javaClass;
        this.queueSize = queueSize;
        this.noWait = noWait;
        this.remarks = remarks;
        this.sql = sql;
        this.id = id;
    }

    public String getTriggerCatalog() {
        return this.triggerCatalog;
    }

    public String getTriggerSchema() {
        return this.triggerSchema;
    }

    public String getTriggerName() {
        return this.triggerName;
    }

    public String getTriggerType() {
        return this.triggerType;
    }

    public String getTableCatalog() {
        return this.tableCatalog;
    }

    public String getTableSchema() {
        return this.tableSchema;
    }

    public String getTableName() {
        return this.tableName;
    }

    public Boolean getBefore() {
        return this.before;
    }

    public String getJavaClass() {
        return this.javaClass;
    }

    public Integer getQueueSize() {
        return this.queueSize;
    }

    public Boolean getNoWait() {
        return this.noWait;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public String getSql() {
        return this.sql;
    }

    public Integer getId() {
        return this.id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Triggers (");

        sb.append(triggerCatalog);
        sb.append(", ").append(triggerSchema);
        sb.append(", ").append(triggerName);
        sb.append(", ").append(triggerType);
        sb.append(", ").append(tableCatalog);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(before);
        sb.append(", ").append(javaClass);
        sb.append(", ").append(queueSize);
        sb.append(", ").append(noWait);
        sb.append(", ").append(remarks);
        sb.append(", ").append(sql);
        sb.append(", ").append(id);

        sb.append(")");
        return sb.toString();
    }
}
