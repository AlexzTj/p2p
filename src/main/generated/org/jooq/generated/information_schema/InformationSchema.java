/*
 * This file is generated by jOOQ.
 */

package org.jooq.generated.information_schema;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.processing.Generated;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.generated.DefaultCatalog;
import org.jooq.generated.information_schema.tables.Catalogs;
import org.jooq.generated.information_schema.tables.Collations;
import org.jooq.generated.information_schema.tables.ColumnPrivileges;
import org.jooq.generated.information_schema.tables.Columns;
import org.jooq.generated.information_schema.tables.Constants;
import org.jooq.generated.information_schema.tables.Constraints;
import org.jooq.generated.information_schema.tables.CrossReferences;
import org.jooq.generated.information_schema.tables.Domains;
import org.jooq.generated.information_schema.tables.FunctionAliases;
import org.jooq.generated.information_schema.tables.FunctionColumns;
import org.jooq.generated.information_schema.tables.Help;
import org.jooq.generated.information_schema.tables.InDoubt;
import org.jooq.generated.information_schema.tables.Indexes;
import org.jooq.generated.information_schema.tables.KeyColumnUsage;
import org.jooq.generated.information_schema.tables.Locks;
import org.jooq.generated.information_schema.tables.QueryStatistics;
import org.jooq.generated.information_schema.tables.ReferentialConstraints;
import org.jooq.generated.information_schema.tables.Rights;
import org.jooq.generated.information_schema.tables.Roles;
import org.jooq.generated.information_schema.tables.Schemata;
import org.jooq.generated.information_schema.tables.Sequences;
import org.jooq.generated.information_schema.tables.SessionState;
import org.jooq.generated.information_schema.tables.Sessions;
import org.jooq.generated.information_schema.tables.Settings;
import org.jooq.generated.information_schema.tables.Synonyms;
import org.jooq.generated.information_schema.tables.TableConstraints;
import org.jooq.generated.information_schema.tables.TablePrivileges;
import org.jooq.generated.information_schema.tables.TableTypes;
import org.jooq.generated.information_schema.tables.Tables;
import org.jooq.generated.information_schema.tables.Triggers;
import org.jooq.generated.information_schema.tables.TypeInfo;
import org.jooq.generated.information_schema.tables.Users;
import org.jooq.generated.information_schema.tables.Views;
import org.jooq.impl.SchemaImpl;


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
public class InformationSchema extends SchemaImpl {

    /**
     * The reference instance of <code>INFORMATION_SCHEMA</code>
     */
    public static final InformationSchema INFORMATION_SCHEMA = new InformationSchema();
    private static final long serialVersionUID = 1686480933;
    /**
     * The table <code>INFORMATION_SCHEMA.CATALOGS</code>.
     */
    public final Catalogs CATALOGS = org.jooq.generated.information_schema.tables.Catalogs.CATALOGS;

    /**
     * The table <code>INFORMATION_SCHEMA.COLLATIONS</code>.
     */
    public final Collations COLLATIONS = org.jooq.generated.information_schema.tables.Collations.COLLATIONS;

    /**
     * The table <code>INFORMATION_SCHEMA.COLUMNS</code>.
     */
    public final Columns COLUMNS = org.jooq.generated.information_schema.tables.Columns.COLUMNS;

    /**
     * The table <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES</code>.
     */
    public final ColumnPrivileges COLUMN_PRIVILEGES = org.jooq.generated.information_schema.tables.ColumnPrivileges.COLUMN_PRIVILEGES;

    /**
     * The table <code>INFORMATION_SCHEMA.CONSTANTS</code>.
     */
    public final Constants CONSTANTS = org.jooq.generated.information_schema.tables.Constants.CONSTANTS;

    /**
     * The table <code>INFORMATION_SCHEMA.CONSTRAINTS</code>.
     */
    public final Constraints CONSTRAINTS = org.jooq.generated.information_schema.tables.Constraints.CONSTRAINTS;

    /**
     * The table <code>INFORMATION_SCHEMA.CROSS_REFERENCES</code>.
     */
    public final CrossReferences CROSS_REFERENCES = org.jooq.generated.information_schema.tables.CrossReferences.CROSS_REFERENCES;

    /**
     * The table <code>INFORMATION_SCHEMA.DOMAINS</code>.
     */
    public final Domains DOMAINS = org.jooq.generated.information_schema.tables.Domains.DOMAINS;

    /**
     * The table <code>INFORMATION_SCHEMA.FUNCTION_ALIASES</code>.
     */
    public final FunctionAliases FUNCTION_ALIASES = org.jooq.generated.information_schema.tables.FunctionAliases.FUNCTION_ALIASES;

    /**
     * The table <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS</code>.
     */
    public final FunctionColumns FUNCTION_COLUMNS = org.jooq.generated.information_schema.tables.FunctionColumns.FUNCTION_COLUMNS;

    /**
     * The table <code>INFORMATION_SCHEMA.HELP</code>.
     */
    public final Help HELP = org.jooq.generated.information_schema.tables.Help.HELP;

    /**
     * The table <code>INFORMATION_SCHEMA.INDEXES</code>.
     */
    public final Indexes INDEXES = org.jooq.generated.information_schema.tables.Indexes.INDEXES;

    /**
     * The table <code>INFORMATION_SCHEMA.IN_DOUBT</code>.
     */
    public final InDoubt IN_DOUBT = org.jooq.generated.information_schema.tables.InDoubt.IN_DOUBT;

    /**
     * The table <code>INFORMATION_SCHEMA.KEY_COLUMN_USAGE</code>.
     */
    public final KeyColumnUsage KEY_COLUMN_USAGE = org.jooq.generated.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE;

    /**
     * The table <code>INFORMATION_SCHEMA.LOCKS</code>.
     */
    public final Locks LOCKS = org.jooq.generated.information_schema.tables.Locks.LOCKS;

    /**
     * The table <code>INFORMATION_SCHEMA.QUERY_STATISTICS</code>.
     */
    public final QueryStatistics QUERY_STATISTICS = org.jooq.generated.information_schema.tables.QueryStatistics.QUERY_STATISTICS;

    /**
     * The table <code>INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS</code>.
     */
    public final ReferentialConstraints REFERENTIAL_CONSTRAINTS = org.jooq.generated.information_schema.tables.ReferentialConstraints.REFERENTIAL_CONSTRAINTS;

    /**
     * The table <code>INFORMATION_SCHEMA.RIGHTS</code>.
     */
    public final Rights RIGHTS = org.jooq.generated.information_schema.tables.Rights.RIGHTS;

    /**
     * The table <code>INFORMATION_SCHEMA.ROLES</code>.
     */
    public final Roles ROLES = org.jooq.generated.information_schema.tables.Roles.ROLES;

    /**
     * The table <code>INFORMATION_SCHEMA.SCHEMATA</code>.
     */
    public final Schemata SCHEMATA = org.jooq.generated.information_schema.tables.Schemata.SCHEMATA;

    /**
     * The table <code>INFORMATION_SCHEMA.SEQUENCES</code>.
     */
    public final Sequences SEQUENCES = org.jooq.generated.information_schema.tables.Sequences.SEQUENCES;

    /**
     * The table <code>INFORMATION_SCHEMA.SESSIONS</code>.
     */
    public final Sessions SESSIONS = org.jooq.generated.information_schema.tables.Sessions.SESSIONS;

    /**
     * The table <code>INFORMATION_SCHEMA.SESSION_STATE</code>.
     */
    public final SessionState SESSION_STATE = org.jooq.generated.information_schema.tables.SessionState.SESSION_STATE;

    /**
     * The table <code>INFORMATION_SCHEMA.SETTINGS</code>.
     */
    public final Settings SETTINGS = org.jooq.generated.information_schema.tables.Settings.SETTINGS;

    /**
     * The table <code>INFORMATION_SCHEMA.SYNONYMS</code>.
     */
    public final Synonyms SYNONYMS = org.jooq.generated.information_schema.tables.Synonyms.SYNONYMS;

    /**
     * The table <code>INFORMATION_SCHEMA.TABLES</code>.
     */
    public final Tables TABLES = org.jooq.generated.information_schema.tables.Tables.TABLES;

    /**
     * The table <code>INFORMATION_SCHEMA.TABLE_CONSTRAINTS</code>.
     */
    public final TableConstraints TABLE_CONSTRAINTS = org.jooq.generated.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS;

    /**
     * The table <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES</code>.
     */
    public final TablePrivileges TABLE_PRIVILEGES = org.jooq.generated.information_schema.tables.TablePrivileges.TABLE_PRIVILEGES;

    /**
     * The table <code>INFORMATION_SCHEMA.TABLE_TYPES</code>.
     */
    public final TableTypes TABLE_TYPES = org.jooq.generated.information_schema.tables.TableTypes.TABLE_TYPES;

    /**
     * The table <code>INFORMATION_SCHEMA.TRIGGERS</code>.
     */
    public final Triggers TRIGGERS = org.jooq.generated.information_schema.tables.Triggers.TRIGGERS;

    /**
     * The table <code>INFORMATION_SCHEMA.TYPE_INFO</code>.
     */
    public final TypeInfo TYPE_INFO = org.jooq.generated.information_schema.tables.TypeInfo.TYPE_INFO;

    /**
     * The table <code>INFORMATION_SCHEMA.USERS</code>.
     */
    public final Users USERS = org.jooq.generated.information_schema.tables.Users.USERS;

    /**
     * The table <code>INFORMATION_SCHEMA.VIEWS</code>.
     */
    public final Views VIEWS = org.jooq.generated.information_schema.tables.Views.VIEWS;

    /**
     * No further instances allowed
     */
    private InformationSchema() {
        super("INFORMATION_SCHEMA", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Catalogs.CATALOGS,
            Collations.COLLATIONS,
            Columns.COLUMNS,
            ColumnPrivileges.COLUMN_PRIVILEGES,
            Constants.CONSTANTS,
            Constraints.CONSTRAINTS,
            CrossReferences.CROSS_REFERENCES,
            Domains.DOMAINS,
            FunctionAliases.FUNCTION_ALIASES,
            FunctionColumns.FUNCTION_COLUMNS,
            Help.HELP,
            Indexes.INDEXES,
            InDoubt.IN_DOUBT,
            KeyColumnUsage.KEY_COLUMN_USAGE,
            Locks.LOCKS,
            QueryStatistics.QUERY_STATISTICS,
            ReferentialConstraints.REFERENTIAL_CONSTRAINTS,
            Rights.RIGHTS,
            Roles.ROLES,
            Schemata.SCHEMATA,
            Sequences.SEQUENCES,
            Sessions.SESSIONS,
            SessionState.SESSION_STATE,
            Settings.SETTINGS,
            Synonyms.SYNONYMS,
            Tables.TABLES,
            TableConstraints.TABLE_CONSTRAINTS,
            TablePrivileges.TABLE_PRIVILEGES,
            TableTypes.TABLE_TYPES,
            Triggers.TRIGGERS,
            TypeInfo.TYPE_INFO,
            Users.USERS,
            Views.VIEWS);
    }
}
