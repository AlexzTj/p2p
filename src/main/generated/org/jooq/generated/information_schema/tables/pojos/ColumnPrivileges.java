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
public class ColumnPrivileges implements Serializable {

    private static final long serialVersionUID = 2018293519;

    private final String grantor;
    private final String grantee;
    private final String tableCatalog;
    private final String tableSchema;
    private final String tableName;
    private final String columnName;
    private final String privilegeType;
    private final String isGrantable;

    public ColumnPrivileges(ColumnPrivileges value) {
        this.grantor = value.grantor;
        this.grantee = value.grantee;
        this.tableCatalog = value.tableCatalog;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.columnName = value.columnName;
        this.privilegeType = value.privilegeType;
        this.isGrantable = value.isGrantable;
    }

    public ColumnPrivileges(
        String grantor,
        String grantee,
        String tableCatalog,
        String tableSchema,
        String tableName,
        String columnName,
        String privilegeType,
        String isGrantable
    ) {
        this.grantor = grantor;
        this.grantee = grantee;
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.columnName = columnName;
        this.privilegeType = privilegeType;
        this.isGrantable = isGrantable;
    }

    public String getGrantor() {
        return this.grantor;
    }

    public String getGrantee() {
        return this.grantee;
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

    public String getColumnName() {
        return this.columnName;
    }

    public String getPrivilegeType() {
        return this.privilegeType;
    }

    public String getIsGrantable() {
        return this.isGrantable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ColumnPrivileges (");

        sb.append(grantor);
        sb.append(", ").append(grantee);
        sb.append(", ").append(tableCatalog);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(columnName);
        sb.append(", ").append(privilegeType);
        sb.append(", ").append(isGrantable);

        sb.append(")");
        return sb.toString();
    }
}
