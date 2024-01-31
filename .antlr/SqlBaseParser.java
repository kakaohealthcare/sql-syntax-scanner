// Generated from /Users/grey.parrot/Documents/dev/sql-checker/SqlBaseParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMICOLON=1, LEFT_PAREN=2, RIGHT_PAREN=3, COMMA=4, DOT=5, LEFT_BRACKET=6, 
		RIGHT_BRACKET=7, ADD=8, AFTER=9, ALL=10, ALTER=11, ALWAYS=12, ANALYZE=13, 
		AND=14, ANTI=15, ANY=16, ANY_VALUE=17, ARCHIVE=18, ARRAY=19, AS=20, ASC=21, 
		AT=22, AUTHORIZATION=23, BETWEEN=24, BIGINT=25, BINARY=26, BOOLEAN=27, 
		BOTH=28, BUCKET=29, BUCKETS=30, BY=31, BYTE=32, CACHE=33, CASCADE=34, 
		CASE=35, CAST=36, CATALOG=37, CATALOGS=38, CHANGE=39, CHAR=40, CHARACTER=41, 
		CHECK=42, CLEAR=43, CLUSTER=44, CLUSTERED=45, CODEGEN=46, COLLATE=47, 
		COLLECTION=48, COLUMN=49, COLUMNS=50, COMMENT=51, COMMIT=52, COMPACT=53, 
		COMPACTIONS=54, COMPUTE=55, CONCATENATE=56, CONSTRAINT=57, COST=58, CREATE=59, 
		CROSS=60, CUBE=61, CURRENT=62, CURRENT_DATE=63, CURRENT_TIME=64, CURRENT_TIMESTAMP=65, 
		CURRENT_USER=66, DAY=67, DAYS=68, DAYOFYEAR=69, DATA=70, DATE=71, DATABASE=72, 
		DATABASES=73, DATEADD=74, DATE_ADD=75, DATEDIFF=76, DATE_DIFF=77, DBPROPERTIES=78, 
		DEC=79, DECIMAL=80, DECLARE=81, DEFAULT=82, DEFINED=83, DELETE=84, DELIMITED=85, 
		DESC=86, DESCRIBE=87, DFS=88, DIRECTORIES=89, DIRECTORY=90, DISTINCT=91, 
		DISTRIBUTE=92, DIV=93, DOUBLE=94, DROP=95, ELSE=96, END=97, ESCAPE=98, 
		ESCAPED=99, EXCEPT=100, EXCHANGE=101, EXCLUDE=102, EXISTS=103, EXPLAIN=104, 
		EXPORT=105, EXTENDED=106, EXTERNAL=107, EXTRACT=108, FALSE=109, FETCH=110, 
		FIELDS=111, FILTER=112, FILEFORMAT=113, FIRST=114, FLOAT=115, FOLLOWING=116, 
		FOR=117, FOREIGN=118, FORMAT=119, FORMATTED=120, FROM=121, FULL=122, FUNCTION=123, 
		FUNCTIONS=124, GENERATED=125, GLOBAL=126, GRANT=127, GROUP=128, GROUPING=129, 
		HAVING=130, BINARY_HEX=131, HOUR=132, HOURS=133, IDENTIFIER_KW=134, IF=135, 
		IGNORE=136, IMMEDIATE=137, IMPORT=138, IN=139, INCLUDE=140, INDEX=141, 
		INDEXES=142, INNER=143, INPATH=144, INPUTFORMAT=145, INSERT=146, INTERSECT=147, 
		INTERVAL=148, INT=149, INTEGER=150, INTO=151, IS=152, ITEMS=153, JOIN=154, 
		KEYS=155, LAST=156, LATERAL=157, LAZY=158, LEADING=159, LEFT=160, LIKE=161, 
		ILIKE=162, LIMIT=163, LINES=164, LIST=165, LOAD=166, LOCAL=167, LOCATION=168, 
		LOCK=169, LOCKS=170, LOGICAL=171, LONG=172, MACRO=173, MAP=174, MATCHED=175, 
		MERGE=176, MICROSECOND=177, MICROSECONDS=178, MILLISECOND=179, MILLISECONDS=180, 
		MINUTE=181, MINUTES=182, MONTH=183, MONTHS=184, MSCK=185, NAME=186, NAMESPACE=187, 
		NAMESPACES=188, NANOSECOND=189, NANOSECONDS=190, NATURAL=191, NO=192, 
		NOT=193, NULL=194, NULLS=195, NUMERIC=196, OF=197, OFFSET=198, ON=199, 
		ONLY=200, OPTION=201, OPTIONS=202, OR=203, ORDER=204, OUT=205, OUTER=206, 
		OUTPUTFORMAT=207, OVER=208, OVERLAPS=209, OVERLAY=210, OVERWRITE=211, 
		PARTITION=212, PARTITIONED=213, PARTITIONS=214, PERCENTILE_CONT=215, PERCENTILE_DISC=216, 
		PERCENTLIT=217, PIVOT=218, PLACING=219, POSITION=220, PRECEDING=221, PRIMARY=222, 
		PRINCIPALS=223, PROPERTIES=224, PURGE=225, QUARTER=226, QUERY=227, RANGE=228, 
		REAL=229, RECORDREADER=230, RECORDWRITER=231, RECOVER=232, REDUCE=233, 
		REFERENCES=234, REFRESH=235, RENAME=236, REPAIR=237, REPEATABLE=238, REPLACE=239, 
		RESET=240, RESPECT=241, RESTRICT=242, REVOKE=243, RIGHT=244, RLIKE=245, 
		ROLE=246, ROLES=247, ROLLBACK=248, ROLLUP=249, ROW=250, ROWS=251, SECOND=252, 
		SECONDS=253, SCHEMA=254, SCHEMAS=255, SELECT=256, SEMI=257, SEPARATED=258, 
		SERDE=259, SERDEPROPERTIES=260, SESSION_USER=261, SET=262, SETMINUS=263, 
		SETS=264, SHORT=265, SHOW=266, SINGLE=267, SKEWED=268, SMALLINT=269, SOME=270, 
		SORT=271, SORTED=272, SOURCE=273, START=274, STATISTICS=275, STORED=276, 
		STRATIFY=277, STRING=278, STRUCT=279, SUBSTR=280, SUBSTRING=281, SYNC=282, 
		SYSTEM_TIME=283, SYSTEM_VERSION=284, TABLE=285, TABLES=286, TABLESAMPLE=287, 
		TARGET=288, TBLPROPERTIES=289, TEMPORARY=290, TERMINATED=291, THEN=292, 
		TIME=293, TIMEDIFF=294, TIMESTAMP=295, TIMESTAMP_LTZ=296, TIMESTAMP_NTZ=297, 
		TIMESTAMPADD=298, TIMESTAMPDIFF=299, TINYINT=300, TO=301, EXECUTE=302, 
		TOUCH=303, TRAILING=304, TRANSACTION=305, TRANSACTIONS=306, TRANSFORM=307, 
		TRIM=308, TRUE=309, TRUNCATE=310, TRY_CAST=311, TYPE=312, UNARCHIVE=313, 
		UNBOUNDED=314, UNCACHE=315, UNION=316, UNIQUE=317, UNKNOWN=318, UNLOCK=319, 
		UNPIVOT=320, UNSET=321, UPDATE=322, USE=323, USER=324, USING=325, VALUES=326, 
		VARCHAR=327, VAR=328, VARIABLE=329, VARIANT=330, VERSION=331, VIEW=332, 
		VIEWS=333, VOID=334, WEEK=335, WEEKS=336, WHEN=337, WHERE=338, WINDOW=339, 
		WITH=340, WITHIN=341, YEAR=342, YEARS=343, ZONE=344, EQ=345, NSEQ=346, 
		NEQ=347, NEQJ=348, LT=349, LTE=350, GT=351, GTE=352, PLUS=353, MINUS=354, 
		ASTERISK=355, SLASH=356, PERCENT=357, TILDE=358, AMPERSAND=359, PIPE=360, 
		CONCAT_PIPE=361, HAT=362, COLON=363, DOUBLE_COLON=364, ARROW=365, FAT_ARROW=366, 
		HENT_START=367, HENT_END=368, QUESTION=369, STRING_LITERAL=370, DOUBLEQUOTED_STRING=371, 
		BIGINT_LITERAL=372, SMALLINT_LITERAL=373, TINYINT_LITERAL=374, INTEGER_VALUE=375, 
		EXPONENT_VALUE=376, DECIMAL_VALUE=377, FLOAT_LITERAL=378, DOUBLE_LITERAL=379, 
		BIGDECIMAL_LITERAL=380, IDENTIFIER=381, BACKQUOTED_IDENTIFIER=382, SIMPLE_COMMENT=383, 
		BRACKETED_COMMENT=384, WS=385, UNRECOGNIZED=386;
	public static final int
		RULE_singleStatement = 0, RULE_singleExpression = 1, RULE_singleTableIdentifier = 2, 
		RULE_singleMultipartIdentifier = 3, RULE_singleFunctionIdentifier = 4, 
		RULE_singleDataType = 5, RULE_singleTableSchema = 6, RULE_statement = 7, 
		RULE_executeImmediate = 8, RULE_executeImmediateUsing = 9, RULE_executeImmediateQueryParam = 10, 
		RULE_executeImmediateArgument = 11, RULE_executeImmediateArgumentSeq = 12, 
		RULE_timezone = 13, RULE_configKey = 14, RULE_configValue = 15, RULE_unsupportedHiveNativeCommands = 16, 
		RULE_createTableHeader = 17, RULE_replaceTableHeader = 18, RULE_clusterBySpec = 19, 
		RULE_bucketSpec = 20, RULE_skewSpec = 21, RULE_locationSpec = 22, RULE_commentSpec = 23, 
		RULE_query = 24, RULE_insertInto = 25, RULE_partitionSpecLocation = 26, 
		RULE_partitionSpec = 27, RULE_partitionVal = 28, RULE_namespace = 29, 
		RULE_namespaces = 30, RULE_describeFuncName = 31, RULE_describeColName = 32, 
		RULE_ctes = 33, RULE_namedQuery = 34, RULE_tableProvider = 35, RULE_createTableClauses = 36, 
		RULE_propertyList = 37, RULE_property = 38, RULE_propertyKey = 39, RULE_propertyValue = 40, 
		RULE_expressionPropertyList = 41, RULE_expressionProperty = 42, RULE_constantList = 43, 
		RULE_nestedConstantList = 44, RULE_createFileFormat = 45, RULE_fileFormat = 46, 
		RULE_storageHandler = 47, RULE_resource = 48, RULE_dmlStatementNoWith = 49, 
		RULE_identifierReference = 50, RULE_queryOrganization = 51, RULE_multiInsertQueryBody = 52, 
		RULE_queryTerm = 53, RULE_queryPrimary = 54, RULE_sortItem = 55, RULE_fromStatement = 56, 
		RULE_fromStatementBody = 57, RULE_querySpecification = 58, RULE_transformClause = 59, 
		RULE_selectClause = 60, RULE_setClause = 61, RULE_matchedClause = 62, 
		RULE_notMatchedClause = 63, RULE_notMatchedBySourceClause = 64, RULE_matchedAction = 65, 
		RULE_notMatchedAction = 66, RULE_notMatchedBySourceAction = 67, RULE_exceptClause = 68, 
		RULE_assignmentList = 69, RULE_assignment = 70, RULE_whereClause = 71, 
		RULE_havingClause = 72, RULE_hint = 73, RULE_hintStatement = 74, RULE_fromClause = 75, 
		RULE_temporalClause = 76, RULE_aggregationClause = 77, RULE_groupByClause = 78, 
		RULE_groupingAnalytics = 79, RULE_groupingElement = 80, RULE_groupingSet = 81, 
		RULE_pivotClause = 82, RULE_pivotColumn = 83, RULE_pivotValue = 84, RULE_unpivotClause = 85, 
		RULE_unpivotNullClause = 86, RULE_unpivotOperator = 87, RULE_unpivotSingleValueColumnClause = 88, 
		RULE_unpivotMultiValueColumnClause = 89, RULE_unpivotColumnSet = 90, RULE_unpivotValueColumn = 91, 
		RULE_unpivotNameColumn = 92, RULE_unpivotColumnAndAlias = 93, RULE_unpivotColumn = 94, 
		RULE_unpivotAlias = 95, RULE_lateralView = 96, RULE_setQuantifier = 97, 
		RULE_relation = 98, RULE_relationExtension = 99, RULE_joinRelation = 100, 
		RULE_joinType = 101, RULE_joinCriteria = 102, RULE_sample = 103, RULE_sampleMethod = 104, 
		RULE_identifierList = 105, RULE_identifierSeq = 106, RULE_orderedIdentifierList = 107, 
		RULE_orderedIdentifier = 108, RULE_identifierCommentList = 109, RULE_identifierComment = 110, 
		RULE_relationPrimary = 111, RULE_inlineTable = 112, RULE_functionTableSubqueryArgument = 113, 
		RULE_tableArgumentPartitioning = 114, RULE_functionTableNamedArgumentExpression = 115, 
		RULE_functionTableReferenceArgument = 116, RULE_functionTableArgument = 117, 
		RULE_functionTable = 118, RULE_tableAlias = 119, RULE_rowFormat = 120, 
		RULE_multipartIdentifierList = 121, RULE_multipartIdentifier = 122, RULE_multipartIdentifierPropertyList = 123, 
		RULE_multipartIdentifierProperty = 124, RULE_tableIdentifier = 125, RULE_functionIdentifier = 126, 
		RULE_namedExpression = 127, RULE_namedExpressionSeq = 128, RULE_partitionFieldList = 129, 
		RULE_partitionField = 130, RULE_transform = 131, RULE_transformArgument = 132, 
		RULE_expression = 133, RULE_namedArgumentExpression = 134, RULE_functionArgument = 135, 
		RULE_expressionSeq = 136, RULE_booleanExpression = 137, RULE_predicate = 138, 
		RULE_valueExpression = 139, RULE_datetimeUnit = 140, RULE_primaryExpression = 141, 
		RULE_literalType = 142, RULE_constant = 143, RULE_comparisonOperator = 144, 
		RULE_arithmeticOperator = 145, RULE_predicateOperator = 146, RULE_booleanValue = 147, 
		RULE_interval = 148, RULE_errorCapturingMultiUnitsInterval = 149, RULE_multiUnitsInterval = 150, 
		RULE_errorCapturingUnitToUnitInterval = 151, RULE_unitToUnitInterval = 152, 
		RULE_intervalValue = 153, RULE_unitInMultiUnits = 154, RULE_unitInUnitToUnit = 155, 
		RULE_colPosition = 156, RULE_type = 157, RULE_dataType = 158, RULE_qualifiedColTypeWithPositionList = 159, 
		RULE_qualifiedColTypeWithPosition = 160, RULE_colDefinitionDescriptorWithPosition = 161, 
		RULE_defaultExpression = 162, RULE_variableDefaultExpression = 163, RULE_colTypeList = 164, 
		RULE_colType = 165, RULE_createOrReplaceTableColTypeList = 166, RULE_createOrReplaceTableColType = 167, 
		RULE_colDefinitionOption = 168, RULE_generationExpression = 169, RULE_complexColTypeList = 170, 
		RULE_complexColType = 171, RULE_whenClause = 172, RULE_windowClause = 173, 
		RULE_namedWindow = 174, RULE_windowSpec = 175, RULE_windowFrame = 176, 
		RULE_frameBound = 177, RULE_qualifiedNameList = 178, RULE_functionName = 179, 
		RULE_qualifiedName = 180, RULE_errorCapturingIdentifier = 181, RULE_errorCapturingIdentifierExtra = 182, 
		RULE_identifier = 183, RULE_strictIdentifier = 184, RULE_quotedIdentifier = 185, 
		RULE_backQuotedIdentifier = 186, RULE_number = 187, RULE_alterColumnAction = 188, 
		RULE_stringLit = 189, RULE_comment = 190, RULE_version = 191, RULE_ansiNonReserved = 192, 
		RULE_strictNonReserved = 193, RULE_nonReserved = 194;
	private static String[] makeRuleNames() {
		return new String[] {
			"singleStatement", "singleExpression", "singleTableIdentifier", "singleMultipartIdentifier", 
			"singleFunctionIdentifier", "singleDataType", "singleTableSchema", "statement", 
			"executeImmediate", "executeImmediateUsing", "executeImmediateQueryParam", 
			"executeImmediateArgument", "executeImmediateArgumentSeq", "timezone", 
			"configKey", "configValue", "unsupportedHiveNativeCommands", "createTableHeader", 
			"replaceTableHeader", "clusterBySpec", "bucketSpec", "skewSpec", "locationSpec", 
			"commentSpec", "query", "insertInto", "partitionSpecLocation", "partitionSpec", 
			"partitionVal", "namespace", "namespaces", "describeFuncName", "describeColName", 
			"ctes", "namedQuery", "tableProvider", "createTableClauses", "propertyList", 
			"property", "propertyKey", "propertyValue", "expressionPropertyList", 
			"expressionProperty", "constantList", "nestedConstantList", "createFileFormat", 
			"fileFormat", "storageHandler", "resource", "dmlStatementNoWith", "identifierReference", 
			"queryOrganization", "multiInsertQueryBody", "queryTerm", "queryPrimary", 
			"sortItem", "fromStatement", "fromStatementBody", "querySpecification", 
			"transformClause", "selectClause", "setClause", "matchedClause", "notMatchedClause", 
			"notMatchedBySourceClause", "matchedAction", "notMatchedAction", "notMatchedBySourceAction", 
			"exceptClause", "assignmentList", "assignment", "whereClause", "havingClause", 
			"hint", "hintStatement", "fromClause", "temporalClause", "aggregationClause", 
			"groupByClause", "groupingAnalytics", "groupingElement", "groupingSet", 
			"pivotClause", "pivotColumn", "pivotValue", "unpivotClause", "unpivotNullClause", 
			"unpivotOperator", "unpivotSingleValueColumnClause", "unpivotMultiValueColumnClause", 
			"unpivotColumnSet", "unpivotValueColumn", "unpivotNameColumn", "unpivotColumnAndAlias", 
			"unpivotColumn", "unpivotAlias", "lateralView", "setQuantifier", "relation", 
			"relationExtension", "joinRelation", "joinType", "joinCriteria", "sample", 
			"sampleMethod", "identifierList", "identifierSeq", "orderedIdentifierList", 
			"orderedIdentifier", "identifierCommentList", "identifierComment", "relationPrimary", 
			"inlineTable", "functionTableSubqueryArgument", "tableArgumentPartitioning", 
			"functionTableNamedArgumentExpression", "functionTableReferenceArgument", 
			"functionTableArgument", "functionTable", "tableAlias", "rowFormat", 
			"multipartIdentifierList", "multipartIdentifier", "multipartIdentifierPropertyList", 
			"multipartIdentifierProperty", "tableIdentifier", "functionIdentifier", 
			"namedExpression", "namedExpressionSeq", "partitionFieldList", "partitionField", 
			"transform", "transformArgument", "expression", "namedArgumentExpression", 
			"functionArgument", "expressionSeq", "booleanExpression", "predicate", 
			"valueExpression", "datetimeUnit", "primaryExpression", "literalType", 
			"constant", "comparisonOperator", "arithmeticOperator", "predicateOperator", 
			"booleanValue", "interval", "errorCapturingMultiUnitsInterval", "multiUnitsInterval", 
			"errorCapturingUnitToUnitInterval", "unitToUnitInterval", "intervalValue", 
			"unitInMultiUnits", "unitInUnitToUnit", "colPosition", "type", "dataType", 
			"qualifiedColTypeWithPositionList", "qualifiedColTypeWithPosition", "colDefinitionDescriptorWithPosition", 
			"defaultExpression", "variableDefaultExpression", "colTypeList", "colType", 
			"createOrReplaceTableColTypeList", "createOrReplaceTableColType", "colDefinitionOption", 
			"generationExpression", "complexColTypeList", "complexColType", "whenClause", 
			"windowClause", "namedWindow", "windowSpec", "windowFrame", "frameBound", 
			"qualifiedNameList", "functionName", "qualifiedName", "errorCapturingIdentifier", 
			"errorCapturingIdentifierExtra", "identifier", "strictIdentifier", "quotedIdentifier", 
			"backQuotedIdentifier", "number", "alterColumnAction", "stringLit", "comment", 
			"version", "ansiNonReserved", "strictNonReserved", "nonReserved"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "','", "'.'", "'['", "']'", "'ADD'", "'AFTER'", 
			"'ALL'", "'ALTER'", "'ALWAYS'", "'ANALYZE'", "'AND'", "'ANTI'", "'ANY'", 
			"'ANY_VALUE'", "'ARCHIVE'", "'ARRAY'", "'AS'", "'ASC'", "'AT'", "'AUTHORIZATION'", 
			"'BETWEEN'", "'BIGINT'", "'BINARY'", "'BOOLEAN'", "'BOTH'", "'BUCKET'", 
			"'BUCKETS'", "'BY'", "'BYTE'", "'CACHE'", "'CASCADE'", "'CASE'", "'CAST'", 
			"'CATALOG'", "'CATALOGS'", "'CHANGE'", "'CHAR'", "'CHARACTER'", "'CHECK'", 
			"'CLEAR'", "'CLUSTER'", "'CLUSTERED'", "'CODEGEN'", "'COLLATE'", "'COLLECTION'", 
			"'COLUMN'", "'COLUMNS'", "'COMMENT'", "'COMMIT'", "'COMPACT'", "'COMPACTIONS'", 
			"'COMPUTE'", "'CONCATENATE'", "'CONSTRAINT'", "'COST'", "'CREATE'", "'CROSS'", 
			"'CUBE'", "'CURRENT'", "'CURRENT_DATE'", "'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", 
			"'CURRENT_USER'", "'DAY'", "'DAYS'", "'DAYOFYEAR'", "'DATA'", "'DATE'", 
			"'DATABASE'", "'DATABASES'", "'DATEADD'", "'DATE_ADD'", "'DATEDIFF'", 
			"'DATE_DIFF'", "'DBPROPERTIES'", "'DEC'", "'DECIMAL'", "'DECLARE'", "'DEFAULT'", 
			"'DEFINED'", "'DELETE'", "'DELIMITED'", "'DESC'", "'DESCRIBE'", "'DFS'", 
			"'DIRECTORIES'", "'DIRECTORY'", "'DISTINCT'", "'DISTRIBUTE'", "'DIV'", 
			"'DOUBLE'", "'DROP'", "'ELSE'", "'END'", "'ESCAPE'", "'ESCAPED'", "'EXCEPT'", 
			"'EXCHANGE'", "'EXCLUDE'", "'EXISTS'", "'EXPLAIN'", "'EXPORT'", "'EXTENDED'", 
			"'EXTERNAL'", "'EXTRACT'", "'FALSE'", "'FETCH'", "'FIELDS'", "'FILTER'", 
			"'FILEFORMAT'", "'FIRST'", "'FLOAT'", "'FOLLOWING'", "'FOR'", "'FOREIGN'", 
			"'FORMAT'", "'FORMATTED'", "'FROM'", "'FULL'", "'FUNCTION'", "'FUNCTIONS'", 
			"'GENERATED'", "'GLOBAL'", "'GRANT'", "'GROUP'", "'GROUPING'", "'HAVING'", 
			"'X'", "'HOUR'", "'HOURS'", "'IDENTIFIER'", "'IF'", "'IGNORE'", "'IMMEDIATE'", 
			"'IMPORT'", "'IN'", "'INCLUDE'", "'INDEX'", "'INDEXES'", "'INNER'", "'INPATH'", 
			"'INPUTFORMAT'", "'INSERT'", "'INTERSECT'", "'INTERVAL'", "'INT'", "'INTEGER'", 
			"'INTO'", "'IS'", "'ITEMS'", "'JOIN'", "'KEYS'", "'LAST'", "'LATERAL'", 
			"'LAZY'", "'LEADING'", "'LEFT'", "'LIKE'", "'ILIKE'", "'LIMIT'", "'LINES'", 
			"'LIST'", "'LOAD'", "'LOCAL'", "'LOCATION'", "'LOCK'", "'LOCKS'", "'LOGICAL'", 
			"'LONG'", "'MACRO'", "'MAP'", "'MATCHED'", "'MERGE'", "'MICROSECOND'", 
			"'MICROSECONDS'", "'MILLISECOND'", "'MILLISECONDS'", "'MINUTE'", "'MINUTES'", 
			"'MONTH'", "'MONTHS'", "'MSCK'", "'NAME'", "'NAMESPACE'", "'NAMESPACES'", 
			"'NANOSECOND'", "'NANOSECONDS'", "'NATURAL'", "'NO'", null, "'NULL'", 
			"'NULLS'", "'NUMERIC'", "'OF'", "'OFFSET'", "'ON'", "'ONLY'", "'OPTION'", 
			"'OPTIONS'", "'OR'", "'ORDER'", "'OUT'", "'OUTER'", "'OUTPUTFORMAT'", 
			"'OVER'", "'OVERLAPS'", "'OVERLAY'", "'OVERWRITE'", "'PARTITION'", "'PARTITIONED'", 
			"'PARTITIONS'", "'PERCENTILE_CONT'", "'PERCENTILE_DISC'", "'PERCENT'", 
			"'PIVOT'", "'PLACING'", "'POSITION'", "'PRECEDING'", "'PRIMARY'", "'PRINCIPALS'", 
			"'PROPERTIES'", "'PURGE'", "'QUARTER'", "'QUERY'", "'RANGE'", "'REAL'", 
			"'RECORDREADER'", "'RECORDWRITER'", "'RECOVER'", "'REDUCE'", "'REFERENCES'", 
			"'REFRESH'", "'RENAME'", "'REPAIR'", "'REPEATABLE'", "'REPLACE'", "'RESET'", 
			"'RESPECT'", "'RESTRICT'", "'REVOKE'", "'RIGHT'", null, "'ROLE'", "'ROLES'", 
			"'ROLLBACK'", "'ROLLUP'", "'ROW'", "'ROWS'", "'SECOND'", "'SECONDS'", 
			"'SCHEMA'", "'SCHEMAS'", "'SELECT'", "'SEMI'", "'SEPARATED'", "'SERDE'", 
			"'SERDEPROPERTIES'", "'SESSION_USER'", "'SET'", "'MINUS'", "'SETS'", 
			"'SHORT'", "'SHOW'", "'SINGLE'", "'SKEWED'", "'SMALLINT'", "'SOME'", 
			"'SORT'", "'SORTED'", "'SOURCE'", "'START'", "'STATISTICS'", "'STORED'", 
			"'STRATIFY'", "'STRING'", "'STRUCT'", "'SUBSTR'", "'SUBSTRING'", "'SYNC'", 
			"'SYSTEM_TIME'", "'SYSTEM_VERSION'", "'TABLE'", "'TABLES'", "'TABLESAMPLE'", 
			"'TARGET'", "'TBLPROPERTIES'", null, "'TERMINATED'", "'THEN'", "'TIME'", 
			"'TIMEDIFF'", "'TIMESTAMP'", "'TIMESTAMP_LTZ'", "'TIMESTAMP_NTZ'", "'TIMESTAMPADD'", 
			"'TIMESTAMPDIFF'", "'TINYINT'", "'TO'", "'EXECUTE'", "'TOUCH'", "'TRAILING'", 
			"'TRANSACTION'", "'TRANSACTIONS'", "'TRANSFORM'", "'TRIM'", "'TRUE'", 
			"'TRUNCATE'", "'TRY_CAST'", "'TYPE'", "'UNARCHIVE'", "'UNBOUNDED'", "'UNCACHE'", 
			"'UNION'", "'UNIQUE'", "'UNKNOWN'", "'UNLOCK'", "'UNPIVOT'", "'UNSET'", 
			"'UPDATE'", "'USE'", "'USER'", "'USING'", "'VALUES'", "'VARCHAR'", "'VAR'", 
			"'VARIABLE'", "'VARIANT'", "'VERSION'", "'VIEW'", "'VIEWS'", "'VOID'", 
			"'WEEK'", "'WEEKS'", "'WHEN'", "'WHERE'", "'WINDOW'", "'WITH'", "'WITHIN'", 
			"'YEAR'", "'YEARS'", "'ZONE'", null, "'<=>'", "'<>'", "'!='", "'<'", 
			null, "'>'", null, "'+'", "'-'", "'*'", "'/'", "'%'", "'~'", "'&'", "'|'", 
			"'||'", "'^'", "':'", "'::'", "'->'", "'=>'", "'/*+'", "'*/'", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEMICOLON", "LEFT_PAREN", "RIGHT_PAREN", "COMMA", "DOT", "LEFT_BRACKET", 
			"RIGHT_BRACKET", "ADD", "AFTER", "ALL", "ALTER", "ALWAYS", "ANALYZE", 
			"AND", "ANTI", "ANY", "ANY_VALUE", "ARCHIVE", "ARRAY", "AS", "ASC", "AT", 
			"AUTHORIZATION", "BETWEEN", "BIGINT", "BINARY", "BOOLEAN", "BOTH", "BUCKET", 
			"BUCKETS", "BY", "BYTE", "CACHE", "CASCADE", "CASE", "CAST", "CATALOG", 
			"CATALOGS", "CHANGE", "CHAR", "CHARACTER", "CHECK", "CLEAR", "CLUSTER", 
			"CLUSTERED", "CODEGEN", "COLLATE", "COLLECTION", "COLUMN", "COLUMNS", 
			"COMMENT", "COMMIT", "COMPACT", "COMPACTIONS", "COMPUTE", "CONCATENATE", 
			"CONSTRAINT", "COST", "CREATE", "CROSS", "CUBE", "CURRENT", "CURRENT_DATE", 
			"CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", "DAY", "DAYS", "DAYOFYEAR", 
			"DATA", "DATE", "DATABASE", "DATABASES", "DATEADD", "DATE_ADD", "DATEDIFF", 
			"DATE_DIFF", "DBPROPERTIES", "DEC", "DECIMAL", "DECLARE", "DEFAULT", 
			"DEFINED", "DELETE", "DELIMITED", "DESC", "DESCRIBE", "DFS", "DIRECTORIES", 
			"DIRECTORY", "DISTINCT", "DISTRIBUTE", "DIV", "DOUBLE", "DROP", "ELSE", 
			"END", "ESCAPE", "ESCAPED", "EXCEPT", "EXCHANGE", "EXCLUDE", "EXISTS", 
			"EXPLAIN", "EXPORT", "EXTENDED", "EXTERNAL", "EXTRACT", "FALSE", "FETCH", 
			"FIELDS", "FILTER", "FILEFORMAT", "FIRST", "FLOAT", "FOLLOWING", "FOR", 
			"FOREIGN", "FORMAT", "FORMATTED", "FROM", "FULL", "FUNCTION", "FUNCTIONS", 
			"GENERATED", "GLOBAL", "GRANT", "GROUP", "GROUPING", "HAVING", "BINARY_HEX", 
			"HOUR", "HOURS", "IDENTIFIER_KW", "IF", "IGNORE", "IMMEDIATE", "IMPORT", 
			"IN", "INCLUDE", "INDEX", "INDEXES", "INNER", "INPATH", "INPUTFORMAT", 
			"INSERT", "INTERSECT", "INTERVAL", "INT", "INTEGER", "INTO", "IS", "ITEMS", 
			"JOIN", "KEYS", "LAST", "LATERAL", "LAZY", "LEADING", "LEFT", "LIKE", 
			"ILIKE", "LIMIT", "LINES", "LIST", "LOAD", "LOCAL", "LOCATION", "LOCK", 
			"LOCKS", "LOGICAL", "LONG", "MACRO", "MAP", "MATCHED", "MERGE", "MICROSECOND", 
			"MICROSECONDS", "MILLISECOND", "MILLISECONDS", "MINUTE", "MINUTES", "MONTH", 
			"MONTHS", "MSCK", "NAME", "NAMESPACE", "NAMESPACES", "NANOSECOND", "NANOSECONDS", 
			"NATURAL", "NO", "NOT", "NULL", "NULLS", "NUMERIC", "OF", "OFFSET", "ON", 
			"ONLY", "OPTION", "OPTIONS", "OR", "ORDER", "OUT", "OUTER", "OUTPUTFORMAT", 
			"OVER", "OVERLAPS", "OVERLAY", "OVERWRITE", "PARTITION", "PARTITIONED", 
			"PARTITIONS", "PERCENTILE_CONT", "PERCENTILE_DISC", "PERCENTLIT", "PIVOT", 
			"PLACING", "POSITION", "PRECEDING", "PRIMARY", "PRINCIPALS", "PROPERTIES", 
			"PURGE", "QUARTER", "QUERY", "RANGE", "REAL", "RECORDREADER", "RECORDWRITER", 
			"RECOVER", "REDUCE", "REFERENCES", "REFRESH", "RENAME", "REPAIR", "REPEATABLE", 
			"REPLACE", "RESET", "RESPECT", "RESTRICT", "REVOKE", "RIGHT", "RLIKE", 
			"ROLE", "ROLES", "ROLLBACK", "ROLLUP", "ROW", "ROWS", "SECOND", "SECONDS", 
			"SCHEMA", "SCHEMAS", "SELECT", "SEMI", "SEPARATED", "SERDE", "SERDEPROPERTIES", 
			"SESSION_USER", "SET", "SETMINUS", "SETS", "SHORT", "SHOW", "SINGLE", 
			"SKEWED", "SMALLINT", "SOME", "SORT", "SORTED", "SOURCE", "START", "STATISTICS", 
			"STORED", "STRATIFY", "STRING", "STRUCT", "SUBSTR", "SUBSTRING", "SYNC", 
			"SYSTEM_TIME", "SYSTEM_VERSION", "TABLE", "TABLES", "TABLESAMPLE", "TARGET", 
			"TBLPROPERTIES", "TEMPORARY", "TERMINATED", "THEN", "TIME", "TIMEDIFF", 
			"TIMESTAMP", "TIMESTAMP_LTZ", "TIMESTAMP_NTZ", "TIMESTAMPADD", "TIMESTAMPDIFF", 
			"TINYINT", "TO", "EXECUTE", "TOUCH", "TRAILING", "TRANSACTION", "TRANSACTIONS", 
			"TRANSFORM", "TRIM", "TRUE", "TRUNCATE", "TRY_CAST", "TYPE", "UNARCHIVE", 
			"UNBOUNDED", "UNCACHE", "UNION", "UNIQUE", "UNKNOWN", "UNLOCK", "UNPIVOT", 
			"UNSET", "UPDATE", "USE", "USER", "USING", "VALUES", "VARCHAR", "VAR", 
			"VARIABLE", "VARIANT", "VERSION", "VIEW", "VIEWS", "VOID", "WEEK", "WEEKS", 
			"WHEN", "WHERE", "WINDOW", "WITH", "WITHIN", "YEAR", "YEARS", "ZONE", 
			"EQ", "NSEQ", "NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", 
			"ASTERISK", "SLASH", "PERCENT", "TILDE", "AMPERSAND", "PIPE", "CONCAT_PIPE", 
			"HAT", "COLON", "DOUBLE_COLON", "ARROW", "FAT_ARROW", "HENT_START", "HENT_END", 
			"QUESTION", "STRING_LITERAL", "DOUBLEQUOTED_STRING", "BIGINT_LITERAL", 
			"SMALLINT_LITERAL", "TINYINT_LITERAL", "INTEGER_VALUE", "EXPONENT_VALUE", 
			"DECIMAL_VALUE", "FLOAT_LITERAL", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", 
			"IDENTIFIER", "BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_COMMENT", 
			"WS", "UNRECOGNIZED"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SqlBaseParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  /**
	   * When false, INTERSECT is given the greater precedence over the other set
	   * operations (UNION, EXCEPT and MINUS) as per the SQL standard.
	   */
	  public boolean legacy_setops_precedence_enabled = false;

	  /**
	   * When false, a literal with an exponent would be converted into
	   * double type rather than decimal type.
	   */
	  public boolean legacy_exponent_literal_as_decimal_enabled = false;

	  /**
	   * When true, the behavior of keywords follows ANSI SQL standard.
	   */
	  public boolean SQL_standard_keyword_behavior = false;

	  /**
	   * When true, double quoted literals are identifiers rather than STRINGs.
	   */
	  public boolean double_quoted_identifiers = false;

	public SqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(SqlBaseParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SqlBaseParser.SEMICOLON, i);
		}
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			statement();
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(391);
				match(SEMICOLON);
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(397);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleExpressionContext extends ParserRuleContext {
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			namedExpression();
			setState(400);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleTableIdentifierContext extends ParserRuleContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleTableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableIdentifier; }
	}

	public final SingleTableIdentifierContext singleTableIdentifier() throws RecognitionException {
		SingleTableIdentifierContext _localctx = new SingleTableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleTableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			tableIdentifier();
			setState(403);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleMultipartIdentifierContext extends ParserRuleContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleMultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleMultipartIdentifier; }
	}

	public final SingleMultipartIdentifierContext singleMultipartIdentifier() throws RecognitionException {
		SingleMultipartIdentifierContext _localctx = new SingleMultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleMultipartIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			multipartIdentifier();
			setState(406);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleFunctionIdentifierContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleFunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleFunctionIdentifier; }
	}

	public final SingleFunctionIdentifierContext singleFunctionIdentifier() throws RecognitionException {
		SingleFunctionIdentifierContext _localctx = new SingleFunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleFunctionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			functionIdentifier();
			setState(409);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleDataTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDataType; }
	}

	public final SingleDataTypeContext singleDataType() throws RecognitionException {
		SingleDataTypeContext _localctx = new SingleDataTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			dataType();
			setState(412);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleTableSchemaContext extends ParserRuleContext {
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleTableSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableSchema; }
	}

	public final SingleTableSchemaContext singleTableSchema() throws RecognitionException {
		SingleTableSchemaContext _localctx = new SingleTableSchemaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleTableSchema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			colTypeList();
			setState(415);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ResetConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public ResetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AlterViewQueryContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public AlterViewQueryContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UseContext extends StatementContext {
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropNamespaceContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public DropNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateTempViewUsingContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public CreateTempViewUsingContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RenameTableContext extends StatementContext {
		public IdentifierReferenceContext from;
		public MultipartIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FailNativeCommandContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() {
			return getRuleContext(UnsupportedHiveNativeCommandsContext.class,0);
		}
		public FailNativeCommandContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetCatalogContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode CATALOG() { return getToken(SqlBaseParser.CATALOG, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public SetCatalogContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClearCacheContext extends StatementContext {
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public ClearCacheContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropViewContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropViewContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowTablesContext extends StatementContext {
		public StringLitContext pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RecoverPartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public RecoverPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropIndexContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public DropIndexContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowCatalogsContext extends StatementContext {
		public StringLitContext pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CATALOGS() { return getToken(SqlBaseParser.CATALOGS, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowCatalogsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowCurrentNamespaceContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public ShowCurrentNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RenameTablePartitionContext extends StatementContext {
		public PartitionSpecContext from;
		public PartitionSpecContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public RenameTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RepairTableContext extends StatementContext {
		public Token option;
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode SYNC() { return getToken(SqlBaseParser.SYNC, 0); }
		public RepairTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RefreshResourceContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public RefreshResourceContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateVariableContext extends StatementContext {
		public TerminalNode DECLARE() { return getToken(SqlBaseParser.DECLARE, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode VARIABLE() { return getToken(SqlBaseParser.VARIABLE, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public VariableDefaultExpressionContext variableDefaultExpression() {
			return getRuleContext(VariableDefaultExpressionContext.class,0);
		}
		public CreateVariableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowNamespacesContext extends StatementContext {
		public StringLitContext pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public NamespacesContext namespaces() {
			return getRuleContext(NamespacesContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowNamespacesContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowColumnsContext extends StatementContext {
		public IdentifierReferenceContext table;
		public MultipartIdentifierContext ns;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public List<TerminalNode> FROM() { return getTokens(SqlBaseParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(SqlBaseParser.FROM, i);
		}
		public List<TerminalNode> IN() { return getTokens(SqlBaseParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(SqlBaseParser.IN, i);
		}
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReplaceTableContext extends StatementContext {
		public ReplaceTableHeaderContext replaceTableHeader() {
			return getRuleContext(ReplaceTableHeaderContext.class,0);
		}
		public CreateTableClausesContext createTableClauses() {
			return getRuleContext(CreateTableClausesContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public CreateOrReplaceTableColTypeListContext createOrReplaceTableColTypeList() {
			return getRuleContext(CreateOrReplaceTableColTypeListContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ReplaceTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnalyzeTablesContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public AnalyzeTablesContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddTablePartitionContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<PartitionSpecLocationContext> partitionSpecLocation() {
			return getRuleContexts(PartitionSpecLocationContext.class);
		}
		public PartitionSpecLocationContext partitionSpecLocation(int i) {
			return getRuleContext(PartitionSpecLocationContext.class,i);
		}
		public AddTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetNamespaceLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public SetNamespaceLocationContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RefreshTableContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public RefreshTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetNamespacePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public SetNamespacePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ManageResourceContext extends StatementContext {
		public Token op;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public ManageResourceContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetQuotedConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public ConfigKeyContext configKey() {
			return getRuleContext(ConfigKeyContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ConfigValueContext configValue() {
			return getRuleContext(ConfigValueContext.class,0);
		}
		public SetQuotedConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateFunctionContext extends StatementContext {
		public StringLitContext className;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public CreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HiveReplaceColumnsContext extends StatementContext {
		public IdentifierReferenceContext table;
		public QualifiedColTypeWithPositionListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() {
			return getRuleContext(QualifiedColTypeWithPositionListContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public HiveReplaceColumnsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommentNamespaceContext extends StatementContext {
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public CommentNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ResetQuotedConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public ConfigKeyContext configKey() {
			return getRuleContext(ConfigKeyContext.class,0);
		}
		public ResetQuotedConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateTableContext extends StatementContext {
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public CreateTableClausesContext createTableClauses() {
			return getRuleContext(CreateTableClausesContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public CreateOrReplaceTableColTypeListContext createOrReplaceTableColTypeList() {
			return getRuleContext(CreateOrReplaceTableColTypeListContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DmlStatementContext extends StatementContext {
		public DmlStatementNoWithContext dmlStatementNoWith() {
			return getRuleContext(DmlStatementNoWithContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public DmlStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateTableLikeContext extends StatementContext {
		public TableIdentifierContext target;
		public TableIdentifierContext source;
		public PropertyListContext tableProps;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<TableProviderContext> tableProvider() {
			return getRuleContexts(TableProviderContext.class);
		}
		public TableProviderContext tableProvider(int i) {
			return getRuleContext(TableProviderContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<PropertyListContext> propertyList() {
			return getRuleContexts(PropertyListContext.class);
		}
		public PropertyListContext propertyList(int i) {
			return getRuleContext(PropertyListContext.class,i);
		}
		public CreateTableLikeContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UncacheTableContext extends StatementContext {
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public UncacheTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropFunctionContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropFunctionContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescribeRelationContext extends StatementContext {
		public Token option;
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public DescribeColNameContext describeColName() {
			return getRuleContext(DescribeColNameContext.class,0);
		}
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public DescribeRelationContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoadDataContext extends StatementContext {
		public StringLitContext path;
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LoadDataContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowPartitionsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public ShowPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescribeFunctionContext extends StatementContext {
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public DescribeFuncNameContext describeFuncName() {
			return getRuleContext(DescribeFuncNameContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public DescribeFunctionContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RenameTableColumnContext extends StatementContext {
		public IdentifierReferenceContext table;
		public MultipartIdentifierContext from;
		public ErrorCapturingIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public RenameTableColumnContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HiveChangeColumnContext extends StatementContext {
		public IdentifierReferenceContext table;
		public MultipartIdentifierContext colName;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public HiveChangeColumnContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetTimeZoneContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TimezoneContext timezone() {
			return getRuleContext(TimezoneContext.class,0);
		}
		public SetTimeZoneContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescribeQueryContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public DescribeQueryContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TruncateTableContext extends StatementContext {
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TruncateTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetTableSerDeContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public SetTableSerDeContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public IdentifierCommentListContext identifierCommentList() {
			return getRuleContext(IdentifierCommentListContext.class,0);
		}
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> ON() { return getTokens(SqlBaseParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(SqlBaseParser.ON, i);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<PropertyListContext> propertyList() {
			return getRuleContexts(PropertyListContext.class);
		}
		public PropertyListContext propertyList(int i) {
			return getRuleContext(PropertyListContext.class,i);
		}
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropTablePartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public DropTablePartitionsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public ConfigKeyContext configKey() {
			return getRuleContext(ConfigKeyContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public SetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowTableExtendedContext extends StatementContext {
		public IdentifierReferenceContext ns;
		public StringLitContext pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public ShowTableExtendedContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescribeNamespaceContext extends StatementContext {
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public DescribeNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AlterTableAlterColumnContext extends StatementContext {
		public IdentifierReferenceContext table;
		public MultipartIdentifierContext column;
		public List<TerminalNode> ALTER() { return getTokens(SqlBaseParser.ALTER); }
		public TerminalNode ALTER(int i) {
			return getToken(SqlBaseParser.ALTER, i);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public AlterColumnActionContext alterColumnAction() {
			return getRuleContext(AlterColumnActionContext.class,0);
		}
		public AlterTableAlterColumnContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RefreshFunctionContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public RefreshFunctionContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommentTableContext extends StatementContext {
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public CommentTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetVariableContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(SqlBaseParser.VARIABLE, 0); }
		public TerminalNode VAR() { return getToken(SqlBaseParser.VAR, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SqlBaseParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SqlBaseParser.LEFT_PAREN, i);
		}
		public MultipartIdentifierListContext multipartIdentifierList() {
			return getRuleContext(MultipartIdentifierListContext.class,0);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SqlBaseParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SqlBaseParser.RIGHT_PAREN, i);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SetVariableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateIndexContext extends StatementContext {
		public IdentifierContext indexType;
		public MultipartIdentifierPropertyListContext columns;
		public PropertyListContext options;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public MultipartIdentifierPropertyListContext multipartIdentifierPropertyList() {
			return getRuleContext(MultipartIdentifierPropertyListContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public CreateIndexContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UseNamespaceContext extends StatementContext {
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public UseNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropVariableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode VARIABLE() { return getToken(SqlBaseParser.VARIABLE, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropVariableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateNamespaceContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<TerminalNode> WITH() { return getTokens(SqlBaseParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(SqlBaseParser.WITH, i);
		}
		public List<PropertyListContext> propertyList() {
			return getRuleContexts(PropertyListContext.class);
		}
		public PropertyListContext propertyList(int i) {
			return getRuleContext(PropertyListContext.class,i);
		}
		public List<TerminalNode> DBPROPERTIES() { return getTokens(SqlBaseParser.DBPROPERTIES); }
		public TerminalNode DBPROPERTIES(int i) {
			return getToken(SqlBaseParser.DBPROPERTIES, i);
		}
		public List<TerminalNode> PROPERTIES() { return getTokens(SqlBaseParser.PROPERTIES); }
		public TerminalNode PROPERTIES(int i) {
			return getToken(SqlBaseParser.PROPERTIES, i);
		}
		public CreateNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowTblPropertiesContext extends StatementContext {
		public IdentifierReferenceContext table;
		public PropertyKeyContext key;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public PropertyKeyContext propertyKey() {
			return getRuleContext(PropertyKeyContext.class,0);
		}
		public ShowTblPropertiesContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VisitExecuteImmediateContext extends StatementContext {
		public ExecuteImmediateContext executeImmediate() {
			return getRuleContext(ExecuteImmediateContext.class,0);
		}
		public VisitExecuteImmediateContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnsetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public UnsetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetTableLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public SetTableLocationContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DropTableColumnsContext extends StatementContext {
		public MultipartIdentifierListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public MultipartIdentifierListContext multipartIdentifierList() {
			return getRuleContext(MultipartIdentifierListContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowViewsContext extends StatementContext {
		public StringLitContext pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode VIEWS() { return getToken(SqlBaseParser.VIEWS, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowViewsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShowFunctionsContext extends StatementContext {
		public IdentifierReferenceContext ns;
		public MultipartIdentifierContext legacy;
		public StringLitContext pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CacheTableContext extends StatementContext {
		public PropertyListContext options;
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CacheTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddTableColumnsContext extends StatementContext {
		public QualifiedColTypeWithPositionListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() {
			return getRuleContext(QualifiedColTypeWithPositionListContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public AddTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public SetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(1257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				query();
				}
				break;
			case 2:
				_localctx = new VisitExecuteImmediateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				executeImmediate();
				}
				break;
			case 3:
				_localctx = new DmlStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(419);
					ctes();
					}
				}

				setState(422);
				dmlStatementNoWith();
				}
				break;
			case 4:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(423);
				match(USE);
				setState(424);
				identifierReference();
				}
				break;
			case 5:
				_localctx = new UseNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(425);
				match(USE);
				setState(426);
				namespace();
				setState(427);
				identifierReference();
				}
				break;
			case 6:
				_localctx = new SetCatalogContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(429);
				match(SET);
				setState(430);
				match(CATALOG);
				setState(433);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(431);
					identifier();
					}
					break;
				case 2:
					{
					setState(432);
					stringLit();
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new CreateNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(435);
				match(CREATE);
				setState(436);
				namespace();
				setState(440);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(437);
					match(IF);
					setState(438);
					match(NOT);
					setState(439);
					match(EXISTS);
					}
					break;
				}
				setState(442);
				identifierReference();
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==LOCATION || _la==WITH) {
					{
					setState(448);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(443);
						commentSpec();
						}
						break;
					case LOCATION:
						{
						setState(444);
						locationSpec();
						}
						break;
					case WITH:
						{
						{
						setState(445);
						match(WITH);
						setState(446);
						_la = _input.LA(1);
						if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(447);
						propertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(452);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 8:
				_localctx = new SetNamespacePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(453);
				match(ALTER);
				setState(454);
				namespace();
				setState(455);
				identifierReference();
				setState(456);
				match(SET);
				setState(457);
				_la = _input.LA(1);
				if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(458);
				propertyList();
				}
				break;
			case 9:
				_localctx = new SetNamespaceLocationContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(460);
				match(ALTER);
				setState(461);
				namespace();
				setState(462);
				identifierReference();
				setState(463);
				match(SET);
				setState(464);
				locationSpec();
				}
				break;
			case 10:
				_localctx = new DropNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(466);
				match(DROP);
				setState(467);
				namespace();
				setState(470);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(468);
					match(IF);
					setState(469);
					match(EXISTS);
					}
					break;
				}
				setState(472);
				identifierReference();
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(473);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 11:
				_localctx = new ShowNamespacesContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(476);
				match(SHOW);
				setState(477);
				namespaces();
				setState(480);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(478);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(479);
					multipartIdentifier();
					}
					break;
				}
				setState(486);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(483);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(482);
						match(LIKE);
						}
						break;
					}
					setState(485);
					((ShowNamespacesContext)_localctx).pattern = stringLit();
					}
					break;
				}
				}
				break;
			case 12:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(488);
				createTableHeader();
				setState(493);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(489);
					match(LEFT_PAREN);
					setState(490);
					createOrReplaceTableColTypeList();
					setState(491);
					match(RIGHT_PAREN);
					}
					break;
				}
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(495);
					tableProvider();
					}
				}

				setState(498);
				createTableClauses();
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN || _la==AS || _la==FROM || _la==MAP || ((((_la - 233)) & ~0x3f) == 0 && ((1L << (_la - 233)) & 4503599635759105L) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(500);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(499);
						match(AS);
						}
					}

					setState(502);
					query();
					}
				}

				}
				break;
			case 13:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(505);
				match(CREATE);
				setState(506);
				match(TABLE);
				setState(510);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(507);
					match(IF);
					setState(508);
					match(NOT);
					setState(509);
					match(EXISTS);
					}
					break;
				}
				setState(512);
				((CreateTableLikeContext)_localctx).target = tableIdentifier();
				setState(513);
				match(LIKE);
				setState(514);
				((CreateTableLikeContext)_localctx).source = tableIdentifier();
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOCATION || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & 549822922753L) != 0) || _la==USING) {
					{
					setState(521);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case USING:
						{
						setState(515);
						tableProvider();
						}
						break;
					case ROW:
						{
						setState(516);
						rowFormat();
						}
						break;
					case STORED:
						{
						setState(517);
						createFileFormat();
						}
						break;
					case LOCATION:
						{
						setState(518);
						locationSpec();
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(519);
						match(TBLPROPERTIES);
						setState(520);
						((CreateTableLikeContext)_localctx).tableProps = propertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(525);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 14:
				_localctx = new ReplaceTableContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(526);
				replaceTableHeader();
				setState(531);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(527);
					match(LEFT_PAREN);
					setState(528);
					createOrReplaceTableColTypeList();
					setState(529);
					match(RIGHT_PAREN);
					}
					break;
				}
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(533);
					tableProvider();
					}
				}

				setState(536);
				createTableClauses();
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN || _la==AS || _la==FROM || _la==MAP || ((((_la - 233)) & ~0x3f) == 0 && ((1L << (_la - 233)) & 4503599635759105L) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(538);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(537);
						match(AS);
						}
					}

					setState(540);
					query();
					}
				}

				}
				break;
			case 15:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(543);
				match(ANALYZE);
				setState(544);
				match(TABLE);
				setState(545);
				identifierReference();
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(546);
					partitionSpec();
					}
				}

				setState(549);
				match(COMPUTE);
				setState(550);
				match(STATISTICS);
				setState(558);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(551);
					identifier();
					}
					break;
				case 2:
					{
					setState(552);
					match(FOR);
					setState(553);
					match(COLUMNS);
					setState(554);
					identifierSeq();
					}
					break;
				case 3:
					{
					setState(555);
					match(FOR);
					setState(556);
					match(ALL);
					setState(557);
					match(COLUMNS);
					}
					break;
				}
				}
				break;
			case 16:
				_localctx = new AnalyzeTablesContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(560);
				match(ANALYZE);
				setState(561);
				match(TABLES);
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(562);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(563);
					identifierReference();
					}
				}

				setState(566);
				match(COMPUTE);
				setState(567);
				match(STATISTICS);
				setState(569);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(568);
					identifier();
					}
					break;
				}
				}
				break;
			case 17:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(571);
				match(ALTER);
				setState(572);
				match(TABLE);
				setState(573);
				identifierReference();
				setState(574);
				match(ADD);
				setState(575);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(576);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				}
				break;
			case 18:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(578);
				match(ALTER);
				setState(579);
				match(TABLE);
				setState(580);
				identifierReference();
				setState(581);
				match(ADD);
				setState(582);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(583);
				match(LEFT_PAREN);
				setState(584);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				setState(585);
				match(RIGHT_PAREN);
				}
				break;
			case 19:
				_localctx = new RenameTableColumnContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(587);
				match(ALTER);
				setState(588);
				match(TABLE);
				setState(589);
				((RenameTableColumnContext)_localctx).table = identifierReference();
				setState(590);
				match(RENAME);
				setState(591);
				match(COLUMN);
				setState(592);
				((RenameTableColumnContext)_localctx).from = multipartIdentifier();
				setState(593);
				match(TO);
				setState(594);
				((RenameTableColumnContext)_localctx).to = errorCapturingIdentifier();
				}
				break;
			case 20:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(596);
				match(ALTER);
				setState(597);
				match(TABLE);
				setState(598);
				identifierReference();
				setState(599);
				match(DROP);
				setState(600);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(601);
					match(IF);
					setState(602);
					match(EXISTS);
					}
				}

				setState(605);
				match(LEFT_PAREN);
				setState(606);
				((DropTableColumnsContext)_localctx).columns = multipartIdentifierList();
				setState(607);
				match(RIGHT_PAREN);
				}
				break;
			case 21:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(609);
				match(ALTER);
				setState(610);
				match(TABLE);
				setState(611);
				identifierReference();
				setState(612);
				match(DROP);
				setState(613);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(616);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(614);
					match(IF);
					setState(615);
					match(EXISTS);
					}
					break;
				}
				setState(618);
				((DropTableColumnsContext)_localctx).columns = multipartIdentifierList();
				}
				break;
			case 22:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(620);
				match(ALTER);
				setState(621);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(622);
				((RenameTableContext)_localctx).from = identifierReference();
				setState(623);
				match(RENAME);
				setState(624);
				match(TO);
				setState(625);
				((RenameTableContext)_localctx).to = multipartIdentifier();
				}
				break;
			case 23:
				_localctx = new SetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(627);
				match(ALTER);
				setState(628);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(629);
				identifierReference();
				setState(630);
				match(SET);
				setState(631);
				match(TBLPROPERTIES);
				setState(632);
				propertyList();
				}
				break;
			case 24:
				_localctx = new UnsetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(634);
				match(ALTER);
				setState(635);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(636);
				identifierReference();
				setState(637);
				match(UNSET);
				setState(638);
				match(TBLPROPERTIES);
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(639);
					match(IF);
					setState(640);
					match(EXISTS);
					}
				}

				setState(643);
				propertyList();
				}
				break;
			case 25:
				_localctx = new AlterTableAlterColumnContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(645);
				match(ALTER);
				setState(646);
				match(TABLE);
				setState(647);
				((AlterTableAlterColumnContext)_localctx).table = identifierReference();
				setState(648);
				_la = _input.LA(1);
				if ( !(_la==ALTER || _la==CHANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(650);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(649);
					match(COLUMN);
					}
					break;
				}
				setState(652);
				((AlterTableAlterColumnContext)_localctx).column = multipartIdentifier();
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==COMMENT || _la==DROP || _la==FIRST || _la==SET || _la==TYPE) {
					{
					setState(653);
					alterColumnAction();
					}
				}

				}
				break;
			case 26:
				_localctx = new HiveChangeColumnContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(656);
				match(ALTER);
				setState(657);
				match(TABLE);
				setState(658);
				((HiveChangeColumnContext)_localctx).table = identifierReference();
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(659);
					partitionSpec();
					}
				}

				setState(662);
				match(CHANGE);
				setState(664);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(663);
					match(COLUMN);
					}
					break;
				}
				setState(666);
				((HiveChangeColumnContext)_localctx).colName = multipartIdentifier();
				setState(667);
				colType();
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==FIRST) {
					{
					setState(668);
					colPosition();
					}
				}

				}
				break;
			case 27:
				_localctx = new HiveReplaceColumnsContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(671);
				match(ALTER);
				setState(672);
				match(TABLE);
				setState(673);
				((HiveReplaceColumnsContext)_localctx).table = identifierReference();
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(674);
					partitionSpec();
					}
				}

				setState(677);
				match(REPLACE);
				setState(678);
				match(COLUMNS);
				setState(679);
				match(LEFT_PAREN);
				setState(680);
				((HiveReplaceColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				setState(681);
				match(RIGHT_PAREN);
				}
				break;
			case 28:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(683);
				match(ALTER);
				setState(684);
				match(TABLE);
				setState(685);
				identifierReference();
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(686);
					partitionSpec();
					}
				}

				setState(689);
				match(SET);
				setState(690);
				match(SERDE);
				setState(691);
				stringLit();
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(692);
					match(WITH);
					setState(693);
					match(SERDEPROPERTIES);
					setState(694);
					propertyList();
					}
				}

				}
				break;
			case 29:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(697);
				match(ALTER);
				setState(698);
				match(TABLE);
				setState(699);
				identifierReference();
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(700);
					partitionSpec();
					}
				}

				setState(703);
				match(SET);
				setState(704);
				match(SERDEPROPERTIES);
				setState(705);
				propertyList();
				}
				break;
			case 30:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(707);
				match(ALTER);
				setState(708);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(709);
				identifierReference();
				setState(710);
				match(ADD);
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(711);
					match(IF);
					setState(712);
					match(NOT);
					setState(713);
					match(EXISTS);
					}
				}

				setState(717); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(716);
					partitionSpecLocation();
					}
					}
					setState(719); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 31:
				_localctx = new RenameTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(721);
				match(ALTER);
				setState(722);
				match(TABLE);
				setState(723);
				identifierReference();
				setState(724);
				((RenameTablePartitionContext)_localctx).from = partitionSpec();
				setState(725);
				match(RENAME);
				setState(726);
				match(TO);
				setState(727);
				((RenameTablePartitionContext)_localctx).to = partitionSpec();
				}
				break;
			case 32:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(729);
				match(ALTER);
				setState(730);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(731);
				identifierReference();
				setState(732);
				match(DROP);
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(733);
					match(IF);
					setState(734);
					match(EXISTS);
					}
				}

				setState(737);
				partitionSpec();
				setState(742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(738);
					match(COMMA);
					setState(739);
					partitionSpec();
					}
					}
					setState(744);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(745);
					match(PURGE);
					}
				}

				}
				break;
			case 33:
				_localctx = new SetTableLocationContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(748);
				match(ALTER);
				setState(749);
				match(TABLE);
				setState(750);
				identifierReference();
				setState(752);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(751);
					partitionSpec();
					}
				}

				setState(754);
				match(SET);
				setState(755);
				locationSpec();
				}
				break;
			case 34:
				_localctx = new RecoverPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(757);
				match(ALTER);
				setState(758);
				match(TABLE);
				setState(759);
				identifierReference();
				setState(760);
				match(RECOVER);
				setState(761);
				match(PARTITIONS);
				}
				break;
			case 35:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(763);
				match(DROP);
				setState(764);
				match(TABLE);
				setState(767);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(765);
					match(IF);
					setState(766);
					match(EXISTS);
					}
					break;
				}
				setState(769);
				identifierReference();
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(770);
					match(PURGE);
					}
				}

				}
				break;
			case 36:
				_localctx = new DropViewContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(773);
				match(DROP);
				setState(774);
				match(VIEW);
				setState(777);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(775);
					match(IF);
					setState(776);
					match(EXISTS);
					}
					break;
				}
				setState(779);
				identifierReference();
				}
				break;
			case 37:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(780);
				match(CREATE);
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(781);
					match(OR);
					setState(782);
					match(REPLACE);
					}
				}

				setState(789);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==TEMPORARY) {
					{
					setState(786);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GLOBAL) {
						{
						setState(785);
						match(GLOBAL);
						}
					}

					setState(788);
					match(TEMPORARY);
					}
				}

				setState(791);
				match(VIEW);
				setState(795);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(792);
					match(IF);
					setState(793);
					match(NOT);
					setState(794);
					match(EXISTS);
					}
					break;
				}
				setState(797);
				identifierReference();
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(798);
					identifierCommentList();
					}
				}

				setState(809);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==PARTITIONED || _la==TBLPROPERTIES) {
					{
					setState(807);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(801);
						commentSpec();
						}
						break;
					case PARTITIONED:
						{
						{
						setState(802);
						match(PARTITIONED);
						setState(803);
						match(ON);
						setState(804);
						identifierList();
						}
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(805);
						match(TBLPROPERTIES);
						setState(806);
						propertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(811);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(812);
				match(AS);
				setState(813);
				query();
				}
				break;
			case 38:
				_localctx = new CreateTempViewUsingContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(815);
				match(CREATE);
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(816);
					match(OR);
					setState(817);
					match(REPLACE);
					}
				}

				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(820);
					match(GLOBAL);
					}
				}

				setState(823);
				match(TEMPORARY);
				setState(824);
				match(VIEW);
				setState(825);
				tableIdentifier();
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(826);
					match(LEFT_PAREN);
					setState(827);
					colTypeList();
					setState(828);
					match(RIGHT_PAREN);
					}
				}

				setState(832);
				tableProvider();
				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(833);
					match(OPTIONS);
					setState(834);
					propertyList();
					}
				}

				}
				break;
			case 39:
				_localctx = new AlterViewQueryContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(837);
				match(ALTER);
				setState(838);
				match(VIEW);
				setState(839);
				identifierReference();
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(840);
					match(AS);
					}
				}

				setState(843);
				query();
				}
				break;
			case 40:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(845);
				match(CREATE);
				setState(848);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(846);
					match(OR);
					setState(847);
					match(REPLACE);
					}
				}

				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(850);
					match(TEMPORARY);
					}
				}

				setState(853);
				match(FUNCTION);
				setState(857);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(854);
					match(IF);
					setState(855);
					match(NOT);
					setState(856);
					match(EXISTS);
					}
					break;
				}
				setState(859);
				identifierReference();
				setState(860);
				match(AS);
				setState(861);
				((CreateFunctionContext)_localctx).className = stringLit();
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(862);
					match(USING);
					setState(863);
					resource();
					setState(868);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(864);
						match(COMMA);
						setState(865);
						resource();
						}
						}
						setState(870);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 41:
				_localctx = new DropFunctionContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(873);
				match(DROP);
				setState(875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(874);
					match(TEMPORARY);
					}
				}

				setState(877);
				match(FUNCTION);
				setState(880);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(878);
					match(IF);
					setState(879);
					match(EXISTS);
					}
					break;
				}
				setState(882);
				identifierReference();
				}
				break;
			case 42:
				_localctx = new CreateVariableContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(883);
				match(DECLARE);
				setState(886);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(884);
					match(OR);
					setState(885);
					match(REPLACE);
					}
					break;
				}
				setState(889);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(888);
					match(VARIABLE);
					}
					break;
				}
				setState(891);
				identifierReference();
				setState(893);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(892);
					dataType();
					}
					break;
				}
				setState(896);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT || _la==EQ) {
					{
					setState(895);
					variableDefaultExpression();
					}
				}

				}
				break;
			case 43:
				_localctx = new DropVariableContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(898);
				match(DROP);
				setState(899);
				match(TEMPORARY);
				setState(900);
				match(VARIABLE);
				setState(903);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(901);
					match(IF);
					setState(902);
					match(EXISTS);
					}
					break;
				}
				setState(905);
				identifierReference();
				}
				break;
			case 44:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(906);
				match(EXPLAIN);
				setState(908);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 1152921504606851073L) != 0) || _la==FORMATTED || _la==LOGICAL) {
					{
					setState(907);
					_la = _input.LA(1);
					if ( !(((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 1152921504606851073L) != 0) || _la==FORMATTED || _la==LOGICAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(910);
				statement();
				}
				break;
			case 45:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(911);
				match(SHOW);
				setState(912);
				match(TABLES);
				setState(915);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(913);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(914);
					identifierReference();
					}
					break;
				}
				setState(921);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(918);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						setState(917);
						match(LIKE);
						}
						break;
					}
					setState(920);
					((ShowTablesContext)_localctx).pattern = stringLit();
					}
					break;
				}
				}
				break;
			case 46:
				_localctx = new ShowTableExtendedContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(923);
				match(SHOW);
				setState(924);
				match(TABLE);
				setState(925);
				match(EXTENDED);
				setState(928);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(926);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(927);
					((ShowTableExtendedContext)_localctx).ns = identifierReference();
					}
				}

				setState(930);
				match(LIKE);
				setState(931);
				((ShowTableExtendedContext)_localctx).pattern = stringLit();
				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(932);
					partitionSpec();
					}
				}

				}
				break;
			case 47:
				_localctx = new ShowTblPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(935);
				match(SHOW);
				setState(936);
				match(TBLPROPERTIES);
				setState(937);
				((ShowTblPropertiesContext)_localctx).table = identifierReference();
				setState(942);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(938);
					match(LEFT_PAREN);
					setState(939);
					((ShowTblPropertiesContext)_localctx).key = propertyKey();
					setState(940);
					match(RIGHT_PAREN);
					}
				}

				}
				break;
			case 48:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(944);
				match(SHOW);
				setState(945);
				match(COLUMNS);
				setState(946);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(947);
				((ShowColumnsContext)_localctx).table = identifierReference();
				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(948);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(949);
					((ShowColumnsContext)_localctx).ns = multipartIdentifier();
					}
				}

				}
				break;
			case 49:
				_localctx = new ShowViewsContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(952);
				match(SHOW);
				setState(953);
				match(VIEWS);
				setState(956);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(954);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(955);
					identifierReference();
					}
					break;
				}
				setState(962);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(959);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
					case 1:
						{
						setState(958);
						match(LIKE);
						}
						break;
					}
					setState(961);
					((ShowViewsContext)_localctx).pattern = stringLit();
					}
					break;
				}
				}
				break;
			case 50:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(964);
				match(SHOW);
				setState(965);
				match(PARTITIONS);
				setState(966);
				identifierReference();
				setState(968);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(967);
					partitionSpec();
					}
				}

				}
				break;
			case 51:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(970);
				match(SHOW);
				setState(972);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(971);
					identifier();
					}
					break;
				}
				setState(974);
				match(FUNCTIONS);
				setState(977);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(975);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(976);
					((ShowFunctionsContext)_localctx).ns = identifierReference();
					}
					break;
				}
				setState(986);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(980);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
					case 1:
						{
						setState(979);
						match(LIKE);
						}
						break;
					}
					setState(984);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
					case 1:
						{
						setState(982);
						((ShowFunctionsContext)_localctx).legacy = multipartIdentifier();
						}
						break;
					case 2:
						{
						setState(983);
						((ShowFunctionsContext)_localctx).pattern = stringLit();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 52:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(988);
				match(SHOW);
				setState(989);
				match(CREATE);
				setState(990);
				match(TABLE);
				setState(991);
				identifierReference();
				setState(994);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(992);
					match(AS);
					setState(993);
					match(SERDE);
					}
				}

				}
				break;
			case 53:
				_localctx = new ShowCurrentNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(996);
				match(SHOW);
				setState(997);
				match(CURRENT);
				setState(998);
				namespace();
				}
				break;
			case 54:
				_localctx = new ShowCatalogsContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(999);
				match(SHOW);
				setState(1000);
				match(CATALOGS);
				setState(1005);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(1002);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
					case 1:
						{
						setState(1001);
						match(LIKE);
						}
						break;
					}
					setState(1004);
					((ShowCatalogsContext)_localctx).pattern = stringLit();
					}
					break;
				}
				}
				break;
			case 55:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(1007);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1008);
				match(FUNCTION);
				setState(1010);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(1009);
					match(EXTENDED);
					}
					break;
				}
				setState(1012);
				describeFuncName();
				}
				break;
			case 56:
				_localctx = new DescribeNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 56);
				{
				setState(1013);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1014);
				namespace();
				setState(1016);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(1015);
					match(EXTENDED);
					}
					break;
				}
				setState(1018);
				identifierReference();
				}
				break;
			case 57:
				_localctx = new DescribeRelationContext(_localctx);
				enterOuterAlt(_localctx, 57);
				{
				setState(1020);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1022);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(1021);
					match(TABLE);
					}
					break;
				}
				setState(1025);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(1024);
					((DescribeRelationContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDED || _la==FORMATTED) ) {
						((DescribeRelationContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(1027);
				identifierReference();
				setState(1029);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(1028);
					partitionSpec();
					}
					break;
				}
				setState(1032);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(1031);
					describeColName();
					}
					break;
				}
				}
				break;
			case 58:
				_localctx = new DescribeQueryContext(_localctx);
				enterOuterAlt(_localctx, 58);
				{
				setState(1034);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1036);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUERY) {
					{
					setState(1035);
					match(QUERY);
					}
				}

				setState(1038);
				query();
				}
				break;
			case 59:
				_localctx = new CommentNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 59);
				{
				setState(1039);
				match(COMMENT);
				setState(1040);
				match(ON);
				setState(1041);
				namespace();
				setState(1042);
				identifierReference();
				setState(1043);
				match(IS);
				setState(1044);
				comment();
				}
				break;
			case 60:
				_localctx = new CommentTableContext(_localctx);
				enterOuterAlt(_localctx, 60);
				{
				setState(1046);
				match(COMMENT);
				setState(1047);
				match(ON);
				setState(1048);
				match(TABLE);
				setState(1049);
				identifierReference();
				setState(1050);
				match(IS);
				setState(1051);
				comment();
				}
				break;
			case 61:
				_localctx = new RefreshTableContext(_localctx);
				enterOuterAlt(_localctx, 61);
				{
				setState(1053);
				match(REFRESH);
				setState(1054);
				match(TABLE);
				setState(1055);
				identifierReference();
				}
				break;
			case 62:
				_localctx = new RefreshFunctionContext(_localctx);
				enterOuterAlt(_localctx, 62);
				{
				setState(1056);
				match(REFRESH);
				setState(1057);
				match(FUNCTION);
				setState(1058);
				identifierReference();
				}
				break;
			case 63:
				_localctx = new RefreshResourceContext(_localctx);
				enterOuterAlt(_localctx, 63);
				{
				setState(1059);
				match(REFRESH);
				setState(1067);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(1060);
					stringLit();
					}
					break;
				case 2:
					{
					setState(1064);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(1061);
							matchWildcard();
							}
							} 
						}
						setState(1066);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 64:
				_localctx = new CacheTableContext(_localctx);
				enterOuterAlt(_localctx, 64);
				{
				setState(1069);
				match(CACHE);
				setState(1071);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAZY) {
					{
					setState(1070);
					match(LAZY);
					}
				}

				setState(1073);
				match(TABLE);
				setState(1074);
				identifierReference();
				setState(1077);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1075);
					match(OPTIONS);
					setState(1076);
					((CacheTableContext)_localctx).options = propertyList();
					}
				}

				setState(1083);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN || _la==AS || _la==FROM || _la==MAP || ((((_la - 233)) & ~0x3f) == 0 && ((1L << (_la - 233)) & 4503599635759105L) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(1080);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(1079);
						match(AS);
						}
					}

					setState(1082);
					query();
					}
				}

				}
				break;
			case 65:
				_localctx = new UncacheTableContext(_localctx);
				enterOuterAlt(_localctx, 65);
				{
				setState(1085);
				match(UNCACHE);
				setState(1086);
				match(TABLE);
				setState(1089);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(1087);
					match(IF);
					setState(1088);
					match(EXISTS);
					}
					break;
				}
				setState(1091);
				identifierReference();
				}
				break;
			case 66:
				_localctx = new ClearCacheContext(_localctx);
				enterOuterAlt(_localctx, 66);
				{
				setState(1092);
				match(CLEAR);
				setState(1093);
				match(CACHE);
				}
				break;
			case 67:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 67);
				{
				setState(1094);
				match(LOAD);
				setState(1095);
				match(DATA);
				setState(1097);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1096);
					match(LOCAL);
					}
				}

				setState(1099);
				match(INPATH);
				setState(1100);
				((LoadDataContext)_localctx).path = stringLit();
				setState(1102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(1101);
					match(OVERWRITE);
					}
				}

				setState(1104);
				match(INTO);
				setState(1105);
				match(TABLE);
				setState(1106);
				identifierReference();
				setState(1108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1107);
					partitionSpec();
					}
				}

				}
				break;
			case 68:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 68);
				{
				setState(1110);
				match(TRUNCATE);
				setState(1111);
				match(TABLE);
				setState(1112);
				identifierReference();
				setState(1114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1113);
					partitionSpec();
					}
				}

				}
				break;
			case 69:
				_localctx = new RepairTableContext(_localctx);
				enterOuterAlt(_localctx, 69);
				{
				setState(1117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MSCK) {
					{
					setState(1116);
					match(MSCK);
					}
				}

				setState(1119);
				match(REPAIR);
				setState(1120);
				match(TABLE);
				setState(1121);
				identifierReference();
				setState(1124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD || _la==DROP || _la==SYNC) {
					{
					setState(1122);
					((RepairTableContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==DROP || _la==SYNC) ) {
						((RepairTableContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1123);
					match(PARTITIONS);
					}
				}

				}
				break;
			case 70:
				_localctx = new ManageResourceContext(_localctx);
				enterOuterAlt(_localctx, 70);
				{
				setState(1126);
				((ManageResourceContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==LIST) ) {
					((ManageResourceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1127);
				identifier();
				setState(1131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1128);
						matchWildcard();
						}
						} 
					}
					setState(1133);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				}
				}
				break;
			case 71:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 71);
				{
				setState(1134);
				match(SET);
				setState(1135);
				match(ROLE);
				setState(1139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1136);
						matchWildcard();
						}
						} 
					}
					setState(1141);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				}
				}
				break;
			case 72:
				_localctx = new SetTimeZoneContext(_localctx);
				enterOuterAlt(_localctx, 72);
				{
				setState(1142);
				match(SET);
				setState(1143);
				match(TIME);
				setState(1144);
				match(ZONE);
				setState(1145);
				interval();
				}
				break;
			case 73:
				_localctx = new SetTimeZoneContext(_localctx);
				enterOuterAlt(_localctx, 73);
				{
				setState(1146);
				match(SET);
				setState(1147);
				match(TIME);
				setState(1148);
				match(ZONE);
				setState(1149);
				timezone();
				}
				break;
			case 74:
				_localctx = new SetTimeZoneContext(_localctx);
				enterOuterAlt(_localctx, 74);
				{
				setState(1150);
				match(SET);
				setState(1151);
				match(TIME);
				setState(1152);
				match(ZONE);
				setState(1156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1153);
						matchWildcard();
						}
						} 
					}
					setState(1158);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				}
				}
				break;
			case 75:
				_localctx = new SetVariableContext(_localctx);
				enterOuterAlt(_localctx, 75);
				{
				setState(1159);
				match(SET);
				setState(1160);
				_la = _input.LA(1);
				if ( !(_la==VAR || _la==VARIABLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1161);
				assignmentList();
				}
				break;
			case 76:
				_localctx = new SetVariableContext(_localctx);
				enterOuterAlt(_localctx, 76);
				{
				setState(1162);
				match(SET);
				setState(1163);
				_la = _input.LA(1);
				if ( !(_la==VAR || _la==VARIABLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1164);
				match(LEFT_PAREN);
				setState(1165);
				multipartIdentifierList();
				setState(1166);
				match(RIGHT_PAREN);
				setState(1167);
				match(EQ);
				setState(1168);
				match(LEFT_PAREN);
				setState(1169);
				query();
				setState(1170);
				match(RIGHT_PAREN);
				}
				break;
			case 77:
				_localctx = new SetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 77);
				{
				setState(1172);
				match(SET);
				setState(1173);
				configKey();
				setState(1174);
				match(EQ);
				setState(1175);
				configValue();
				}
				break;
			case 78:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 78);
				{
				setState(1177);
				match(SET);
				setState(1178);
				configKey();
				setState(1186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1179);
					match(EQ);
					setState(1183);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(1180);
							matchWildcard();
							}
							} 
						}
						setState(1185);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
					}
					}
				}

				}
				break;
			case 79:
				_localctx = new SetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 79);
				{
				setState(1188);
				match(SET);
				setState(1192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1189);
						matchWildcard();
						}
						} 
					}
					setState(1194);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
				}
				setState(1195);
				match(EQ);
				setState(1196);
				configValue();
				}
				break;
			case 80:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 80);
				{
				setState(1197);
				match(SET);
				setState(1201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1198);
						matchWildcard();
						}
						} 
					}
					setState(1203);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				}
				}
				break;
			case 81:
				_localctx = new ResetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 81);
				{
				setState(1204);
				match(RESET);
				setState(1205);
				configKey();
				}
				break;
			case 82:
				_localctx = new ResetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 82);
				{
				setState(1206);
				match(RESET);
				setState(1210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1207);
						matchWildcard();
						}
						} 
					}
					setState(1212);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
				}
				}
				break;
			case 83:
				_localctx = new CreateIndexContext(_localctx);
				enterOuterAlt(_localctx, 83);
				{
				setState(1213);
				match(CREATE);
				setState(1214);
				match(INDEX);
				setState(1218);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(1215);
					match(IF);
					setState(1216);
					match(NOT);
					setState(1217);
					match(EXISTS);
					}
					break;
				}
				setState(1220);
				identifier();
				setState(1221);
				match(ON);
				setState(1223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(1222);
					match(TABLE);
					}
					break;
				}
				setState(1225);
				identifierReference();
				setState(1228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(1226);
					match(USING);
					setState(1227);
					((CreateIndexContext)_localctx).indexType = identifier();
					}
				}

				setState(1230);
				match(LEFT_PAREN);
				setState(1231);
				((CreateIndexContext)_localctx).columns = multipartIdentifierPropertyList();
				setState(1232);
				match(RIGHT_PAREN);
				setState(1235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1233);
					match(OPTIONS);
					setState(1234);
					((CreateIndexContext)_localctx).options = propertyList();
					}
				}

				}
				break;
			case 84:
				_localctx = new DropIndexContext(_localctx);
				enterOuterAlt(_localctx, 84);
				{
				setState(1237);
				match(DROP);
				setState(1238);
				match(INDEX);
				setState(1241);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1239);
					match(IF);
					setState(1240);
					match(EXISTS);
					}
					break;
				}
				setState(1243);
				identifier();
				setState(1244);
				match(ON);
				setState(1246);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1245);
					match(TABLE);
					}
					break;
				}
				setState(1248);
				identifierReference();
				}
				break;
			case 85:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 85);
				{
				setState(1250);
				unsupportedHiveNativeCommands();
				setState(1254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1251);
						matchWildcard();
						}
						} 
					}
					setState(1256);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecuteImmediateContext extends ParserRuleContext {
		public ExecuteImmediateQueryParamContext queryParam;
		public MultipartIdentifierListContext targetVariable;
		public TerminalNode EXECUTE() { return getToken(SqlBaseParser.EXECUTE, 0); }
		public TerminalNode IMMEDIATE() { return getToken(SqlBaseParser.IMMEDIATE, 0); }
		public ExecuteImmediateQueryParamContext executeImmediateQueryParam() {
			return getRuleContext(ExecuteImmediateQueryParamContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public ExecuteImmediateUsingContext executeImmediateUsing() {
			return getRuleContext(ExecuteImmediateUsingContext.class,0);
		}
		public MultipartIdentifierListContext multipartIdentifierList() {
			return getRuleContext(MultipartIdentifierListContext.class,0);
		}
		public ExecuteImmediateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executeImmediate; }
	}

	public final ExecuteImmediateContext executeImmediate() throws RecognitionException {
		ExecuteImmediateContext _localctx = new ExecuteImmediateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_executeImmediate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1259);
			match(EXECUTE);
			setState(1260);
			match(IMMEDIATE);
			setState(1261);
			((ExecuteImmediateContext)_localctx).queryParam = executeImmediateQueryParam();
			setState(1264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(1262);
				match(INTO);
				setState(1263);
				((ExecuteImmediateContext)_localctx).targetVariable = multipartIdentifierList();
				}
			}

			setState(1267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1266);
				executeImmediateUsing();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecuteImmediateUsingContext extends ParserRuleContext {
		public NamedExpressionSeqContext params;
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public ExecuteImmediateUsingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executeImmediateUsing; }
	}

	public final ExecuteImmediateUsingContext executeImmediateUsing() throws RecognitionException {
		ExecuteImmediateUsingContext _localctx = new ExecuteImmediateUsingContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_executeImmediateUsing);
		try {
			setState(1276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1269);
				match(USING);
				setState(1270);
				match(LEFT_PAREN);
				setState(1271);
				((ExecuteImmediateUsingContext)_localctx).params = namedExpressionSeq();
				setState(1272);
				match(RIGHT_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1274);
				match(USING);
				setState(1275);
				((ExecuteImmediateUsingContext)_localctx).params = namedExpressionSeq();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecuteImmediateQueryParamContext extends ParserRuleContext {
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ExecuteImmediateQueryParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executeImmediateQueryParam; }
	}

	public final ExecuteImmediateQueryParamContext executeImmediateQueryParam() throws RecognitionException {
		ExecuteImmediateQueryParamContext _localctx = new ExecuteImmediateQueryParamContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_executeImmediateQueryParam);
		try {
			setState(1280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1278);
				stringLit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1279);
				multipartIdentifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecuteImmediateArgumentContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public ExecuteImmediateArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executeImmediateArgument; }
	}

	public final ExecuteImmediateArgumentContext executeImmediateArgument() throws RecognitionException {
		ExecuteImmediateArgumentContext _localctx = new ExecuteImmediateArgumentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_executeImmediateArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(1282);
				constant();
				}
				break;
			case 2:
				{
				setState(1283);
				multipartIdentifier();
				}
				break;
			}
			setState(1288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1286);
				match(AS);
				setState(1287);
				((ExecuteImmediateArgumentContext)_localctx).name = errorCapturingIdentifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecuteImmediateArgumentSeqContext extends ParserRuleContext {
		public List<ExecuteImmediateArgumentContext> executeImmediateArgument() {
			return getRuleContexts(ExecuteImmediateArgumentContext.class);
		}
		public ExecuteImmediateArgumentContext executeImmediateArgument(int i) {
			return getRuleContext(ExecuteImmediateArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public ExecuteImmediateArgumentSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executeImmediateArgumentSeq; }
	}

	public final ExecuteImmediateArgumentSeqContext executeImmediateArgumentSeq() throws RecognitionException {
		ExecuteImmediateArgumentSeqContext _localctx = new ExecuteImmediateArgumentSeqContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_executeImmediateArgumentSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			executeImmediateArgument();
			setState(1295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1291);
				match(COMMA);
				setState(1292);
				executeImmediateArgument();
				}
				}
				setState(1297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TimezoneContext extends ParserRuleContext {
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TimezoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timezone; }
	}

	public final TimezoneContext timezone() throws RecognitionException {
		TimezoneContext _localctx = new TimezoneContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_timezone);
		try {
			setState(1300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1298);
				stringLit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1299);
				match(LOCAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConfigKeyContext extends ParserRuleContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public ConfigKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configKey; }
	}

	public final ConfigKeyContext configKey() throws RecognitionException {
		ConfigKeyContext _localctx = new ConfigKeyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_configKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1302);
			quotedIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConfigValueContext extends ParserRuleContext {
		public BackQuotedIdentifierContext backQuotedIdentifier() {
			return getRuleContext(BackQuotedIdentifierContext.class,0);
		}
		public ConfigValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configValue; }
	}

	public final ConfigValueContext configValue() throws RecognitionException {
		ConfigValueContext _localctx = new ConfigValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_configValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1304);
			backQuotedIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnsupportedHiveNativeCommandsContext extends ParserRuleContext {
		public Token kw1;
		public Token kw2;
		public Token kw3;
		public Token kw4;
		public Token kw5;
		public Token kw6;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public UnsupportedHiveNativeCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsupportedHiveNativeCommands; }
	}

	public final UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() throws RecognitionException {
		UnsupportedHiveNativeCommandsContext _localctx = new UnsupportedHiveNativeCommandsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_unsupportedHiveNativeCommands);
		int _la;
		try {
			setState(1474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1306);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1307);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1308);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1309);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1310);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(1312);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1311);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1314);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(1316);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(1315);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1318);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1319);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1320);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1321);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(1323);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(1322);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1325);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1326);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1327);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1328);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1329);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1330);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(1331);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1332);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(1333);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1334);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(1335);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1336);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1337);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1338);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1339);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(1340);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1341);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1342);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1343);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1344);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1345);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1346);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1347);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1348);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1349);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1350);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1351);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1352);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1353);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1354);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1355);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1356);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1357);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1358);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1359);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1360);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1361);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1362);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1363);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1364);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1365);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1366);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1367);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1368);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1369);
				tableIdentifier();
				setState(1370);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1371);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1373);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1374);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1375);
				tableIdentifier();
				setState(1376);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(1377);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1379);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1380);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1381);
				tableIdentifier();
				setState(1382);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1383);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1385);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1386);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1387);
				tableIdentifier();
				setState(1388);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(1389);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1391);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1392);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1393);
				tableIdentifier();
				setState(1394);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1395);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1397);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1398);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1399);
				tableIdentifier();
				setState(1400);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1401);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(1402);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(1403);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1405);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1406);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1407);
				tableIdentifier();
				setState(1408);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1409);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(1410);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1412);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1413);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1414);
				tableIdentifier();
				setState(1415);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(1416);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1418);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1419);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1420);
				tableIdentifier();
				setState(1421);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(1422);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1424);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1425);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1426);
				tableIdentifier();
				setState(1427);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(1428);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1430);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1431);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1432);
				tableIdentifier();
				setState(1433);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1435);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1436);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1437);
				tableIdentifier();
				setState(1439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1438);
					partitionSpec();
					}
				}

				setState(1441);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1443);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1444);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1445);
				tableIdentifier();
				setState(1447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1446);
					partitionSpec();
					}
				}

				setState(1449);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1451);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1452);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1453);
				tableIdentifier();
				setState(1455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1454);
					partitionSpec();
					}
				}

				setState(1457);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1458);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(1460);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1461);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1462);
				tableIdentifier();
				setState(1464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1463);
					partitionSpec();
					}
				}

				setState(1466);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(1467);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1469);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(1470);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1471);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1472);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(1473);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DFS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			match(CREATE);
			setState(1478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1477);
				match(TEMPORARY);
				}
			}

			setState(1481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1480);
				match(EXTERNAL);
				}
			}

			setState(1483);
			match(TABLE);
			setState(1487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1484);
				match(IF);
				setState(1485);
				match(NOT);
				setState(1486);
				match(EXISTS);
				}
				break;
			}
			setState(1489);
			identifierReference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReplaceTableHeaderContext extends ParserRuleContext {
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public ReplaceTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replaceTableHeader; }
	}

	public final ReplaceTableHeaderContext replaceTableHeader() throws RecognitionException {
		ReplaceTableHeaderContext _localctx = new ReplaceTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_replaceTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CREATE) {
				{
				setState(1491);
				match(CREATE);
				setState(1492);
				match(OR);
				}
			}

			setState(1495);
			match(REPLACE);
			setState(1496);
			match(TABLE);
			setState(1497);
			identifierReference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClusterBySpecContext extends ParserRuleContext {
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public MultipartIdentifierListContext multipartIdentifierList() {
			return getRuleContext(MultipartIdentifierListContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public ClusterBySpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clusterBySpec; }
	}

	public final ClusterBySpecContext clusterBySpec() throws RecognitionException {
		ClusterBySpecContext _localctx = new ClusterBySpecContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_clusterBySpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1499);
			match(CLUSTER);
			setState(1500);
			match(BY);
			setState(1501);
			match(LEFT_PAREN);
			setState(1502);
			multipartIdentifierList();
			setState(1503);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BucketSpecContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public OrderedIdentifierListContext orderedIdentifierList() {
			return getRuleContext(OrderedIdentifierListContext.class,0);
		}
		public BucketSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucketSpec; }
	}

	public final BucketSpecContext bucketSpec() throws RecognitionException {
		BucketSpecContext _localctx = new BucketSpecContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bucketSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1505);
			match(CLUSTERED);
			setState(1506);
			match(BY);
			setState(1507);
			identifierList();
			setState(1511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(1508);
				match(SORTED);
				setState(1509);
				match(BY);
				setState(1510);
				orderedIdentifierList();
				}
			}

			setState(1513);
			match(INTO);
			setState(1514);
			match(INTEGER_VALUE);
			setState(1515);
			match(BUCKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SkewSpecContext extends ParserRuleContext {
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public NestedConstantListContext nestedConstantList() {
			return getRuleContext(NestedConstantListContext.class,0);
		}
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public SkewSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewSpec; }
	}

	public final SkewSpecContext skewSpec() throws RecognitionException {
		SkewSpecContext _localctx = new SkewSpecContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_skewSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1517);
			match(SKEWED);
			setState(1518);
			match(BY);
			setState(1519);
			identifierList();
			setState(1520);
			match(ON);
			setState(1523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1521);
				constantList();
				}
				break;
			case 2:
				{
				setState(1522);
				nestedConstantList();
				}
				break;
			}
			setState(1528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1525);
				match(STORED);
				setState(1526);
				match(AS);
				setState(1527);
				match(DIRECTORIES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LocationSpecContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public LocationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationSpec; }
	}

	public final LocationSpecContext locationSpec() throws RecognitionException {
		LocationSpecContext _localctx = new LocationSpecContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_locationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1530);
			match(LOCATION);
			setState(1531);
			stringLit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommentSpecContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public CommentSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentSpec; }
	}

	public final CommentSpecContext commentSpec() throws RecognitionException {
		CommentSpecContext _localctx = new CommentSpecContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_commentSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1533);
			match(COMMENT);
			setState(1534);
			stringLit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1536);
				ctes();
				}
			}

			setState(1539);
			queryTerm(0);
			setState(1540);
			queryOrganization();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InsertIntoContext extends ParserRuleContext {
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
	 
		public InsertIntoContext() { }
		public void copyFrom(InsertIntoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InsertIntoReplaceWhereContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public InsertIntoReplaceWhereContext(InsertIntoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InsertOverwriteHiveDirContext extends InsertIntoContext {
		public StringLitContext path;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public RowFormatContext rowFormat() {
			return getRuleContext(RowFormatContext.class,0);
		}
		public CreateFileFormatContext createFileFormat() {
			return getRuleContext(CreateFileFormatContext.class,0);
		}
		public InsertOverwriteHiveDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InsertOverwriteDirContext extends InsertIntoContext {
		public StringLitContext path;
		public PropertyListContext options;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public InsertOverwriteDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InsertOverwriteTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode NAME() { return getToken(SqlBaseParser.NAME, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public InsertOverwriteTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InsertIntoTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode NAME() { return getToken(SqlBaseParser.NAME, 0); }
		public InsertIntoTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_insertInto);
		int _la;
		try {
			setState(1616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				_localctx = new InsertOverwriteTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1542);
				match(INSERT);
				setState(1543);
				match(OVERWRITE);
				setState(1545);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1544);
					match(TABLE);
					}
					break;
				}
				setState(1547);
				identifierReference();
				setState(1554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1548);
					partitionSpec();
					setState(1552);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(1549);
						match(IF);
						setState(1550);
						match(NOT);
						setState(1551);
						match(EXISTS);
						}
					}

					}
				}

				setState(1559);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					{
					setState(1556);
					match(BY);
					setState(1557);
					match(NAME);
					}
					}
					break;
				case 2:
					{
					setState(1558);
					identifierList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new InsertIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1561);
				match(INSERT);
				setState(1562);
				match(INTO);
				setState(1564);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
				case 1:
					{
					setState(1563);
					match(TABLE);
					}
					break;
				}
				setState(1566);
				identifierReference();
				setState(1568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1567);
					partitionSpec();
					}
				}

				setState(1573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(1570);
					match(IF);
					setState(1571);
					match(NOT);
					setState(1572);
					match(EXISTS);
					}
				}

				setState(1578);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					{
					setState(1575);
					match(BY);
					setState(1576);
					match(NAME);
					}
					}
					break;
				case 2:
					{
					setState(1577);
					identifierList();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new InsertIntoReplaceWhereContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1580);
				match(INSERT);
				setState(1581);
				match(INTO);
				setState(1583);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1582);
					match(TABLE);
					}
					break;
				}
				setState(1585);
				identifierReference();
				setState(1586);
				match(REPLACE);
				setState(1587);
				whereClause();
				}
				break;
			case 4:
				_localctx = new InsertOverwriteHiveDirContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1589);
				match(INSERT);
				setState(1590);
				match(OVERWRITE);
				setState(1592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1591);
					match(LOCAL);
					}
				}

				setState(1594);
				match(DIRECTORY);
				setState(1595);
				((InsertOverwriteHiveDirContext)_localctx).path = stringLit();
				setState(1597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1596);
					rowFormat();
					}
				}

				setState(1600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(1599);
					createFileFormat();
					}
				}

				}
				break;
			case 5:
				_localctx = new InsertOverwriteDirContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1602);
				match(INSERT);
				setState(1603);
				match(OVERWRITE);
				setState(1605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1604);
					match(LOCAL);
					}
				}

				setState(1607);
				match(DIRECTORY);
				setState(1609);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1608);
					((InsertOverwriteDirContext)_localctx).path = stringLit();
					}
					break;
				}
				setState(1611);
				tableProvider();
				setState(1614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1612);
					match(OPTIONS);
					setState(1613);
					((InsertOverwriteDirContext)_localctx).options = propertyList();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PartitionSpecLocationContext extends ParserRuleContext {
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpecLocation; }
	}

	public final PartitionSpecLocationContext partitionSpecLocation() throws RecognitionException {
		PartitionSpecLocationContext _localctx = new PartitionSpecLocationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_partitionSpecLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1618);
			partitionSpec();
			setState(1620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(1619);
				locationSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PartitionSpecContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<PartitionValContext> partitionVal() {
			return getRuleContexts(PartitionValContext.class);
		}
		public PartitionValContext partitionVal(int i) {
			return getRuleContext(PartitionValContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpec; }
	}

	public final PartitionSpecContext partitionSpec() throws RecognitionException {
		PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_partitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1622);
			match(PARTITION);
			setState(1623);
			match(LEFT_PAREN);
			setState(1624);
			partitionVal();
			setState(1629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1625);
				match(COMMA);
				setState(1626);
				partitionVal();
				}
				}
				setState(1631);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1632);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PartitionValContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(SqlBaseParser.DEFAULT, 0); }
		public PartitionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionVal; }
	}

	public final PartitionValContext partitionVal() throws RecognitionException {
		PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_partitionVal);
		int _la;
		try {
			setState(1643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1634);
				identifier();
				setState(1637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1635);
					match(EQ);
					setState(1636);
					constant();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1639);
				identifier();
				setState(1640);
				match(EQ);
				setState(1641);
				match(DEFAULT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamespaceContext extends ParserRuleContext {
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_namespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1645);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==NAMESPACE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamespacesContext extends ParserRuleContext {
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode SCHEMAS() { return getToken(SqlBaseParser.SCHEMAS, 0); }
		public NamespacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaces; }
	}

	public final NamespacesContext namespaces() throws RecognitionException {
		NamespacesContext _localctx = new NamespacesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_namespaces);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1647);
			_la = _input.LA(1);
			if ( !(_la==DATABASES || _la==NAMESPACES || _la==SCHEMAS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DescribeFuncNameContext extends ParserRuleContext {
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public PredicateOperatorContext predicateOperator() {
			return getRuleContext(PredicateOperatorContext.class,0);
		}
		public DescribeFuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeFuncName; }
	}

	public final DescribeFuncNameContext describeFuncName() throws RecognitionException {
		DescribeFuncNameContext _localctx = new DescribeFuncNameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_describeFuncName);
		try {
			setState(1654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1649);
				identifierReference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1650);
				stringLit();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1651);
				comparisonOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1652);
				arithmeticOperator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1653);
				predicateOperator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DescribeColNameContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> nameParts = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SqlBaseParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SqlBaseParser.DOT, i);
		}
		public DescribeColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeColName; }
	}

	public final DescribeColNameContext describeColName() throws RecognitionException {
		DescribeColNameContext _localctx = new DescribeColNameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_describeColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1656);
			((DescribeColNameContext)_localctx).identifier = identifier();
			((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
			setState(1661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1657);
				match(DOT);
				setState(1658);
				((DescribeColNameContext)_localctx).identifier = identifier();
				((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
				}
				}
				setState(1663);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CtesContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1664);
			match(WITH);
			setState(1665);
			namedQuery();
			setState(1670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1666);
				match(COMMA);
				setState(1667);
				namedQuery();
				}
				}
				setState(1672);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamedQueryContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public IdentifierListContext columnAliases;
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1673);
			((NamedQueryContext)_localctx).name = errorCapturingIdentifier();
			setState(1675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1674);
				((NamedQueryContext)_localctx).columnAliases = identifierList();
				}
				break;
			}
			setState(1678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1677);
				match(AS);
				}
			}

			setState(1680);
			match(LEFT_PAREN);
			setState(1681);
			query();
			setState(1682);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableProviderContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProvider; }
	}

	public final TableProviderContext tableProvider() throws RecognitionException {
		TableProviderContext _localctx = new TableProviderContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1684);
			match(USING);
			setState(1685);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateTableClausesContext extends ParserRuleContext {
		public ExpressionPropertyListContext options;
		public PartitionFieldListContext partitioning;
		public PropertyListContext tableProps;
		public List<SkewSpecContext> skewSpec() {
			return getRuleContexts(SkewSpecContext.class);
		}
		public SkewSpecContext skewSpec(int i) {
			return getRuleContext(SkewSpecContext.class,i);
		}
		public List<ClusterBySpecContext> clusterBySpec() {
			return getRuleContexts(ClusterBySpecContext.class);
		}
		public ClusterBySpecContext clusterBySpec(int i) {
			return getRuleContext(ClusterBySpecContext.class,i);
		}
		public List<BucketSpecContext> bucketSpec() {
			return getRuleContexts(BucketSpecContext.class);
		}
		public BucketSpecContext bucketSpec(int i) {
			return getRuleContext(BucketSpecContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<TerminalNode> OPTIONS() { return getTokens(SqlBaseParser.OPTIONS); }
		public TerminalNode OPTIONS(int i) {
			return getToken(SqlBaseParser.OPTIONS, i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<ExpressionPropertyListContext> expressionPropertyList() {
			return getRuleContexts(ExpressionPropertyListContext.class);
		}
		public ExpressionPropertyListContext expressionPropertyList(int i) {
			return getRuleContext(ExpressionPropertyListContext.class,i);
		}
		public List<PartitionFieldListContext> partitionFieldList() {
			return getRuleContexts(PartitionFieldListContext.class);
		}
		public PartitionFieldListContext partitionFieldList(int i) {
			return getRuleContext(PartitionFieldListContext.class,i);
		}
		public List<PropertyListContext> propertyList() {
			return getRuleContexts(PropertyListContext.class);
		}
		public PropertyListContext propertyList(int i) {
			return getRuleContext(PropertyListContext.class,i);
		}
		public CreateTableClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableClauses; }
	}

	public final CreateTableClausesContext createTableClauses() throws RecognitionException {
		CreateTableClausesContext _localctx = new CreateTableClausesContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_createTableClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2304576371818496L) != 0) || ((((_la - 168)) & ~0x3f) == 0 && ((1L << (_la - 168)) & 35201551958017L) != 0) || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & 549823184897L) != 0)) {
				{
				setState(1701);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPTIONS:
					{
					{
					setState(1687);
					match(OPTIONS);
					setState(1688);
					((CreateTableClausesContext)_localctx).options = expressionPropertyList();
					}
					}
					break;
				case PARTITIONED:
					{
					{
					setState(1689);
					match(PARTITIONED);
					setState(1690);
					match(BY);
					setState(1691);
					((CreateTableClausesContext)_localctx).partitioning = partitionFieldList();
					}
					}
					break;
				case SKEWED:
					{
					setState(1692);
					skewSpec();
					}
					break;
				case CLUSTER:
					{
					setState(1693);
					clusterBySpec();
					}
					break;
				case CLUSTERED:
					{
					setState(1694);
					bucketSpec();
					}
					break;
				case ROW:
					{
					setState(1695);
					rowFormat();
					}
					break;
				case STORED:
					{
					setState(1696);
					createFileFormat();
					}
					break;
				case LOCATION:
					{
					setState(1697);
					locationSpec();
					}
					break;
				case COMMENT:
					{
					setState(1698);
					commentSpec();
					}
					break;
				case TBLPROPERTIES:
					{
					{
					setState(1699);
					match(TBLPROPERTIES);
					setState(1700);
					((CreateTableClausesContext)_localctx).tableProps = propertyList();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1705);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public PropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyList; }
	}

	public final PropertyListContext propertyList() throws RecognitionException {
		PropertyListContext _localctx = new PropertyListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_propertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
			match(LEFT_PAREN);
			setState(1707);
			property();
			setState(1712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1708);
				match(COMMA);
				setState(1709);
				property();
				}
				}
				setState(1714);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1715);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyContext extends ParserRuleContext {
		public PropertyKeyContext key;
		public PropertyValueContext value;
		public PropertyKeyContext propertyKey() {
			return getRuleContext(PropertyKeyContext.class,0);
		}
		public PropertyValueContext propertyValue() {
			return getRuleContext(PropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1717);
			((PropertyContext)_localctx).key = propertyKey();
			setState(1722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1719);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1718);
					match(EQ);
					}
					break;
				}
				setState(1721);
				((PropertyContext)_localctx).value = propertyValue();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SqlBaseParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SqlBaseParser.DOT, i);
		}
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public PropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyKey; }
	}

	public final PropertyKeyContext propertyKey() throws RecognitionException {
		PropertyKeyContext _localctx = new PropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_propertyKey);
		try {
			int _alt;
			setState(1733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1724);
				identifier();
				setState(1729);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1725);
						match(DOT);
						setState(1726);
						identifier();
						}
						} 
					}
					setState(1731);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1732);
				stringLit();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public PropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyValue; }
	}

	public final PropertyValueContext propertyValue() throws RecognitionException {
		PropertyValueContext _localctx = new PropertyValueContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_propertyValue);
		try {
			setState(1739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1735);
				match(INTEGER_VALUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1736);
				match(DECIMAL_VALUE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1737);
				booleanValue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1738);
				stringLit();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionPropertyListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<ExpressionPropertyContext> expressionProperty() {
			return getRuleContexts(ExpressionPropertyContext.class);
		}
		public ExpressionPropertyContext expressionProperty(int i) {
			return getRuleContext(ExpressionPropertyContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public ExpressionPropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionPropertyList; }
	}

	public final ExpressionPropertyListContext expressionPropertyList() throws RecognitionException {
		ExpressionPropertyListContext _localctx = new ExpressionPropertyListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expressionPropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1741);
			match(LEFT_PAREN);
			setState(1742);
			expressionProperty();
			setState(1747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1743);
				match(COMMA);
				setState(1744);
				expressionProperty();
				}
				}
				setState(1749);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1750);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionPropertyContext extends ParserRuleContext {
		public PropertyKeyContext key;
		public ExpressionContext value;
		public PropertyKeyContext propertyKey() {
			return getRuleContext(PropertyKeyContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ExpressionPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionProperty; }
	}

	public final ExpressionPropertyContext expressionProperty() throws RecognitionException {
		ExpressionPropertyContext _localctx = new ExpressionPropertyContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_expressionProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			((ExpressionPropertyContext)_localctx).key = propertyKey();
			setState(1757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1754);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1753);
					match(EQ);
					}
					break;
				}
				setState(1756);
				((ExpressionPropertyContext)_localctx).value = expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1759);
			match(LEFT_PAREN);
			setState(1760);
			constant();
			setState(1765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1761);
				match(COMMA);
				setState(1762);
				constant();
				}
				}
				setState(1767);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1768);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NestedConstantListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public NestedConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedConstantList; }
	}

	public final NestedConstantListContext nestedConstantList() throws RecognitionException {
		NestedConstantListContext _localctx = new NestedConstantListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_nestedConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1770);
			match(LEFT_PAREN);
			setState(1771);
			constantList();
			setState(1776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1772);
				match(COMMA);
				setState(1773);
				constantList();
				}
				}
				setState(1778);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1779);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateFileFormatContext extends ParserRuleContext {
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public StorageHandlerContext storageHandler() {
			return getRuleContext(StorageHandlerContext.class,0);
		}
		public CreateFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFileFormat; }
	}

	public final CreateFileFormatContext createFileFormat() throws RecognitionException {
		CreateFileFormatContext _localctx = new CreateFileFormatContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_createFileFormat);
		try {
			setState(1787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1781);
				match(STORED);
				setState(1782);
				match(AS);
				setState(1783);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1784);
				match(STORED);
				setState(1785);
				match(BY);
				setState(1786);
				storageHandler();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileFormatContext extends ParserRuleContext {
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
	 
		public FileFormatContext() { }
		public void copyFrom(FileFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableFileFormatContext extends FileFormatContext {
		public StringLitContext inFmt;
		public StringLitContext outFmt;
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public List<StringLitContext> stringLit() {
			return getRuleContexts(StringLitContext.class);
		}
		public StringLitContext stringLit(int i) {
			return getRuleContext(StringLitContext.class,i);
		}
		public TableFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GenericFileFormatContext extends FileFormatContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_fileFormat);
		try {
			setState(1795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1789);
				match(INPUTFORMAT);
				setState(1790);
				((TableFileFormatContext)_localctx).inFmt = stringLit();
				setState(1791);
				match(OUTPUTFORMAT);
				setState(1792);
				((TableFileFormatContext)_localctx).outFmt = stringLit();
				}
				break;
			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1794);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StorageHandlerContext extends ParserRuleContext {
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public StorageHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageHandler; }
	}

	public final StorageHandlerContext storageHandler() throws RecognitionException {
		StorageHandlerContext _localctx = new StorageHandlerContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_storageHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1797);
			stringLit();
			setState(1801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1798);
				match(WITH);
				setState(1799);
				match(SERDEPROPERTIES);
				setState(1800);
				propertyList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResourceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1803);
			identifier();
			setState(1804);
			stringLit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DmlStatementNoWithContext extends ParserRuleContext {
		public DmlStatementNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dmlStatementNoWith; }
	 
		public DmlStatementNoWithContext() { }
		public void copyFrom(DmlStatementNoWithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeleteFromTableContext extends DmlStatementNoWithContext {
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteFromTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleInsertQueryContext extends DmlStatementNoWithContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SingleInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiInsertQueryContext extends DmlStatementNoWithContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
			return getRuleContexts(MultiInsertQueryBodyContext.class);
		}
		public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
			return getRuleContext(MultiInsertQueryBodyContext.class,i);
		}
		public MultiInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UpdateTableContext extends DmlStatementNoWithContext {
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SetClauseContext setClause() {
			return getRuleContext(SetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MergeIntoTableContext extends DmlStatementNoWithContext {
		public IdentifierReferenceContext target;
		public TableAliasContext targetAlias;
		public IdentifierReferenceContext source;
		public QueryContext sourceQuery;
		public TableAliasContext sourceAlias;
		public BooleanExpressionContext mergeCondition;
		public TerminalNode MERGE() { return getToken(SqlBaseParser.MERGE, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public List<IdentifierReferenceContext> identifierReference() {
			return getRuleContexts(IdentifierReferenceContext.class);
		}
		public IdentifierReferenceContext identifierReference(int i) {
			return getRuleContext(IdentifierReferenceContext.class,i);
		}
		public List<TableAliasContext> tableAlias() {
			return getRuleContexts(TableAliasContext.class);
		}
		public TableAliasContext tableAlias(int i) {
			return getRuleContext(TableAliasContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<MatchedClauseContext> matchedClause() {
			return getRuleContexts(MatchedClauseContext.class);
		}
		public MatchedClauseContext matchedClause(int i) {
			return getRuleContext(MatchedClauseContext.class,i);
		}
		public List<NotMatchedClauseContext> notMatchedClause() {
			return getRuleContexts(NotMatchedClauseContext.class);
		}
		public NotMatchedClauseContext notMatchedClause(int i) {
			return getRuleContext(NotMatchedClauseContext.class,i);
		}
		public List<NotMatchedBySourceClauseContext> notMatchedBySourceClause() {
			return getRuleContexts(NotMatchedBySourceClauseContext.class);
		}
		public NotMatchedBySourceClauseContext notMatchedBySourceClause(int i) {
			return getRuleContext(NotMatchedBySourceClauseContext.class,i);
		}
		public MergeIntoTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
	}

	public final DmlStatementNoWithContext dmlStatementNoWith() throws RecognitionException {
		DmlStatementNoWithContext _localctx = new DmlStatementNoWithContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_dmlStatementNoWith);
		int _la;
		try {
			int _alt;
			setState(1862);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSERT:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1806);
				insertInto();
				setState(1807);
				query();
				}
				break;
			case FROM:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1809);
				fromClause();
				setState(1811); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1810);
					multiInsertQueryBody();
					}
					}
					setState(1813); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INSERT );
				}
				break;
			case DELETE:
				_localctx = new DeleteFromTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1815);
				match(DELETE);
				setState(1816);
				match(FROM);
				setState(1817);
				identifierReference();
				setState(1818);
				tableAlias();
				setState(1820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1819);
					whereClause();
					}
				}

				}
				break;
			case UPDATE:
				_localctx = new UpdateTableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1822);
				match(UPDATE);
				setState(1823);
				identifierReference();
				setState(1824);
				tableAlias();
				setState(1825);
				setClause();
				setState(1827);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1826);
					whereClause();
					}
				}

				}
				break;
			case MERGE:
				_localctx = new MergeIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1829);
				match(MERGE);
				setState(1830);
				match(INTO);
				setState(1831);
				((MergeIntoTableContext)_localctx).target = identifierReference();
				setState(1832);
				((MergeIntoTableContext)_localctx).targetAlias = tableAlias();
				setState(1833);
				match(USING);
				setState(1839);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1834);
					((MergeIntoTableContext)_localctx).source = identifierReference();
					}
					break;
				case 2:
					{
					setState(1835);
					match(LEFT_PAREN);
					setState(1836);
					((MergeIntoTableContext)_localctx).sourceQuery = query();
					setState(1837);
					match(RIGHT_PAREN);
					}
					break;
				}
				setState(1841);
				((MergeIntoTableContext)_localctx).sourceAlias = tableAlias();
				setState(1842);
				match(ON);
				setState(1843);
				((MergeIntoTableContext)_localctx).mergeCondition = booleanExpression(0);
				setState(1847);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1844);
						matchedClause();
						}
						} 
					}
					setState(1849);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
				}
				setState(1853);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1850);
						notMatchedClause();
						}
						} 
					}
					setState(1855);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
				}
				setState(1859);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHEN) {
					{
					{
					setState(1856);
					notMatchedBySourceClause();
					}
					}
					setState(1861);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierReferenceContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_KW() { return getToken(SqlBaseParser.IDENTIFIER_KW, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public IdentifierReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierReference; }
	}

	public final IdentifierReferenceContext identifierReference() throws RecognitionException {
		IdentifierReferenceContext _localctx = new IdentifierReferenceContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_identifierReference);
		try {
			setState(1870);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1864);
				match(IDENTIFIER_KW);
				setState(1865);
				match(LEFT_PAREN);
				setState(1866);
				expression();
				setState(1867);
				match(RIGHT_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1869);
				multipartIdentifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryOrganizationContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> clusterBy = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> distributeBy = new ArrayList<ExpressionContext>();
		public List<SortItemContext> sort = new ArrayList<SortItemContext>();
		public ExpressionContext limit;
		public ExpressionContext offset;
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode OFFSET() { return getToken(SqlBaseParser.OFFSET, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_queryOrganization);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1882);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1872);
				match(ORDER);
				setState(1873);
				match(BY);
				setState(1874);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1879);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1875);
						match(COMMA);
						setState(1876);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1881);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
				}
				}
				break;
			}
			setState(1894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1884);
				match(CLUSTER);
				setState(1885);
				match(BY);
				setState(1886);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1891);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1887);
						match(COMMA);
						setState(1888);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1893);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
				}
				}
				break;
			}
			setState(1906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				setState(1896);
				match(DISTRIBUTE);
				setState(1897);
				match(BY);
				setState(1898);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1903);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1899);
						match(COMMA);
						setState(1900);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1905);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
				}
				}
				break;
			}
			setState(1918);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				{
				setState(1908);
				match(SORT);
				setState(1909);
				match(BY);
				setState(1910);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1915);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1911);
						match(COMMA);
						setState(1912);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1917);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				}
				}
				break;
			}
			setState(1921);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1920);
				windowClause();
				}
				break;
			}
			setState(1928);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1923);
				match(LIMIT);
				setState(1926);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
				case 1:
					{
					setState(1924);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(1925);
					((QueryOrganizationContext)_localctx).limit = expression();
					}
					break;
				}
				}
				break;
			}
			setState(1932);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1930);
				match(OFFSET);
				setState(1931);
				((QueryOrganizationContext)_localctx).offset = expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiInsertQueryBodyContext extends ParserRuleContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public FromStatementBodyContext fromStatementBody() {
			return getRuleContext(FromStatementBodyContext.class,0);
		}
		public MultiInsertQueryBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsertQueryBody; }
	}

	public final MultiInsertQueryBodyContext multiInsertQueryBody() throws RecognitionException {
		MultiInsertQueryBodyContext _localctx = new MultiInsertQueryBodyContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_multiInsertQueryBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1934);
			insertInto();
			setState(1935);
			fromStatementBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1938);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1963);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1961);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1940);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1941);
						if (!(legacy_setops_precedence_enabled)) throw new FailedPredicateException(this, "legacy_setops_precedence_enabled");
						setState(1942);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==INTERSECT || _la==SETMINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1944);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1943);
							setQuantifier();
							}
						}

						setState(1946);
						((SetOperationContext)_localctx).right = queryTerm(4);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1947);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1948);
						if (!(!legacy_setops_precedence_enabled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enabled");
						setState(1949);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(1951);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1950);
							setQuantifier();
							}
						}

						setState(1953);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 3:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1954);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1955);
						if (!(!legacy_setops_precedence_enabled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enabled");
						setState(1956);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==SETMINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1958);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1957);
							setQuantifier();
							}
						}

						setState(1960);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(1965);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubqueryContext extends QueryPrimaryContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InlineTableDefault1Context extends QueryPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault1Context(QueryPrimaryContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FromStmtContext extends QueryPrimaryContext {
		public FromStatementContext fromStatement() {
			return getRuleContext(FromStatementContext.class,0);
		}
		public FromStmtContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_queryPrimary);
		try {
			setState(1975);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAP:
			case REDUCE:
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1966);
				querySpecification();
				}
				break;
			case FROM:
				_localctx = new FromStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1967);
				fromStatement();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1968);
				match(TABLE);
				setState(1969);
				identifierReference();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1970);
				inlineTable();
				}
				break;
			case LEFT_PAREN:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1971);
				match(LEFT_PAREN);
				setState(1972);
				query();
				setState(1973);
				match(RIGHT_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrder;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1977);
			expression();
			setState(1979);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				{
				setState(1978);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1983);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				{
				setState(1981);
				match(NULLS);
				setState(1982);
				((SortItemContext)_localctx).nullOrder = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrder = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FromStatementContext extends ParserRuleContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<FromStatementBodyContext> fromStatementBody() {
			return getRuleContexts(FromStatementBodyContext.class);
		}
		public FromStatementBodyContext fromStatementBody(int i) {
			return getRuleContext(FromStatementBodyContext.class,i);
		}
		public FromStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatement; }
	}

	public final FromStatementContext fromStatement() throws RecognitionException {
		FromStatementContext _localctx = new FromStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_fromStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1985);
			fromClause();
			setState(1987); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1986);
					fromStatementBody();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1989); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FromStatementBodyContext extends ParserRuleContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public FromStatementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatementBody; }
	}

	public final FromStatementBodyContext fromStatementBody() throws RecognitionException {
		FromStatementBodyContext _localctx = new FromStatementBodyContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_fromStatementBody);
		try {
			int _alt;
			setState(2018);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1991);
				transformClause();
				setState(1993);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
				case 1:
					{
					setState(1992);
					whereClause();
					}
					break;
				}
				setState(1995);
				queryOrganization();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1997);
				selectClause();
				setState(2001);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1998);
						lateralView();
						}
						} 
					}
					setState(2003);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
				}
				setState(2005);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
				case 1:
					{
					setState(2004);
					whereClause();
					}
					break;
				}
				setState(2008);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
				case 1:
					{
					setState(2007);
					aggregationClause();
					}
					break;
				}
				setState(2011);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
				case 1:
					{
					setState(2010);
					havingClause();
					}
					break;
				}
				setState(2014);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
				case 1:
					{
					setState(2013);
					windowClause();
					}
					break;
				}
				setState(2016);
				queryOrganization();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuerySpecificationContext extends ParserRuleContext {
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
	 
		public QuerySpecificationContext() { }
		public void copyFrom(QuerySpecificationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RegularQuerySpecificationContext extends QuerySpecificationContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public RegularQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TransformQuerySpecificationContext extends QuerySpecificationContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public TransformQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_querySpecification);
		try {
			int _alt;
			setState(2064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				_localctx = new TransformQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2020);
				transformClause();
				setState(2022);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
				case 1:
					{
					setState(2021);
					fromClause();
					}
					break;
				}
				setState(2027);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2024);
						lateralView();
						}
						} 
					}
					setState(2029);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
				}
				setState(2031);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(2030);
					whereClause();
					}
					break;
				}
				setState(2034);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(2033);
					aggregationClause();
					}
					break;
				}
				setState(2037);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(2036);
					havingClause();
					}
					break;
				}
				setState(2040);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(2039);
					windowClause();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RegularQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2042);
				selectClause();
				setState(2044);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
				case 1:
					{
					setState(2043);
					fromClause();
					}
					break;
				}
				setState(2049);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2046);
						lateralView();
						}
						} 
					}
					setState(2051);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
				}
				setState(2053);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
				case 1:
					{
					setState(2052);
					whereClause();
					}
					break;
				}
				setState(2056);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
				case 1:
					{
					setState(2055);
					aggregationClause();
					}
					break;
				}
				setState(2059);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(2058);
					havingClause();
					}
					break;
				}
				setState(2062);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(2061);
					windowClause();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransformClauseContext extends ParserRuleContext {
		public Token kind;
		public RowFormatContext inRowFormat;
		public StringLitContext recordWriter;
		public StringLitContext script;
		public RowFormatContext outRowFormat;
		public StringLitContext recordReader;
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<StringLitContext> stringLit() {
			return getRuleContexts(StringLitContext.class);
		}
		public StringLitContext stringLit(int i) {
			return getRuleContext(StringLitContext.class,i);
		}
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SqlBaseParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SqlBaseParser.LEFT_PAREN, i);
		}
		public ExpressionSeqContext expressionSeq() {
			return getRuleContext(ExpressionSeqContext.class,0);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SqlBaseParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SqlBaseParser.RIGHT_PAREN, i);
		}
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TransformClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformClause; }
	}

	public final TransformClauseContext transformClause() throws RecognitionException {
		TransformClauseContext _localctx = new TransformClauseContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_transformClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2085);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(2066);
				match(SELECT);
				setState(2067);
				((TransformClauseContext)_localctx).kind = match(TRANSFORM);
				setState(2068);
				match(LEFT_PAREN);
				setState(2070);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(2069);
					setQuantifier();
					}
					break;
				}
				setState(2072);
				expressionSeq();
				setState(2073);
				match(RIGHT_PAREN);
				}
				break;
			case MAP:
				{
				setState(2075);
				((TransformClauseContext)_localctx).kind = match(MAP);
				setState(2077);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(2076);
					setQuantifier();
					}
					break;
				}
				setState(2079);
				expressionSeq();
				}
				break;
			case REDUCE:
				{
				setState(2080);
				((TransformClauseContext)_localctx).kind = match(REDUCE);
				setState(2082);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
				case 1:
					{
					setState(2081);
					setQuantifier();
					}
					break;
				}
				setState(2084);
				expressionSeq();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2088);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROW) {
				{
				setState(2087);
				((TransformClauseContext)_localctx).inRowFormat = rowFormat();
				}
			}

			setState(2092);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECORDWRITER) {
				{
				setState(2090);
				match(RECORDWRITER);
				setState(2091);
				((TransformClauseContext)_localctx).recordWriter = stringLit();
				}
			}

			setState(2094);
			match(USING);
			setState(2095);
			((TransformClauseContext)_localctx).script = stringLit();
			setState(2108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				{
				setState(2096);
				match(AS);
				setState(2106);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
				case 1:
					{
					setState(2097);
					identifierSeq();
					}
					break;
				case 2:
					{
					setState(2098);
					colTypeList();
					}
					break;
				case 3:
					{
					{
					setState(2099);
					match(LEFT_PAREN);
					setState(2102);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
					case 1:
						{
						setState(2100);
						identifierSeq();
						}
						break;
					case 2:
						{
						setState(2101);
						colTypeList();
						}
						break;
					}
					setState(2104);
					match(RIGHT_PAREN);
					}
					}
					break;
				}
				}
				break;
			}
			setState(2111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				{
				setState(2110);
				((TransformClauseContext)_localctx).outRowFormat = rowFormat();
				}
				break;
			}
			setState(2115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				{
				setState(2113);
				match(RECORDREADER);
				setState(2114);
				((TransformClauseContext)_localctx).recordReader = stringLit();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectClauseContext extends ParserRuleContext {
		public HintContext hint;
		public List<HintContext> hints = new ArrayList<HintContext>();
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public List<HintContext> hint() {
			return getRuleContexts(HintContext.class);
		}
		public HintContext hint(int i) {
			return getRuleContext(HintContext.class,i);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_selectClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2117);
			match(SELECT);
			setState(2121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2118);
					((SelectClauseContext)_localctx).hint = hint();
					((SelectClauseContext)_localctx).hints.add(((SelectClauseContext)_localctx).hint);
					}
					} 
				}
				setState(2123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
			}
			setState(2125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				{
				setState(2124);
				setQuantifier();
				}
				break;
			}
			setState(2127);
			namedExpressionSeq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public SetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setClause; }
	}

	public final SetClauseContext setClause() throws RecognitionException {
		SetClauseContext _localctx = new SetClauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_setClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2129);
			match(SET);
			setState(2130);
			assignmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatchedClauseContext extends ParserRuleContext {
		public BooleanExpressionContext matchedCond;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public MatchedActionContext matchedAction() {
			return getRuleContext(MatchedActionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public MatchedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedClause; }
	}

	public final MatchedClauseContext matchedClause() throws RecognitionException {
		MatchedClauseContext _localctx = new MatchedClauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_matchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2132);
			match(WHEN);
			setState(2133);
			match(MATCHED);
			setState(2136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(2134);
				match(AND);
				setState(2135);
				((MatchedClauseContext)_localctx).matchedCond = booleanExpression(0);
				}
			}

			setState(2138);
			match(THEN);
			setState(2139);
			matchedAction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NotMatchedClauseContext extends ParserRuleContext {
		public BooleanExpressionContext notMatchedCond;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public NotMatchedActionContext notMatchedAction() {
			return getRuleContext(NotMatchedActionContext.class,0);
		}
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode TARGET() { return getToken(SqlBaseParser.TARGET, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public NotMatchedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedClause; }
	}

	public final NotMatchedClauseContext notMatchedClause() throws RecognitionException {
		NotMatchedClauseContext _localctx = new NotMatchedClauseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_notMatchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2141);
			match(WHEN);
			setState(2142);
			match(NOT);
			setState(2143);
			match(MATCHED);
			setState(2146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(2144);
				match(BY);
				setState(2145);
				match(TARGET);
				}
			}

			setState(2150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(2148);
				match(AND);
				setState(2149);
				((NotMatchedClauseContext)_localctx).notMatchedCond = booleanExpression(0);
				}
			}

			setState(2152);
			match(THEN);
			setState(2153);
			notMatchedAction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NotMatchedBySourceClauseContext extends ParserRuleContext {
		public BooleanExpressionContext notMatchedBySourceCond;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode SOURCE() { return getToken(SqlBaseParser.SOURCE, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public NotMatchedBySourceActionContext notMatchedBySourceAction() {
			return getRuleContext(NotMatchedBySourceActionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public NotMatchedBySourceClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedBySourceClause; }
	}

	public final NotMatchedBySourceClauseContext notMatchedBySourceClause() throws RecognitionException {
		NotMatchedBySourceClauseContext _localctx = new NotMatchedBySourceClauseContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_notMatchedBySourceClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2155);
			match(WHEN);
			setState(2156);
			match(NOT);
			setState(2157);
			match(MATCHED);
			setState(2158);
			match(BY);
			setState(2159);
			match(SOURCE);
			setState(2162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(2160);
				match(AND);
				setState(2161);
				((NotMatchedBySourceClauseContext)_localctx).notMatchedBySourceCond = booleanExpression(0);
				}
			}

			setState(2164);
			match(THEN);
			setState(2165);
			notMatchedBySourceAction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatchedActionContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public MatchedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedAction; }
	}

	public final MatchedActionContext matchedAction() throws RecognitionException {
		MatchedActionContext _localctx = new MatchedActionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_matchedAction);
		try {
			setState(2174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2167);
				match(DELETE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2168);
				match(UPDATE);
				setState(2169);
				match(SET);
				setState(2170);
				match(ASTERISK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2171);
				match(UPDATE);
				setState(2172);
				match(SET);
				setState(2173);
				assignmentList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NotMatchedActionContext extends ParserRuleContext {
		public MultipartIdentifierListContext columns;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SqlBaseParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SqlBaseParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SqlBaseParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SqlBaseParser.RIGHT_PAREN, i);
		}
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultipartIdentifierListContext multipartIdentifierList() {
			return getRuleContext(MultipartIdentifierListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public NotMatchedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedAction; }
	}

	public final NotMatchedActionContext notMatchedAction() throws RecognitionException {
		NotMatchedActionContext _localctx = new NotMatchedActionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_notMatchedAction);
		int _la;
		try {
			setState(2194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2176);
				match(INSERT);
				setState(2177);
				match(ASTERISK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2178);
				match(INSERT);
				setState(2179);
				match(LEFT_PAREN);
				setState(2180);
				((NotMatchedActionContext)_localctx).columns = multipartIdentifierList();
				setState(2181);
				match(RIGHT_PAREN);
				setState(2182);
				match(VALUES);
				setState(2183);
				match(LEFT_PAREN);
				setState(2184);
				expression();
				setState(2189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2185);
					match(COMMA);
					setState(2186);
					expression();
					}
					}
					setState(2191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2192);
				match(RIGHT_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NotMatchedBySourceActionContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public NotMatchedBySourceActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedBySourceAction; }
	}

	public final NotMatchedBySourceActionContext notMatchedBySourceAction() throws RecognitionException {
		NotMatchedBySourceActionContext _localctx = new NotMatchedBySourceActionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_notMatchedBySourceAction);
		try {
			setState(2200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELETE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2196);
				match(DELETE);
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2197);
				match(UPDATE);
				setState(2198);
				match(SET);
				setState(2199);
				assignmentList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExceptClauseContext extends ParserRuleContext {
		public MultipartIdentifierListContext exceptCols;
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public MultipartIdentifierListContext multipartIdentifierList() {
			return getRuleContext(MultipartIdentifierListContext.class,0);
		}
		public ExceptClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptClause; }
	}

	public final ExceptClauseContext exceptClause() throws RecognitionException {
		ExceptClauseContext _localctx = new ExceptClauseContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_exceptClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2202);
			match(EXCEPT);
			setState(2203);
			match(LEFT_PAREN);
			setState(2204);
			((ExceptClauseContext)_localctx).exceptCols = multipartIdentifierList();
			setState(2205);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentListContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2207);
			assignment();
			setState(2212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2208);
				match(COMMA);
				setState(2209);
				assignment();
				}
				}
				setState(2214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public MultipartIdentifierContext key;
		public ExpressionContext value;
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2215);
			((AssignmentContext)_localctx).key = multipartIdentifier();
			setState(2216);
			match(EQ);
			setState(2217);
			((AssignmentContext)_localctx).value = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2219);
			match(WHERE);
			setState(2220);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2222);
			match(HAVING);
			setState(2223);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HintContext extends ParserRuleContext {
		public HintStatementContext hintStatement;
		public List<HintStatementContext> hintStatements = new ArrayList<HintStatementContext>();
		public TerminalNode HENT_START() { return getToken(SqlBaseParser.HENT_START, 0); }
		public TerminalNode HENT_END() { return getToken(SqlBaseParser.HENT_END, 0); }
		public List<HintStatementContext> hintStatement() {
			return getRuleContexts(HintStatementContext.class);
		}
		public HintStatementContext hintStatement(int i) {
			return getRuleContext(HintStatementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public HintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hint; }
	}

	public final HintContext hint() throws RecognitionException {
		HintContext _localctx = new HintContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_hint);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2225);
			match(HENT_START);
			setState(2226);
			((HintContext)_localctx).hintStatement = hintStatement();
			((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
			setState(2233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2228);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
					case 1:
						{
						setState(2227);
						match(COMMA);
						}
						break;
					}
					setState(2230);
					((HintContext)_localctx).hintStatement = hintStatement();
					((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
					}
					} 
				}
				setState(2235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
			}
			setState(2236);
			match(HENT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HintStatementContext extends ParserRuleContext {
		public IdentifierContext hintName;
		public PrimaryExpressionContext primaryExpression;
		public List<PrimaryExpressionContext> parameters = new ArrayList<PrimaryExpressionContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public HintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintStatement; }
	}

	public final HintStatementContext hintStatement() throws RecognitionException {
		HintStatementContext _localctx = new HintStatementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_hintStatement);
		int _la;
		try {
			setState(2251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2238);
				((HintStatementContext)_localctx).hintName = identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2239);
				((HintStatementContext)_localctx).hintName = identifier();
				setState(2240);
				match(LEFT_PAREN);
				setState(2241);
				((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
				setState(2246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2242);
					match(COMMA);
					setState(2243);
					((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
					}
					}
					setState(2248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2249);
				match(RIGHT_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public PivotClauseContext pivotClause() {
			return getRuleContext(PivotClauseContext.class,0);
		}
		public UnpivotClauseContext unpivotClause() {
			return getRuleContext(UnpivotClauseContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2253);
			match(FROM);
			setState(2254);
			relation();
			setState(2259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2255);
					match(COMMA);
					setState(2256);
					relation();
					}
					} 
				}
				setState(2261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
			}
			setState(2265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,269,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2262);
					lateralView();
					}
					} 
				}
				setState(2267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,269,_ctx);
			}
			setState(2269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				{
				setState(2268);
				pivotClause();
				}
				break;
			}
			setState(2272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				{
				setState(2271);
				unpivotClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemporalClauseContext extends ParserRuleContext {
		public ValueExpressionContext timestamp;
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public TerminalNode SYSTEM_VERSION() { return getToken(SqlBaseParser.SYSTEM_VERSION, 0); }
		public TerminalNode VERSION() { return getToken(SqlBaseParser.VERSION, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode SYSTEM_TIME() { return getToken(SqlBaseParser.SYSTEM_TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SqlBaseParser.TIMESTAMP, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TemporalClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temporalClause; }
	}

	public final TemporalClauseContext temporalClause() throws RecognitionException {
		TemporalClauseContext _localctx = new TemporalClauseContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_temporalClause);
		int _la;
		try {
			setState(2288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(2274);
					match(FOR);
					}
				}

				setState(2277);
				_la = _input.LA(1);
				if ( !(_la==SYSTEM_VERSION || _la==VERSION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2278);
				match(AS);
				setState(2279);
				match(OF);
				setState(2280);
				version();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(2281);
					match(FOR);
					}
				}

				setState(2284);
				_la = _input.LA(1);
				if ( !(_la==SYSTEM_TIME || _la==TIMESTAMP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2285);
				match(AS);
				setState(2286);
				match(OF);
				setState(2287);
				((TemporalClauseContext)_localctx).timestamp = valueExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AggregationClauseContext extends ParserRuleContext {
		public GroupByClauseContext groupByClause;
		public List<GroupByClauseContext> groupingExpressionsWithGroupingAnalytics = new ArrayList<GroupByClauseContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public Token kind;
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<GroupByClauseContext> groupByClause() {
			return getRuleContexts(GroupByClauseContext.class);
		}
		public GroupByClauseContext groupByClause(int i) {
			return getRuleContext(GroupByClauseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public AggregationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationClause; }
	}

	public final AggregationClauseContext aggregationClause() throws RecognitionException {
		AggregationClauseContext _localctx = new AggregationClauseContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_aggregationClause);
		int _la;
		try {
			int _alt;
			setState(2329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2290);
				match(GROUP);
				setState(2291);
				match(BY);
				setState(2292);
				((AggregationClauseContext)_localctx).groupByClause = groupByClause();
				((AggregationClauseContext)_localctx).groupingExpressionsWithGroupingAnalytics.add(((AggregationClauseContext)_localctx).groupByClause);
				setState(2297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,275,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2293);
						match(COMMA);
						setState(2294);
						((AggregationClauseContext)_localctx).groupByClause = groupByClause();
						((AggregationClauseContext)_localctx).groupingExpressionsWithGroupingAnalytics.add(((AggregationClauseContext)_localctx).groupByClause);
						}
						} 
					}
					setState(2299);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,275,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2300);
				match(GROUP);
				setState(2301);
				match(BY);
				setState(2302);
				((AggregationClauseContext)_localctx).expression = expression();
				((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
				setState(2307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,276,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2303);
						match(COMMA);
						setState(2304);
						((AggregationClauseContext)_localctx).expression = expression();
						((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
						}
						} 
					}
					setState(2309);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,276,_ctx);
				}
				setState(2327);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
				case 1:
					{
					setState(2310);
					match(WITH);
					setState(2311);
					((AggregationClauseContext)_localctx).kind = match(ROLLUP);
					}
					break;
				case 2:
					{
					setState(2312);
					match(WITH);
					setState(2313);
					((AggregationClauseContext)_localctx).kind = match(CUBE);
					}
					break;
				case 3:
					{
					setState(2314);
					((AggregationClauseContext)_localctx).kind = match(GROUPING);
					setState(2315);
					match(SETS);
					setState(2316);
					match(LEFT_PAREN);
					setState(2317);
					groupingSet();
					setState(2322);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2318);
						match(COMMA);
						setState(2319);
						groupingSet();
						}
						}
						setState(2324);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2325);
					match(RIGHT_PAREN);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupByClauseContext extends ParserRuleContext {
		public GroupingAnalyticsContext groupingAnalytics() {
			return getRuleContext(GroupingAnalyticsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_groupByClause);
		try {
			setState(2333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2331);
				groupingAnalytics();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2332);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupingAnalyticsContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public List<GroupingElementContext> groupingElement() {
			return getRuleContexts(GroupingElementContext.class);
		}
		public GroupingElementContext groupingElement(int i) {
			return getRuleContext(GroupingElementContext.class,i);
		}
		public GroupingAnalyticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingAnalytics; }
	}

	public final GroupingAnalyticsContext groupingAnalytics() throws RecognitionException {
		GroupingAnalyticsContext _localctx = new GroupingAnalyticsContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_groupingAnalytics);
		int _la;
		try {
			setState(2360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CUBE:
			case ROLLUP:
				enterOuterAlt(_localctx, 1);
				{
				setState(2335);
				_la = _input.LA(1);
				if ( !(_la==CUBE || _la==ROLLUP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2336);
				match(LEFT_PAREN);
				setState(2337);
				groupingSet();
				setState(2342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2338);
					match(COMMA);
					setState(2339);
					groupingSet();
					}
					}
					setState(2344);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2345);
				match(RIGHT_PAREN);
				}
				break;
			case GROUPING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2347);
				match(GROUPING);
				setState(2348);
				match(SETS);
				setState(2349);
				match(LEFT_PAREN);
				setState(2350);
				groupingElement();
				setState(2355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2351);
					match(COMMA);
					setState(2352);
					groupingElement();
					}
					}
					setState(2357);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2358);
				match(RIGHT_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupingElementContext extends ParserRuleContext {
		public GroupingAnalyticsContext groupingAnalytics() {
			return getRuleContext(GroupingAnalyticsContext.class,0);
		}
		public GroupingSetContext groupingSet() {
			return getRuleContext(GroupingSetContext.class,0);
		}
		public GroupingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingElement; }
	}

	public final GroupingElementContext groupingElement() throws RecognitionException {
		GroupingElementContext _localctx = new GroupingElementContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_groupingElement);
		try {
			setState(2364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2362);
				groupingAnalytics();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2363);
				groupingSet();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupingSetContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_groupingSet);
		int _la;
		try {
			setState(2379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2366);
				match(LEFT_PAREN);
				setState(2375);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(2367);
					expression();
					setState(2372);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2368);
						match(COMMA);
						setState(2369);
						expression();
						}
						}
						setState(2374);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2377);
				match(RIGHT_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2378);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PivotClauseContext extends ParserRuleContext {
		public NamedExpressionSeqContext aggregates;
		public PivotValueContext pivotValue;
		public List<PivotValueContext> pivotValues = new ArrayList<PivotValueContext>();
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SqlBaseParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SqlBaseParser.LEFT_PAREN, i);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public PivotColumnContext pivotColumn() {
			return getRuleContext(PivotColumnContext.class,0);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SqlBaseParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SqlBaseParser.RIGHT_PAREN, i);
		}
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<PivotValueContext> pivotValue() {
			return getRuleContexts(PivotValueContext.class);
		}
		public PivotValueContext pivotValue(int i) {
			return getRuleContext(PivotValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public PivotClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotClause; }
	}

	public final PivotClauseContext pivotClause() throws RecognitionException {
		PivotClauseContext _localctx = new PivotClauseContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_pivotClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2381);
			match(PIVOT);
			setState(2382);
			match(LEFT_PAREN);
			setState(2383);
			((PivotClauseContext)_localctx).aggregates = namedExpressionSeq();
			setState(2384);
			match(FOR);
			setState(2385);
			pivotColumn();
			setState(2386);
			match(IN);
			setState(2387);
			match(LEFT_PAREN);
			setState(2388);
			((PivotClauseContext)_localctx).pivotValue = pivotValue();
			((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
			setState(2393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2389);
				match(COMMA);
				setState(2390);
				((PivotClauseContext)_localctx).pivotValue = pivotValue();
				((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
				}
				}
				setState(2395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2396);
			match(RIGHT_PAREN);
			setState(2397);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PivotColumnContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> identifiers = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public PivotColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotColumn; }
	}

	public final PivotColumnContext pivotColumn() throws RecognitionException {
		PivotColumnContext _localctx = new PivotColumnContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_pivotColumn);
		int _la;
		try {
			setState(2411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2399);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2400);
				match(LEFT_PAREN);
				setState(2401);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				setState(2406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2402);
					match(COMMA);
					setState(2403);
					((PivotColumnContext)_localctx).identifier = identifier();
					((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
					}
					}
					setState(2408);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2409);
				match(RIGHT_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PivotValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public PivotValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotValue; }
	}

	public final PivotValueContext pivotValue() throws RecognitionException {
		PivotValueContext _localctx = new PivotValueContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_pivotValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2413);
			expression();
			setState(2418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				{
				setState(2415);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
				case 1:
					{
					setState(2414);
					match(AS);
					}
					break;
				}
				setState(2417);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnpivotClauseContext extends ParserRuleContext {
		public UnpivotNullClauseContext nullOperator;
		public UnpivotOperatorContext operator;
		public TerminalNode UNPIVOT() { return getToken(SqlBaseParser.UNPIVOT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public UnpivotOperatorContext unpivotOperator() {
			return getRuleContext(UnpivotOperatorContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnpivotNullClauseContext unpivotNullClause() {
			return getRuleContext(UnpivotNullClauseContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public UnpivotClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotClause; }
	}

	public final UnpivotClauseContext unpivotClause() throws RecognitionException {
		UnpivotClauseContext _localctx = new UnpivotClauseContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_unpivotClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2420);
			match(UNPIVOT);
			setState(2422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLUDE || _la==INCLUDE) {
				{
				setState(2421);
				((UnpivotClauseContext)_localctx).nullOperator = unpivotNullClause();
				}
			}

			setState(2424);
			match(LEFT_PAREN);
			setState(2425);
			((UnpivotClauseContext)_localctx).operator = unpivotOperator();
			setState(2426);
			match(RIGHT_PAREN);
			setState(2431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				{
				setState(2428);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
				case 1:
					{
					setState(2427);
					match(AS);
					}
					break;
				}
				setState(2430);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnpivotNullClauseContext extends ParserRuleContext {
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode INCLUDE() { return getToken(SqlBaseParser.INCLUDE, 0); }
		public TerminalNode EXCLUDE() { return getToken(SqlBaseParser.EXCLUDE, 0); }
		public UnpivotNullClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotNullClause; }
	}

	public final UnpivotNullClauseContext unpivotNullClause() throws RecognitionException {
		UnpivotNullClauseContext _localctx = new UnpivotNullClauseContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_unpivotNullClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2433);
			_la = _input.LA(1);
			if ( !(_la==EXCLUDE || _la==INCLUDE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2434);
			match(NULLS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnpivotOperatorContext extends ParserRuleContext {
		public UnpivotSingleValueColumnClauseContext unpivotSingleValueColumnClause() {
			return getRuleContext(UnpivotSingleValueColumnClauseContext.class,0);
		}
		public UnpivotMultiValueColumnClauseContext unpivotMultiValueColumnClause() {
			return getRuleContext(UnpivotMultiValueColumnClauseContext.class,0);
		}
		public UnpivotOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotOperator; }
	}

	public final UnpivotOperatorContext unpivotOperator() throws RecognitionException {
		UnpivotOperatorContext _localctx = new UnpivotOperatorContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_unpivotOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				{
				setState(2436);
				unpivotSingleValueColumnClause();
				}
				break;
			case 2:
				{
				setState(2437);
				unpivotMultiValueColumnClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnpivotSingleValueColumnClauseContext extends ParserRuleContext {
		public UnpivotColumnAndAliasContext unpivotColumnAndAlias;
		public List<UnpivotColumnAndAliasContext> unpivotColumns = new ArrayList<UnpivotColumnAndAliasContext>();
		public UnpivotValueColumnContext unpivotValueColumn() {
			return getRuleContext(UnpivotValueColumnContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public UnpivotNameColumnContext unpivotNameColumn() {
			return getRuleContext(UnpivotNameColumnContext.class,0);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<UnpivotColumnAndAliasContext> unpivotColumnAndAlias() {
			return getRuleContexts(UnpivotColumnAndAliasContext.class);
		}
		public UnpivotColumnAndAliasContext unpivotColumnAndAlias(int i) {
			return getRuleContext(UnpivotColumnAndAliasContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public UnpivotSingleValueColumnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotSingleValueColumnClause; }
	}

	public final UnpivotSingleValueColumnClauseContext unpivotSingleValueColumnClause() throws RecognitionException {
		UnpivotSingleValueColumnClauseContext _localctx = new UnpivotSingleValueColumnClauseContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_unpivotSingleValueColumnClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2440);
			unpivotValueColumn();
			setState(2441);
			match(FOR);
			setState(2442);
			unpivotNameColumn();
			setState(2443);
			match(IN);
			setState(2444);
			match(LEFT_PAREN);
			setState(2445);
			((UnpivotSingleValueColumnClauseContext)_localctx).unpivotColumnAndAlias = unpivotColumnAndAlias();
			((UnpivotSingleValueColumnClauseContext)_localctx).unpivotColumns.add(((UnpivotSingleValueColumnClauseContext)_localctx).unpivotColumnAndAlias);
			setState(2450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2446);
				match(COMMA);
				setState(2447);
				((UnpivotSingleValueColumnClauseContext)_localctx).unpivotColumnAndAlias = unpivotColumnAndAlias();
				((UnpivotSingleValueColumnClauseContext)_localctx).unpivotColumns.add(((UnpivotSingleValueColumnClauseContext)_localctx).unpivotColumnAndAlias);
				}
				}
				setState(2452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2453);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnpivotMultiValueColumnClauseContext extends ParserRuleContext {
		public UnpivotValueColumnContext unpivotValueColumn;
		public List<UnpivotValueColumnContext> unpivotValueColumns = new ArrayList<UnpivotValueColumnContext>();
		public UnpivotColumnSetContext unpivotColumnSet;
		public List<UnpivotColumnSetContext> unpivotColumnSets = new ArrayList<UnpivotColumnSetContext>();
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SqlBaseParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SqlBaseParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SqlBaseParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SqlBaseParser.RIGHT_PAREN, i);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public UnpivotNameColumnContext unpivotNameColumn() {
			return getRuleContext(UnpivotNameColumnContext.class,0);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<UnpivotValueColumnContext> unpivotValueColumn() {
			return getRuleContexts(UnpivotValueColumnContext.class);
		}
		public UnpivotValueColumnContext unpivotValueColumn(int i) {
			return getRuleContext(UnpivotValueColumnContext.class,i);
		}
		public List<UnpivotColumnSetContext> unpivotColumnSet() {
			return getRuleContexts(UnpivotColumnSetContext.class);
		}
		public UnpivotColumnSetContext unpivotColumnSet(int i) {
			return getRuleContext(UnpivotColumnSetContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public UnpivotMultiValueColumnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotMultiValueColumnClause; }
	}

	public final UnpivotMultiValueColumnClauseContext unpivotMultiValueColumnClause() throws RecognitionException {
		UnpivotMultiValueColumnClauseContext _localctx = new UnpivotMultiValueColumnClauseContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_unpivotMultiValueColumnClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2455);
			match(LEFT_PAREN);
			setState(2456);
			((UnpivotMultiValueColumnClauseContext)_localctx).unpivotValueColumn = unpivotValueColumn();
			((UnpivotMultiValueColumnClauseContext)_localctx).unpivotValueColumns.add(((UnpivotMultiValueColumnClauseContext)_localctx).unpivotValueColumn);
			setState(2461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2457);
				match(COMMA);
				setState(2458);
				((UnpivotMultiValueColumnClauseContext)_localctx).unpivotValueColumn = unpivotValueColumn();
				((UnpivotMultiValueColumnClauseContext)_localctx).unpivotValueColumns.add(((UnpivotMultiValueColumnClauseContext)_localctx).unpivotValueColumn);
				}
				}
				setState(2463);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2464);
			match(RIGHT_PAREN);
			setState(2465);
			match(FOR);
			setState(2466);
			unpivotNameColumn();
			setState(2467);
			match(IN);
			setState(2468);
			match(LEFT_PAREN);
			setState(2469);
			((UnpivotMultiValueColumnClauseContext)_localctx).unpivotColumnSet = unpivotColumnSet();
			((UnpivotMultiValueColumnClauseContext)_localctx).unpivotColumnSets.add(((UnpivotMultiValueColumnClauseContext)_localctx).unpivotColumnSet);
			setState(2474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2470);
				match(COMMA);
				setState(2471);
				((UnpivotMultiValueColumnClauseContext)_localctx).unpivotColumnSet = unpivotColumnSet();
				((UnpivotMultiValueColumnClauseContext)_localctx).unpivotColumnSets.add(((UnpivotMultiValueColumnClauseContext)_localctx).unpivotColumnSet);
				}
				}
				setState(2476);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2477);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnpivotColumnSetContext extends ParserRuleContext {
		public UnpivotColumnContext unpivotColumn;
		public List<UnpivotColumnContext> unpivotColumns = new ArrayList<UnpivotColumnContext>();
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<UnpivotColumnContext> unpivotColumn() {
			return getRuleContexts(UnpivotColumnContext.class);
		}
		public UnpivotColumnContext unpivotColumn(int i) {
			return getRuleContext(UnpivotColumnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public UnpivotAliasContext unpivotAlias() {
			return getRuleContext(UnpivotAliasContext.class,0);
		}
		public UnpivotColumnSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotColumnSet; }
	}

	public final UnpivotColumnSetContext unpivotColumnSet() throws RecognitionException {
		UnpivotColumnSetContext _localctx = new UnpivotColumnSetContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_unpivotColumnSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2479);
			match(LEFT_PAREN);
			setState(2480);
			((UnpivotColumnSetContext)_localctx).unpivotColumn = unpivotColumn();
			((UnpivotColumnSetContext)_localctx).unpivotColumns.add(((UnpivotColumnSetContext)_localctx).unpivotColumn);
			setState(2485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2481);
				match(COMMA);
				setState(2482);
				((UnpivotColumnSetContext)_localctx).unpivotColumn = unpivotColumn();
				((UnpivotColumnSetContext)_localctx).unpivotColumns.add(((UnpivotColumnSetContext)_localctx).unpivotColumn);
				}
				}
				setState(2487);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2488);
			match(RIGHT_PAREN);
			setState(2490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				{
				setState(2489);
				unpivotAlias();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnpivotValueColumnContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnpivotValueColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotValueColumn; }
	}

	public final UnpivotValueColumnContext unpivotValueColumn() throws RecognitionException {
		UnpivotValueColumnContext _localctx = new UnpivotValueColumnContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_unpivotValueColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2492);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnpivotNameColumnContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnpivotNameColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotNameColumn; }
	}

	public final UnpivotNameColumnContext unpivotNameColumn() throws RecognitionException {
		UnpivotNameColumnContext _localctx = new UnpivotNameColumnContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_unpivotNameColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2494);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnpivotColumnAndAliasContext extends ParserRuleContext {
		public UnpivotColumnContext unpivotColumn() {
			return getRuleContext(UnpivotColumnContext.class,0);
		}
		public UnpivotAliasContext unpivotAlias() {
			return getRuleContext(UnpivotAliasContext.class,0);
		}
		public UnpivotColumnAndAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotColumnAndAlias; }
	}

	public final UnpivotColumnAndAliasContext unpivotColumnAndAlias() throws RecognitionException {
		UnpivotColumnAndAliasContext _localctx = new UnpivotColumnAndAliasContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_unpivotColumnAndAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2496);
			unpivotColumn();
			setState(2498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				{
				setState(2497);
				unpivotAlias();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnpivotColumnContext extends ParserRuleContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public UnpivotColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotColumn; }
	}

	public final UnpivotColumnContext unpivotColumn() throws RecognitionException {
		UnpivotColumnContext _localctx = new UnpivotColumnContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_unpivotColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2500);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnpivotAliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public UnpivotAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotAlias; }
	}

	public final UnpivotAliasContext unpivotAlias() throws RecognitionException {
		UnpivotAliasContext _localctx = new UnpivotAliasContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_unpivotAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
			case 1:
				{
				setState(2502);
				match(AS);
				}
				break;
			}
			setState(2505);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LateralViewContext extends ParserRuleContext {
		public IdentifierContext tblName;
		public IdentifierContext identifier;
		public List<IdentifierContext> colName = new ArrayList<IdentifierContext>();
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2507);
			match(LATERAL);
			setState(2508);
			match(VIEW);
			setState(2510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				{
				setState(2509);
				match(OUTER);
				}
				break;
			}
			setState(2512);
			qualifiedName();
			setState(2513);
			match(LEFT_PAREN);
			setState(2522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
			case 1:
				{
				setState(2514);
				expression();
				setState(2519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2515);
					match(COMMA);
					setState(2516);
					expression();
					}
					}
					setState(2521);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2524);
			match(RIGHT_PAREN);
			setState(2525);
			((LateralViewContext)_localctx).tblName = identifier();
			setState(2537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
			case 1:
				{
				setState(2527);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
				case 1:
					{
					setState(2526);
					match(AS);
					}
					break;
				}
				setState(2529);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(2534);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,308,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2530);
						match(COMMA);
						setState(2531);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(2536);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,308,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2539);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public List<RelationExtensionContext> relationExtension() {
			return getRuleContexts(RelationExtensionContext.class);
		}
		public RelationExtensionContext relationExtension(int i) {
			return getRuleContext(RelationExtensionContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				{
				setState(2541);
				match(LATERAL);
				}
				break;
			}
			setState(2544);
			relationPrimary();
			setState(2548);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2545);
					relationExtension();
					}
					} 
				}
				setState(2550);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationExtensionContext extends ParserRuleContext {
		public JoinRelationContext joinRelation() {
			return getRuleContext(JoinRelationContext.class,0);
		}
		public PivotClauseContext pivotClause() {
			return getRuleContext(PivotClauseContext.class,0);
		}
		public UnpivotClauseContext unpivotClause() {
			return getRuleContext(UnpivotClauseContext.class,0);
		}
		public RelationExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationExtension; }
	}

	public final RelationExtensionContext relationExtension() throws RecognitionException {
		RelationExtensionContext _localctx = new RelationExtensionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_relationExtension);
		try {
			setState(2554);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANTI:
			case CROSS:
			case FULL:
			case INNER:
			case JOIN:
			case LEFT:
			case NATURAL:
			case RIGHT:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(2551);
				joinRelation();
				}
				break;
			case PIVOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2552);
				pivotClause();
				}
				break;
			case UNPIVOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(2553);
				unpivotClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_joinRelation);
		try {
			setState(2573);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANTI:
			case CROSS:
			case FULL:
			case INNER:
			case JOIN:
			case LEFT:
			case RIGHT:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2556);
				joinType();
				}
				setState(2557);
				match(JOIN);
				setState(2559);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
				case 1:
					{
					setState(2558);
					match(LATERAL);
					}
					break;
				}
				setState(2561);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(2563);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
				case 1:
					{
					setState(2562);
					joinCriteria();
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2565);
				match(NATURAL);
				setState(2566);
				joinType();
				setState(2567);
				match(JOIN);
				setState(2569);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
				case 1:
					{
					setState(2568);
					match(LATERAL);
					}
					break;
				}
				setState(2571);
				((JoinRelationContext)_localctx).right = relationPrimary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_joinType);
		int _la;
		try {
			setState(2599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(2575);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2578);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2579);
				match(LEFT);
				setState(2581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2580);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(2583);
					match(LEFT);
					}
				}

				setState(2586);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2587);
				match(RIGHT);
				setState(2589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2588);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2591);
				match(FULL);
				setState(2593);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2592);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(2595);
					match(LEFT);
					}
				}

				setState(2598);
				match(ANTI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_joinCriteria);
		try {
			setState(2605);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(2601);
				match(ON);
				setState(2602);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2603);
				match(USING);
				setState(2604);
				identifierList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SampleContext extends ParserRuleContext {
		public Token seed;
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SqlBaseParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SqlBaseParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SqlBaseParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SqlBaseParser.RIGHT_PAREN, i);
		}
		public SampleMethodContext sampleMethod() {
			return getRuleContext(SampleMethodContext.class,0);
		}
		public TerminalNode REPEATABLE() { return getToken(SqlBaseParser.REPEATABLE, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_sample);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2607);
			match(TABLESAMPLE);
			setState(2608);
			match(LEFT_PAREN);
			setState(2610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
			case 1:
				{
				setState(2609);
				sampleMethod();
				}
				break;
			}
			setState(2612);
			match(RIGHT_PAREN);
			setState(2617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
			case 1:
				{
				setState(2613);
				match(REPEATABLE);
				setState(2614);
				match(LEFT_PAREN);
				setState(2615);
				((SampleContext)_localctx).seed = match(INTEGER_VALUE);
				setState(2616);
				match(RIGHT_PAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SampleMethodContext extends ParserRuleContext {
		public SampleMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleMethod; }
	 
		public SampleMethodContext() { }
		public void copyFrom(SampleMethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SampleByRowsContext extends SampleMethodContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public SampleByRowsContext(SampleMethodContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SampleByPercentileContext extends SampleMethodContext {
		public Token negativeSign;
		public Token percentage;
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public SampleByPercentileContext(SampleMethodContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SampleByBucketContext extends SampleMethodContext {
		public Token sampleType;
		public Token numerator;
		public Token denominator;
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public SampleByBucketContext(SampleMethodContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SampleByBytesContext extends SampleMethodContext {
		public ExpressionContext bytes;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampleByBytesContext(SampleMethodContext ctx) { copyFrom(ctx); }
	}

	public final SampleMethodContext sampleMethod() throws RecognitionException {
		SampleMethodContext _localctx = new SampleMethodContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_sampleMethod);
		int _la;
		try {
			setState(2643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
			case 1:
				_localctx = new SampleByPercentileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2619);
					((SampleByPercentileContext)_localctx).negativeSign = match(MINUS);
					}
				}

				setState(2622);
				((SampleByPercentileContext)_localctx).percentage = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((SampleByPercentileContext)_localctx).percentage = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2623);
				match(PERCENTLIT);
				}
				break;
			case 2:
				_localctx = new SampleByRowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2624);
				expression();
				setState(2625);
				match(ROWS);
				}
				break;
			case 3:
				_localctx = new SampleByBucketContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2627);
				((SampleByBucketContext)_localctx).sampleType = match(BUCKET);
				setState(2628);
				((SampleByBucketContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(2629);
				match(OUT);
				setState(2630);
				match(OF);
				setState(2631);
				((SampleByBucketContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(2640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(2632);
					match(ON);
					setState(2638);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
					case 1:
						{
						setState(2633);
						identifier();
						}
						break;
					case 2:
						{
						setState(2634);
						qualifiedName();
						setState(2635);
						match(LEFT_PAREN);
						setState(2636);
						match(RIGHT_PAREN);
						}
						break;
					}
					}
				}

				}
				break;
			case 4:
				_localctx = new SampleByBytesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2642);
				((SampleByBytesContext)_localctx).bytes = expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2645);
			match(LEFT_PAREN);
			setState(2646);
			identifierSeq();
			setState(2647);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierSeqContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> ident = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_identifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2649);
			((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
			setState(2654);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,331,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2650);
					match(COMMA);
					setState(2651);
					((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(2656);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,331,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderedIdentifierListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<OrderedIdentifierContext> orderedIdentifier() {
			return getRuleContexts(OrderedIdentifierContext.class);
		}
		public OrderedIdentifierContext orderedIdentifier(int i) {
			return getRuleContext(OrderedIdentifierContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public OrderedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifierList; }
	}

	public final OrderedIdentifierListContext orderedIdentifierList() throws RecognitionException {
		OrderedIdentifierListContext _localctx = new OrderedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_orderedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2657);
			match(LEFT_PAREN);
			setState(2658);
			orderedIdentifier();
			setState(2663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2659);
				match(COMMA);
				setState(2660);
				orderedIdentifier();
				}
				}
				setState(2665);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2666);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderedIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext ident;
		public Token ordering;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public OrderedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifier; }
	}

	public final OrderedIdentifierContext orderedIdentifier() throws RecognitionException {
		OrderedIdentifierContext _localctx = new OrderedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_orderedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2668);
			((OrderedIdentifierContext)_localctx).ident = errorCapturingIdentifier();
			setState(2670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(2669);
				((OrderedIdentifierContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderedIdentifierContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierCommentListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<IdentifierCommentContext> identifierComment() {
			return getRuleContexts(IdentifierCommentContext.class);
		}
		public IdentifierCommentContext identifierComment(int i) {
			return getRuleContext(IdentifierCommentContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public IdentifierCommentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierCommentList; }
	}

	public final IdentifierCommentListContext identifierCommentList() throws RecognitionException {
		IdentifierCommentListContext _localctx = new IdentifierCommentListContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_identifierCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2672);
			match(LEFT_PAREN);
			setState(2673);
			identifierComment();
			setState(2678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2674);
				match(COMMA);
				setState(2675);
				identifierComment();
				}
				}
				setState(2680);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2681);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierCommentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public IdentifierCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierComment; }
	}

	public final IdentifierCommentContext identifierComment() throws RecognitionException {
		IdentifierCommentContext _localctx = new IdentifierCommentContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_identifierComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2683);
			identifier();
			setState(2685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2684);
				commentSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableValuedFunctionContext extends RelationPrimaryContext {
		public FunctionTableContext functionTable() {
			return getRuleContext(FunctionTableContext.class,0);
		}
		public TableValuedFunctionContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableNameContext extends RelationPrimaryContext {
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public TemporalClauseContext temporalClause() {
			return getRuleContext(TemporalClauseContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_relationPrimary);
		try {
			setState(2714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,340,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2687);
				identifierReference();
				setState(2689);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
				case 1:
					{
					setState(2688);
					temporalClause();
					}
					break;
				}
				setState(2692);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,337,_ctx) ) {
				case 1:
					{
					setState(2691);
					sample();
					}
					break;
				}
				setState(2694);
				tableAlias();
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2696);
				match(LEFT_PAREN);
				setState(2697);
				query();
				setState(2698);
				match(RIGHT_PAREN);
				setState(2700);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
				case 1:
					{
					setState(2699);
					sample();
					}
					break;
				}
				setState(2702);
				tableAlias();
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2704);
				match(LEFT_PAREN);
				setState(2705);
				relation();
				setState(2706);
				match(RIGHT_PAREN);
				setState(2708);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
				case 1:
					{
					setState(2707);
					sample();
					}
					break;
				}
				setState(2710);
				tableAlias();
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2712);
				inlineTable();
				}
				break;
			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2713);
				functionTable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2716);
			match(VALUES);
			setState(2717);
			expression();
			setState(2722);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,341,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2718);
					match(COMMA);
					setState(2719);
					expression();
					}
					} 
				}
				setState(2724);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,341,_ctx);
			}
			setState(2725);
			tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTableSubqueryArgumentContext extends ParserRuleContext {
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public TableArgumentPartitioningContext tableArgumentPartitioning() {
			return getRuleContext(TableArgumentPartitioningContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public FunctionTableSubqueryArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTableSubqueryArgument; }
	}

	public final FunctionTableSubqueryArgumentContext functionTableSubqueryArgument() throws RecognitionException {
		FunctionTableSubqueryArgumentContext _localctx = new FunctionTableSubqueryArgumentContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_functionTableSubqueryArgument);
		int _la;
		try {
			setState(2746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2727);
				match(TABLE);
				setState(2728);
				identifierReference();
				setState(2730);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTRIBUTE || _la==PARTITION || _la==WITH) {
					{
					setState(2729);
					tableArgumentPartitioning();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2732);
				match(TABLE);
				setState(2733);
				match(LEFT_PAREN);
				setState(2734);
				identifierReference();
				setState(2735);
				match(RIGHT_PAREN);
				setState(2737);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTRIBUTE || _la==PARTITION || _la==WITH) {
					{
					setState(2736);
					tableArgumentPartitioning();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2739);
				match(TABLE);
				setState(2740);
				match(LEFT_PAREN);
				setState(2741);
				query();
				setState(2742);
				match(RIGHT_PAREN);
				setState(2744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTRIBUTE || _la==PARTITION || _la==WITH) {
					{
					setState(2743);
					tableArgumentPartitioning();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableArgumentPartitioningContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SINGLE() { return getToken(SqlBaseParser.SINGLE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SqlBaseParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SqlBaseParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SqlBaseParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SqlBaseParser.RIGHT_PAREN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public TableArgumentPartitioningContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableArgumentPartitioning; }
	}

	public final TableArgumentPartitioningContext tableArgumentPartitioning() throws RecognitionException {
		TableArgumentPartitioningContext _localctx = new TableArgumentPartitioningContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_tableArgumentPartitioning);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2767);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WITH:
				{
				{
				setState(2748);
				match(WITH);
				setState(2749);
				match(SINGLE);
				setState(2750);
				match(PARTITION);
				}
				}
				break;
			case DISTRIBUTE:
			case PARTITION:
				{
				{
				setState(2751);
				_la = _input.LA(1);
				if ( !(_la==DISTRIBUTE || _la==PARTITION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2752);
				match(BY);
				setState(2765);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,347,_ctx) ) {
				case 1:
					{
					{
					{
					setState(2753);
					match(LEFT_PAREN);
					setState(2754);
					((TableArgumentPartitioningContext)_localctx).expression = expression();
					((TableArgumentPartitioningContext)_localctx).partition.add(((TableArgumentPartitioningContext)_localctx).expression);
					setState(2759);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2755);
						match(COMMA);
						setState(2756);
						((TableArgumentPartitioningContext)_localctx).expression = expression();
						((TableArgumentPartitioningContext)_localctx).partition.add(((TableArgumentPartitioningContext)_localctx).expression);
						}
						}
						setState(2761);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2762);
					match(RIGHT_PAREN);
					}
					}
					}
					break;
				case 2:
					{
					setState(2764);
					((TableArgumentPartitioningContext)_localctx).expression = expression();
					((TableArgumentPartitioningContext)_localctx).partition.add(((TableArgumentPartitioningContext)_localctx).expression);
					}
					break;
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER || _la==SORT) {
				{
				setState(2769);
				_la = _input.LA(1);
				if ( !(_la==ORDER || _la==SORT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2770);
				match(BY);
				{
				setState(2783);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
				case 1:
					{
					{
					setState(2771);
					match(LEFT_PAREN);
					setState(2772);
					sortItem();
					setState(2777);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2773);
						match(COMMA);
						setState(2774);
						sortItem();
						}
						}
						setState(2779);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2780);
					match(RIGHT_PAREN);
					}
					}
					break;
				case 2:
					{
					setState(2782);
					sortItem();
					}
					break;
				}
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTableNamedArgumentExpressionContext extends ParserRuleContext {
		public IdentifierContext key;
		public FunctionTableSubqueryArgumentContext table;
		public TerminalNode FAT_ARROW() { return getToken(SqlBaseParser.FAT_ARROW, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionTableSubqueryArgumentContext functionTableSubqueryArgument() {
			return getRuleContext(FunctionTableSubqueryArgumentContext.class,0);
		}
		public FunctionTableNamedArgumentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTableNamedArgumentExpression; }
	}

	public final FunctionTableNamedArgumentExpressionContext functionTableNamedArgumentExpression() throws RecognitionException {
		FunctionTableNamedArgumentExpressionContext _localctx = new FunctionTableNamedArgumentExpressionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_functionTableNamedArgumentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2787);
			((FunctionTableNamedArgumentExpressionContext)_localctx).key = identifier();
			setState(2788);
			match(FAT_ARROW);
			setState(2789);
			((FunctionTableNamedArgumentExpressionContext)_localctx).table = functionTableSubqueryArgument();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTableReferenceArgumentContext extends ParserRuleContext {
		public FunctionTableSubqueryArgumentContext functionTableSubqueryArgument() {
			return getRuleContext(FunctionTableSubqueryArgumentContext.class,0);
		}
		public FunctionTableNamedArgumentExpressionContext functionTableNamedArgumentExpression() {
			return getRuleContext(FunctionTableNamedArgumentExpressionContext.class,0);
		}
		public FunctionTableReferenceArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTableReferenceArgument; }
	}

	public final FunctionTableReferenceArgumentContext functionTableReferenceArgument() throws RecognitionException {
		FunctionTableReferenceArgumentContext _localctx = new FunctionTableReferenceArgumentContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_functionTableReferenceArgument);
		try {
			setState(2793);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,352,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2791);
				functionTableSubqueryArgument();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2792);
				functionTableNamedArgumentExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTableArgumentContext extends ParserRuleContext {
		public FunctionTableReferenceArgumentContext functionTableReferenceArgument() {
			return getRuleContext(FunctionTableReferenceArgumentContext.class,0);
		}
		public FunctionArgumentContext functionArgument() {
			return getRuleContext(FunctionArgumentContext.class,0);
		}
		public FunctionTableArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTableArgument; }
	}

	public final FunctionTableArgumentContext functionTableArgument() throws RecognitionException {
		FunctionTableArgumentContext _localctx = new FunctionTableArgumentContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_functionTableArgument);
		try {
			setState(2797);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2795);
				functionTableReferenceArgument();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2796);
				functionArgument();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTableContext extends ParserRuleContext {
		public FunctionNameContext funcName;
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public List<FunctionTableArgumentContext> functionTableArgument() {
			return getRuleContexts(FunctionTableArgumentContext.class);
		}
		public FunctionTableArgumentContext functionTableArgument(int i) {
			return getRuleContext(FunctionTableArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public FunctionTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTable; }
	}

	public final FunctionTableContext functionTable() throws RecognitionException {
		FunctionTableContext _localctx = new FunctionTableContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_functionTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2799);
			((FunctionTableContext)_localctx).funcName = functionName();
			setState(2800);
			match(LEFT_PAREN);
			setState(2809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,355,_ctx) ) {
			case 1:
				{
				setState(2801);
				functionTableArgument();
				setState(2806);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2802);
					match(COMMA);
					setState(2803);
					functionTableArgument();
					}
					}
					setState(2808);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2811);
			match(RIGHT_PAREN);
			setState(2812);
			tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableAliasContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,358,_ctx) ) {
			case 1:
				{
				setState(2815);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,356,_ctx) ) {
				case 1:
					{
					setState(2814);
					match(AS);
					}
					break;
				}
				setState(2817);
				strictIdentifier();
				setState(2819);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,357,_ctx) ) {
				case 1:
					{
					setState(2818);
					identifierList();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RowFormatContext extends ParserRuleContext {
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	 
		public RowFormatContext() { }
		public void copyFrom(RowFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RowFormatSerdeContext extends RowFormatContext {
		public StringLitContext name;
		public PropertyListContext props;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public RowFormatSerdeContext(RowFormatContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RowFormatDelimitedContext extends RowFormatContext {
		public StringLitContext fieldsTerminatedBy;
		public StringLitContext escapedBy;
		public StringLitContext collectionItemsTerminatedBy;
		public StringLitContext keysTerminatedBy;
		public StringLitContext linesSeparatedBy;
		public StringLitContext nullDefinedAs;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(SqlBaseParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(SqlBaseParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public List<StringLitContext> stringLit() {
			return getRuleContexts(StringLitContext.class);
		}
		public StringLitContext stringLit(int i) {
			return getRuleContext(StringLitContext.class,i);
		}
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public RowFormatDelimitedContext(RowFormatContext ctx) { copyFrom(ctx); }
	}

	public final RowFormatContext rowFormat() throws RecognitionException {
		RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_rowFormat);
		try {
			setState(2872);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,366,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2823);
				match(ROW);
				setState(2824);
				match(FORMAT);
				setState(2825);
				match(SERDE);
				setState(2826);
				((RowFormatSerdeContext)_localctx).name = stringLit();
				setState(2830);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,359,_ctx) ) {
				case 1:
					{
					setState(2827);
					match(WITH);
					setState(2828);
					match(SERDEPROPERTIES);
					setState(2829);
					((RowFormatSerdeContext)_localctx).props = propertyList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RowFormatDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2832);
				match(ROW);
				setState(2833);
				match(FORMAT);
				setState(2834);
				match(DELIMITED);
				setState(2844);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,361,_ctx) ) {
				case 1:
					{
					setState(2835);
					match(FIELDS);
					setState(2836);
					match(TERMINATED);
					setState(2837);
					match(BY);
					setState(2838);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = stringLit();
					setState(2842);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,360,_ctx) ) {
					case 1:
						{
						setState(2839);
						match(ESCAPED);
						setState(2840);
						match(BY);
						setState(2841);
						((RowFormatDelimitedContext)_localctx).escapedBy = stringLit();
						}
						break;
					}
					}
					break;
				}
				setState(2851);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,362,_ctx) ) {
				case 1:
					{
					setState(2846);
					match(COLLECTION);
					setState(2847);
					match(ITEMS);
					setState(2848);
					match(TERMINATED);
					setState(2849);
					match(BY);
					setState(2850);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = stringLit();
					}
					break;
				}
				setState(2858);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,363,_ctx) ) {
				case 1:
					{
					setState(2853);
					match(MAP);
					setState(2854);
					match(KEYS);
					setState(2855);
					match(TERMINATED);
					setState(2856);
					match(BY);
					setState(2857);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = stringLit();
					}
					break;
				}
				setState(2864);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,364,_ctx) ) {
				case 1:
					{
					setState(2860);
					match(LINES);
					setState(2861);
					match(TERMINATED);
					setState(2862);
					match(BY);
					setState(2863);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = stringLit();
					}
					break;
				}
				setState(2870);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,365,_ctx) ) {
				case 1:
					{
					setState(2866);
					match(NULL);
					setState(2867);
					match(DEFINED);
					setState(2868);
					match(AS);
					setState(2869);
					((RowFormatDelimitedContext)_localctx).nullDefinedAs = stringLit();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultipartIdentifierListContext extends ParserRuleContext {
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public MultipartIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifierList; }
	}

	public final MultipartIdentifierListContext multipartIdentifierList() throws RecognitionException {
		MultipartIdentifierListContext _localctx = new MultipartIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_multipartIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2874);
			multipartIdentifier();
			setState(2879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2875);
				match(COMMA);
				setState(2876);
				multipartIdentifier();
				}
				}
				setState(2881);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultipartIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> parts = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SqlBaseParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SqlBaseParser.DOT, i);
		}
		public MultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifier; }
	}

	public final MultipartIdentifierContext multipartIdentifier() throws RecognitionException {
		MultipartIdentifierContext _localctx = new MultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_multipartIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2882);
			((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
			setState(2887);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,368,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2883);
					match(DOT);
					setState(2884);
					((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(2889);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,368,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultipartIdentifierPropertyListContext extends ParserRuleContext {
		public List<MultipartIdentifierPropertyContext> multipartIdentifierProperty() {
			return getRuleContexts(MultipartIdentifierPropertyContext.class);
		}
		public MultipartIdentifierPropertyContext multipartIdentifierProperty(int i) {
			return getRuleContext(MultipartIdentifierPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public MultipartIdentifierPropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifierPropertyList; }
	}

	public final MultipartIdentifierPropertyListContext multipartIdentifierPropertyList() throws RecognitionException {
		MultipartIdentifierPropertyListContext _localctx = new MultipartIdentifierPropertyListContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_multipartIdentifierPropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2890);
			multipartIdentifierProperty();
			setState(2895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2891);
				match(COMMA);
				setState(2892);
				multipartIdentifierProperty();
				}
				}
				setState(2897);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultipartIdentifierPropertyContext extends ParserRuleContext {
		public PropertyListContext options;
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public MultipartIdentifierPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifierProperty; }
	}

	public final MultipartIdentifierPropertyContext multipartIdentifierProperty() throws RecognitionException {
		MultipartIdentifierPropertyContext _localctx = new MultipartIdentifierPropertyContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_multipartIdentifierProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2898);
			multipartIdentifier();
			setState(2901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONS) {
				{
				setState(2899);
				match(OPTIONS);
				setState(2900);
				((MultipartIdentifierPropertyContext)_localctx).options = propertyList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext table;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(SqlBaseParser.DOT, 0); }
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,371,_ctx) ) {
			case 1:
				{
				setState(2903);
				((TableIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2904);
				match(DOT);
				}
				break;
			}
			setState(2908);
			((TableIdentifierContext)_localctx).table = errorCapturingIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext function;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(SqlBaseParser.DOT, 0); }
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,372,_ctx) ) {
			case 1:
				{
				setState(2910);
				((FunctionIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2911);
				match(DOT);
				}
				break;
			}
			setState(2915);
			((FunctionIdentifierContext)_localctx).function = errorCapturingIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamedExpressionContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2917);
			expression();
			setState(2925);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,375,_ctx) ) {
			case 1:
				{
				setState(2919);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,373,_ctx) ) {
				case 1:
					{
					setState(2918);
					match(AS);
					}
					break;
				}
				setState(2923);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,374,_ctx) ) {
				case 1:
					{
					setState(2921);
					((NamedExpressionContext)_localctx).name = errorCapturingIdentifier();
					}
					break;
				case 2:
					{
					setState(2922);
					identifierList();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2927);
			namedExpression();
			setState(2932);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,376,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2928);
					match(COMMA);
					setState(2929);
					namedExpression();
					}
					} 
				}
				setState(2934);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,376,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PartitionFieldListContext extends ParserRuleContext {
		public PartitionFieldContext partitionField;
		public List<PartitionFieldContext> fields = new ArrayList<PartitionFieldContext>();
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<PartitionFieldContext> partitionField() {
			return getRuleContexts(PartitionFieldContext.class);
		}
		public PartitionFieldContext partitionField(int i) {
			return getRuleContext(PartitionFieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public PartitionFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionFieldList; }
	}

	public final PartitionFieldListContext partitionFieldList() throws RecognitionException {
		PartitionFieldListContext _localctx = new PartitionFieldListContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_partitionFieldList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2935);
			match(LEFT_PAREN);
			setState(2936);
			((PartitionFieldListContext)_localctx).partitionField = partitionField();
			((PartitionFieldListContext)_localctx).fields.add(((PartitionFieldListContext)_localctx).partitionField);
			setState(2941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2937);
				match(COMMA);
				setState(2938);
				((PartitionFieldListContext)_localctx).partitionField = partitionField();
				((PartitionFieldListContext)_localctx).fields.add(((PartitionFieldListContext)_localctx).partitionField);
				}
				}
				setState(2943);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2944);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PartitionFieldContext extends ParserRuleContext {
		public PartitionFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionField; }
	 
		public PartitionFieldContext() { }
		public void copyFrom(PartitionFieldContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PartitionColumnContext extends PartitionFieldContext {
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public PartitionColumnContext(PartitionFieldContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PartitionTransformContext extends PartitionFieldContext {
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
		}
		public PartitionTransformContext(PartitionFieldContext ctx) { copyFrom(ctx); }
	}

	public final PartitionFieldContext partitionField() throws RecognitionException {
		PartitionFieldContext _localctx = new PartitionFieldContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_partitionField);
		try {
			setState(2948);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,378,_ctx) ) {
			case 1:
				_localctx = new PartitionTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2946);
				transform();
				}
				break;
			case 2:
				_localctx = new PartitionColumnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2947);
				colType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransformContext extends ParserRuleContext {
		public TransformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transform; }
	 
		public TransformContext() { }
		public void copyFrom(TransformContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentityTransformContext extends TransformContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public IdentityTransformContext(TransformContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ApplyTransformContext extends TransformContext {
		public IdentifierContext transformName;
		public TransformArgumentContext transformArgument;
		public List<TransformArgumentContext> argument = new ArrayList<TransformArgumentContext>();
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TransformArgumentContext> transformArgument() {
			return getRuleContexts(TransformArgumentContext.class);
		}
		public TransformArgumentContext transformArgument(int i) {
			return getRuleContext(TransformArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public ApplyTransformContext(TransformContext ctx) { copyFrom(ctx); }
	}

	public final TransformContext transform() throws RecognitionException {
		TransformContext _localctx = new TransformContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_transform);
		int _la;
		try {
			setState(2963);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,380,_ctx) ) {
			case 1:
				_localctx = new IdentityTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2950);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new ApplyTransformContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2951);
				((ApplyTransformContext)_localctx).transformName = identifier();
				setState(2952);
				match(LEFT_PAREN);
				setState(2953);
				((ApplyTransformContext)_localctx).transformArgument = transformArgument();
				((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
				setState(2958);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2954);
					match(COMMA);
					setState(2955);
					((ApplyTransformContext)_localctx).transformArgument = transformArgument();
					((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
					}
					}
					setState(2960);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2961);
				match(RIGHT_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransformArgumentContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TransformArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformArgument; }
	}

	public final TransformArgumentContext transformArgument() throws RecognitionException {
		TransformArgumentContext _localctx = new TransformArgumentContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_transformArgument);
		try {
			setState(2967);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,381,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2965);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2966);
				constant();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2969);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamedArgumentExpressionContext extends ParserRuleContext {
		public IdentifierContext key;
		public ExpressionContext value;
		public TerminalNode FAT_ARROW() { return getToken(SqlBaseParser.FAT_ARROW, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedArgumentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedArgumentExpression; }
	}

	public final NamedArgumentExpressionContext namedArgumentExpression() throws RecognitionException {
		NamedArgumentExpressionContext _localctx = new NamedArgumentExpressionContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_namedArgumentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2971);
			((NamedArgumentExpressionContext)_localctx).key = identifier();
			setState(2972);
			match(FAT_ARROW);
			setState(2973);
			((NamedArgumentExpressionContext)_localctx).value = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedArgumentExpressionContext namedArgumentExpression() {
			return getRuleContext(NamedArgumentExpressionContext.class,0);
		}
		public FunctionArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgument; }
	}

	public final FunctionArgumentContext functionArgument() throws RecognitionException {
		FunctionArgumentContext _localctx = new FunctionArgumentContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_functionArgument);
		try {
			setState(2977);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,382,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2975);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2976);
				namedArgumentExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionSeqContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public ExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSeq; }
	}

	public final ExpressionSeqContext expressionSeq() throws RecognitionException {
		ExpressionSeqContext _localctx = new ExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_expressionSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2979);
			expression();
			setState(2984);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2980);
				match(COMMA);
				setState(2981);
				expression();
				}
				}
				setState(2986);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExistsContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 274;
		enterRecursionRule(_localctx, 274, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2999);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,385,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2988);
				match(NOT);
				setState(2989);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2990);
				match(EXISTS);
				setState(2991);
				match(LEFT_PAREN);
				setState(2992);
				query();
				setState(2993);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2995);
				valueExpression(0);
				setState(2997);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,384,_ctx) ) {
				case 1:
					{
					setState(2996);
					predicate();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(3009);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,387,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3007);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,386,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(3001);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3002);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(3003);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(3004);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3005);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(3006);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(3011);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,387,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public Token quantifier;
		public StringLitContext escapeChar;
		public ValueExpressionContext right;
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode ILIKE() { return getToken(SqlBaseParser.ILIKE, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SqlBaseParser.UNKNOWN, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_predicate);
		int _la;
		try {
			setState(3094);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,401,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3013);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(3012);
					match(NOT);
					}
				}

				setState(3015);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(3016);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(3017);
				match(AND);
				setState(3018);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3021);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(3020);
					match(NOT);
					}
				}

				setState(3023);
				((PredicateContext)_localctx).kind = match(IN);
				setState(3024);
				match(LEFT_PAREN);
				setState(3025);
				expression();
				setState(3030);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(3026);
					match(COMMA);
					setState(3027);
					expression();
					}
					}
					setState(3032);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3033);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3036);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(3035);
					match(NOT);
					}
				}

				setState(3038);
				((PredicateContext)_localctx).kind = match(IN);
				setState(3039);
				match(LEFT_PAREN);
				setState(3040);
				query();
				setState(3041);
				match(RIGHT_PAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3044);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(3043);
					match(NOT);
					}
				}

				setState(3046);
				((PredicateContext)_localctx).kind = match(RLIKE);
				setState(3047);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3049);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(3048);
					match(NOT);
					}
				}

				setState(3051);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==ILIKE) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3052);
				((PredicateContext)_localctx).quantifier = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
					((PredicateContext)_localctx).quantifier = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3066);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,395,_ctx) ) {
				case 1:
					{
					setState(3053);
					match(LEFT_PAREN);
					setState(3054);
					match(RIGHT_PAREN);
					}
					break;
				case 2:
					{
					setState(3055);
					match(LEFT_PAREN);
					setState(3056);
					expression();
					setState(3061);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(3057);
						match(COMMA);
						setState(3058);
						expression();
						}
						}
						setState(3063);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(3064);
					match(RIGHT_PAREN);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3069);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(3068);
					match(NOT);
					}
				}

				setState(3071);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==ILIKE) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3072);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				setState(3075);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,397,_ctx) ) {
				case 1:
					{
					setState(3073);
					match(ESCAPE);
					setState(3074);
					((PredicateContext)_localctx).escapeChar = stringLit();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3077);
				match(IS);
				setState(3079);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(3078);
					match(NOT);
					}
				}

				setState(3081);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(3082);
				match(IS);
				setState(3084);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(3083);
					match(NOT);
					}
				}

				setState(3086);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FALSE || _la==TRUE || _la==UNKNOWN) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(3087);
				match(IS);
				setState(3089);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(3088);
					match(NOT);
					}
				}

				setState(3091);
				((PredicateContext)_localctx).kind = match(DISTINCT);
				setState(3092);
				match(FROM);
				setState(3093);
				((PredicateContext)_localctx).right = valueExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 278;
		enterRecursionRule(_localctx, 278, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,402,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(3097);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3098);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 353)) & ~0x3f) == 0 && ((1L << (_la - 353)) & 35L) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3099);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(3123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,404,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3121);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,403,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(3102);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(3103);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIV || ((((_la - 355)) & ~0x3f) == 0 && ((1L << (_la - 355)) & 7L) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(3104);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(3105);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(3106);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 353)) & ~0x3f) == 0 && ((1L << (_la - 353)) & 259L) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(3107);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(3108);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(3109);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(3110);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(3111);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(3112);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(3113);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(3114);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3115);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(3116);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(3117);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3118);
						comparisonOperator();
						setState(3119);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(3125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,404,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DatetimeUnitContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode QUARTER() { return getToken(SqlBaseParser.QUARTER, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode WEEK() { return getToken(SqlBaseParser.WEEK, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode DAYOFYEAR() { return getToken(SqlBaseParser.DAYOFYEAR, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode MILLISECOND() { return getToken(SqlBaseParser.MILLISECOND, 0); }
		public TerminalNode MICROSECOND() { return getToken(SqlBaseParser.MICROSECOND, 0); }
		public DatetimeUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetimeUnit; }
	}

	public final DatetimeUnitContext datetimeUnit() throws RecognitionException {
		DatetimeUnitContext _localctx = new DatetimeUnitContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_datetimeUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3126);
			_la = _input.LA(1);
			if ( !(_la==DAY || _la==DAYOFYEAR || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & 2990671627550721L) != 0) || _la==QUARTER || _la==SECOND || _la==WEEK || _la==YEAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructContext extends PrimaryExpressionContext {
		public NamedExpressionContext namedExpression;
		public List<NamedExpressionContext> argument = new ArrayList<NamedExpressionContext>();
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public StructContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public TerminalNode DOT() { return getToken(SqlBaseParser.DOT, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CastByColonContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode DOUBLE_COLON() { return getToken(SqlBaseParser.DOUBLE_COLON, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CastByColonContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TimestampaddContext extends PrimaryExpressionContext {
		public Token name;
		public DatetimeUnitContext unit;
		public StringLitContext invalidUnit;
		public ValueExpressionContext unitsAmount;
		public ValueExpressionContext timestamp;
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode TIMESTAMPADD() { return getToken(SqlBaseParser.TIMESTAMPADD, 0); }
		public TerminalNode DATEADD() { return getToken(SqlBaseParser.DATEADD, 0); }
		public TerminalNode DATE_ADD() { return getToken(SqlBaseParser.DATE_ADD, 0); }
		public DatetimeUnitContext datetimeUnit() {
			return getRuleContext(DatetimeUnitContext.class,0);
		}
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TimestampaddContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubstringContext extends PrimaryExpressionContext {
		public ValueExpressionContext str;
		public ValueExpressionContext pos;
		public ValueExpressionContext len;
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public SubstringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CastContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LambdaContext extends PrimaryExpressionContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(SqlBaseParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public LambdaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Any_valueContext extends PrimaryExpressionContext {
		public TerminalNode ANY_VALUE() { return getToken(SqlBaseParser.ANY_VALUE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public Any_valueContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrimContext extends PrimaryExpressionContext {
		public Token trimOption;
		public ValueExpressionContext trimStr;
		public ValueExpressionContext srcStr;
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode BOTH() { return getToken(SqlBaseParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(SqlBaseParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(SqlBaseParser.TRAILING, 0); }
		public TrimContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CurrentLikeContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_USER() { return getToken(SqlBaseParser.CURRENT_USER, 0); }
		public TerminalNode USER() { return getToken(SqlBaseParser.USER, 0); }
		public TerminalNode SESSION_USER() { return getToken(SqlBaseParser.SESSION_USER, 0); }
		public CurrentLikeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LastContext extends PrimaryExpressionContext {
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public ExceptClauseContext exceptClause() {
			return getRuleContext(ExceptClauseContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlBaseParser.DOT, 0); }
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OverlayContext extends PrimaryExpressionContext {
		public ValueExpressionContext input;
		public ValueExpressionContext replace;
		public ValueExpressionContext position;
		public ValueExpressionContext length;
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public OverlayContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public TerminalNode LEFT_BRACKET() { return getToken(SqlBaseParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(SqlBaseParser.RIGHT_BRACKET, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TimestampdiffContext extends PrimaryExpressionContext {
		public Token name;
		public DatetimeUnitContext unit;
		public StringLitContext invalidUnit;
		public ValueExpressionContext startTimestamp;
		public ValueExpressionContext endTimestamp;
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode TIMESTAMPDIFF() { return getToken(SqlBaseParser.TIMESTAMPDIFF, 0); }
		public TerminalNode DATEDIFF() { return getToken(SqlBaseParser.DATEDIFF, 0); }
		public TerminalNode DATE_DIFF() { return getToken(SqlBaseParser.DATE_DIFF, 0); }
		public TerminalNode TIMEDIFF() { return getToken(SqlBaseParser.TIMEDIFF, 0); }
		public DatetimeUnitContext datetimeUnit() {
			return getRuleContext(DatetimeUnitContext.class,0);
		}
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TimestampdiffContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExtractContext extends PrimaryExpressionContext {
		public IdentifierContext field;
		public ValueExpressionContext source;
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public FunctionArgumentContext functionArgument;
		public List<FunctionArgumentContext> argument = new ArrayList<FunctionArgumentContext>();
		public BooleanExpressionContext where;
		public Token nullsOption;
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SqlBaseParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SqlBaseParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SqlBaseParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SqlBaseParser.RIGHT_PAREN, i);
		}
		public TerminalNode WITHIN() { return getToken(SqlBaseParser.WITHIN, 0); }
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public List<FunctionArgumentContext> functionArgument() {
			return getRuleContexts(FunctionArgumentContext.class);
		}
		public FunctionArgumentContext functionArgument(int i) {
			return getRuleContext(FunctionArgumentContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PositionContext extends PrimaryExpressionContext {
		public ValueExpressionContext substr;
		public ValueExpressionContext str;
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FirstContext extends PrimaryExpressionContext {
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 282;
		enterRecursionRule(_localctx, 282, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,432,_ctx) ) {
			case 1:
				{
				_localctx = new CurrentLikeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(3129);
				((CurrentLikeContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 13L) != 0) || _la==SESSION_USER || _la==USER) ) {
					((CurrentLikeContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				_localctx = new TimestampaddContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3130);
				((TimestampaddContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DATEADD || _la==DATE_ADD || _la==TIMESTAMPADD) ) {
					((TimestampaddContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3131);
				match(LEFT_PAREN);
				setState(3134);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,405,_ctx) ) {
				case 1:
					{
					setState(3132);
					((TimestampaddContext)_localctx).unit = datetimeUnit();
					}
					break;
				case 2:
					{
					setState(3133);
					((TimestampaddContext)_localctx).invalidUnit = stringLit();
					}
					break;
				}
				setState(3136);
				match(COMMA);
				setState(3137);
				((TimestampaddContext)_localctx).unitsAmount = valueExpression(0);
				setState(3138);
				match(COMMA);
				setState(3139);
				((TimestampaddContext)_localctx).timestamp = valueExpression(0);
				setState(3140);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				{
				_localctx = new TimestampdiffContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3142);
				((TimestampdiffContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DATEDIFF || _la==DATE_DIFF || _la==TIMEDIFF || _la==TIMESTAMPDIFF) ) {
					((TimestampdiffContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3143);
				match(LEFT_PAREN);
				setState(3146);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,406,_ctx) ) {
				case 1:
					{
					setState(3144);
					((TimestampdiffContext)_localctx).unit = datetimeUnit();
					}
					break;
				case 2:
					{
					setState(3145);
					((TimestampdiffContext)_localctx).invalidUnit = stringLit();
					}
					break;
				}
				setState(3148);
				match(COMMA);
				setState(3149);
				((TimestampdiffContext)_localctx).startTimestamp = valueExpression(0);
				setState(3150);
				match(COMMA);
				setState(3151);
				((TimestampdiffContext)_localctx).endTimestamp = valueExpression(0);
				setState(3152);
				match(RIGHT_PAREN);
				}
				break;
			case 4:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3154);
				match(CASE);
				setState(3156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3155);
					whenClause();
					}
					}
					setState(3158); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(3162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(3160);
					match(ELSE);
					setState(3161);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(3164);
				match(END);
				}
				break;
			case 5:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3166);
				match(CASE);
				setState(3167);
				((SimpleCaseContext)_localctx).value = expression();
				setState(3169); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3168);
					whenClause();
					}
					}
					setState(3171); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(3175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(3173);
					match(ELSE);
					setState(3174);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(3177);
				match(END);
				}
				break;
			case 6:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3179);
				((CastContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CAST || _la==TRY_CAST) ) {
					((CastContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3180);
				match(LEFT_PAREN);
				setState(3181);
				expression();
				setState(3182);
				match(AS);
				setState(3183);
				dataType();
				setState(3184);
				match(RIGHT_PAREN);
				}
				break;
			case 7:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3186);
				match(STRUCT);
				setState(3187);
				match(LEFT_PAREN);
				setState(3196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,412,_ctx) ) {
				case 1:
					{
					setState(3188);
					((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					setState(3193);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(3189);
						match(COMMA);
						setState(3190);
						((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						}
						}
						setState(3195);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(3198);
				match(RIGHT_PAREN);
				}
				break;
			case 8:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3199);
				match(FIRST);
				setState(3200);
				match(LEFT_PAREN);
				setState(3201);
				expression();
				setState(3204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(3202);
					match(IGNORE);
					setState(3203);
					match(NULLS);
					}
				}

				setState(3206);
				match(RIGHT_PAREN);
				}
				break;
			case 9:
				{
				_localctx = new Any_valueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3208);
				match(ANY_VALUE);
				setState(3209);
				match(LEFT_PAREN);
				setState(3210);
				expression();
				setState(3213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(3211);
					match(IGNORE);
					setState(3212);
					match(NULLS);
					}
				}

				setState(3215);
				match(RIGHT_PAREN);
				}
				break;
			case 10:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3217);
				match(LAST);
				setState(3218);
				match(LEFT_PAREN);
				setState(3219);
				expression();
				setState(3222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(3220);
					match(IGNORE);
					setState(3221);
					match(NULLS);
					}
				}

				setState(3224);
				match(RIGHT_PAREN);
				}
				break;
			case 11:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3226);
				match(POSITION);
				setState(3227);
				match(LEFT_PAREN);
				setState(3228);
				((PositionContext)_localctx).substr = valueExpression(0);
				setState(3229);
				match(IN);
				setState(3230);
				((PositionContext)_localctx).str = valueExpression(0);
				setState(3231);
				match(RIGHT_PAREN);
				}
				break;
			case 12:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3233);
				constant();
				}
				break;
			case 13:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3234);
				match(ASTERISK);
				setState(3236);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,416,_ctx) ) {
				case 1:
					{
					setState(3235);
					exceptClause();
					}
					break;
				}
				}
				break;
			case 14:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3238);
				qualifiedName();
				setState(3239);
				match(DOT);
				setState(3240);
				match(ASTERISK);
				setState(3242);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,417,_ctx) ) {
				case 1:
					{
					setState(3241);
					exceptClause();
					}
					break;
				}
				}
				break;
			case 15:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3244);
				match(LEFT_PAREN);
				setState(3245);
				namedExpression();
				setState(3248); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3246);
					match(COMMA);
					setState(3247);
					namedExpression();
					}
					}
					setState(3250); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(3252);
				match(RIGHT_PAREN);
				}
				break;
			case 16:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3254);
				match(LEFT_PAREN);
				setState(3255);
				query();
				setState(3256);
				match(RIGHT_PAREN);
				}
				break;
			case 17:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3258);
				functionName();
				setState(3259);
				match(LEFT_PAREN);
				setState(3271);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,421,_ctx) ) {
				case 1:
					{
					setState(3261);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,419,_ctx) ) {
					case 1:
						{
						setState(3260);
						setQuantifier();
						}
						break;
					}
					setState(3263);
					((FunctionCallContext)_localctx).functionArgument = functionArgument();
					((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).functionArgument);
					setState(3268);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(3264);
						match(COMMA);
						setState(3265);
						((FunctionCallContext)_localctx).functionArgument = functionArgument();
						((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).functionArgument);
						}
						}
						setState(3270);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(3273);
				match(RIGHT_PAREN);
				setState(3289);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,423,_ctx) ) {
				case 1:
					{
					setState(3274);
					match(WITHIN);
					setState(3275);
					match(GROUP);
					setState(3276);
					match(LEFT_PAREN);
					setState(3277);
					match(ORDER);
					setState(3278);
					match(BY);
					setState(3279);
					sortItem();
					setState(3284);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(3280);
						match(COMMA);
						setState(3281);
						sortItem();
						}
						}
						setState(3286);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(3287);
					match(RIGHT_PAREN);
					}
					break;
				}
				setState(3297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,424,_ctx) ) {
				case 1:
					{
					setState(3291);
					match(FILTER);
					setState(3292);
					match(LEFT_PAREN);
					setState(3293);
					match(WHERE);
					setState(3294);
					((FunctionCallContext)_localctx).where = booleanExpression(0);
					setState(3295);
					match(RIGHT_PAREN);
					}
					break;
				}
				setState(3301);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,425,_ctx) ) {
				case 1:
					{
					setState(3299);
					((FunctionCallContext)_localctx).nullsOption = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==IGNORE || _la==RESPECT) ) {
						((FunctionCallContext)_localctx).nullsOption = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(3300);
					match(NULLS);
					}
					break;
				}
				setState(3305);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,426,_ctx) ) {
				case 1:
					{
					setState(3303);
					match(OVER);
					setState(3304);
					windowSpec();
					}
					break;
				}
				}
				break;
			case 18:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3307);
				identifier();
				setState(3308);
				match(ARROW);
				setState(3309);
				expression();
				}
				break;
			case 19:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3311);
				match(LEFT_PAREN);
				setState(3312);
				identifier();
				setState(3315); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3313);
					match(COMMA);
					setState(3314);
					identifier();
					}
					}
					setState(3317); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(3319);
				match(RIGHT_PAREN);
				setState(3320);
				match(ARROW);
				setState(3321);
				expression();
				}
				break;
			case 20:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3323);
				identifier();
				}
				break;
			case 21:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3324);
				match(LEFT_PAREN);
				setState(3325);
				expression();
				setState(3326);
				match(RIGHT_PAREN);
				}
				break;
			case 22:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3328);
				match(EXTRACT);
				setState(3329);
				match(LEFT_PAREN);
				setState(3330);
				((ExtractContext)_localctx).field = identifier();
				setState(3331);
				match(FROM);
				setState(3332);
				((ExtractContext)_localctx).source = valueExpression(0);
				setState(3333);
				match(RIGHT_PAREN);
				}
				break;
			case 23:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3335);
				_la = _input.LA(1);
				if ( !(_la==SUBSTR || _la==SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3336);
				match(LEFT_PAREN);
				setState(3337);
				((SubstringContext)_localctx).str = valueExpression(0);
				setState(3338);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==FROM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3339);
				((SubstringContext)_localctx).pos = valueExpression(0);
				setState(3342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==FOR) {
					{
					setState(3340);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==FOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(3341);
					((SubstringContext)_localctx).len = valueExpression(0);
					}
				}

				setState(3344);
				match(RIGHT_PAREN);
				}
				break;
			case 24:
				{
				_localctx = new TrimContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3346);
				match(TRIM);
				setState(3347);
				match(LEFT_PAREN);
				setState(3349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,429,_ctx) ) {
				case 1:
					{
					setState(3348);
					((TrimContext)_localctx).trimOption = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==BOTH || _la==LEADING || _la==TRAILING) ) {
						((TrimContext)_localctx).trimOption = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(3352);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,430,_ctx) ) {
				case 1:
					{
					setState(3351);
					((TrimContext)_localctx).trimStr = valueExpression(0);
					}
					break;
				}
				setState(3354);
				match(FROM);
				setState(3355);
				((TrimContext)_localctx).srcStr = valueExpression(0);
				setState(3356);
				match(RIGHT_PAREN);
				}
				break;
			case 25:
				{
				_localctx = new OverlayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3358);
				match(OVERLAY);
				setState(3359);
				match(LEFT_PAREN);
				setState(3360);
				((OverlayContext)_localctx).input = valueExpression(0);
				setState(3361);
				match(PLACING);
				setState(3362);
				((OverlayContext)_localctx).replace = valueExpression(0);
				setState(3363);
				match(FROM);
				setState(3364);
				((OverlayContext)_localctx).position = valueExpression(0);
				setState(3367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(3365);
					match(FOR);
					setState(3366);
					((OverlayContext)_localctx).length = valueExpression(0);
					}
				}

				setState(3369);
				match(RIGHT_PAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(3386);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,434,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3384);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,433,_ctx) ) {
					case 1:
						{
						_localctx = new CastByColonContext(new PrimaryExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(3373);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(3374);
						match(DOUBLE_COLON);
						setState(3375);
						dataType();
						}
						break;
					case 2:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(3376);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(3377);
						match(LEFT_BRACKET);
						setState(3378);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(3379);
						match(RIGHT_BRACKET);
						}
						break;
					case 3:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(3381);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(3382);
						match(DOT);
						setState(3383);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(3388);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,434,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralTypeContext extends ParserRuleContext {
		public IdentifierContext unsupportedType;
		public TerminalNode DATE() { return getToken(SqlBaseParser.DATE, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SqlBaseParser.TIMESTAMP, 0); }
		public TerminalNode TIMESTAMP_LTZ() { return getToken(SqlBaseParser.TIMESTAMP_LTZ, 0); }
		public TerminalNode TIMESTAMP_NTZ() { return getToken(SqlBaseParser.TIMESTAMP_NTZ, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode BINARY_HEX() { return getToken(SqlBaseParser.BINARY_HEX, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LiteralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalType; }
	}

	public final LiteralTypeContext literalType() throws RecognitionException {
		LiteralTypeContext _localctx = new LiteralTypeContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_literalType);
		try {
			setState(3396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,435,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3389);
				match(DATE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3390);
				match(TIMESTAMP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3391);
				match(TIMESTAMP_LTZ);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3392);
				match(TIMESTAMP_NTZ);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3393);
				match(INTERVAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3394);
				match(BINARY_HEX);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3395);
				((LiteralTypeContext)_localctx).unsupportedType = identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends ConstantContext {
		public List<StringLitContext> stringLit() {
			return getRuleContexts(StringLitContext.class);
		}
		public StringLitContext stringLit(int i) {
			return getRuleContext(StringLitContext.class,i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeConstructorContext extends ConstantContext {
		public LiteralTypeContext literalType() {
			return getRuleContext(LiteralTypeContext.class,0);
		}
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PosParameterLiteralContext extends ConstantContext {
		public TerminalNode QUESTION() { return getToken(SqlBaseParser.QUESTION, 0); }
		public PosParameterLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NamedParameterLiteralContext extends ConstantContext {
		public TerminalNode COLON() { return getToken(SqlBaseParser.COLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NamedParameterLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_constant);
		try {
			int _alt;
			setState(3413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,437,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3398);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new PosParameterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3399);
				match(QUESTION);
				}
				break;
			case 3:
				_localctx = new NamedParameterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3400);
				match(COLON);
				setState(3401);
				identifier();
				}
				break;
			case 4:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(3402);
				interval();
				}
				break;
			case 5:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(3403);
				literalType();
				setState(3404);
				stringLit();
				}
				break;
			case 6:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(3406);
				number();
				}
				break;
			case 7:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(3407);
				booleanValue();
				}
				break;
			case 8:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(3409); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3408);
						stringLit();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3411); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,436,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(SqlBaseParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SqlBaseParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(SqlBaseParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3415);
			_la = _input.LA(1);
			if ( !(((((_la - 345)) & ~0x3f) == 0 && ((1L << (_la - 345)) & 255L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3417);
			_la = _input.LA(1);
			if ( !(_la==DIV || ((((_la - 353)) & ~0x3f) == 0 && ((1L << (_la - 353)) & 1023L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3419);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==IN || _la==NOT || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3421);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public ErrorCapturingMultiUnitsIntervalContext errorCapturingMultiUnitsInterval() {
			return getRuleContext(ErrorCapturingMultiUnitsIntervalContext.class,0);
		}
		public ErrorCapturingUnitToUnitIntervalContext errorCapturingUnitToUnitInterval() {
			return getRuleContext(ErrorCapturingUnitToUnitIntervalContext.class,0);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3423);
			match(INTERVAL);
			setState(3426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,438,_ctx) ) {
			case 1:
				{
				setState(3424);
				errorCapturingMultiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(3425);
				errorCapturingUnitToUnitInterval();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ErrorCapturingMultiUnitsIntervalContext extends ParserRuleContext {
		public MultiUnitsIntervalContext body;
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public UnitToUnitIntervalContext unitToUnitInterval() {
			return getRuleContext(UnitToUnitIntervalContext.class,0);
		}
		public ErrorCapturingMultiUnitsIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingMultiUnitsInterval; }
	}

	public final ErrorCapturingMultiUnitsIntervalContext errorCapturingMultiUnitsInterval() throws RecognitionException {
		ErrorCapturingMultiUnitsIntervalContext _localctx = new ErrorCapturingMultiUnitsIntervalContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_errorCapturingMultiUnitsInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3428);
			((ErrorCapturingMultiUnitsIntervalContext)_localctx).body = multiUnitsInterval();
			setState(3430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,439,_ctx) ) {
			case 1:
				{
				setState(3429);
				unitToUnitInterval();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiUnitsIntervalContext extends ParserRuleContext {
		public UnitInMultiUnitsContext unitInMultiUnits;
		public List<UnitInMultiUnitsContext> unit = new ArrayList<UnitInMultiUnitsContext>();
		public List<IntervalValueContext> intervalValue() {
			return getRuleContexts(IntervalValueContext.class);
		}
		public IntervalValueContext intervalValue(int i) {
			return getRuleContext(IntervalValueContext.class,i);
		}
		public List<UnitInMultiUnitsContext> unitInMultiUnits() {
			return getRuleContexts(UnitInMultiUnitsContext.class);
		}
		public UnitInMultiUnitsContext unitInMultiUnits(int i) {
			return getRuleContext(UnitInMultiUnitsContext.class,i);
		}
		public MultiUnitsIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiUnitsInterval; }
	}

	public final MultiUnitsIntervalContext multiUnitsInterval() throws RecognitionException {
		MultiUnitsIntervalContext _localctx = new MultiUnitsIntervalContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_multiUnitsInterval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3435); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(3432);
					intervalValue();
					setState(3433);
					((MultiUnitsIntervalContext)_localctx).unitInMultiUnits = unitInMultiUnits();
					((MultiUnitsIntervalContext)_localctx).unit.add(((MultiUnitsIntervalContext)_localctx).unitInMultiUnits);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3437); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,440,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ErrorCapturingUnitToUnitIntervalContext extends ParserRuleContext {
		public UnitToUnitIntervalContext body;
		public MultiUnitsIntervalContext error1;
		public UnitToUnitIntervalContext error2;
		public List<UnitToUnitIntervalContext> unitToUnitInterval() {
			return getRuleContexts(UnitToUnitIntervalContext.class);
		}
		public UnitToUnitIntervalContext unitToUnitInterval(int i) {
			return getRuleContext(UnitToUnitIntervalContext.class,i);
		}
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public ErrorCapturingUnitToUnitIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingUnitToUnitInterval; }
	}

	public final ErrorCapturingUnitToUnitIntervalContext errorCapturingUnitToUnitInterval() throws RecognitionException {
		ErrorCapturingUnitToUnitIntervalContext _localctx = new ErrorCapturingUnitToUnitIntervalContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_errorCapturingUnitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3439);
			((ErrorCapturingUnitToUnitIntervalContext)_localctx).body = unitToUnitInterval();
			setState(3442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,441,_ctx) ) {
			case 1:
				{
				setState(3440);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error1 = multiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(3441);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error2 = unitToUnitInterval();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnitToUnitIntervalContext extends ParserRuleContext {
		public IntervalValueContext value;
		public UnitInUnitToUnitContext from;
		public UnitInUnitToUnitContext to;
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<UnitInUnitToUnitContext> unitInUnitToUnit() {
			return getRuleContexts(UnitInUnitToUnitContext.class);
		}
		public UnitInUnitToUnitContext unitInUnitToUnit(int i) {
			return getRuleContext(UnitInUnitToUnitContext.class,i);
		}
		public UnitToUnitIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitToUnitInterval; }
	}

	public final UnitToUnitIntervalContext unitToUnitInterval() throws RecognitionException {
		UnitToUnitIntervalContext _localctx = new UnitToUnitIntervalContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_unitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3444);
			((UnitToUnitIntervalContext)_localctx).value = intervalValue();
			setState(3445);
			((UnitToUnitIntervalContext)_localctx).from = unitInUnitToUnit();
			setState(3446);
			match(TO);
			setState(3447);
			((UnitToUnitIntervalContext)_localctx).to = unitInUnitToUnit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_intervalValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,442,_ctx) ) {
			case 1:
				{
				setState(3449);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(3455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,443,_ctx) ) {
			case 1:
				{
				setState(3452);
				match(INTEGER_VALUE);
				}
				break;
			case 2:
				{
				setState(3453);
				match(DECIMAL_VALUE);
				}
				break;
			case 3:
				{
				setState(3454);
				stringLit();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnitInMultiUnitsContext extends ParserRuleContext {
		public TerminalNode NANOSECOND() { return getToken(SqlBaseParser.NANOSECOND, 0); }
		public TerminalNode NANOSECONDS() { return getToken(SqlBaseParser.NANOSECONDS, 0); }
		public TerminalNode MICROSECOND() { return getToken(SqlBaseParser.MICROSECOND, 0); }
		public TerminalNode MICROSECONDS() { return getToken(SqlBaseParser.MICROSECONDS, 0); }
		public TerminalNode MILLISECOND() { return getToken(SqlBaseParser.MILLISECOND, 0); }
		public TerminalNode MILLISECONDS() { return getToken(SqlBaseParser.MILLISECONDS, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode SECONDS() { return getToken(SqlBaseParser.SECONDS, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode MINUTES() { return getToken(SqlBaseParser.MINUTES, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode HOURS() { return getToken(SqlBaseParser.HOURS, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode DAYS() { return getToken(SqlBaseParser.DAYS, 0); }
		public TerminalNode WEEK() { return getToken(SqlBaseParser.WEEK, 0); }
		public TerminalNode WEEKS() { return getToken(SqlBaseParser.WEEKS, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode MONTHS() { return getToken(SqlBaseParser.MONTHS, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode YEARS() { return getToken(SqlBaseParser.YEARS, 0); }
		public UnitInMultiUnitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitInMultiUnits; }
	}

	public final UnitInMultiUnitsContext unitInMultiUnits() throws RecognitionException {
		UnitInMultiUnitsContext _localctx = new UnitInMultiUnitsContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_unitInMultiUnits);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3457);
			_la = _input.LA(1);
			if ( !(_la==DAY || _la==DAYS || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & 441317579110219779L) != 0) || _la==SECOND || _la==SECONDS || ((((_la - 335)) & ~0x3f) == 0 && ((1L << (_la - 335)) & 387L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnitInUnitToUnitContext extends ParserRuleContext {
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public UnitInUnitToUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitInUnitToUnit; }
	}

	public final UnitInUnitToUnitContext unitInUnitToUnit() throws RecognitionException {
		UnitInUnitToUnitContext _localctx = new UnitInUnitToUnitContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_unitInUnitToUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3459);
			_la = _input.LA(1);
			if ( !(_la==DAY || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & 2814749767106561L) != 0) || _la==SECOND || _la==YEAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColPositionContext extends ParserRuleContext {
		public Token position;
		public ErrorCapturingIdentifierContext afterCol;
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public ColPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colPosition; }
	}

	public final ColPositionContext colPosition() throws RecognitionException {
		ColPositionContext _localctx = new ColPositionContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_colPosition);
		try {
			setState(3464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(3461);
				((ColPositionContext)_localctx).position = match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(3462);
				((ColPositionContext)_localctx).position = match(AFTER);
				setState(3463);
				((ColPositionContext)_localctx).afterCol = errorCapturingIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public IdentifierContext unsupportedType;
		public TerminalNode BOOLEAN() { return getToken(SqlBaseParser.BOOLEAN, 0); }
		public TerminalNode TINYINT() { return getToken(SqlBaseParser.TINYINT, 0); }
		public TerminalNode BYTE() { return getToken(SqlBaseParser.BYTE, 0); }
		public TerminalNode SMALLINT() { return getToken(SqlBaseParser.SMALLINT, 0); }
		public TerminalNode SHORT() { return getToken(SqlBaseParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(SqlBaseParser.INT, 0); }
		public TerminalNode INTEGER() { return getToken(SqlBaseParser.INTEGER, 0); }
		public TerminalNode BIGINT() { return getToken(SqlBaseParser.BIGINT, 0); }
		public TerminalNode LONG() { return getToken(SqlBaseParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(SqlBaseParser.FLOAT, 0); }
		public TerminalNode REAL() { return getToken(SqlBaseParser.REAL, 0); }
		public TerminalNode DOUBLE() { return getToken(SqlBaseParser.DOUBLE, 0); }
		public TerminalNode DATE() { return getToken(SqlBaseParser.DATE, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SqlBaseParser.TIMESTAMP, 0); }
		public TerminalNode TIMESTAMP_NTZ() { return getToken(SqlBaseParser.TIMESTAMP_NTZ, 0); }
		public TerminalNode TIMESTAMP_LTZ() { return getToken(SqlBaseParser.TIMESTAMP_LTZ, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode CHARACTER() { return getToken(SqlBaseParser.CHARACTER, 0); }
		public TerminalNode CHAR() { return getToken(SqlBaseParser.CHAR, 0); }
		public TerminalNode VARCHAR() { return getToken(SqlBaseParser.VARCHAR, 0); }
		public TerminalNode BINARY() { return getToken(SqlBaseParser.BINARY, 0); }
		public TerminalNode DECIMAL() { return getToken(SqlBaseParser.DECIMAL, 0); }
		public TerminalNode DEC() { return getToken(SqlBaseParser.DEC, 0); }
		public TerminalNode NUMERIC() { return getToken(SqlBaseParser.NUMERIC, 0); }
		public TerminalNode VOID() { return getToken(SqlBaseParser.VOID, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode VARIANT() { return getToken(SqlBaseParser.VARIANT, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_type);
		try {
			setState(3497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,445,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3466);
				match(BOOLEAN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3467);
				match(TINYINT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3468);
				match(BYTE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3469);
				match(SMALLINT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3470);
				match(SHORT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3471);
				match(INT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3472);
				match(INTEGER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(3473);
				match(BIGINT);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(3474);
				match(LONG);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(3475);
				match(FLOAT);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(3476);
				match(REAL);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(3477);
				match(DOUBLE);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(3478);
				match(DATE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(3479);
				match(TIMESTAMP);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(3480);
				match(TIMESTAMP_NTZ);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(3481);
				match(TIMESTAMP_LTZ);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(3482);
				match(STRING);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(3483);
				match(CHARACTER);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(3484);
				match(CHAR);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(3485);
				match(VARCHAR);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(3486);
				match(BINARY);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(3487);
				match(DECIMAL);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(3488);
				match(DEC);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(3489);
				match(NUMERIC);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(3490);
				match(VOID);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(3491);
				match(INTERVAL);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(3492);
				match(VARIANT);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(3493);
				match(ARRAY);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(3494);
				match(STRUCT);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(3495);
				match(MAP);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(3496);
				((TypeContext)_localctx).unsupportedType = identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode COMMA() { return getToken(SqlBaseParser.COMMA, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public ComplexColTypeListContext complexColTypeList() {
			return getRuleContext(ComplexColTypeListContext.class,0);
		}
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class YearMonthIntervalDataTypeContext extends DataTypeContext {
		public Token from;
		public Token to;
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public List<TerminalNode> MONTH() { return getTokens(SqlBaseParser.MONTH); }
		public TerminalNode MONTH(int i) {
			return getToken(SqlBaseParser.MONTH, i);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public YearMonthIntervalDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DayTimeIntervalDataTypeContext extends DataTypeContext {
		public Token from;
		public Token to;
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public List<TerminalNode> HOUR() { return getTokens(SqlBaseParser.HOUR); }
		public TerminalNode HOUR(int i) {
			return getToken(SqlBaseParser.HOUR, i);
		}
		public List<TerminalNode> MINUTE() { return getTokens(SqlBaseParser.MINUTE); }
		public TerminalNode MINUTE(int i) {
			return getToken(SqlBaseParser.MINUTE, i);
		}
		public List<TerminalNode> SECOND() { return getTokens(SqlBaseParser.SECOND); }
		public TerminalNode SECOND(int i) {
			return getToken(SqlBaseParser.SECOND, i);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public DayTimeIntervalDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_dataType);
		int _la;
		try {
			setState(3545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,452,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3499);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(3500);
				match(LT);
				setState(3501);
				dataType();
				setState(3502);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3504);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(3505);
				match(LT);
				setState(3506);
				dataType();
				setState(3507);
				match(COMMA);
				setState(3508);
				dataType();
				setState(3509);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3511);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(3518);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(3512);
					match(LT);
					setState(3514);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,446,_ctx) ) {
					case 1:
						{
						setState(3513);
						complexColTypeList();
						}
						break;
					}
					setState(3516);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(3517);
					match(NEQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new YearMonthIntervalDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(3520);
				match(INTERVAL);
				setState(3521);
				((YearMonthIntervalDataTypeContext)_localctx).from = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MONTH || _la==YEAR) ) {
					((YearMonthIntervalDataTypeContext)_localctx).from = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3524);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,448,_ctx) ) {
				case 1:
					{
					setState(3522);
					match(TO);
					setState(3523);
					((YearMonthIntervalDataTypeContext)_localctx).to = match(MONTH);
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new DayTimeIntervalDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(3526);
				match(INTERVAL);
				setState(3527);
				((DayTimeIntervalDataTypeContext)_localctx).from = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DAY || _la==HOUR || _la==MINUTE || _la==SECOND) ) {
					((DayTimeIntervalDataTypeContext)_localctx).from = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3530);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,449,_ctx) ) {
				case 1:
					{
					setState(3528);
					match(TO);
					setState(3529);
					((DayTimeIntervalDataTypeContext)_localctx).to = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==HOUR || _la==MINUTE || _la==SECOND) ) {
						((DayTimeIntervalDataTypeContext)_localctx).to = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(3532);
				type();
				setState(3543);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,451,_ctx) ) {
				case 1:
					{
					setState(3533);
					match(LEFT_PAREN);
					setState(3534);
					match(INTEGER_VALUE);
					setState(3539);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(3535);
						match(COMMA);
						setState(3536);
						match(INTEGER_VALUE);
						}
						}
						setState(3541);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(3542);
					match(RIGHT_PAREN);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedColTypeWithPositionListContext extends ParserRuleContext {
		public List<QualifiedColTypeWithPositionContext> qualifiedColTypeWithPosition() {
			return getRuleContexts(QualifiedColTypeWithPositionContext.class);
		}
		public QualifiedColTypeWithPositionContext qualifiedColTypeWithPosition(int i) {
			return getRuleContext(QualifiedColTypeWithPositionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public QualifiedColTypeWithPositionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedColTypeWithPositionList; }
	}

	public final QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() throws RecognitionException {
		QualifiedColTypeWithPositionListContext _localctx = new QualifiedColTypeWithPositionListContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_qualifiedColTypeWithPositionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3547);
			qualifiedColTypeWithPosition();
			setState(3552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3548);
				match(COMMA);
				setState(3549);
				qualifiedColTypeWithPosition();
				}
				}
				setState(3554);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedColTypeWithPositionContext extends ParserRuleContext {
		public MultipartIdentifierContext name;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public List<ColDefinitionDescriptorWithPositionContext> colDefinitionDescriptorWithPosition() {
			return getRuleContexts(ColDefinitionDescriptorWithPositionContext.class);
		}
		public ColDefinitionDescriptorWithPositionContext colDefinitionDescriptorWithPosition(int i) {
			return getRuleContext(ColDefinitionDescriptorWithPositionContext.class,i);
		}
		public QualifiedColTypeWithPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedColTypeWithPosition; }
	}

	public final QualifiedColTypeWithPositionContext qualifiedColTypeWithPosition() throws RecognitionException {
		QualifiedColTypeWithPositionContext _localctx = new QualifiedColTypeWithPositionContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_qualifiedColTypeWithPosition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3555);
			((QualifiedColTypeWithPositionContext)_localctx).name = multipartIdentifier();
			setState(3556);
			dataType();
			setState(3560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AFTER || _la==COMMENT || _la==DEFAULT || _la==FIRST || _la==NOT) {
				{
				{
				setState(3557);
				colDefinitionDescriptorWithPosition();
				}
				}
				setState(3562);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColDefinitionDescriptorWithPositionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public DefaultExpressionContext defaultExpression() {
			return getRuleContext(DefaultExpressionContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public ColDefinitionDescriptorWithPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colDefinitionDescriptorWithPosition; }
	}

	public final ColDefinitionDescriptorWithPositionContext colDefinitionDescriptorWithPosition() throws RecognitionException {
		ColDefinitionDescriptorWithPositionContext _localctx = new ColDefinitionDescriptorWithPositionContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_colDefinitionDescriptorWithPosition);
		try {
			setState(3568);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(3563);
				match(NOT);
				setState(3564);
				match(NULL);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3565);
				defaultExpression();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(3566);
				commentSpec();
				}
				break;
			case AFTER:
			case FIRST:
				enterOuterAlt(_localctx, 4);
				{
				setState(3567);
				colPosition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultExpressionContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(SqlBaseParser.DEFAULT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefaultExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultExpression; }
	}

	public final DefaultExpressionContext defaultExpression() throws RecognitionException {
		DefaultExpressionContext _localctx = new DefaultExpressionContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_defaultExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3570);
			match(DEFAULT);
			setState(3571);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDefaultExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(SqlBaseParser.DEFAULT, 0); }
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public VariableDefaultExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefaultExpression; }
	}

	public final VariableDefaultExpressionContext variableDefaultExpression() throws RecognitionException {
		VariableDefaultExpressionContext _localctx = new VariableDefaultExpressionContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_variableDefaultExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3573);
			_la = _input.LA(1);
			if ( !(_la==DEFAULT || _la==EQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3574);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_colTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3576);
			colType();
			setState(3581);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,456,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3577);
					match(COMMA);
					setState(3578);
					colType();
					}
					} 
				}
				setState(3583);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,456,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColTypeContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext colName;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_colType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3584);
			((ColTypeContext)_localctx).colName = errorCapturingIdentifier();
			setState(3585);
			dataType();
			setState(3588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,457,_ctx) ) {
			case 1:
				{
				setState(3586);
				match(NOT);
				setState(3587);
				match(NULL);
				}
				break;
			}
			setState(3591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,458,_ctx) ) {
			case 1:
				{
				setState(3590);
				commentSpec();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateOrReplaceTableColTypeListContext extends ParserRuleContext {
		public List<CreateOrReplaceTableColTypeContext> createOrReplaceTableColType() {
			return getRuleContexts(CreateOrReplaceTableColTypeContext.class);
		}
		public CreateOrReplaceTableColTypeContext createOrReplaceTableColType(int i) {
			return getRuleContext(CreateOrReplaceTableColTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public CreateOrReplaceTableColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createOrReplaceTableColTypeList; }
	}

	public final CreateOrReplaceTableColTypeListContext createOrReplaceTableColTypeList() throws RecognitionException {
		CreateOrReplaceTableColTypeListContext _localctx = new CreateOrReplaceTableColTypeListContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_createOrReplaceTableColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3593);
			createOrReplaceTableColType();
			setState(3598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3594);
				match(COMMA);
				setState(3595);
				createOrReplaceTableColType();
				}
				}
				setState(3600);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateOrReplaceTableColTypeContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext colName;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public List<ColDefinitionOptionContext> colDefinitionOption() {
			return getRuleContexts(ColDefinitionOptionContext.class);
		}
		public ColDefinitionOptionContext colDefinitionOption(int i) {
			return getRuleContext(ColDefinitionOptionContext.class,i);
		}
		public CreateOrReplaceTableColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createOrReplaceTableColType; }
	}

	public final CreateOrReplaceTableColTypeContext createOrReplaceTableColType() throws RecognitionException {
		CreateOrReplaceTableColTypeContext _localctx = new CreateOrReplaceTableColTypeContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_createOrReplaceTableColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3601);
			((CreateOrReplaceTableColTypeContext)_localctx).colName = errorCapturingIdentifier();
			setState(3602);
			dataType();
			setState(3606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==DEFAULT || _la==GENERATED || _la==NOT) {
				{
				{
				setState(3603);
				colDefinitionOption();
				}
				}
				setState(3608);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColDefinitionOptionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public DefaultExpressionContext defaultExpression() {
			return getRuleContext(DefaultExpressionContext.class,0);
		}
		public GenerationExpressionContext generationExpression() {
			return getRuleContext(GenerationExpressionContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColDefinitionOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colDefinitionOption; }
	}

	public final ColDefinitionOptionContext colDefinitionOption() throws RecognitionException {
		ColDefinitionOptionContext _localctx = new ColDefinitionOptionContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_colDefinitionOption);
		try {
			setState(3614);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(3609);
				match(NOT);
				setState(3610);
				match(NULL);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3611);
				defaultExpression();
				}
				break;
			case GENERATED:
				enterOuterAlt(_localctx, 3);
				{
				setState(3612);
				generationExpression();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(3613);
				commentSpec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GenerationExpressionContext extends ParserRuleContext {
		public TerminalNode GENERATED() { return getToken(SqlBaseParser.GENERATED, 0); }
		public TerminalNode ALWAYS() { return getToken(SqlBaseParser.ALWAYS, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public GenerationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generationExpression; }
	}

	public final GenerationExpressionContext generationExpression() throws RecognitionException {
		GenerationExpressionContext _localctx = new GenerationExpressionContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_generationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3616);
			match(GENERATED);
			setState(3617);
			match(ALWAYS);
			setState(3618);
			match(AS);
			setState(3619);
			match(LEFT_PAREN);
			setState(3620);
			expression();
			setState(3621);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComplexColTypeListContext extends ParserRuleContext {
		public List<ComplexColTypeContext> complexColType() {
			return getRuleContexts(ComplexColTypeContext.class);
		}
		public ComplexColTypeContext complexColType(int i) {
			return getRuleContext(ComplexColTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColTypeList; }
	}

	public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
		ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3623);
			complexColType();
			setState(3628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3624);
				match(COMMA);
				setState(3625);
				complexColType();
				}
				}
				setState(3630);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComplexColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SqlBaseParser.COLON, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColType; }
	}

	public final ComplexColTypeContext complexColType() throws RecognitionException {
		ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3631);
			identifier();
			setState(3633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,463,_ctx) ) {
			case 1:
				{
				setState(3632);
				match(COLON);
				}
				break;
			}
			setState(3635);
			dataType();
			setState(3638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(3636);
				match(NOT);
				setState(3637);
				match(NULL);
				}
			}

			setState(3641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(3640);
				commentSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3643);
			match(WHEN);
			setState(3644);
			((WhenClauseContext)_localctx).condition = expression();
			setState(3645);
			match(THEN);
			setState(3646);
			((WhenClauseContext)_localctx).result = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WindowClauseContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public WindowClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowClause; }
	}

	public final WindowClauseContext windowClause() throws RecognitionException {
		WindowClauseContext _localctx = new WindowClauseContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_windowClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3648);
			match(WINDOW);
			setState(3649);
			namedWindow();
			setState(3654);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,466,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3650);
					match(COMMA);
					setState(3651);
					namedWindow();
					}
					} 
				}
				setState(3656);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,466,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamedWindowContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3657);
			((NamedWindowContext)_localctx).name = errorCapturingIdentifier();
			setState(3658);
			match(AS);
			setState(3659);
			windowSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WindowSpecContext extends ParserRuleContext {
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	 
		public WindowSpecContext() { }
		public void copyFrom(WindowSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WindowRefContext extends WindowSpecContext {
		public ErrorCapturingIdentifierContext name;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public WindowRefContext(WindowSpecContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WindowDefContext extends WindowSpecContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowDefContext(WindowSpecContext ctx) { copyFrom(ctx); }
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_windowSpec);
		int _la;
		try {
			setState(3707);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,474,_ctx) ) {
			case 1:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3661);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				}
				break;
			case 2:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3662);
				match(LEFT_PAREN);
				setState(3663);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				setState(3664);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3666);
				match(LEFT_PAREN);
				setState(3701);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(3667);
					match(CLUSTER);
					setState(3668);
					match(BY);
					setState(3669);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(3674);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(3670);
						match(COMMA);
						setState(3671);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(3676);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case RIGHT_PAREN:
				case DISTRIBUTE:
				case ORDER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case SORT:
					{
					setState(3687);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DISTRIBUTE || _la==PARTITION) {
						{
						setState(3677);
						_la = _input.LA(1);
						if ( !(_la==DISTRIBUTE || _la==PARTITION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(3678);
						match(BY);
						setState(3679);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(3684);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(3680);
							match(COMMA);
							setState(3681);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(3686);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(3699);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(3689);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(3690);
						match(BY);
						setState(3691);
						sortItem();
						setState(3696);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(3692);
							match(COMMA);
							setState(3693);
							sortItem();
							}
							}
							setState(3698);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(3703);
					windowFrame();
					}
				}

				setState(3706);
				match(RIGHT_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_windowFrame);
		try {
			setState(3725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,475,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3709);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(3710);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3711);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(3712);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3713);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(3714);
				match(BETWEEN);
				setState(3715);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(3716);
				match(AND);
				setState(3717);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3719);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(3720);
				match(BETWEEN);
				setState(3721);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(3722);
				match(AND);
				setState(3723);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FrameBoundContext extends ParserRuleContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_frameBound);
		int _la;
		try {
			setState(3734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,476,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3727);
				match(UNBOUNDED);
				setState(3728);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3729);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(3730);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3731);
				expression();
				setState(3732);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3736);
			qualifiedName();
			setState(3741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3737);
				match(COMMA);
				setState(3738);
				qualifiedName();
				}
				}
				setState(3743);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionNameContext extends ParserRuleContext {
		public Token identFunc;
		public TerminalNode IDENTIFIER_KW() { return getToken(SqlBaseParser.IDENTIFIER_KW, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_functionName);
		try {
			setState(3754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,478,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3744);
				match(IDENTIFIER_KW);
				setState(3745);
				match(LEFT_PAREN);
				setState(3746);
				expression();
				setState(3747);
				match(RIGHT_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3749);
				((FunctionNameContext)_localctx).identFunc = match(IDENTIFIER_KW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3750);
				qualifiedName();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3751);
				match(FILTER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3752);
				match(LEFT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3753);
				match(RIGHT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SqlBaseParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SqlBaseParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3756);
			identifier();
			setState(3761);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,479,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3757);
					match(DOT);
					setState(3758);
					identifier();
					}
					} 
				}
				setState(3763);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,479,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ErrorCapturingIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() {
			return getRuleContext(ErrorCapturingIdentifierExtraContext.class,0);
		}
		public ErrorCapturingIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifier; }
	}

	public final ErrorCapturingIdentifierContext errorCapturingIdentifier() throws RecognitionException {
		ErrorCapturingIdentifierContext _localctx = new ErrorCapturingIdentifierContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_errorCapturingIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3764);
			identifier();
			setState(3765);
			errorCapturingIdentifierExtra();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ErrorCapturingIdentifierExtraContext extends ParserRuleContext {
		public ErrorCapturingIdentifierExtraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifierExtra; }
	 
		public ErrorCapturingIdentifierExtraContext() { }
		public void copyFrom(ErrorCapturingIdentifierExtraContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ErrorIdentContext extends ErrorCapturingIdentifierExtraContext {
		public List<TerminalNode> MINUS() { return getTokens(SqlBaseParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SqlBaseParser.MINUS, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ErrorIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RealIdentContext extends ErrorCapturingIdentifierExtraContext {
		public RealIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
	}

	public final ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() throws RecognitionException {
		ErrorCapturingIdentifierExtraContext _localctx = new ErrorCapturingIdentifierExtraContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_errorCapturingIdentifierExtra);
		try {
			int _alt;
			setState(3774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,481,_ctx) ) {
			case 1:
				_localctx = new ErrorIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3769); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3767);
						match(MINUS);
						setState(3768);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3771); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,480,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new RealIdentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public StrictNonReservedContext strictNonReserved() {
			return getRuleContext(StrictNonReservedContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_identifier);
		try {
			setState(3779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,482,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3776);
				strictIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3777);
				if (!(!SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "!SQL_standard_keyword_behavior");
				setState(3778);
				strictNonReserved();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlBaseParser.IDENTIFIER, 0); }
		public AnsiNonReservedContext ansiNonReserved() {
			return getRuleContext(AnsiNonReservedContext.class,0);
		}
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_strictIdentifier);
		try {
			setState(3787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,483,_ctx) ) {
			case 1:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3781);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3782);
				quotedIdentifier();
				}
				break;
			case 3:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3783);
				if (!(SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "SQL_standard_keyword_behavior");
				setState(3784);
				ansiNonReserved();
				}
				break;
			case 4:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(3785);
				if (!(!SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "!SQL_standard_keyword_behavior");
				setState(3786);
				nonReserved();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public TerminalNode DOUBLEQUOTED_STRING() { return getToken(SqlBaseParser.DOUBLEQUOTED_STRING, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_quotedIdentifier);
		try {
			setState(3792);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,484,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3789);
				match(BACKQUOTED_IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3790);
				if (!(double_quoted_identifiers)) throw new FailedPredicateException(this, "double_quoted_identifiers");
				setState(3791);
				match(DOUBLEQUOTED_STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BackQuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public BackQuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backQuotedIdentifier; }
	}

	public final BackQuotedIdentifierContext backQuotedIdentifier() throws RecognitionException {
		BackQuotedIdentifierContext _localctx = new BackQuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_backQuotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3794);
			match(BACKQUOTED_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(SqlBaseParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(SqlBaseParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LegacyDecimalLiteralContext extends NumberContext {
		public TerminalNode EXPONENT_VALUE() { return getToken(SqlBaseParser.EXPONENT_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public LegacyDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(SqlBaseParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExponentLiteralContext extends NumberContext {
		public TerminalNode EXPONENT_VALUE() { return getToken(SqlBaseParser.EXPONENT_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public ExponentLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(SqlBaseParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatLiteralContext extends NumberContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(SqlBaseParser.FLOAT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public FloatLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(SqlBaseParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_number);
		int _la;
		try {
			setState(3839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,495,_ctx) ) {
			case 1:
				_localctx = new ExponentLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3796);
				if (!(!legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "!legacy_exponent_literal_as_decimal_enabled");
				setState(3798);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3797);
					match(MINUS);
					}
				}

				setState(3800);
				match(EXPONENT_VALUE);
				}
				break;
			case 2:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3801);
				if (!(!legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "!legacy_exponent_literal_as_decimal_enabled");
				setState(3803);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3802);
					match(MINUS);
					}
				}

				setState(3805);
				match(DECIMAL_VALUE);
				}
				break;
			case 3:
				_localctx = new LegacyDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3806);
				if (!(legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "legacy_exponent_literal_as_decimal_enabled");
				setState(3808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3807);
					match(MINUS);
					}
				}

				setState(3810);
				_la = _input.LA(1);
				if ( !(_la==EXPONENT_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(3812);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3811);
					match(MINUS);
					}
				}

				setState(3814);
				match(INTEGER_VALUE);
				}
				break;
			case 5:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(3816);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3815);
					match(MINUS);
					}
				}

				setState(3818);
				match(BIGINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(3820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3819);
					match(MINUS);
					}
				}

				setState(3822);
				match(SMALLINT_LITERAL);
				}
				break;
			case 7:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(3824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3823);
					match(MINUS);
					}
				}

				setState(3826);
				match(TINYINT_LITERAL);
				}
				break;
			case 8:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(3828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3827);
					match(MINUS);
					}
				}

				setState(3830);
				match(DOUBLE_LITERAL);
				}
				break;
			case 9:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(3832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3831);
					match(MINUS);
					}
				}

				setState(3834);
				match(FLOAT_LITERAL);
				}
				break;
			case 10:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(3836);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3835);
					match(MINUS);
					}
				}

				setState(3838);
				match(BIGDECIMAL_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AlterColumnActionContext extends ParserRuleContext {
		public Token setOrDrop;
		public Token dropDefault;
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public DefaultExpressionContext defaultExpression() {
			return getRuleContext(DefaultExpressionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(SqlBaseParser.DEFAULT, 0); }
		public AlterColumnActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnAction; }
	}

	public final AlterColumnActionContext alterColumnAction() throws RecognitionException {
		AlterColumnActionContext _localctx = new AlterColumnActionContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_alterColumnAction);
		int _la;
		try {
			setState(3852);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,496,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3841);
				match(TYPE);
				setState(3842);
				dataType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3843);
				commentSpec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3844);
				colPosition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3845);
				((AlterColumnActionContext)_localctx).setOrDrop = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DROP || _la==SET) ) {
					((AlterColumnActionContext)_localctx).setOrDrop = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3846);
				match(NOT);
				setState(3847);
				match(NULL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3848);
				match(SET);
				setState(3849);
				defaultExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3850);
				((AlterColumnActionContext)_localctx).dropDefault = match(DROP);
				setState(3851);
				match(DEFAULT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringLitContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SqlBaseParser.STRING_LITERAL, 0); }
		public TerminalNode DOUBLEQUOTED_STRING() { return getToken(SqlBaseParser.DOUBLEQUOTED_STRING, 0); }
		public StringLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLit; }
	}

	public final StringLitContext stringLit() throws RecognitionException {
		StringLitContext _localctx = new StringLitContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_stringLit);
		try {
			setState(3857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,497,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3854);
				match(STRING_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3855);
				if (!(!double_quoted_identifiers)) throw new FailedPredicateException(this, "!double_quoted_identifiers");
				setState(3856);
				match(DOUBLEQUOTED_STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends ParserRuleContext {
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_comment);
		try {
			setState(3861);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,498,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3859);
				stringLit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3860);
				match(NULL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VersionContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_version);
		try {
			setState(3865);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,499,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3863);
				match(INTEGER_VALUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3864);
				stringLit();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnsiNonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode ALWAYS() { return getToken(SqlBaseParser.ALWAYS, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public TerminalNode ANY_VALUE() { return getToken(SqlBaseParser.ANY_VALUE, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode BIGINT() { return getToken(SqlBaseParser.BIGINT, 0); }
		public TerminalNode BINARY() { return getToken(SqlBaseParser.BINARY, 0); }
		public TerminalNode BINARY_HEX() { return getToken(SqlBaseParser.BINARY_HEX, 0); }
		public TerminalNode BOOLEAN() { return getToken(SqlBaseParser.BOOLEAN, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode BYTE() { return getToken(SqlBaseParser.BYTE, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode CATALOG() { return getToken(SqlBaseParser.CATALOG, 0); }
		public TerminalNode CATALOGS() { return getToken(SqlBaseParser.CATALOGS, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode CHAR() { return getToken(SqlBaseParser.CHAR, 0); }
		public TerminalNode CHARACTER() { return getToken(SqlBaseParser.CHARACTER, 0); }
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode DATE() { return getToken(SqlBaseParser.DATE, 0); }
		public TerminalNode DATEADD() { return getToken(SqlBaseParser.DATEADD, 0); }
		public TerminalNode DATE_ADD() { return getToken(SqlBaseParser.DATE_ADD, 0); }
		public TerminalNode DATEDIFF() { return getToken(SqlBaseParser.DATEDIFF, 0); }
		public TerminalNode DATE_DIFF() { return getToken(SqlBaseParser.DATE_DIFF, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode DAYS() { return getToken(SqlBaseParser.DAYS, 0); }
		public TerminalNode DAYOFYEAR() { return getToken(SqlBaseParser.DAYOFYEAR, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DEC() { return getToken(SqlBaseParser.DEC, 0); }
		public TerminalNode DECIMAL() { return getToken(SqlBaseParser.DECIMAL, 0); }
		public TerminalNode DECLARE() { return getToken(SqlBaseParser.DECLARE, 0); }
		public TerminalNode DEFAULT() { return getToken(SqlBaseParser.DEFAULT, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode DOUBLE() { return getToken(SqlBaseParser.DOUBLE, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode EXCLUDE() { return getToken(SqlBaseParser.EXCLUDE, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode FLOAT() { return getToken(SqlBaseParser.FLOAT, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GENERATED() { return getToken(SqlBaseParser.GENERATED, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode HOURS() { return getToken(SqlBaseParser.HOURS, 0); }
		public TerminalNode IDENTIFIER_KW() { return getToken(SqlBaseParser.IDENTIFIER_KW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode IMMEDIATE() { return getToken(SqlBaseParser.IMMEDIATE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode INCLUDE() { return getToken(SqlBaseParser.INCLUDE, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INT() { return getToken(SqlBaseParser.INT, 0); }
		public TerminalNode INTEGER() { return getToken(SqlBaseParser.INTEGER, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode ILIKE() { return getToken(SqlBaseParser.ILIKE, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode LONG() { return getToken(SqlBaseParser.LONG, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode MERGE() { return getToken(SqlBaseParser.MERGE, 0); }
		public TerminalNode MICROSECOND() { return getToken(SqlBaseParser.MICROSECOND, 0); }
		public TerminalNode MICROSECONDS() { return getToken(SqlBaseParser.MICROSECONDS, 0); }
		public TerminalNode MILLISECOND() { return getToken(SqlBaseParser.MILLISECOND, 0); }
		public TerminalNode MILLISECONDS() { return getToken(SqlBaseParser.MILLISECONDS, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode MINUTES() { return getToken(SqlBaseParser.MINUTES, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode MONTHS() { return getToken(SqlBaseParser.MONTHS, 0); }
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode NAME() { return getToken(SqlBaseParser.NAME, 0); }
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public TerminalNode NANOSECOND() { return getToken(SqlBaseParser.NANOSECOND, 0); }
		public TerminalNode NANOSECONDS() { return getToken(SqlBaseParser.NANOSECONDS, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode NUMERIC() { return getToken(SqlBaseParser.NUMERIC, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode QUARTER() { return getToken(SqlBaseParser.QUARTER, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode REAL() { return getToken(SqlBaseParser.REAL, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode REPEATABLE() { return getToken(SqlBaseParser.REPEATABLE, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public TerminalNode SCHEMAS() { return getToken(SqlBaseParser.SCHEMAS, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode SECONDS() { return getToken(SqlBaseParser.SECONDS, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode SEPARATED() { return getToken(SqlBaseParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode SHORT() { return getToken(SqlBaseParser.SHORT, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SINGLE() { return getToken(SqlBaseParser.SINGLE, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode SMALLINT() { return getToken(SqlBaseParser.SMALLINT, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode SOURCE() { return getToken(SqlBaseParser.SOURCE, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(SqlBaseParser.STRATIFY, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public TerminalNode SYNC() { return getToken(SqlBaseParser.SYNC, 0); }
		public TerminalNode SYSTEM_TIME() { return getToken(SqlBaseParser.SYSTEM_TIME, 0); }
		public TerminalNode SYSTEM_VERSION() { return getToken(SqlBaseParser.SYSTEM_VERSION, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TARGET() { return getToken(SqlBaseParser.TARGET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(SqlBaseParser.TERMINATED, 0); }
		public TerminalNode TIMEDIFF() { return getToken(SqlBaseParser.TIMEDIFF, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SqlBaseParser.TIMESTAMP, 0); }
		public TerminalNode TIMESTAMP_LTZ() { return getToken(SqlBaseParser.TIMESTAMP_LTZ, 0); }
		public TerminalNode TIMESTAMP_NTZ() { return getToken(SqlBaseParser.TIMESTAMP_NTZ, 0); }
		public TerminalNode TIMESTAMPADD() { return getToken(SqlBaseParser.TIMESTAMPADD, 0); }
		public TerminalNode TIMESTAMPDIFF() { return getToken(SqlBaseParser.TIMESTAMPDIFF, 0); }
		public TerminalNode TINYINT() { return getToken(SqlBaseParser.TINYINT, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode UNPIVOT() { return getToken(SqlBaseParser.UNPIVOT, 0); }
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public TerminalNode VARCHAR() { return getToken(SqlBaseParser.VARCHAR, 0); }
		public TerminalNode VAR() { return getToken(SqlBaseParser.VAR, 0); }
		public TerminalNode VARIABLE() { return getToken(SqlBaseParser.VARIABLE, 0); }
		public TerminalNode VARIANT() { return getToken(SqlBaseParser.VARIANT, 0); }
		public TerminalNode VERSION() { return getToken(SqlBaseParser.VERSION, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode VIEWS() { return getToken(SqlBaseParser.VIEWS, 0); }
		public TerminalNode VOID() { return getToken(SqlBaseParser.VOID, 0); }
		public TerminalNode WEEK() { return getToken(SqlBaseParser.WEEK, 0); }
		public TerminalNode WEEKS() { return getToken(SqlBaseParser.WEEKS, 0); }
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode YEARS() { return getToken(SqlBaseParser.YEARS, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public AnsiNonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ansiNonReserved; }
	}

	public final AnsiNonReservedContext ansiNonReserved() throws RecognitionException {
		AnsiNonReservedContext _localctx = new AnsiNonReservedContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_ansiNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3867);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7349166403023190784L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 5707138236908830719L) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & 3458764512936521471L) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & -2306406509060311865L) != 0) || ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & -1008854720879527941L) != 0) || ((((_la - 323)) & ~0x3f) == 0 && ((1L << (_la - 323)) & 3751929L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StrictNonReservedContext extends ParserRuleContext {
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public StrictNonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictNonReserved; }
	}

	public final StrictNonReservedContext strictNonReserved() throws RecognitionException {
		StrictNonReservedContext _localctx = new StrictNonReservedContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_strictNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3869);
			_la = _input.LA(1);
			if ( !(_la==ANTI || _la==CROSS || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 1315200624777756673L) != 0) || ((((_la - 191)) & ~0x3f) == 0 && ((1L << (_la - 191)) & 9007199254741249L) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & 576460752303423553L) != 0) || _la==USING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode ALWAYS() { return getToken(SqlBaseParser.ALWAYS, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public TerminalNode ANY_VALUE() { return getToken(SqlBaseParser.ANY_VALUE, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode AUTHORIZATION() { return getToken(SqlBaseParser.AUTHORIZATION, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode BIGINT() { return getToken(SqlBaseParser.BIGINT, 0); }
		public TerminalNode BINARY() { return getToken(SqlBaseParser.BINARY, 0); }
		public TerminalNode BINARY_HEX() { return getToken(SqlBaseParser.BINARY_HEX, 0); }
		public TerminalNode BOOLEAN() { return getToken(SqlBaseParser.BOOLEAN, 0); }
		public TerminalNode BOTH() { return getToken(SqlBaseParser.BOTH, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode BYTE() { return getToken(SqlBaseParser.BYTE, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public TerminalNode CATALOG() { return getToken(SqlBaseParser.CATALOG, 0); }
		public TerminalNode CATALOGS() { return getToken(SqlBaseParser.CATALOGS, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode CHAR() { return getToken(SqlBaseParser.CHAR, 0); }
		public TerminalNode CHARACTER() { return getToken(SqlBaseParser.CHARACTER, 0); }
		public TerminalNode CHECK() { return getToken(SqlBaseParser.CHECK, 0); }
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COLLATE() { return getToken(SqlBaseParser.COLLATE, 0); }
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode CONSTRAINT() { return getToken(SqlBaseParser.CONSTRAINT, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(SqlBaseParser.CURRENT_TIME, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_USER() { return getToken(SqlBaseParser.CURRENT_USER, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode DATE() { return getToken(SqlBaseParser.DATE, 0); }
		public TerminalNode DATEADD() { return getToken(SqlBaseParser.DATEADD, 0); }
		public TerminalNode DATE_ADD() { return getToken(SqlBaseParser.DATE_ADD, 0); }
		public TerminalNode DATEDIFF() { return getToken(SqlBaseParser.DATEDIFF, 0); }
		public TerminalNode DATE_DIFF() { return getToken(SqlBaseParser.DATE_DIFF, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode DAYS() { return getToken(SqlBaseParser.DAYS, 0); }
		public TerminalNode DAYOFYEAR() { return getToken(SqlBaseParser.DAYOFYEAR, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DEC() { return getToken(SqlBaseParser.DEC, 0); }
		public TerminalNode DECIMAL() { return getToken(SqlBaseParser.DECIMAL, 0); }
		public TerminalNode DECLARE() { return getToken(SqlBaseParser.DECLARE, 0); }
		public TerminalNode DEFAULT() { return getToken(SqlBaseParser.DEFAULT, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode DOUBLE() { return getToken(SqlBaseParser.DOUBLE, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode EXCLUDE() { return getToken(SqlBaseParser.EXCLUDE, 0); }
		public TerminalNode EXECUTE() { return getToken(SqlBaseParser.EXECUTE, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public TerminalNode FETCH() { return getToken(SqlBaseParser.FETCH, 0); }
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode FLOAT() { return getToken(SqlBaseParser.FLOAT, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode FOREIGN() { return getToken(SqlBaseParser.FOREIGN, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GENERATED() { return getToken(SqlBaseParser.GENERATED, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode HOURS() { return getToken(SqlBaseParser.HOURS, 0); }
		public TerminalNode IDENTIFIER_KW() { return getToken(SqlBaseParser.IDENTIFIER_KW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode IMMEDIATE() { return getToken(SqlBaseParser.IMMEDIATE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode INCLUDE() { return getToken(SqlBaseParser.INCLUDE, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INT() { return getToken(SqlBaseParser.INT, 0); }
		public TerminalNode INTEGER() { return getToken(SqlBaseParser.INTEGER, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode LEADING() { return getToken(SqlBaseParser.LEADING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode LONG() { return getToken(SqlBaseParser.LONG, 0); }
		public TerminalNode ILIKE() { return getToken(SqlBaseParser.ILIKE, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode MERGE() { return getToken(SqlBaseParser.MERGE, 0); }
		public TerminalNode MICROSECOND() { return getToken(SqlBaseParser.MICROSECOND, 0); }
		public TerminalNode MICROSECONDS() { return getToken(SqlBaseParser.MICROSECONDS, 0); }
		public TerminalNode MILLISECOND() { return getToken(SqlBaseParser.MILLISECOND, 0); }
		public TerminalNode MILLISECONDS() { return getToken(SqlBaseParser.MILLISECONDS, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode MINUTES() { return getToken(SqlBaseParser.MINUTES, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode MONTHS() { return getToken(SqlBaseParser.MONTHS, 0); }
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode NAME() { return getToken(SqlBaseParser.NAME, 0); }
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public TerminalNode NANOSECOND() { return getToken(SqlBaseParser.NANOSECOND, 0); }
		public TerminalNode NANOSECONDS() { return getToken(SqlBaseParser.NANOSECONDS, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode NUMERIC() { return getToken(SqlBaseParser.NUMERIC, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode OFFSET() { return getToken(SqlBaseParser.OFFSET, 0); }
		public TerminalNode ONLY() { return getToken(SqlBaseParser.ONLY, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode OVERLAPS() { return getToken(SqlBaseParser.OVERLAPS, 0); }
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PERCENTILE_CONT() { return getToken(SqlBaseParser.PERCENTILE_CONT, 0); }
		public TerminalNode PERCENTILE_DISC() { return getToken(SqlBaseParser.PERCENTILE_DISC, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRIMARY() { return getToken(SqlBaseParser.PRIMARY, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode QUARTER() { return getToken(SqlBaseParser.QUARTER, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode REAL() { return getToken(SqlBaseParser.REAL, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode REFERENCES() { return getToken(SqlBaseParser.REFERENCES, 0); }
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode REPEATABLE() { return getToken(SqlBaseParser.REPEATABLE, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public TerminalNode SCHEMAS() { return getToken(SqlBaseParser.SCHEMAS, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode SECONDS() { return getToken(SqlBaseParser.SECONDS, 0); }
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public TerminalNode SEPARATED() { return getToken(SqlBaseParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode SESSION_USER() { return getToken(SqlBaseParser.SESSION_USER, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode SHORT() { return getToken(SqlBaseParser.SHORT, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SINGLE() { return getToken(SqlBaseParser.SINGLE, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode SMALLINT() { return getToken(SqlBaseParser.SMALLINT, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode SOURCE() { return getToken(SqlBaseParser.SOURCE, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(SqlBaseParser.STRATIFY, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public TerminalNode SYNC() { return getToken(SqlBaseParser.SYNC, 0); }
		public TerminalNode SYSTEM_TIME() { return getToken(SqlBaseParser.SYSTEM_TIME, 0); }
		public TerminalNode SYSTEM_VERSION() { return getToken(SqlBaseParser.SYSTEM_VERSION, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TARGET() { return getToken(SqlBaseParser.TARGET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(SqlBaseParser.TERMINATED, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode TIMEDIFF() { return getToken(SqlBaseParser.TIMEDIFF, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SqlBaseParser.TIMESTAMP, 0); }
		public TerminalNode TIMESTAMP_LTZ() { return getToken(SqlBaseParser.TIMESTAMP_LTZ, 0); }
		public TerminalNode TIMESTAMP_NTZ() { return getToken(SqlBaseParser.TIMESTAMP_NTZ, 0); }
		public TerminalNode TIMESTAMPADD() { return getToken(SqlBaseParser.TIMESTAMPADD, 0); }
		public TerminalNode TIMESTAMPDIFF() { return getToken(SqlBaseParser.TIMESTAMPDIFF, 0); }
		public TerminalNode TINYINT() { return getToken(SqlBaseParser.TINYINT, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode TRAILING() { return getToken(SqlBaseParser.TRAILING, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode UNIQUE() { return getToken(SqlBaseParser.UNIQUE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SqlBaseParser.UNKNOWN, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode UNPIVOT() { return getToken(SqlBaseParser.UNPIVOT, 0); }
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode USER() { return getToken(SqlBaseParser.USER, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public TerminalNode VARCHAR() { return getToken(SqlBaseParser.VARCHAR, 0); }
		public TerminalNode VAR() { return getToken(SqlBaseParser.VAR, 0); }
		public TerminalNode VARIABLE() { return getToken(SqlBaseParser.VARIABLE, 0); }
		public TerminalNode VARIANT() { return getToken(SqlBaseParser.VARIANT, 0); }
		public TerminalNode VERSION() { return getToken(SqlBaseParser.VERSION, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode VIEWS() { return getToken(SqlBaseParser.VIEWS, 0); }
		public TerminalNode VOID() { return getToken(SqlBaseParser.VOID, 0); }
		public TerminalNode WEEK() { return getToken(SqlBaseParser.WEEK, 0); }
		public TerminalNode WEEKS() { return getToken(SqlBaseParser.WEEKS, 0); }
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode WITHIN() { return getToken(SqlBaseParser.WITHIN, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode YEARS() { return getToken(SqlBaseParser.YEARS, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3871);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -1152921504606880000L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -288230444871188481L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 9223372031955271679L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & -4503599627370625L) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & -1152921504606847107L) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & 33554399L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 53:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 137:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 139:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 141:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 183:
			return identifier_sempred((IdentifierContext)_localctx, predIndex);
		case 184:
			return strictIdentifier_sempred((StrictIdentifierContext)_localctx, predIndex);
		case 185:
			return quotedIdentifier_sempred((QuotedIdentifierContext)_localctx, predIndex);
		case 187:
			return number_sempred((NumberContext)_localctx, predIndex);
		case 189:
			return stringLit_sempred((StringLitContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return legacy_setops_precedence_enabled;
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return !legacy_setops_precedence_enabled;
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return !legacy_setops_precedence_enabled;
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 22);
		case 15:
			return precpred(_ctx, 8);
		case 16:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean identifier_sempred(IdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return !SQL_standard_keyword_behavior;
		}
		return true;
	}
	private boolean strictIdentifier_sempred(StrictIdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return SQL_standard_keyword_behavior;
		case 19:
			return !SQL_standard_keyword_behavior;
		}
		return true;
	}
	private boolean quotedIdentifier_sempred(QuotedIdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return double_quoted_identifiers;
		}
		return true;
	}
	private boolean number_sempred(NumberContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return !legacy_exponent_literal_as_decimal_enabled;
		case 22:
			return !legacy_exponent_literal_as_decimal_enabled;
		case 23:
			return legacy_exponent_literal_as_decimal_enabled;
		}
		return true;
	}
	private boolean stringLit_sempred(StringLitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return !double_quoted_identifiers;
		}
		return true;
	}

	private static final String _serializedATNSegment0 =
		"\u0004\u0001\u0182\u0f22\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007"+
		"\u0083\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007"+
		"\u0086\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007"+
		"\u0089\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007"+
		"\u008c\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007"+
		"\u008f\u0002\u0090\u0007\u0090\u0002\u0091\u0007\u0091\u0002\u0092\u0007"+
		"\u0092\u0002\u0093\u0007\u0093\u0002\u0094\u0007\u0094\u0002\u0095\u0007"+
		"\u0095\u0002\u0096\u0007\u0096\u0002\u0097\u0007\u0097\u0002\u0098\u0007"+
		"\u0098\u0002\u0099\u0007\u0099\u0002\u009a\u0007\u009a\u0002\u009b\u0007"+
		"\u009b\u0002\u009c\u0007\u009c\u0002\u009d\u0007\u009d\u0002\u009e\u0007"+
		"\u009e\u0002\u009f\u0007\u009f\u0002\u00a0\u0007\u00a0\u0002\u00a1\u0007"+
		"\u00a1\u0002\u00a2\u0007\u00a2\u0002\u00a3\u0007\u00a3\u0002\u00a4\u0007"+
		"\u00a4\u0002\u00a5\u0007\u00a5\u0002\u00a6\u0007\u00a6\u0002\u00a7\u0007"+
		"\u00a7\u0002\u00a8\u0007\u00a8\u0002\u00a9\u0007\u00a9\u0002\u00aa\u0007"+
		"\u00aa\u0002\u00ab\u0007\u00ab\u0002\u00ac\u0007\u00ac\u0002\u00ad\u0007"+
		"\u00ad\u0002\u00ae\u0007\u00ae\u0002\u00af\u0007\u00af\u0002\u00b0\u0007"+
		"\u00b0\u0002\u00b1\u0007\u00b1\u0002\u00b2\u0007\u00b2\u0002\u00b3\u0007"+
		"\u00b3\u0002\u00b4\u0007\u00b4\u0002\u00b5\u0007\u00b5\u0002\u00b6\u0007"+
		"\u00b6\u0002\u00b7\u0007\u00b7\u0002\u00b8\u0007\u00b8\u0002\u00b9\u0007"+
		"\u00b9\u0002\u00ba\u0007\u00ba\u0002\u00bb\u0007\u00bb\u0002\u00bc\u0007"+
		"\u00bc\u0002\u00bd\u0007\u00bd\u0002\u00be\u0007\u00be\u0002\u00bf\u0007"+
		"\u00bf\u0002\u00c0\u0007\u00c0\u0002\u00c1\u0007\u00c1\u0002\u00c2\u0007"+
		"\u00c2\u0001\u0000\u0001\u0000\u0005\u0000\u0189\b\u0000\n\u0000\f\u0000"+
		"\u018c\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u01a5\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u01b2\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u01b9\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u01c1\b\u0007"+
		"\n\u0007\f\u0007\u01c4\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u01d7\b\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u01db\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u01e1\b\u0007\u0001\u0007\u0003\u0007\u01e4\b\u0007\u0001\u0007"+
		"\u0003\u0007\u01e7\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u01ee\b\u0007\u0001\u0007\u0003\u0007\u01f1\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u01f5\b\u0007\u0001\u0007\u0003"+
		"\u0007\u01f8\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u01ff\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u020a\b\u0007\n\u0007\f\u0007\u020d\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0214\b\u0007\u0001\u0007"+
		"\u0003\u0007\u0217\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u021b\b"+
		"\u0007\u0001\u0007\u0003\u0007\u021e\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0224\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u022f\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0235\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u023a\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u025c\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0269"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0282\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u028b\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u028f\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0295\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0299"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u029e\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u02a4\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u02b0\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u02b8\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u02be\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u02cb\b\u0007\u0001\u0007\u0004\u0007\u02ce\b"+
		"\u0007\u000b\u0007\f\u0007\u02cf\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u02e0"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u02e5\b\u0007"+
		"\n\u0007\f\u0007\u02e8\t\u0007\u0001\u0007\u0003\u0007\u02eb\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u02f1\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0300\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0304"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u030a"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0310"+
		"\b\u0007\u0001\u0007\u0003\u0007\u0313\b\u0007\u0001\u0007\u0003\u0007"+
		"\u0316\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u031c\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0320\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u0328\b\u0007\n\u0007\f\u0007\u032b\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0333\b\u0007"+
		"\u0001\u0007\u0003\u0007\u0336\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u033f\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0344\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u034a\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0351\b\u0007"+
		"\u0001\u0007\u0003\u0007\u0354\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u035a\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0363\b\u0007"+
		"\n\u0007\f\u0007\u0366\t\u0007\u0003\u0007\u0368\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u036c\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0371\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0377\b\u0007\u0001\u0007\u0003\u0007\u037a\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u037e\b\u0007\u0001\u0007\u0003\u0007\u0381\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0388\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u038d"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0394\b\u0007\u0001\u0007\u0003\u0007\u0397\b\u0007\u0001\u0007"+
		"\u0003\u0007\u039a\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u03a1\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u03a6\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u03af\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u03b7\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u03bd\b\u0007\u0001\u0007\u0003\u0007\u03c0\b\u0007\u0001\u0007\u0003"+
		"\u0007\u03c3\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u03c9\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u03cd\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u03d2\b\u0007\u0001\u0007"+
		"\u0003\u0007\u03d5\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u03d9\b"+
		"\u0007\u0003\u0007\u03db\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u03e3\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u03eb"+
		"\b\u0007\u0001\u0007\u0003\u0007\u03ee\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u03f3\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u03f9\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u03ff\b\u0007\u0001\u0007\u0003\u0007\u0402\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0406\b\u0007\u0001\u0007\u0003"+
		"\u0007\u0409\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u040d\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u0427\b\u0007\n\u0007\f\u0007\u042a\t\u0007\u0003\u0007\u042c"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0430\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0436\b\u0007\u0001\u0007"+
		"\u0003\u0007\u0439\b\u0007\u0001\u0007\u0003\u0007\u043c\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0442\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u044a\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u044f"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0455"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u045b"+
		"\b\u0007\u0001\u0007\u0003\u0007\u045e\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0465\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u046a\b\u0007\n\u0007\f\u0007\u046d"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0472\b\u0007"+
		"\n\u0007\f\u0007\u0475\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0483\b\u0007\n\u0007\f\u0007"+
		"\u0486\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u049e\b\u0007\n\u0007\f\u0007\u04a1\t\u0007\u0003\u0007\u04a3\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u04a7\b\u0007\n\u0007\f\u0007\u04aa"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u04b0"+
		"\b\u0007\n\u0007\f\u0007\u04b3\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u04b9\b\u0007\n\u0007\f\u0007\u04bc\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u04c3"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u04c8\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u04cd\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u04d4\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u04da\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u04df\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u04e5\b\u0007\n\u0007"+
		"\f\u0007\u04e8\t\u0007\u0003\u0007\u04ea\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u04f1\b\b\u0001\b\u0003\b\u04f4\b\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u04fd\b\t\u0001"+
		"\n\u0001\n\u0003\n\u0501\b\n\u0001\u000b\u0001\u000b\u0003\u000b\u0505"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0509\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u050e\b\f\n\f\f\f\u0511\t\f\u0001\r\u0001\r\u0003\r"+
		"\u0515\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0521\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0525\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u052c"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u05a0\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u05a8\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u05b0"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u05b9\b\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u05c3\b\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u05c7\b\u0011"+
		"\u0001\u0011\u0003\u0011\u05ca\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u05d0\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u05d6\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u05e8\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u05f4\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u05f9\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0003\u0018\u0602\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u060a\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u0611\b\u0019\u0003\u0019\u0613\b\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u0618\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u061d\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0621"+
		"\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0626\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u062b\b\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u0630\b\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0639\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u063e\b"+
		"\u0019\u0001\u0019\u0003\u0019\u0641\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u0646\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u064a"+
		"\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u064f\b\u0019"+
		"\u0003\u0019\u0651\b\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u0655\b"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005"+
		"\u001b\u065c\b\u001b\n\u001b\f\u001b\u065f\t\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0666\b\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u066c\b\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u0677\b\u001f\u0001 \u0001 \u0001"+
		" \u0005 \u067c\b \n \f \u067f\t \u0001!\u0001!\u0001!\u0001!\u0005!\u0685"+
		"\b!\n!\f!\u0688\t!\u0001\"\u0001\"\u0003\"\u068c\b\"\u0001\"\u0003\"\u068f"+
		"\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0005$\u06a6\b$\n$\f$\u06a9\t$\u0001%\u0001%\u0001%\u0001"+
		"%\u0005%\u06af\b%\n%\f%\u06b2\t%\u0001%\u0001%\u0001&\u0001&\u0003&\u06b8"+
		"\b&\u0001&\u0003&\u06bb\b&\u0001\'\u0001\'\u0001\'\u0005\'\u06c0\b\'\n"+
		"\'\f\'\u06c3\t\'\u0001\'\u0003\'\u06c6\b\'\u0001(\u0001(\u0001(\u0001"+
		"(\u0003(\u06cc\b(\u0001)\u0001)\u0001)\u0001)\u0005)\u06d2\b)\n)\f)\u06d5"+
		"\t)\u0001)\u0001)\u0001*\u0001*\u0003*\u06db\b*\u0001*\u0003*\u06de\b"+
		"*\u0001+\u0001+\u0001+\u0001+\u0005+\u06e4\b+\n+\f+\u06e7\t+\u0001+\u0001"+
		"+\u0001,\u0001,\u0001,\u0001,\u0005,\u06ef\b,\n,\f,\u06f2\t,\u0001,\u0001"+
		",\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u06fc\b-\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0003.\u0704\b.\u0001/\u0001/\u0001/\u0001"+
		"/\u0003/\u070a\b/\u00010\u00010\u00010\u00011\u00011\u00011\u00011\u0001"+
		"1\u00041\u0714\b1\u000b1\f1\u0715\u00011\u00011\u00011\u00011\u00011\u0003"+
		"1\u071d\b1\u00011\u00011\u00011\u00011\u00011\u00031\u0724\b1\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00031\u0730"+
		"\b1\u00011\u00011\u00011\u00011\u00051\u0736\b1\n1\f1\u0739\t1\u00011"+
		"\u00051\u073c\b1\n1\f1\u073f\t1\u00011\u00051\u0742\b1\n1\f1\u0745\t1"+
		"\u00031\u0747\b1\u00012\u00012\u00012\u00012\u00012\u00012\u00032\u074f"+
		"\b2\u00013\u00013\u00013\u00013\u00013\u00053\u0756\b3\n3\f3\u0759\t3"+
		"\u00033\u075b\b3\u00013\u00013\u00013\u00013\u00013\u00053\u0762\b3\n"+
		"3\f3\u0765\t3\u00033\u0767\b3\u00013\u00013\u00013\u00013\u00013\u0005"+
		"3\u076e\b3\n3\f3\u0771\t3\u00033\u0773\b3\u00013\u00013\u00013\u00013"+
		"\u00013\u00053\u077a\b3\n3\f3\u077d\t3\u00033\u077f\b3\u00013\u00033\u0782"+
		"\b3\u00013\u00013\u00013\u00033\u0787\b3\u00033\u0789\b3\u00013\u0001"+
		"3\u00033\u078d\b3\u00014\u00014\u00014\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00035\u0799\b5\u00015\u00015\u00015\u00015\u00015\u0003"+
		"5\u07a0\b5\u00015\u00015\u00015\u00015\u00015\u00035\u07a7\b5\u00015\u0005"+
		"5\u07aa\b5\n5\f5\u07ad\t5\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00036\u07b8\b6\u00017\u00017\u00037\u07bc\b7\u00017\u0001"+
		"7\u00037\u07c0\b7\u00018\u00018\u00048\u07c4\b8\u000b8\f8\u07c5\u0001"+
		"9\u00019\u00039\u07ca\b9\u00019\u00019\u00019\u00019\u00059\u07d0\b9\n"+
		"9\f9\u07d3\t9\u00019\u00039\u07d6\b9\u00019\u00039\u07d9\b9\u00019\u0003"+
		"9\u07dc\b9\u00019\u00039\u07df\b9\u00019\u00019\u00039\u07e3\b9\u0001"+
		":\u0001:\u0003:\u07e7\b:\u0001:\u0005:\u07ea\b:\n:\f:\u07ed\t:\u0001:"+
		"\u0003:\u07f0\b:\u0001:\u0003:\u07f3\b:\u0001:\u0003:\u07f6\b:\u0001:"+
		"\u0003:\u07f9\b:\u0001:\u0001:\u0003:\u07fd\b:\u0001:\u0005:\u0800\b:"+
		"\n:\f:\u0803\t:\u0001:\u0003:\u0806\b:\u0001:\u0003:\u0809\b:\u0001:\u0003"+
		":\u080c\b:\u0001:\u0003:\u080f\b:\u0003:\u0811\b:\u0001;\u0001;\u0001"+
		";\u0001;\u0003;\u0817\b;\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u081e"+
		"\b;\u0001;\u0001;\u0001;\u0003;\u0823\b;\u0001;\u0003;\u0826\b;\u0001"+
		";\u0003;\u0829\b;\u0001;\u0001;\u0003;\u082d\b;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0003;\u0837\b;\u0001;\u0001;\u0003;\u083b"+
		"\b;\u0003;\u083d\b;\u0001;\u0003;\u0840\b;\u0001;\u0001;\u0003;\u0844"+
		"\b;\u0001<\u0001<\u0005<\u0848\b<\n<\f<\u084b\t<\u0001<\u0003<\u084e\b"+
		"<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001>\u0003"+
		">\u0859\b>\u0001>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0001?\u0003"+
		"?\u0863\b?\u0001?\u0001?\u0003?\u0867\b?\u0001?\u0001?\u0001?\u0001@\u0001"+
		"@\u0001@\u0001@\u0001@\u0001@\u0001@\u0003@\u0873\b@\u0001@\u0001@\u0001"+
		"@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0003A\u087f\bA\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0005B\u088c\bB\nB\fB\u088f\tB\u0001B\u0001B\u0003B\u0893\bB\u0001C"+
		"\u0001C\u0001C\u0001C\u0003C\u0899\bC\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001E\u0001E\u0001E\u0005E\u08a3\bE\nE\fE\u08a6\tE\u0001F\u0001F\u0001"+
		"F\u0001F\u0001G\u0001G\u0001G\u0001H\u0001H\u0001H\u0001I\u0001I\u0001"+
		"I\u0003I\u08b5\bI\u0001I\u0005I\u08b8\bI\nI\fI\u08bb\tI\u0001I\u0001I"+
		"\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0005J\u08c5\bJ\nJ\fJ\u08c8"+
		"\tJ\u0001J\u0001J\u0003J\u08cc\bJ\u0001K\u0001K\u0001K\u0001K\u0005K\u08d2"+
		"\bK\nK\fK\u08d5\tK\u0001K\u0005K\u08d8\bK\nK\fK\u08db\tK\u0001K\u0003"+
		"K\u08de\bK\u0001K\u0003K\u08e1\bK\u0001L\u0003L\u08e4\bL\u0001L\u0001"+
		"L\u0001L\u0001L\u0001L\u0003L\u08eb\bL\u0001L\u0001L\u0001L\u0001L\u0003"+
		"L\u08f1\bL\u0001M\u0001M\u0001M\u0001M\u0001M\u0005M\u08f8\bM\nM\fM\u08fb"+
		"\tM\u0001M\u0001M\u0001M\u0001M\u0001M\u0005M\u0902\bM\nM\fM\u0905\tM"+
		"\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001"+
		"M\u0005M\u0911\bM\nM\fM\u0914\tM\u0001M\u0001M\u0003M\u0918\bM\u0003M"+
		"\u091a\bM\u0001N\u0001N\u0003N\u091e\bN\u0001O\u0001O\u0001O\u0001O\u0001"+
		"O\u0005O\u0925\bO\nO\fO\u0928\tO\u0001O\u0001O\u0001O\u0001O\u0001O\u0001"+
		"O\u0001O\u0001O\u0005O\u0932\bO\nO\fO\u0935\tO\u0001O\u0001O\u0003O\u0939"+
		"\bO\u0001P\u0001P\u0003P\u093d\bP\u0001Q\u0001Q\u0001Q\u0001Q\u0005Q\u0943"+
		"\bQ\nQ\fQ\u0946\tQ\u0003Q\u0948\bQ\u0001Q\u0001Q\u0003Q\u094c\bQ\u0001"+
		"R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0005"+
		"R\u0958\bR\nR\fR\u095b\tR\u0001R\u0001R\u0001R\u0001S\u0001S\u0001S\u0001"+
		"S\u0001S\u0005S\u0965\bS\nS\fS\u0968\tS\u0001S\u0001S\u0003S\u096c\bS"+
		"\u0001T\u0001T\u0003T\u0970\bT\u0001T\u0003T\u0973\bT\u0001U\u0001U\u0003"+
		"U\u0977\bU\u0001U\u0001U\u0001U\u0001U\u0003U\u097d\bU\u0001U\u0003U\u0980"+
		"\bU\u0001V\u0001V\u0001V\u0001W\u0001W\u0003W\u0987\bW\u0001X\u0001X\u0001"+
		"X\u0001X\u0001X\u0001X\u0001X\u0001X\u0005X\u0991\bX\nX\fX\u0994\tX\u0001"+
		"X\u0001X\u0001Y\u0001Y\u0001Y\u0001Y\u0005Y\u099c\bY\nY\fY\u099f\tY\u0001"+
		"Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0005Y\u09a9\bY\nY"+
		"\fY\u09ac\tY\u0001Y\u0001Y\u0001Z\u0001Z\u0001Z\u0001Z\u0005Z\u09b4\b"+
		"Z\nZ\fZ\u09b7\tZ\u0001Z\u0001Z\u0003Z\u09bb\bZ\u0001[\u0001[\u0001\\\u0001"+
		"\\\u0001]\u0001]\u0003]\u09c3\b]\u0001^\u0001^\u0001_\u0003_\u09c8\b_"+
		"\u0001_\u0001_\u0001`\u0001`\u0001`\u0003`\u09cf\b`\u0001`\u0001`\u0001"+
		"`\u0001`\u0001`\u0005`\u09d6\b`\n`\f`\u09d9\t`\u0003`\u09db\b`\u0001`"+
		"\u0001`\u0001`\u0003`\u09e0\b`\u0001`\u0001`\u0001`\u0005`\u09e5\b`\n"+
		"`\f`\u09e8\t`\u0003`\u09ea\b`\u0001a\u0001a\u0001b\u0003b\u09ef\bb\u0001"+
		"b\u0001b\u0005b\u09f3\bb\nb\fb\u09f6\tb\u0001c\u0001c\u0001c\u0003c\u09fb"+
		"\bc\u0001d\u0001d\u0001d\u0003d\u0a00\bd\u0001d\u0001d\u0003d\u0a04\b"+
		"d\u0001d\u0001d\u0001d\u0001d\u0003d\u0a0a\bd\u0001d\u0001d\u0003d\u0a0e"+
		"\bd\u0001e\u0003e\u0a11\be\u0001e\u0001e\u0001e\u0003e\u0a16\be\u0001"+
		"e\u0003e\u0a19\be\u0001e\u0001e\u0001e\u0003e\u0a1e\be\u0001e\u0001e\u0003"+
		"e\u0a22\be\u0001e\u0003e\u0a25\be\u0001e\u0003e\u0a28\be\u0001f\u0001"+
		"f\u0001f\u0001f\u0003f\u0a2e\bf\u0001g\u0001g\u0001g\u0003g\u0a33\bg\u0001"+
		"g\u0001g\u0001g\u0001g\u0001g\u0003g\u0a3a\bg\u0001h\u0003h\u0a3d\bh\u0001"+
		"h\u0001h\u0001h\u0001h\u0001h\u0001h\u0001h\u0001h\u0001h\u0001h\u0001"+
		"h\u0001h\u0001h\u0001h\u0001h\u0001h\u0003h\u0a4f\bh\u0003h\u0a51\bh\u0001"+
		"h\u0003h\u0a54\bh\u0001i\u0001i\u0001i\u0001i\u0001j\u0001j\u0001j\u0005"+
		"j\u0a5d\bj\nj\fj\u0a60\tj\u0001k\u0001k\u0001k\u0001k\u0005k\u0a66\bk"+
		"\nk\fk\u0a69\tk\u0001k\u0001k\u0001l\u0001l\u0003l\u0a6f\bl\u0001m\u0001"+
		"m\u0001m\u0001m\u0005m\u0a75\bm\nm\fm\u0a78\tm\u0001m\u0001m\u0001n\u0001"+
		"n\u0003n\u0a7e\bn\u0001o\u0001o\u0003o\u0a82\bo\u0001o\u0003o\u0a85\b"+
		"o\u0001o\u0001o\u0001o\u0001o\u0001o\u0001o\u0003o\u0a8d\bo\u0001o\u0001"+
		"o\u0001o\u0001o\u0001o\u0001o\u0003o\u0a95\bo\u0001o\u0001o\u0001o\u0001"+
		"o\u0003o\u0a9b\bo\u0001p\u0001p\u0001p\u0001p\u0005p\u0aa1\bp\np\fp\u0aa4"+
		"\tp\u0001p\u0001p\u0001q\u0001q\u0001q\u0003q\u0aab\bq\u0001q\u0001q\u0001"+
		"q\u0001q\u0001q\u0003q\u0ab2\bq\u0001q\u0001q\u0001q\u0001q\u0001q\u0003"+
		"q\u0ab9\bq\u0003q\u0abb\bq\u0001r\u0001r\u0001r\u0001r\u0001r\u0001r\u0001"+
		"r\u0001r\u0001r\u0005r\u0ac6\br\nr\fr\u0ac9\tr\u0001r\u0001r\u0001r\u0003"+
		"r\u0ace\br\u0003r\u0ad0\br\u0001r\u0001r\u0001r\u0001r\u0001r\u0001r\u0005"+
		"r\u0ad8\br\nr\fr\u0adb\tr\u0001r\u0001r\u0001r\u0003r\u0ae0\br\u0003r"+
		"\u0ae2\br\u0001s\u0001s\u0001s\u0001s\u0001t\u0001t\u0003t\u0aea\bt\u0001"+
		"u\u0001u\u0003u\u0aee\bu\u0001v\u0001v\u0001v\u0001v\u0001v\u0005v\u0af5"+
		"\bv\nv\fv\u0af8\tv\u0003v\u0afa\bv\u0001v\u0001v\u0001v\u0001w\u0003w"+
		"\u0b00\bw\u0001w\u0001w\u0003w\u0b04\bw\u0003w\u0b06\bw\u0001x\u0001x"+
		"\u0001x\u0001x\u0001x\u0001x\u0001x\u0003x\u0b0f\bx\u0001x\u0001x\u0001"+
		"x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0003x\u0b1b\bx\u0003"+
		"x\u0b1d\bx\u0001x\u0001x\u0001x\u0001x\u0001x\u0003x\u0b24\bx\u0001x\u0001"+
		"x\u0001x\u0001x\u0001x\u0003x\u0b2b\bx\u0001x\u0001x\u0001x\u0001x\u0003"+
		"x\u0b31\bx\u0001x\u0001x\u0001x\u0001x\u0003x\u0b37\bx\u0003x\u0b39\b"+
		"x\u0001y\u0001y\u0001y\u0005y\u0b3e\by\ny\fy\u0b41\ty\u0001z\u0001z\u0001"+
		"z\u0005z\u0b46\bz\nz\fz\u0b49\tz\u0001{\u0001{\u0001{\u0005{\u0b4e\b{"+
		"\n{\f{\u0b51\t{\u0001|\u0001|\u0001|\u0003|\u0b56\b|\u0001}\u0001}\u0001"+
		"}\u0003}\u0b5b\b}\u0001}\u0001}\u0001~\u0001~\u0001~\u0003~\u0b62\b~\u0001"+
		"~\u0001~\u0001\u007f\u0001\u007f\u0003\u007f\u0b68\b\u007f\u0001\u007f"+
		"\u0001\u007f\u0003\u007f\u0b6c\b\u007f\u0003\u007f\u0b6e\b\u007f\u0001"+
		"\u0080\u0001\u0080\u0001\u0080\u0005\u0080\u0b73\b\u0080\n\u0080\f\u0080"+
		"\u0b76\t\u0080\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0005\u0081"+
		"\u0b7c\b\u0081\n\u0081\f\u0081\u0b7f\t\u0081\u0001\u0081\u0001\u0081\u0001"+
		"\u0082\u0001\u0082\u0003\u0082\u0b85\b\u0082\u0001\u0083\u0001\u0083\u0001"+
		"\u0083\u0001\u0083\u0001\u0083\u0001\u0083\u0005\u0083\u0b8d\b\u0083\n"+
		"\u0083\f\u0083\u0b90\t\u0083\u0001\u0083\u0001\u0083\u0003\u0083\u0b94"+
		"\b\u0083\u0001\u0084\u0001\u0084\u0003\u0084\u0b98\b\u0084\u0001\u0085"+
		"\u0001\u0085\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0087"+
		"\u0001\u0087\u0003\u0087\u0ba2\b\u0087\u0001\u0088\u0001\u0088\u0001\u0088"+
		"\u0005\u0088\u0ba7\b\u0088\n\u0088\f\u0088\u0baa\t\u0088\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0003\u0089\u0bb6\b\u0089\u0003\u0089\u0bb8"+
		"\b\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0005\u0089\u0bc0\b\u0089\n\u0089\f\u0089\u0bc3\t\u0089\u0001\u008a"+
		"\u0003\u008a\u0bc6\b\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a"+
		"\u0001\u008a\u0001\u008a\u0003\u008a\u0bce\b\u008a\u0001\u008a\u0001\u008a"+
		"\u0001\u008a\u0001\u008a\u0001\u008a\u0005\u008a\u0bd5\b\u008a\n\u008a"+
		"\f\u008a\u0bd8\t\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0003\u008a"+
		"\u0bdd\b\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a"+
		"\u0001\u008a\u0003\u008a\u0be5\b\u008a\u0001\u008a\u0001\u008a\u0001\u008a"+
		"\u0003\u008a\u0bea\b\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a"+
		"\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0005\u008a\u0bf4\b\u008a"+
		"\n\u008a\f\u008a\u0bf7\t\u008a\u0001\u008a\u0001\u008a\u0003\u008a\u0bfb"+
		"\b\u008a\u0001\u008a\u0003\u008a\u0bfe\b\u008a\u0001\u008a\u0001\u008a"+
		"\u0001\u008a\u0001\u008a\u0003\u008a\u0c04\b\u008a\u0001\u008a\u0001\u008a"+
		"\u0003\u008a\u0c08\b\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0003\u008a"+
		"\u0c0d\b\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0003\u008a\u0c12\b"+
		"\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0003\u008a\u0c17\b\u008a\u0001"+
		"\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0003\u008b\u0c1d\b\u008b\u0001"+
		"\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001"+
		"\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001"+
		"\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001"+
		"\u008b\u0005\u008b\u0c32\b\u008b\n\u008b\f\u008b\u0c35\t\u008b\u0001\u008c"+
		"\u0001\u008c\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d"+
		"\u0001\u008d\u0003\u008d\u0c3f\b\u008d\u0001\u008d\u0001\u008d\u0001\u008d"+
		"\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d"+
		"\u0001\u008d\u0003\u008d\u0c4b\b\u008d\u0001\u008d\u0001\u008d\u0001\u008d"+
		"\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0004\u008d"+
		"\u0c55\b\u008d\u000b\u008d\f\u008d\u0c56\u0001\u008d\u0001\u008d\u0003"+
		"\u008d\u0c5b\b\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001"+
		"\u008d\u0004\u008d\u0c62\b\u008d\u000b\u008d\f\u008d\u0c63\u0001\u008d"+
		"\u0001\u008d\u0003\u008d\u0c68\b\u008d\u0001\u008d\u0001\u008d\u0001\u008d"+
		"\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d"+
		"\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0005\u008d"+
		"\u0c78\b\u008d\n\u008d\f\u008d\u0c7b\t\u008d\u0003\u008d\u0c7d\b\u008d"+
		"\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d"+
		"\u0003\u008d\u0c85\b\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d"+
		"\u0001\u008d\u0001\u008d\u0001\u008d\u0003\u008d\u0c8e\b\u008d\u0001\u008d"+
		"\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d"+
		"\u0003\u008d\u0c97\b\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d"+
		"\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d"+
		"\u0001\u008d\u0001\u008d\u0003\u008d\u0ca5\b\u008d\u0001\u008d\u0001\u008d"+
		"\u0001\u008d\u0001\u008d\u0003\u008d\u0cab\b\u008d\u0001\u008d\u0001\u008d"+
		"\u0001\u008d\u0001\u008d\u0004\u008d\u0cb1\b\u008d\u000b\u008d\f\u008d"+
		"\u0cb2\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001"+
		"\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0003\u008d\u0cbe\b\u008d\u0001"+
		"\u008d\u0001\u008d\u0001\u008d\u0005\u008d\u0cc3\b\u008d\n\u008d\f\u008d"+
		"\u0cc6\t\u008d\u0003\u008d\u0cc8\b\u008d\u0001\u008d\u0001\u008d\u0001"+
		"\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001"+
		"\u008d\u0005\u008d\u0cd3\b\u008d\n\u008d\f\u008d\u0cd6\t\u008d\u0001\u008d"+
		"\u0001\u008d\u0003\u008d\u0cda\b\u008d\u0001\u008d\u0001\u008d\u0001\u008d"+
		"\u0001\u008d\u0001\u008d\u0001\u008d\u0003\u008d\u0ce2\b\u008d\u0001\u008d"+
		"\u0001\u008d\u0003\u008d\u0ce6\b\u008d\u0001\u008d\u0001\u008d\u0003\u008d"+
		"\u0cea\b\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d"+
		"\u0001\u008d\u0001\u008d\u0001\u008d\u0004\u008d\u0cf4\b\u008d\u000b\u008d"+
		"\f\u008d\u0cf5\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d"+
		"\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d"+
		"\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d"+
		"\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d"+
		"\u0003\u008d\u0d0f\b\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d"+
		"\u0001\u008d\u0003\u008d\u0d16\b\u008d\u0001\u008d\u0003\u008d\u0d19\b"+
		"\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001"+
		"\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001"+
		"\u008d\u0001\u008d\u0003\u008d\u0d28\b\u008d\u0001\u008d\u0001\u008d\u0003"+
		"\u008d\u0d2c\b\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001"+
		"\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001"+
		"\u008d\u0005\u008d\u0d39\b\u008d\n\u008d\f\u008d\u0d3c\t\u008d\u0001\u008e"+
		"\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008e"+
		"\u0003\u008e\u0d45\b\u008e\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f"+
		"\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f"+
		"\u0001\u008f\u0004\u008f\u0d52\b\u008f\u000b\u008f\f\u008f\u0d53\u0003"+
		"\u008f\u0d56\b\u008f\u0001\u0090\u0001\u0090\u0001\u0091\u0001\u0091\u0001"+
		"\u0092\u0001\u0092\u0001\u0093\u0001\u0093\u0001\u0094\u0001\u0094\u0001"+
		"\u0094\u0003\u0094\u0d63\b\u0094\u0001\u0095\u0001\u0095\u0003\u0095\u0d67"+
		"\b\u0095\u0001\u0096\u0001\u0096\u0001\u0096\u0004\u0096\u0d6c\b\u0096"+
		"\u000b\u0096\f\u0096\u0d6d\u0001\u0097\u0001\u0097\u0001\u0097\u0003\u0097"+
		"\u0d73\b\u0097\u0001\u0098\u0001\u0098\u0001\u0098\u0001\u0098\u0001\u0098"+
		"\u0001\u0099\u0003\u0099\u0d7b\b\u0099\u0001\u0099\u0001\u0099\u0001\u0099"+
		"\u0003\u0099\u0d80\b\u0099\u0001\u009a\u0001\u009a\u0001\u009b\u0001\u009b"+
		"\u0001\u009c\u0001\u009c\u0001\u009c\u0003\u009c\u0d89\b\u009c\u0001\u009d"+
		"\u0001\u009d\u0001\u009d\u0001\u009d\u0001\u009d\u0001\u009d\u0001\u009d"+
		"\u0001\u009d\u0001\u009d\u0001\u009d\u0001\u009d\u0001\u009d\u0001\u009d"+
		"\u0001\u009d\u0001\u009d\u0001\u009d\u0001\u009d\u0001\u009d\u0001\u009d"+
		"\u0001\u009d\u0001\u009d\u0001\u009d\u0001\u009d\u0001\u009d\u0001\u009d"+
		"\u0001\u009d\u0001\u009d\u0001\u009d\u0001\u009d\u0001\u009d\u0001\u009d"+
		"\u0003\u009d\u0daa\b\u009d\u0001\u009e\u0001\u009e\u0001\u009e\u0001\u009e"+
		"\u0001\u009e\u0001\u009e\u0001\u009e\u0001\u009e\u0001\u009e\u0001\u009e"+
		"\u0001\u009e\u0001\u009e\u0001\u009e\u0001\u009e\u0001\u009e\u0003\u009e"+
		"\u0dbb\b\u009e\u0001\u009e\u0001\u009e\u0003\u009e\u0dbf\b\u009e\u0001"+
		"\u009e\u0001\u009e\u0001\u009e\u0001\u009e\u0003\u009e\u0dc5\b\u009e\u0001"+
		"\u009e\u0001\u009e\u0001\u009e\u0001\u009e\u0003\u009e\u0dcb\b\u009e\u0001"+
		"\u009e\u0001\u009e\u0001\u009e\u0001\u009e\u0001\u009e\u0005\u009e\u0dd2"+
		"\b\u009e\n\u009e\f\u009e\u0dd5\t\u009e\u0001\u009e\u0003\u009e\u0dd8\b"+
		"\u009e\u0003\u009e\u0dda\b\u009e\u0001\u009f\u0001\u009f\u0001\u009f\u0005"+
		"\u009f\u0ddf\b\u009f\n\u009f\f\u009f\u0de2\t\u009f\u0001\u00a0\u0001\u00a0"+
		"\u0001\u00a0\u0005\u00a0\u0de7\b\u00a0\n\u00a0\f\u00a0\u0dea\t\u00a0\u0001"+
		"\u00a1\u0001\u00a1\u0001\u00a1\u0001\u00a1\u0001\u00a1\u0003\u00a1\u0df1"+
		"\b\u00a1\u0001\u00a2\u0001\u00a2\u0001\u00a2\u0001\u00a3\u0001\u00a3\u0001"+
		"\u00a3\u0001\u00a4\u0001\u00a4\u0001\u00a4\u0005\u00a4\u0dfc\b\u00a4\n"+
		"\u00a4\f\u00a4\u0dff\t\u00a4\u0001\u00a5\u0001\u00a5\u0001\u00a5\u0001"+
		"\u00a5\u0003\u00a5\u0e05\b\u00a5\u0001\u00a5\u0003\u00a5\u0e08\b\u00a5"+
		"\u0001\u00a6\u0001\u00a6\u0001\u00a6\u0005\u00a6\u0e0d\b\u00a6\n\u00a6"+
		"\f\u00a6\u0e10\t\u00a6\u0001\u00a7\u0001\u00a7\u0001\u00a7\u0005\u00a7"+
		"\u0e15\b\u00a7\n\u00a7\f\u00a7\u0e18\t\u00a7\u0001\u00a8\u0001\u00a8\u0001"+
		"\u00a8\u0001\u00a8\u0001\u00a8\u0003\u00a8\u0e1f\b\u00a8\u0001\u00a9\u0001"+
		"\u00a9\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0001"+
		"\u00aa\u0001\u00aa\u0001\u00aa\u0005\u00aa\u0e2b\b\u00aa\n\u00aa\f\u00aa"+
		"\u0e2e\t\u00aa\u0001\u00ab\u0001\u00ab\u0003\u00ab\u0e32\b\u00ab\u0001"+
		"\u00ab\u0001\u00ab\u0001\u00ab\u0003\u00ab\u0e37\b\u00ab\u0001\u00ab\u0003"+
		"\u00ab\u0e3a\b\u00ab\u0001\u00ac\u0001\u00ac\u0001\u00ac\u0001\u00ac\u0001"+
		"\u00ac\u0001\u00ad\u0001\u00ad\u0001\u00ad\u0001\u00ad\u0005\u00ad\u0e45"+
		"\b\u00ad\n\u00ad\f\u00ad\u0e48\t\u00ad\u0001\u00ae\u0001\u00ae\u0001\u00ae"+
		"\u0001\u00ae\u0001\u00af\u0001\u00af\u0001\u00af\u0001\u00af\u0001\u00af"+
		"\u0001\u00af\u0001\u00af\u0001\u00af\u0001\u00af\u0001\u00af\u0001\u00af"+
		"\u0005\u00af\u0e59\b\u00af\n\u00af\f\u00af\u0e5c\t\u00af\u0001\u00af\u0001"+
		"\u00af\u0001\u00af\u0001\u00af\u0001\u00af\u0005\u00af\u0e63\b\u00af\n"+
		"\u00af\f\u00af\u0e66\t\u00af\u0003\u00af\u0e68\b\u00af\u0001\u00af\u0001"+
		"\u00af\u0001\u00af\u0001\u00af\u0001\u00af\u0005\u00af\u0e6f\b\u00af\n"+
		"\u00af\f\u00af\u0e72\t\u00af\u0003\u00af\u0e74\b\u00af\u0003\u00af\u0e76"+
		"\b\u00af\u0001\u00af\u0003\u00af\u0e79\b\u00af\u0001\u00af\u0003\u00af"+
		"\u0e7c\b\u00af\u0001\u00b0\u0001\u00b0\u0001\u00b0\u0001\u00b0\u0001\u00b0"+
		"\u0001\u00b0\u0001\u00b0\u0001\u00b0\u0001\u00b0\u0001\u00b0\u0001\u00b0"+
		"\u0001\u00b0\u0001\u00b0\u0001\u00b0\u0001\u00b0\u0001\u00b0\u0003\u00b0"+
		"\u0e8e\b\u00b0\u0001\u00b1\u0001\u00b1\u0001\u00b1\u0001\u00b1\u0001\u00b1"+
		"\u0001\u00b1\u0001\u00b1\u0003\u00b1\u0e97\b\u00b1\u0001\u00b2\u0001\u00b2"+
		"\u0001\u00b2\u0005\u00b2\u0e9c\b\u00b2\n\u00b2\f\u00b2\u0e9f\t\u00b2\u0001"+
		"\u00b3\u0001\u00b3\u0001\u00b3\u0001\u00b3\u0001\u00b3\u0001\u00b3\u0001"+
		"\u00b3\u0001\u00b3\u0001\u00b3\u0001\u00b3\u0003\u00b3\u0eab\b\u00b3\u0001"+
		"\u00b4\u0001\u00b4\u0001\u00b4\u0005\u00b4\u0eb0\b\u00b4\n\u00b4\f\u00b4"+
		"\u0eb3\t\u00b4\u0001\u00b5\u0001\u00b5\u0001\u00b5\u0001\u00b6\u0001\u00b6"+
		"\u0004\u00b6\u0eba\b\u00b6\u000b\u00b6\f\u00b6\u0ebb\u0001\u00b6\u0003"+
		"\u00b6\u0ebf\b\u00b6\u0001\u00b7\u0001\u00b7\u0001\u00b7\u0003\u00b7\u0ec4"+
		"\b\u00b7\u0001\u00b8\u0001\u00b8\u0001\u00b8\u0001\u00b8\u0001\u00b8\u0001"+
		"\u00b8\u0003\u00b8\u0ecc\b\u00b8\u0001\u00b9\u0001\u00b9\u0001\u00b9\u0003"+
		"\u00b9\u0ed1\b\u00b9\u0001\u00ba\u0001\u00ba\u0001\u00bb\u0001\u00bb\u0003"+
		"\u00bb\u0ed7\b\u00bb\u0001\u00bb\u0001\u00bb\u0001\u00bb\u0003\u00bb\u0edc"+
		"\b\u00bb\u0001\u00bb\u0001\u00bb\u0001\u00bb\u0003\u00bb\u0ee1\b\u00bb"+
		"\u0001\u00bb\u0001\u00bb\u0003\u00bb\u0ee5\b\u00bb\u0001\u00bb\u0001\u00bb"+
		"\u0003\u00bb\u0ee9\b\u00bb\u0001\u00bb\u0001\u00bb\u0003\u00bb\u0eed\b"+
		"\u00bb\u0001\u00bb\u0001\u00bb\u0003\u00bb\u0ef1\b\u00bb\u0001\u00bb\u0001"+
		"\u00bb\u0003\u00bb\u0ef5\b\u00bb\u0001\u00bb\u0001\u00bb\u0003\u00bb\u0ef9"+
		"\b\u00bb\u0001\u00bb\u0001\u00bb\u0003\u00bb\u0efd\b\u00bb\u0001\u00bb"+
		"\u0003\u00bb\u0f00\b\u00bb\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0001\u00bc"+
		"\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0001\u00bc"+
		"\u0001\u00bc\u0003\u00bc\u0f0d\b\u00bc\u0001\u00bd\u0001\u00bd\u0001\u00bd"+
		"\u0003\u00bd\u0f12\b\u00bd\u0001\u00be\u0001\u00be\u0003\u00be\u0f16\b"+
		"\u00be\u0001\u00bf\u0001\u00bf\u0003\u00bf\u0f1a\b\u00bf\u0001\u00c0\u0001"+
		"\u00c0\u0001\u00c1\u0001\u00c1\u0001\u00c2\u0001\u00c2\u0001\u00c2\t\u0428"+
		"\u046b\u0473\u0484\u049f\u04a8\u04b1\u04ba\u04e6\u0004j\u0112\u0116\u011a"+
		"\u00c3\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110"+
		"\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128"+
		"\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140"+
		"\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158"+
		"\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170"+
		"\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0000;\u0002"+
		"\u0000NN\u00e0\u00e0\u0002\u0000\"\"\u00f2\u00f2\u0002\u0000yy\u008b\u008b"+
		"\u0001\u000012\u0002\u0000\u011d\u011d\u014c\u014c\u0002\u0000\u000b\u000b"+
		"\'\'\u0005\u0000..::jjxx\u00ab\u00ab\u0001\u0000VW\u0002\u0000jjxx\u0003"+
		"\u0000\b\b__\u011a\u011a\u0002\u0000\b\b\u00a5\u00a5\u0001\u0000\u0148"+
		"\u0149\u0003\u0000HH\u00bb\u00bb\u00fe\u00fe\u0003\u0000II\u00bc\u00bc"+
		"\u00ff\u00ff\u0004\u0000dd\u0093\u0093\u0107\u0107\u013c\u013c\u0003\u0000"+
		"dd\u0107\u0107\u013c\u013c\u0002\u0000\u0015\u0015VV\u0002\u0000rr\u009c"+
		"\u009c\u0002\u0000\u011c\u011c\u014b\u014b\u0002\u0000\u011b\u011b\u0127"+
		"\u0127\u0002\u0000==\u00f9\u00f9\u0002\u0000ff\u008c\u008c\u0002\u0000"+
		"\n\n[[\u0002\u0000\u0177\u0177\u0179\u0179\u0002\u0000\\\\\u00d4\u00d4"+
		"\u0002\u0000\u00cc\u00cc\u010f\u010f\u0001\u0000\u00a1\u00a2\u0003\u0000"+
		"\n\n\u0010\u0010\u010e\u010e\u0003\u0000mm\u0135\u0135\u013e\u013e\u0002"+
		"\u0000\u0161\u0162\u0166\u0166\u0002\u0000]]\u0163\u0165\u0002\u0000\u0161"+
		"\u0162\u0169\u0169\u000b\u0000CCEE\u0084\u0084\u00b1\u00b1\u00b3\u00b3"+
		"\u00b5\u00b5\u00b7\u00b7\u00e2\u00e2\u00fc\u00fc\u014f\u014f\u0156\u0156"+
		"\u0004\u0000??AB\u0105\u0105\u0144\u0144\u0002\u0000JK\u012a\u012a\u0003"+
		"\u0000LM\u0126\u0126\u012b\u012b\u0002\u0000$$\u0137\u0137\u0002\u0000"+
		"\u0088\u0088\u00f1\u00f1\u0001\u0000\u0118\u0119\u0002\u0000\u0004\u0004"+
		"yy\u0002\u0000\u0004\u0004uu\u0003\u0000\u001c\u001c\u009f\u009f\u0130"+
		"\u0130\u0001\u0000\u0159\u0160\u0002\u0000]]\u0161\u016a\u0004\u0000\u000e"+
		"\u000e\u008b\u008b\u00c1\u00c1\u00cb\u00cb\u0002\u0000mm\u0135\u0135\u0001"+
		"\u0000\u0161\u0162\u0007\u0000CD\u0084\u0085\u00b1\u00b8\u00bd\u00be\u00fc"+
		"\u00fd\u014f\u0150\u0156\u0157\u0006\u0000CC\u0084\u0084\u00b5\u00b5\u00b7"+
		"\u00b7\u00fc\u00fc\u0156\u0156\u0002\u0000\u00b7\u00b7\u0156\u0156\u0004"+
		"\u0000CC\u0084\u0084\u00b5\u00b5\u00fc\u00fc\u0003\u0000\u0084\u0084\u00b5"+
		"\u00b5\u00fc\u00fc\u0002\u0000RR\u0159\u0159\u0002\u0000tt\u00dd\u00dd"+
		"\u0001\u0000\u0178\u0179\u0002\u0000__\u0106\u01063\u0000\b\t\u000b\r"+
		"\u000f\u000f\u0011\u0013\u0015\u0016\u0018\u001b\u001d\"%)+.0028::=>C"+
		"Z\\_ccelooqtwx{~\u0081\u0081\u0083\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0099\u0099\u009b\u009c\u009e\u009e\u00a1\u00be\u00c0\u00c0\u00c3"+
		"\u00c5\u00c9\u00ca\u00cd\u00cd\u00cf\u00d0\u00d2\u00d6\u00d9\u00dd\u00df"+
		"\u00e9\u00eb\u00f3\u00f5\u00ff\u0101\u0104\u0106\u010d\u010f\u011c\u011e"+
		"\u0123\u0126\u012c\u012f\u012f\u0131\u013b\u013f\u0143\u0146\u0150\u0153"+
		"\u0153\u0156\u0158\u0010\u0000\u000f\u000f<<ddzz\u008f\u008f\u0093\u0093"+
		"\u009a\u009a\u009d\u009d\u00a0\u00a0\u00bf\u00bf\u00c7\u00c7\u00f4\u00f4"+
		"\u0101\u0101\u0107\u0107\u013c\u013c\u0145\u0145\u0011\u0000\b\u000e\u0010"+
		";=cey{\u008e\u0090\u0092\u0094\u0099\u009b\u009c\u009e\u009f\u00a1\u00be"+
		"\u00c0\u00c6\u00c8\u00f3\u00f5\u0100\u0102\u0106\u0108\u013b\u013d\u0144"+
		"\u0146\u0158\u116c\u0000\u0186\u0001\u0000\u0000\u0000\u0002\u018f\u0001"+
		"\u0000\u0000\u0000\u0004\u0192\u0001\u0000\u0000\u0000\u0006\u0195\u0001"+
		"\u0000\u0000\u0000\b\u0198\u0001\u0000\u0000\u0000\n\u019b\u0001\u0000"+
		"\u0000\u0000\f\u019e\u0001\u0000\u0000\u0000\u000e\u04e9\u0001\u0000\u0000"+
		"\u0000\u0010\u04eb\u0001\u0000\u0000\u0000\u0012\u04fc\u0001\u0000\u0000"+
		"\u0000\u0014\u0500\u0001\u0000\u0000\u0000\u0016\u0504\u0001\u0000\u0000"+
		"\u0000\u0018\u050a\u0001\u0000\u0000\u0000\u001a\u0514\u0001\u0000\u0000"+
		"\u0000\u001c\u0516\u0001\u0000\u0000\u0000\u001e\u0518\u0001\u0000\u0000"+
		"\u0000 \u05c2\u0001\u0000\u0000\u0000\"\u05c4\u0001\u0000\u0000\u0000"+
		"$\u05d5\u0001\u0000\u0000\u0000&\u05db\u0001\u0000\u0000\u0000(\u05e1"+
		"\u0001\u0000\u0000\u0000*\u05ed\u0001\u0000\u0000\u0000,\u05fa\u0001\u0000"+
		"\u0000\u0000.\u05fd\u0001\u0000\u0000\u00000\u0601\u0001\u0000\u0000\u0000"+
		"2\u0650\u0001\u0000\u0000\u00004\u0652\u0001\u0000\u0000\u00006\u0656"+
		"\u0001\u0000\u0000\u00008\u066b\u0001\u0000\u0000\u0000:\u066d\u0001\u0000"+
		"\u0000\u0000<\u066f\u0001\u0000\u0000\u0000>\u0676\u0001\u0000\u0000\u0000"+
		"@\u0678\u0001\u0000\u0000\u0000B\u0680\u0001\u0000\u0000\u0000D\u0689"+
		"\u0001\u0000\u0000\u0000F\u0694\u0001\u0000\u0000\u0000H\u06a7\u0001\u0000"+
		"\u0000\u0000J\u06aa\u0001\u0000\u0000\u0000L\u06b5\u0001\u0000\u0000\u0000"+
		"N\u06c5\u0001\u0000\u0000\u0000P\u06cb\u0001\u0000\u0000\u0000R\u06cd"+
		"\u0001\u0000\u0000\u0000T\u06d8\u0001\u0000\u0000\u0000V\u06df\u0001\u0000"+
		"\u0000\u0000X\u06ea\u0001\u0000\u0000\u0000Z\u06fb\u0001\u0000\u0000\u0000"+
		"\\\u0703\u0001\u0000\u0000\u0000^\u0705\u0001\u0000\u0000\u0000`\u070b"+
		"\u0001\u0000\u0000\u0000b\u0746\u0001\u0000\u0000\u0000d\u074e\u0001\u0000"+
		"\u0000\u0000f\u075a\u0001\u0000\u0000\u0000h\u078e\u0001\u0000\u0000\u0000"+
		"j\u0791\u0001\u0000\u0000\u0000l\u07b7\u0001\u0000\u0000\u0000n\u07b9"+
		"\u0001\u0000\u0000\u0000p\u07c1\u0001\u0000\u0000\u0000r\u07e2\u0001\u0000"+
		"\u0000\u0000t\u0810\u0001\u0000\u0000\u0000v\u0825\u0001\u0000\u0000\u0000"+
		"x\u0845\u0001\u0000\u0000\u0000z\u0851\u0001\u0000\u0000\u0000|\u0854"+
		"\u0001\u0000\u0000\u0000~\u085d\u0001\u0000\u0000\u0000\u0080\u086b\u0001"+
		"\u0000\u0000\u0000\u0082\u087e\u0001\u0000\u0000\u0000\u0084\u0892\u0001"+
		"\u0000\u0000\u0000\u0086\u0898\u0001\u0000\u0000\u0000\u0088\u089a\u0001"+
		"\u0000\u0000\u0000\u008a\u089f\u0001\u0000\u0000\u0000\u008c\u08a7\u0001"+
		"\u0000\u0000\u0000\u008e\u08ab\u0001\u0000\u0000\u0000\u0090\u08ae\u0001"+
		"\u0000\u0000\u0000\u0092\u08b1\u0001\u0000\u0000\u0000\u0094\u08cb\u0001"+
		"\u0000\u0000\u0000\u0096\u08cd\u0001\u0000\u0000\u0000\u0098\u08f0\u0001"+
		"\u0000\u0000\u0000\u009a\u0919\u0001\u0000\u0000\u0000\u009c\u091d\u0001"+
		"\u0000\u0000\u0000\u009e\u0938\u0001\u0000\u0000\u0000\u00a0\u093c\u0001"+
		"\u0000\u0000\u0000\u00a2\u094b\u0001\u0000\u0000\u0000\u00a4\u094d\u0001"+
		"\u0000\u0000\u0000\u00a6\u096b\u0001\u0000\u0000\u0000\u00a8\u096d\u0001"+
		"\u0000\u0000\u0000\u00aa\u0974\u0001\u0000\u0000\u0000\u00ac\u0981\u0001"+
		"\u0000\u0000\u0000\u00ae\u0986\u0001\u0000\u0000\u0000\u00b0\u0988\u0001"+
		"\u0000\u0000\u0000\u00b2\u0997\u0001\u0000\u0000\u0000\u00b4\u09af\u0001"+
		"\u0000\u0000\u0000\u00b6\u09bc\u0001\u0000\u0000\u0000\u00b8\u09be\u0001"+
		"\u0000\u0000\u0000\u00ba\u09c0\u0001\u0000\u0000\u0000\u00bc\u09c4\u0001"+
		"\u0000\u0000\u0000\u00be\u09c7\u0001\u0000\u0000\u0000\u00c0\u09cb\u0001"+
		"\u0000\u0000\u0000\u00c2\u09eb\u0001\u0000\u0000\u0000\u00c4\u09ee\u0001"+
		"\u0000\u0000\u0000\u00c6\u09fa\u0001\u0000\u0000\u0000\u00c8\u0a0d\u0001"+
		"\u0000\u0000\u0000\u00ca\u0a27\u0001\u0000\u0000\u0000\u00cc\u0a2d\u0001"+
		"\u0000\u0000\u0000\u00ce\u0a2f\u0001\u0000\u0000\u0000\u00d0\u0a53\u0001"+
		"\u0000\u0000\u0000\u00d2\u0a55\u0001\u0000\u0000\u0000\u00d4\u0a59\u0001"+
		"\u0000\u0000\u0000\u00d6\u0a61\u0001\u0000\u0000\u0000\u00d8\u0a6c\u0001"+
		"\u0000\u0000\u0000\u00da\u0a70\u0001\u0000\u0000\u0000\u00dc\u0a7b\u0001"+
		"\u0000\u0000\u0000\u00de\u0a9a\u0001\u0000\u0000\u0000\u00e0\u0a9c\u0001"+
		"\u0000\u0000\u0000\u00e2\u0aba\u0001\u0000\u0000\u0000\u00e4\u0acf\u0001"+
		"\u0000\u0000\u0000\u00e6\u0ae3\u0001\u0000\u0000\u0000\u00e8\u0ae9\u0001"+
		"\u0000\u0000\u0000\u00ea\u0aed\u0001\u0000\u0000\u0000\u00ec\u0aef\u0001"+
		"\u0000\u0000\u0000\u00ee\u0b05\u0001\u0000\u0000\u0000\u00f0\u0b38\u0001"+
		"\u0000\u0000\u0000\u00f2\u0b3a\u0001\u0000\u0000\u0000\u00f4\u0b42\u0001"+
		"\u0000\u0000\u0000\u00f6\u0b4a\u0001\u0000\u0000\u0000\u00f8\u0b52\u0001"+
		"\u0000\u0000\u0000\u00fa\u0b5a\u0001\u0000\u0000\u0000\u00fc\u0b61\u0001"+
		"\u0000\u0000\u0000\u00fe\u0b65\u0001\u0000\u0000\u0000\u0100\u0b6f\u0001"+
		"\u0000\u0000\u0000\u0102\u0b77\u0001\u0000\u0000\u0000\u0104\u0b84\u0001"+
		"\u0000\u0000\u0000\u0106\u0b93\u0001\u0000\u0000\u0000\u0108\u0b97\u0001"+
		"\u0000\u0000\u0000\u010a\u0b99\u0001\u0000\u0000\u0000\u010c\u0b9b\u0001"+
		"\u0000\u0000\u0000\u010e\u0ba1\u0001\u0000\u0000\u0000\u0110\u0ba3\u0001"+
		"\u0000\u0000\u0000\u0112\u0bb7\u0001\u0000\u0000\u0000\u0114\u0c16\u0001"+
		"\u0000\u0000\u0000\u0116\u0c1c\u0001\u0000\u0000\u0000\u0118\u0c36\u0001"+
		"\u0000\u0000\u0000\u011a\u0d2b\u0001\u0000\u0000\u0000\u011c\u0d44\u0001"+
		"\u0000\u0000\u0000\u011e\u0d55\u0001\u0000\u0000\u0000\u0120\u0d57\u0001"+
		"\u0000\u0000\u0000\u0122\u0d59\u0001\u0000\u0000\u0000\u0124\u0d5b\u0001"+
		"\u0000\u0000\u0000\u0126\u0d5d\u0001\u0000\u0000\u0000\u0128\u0d5f\u0001"+
		"\u0000\u0000\u0000\u012a\u0d64\u0001\u0000\u0000\u0000\u012c\u0d6b\u0001"+
		"\u0000\u0000\u0000\u012e\u0d6f\u0001\u0000\u0000\u0000\u0130\u0d74\u0001"+
		"\u0000\u0000\u0000\u0132\u0d7a\u0001\u0000\u0000\u0000\u0134\u0d81\u0001"+
		"\u0000\u0000\u0000\u0136\u0d83\u0001\u0000\u0000\u0000\u0138\u0d88\u0001"+
		"\u0000\u0000\u0000\u013a\u0da9\u0001\u0000\u0000\u0000\u013c\u0dd9\u0001"+
		"\u0000\u0000\u0000\u013e\u0ddb\u0001\u0000\u0000\u0000\u0140\u0de3\u0001"+
		"\u0000\u0000\u0000\u0142\u0df0\u0001\u0000\u0000\u0000\u0144\u0df2\u0001"+
		"\u0000\u0000\u0000\u0146\u0df5\u0001\u0000\u0000\u0000\u0148\u0df8\u0001"+
		"\u0000\u0000\u0000\u014a\u0e00\u0001\u0000\u0000\u0000\u014c\u0e09\u0001"+
		"\u0000\u0000\u0000\u014e\u0e11\u0001\u0000\u0000\u0000\u0150\u0e1e\u0001"+
		"\u0000\u0000\u0000\u0152\u0e20\u0001\u0000\u0000\u0000\u0154\u0e27\u0001"+
		"\u0000\u0000\u0000\u0156\u0e2f\u0001\u0000\u0000\u0000\u0158\u0e3b\u0001"+
		"\u0000\u0000\u0000\u015a\u0e40\u0001\u0000\u0000\u0000\u015c\u0e49\u0001"+
		"\u0000\u0000\u0000\u015e\u0e7b\u0001\u0000\u0000\u0000\u0160\u0e8d\u0001"+
		"\u0000\u0000\u0000\u0162\u0e96\u0001\u0000\u0000\u0000\u0164\u0e98\u0001"+
		"\u0000\u0000\u0000\u0166\u0eaa\u0001\u0000\u0000\u0000\u0168\u0eac\u0001"+
		"\u0000\u0000\u0000\u016a\u0eb4\u0001\u0000\u0000\u0000\u016c\u0ebe\u0001"+
		"\u0000\u0000\u0000\u016e\u0ec3\u0001\u0000\u0000\u0000\u0170\u0ecb\u0001"+
		"\u0000\u0000\u0000\u0172\u0ed0\u0001\u0000\u0000\u0000\u0174\u0ed2\u0001"+
		"\u0000\u0000\u0000\u0176\u0eff\u0001\u0000\u0000\u0000\u0178\u0f0c\u0001"+
		"\u0000\u0000\u0000\u017a\u0f11\u0001\u0000\u0000\u0000\u017c\u0f15\u0001"+
		"\u0000\u0000\u0000\u017e\u0f19\u0001\u0000\u0000\u0000\u0180\u0f1b\u0001"+
		"\u0000\u0000\u0000\u0182\u0f1d\u0001\u0000\u0000\u0000\u0184\u0f1f\u0001"+
		"\u0000\u0000\u0000\u0186\u018a\u0003\u000e\u0007\u0000\u0187\u0189\u0005"+
		"\u0001\u0000\u0000\u0188\u0187\u0001\u0000\u0000\u0000\u0189\u018c\u0001"+
		"\u0000\u0000\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018a\u018b\u0001"+
		"\u0000\u0000\u0000\u018b\u018d\u0001\u0000\u0000\u0000\u018c\u018a\u0001"+
		"\u0000\u0000\u0000\u018d\u018e\u0005\u0000\u0000\u0001\u018e\u0001\u0001"+
		"\u0000\u0000\u0000\u018f\u0190\u0003\u00fe\u007f\u0000\u0190\u0191\u0005"+
		"\u0000\u0000\u0001\u0191\u0003\u0001\u0000\u0000\u0000\u0192\u0193\u0003"+
		"\u00fa}\u0000\u0193\u0194\u0005\u0000\u0000\u0001\u0194\u0005\u0001\u0000"+
		"\u0000\u0000\u0195\u0196\u0003\u00f4z\u0000\u0196\u0197\u0005\u0000\u0000"+
		"\u0001\u0197\u0007\u0001\u0000\u0000\u0000\u0198\u0199\u0003\u00fc~\u0000"+
		"\u0199\u019a\u0005\u0000\u0000\u0001\u019a\t\u0001\u0000\u0000\u0000\u019b"+
		"\u019c\u0003\u013c\u009e\u0000\u019c\u019d\u0005\u0000\u0000\u0001\u019d"+
		"\u000b\u0001\u0000\u0000\u0000\u019e\u019f\u0003\u0148\u00a4\u0000\u019f"+
		"\u01a0\u0005\u0000\u0000\u0001\u01a0\r\u0001\u0000\u0000\u0000\u01a1\u04ea"+
		"\u00030\u0018\u0000\u01a2\u04ea\u0003\u0010\b\u0000\u01a3\u01a5\u0003"+
		"B!\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u04ea\u0003b1\u0000\u01a7"+
		"\u01a8\u0005\u0143\u0000\u0000\u01a8\u04ea\u0003d2\u0000\u01a9\u01aa\u0005"+
		"\u0143\u0000\u0000\u01aa\u01ab\u0003:\u001d\u0000\u01ab\u01ac\u0003d2"+
		"\u0000\u01ac\u04ea\u0001\u0000\u0000\u0000\u01ad\u01ae\u0005\u0106\u0000"+
		"\u0000\u01ae\u01b1\u0005%\u0000\u0000\u01af\u01b2\u0003\u016e\u00b7\u0000"+
		"\u01b0\u01b2\u0003\u017a\u00bd\u0000\u01b1\u01af\u0001\u0000\u0000\u0000"+
		"\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b2\u04ea\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b4\u0005;\u0000\u0000\u01b4\u01b8\u0003:\u001d\u0000\u01b5\u01b6"+
		"\u0005\u0087\u0000\u0000\u01b6\u01b7\u0005\u00c1\u0000\u0000\u01b7\u01b9"+
		"\u0005g\u0000\u0000\u01b8\u01b5\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001"+
		"\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01c2\u0003"+
		"d2\u0000\u01bb\u01c1\u0003.\u0017\u0000\u01bc\u01c1\u0003,\u0016\u0000"+
		"\u01bd\u01be\u0005\u0154\u0000\u0000\u01be\u01bf\u0007\u0000\u0000\u0000"+
		"\u01bf\u01c1\u0003J%\u0000\u01c0\u01bb\u0001\u0000\u0000\u0000\u01c0\u01bc"+
		"\u0001\u0000\u0000\u0000\u01c0\u01bd\u0001\u0000\u0000\u0000\u01c1\u01c4"+
		"\u0001\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c3"+
		"\u0001\u0000\u0000\u0000\u01c3\u04ea\u0001\u0000\u0000\u0000\u01c4\u01c2"+
		"\u0001\u0000\u0000\u0000\u01c5\u01c6\u0005\u000b\u0000\u0000\u01c6\u01c7"+
		"\u0003:\u001d\u0000\u01c7\u01c8\u0003d2\u0000\u01c8\u01c9\u0005\u0106"+
		"\u0000\u0000\u01c9\u01ca\u0007\u0000\u0000\u0000\u01ca\u01cb\u0003J%\u0000"+
		"\u01cb\u04ea\u0001\u0000\u0000\u0000\u01cc\u01cd\u0005\u000b\u0000\u0000"+
		"\u01cd\u01ce\u0003:\u001d\u0000\u01ce\u01cf\u0003d2\u0000\u01cf\u01d0"+
		"\u0005\u0106\u0000\u0000\u01d0\u01d1\u0003,\u0016\u0000\u01d1\u04ea\u0001"+
		"\u0000\u0000\u0000\u01d2\u01d3\u0005_\u0000\u0000\u01d3\u01d6\u0003:\u001d"+
		"\u0000\u01d4\u01d5\u0005\u0087\u0000\u0000\u01d5\u01d7\u0005g\u0000\u0000"+
		"\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000"+
		"\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01da\u0003d2\u0000\u01d9\u01db"+
		"\u0007\u0001\u0000\u0000\u01da\u01d9\u0001\u0000\u0000\u0000\u01da\u01db"+
		"\u0001\u0000\u0000\u0000\u01db\u04ea\u0001\u0000\u0000\u0000\u01dc\u01dd"+
		"\u0005\u010a\u0000\u0000\u01dd\u01e0\u0003<\u001e\u0000\u01de\u01df\u0007"+
		"\u0002\u0000\u0000\u01df\u01e1\u0003\u00f4z\u0000\u01e0\u01de\u0001\u0000"+
		"\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e6\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e4\u0005\u00a1\u0000\u0000\u01e3\u01e2\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000"+
		"\u0000\u0000\u01e5\u01e7\u0003\u017a\u00bd\u0000\u01e6\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7\u04ea\u0001\u0000"+
		"\u0000\u0000\u01e8\u01ed\u0003\"\u0011\u0000\u01e9\u01ea\u0005\u0002\u0000"+
		"\u0000\u01ea\u01eb\u0003\u014c\u00a6\u0000\u01eb\u01ec\u0005\u0003\u0000"+
		"\u0000\u01ec\u01ee\u0001\u0000\u0000\u0000\u01ed\u01e9\u0001\u0000\u0000"+
		"\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee\u01f0\u0001\u0000\u0000"+
		"\u0000\u01ef\u01f1\u0003F#\u0000\u01f0\u01ef\u0001\u0000\u0000\u0000\u01f0"+
		"\u01f1\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2"+
		"\u01f7\u0003H$\u0000\u01f3\u01f5\u0005\u0014\u0000\u0000\u01f4\u01f3\u0001"+
		"\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001"+
		"\u0000\u0000\u0000\u01f6\u01f8\u00030\u0018\u0000\u01f7\u01f4\u0001\u0000"+
		"\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u04ea\u0001\u0000"+
		"\u0000\u0000\u01f9\u01fa\u0005;\u0000\u0000\u01fa\u01fe\u0005\u011d\u0000"+
		"\u0000\u01fb\u01fc\u0005\u0087\u0000\u0000\u01fc\u01fd\u0005\u00c1\u0000"+
		"\u0000\u01fd\u01ff\u0005g\u0000\u0000\u01fe\u01fb\u0001\u0000\u0000\u0000"+
		"\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000"+
		"\u0200\u0201\u0003\u00fa}\u0000\u0201\u0202\u0005\u00a1\u0000\u0000\u0202"+
		"\u020b\u0003\u00fa}\u0000\u0203\u020a\u0003F#\u0000\u0204\u020a\u0003"+
		"\u00f0x\u0000\u0205\u020a\u0003Z-\u0000\u0206\u020a\u0003,\u0016\u0000"+
		"\u0207\u0208\u0005\u0121\u0000\u0000\u0208\u020a\u0003J%\u0000\u0209\u0203"+
		"\u0001\u0000\u0000\u0000\u0209\u0204\u0001\u0000\u0000\u0000\u0209\u0205"+
		"\u0001\u0000\u0000\u0000\u0209\u0206\u0001\u0000\u0000\u0000\u0209\u0207"+
		"\u0001\u0000\u0000\u0000\u020a\u020d\u0001\u0000\u0000\u0000\u020b\u0209"+
		"\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020c\u04ea"+
		"\u0001\u0000\u0000\u0000\u020d\u020b\u0001\u0000\u0000\u0000\u020e\u0213"+
		"\u0003$\u0012\u0000\u020f\u0210\u0005\u0002\u0000\u0000\u0210\u0211\u0003"+
		"\u014c\u00a6\u0000\u0211\u0212\u0005\u0003\u0000\u0000\u0212\u0214\u0001"+
		"\u0000\u0000\u0000\u0213\u020f\u0001\u0000\u0000\u0000\u0213\u0214\u0001"+
		"\u0000\u0000\u0000\u0214\u0216\u0001\u0000\u0000\u0000\u0215\u0217\u0003"+
		"F#\u0000\u0216\u0215\u0001\u0000\u0000\u0000\u0216\u0217\u0001\u0000\u0000"+
		"\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u021d\u0003H$\u0000\u0219"+
		"\u021b\u0005\u0014\u0000\u0000\u021a\u0219\u0001\u0000\u0000\u0000\u021a"+
		"\u021b\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c"+
		"\u021e\u00030\u0018\u0000\u021d\u021a\u0001\u0000\u0000\u0000\u021d\u021e"+
		"\u0001\u0000\u0000\u0000\u021e\u04ea\u0001\u0000\u0000\u0000\u021f\u0220"+
		"\u0005\r\u0000\u0000\u0220\u0221\u0005\u011d\u0000\u0000\u0221\u0223\u0003"+
		"d2\u0000\u0222\u0224\u00036\u001b\u0000\u0223\u0222\u0001\u0000\u0000"+
		"\u0000\u0223\u0224\u0001\u0000\u0000\u0000\u0224\u0225\u0001\u0000\u0000"+
		"\u0000\u0225\u0226\u00057\u0000\u0000\u0226\u022e\u0005\u0113\u0000\u0000"+
		"\u0227\u022f\u0003\u016e\u00b7\u0000\u0228\u0229\u0005u\u0000\u0000\u0229"+
		"\u022a\u00052\u0000\u0000\u022a\u022f\u0003\u00d4j\u0000\u022b\u022c\u0005"+
		"u\u0000\u0000\u022c\u022d\u0005\n\u0000\u0000\u022d\u022f\u00052\u0000"+
		"\u0000\u022e\u0227\u0001\u0000\u0000\u0000\u022e\u0228\u0001\u0000\u0000"+
		"\u0000\u022e\u022b\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000"+
		"\u0000\u022f\u04ea\u0001\u0000\u0000\u0000\u0230\u0231\u0005\r\u0000\u0000"+
		"\u0231\u0234\u0005\u011e\u0000\u0000\u0232\u0233\u0007\u0002\u0000\u0000"+
		"\u0233\u0235\u0003d2\u0000\u0234\u0232\u0001\u0000\u0000\u0000\u0234\u0235"+
		"\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236\u0237"+
		"\u00057\u0000\u0000\u0237\u0239\u0005\u0113\u0000\u0000\u0238\u023a\u0003"+
		"\u016e\u00b7\u0000\u0239\u0238\u0001\u0000\u0000\u0000\u0239\u023a\u0001"+
		"\u0000\u0000\u0000\u023a\u04ea\u0001\u0000\u0000\u0000\u023b\u023c\u0005"+
		"\u000b\u0000\u0000\u023c\u023d\u0005\u011d\u0000\u0000\u023d\u023e\u0003"+
		"d2\u0000\u023e\u023f\u0005\b\u0000\u0000\u023f\u0240\u0007\u0003\u0000"+
		"\u0000\u0240\u0241\u0003\u013e\u009f\u0000\u0241\u04ea\u0001\u0000\u0000"+
		"\u0000\u0242\u0243\u0005\u000b\u0000\u0000\u0243\u0244\u0005\u011d\u0000"+
		"\u0000\u0244\u0245\u0003d2\u0000\u0245\u0246\u0005\b\u0000\u0000\u0246"+
		"\u0247\u0007\u0003\u0000\u0000\u0247\u0248\u0005\u0002\u0000\u0000\u0248"+
		"\u0249\u0003\u013e\u009f\u0000\u0249\u024a\u0005\u0003\u0000\u0000\u024a"+
		"\u04ea\u0001\u0000\u0000\u0000\u024b\u024c\u0005\u000b\u0000\u0000\u024c"+
		"\u024d\u0005\u011d\u0000\u0000\u024d\u024e\u0003d2\u0000\u024e\u024f\u0005"+
		"\u00ec\u0000\u0000\u024f\u0250\u00051\u0000\u0000\u0250\u0251\u0003\u00f4"+
		"z\u0000\u0251\u0252\u0005\u012d\u0000\u0000\u0252\u0253\u0003\u016a\u00b5"+
		"\u0000\u0253\u04ea\u0001\u0000\u0000\u0000\u0254\u0255\u0005\u000b\u0000"+
		"\u0000\u0255\u0256\u0005\u011d\u0000\u0000\u0256\u0257\u0003d2\u0000\u0257"+
		"\u0258\u0005_\u0000\u0000\u0258\u025b\u0007\u0003\u0000\u0000\u0259\u025a"+
		"\u0005\u0087\u0000\u0000\u025a\u025c\u0005g\u0000\u0000\u025b\u0259\u0001"+
		"\u0000\u0000\u0000\u025b\u025c\u0001\u0000\u0000\u0000\u025c\u025d\u0001"+
		"\u0000\u0000\u0000\u025d\u025e\u0005\u0002\u0000\u0000\u025e\u025f\u0003"+
		"\u00f2y\u0000\u025f\u0260\u0005\u0003\u0000\u0000\u0260\u04ea\u0001\u0000"+
		"\u0000\u0000\u0261\u0262\u0005\u000b\u0000\u0000\u0262\u0263\u0005\u011d"+
		"\u0000\u0000\u0263\u0264\u0003d2\u0000\u0264\u0265\u0005_\u0000\u0000"+
		"\u0265\u0268\u0007\u0003\u0000\u0000\u0266\u0267\u0005\u0087\u0000\u0000"+
		"\u0267\u0269\u0005g\u0000\u0000\u0268\u0266\u0001\u0000\u0000\u0000\u0268"+
		"\u0269\u0001\u0000\u0000\u0000\u0269\u026a\u0001\u0000\u0000\u0000\u026a"+
		"\u026b\u0003\u00f2y\u0000\u026b\u04ea\u0001\u0000\u0000\u0000\u026c\u026d"+
		"\u0005\u000b\u0000\u0000\u026d\u026e\u0007\u0004\u0000\u0000\u026e\u026f"+
		"\u0003d2\u0000\u026f\u0270\u0005\u00ec\u0000\u0000\u0270\u0271\u0005\u012d"+
		"\u0000\u0000\u0271\u0272\u0003\u00f4z\u0000\u0272\u04ea\u0001\u0000\u0000"+
		"\u0000\u0273\u0274\u0005\u000b\u0000\u0000\u0274\u0275\u0007\u0004\u0000"+
		"\u0000\u0275\u0276\u0003d2\u0000\u0276\u0277\u0005\u0106\u0000\u0000\u0277"+
		"\u0278\u0005\u0121\u0000\u0000\u0278\u0279\u0003J%\u0000\u0279\u04ea\u0001"+
		"\u0000\u0000\u0000\u027a\u027b\u0005\u000b\u0000\u0000\u027b\u027c\u0007"+
		"\u0004\u0000\u0000\u027c\u027d\u0003d2\u0000\u027d\u027e\u0005\u0141\u0000"+
		"\u0000\u027e\u0281\u0005\u0121\u0000\u0000\u027f\u0280\u0005\u0087\u0000"+
		"\u0000\u0280\u0282\u0005g\u0000\u0000\u0281\u027f\u0001\u0000\u0000\u0000"+
		"\u0281\u0282\u0001\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000\u0000"+
		"\u0283\u0284\u0003J%\u0000\u0284\u04ea\u0001\u0000\u0000\u0000\u0285\u0286"+
		"\u0005\u000b\u0000\u0000\u0286\u0287\u0005\u011d\u0000\u0000\u0287\u0288"+
		"\u0003d2\u0000\u0288\u028a\u0007\u0005\u0000\u0000\u0289\u028b\u00051"+
		"\u0000\u0000\u028a\u0289\u0001\u0000\u0000\u0000\u028a\u028b\u0001\u0000"+
		"\u0000\u0000\u028b\u028c\u0001\u0000\u0000\u0000\u028c\u028e\u0003\u00f4"+
		"z\u0000\u028d\u028f\u0003\u0178\u00bc\u0000\u028e\u028d\u0001\u0000\u0000"+
		"\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f\u04ea\u0001\u0000\u0000"+
		"\u0000\u0290\u0291\u0005\u000b\u0000\u0000\u0291\u0292\u0005\u011d\u0000"+
		"\u0000\u0292\u0294\u0003d2\u0000\u0293\u0295\u00036\u001b\u0000\u0294"+
		"\u0293\u0001\u0000\u0000\u0000\u0294\u0295\u0001\u0000\u0000\u0000\u0295"+
		"\u0296\u0001\u0000\u0000\u0000\u0296\u0298\u0005\'\u0000\u0000\u0297\u0299"+
		"\u00051\u0000\u0000\u0298\u0297\u0001\u0000\u0000\u0000\u0298\u0299\u0001"+
		"\u0000\u0000\u0000\u0299\u029a\u0001\u0000\u0000\u0000\u029a\u029b\u0003"+
		"\u00f4z\u0000\u029b\u029d\u0003\u014a\u00a5\u0000\u029c\u029e\u0003\u0138"+
		"\u009c\u0000\u029d\u029c\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000"+
		"\u0000\u0000\u029e\u04ea\u0001\u0000\u0000\u0000\u029f\u02a0\u0005\u000b"+
		"\u0000\u0000\u02a0\u02a1\u0005\u011d\u0000\u0000\u02a1\u02a3\u0003d2\u0000"+
		"\u02a2\u02a4\u00036\u001b\u0000\u02a3\u02a2\u0001\u0000\u0000\u0000\u02a3"+
		"\u02a4\u0001\u0000\u0000\u0000\u02a4\u02a5\u0001\u0000\u0000\u0000\u02a5"+
		"\u02a6\u0005\u00ef\u0000\u0000\u02a6\u02a7\u00052\u0000\u0000\u02a7\u02a8"+
		"\u0005\u0002\u0000\u0000\u02a8\u02a9\u0003\u013e\u009f\u0000\u02a9\u02aa"+
		"\u0005\u0003\u0000\u0000\u02aa\u04ea\u0001\u0000\u0000\u0000\u02ab\u02ac"+
		"\u0005\u000b\u0000\u0000\u02ac\u02ad\u0005\u011d\u0000\u0000\u02ad\u02af"+
		"\u0003d2\u0000\u02ae\u02b0\u00036\u001b\u0000\u02af\u02ae\u0001\u0000"+
		"\u0000\u0000\u02af\u02b0\u0001\u0000\u0000\u0000\u02b0\u02b1\u0001\u0000"+
		"\u0000\u0000\u02b1\u02b2\u0005\u0106\u0000\u0000\u02b2\u02b3\u0005\u0103"+
		"\u0000\u0000\u02b3\u02b7\u0003\u017a\u00bd\u0000\u02b4\u02b5\u0005\u0154"+
		"\u0000\u0000\u02b5\u02b6\u0005\u0104\u0000\u0000\u02b6\u02b8\u0003J%\u0000"+
		"\u02b7\u02b4\u0001\u0000\u0000\u0000\u02b7\u02b8\u0001\u0000\u0000\u0000"+
		"\u02b8\u04ea\u0001\u0000\u0000\u0000\u02b9\u02ba\u0005\u000b\u0000\u0000"+
		"\u02ba\u02bb\u0005\u011d\u0000\u0000\u02bb\u02bd\u0003d2\u0000\u02bc\u02be"+
		"\u00036\u001b\u0000\u02bd\u02bc\u0001\u0000\u0000\u0000\u02bd\u02be\u0001"+
		"\u0000\u0000\u0000\u02be\u02bf\u0001\u0000\u0000\u0000\u02bf\u02c0\u0005"+
		"\u0106\u0000\u0000\u02c0\u02c1\u0005\u0104\u0000\u0000\u02c1\u02c2\u0003"+
		"J%\u0000\u02c2\u04ea\u0001\u0000\u0000\u0000\u02c3\u02c4\u0005\u000b\u0000"+
		"\u0000\u02c4\u02c5\u0007\u0004\u0000\u0000\u02c5\u02c6\u0003d2\u0000\u02c6"+
		"\u02ca\u0005\b\u0000\u0000\u02c7\u02c8\u0005\u0087\u0000\u0000\u02c8\u02c9"+
		"\u0005\u00c1\u0000\u0000\u02c9\u02cb\u0005g\u0000\u0000\u02ca\u02c7\u0001"+
		"\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000\u0000\u0000\u02cb\u02cd\u0001"+
		"\u0000\u0000\u0000\u02cc\u02ce\u00034\u001a\u0000\u02cd\u02cc\u0001\u0000"+
		"\u0000\u0000\u02ce\u02cf\u0001\u0000\u0000\u0000\u02cf\u02cd\u0001\u0000"+
		"\u0000\u0000\u02cf\u02d0\u0001\u0000\u0000\u0000\u02d0\u04ea\u0001\u0000"+
		"\u0000\u0000\u02d1\u02d2\u0005\u000b\u0000\u0000\u02d2\u02d3\u0005\u011d"+
		"\u0000\u0000\u02d3\u02d4\u0003d2\u0000\u02d4\u02d5\u00036\u001b\u0000"+
		"\u02d5\u02d6\u0005\u00ec\u0000\u0000\u02d6\u02d7\u0005\u012d\u0000\u0000"+
		"\u02d7\u02d8\u00036\u001b\u0000\u02d8\u04ea\u0001\u0000\u0000\u0000\u02d9"+
		"\u02da\u0005\u000b\u0000\u0000\u02da\u02db\u0007\u0004\u0000\u0000\u02db"+
		"\u02dc\u0003d2\u0000\u02dc\u02df\u0005_\u0000\u0000\u02dd\u02de\u0005"+
		"\u0087\u0000\u0000\u02de\u02e0\u0005g\u0000\u0000\u02df\u02dd\u0001\u0000"+
		"\u0000\u0000\u02df\u02e0\u0001\u0000\u0000\u0000\u02e0\u02e1\u0001\u0000"+
		"\u0000\u0000\u02e1\u02e6\u00036\u001b\u0000\u02e2\u02e3\u0005\u0004\u0000"+
		"\u0000\u02e3\u02e5\u00036\u001b\u0000\u02e4\u02e2\u0001\u0000\u0000\u0000"+
		"\u02e5\u02e8\u0001\u0000\u0000\u0000\u02e6\u02e4\u0001\u0000\u0000\u0000"+
		"\u02e6\u02e7\u0001\u0000\u0000\u0000\u02e7\u02ea\u0001\u0000\u0000\u0000"+
		"\u02e8\u02e6\u0001\u0000\u0000\u0000\u02e9\u02eb\u0005\u00e1\u0000\u0000"+
		"\u02ea\u02e9\u0001\u0000\u0000\u0000\u02ea\u02eb\u0001\u0000\u0000\u0000"+
		"\u02eb\u04ea\u0001\u0000\u0000\u0000\u02ec\u02ed\u0005\u000b\u0000\u0000"+
		"\u02ed\u02ee\u0005\u011d\u0000\u0000\u02ee\u02f0\u0003d2\u0000\u02ef\u02f1"+
		"\u00036\u001b\u0000\u02f0\u02ef\u0001\u0000\u0000\u0000\u02f0\u02f1\u0001"+
		"\u0000\u0000\u0000\u02f1\u02f2\u0001\u0000\u0000\u0000\u02f2\u02f3\u0005"+
		"\u0106\u0000\u0000\u02f3\u02f4\u0003,\u0016\u0000\u02f4\u04ea\u0001\u0000"+
		"\u0000\u0000\u02f5\u02f6\u0005\u000b\u0000\u0000\u02f6\u02f7\u0005\u011d"+
		"\u0000\u0000\u02f7\u02f8\u0003d2\u0000\u02f8\u02f9\u0005\u00e8\u0000\u0000"+
		"\u02f9\u02fa\u0005\u00d6\u0000\u0000\u02fa\u04ea\u0001\u0000\u0000\u0000"+
		"\u02fb\u02fc\u0005_\u0000\u0000\u02fc\u02ff\u0005\u011d\u0000\u0000\u02fd"+
		"\u02fe\u0005\u0087\u0000\u0000\u02fe\u0300\u0005g\u0000\u0000\u02ff\u02fd"+
		"\u0001\u0000\u0000\u0000\u02ff\u0300\u0001\u0000\u0000\u0000\u0300\u0301"+
		"\u0001\u0000\u0000\u0000\u0301\u0303\u0003d2\u0000\u0302\u0304\u0005\u00e1"+
		"\u0000\u0000\u0303\u0302\u0001\u0000\u0000\u0000\u0303\u0304\u0001\u0000"+
		"\u0000\u0000\u0304\u04ea\u0001\u0000\u0000\u0000\u0305\u0306\u0005_\u0000"+
		"\u0000\u0306\u0309\u0005\u014c\u0000\u0000\u0307\u0308\u0005\u0087\u0000"+
		"\u0000\u0308\u030a\u0005g\u0000\u0000\u0309\u0307\u0001\u0000\u0000\u0000"+
		"\u0309\u030a\u0001\u0000\u0000\u0000\u030a\u030b\u0001\u0000\u0000\u0000"+
		"\u030b\u04ea\u0003d2\u0000\u030c\u030f\u0005;\u0000\u0000\u030d\u030e"+
		"\u0005\u00cb\u0000\u0000\u030e\u0310\u0005\u00ef\u0000\u0000\u030f\u030d"+
		"\u0001\u0000\u0000\u0000\u030f\u0310\u0001\u0000\u0000\u0000\u0310\u0315"+
		"\u0001\u0000\u0000\u0000\u0311\u0313\u0005~\u0000\u0000\u0312\u0311\u0001"+
		"\u0000\u0000\u0000\u0312\u0313\u0001\u0000\u0000\u0000\u0313\u0314\u0001"+
		"\u0000\u0000\u0000\u0314\u0316\u0005\u0122\u0000\u0000\u0315\u0312\u0001"+
		"\u0000\u0000\u0000\u0315\u0316\u0001\u0000\u0000\u0000\u0316\u0317\u0001"+
		"\u0000\u0000\u0000\u0317\u031b\u0005\u014c\u0000\u0000\u0318\u0319\u0005"+
		"\u0087\u0000\u0000\u0319\u031a\u0005\u00c1\u0000\u0000\u031a\u031c\u0005"+
		"g\u0000\u0000\u031b\u0318\u0001\u0000\u0000\u0000\u031b\u031c\u0001\u0000"+
		"\u0000\u0000\u031c\u031d\u0001\u0000\u0000\u0000\u031d\u031f\u0003d2\u0000"+
		"\u031e\u0320\u0003\u00dam\u0000\u031f\u031e\u0001\u0000\u0000\u0000\u031f"+
		"\u0320\u0001\u0000\u0000\u0000\u0320\u0329\u0001\u0000\u0000\u0000\u0321"+
		"\u0328\u0003.\u0017\u0000\u0322\u0323\u0005\u00d5\u0000\u0000\u0323\u0324"+
		"\u0005\u00c7\u0000\u0000\u0324\u0328\u0003\u00d2i\u0000\u0325\u0326\u0005"+
		"\u0121\u0000\u0000\u0326\u0328\u0003J%\u0000\u0327\u0321\u0001\u0000\u0000"+
		"\u0000\u0327\u0322\u0001\u0000\u0000\u0000\u0327\u0325\u0001\u0000\u0000"+
		"\u0000\u0328\u032b\u0001\u0000\u0000\u0000\u0329\u0327\u0001\u0000\u0000"+
		"\u0000\u0329\u032a\u0001\u0000\u0000\u0000\u032a\u032c\u0001\u0000\u0000"+
		"\u0000\u032b\u0329\u0001\u0000\u0000\u0000\u032c\u032d\u0005\u0014\u0000"+
		"\u0000\u032d\u032e\u00030\u0018\u0000\u032e\u04ea\u0001\u0000\u0000\u0000"+
		"\u032f\u0332\u0005;\u0000\u0000\u0330\u0331\u0005\u00cb\u0000\u0000\u0331"+
		"\u0333\u0005\u00ef\u0000\u0000\u0332\u0330\u0001\u0000\u0000\u0000\u0332"+
		"\u0333\u0001\u0000\u0000\u0000\u0333\u0335\u0001\u0000\u0000\u0000\u0334"+
		"\u0336\u0005~\u0000\u0000\u0335\u0334\u0001\u0000\u0000\u0000\u0335\u0336"+
		"\u0001\u0000\u0000\u0000\u0336\u0337\u0001\u0000\u0000\u0000\u0337\u0338"+
		"\u0005\u0122\u0000\u0000\u0338\u0339\u0005\u014c\u0000\u0000\u0339\u033e"+
		"\u0003\u00fa}\u0000\u033a\u033b\u0005\u0002\u0000\u0000\u033b\u033c\u0003"+
		"\u0148\u00a4\u0000\u033c\u033d\u0005\u0003\u0000\u0000\u033d\u033f\u0001"+
		"\u0000\u0000\u0000\u033e\u033a\u0001\u0000\u0000\u0000\u033e\u033f\u0001"+
		"\u0000\u0000\u0000\u033f\u0340\u0001\u0000\u0000\u0000\u0340\u0343\u0003"+
		"F#\u0000\u0341\u0342\u0005\u00ca\u0000\u0000\u0342\u0344\u0003J%\u0000"+
		"\u0343\u0341\u0001\u0000\u0000\u0000\u0343\u0344\u0001\u0000\u0000\u0000"+
		"\u0344\u04ea\u0001\u0000\u0000\u0000\u0345\u0346\u0005\u000b\u0000\u0000"+
		"\u0346\u0347\u0005\u014c\u0000\u0000\u0347\u0349\u0003d2\u0000\u0348\u034a"+
		"\u0005\u0014\u0000\u0000\u0349\u0348\u0001\u0000\u0000\u0000\u0349\u034a"+
		"\u0001\u0000\u0000\u0000\u034a\u034b\u0001\u0000\u0000\u0000\u034b\u034c"+
		"\u00030\u0018\u0000\u034c\u04ea\u0001\u0000\u0000\u0000\u034d\u0350\u0005"+
		";\u0000\u0000\u034e\u034f\u0005\u00cb\u0000\u0000\u034f\u0351\u0005\u00ef"+
		"\u0000\u0000\u0350\u034e\u0001\u0000\u0000\u0000\u0350\u0351\u0001\u0000"+
		"\u0000\u0000\u0351\u0353\u0001\u0000\u0000\u0000\u0352\u0354\u0005\u0122"+
		"\u0000\u0000\u0353\u0352\u0001\u0000\u0000\u0000\u0353\u0354\u0001\u0000"+
		"\u0000\u0000\u0354\u0355\u0001\u0000\u0000\u0000\u0355\u0359\u0005{\u0000"+
		"\u0000\u0356\u0357\u0005\u0087\u0000\u0000\u0357\u0358\u0005\u00c1\u0000"+
		"\u0000\u0358\u035a\u0005g\u0000\u0000\u0359\u0356\u0001\u0000\u0000\u0000"+
		"\u0359\u035a\u0001\u0000\u0000\u0000\u035a\u035b\u0001\u0000\u0000\u0000"+
		"\u035b\u035c\u0003d2\u0000\u035c\u035d\u0005\u0014\u0000\u0000\u035d\u0367"+
		"\u0003\u017a\u00bd\u0000\u035e\u035f\u0005\u0145\u0000\u0000\u035f\u0364"+
		"\u0003`0\u0000\u0360\u0361\u0005\u0004\u0000\u0000\u0361\u0363\u0003`"+
		"0\u0000\u0362\u0360\u0001\u0000\u0000\u0000\u0363\u0366\u0001\u0000\u0000"+
		"\u0000\u0364\u0362\u0001\u0000\u0000\u0000\u0364\u0365\u0001\u0000\u0000"+
		"\u0000\u0365\u0368\u0001\u0000\u0000\u0000\u0366\u0364\u0001\u0000\u0000"+
		"\u0000\u0367\u035e\u0001\u0000\u0000\u0000\u0367\u0368\u0001\u0000\u0000"+
		"\u0000\u0368\u04ea\u0001\u0000\u0000\u0000\u0369\u036b\u0005_\u0000\u0000"+
		"\u036a\u036c\u0005\u0122\u0000\u0000\u036b\u036a\u0001\u0000\u0000\u0000"+
		"\u036b\u036c\u0001\u0000\u0000\u0000\u036c\u036d\u0001\u0000\u0000\u0000"+
		"\u036d\u0370\u0005{\u0000\u0000\u036e\u036f\u0005\u0087\u0000\u0000\u036f"+
		"\u0371\u0005g\u0000\u0000\u0370\u036e\u0001\u0000\u0000\u0000\u0370\u0371"+
		"\u0001\u0000\u0000\u0000\u0371\u0372\u0001\u0000\u0000\u0000\u0372\u04ea"+
		"\u0003d2\u0000\u0373\u0376\u0005Q\u0000\u0000\u0374\u0375\u0005\u00cb"+
		"\u0000\u0000\u0375\u0377\u0005\u00ef\u0000\u0000\u0376\u0374\u0001\u0000"+
		"\u0000\u0000\u0376\u0377\u0001\u0000\u0000\u0000\u0377\u0379\u0001\u0000"+
		"\u0000\u0000\u0378\u037a\u0005\u0149\u0000\u0000\u0379\u0378\u0001\u0000"+
		"\u0000\u0000\u0379\u037a\u0001\u0000\u0000\u0000\u037a\u037b\u0001\u0000"+
		"\u0000\u0000\u037b\u037d\u0003d2\u0000\u037c\u037e\u0003\u013c\u009e\u0000"+
		"\u037d\u037c\u0001\u0000\u0000\u0000\u037d\u037e\u0001\u0000\u0000\u0000"+
		"\u037e\u0380\u0001\u0000\u0000\u0000\u037f\u0381\u0003\u0146\u00a3\u0000"+
		"\u0380\u037f\u0001\u0000\u0000\u0000\u0380\u0381\u0001\u0000\u0000\u0000"+
		"\u0381\u04ea\u0001\u0000\u0000\u0000\u0382\u0383\u0005_\u0000\u0000\u0383"+
		"\u0384\u0005\u0122\u0000\u0000\u0384\u0387\u0005\u0149\u0000\u0000\u0385"+
		"\u0386\u0005\u0087\u0000\u0000\u0386\u0388\u0005g\u0000\u0000\u0387\u0385"+
		"\u0001\u0000\u0000\u0000\u0387\u0388\u0001\u0000\u0000\u0000\u0388\u0389"+
		"\u0001\u0000\u0000\u0000\u0389\u04ea\u0003d2\u0000\u038a\u038c\u0005h"+
		"\u0000\u0000\u038b\u038d\u0007\u0006\u0000\u0000\u038c\u038b\u0001\u0000"+
		"\u0000\u0000\u038c\u038d\u0001\u0000\u0000\u0000\u038d\u038e\u0001\u0000"+
		"\u0000\u0000\u038e\u04ea\u0003\u000e\u0007\u0000\u038f\u0390\u0005\u010a"+
		"\u0000\u0000\u0390\u0393\u0005\u011e\u0000\u0000\u0391\u0392\u0007\u0002"+
		"\u0000\u0000\u0392\u0394\u0003d2\u0000\u0393\u0391\u0001\u0000\u0000\u0000"+
		"\u0393\u0394\u0001\u0000\u0000\u0000\u0394\u0399\u0001\u0000\u0000\u0000"+
		"\u0395\u0397\u0005\u00a1\u0000\u0000\u0396\u0395\u0001\u0000\u0000\u0000"+
		"\u0396\u0397\u0001\u0000\u0000\u0000\u0397\u0398\u0001\u0000\u0000\u0000"+
		"\u0398\u039a\u0003\u017a\u00bd\u0000\u0399\u0396\u0001\u0000\u0000\u0000"+
		"\u0399\u039a\u0001\u0000\u0000\u0000\u039a\u04ea\u0001\u0000\u0000\u0000"+
		"\u039b\u039c\u0005\u010a\u0000\u0000\u039c\u039d\u0005\u011d\u0000\u0000"+
		"\u039d\u03a0\u0005j\u0000\u0000\u039e\u039f\u0007\u0002\u0000\u0000\u039f"+
		"\u03a1\u0003d2\u0000\u03a0\u039e\u0001\u0000\u0000\u0000\u03a0\u03a1\u0001"+
		"\u0000\u0000\u0000\u03a1\u03a2\u0001\u0000\u0000\u0000\u03a2\u03a3\u0005"+
		"\u00a1\u0000\u0000\u03a3\u03a5\u0003\u017a\u00bd\u0000\u03a4\u03a6\u0003"+
		"6\u001b\u0000\u03a5\u03a4\u0001\u0000\u0000\u0000\u03a5\u03a6\u0001\u0000"+
		"\u0000\u0000\u03a6\u04ea\u0001\u0000\u0000\u0000\u03a7\u03a8\u0005\u010a"+
		"\u0000\u0000\u03a8\u03a9\u0005\u0121\u0000\u0000\u03a9\u03ae\u0003d2\u0000"+
		"\u03aa\u03ab\u0005\u0002\u0000\u0000\u03ab\u03ac\u0003N\'\u0000\u03ac"+
		"\u03ad\u0005\u0003\u0000\u0000\u03ad\u03af\u0001\u0000\u0000\u0000\u03ae"+
		"\u03aa\u0001\u0000\u0000\u0000\u03ae\u03af\u0001\u0000\u0000\u0000\u03af"+
		"\u04ea\u0001\u0000\u0000\u0000\u03b0\u03b1\u0005\u010a\u0000\u0000\u03b1"+
		"\u03b2\u00052\u0000\u0000\u03b2\u03b3\u0007\u0002\u0000\u0000\u03b3\u03b6"+
		"\u0003d2\u0000\u03b4\u03b5\u0007\u0002\u0000\u0000\u03b5\u03b7\u0003\u00f4"+
		"z\u0000\u03b6\u03b4\u0001\u0000\u0000\u0000\u03b6\u03b7\u0001\u0000\u0000"+
		"\u0000\u03b7\u04ea\u0001\u0000\u0000\u0000\u03b8\u03b9\u0005\u010a\u0000"+
		"\u0000\u03b9\u03bc\u0005\u014d\u0000\u0000\u03ba\u03bb\u0007\u0002\u0000"+
		"\u0000\u03bb\u03bd\u0003d2\u0000\u03bc\u03ba\u0001\u0000\u0000\u0000\u03bc"+
		"\u03bd\u0001\u0000\u0000\u0000\u03bd\u03c2\u0001\u0000\u0000\u0000\u03be"+
		"\u03c0\u0005\u00a1\u0000\u0000\u03bf\u03be\u0001\u0000\u0000\u0000\u03bf"+
		"\u03c0\u0001\u0000\u0000\u0000\u03c0\u03c1\u0001\u0000\u0000\u0000\u03c1"+
		"\u03c3\u0003\u017a\u00bd\u0000\u03c2\u03bf\u0001\u0000\u0000\u0000\u03c2"+
		"\u03c3\u0001\u0000\u0000\u0000\u03c3\u04ea\u0001\u0000\u0000\u0000\u03c4"+
		"\u03c5\u0005\u010a\u0000\u0000\u03c5\u03c6\u0005\u00d6\u0000\u0000\u03c6"+
		"\u03c8\u0003d2\u0000\u03c7\u03c9\u00036\u001b\u0000\u03c8\u03c7\u0001"+
		"\u0000\u0000\u0000\u03c8\u03c9\u0001\u0000\u0000\u0000\u03c9\u04ea\u0001"+
		"\u0000\u0000\u0000\u03ca\u03cc\u0005\u010a\u0000\u0000\u03cb\u03cd\u0003"+
		"\u016e\u00b7\u0000\u03cc\u03cb\u0001\u0000\u0000\u0000\u03cc\u03cd\u0001"+
		"\u0000\u0000\u0000\u03cd\u03ce\u0001\u0000\u0000\u0000\u03ce\u03d1\u0005"+
		"|\u0000\u0000\u03cf\u03d0\u0007\u0002\u0000\u0000\u03d0\u03d2\u0003d2"+
		"\u0000\u03d1\u03cf\u0001\u0000\u0000\u0000\u03d1\u03d2\u0001\u0000\u0000"+
		"\u0000\u03d2\u03da\u0001\u0000\u0000\u0000\u03d3\u03d5\u0005\u00a1\u0000"+
		"\u0000\u03d4\u03d3\u0001\u0000\u0000\u0000\u03d4\u03d5\u0001\u0000\u0000"+
		"\u0000\u03d5\u03d8\u0001\u0000\u0000\u0000\u03d6\u03d9\u0003\u00f4z\u0000"+
		"\u03d7\u03d9\u0003\u017a\u00bd\u0000\u03d8\u03d6\u0001\u0000\u0000\u0000"+
		"\u03d8\u03d7\u0001\u0000\u0000\u0000\u03d9\u03db\u0001\u0000\u0000\u0000"+
		"\u03da\u03d4\u0001\u0000\u0000\u0000\u03da\u03db\u0001\u0000\u0000\u0000"+
		"\u03db\u04ea\u0001\u0000\u0000\u0000\u03dc\u03dd\u0005\u010a\u0000\u0000"+
		"\u03dd\u03de\u0005;\u0000\u0000\u03de\u03df\u0005\u011d\u0000\u0000\u03df"+
		"\u03e2\u0003d2\u0000\u03e0\u03e1\u0005\u0014\u0000\u0000\u03e1\u03e3\u0005"+
		"\u0103\u0000\u0000\u03e2\u03e0\u0001\u0000\u0000\u0000\u03e2\u03e3\u0001"+
		"\u0000\u0000\u0000\u03e3\u04ea\u0001\u0000\u0000\u0000\u03e4\u03e5\u0005"+
		"\u010a\u0000\u0000\u03e5\u03e6\u0005>\u0000\u0000\u03e6\u04ea\u0003:\u001d"+
		"\u0000\u03e7\u03e8\u0005\u010a\u0000\u0000\u03e8\u03ed\u0005&\u0000\u0000"+
		"\u03e9\u03eb\u0005\u00a1\u0000\u0000\u03ea\u03e9\u0001\u0000\u0000\u0000"+
		"\u03ea\u03eb\u0001\u0000\u0000\u0000\u03eb\u03ec\u0001\u0000\u0000\u0000"+
		"\u03ec\u03ee\u0003\u017a\u00bd\u0000\u03ed\u03ea\u0001\u0000\u0000\u0000"+
		"\u03ed\u03ee\u0001\u0000\u0000\u0000\u03ee\u04ea\u0001\u0000\u0000\u0000"+
		"\u03ef\u03f0\u0007\u0007\u0000\u0000\u03f0\u03f2\u0005{\u0000\u0000\u03f1"+
		"\u03f3\u0005j\u0000\u0000\u03f2\u03f1\u0001\u0000\u0000\u0000\u03f2\u03f3"+
		"\u0001\u0000\u0000\u0000\u03f3\u03f4\u0001\u0000\u0000\u0000\u03f4\u04ea"+
		"\u0003>\u001f\u0000\u03f5\u03f6\u0007\u0007\u0000\u0000\u03f6\u03f8\u0003"+
		":\u001d\u0000\u03f7\u03f9\u0005j\u0000\u0000\u03f8\u03f7\u0001\u0000\u0000"+
		"\u0000\u03f8\u03f9\u0001\u0000\u0000\u0000\u03f9\u03fa\u0001\u0000\u0000"+
		"\u0000\u03fa\u03fb\u0003d2\u0000\u03fb\u04ea\u0001\u0000\u0000\u0000\u03fc"+
		"\u03fe\u0007\u0007\u0000\u0000\u03fd\u03ff\u0005\u011d\u0000\u0000\u03fe"+
		"\u03fd\u0001\u0000\u0000\u0000\u03fe\u03ff\u0001\u0000\u0000\u0000\u03ff"+
		"\u0401\u0001\u0000\u0000\u0000\u0400\u0402\u0007\b\u0000\u0000\u0401\u0400"+
		"\u0001\u0000\u0000\u0000\u0401\u0402\u0001\u0000\u0000\u0000\u0402\u0403"+
		"\u0001\u0000\u0000\u0000\u0403\u0405\u0003d2\u0000\u0404\u0406\u00036"+
		"\u001b\u0000\u0405\u0404\u0001\u0000\u0000\u0000\u0405\u0406\u0001\u0000"+
		"\u0000\u0000\u0406\u0408\u0001\u0000\u0000\u0000\u0407\u0409\u0003@ \u0000"+
		"\u0408\u0407\u0001\u0000\u0000\u0000\u0408\u0409\u0001\u0000\u0000\u0000"+
		"\u0409\u04ea\u0001\u0000\u0000\u0000\u040a\u040c\u0007\u0007\u0000\u0000"+
		"\u040b\u040d\u0005\u00e3\u0000\u0000\u040c\u040b\u0001\u0000\u0000\u0000"+
		"\u040c\u040d\u0001\u0000\u0000\u0000\u040d\u040e\u0001\u0000\u0000\u0000"+
		"\u040e\u04ea\u00030\u0018\u0000\u040f\u0410\u00053\u0000\u0000\u0410\u0411"+
		"\u0005\u00c7\u0000\u0000\u0411\u0412\u0003:\u001d\u0000\u0412\u0413\u0003"+
		"d2\u0000\u0413\u0414\u0005\u0098\u0000\u0000\u0414\u0415\u0003\u017c\u00be"+
		"\u0000\u0415\u04ea\u0001\u0000\u0000\u0000\u0416\u0417\u00053\u0000\u0000"+
		"\u0417\u0418\u0005\u00c7\u0000\u0000\u0418\u0419\u0005\u011d\u0000\u0000"+
		"\u0419\u041a\u0003d2\u0000\u041a\u041b\u0005\u0098\u0000\u0000\u041b\u041c"+
		"\u0003\u017c\u00be\u0000\u041c\u04ea\u0001\u0000\u0000\u0000\u041d\u041e"+
		"\u0005\u00eb\u0000\u0000\u041e\u041f\u0005\u011d\u0000\u0000\u041f\u04ea"+
		"\u0003d2\u0000\u0420\u0421\u0005\u00eb\u0000\u0000\u0421\u0422\u0005{"+
		"\u0000\u0000\u0422\u04ea\u0003d2\u0000\u0423\u042b\u0005\u00eb\u0000\u0000"+
		"\u0424\u042c\u0003\u017a\u00bd\u0000\u0425\u0427\t\u0000\u0000\u0000\u0426"+
		"\u0425\u0001\u0000\u0000\u0000\u0427\u042a\u0001\u0000\u0000\u0000\u0428"+
		"\u0429\u0001\u0000\u0000\u0000\u0428\u0426\u0001\u0000\u0000\u0000\u0429"+
		"\u042c\u0001\u0000\u0000\u0000\u042a\u0428\u0001\u0000\u0000\u0000\u042b"+
		"\u0424\u0001\u0000\u0000\u0000\u042b\u0428\u0001\u0000\u0000\u0000\u042c"+
		"\u04ea\u0001\u0000\u0000\u0000\u042d\u042f\u0005!\u0000\u0000\u042e\u0430"+
		"\u0005\u009e\u0000\u0000\u042f\u042e\u0001\u0000\u0000\u0000\u042f\u0430"+
		"\u0001\u0000\u0000\u0000\u0430\u0431\u0001\u0000\u0000\u0000\u0431\u0432"+
		"\u0005\u011d\u0000\u0000\u0432\u0435\u0003d2\u0000\u0433\u0434\u0005\u00ca"+
		"\u0000\u0000\u0434\u0436\u0003J%\u0000\u0435\u0433\u0001\u0000\u0000\u0000"+
		"\u0435\u0436\u0001\u0000\u0000\u0000\u0436\u043b\u0001\u0000\u0000\u0000"+
		"\u0437\u0439\u0005\u0014\u0000\u0000\u0438\u0437\u0001\u0000\u0000\u0000"+
		"\u0438\u0439\u0001\u0000\u0000\u0000\u0439\u043a\u0001\u0000\u0000\u0000"+
		"\u043a\u043c\u00030\u0018\u0000\u043b\u0438\u0001\u0000\u0000\u0000\u043b"+
		"\u043c\u0001\u0000\u0000\u0000\u043c\u04ea\u0001\u0000\u0000\u0000\u043d"+
		"\u043e\u0005\u013b\u0000\u0000\u043e\u0441\u0005\u011d\u0000\u0000\u043f"+
		"\u0440\u0005\u0087\u0000\u0000\u0440\u0442\u0005g\u0000\u0000\u0441\u043f"+
		"\u0001\u0000\u0000\u0000\u0441\u0442\u0001\u0000\u0000\u0000\u0442\u0443"+
		"\u0001\u0000\u0000\u0000\u0443\u04ea\u0003d2\u0000\u0444\u0445\u0005+"+
		"\u0000\u0000\u0445\u04ea\u0005!\u0000\u0000\u0446\u0447\u0005\u00a6\u0000"+
		"\u0000\u0447\u0449\u0005F\u0000\u0000\u0448\u044a\u0005\u00a7\u0000\u0000"+
		"\u0449\u0448\u0001\u0000\u0000\u0000\u0449\u044a\u0001\u0000\u0000\u0000"+
		"\u044a\u044b\u0001\u0000\u0000\u0000\u044b\u044c\u0005\u0090\u0000\u0000"+
		"\u044c\u044e\u0003\u017a\u00bd\u0000\u044d\u044f\u0005\u00d3\u0000\u0000"+
		"\u044e\u044d\u0001\u0000\u0000\u0000\u044e\u044f\u0001\u0000\u0000\u0000"+
		"\u044f\u0450\u0001\u0000\u0000\u0000\u0450\u0451\u0005\u0097\u0000\u0000"+
		"\u0451\u0452\u0005\u011d\u0000\u0000\u0452\u0454\u0003d2\u0000\u0453\u0455"+
		"\u00036\u001b\u0000\u0454\u0453\u0001\u0000\u0000\u0000\u0454\u0455\u0001"+
		"\u0000\u0000\u0000\u0455\u04ea\u0001\u0000\u0000\u0000\u0456\u0457\u0005"+
		"\u0136\u0000\u0000\u0457\u0458\u0005\u011d\u0000\u0000\u0458\u045a\u0003"+
		"d2\u0000\u0459\u045b\u00036\u001b\u0000\u045a\u0459\u0001\u0000\u0000"+
		"\u0000\u045a\u045b\u0001\u0000\u0000\u0000\u045b\u04ea\u0001\u0000\u0000"+
		"\u0000\u045c\u045e\u0005\u00b9\u0000\u0000\u045d\u045c\u0001\u0000\u0000"+
		"\u0000\u045d\u045e\u0001\u0000\u0000\u0000\u045e\u045f\u0001\u0000\u0000"+
		"\u0000\u045f\u0460\u0005\u00ed\u0000\u0000\u0460\u0461\u0005\u011d\u0000"+
		"\u0000\u0461\u0464\u0003d2\u0000\u0462\u0463\u0007\t\u0000\u0000\u0463"+
		"\u0465\u0005\u00d6\u0000\u0000\u0464\u0462\u0001\u0000\u0000\u0000\u0464"+
		"\u0465\u0001\u0000\u0000\u0000\u0465\u04ea\u0001\u0000\u0000\u0000\u0466"+
		"\u0467\u0007\n\u0000\u0000\u0467\u046b\u0003\u016e\u00b7\u0000\u0468\u046a"+
		"\t\u0000\u0000\u0000\u0469\u0468\u0001\u0000\u0000\u0000\u046a\u046d\u0001"+
		"\u0000\u0000\u0000\u046b\u046c\u0001\u0000\u0000\u0000\u046b\u0469\u0001"+
		"\u0000\u0000\u0000\u046c\u04ea\u0001\u0000\u0000\u0000\u046d\u046b\u0001"+
		"\u0000\u0000\u0000\u046e\u046f\u0005\u0106\u0000\u0000\u046f\u0473\u0005"+
		"\u00f6\u0000\u0000\u0470\u0472\t\u0000\u0000\u0000\u0471\u0470\u0001\u0000"+
		"\u0000\u0000\u0472\u0475\u0001\u0000\u0000\u0000\u0473\u0474\u0001\u0000"+
		"\u0000\u0000\u0473\u0471\u0001\u0000\u0000\u0000\u0474\u04ea\u0001\u0000"+
		"\u0000\u0000\u0475\u0473\u0001\u0000\u0000\u0000\u0476\u0477\u0005\u0106"+
		"\u0000\u0000\u0477\u0478\u0005\u0125\u0000\u0000\u0478\u0479\u0005\u0158"+
		"\u0000\u0000\u0479\u04ea\u0003\u0128\u0094\u0000\u047a\u047b\u0005\u0106"+
		"\u0000\u0000\u047b\u047c\u0005\u0125\u0000\u0000\u047c\u047d\u0005\u0158"+
		"\u0000\u0000\u047d\u04ea\u0003\u001a\r\u0000\u047e\u047f\u0005\u0106\u0000"+
		"\u0000\u047f\u0480\u0005\u0125\u0000\u0000\u0480\u0484\u0005\u0158\u0000"+
		"\u0000\u0481\u0483\t\u0000\u0000\u0000\u0482\u0481\u0001\u0000\u0000\u0000"+
		"\u0483\u0486\u0001\u0000\u0000\u0000\u0484\u0485\u0001\u0000\u0000\u0000"+
		"\u0484\u0482\u0001\u0000\u0000\u0000\u0485\u04ea\u0001\u0000\u0000\u0000"+
		"\u0486\u0484\u0001\u0000\u0000\u0000\u0487\u0488\u0005\u0106\u0000\u0000"+
		"\u0488\u0489\u0007\u000b\u0000\u0000\u0489\u04ea\u0003\u008aE\u0000\u048a"+
		"\u048b\u0005\u0106\u0000\u0000\u048b\u048c\u0007\u000b\u0000\u0000\u048c"+
		"\u048d\u0005\u0002\u0000\u0000\u048d\u048e\u0003\u00f2y\u0000\u048e\u048f"+
		"\u0005\u0003\u0000\u0000\u048f\u0490\u0005\u0159\u0000\u0000\u0490\u0491"+
		"\u0005\u0002\u0000\u0000\u0491\u0492\u00030\u0018\u0000\u0492\u0493\u0005"+
		"\u0003\u0000\u0000\u0493\u04ea\u0001\u0000\u0000\u0000\u0494\u0495\u0005"+
		"\u0106\u0000\u0000\u0495\u0496\u0003\u001c\u000e\u0000\u0496\u0497\u0005"+
		"\u0159\u0000\u0000\u0497\u0498\u0003\u001e\u000f\u0000\u0498\u04ea\u0001"+
		"\u0000\u0000\u0000\u0499\u049a\u0005\u0106\u0000\u0000\u049a\u04a2\u0003"+
		"\u001c\u000e\u0000\u049b\u049f\u0005\u0159\u0000\u0000\u049c\u049e\t\u0000"+
		"\u0000\u0000\u049d\u049c\u0001\u0000\u0000\u0000\u049e\u04a1\u0001\u0000"+
		"\u0000\u0000\u049f\u04a0\u0001\u0000\u0000\u0000\u049f\u049d\u0001\u0000"+
		"\u0000\u0000\u04a0\u04a3\u0001\u0000\u0000\u0000\u04a1\u049f\u0001\u0000"+
		"\u0000\u0000\u04a2\u049b\u0001\u0000\u0000\u0000\u04a2\u04a3\u0001\u0000"+
		"\u0000\u0000\u04a3\u04ea\u0001\u0000\u0000\u0000\u04a4\u04a8\u0005\u0106"+
		"\u0000\u0000\u04a5\u04a7\t\u0000\u0000\u0000\u04a6\u04a5\u0001\u0000\u0000"+
		"\u0000\u04a7\u04aa\u0001\u0000\u0000\u0000\u04a8\u04a9\u0001\u0000\u0000"+
		"\u0000\u04a8\u04a6\u0001\u0000\u0000\u0000\u04a9\u04ab\u0001\u0000\u0000"+
		"\u0000\u04aa\u04a8\u0001\u0000\u0000\u0000\u04ab\u04ac\u0005\u0159\u0000"+
		"\u0000\u04ac\u04ea\u0003\u001e\u000f\u0000\u04ad\u04b1\u0005\u0106\u0000"+
		"\u0000\u04ae\u04b0\t\u0000\u0000\u0000\u04af\u04ae\u0001\u0000\u0000\u0000"+
		"\u04b0\u04b3\u0001\u0000\u0000\u0000\u04b1\u04b2\u0001\u0000\u0000\u0000"+
		"\u04b1\u04af\u0001\u0000\u0000\u0000\u04b2\u04ea\u0001\u0000\u0000\u0000"+
		"\u04b3\u04b1\u0001\u0000\u0000\u0000\u04b4\u04b5\u0005\u00f0\u0000\u0000"+
		"\u04b5\u04ea\u0003\u001c\u000e\u0000\u04b6\u04ba\u0005\u00f0\u0000\u0000"+
		"\u04b7\u04b9\t\u0000\u0000\u0000\u04b8\u04b7\u0001\u0000\u0000\u0000\u04b9"+
		"\u04bc\u0001\u0000\u0000\u0000\u04ba\u04bb\u0001\u0000\u0000\u0000\u04ba"+
		"\u04b8\u0001\u0000\u0000\u0000\u04bb\u04ea\u0001\u0000\u0000\u0000\u04bc"+
		"\u04ba\u0001\u0000\u0000\u0000\u04bd\u04be\u0005;\u0000\u0000\u04be\u04c2"+
		"\u0005\u008d\u0000\u0000\u04bf\u04c0\u0005\u0087\u0000\u0000\u04c0\u04c1"+
		"\u0005\u00c1\u0000\u0000\u04c1\u04c3\u0005g\u0000\u0000\u04c2\u04bf\u0001"+
		"\u0000\u0000\u0000\u04c2\u04c3\u0001\u0000\u0000\u0000\u04c3\u04c4\u0001"+
		"\u0000\u0000\u0000\u04c4\u04c5\u0003\u016e\u00b7\u0000\u04c5\u04c7\u0005"+
		"\u00c7\u0000\u0000\u04c6\u04c8\u0005\u011d\u0000\u0000\u04c7\u04c6\u0001"+
		"\u0000\u0000\u0000\u04c7\u04c8\u0001\u0000\u0000\u0000\u04c8\u04c9\u0001"+
		"\u0000\u0000\u0000\u04c9\u04cc\u0003d2\u0000\u04ca\u04cb\u0005\u0145\u0000"+
		"\u0000\u04cb\u04cd\u0003\u016e\u00b7\u0000\u04cc\u04ca\u0001\u0000\u0000"+
		"\u0000\u04cc\u04cd\u0001\u0000\u0000\u0000\u04cd\u04ce\u0001\u0000\u0000"+
		"\u0000\u04ce\u04cf\u0005\u0002\u0000\u0000\u04cf\u04d0\u0003\u00f6{\u0000"+
		"\u04d0\u04d3\u0005\u0003\u0000\u0000\u04d1\u04d2\u0005\u00ca\u0000\u0000"+
		"\u04d2\u04d4\u0003J%\u0000\u04d3\u04d1\u0001\u0000\u0000\u0000\u04d3\u04d4"+
		"\u0001\u0000\u0000\u0000\u04d4\u04ea\u0001\u0000\u0000\u0000\u04d5\u04d6"+
		"\u0005_\u0000\u0000\u04d6\u04d9\u0005\u008d\u0000\u0000\u04d7\u04d8\u0005"+
		"\u0087\u0000\u0000\u04d8\u04da\u0005g\u0000\u0000\u04d9\u04d7\u0001\u0000"+
		"\u0000\u0000\u04d9\u04da\u0001\u0000\u0000\u0000\u04da\u04db\u0001\u0000"+
		"\u0000\u0000\u04db\u04dc\u0003\u016e\u00b7\u0000\u04dc\u04de\u0005\u00c7"+
		"\u0000\u0000\u04dd\u04df\u0005\u011d\u0000\u0000\u04de\u04dd\u0001\u0000"+
		"\u0000\u0000\u04de\u04df\u0001\u0000\u0000\u0000\u04df\u04e0\u0001\u0000"+
		"\u0000\u0000\u04e0\u04e1\u0003d2\u0000\u04e1\u04ea\u0001\u0000\u0000\u0000"+
		"\u04e2\u04e6\u0003 \u0010\u0000\u04e3\u04e5\t\u0000\u0000\u0000\u04e4"+
		"\u04e3\u0001\u0000\u0000\u0000\u04e5\u04e8\u0001\u0000\u0000\u0000\u04e6"+
		"\u04e7\u0001\u0000\u0000\u0000\u04e6\u04e4\u0001\u0000\u0000\u0000\u04e7"+
		"\u04ea\u0001\u0000\u0000\u0000\u04e8\u04e6\u0001\u0000\u0000\u0000\u04e9"+
		"\u01a1\u0001\u0000\u0000\u0000\u04e9\u01a2\u0001\u0000\u0000\u0000\u04e9"+
		"\u01a4\u0001\u0000\u0000\u0000\u04e9\u01a7\u0001\u0000\u0000\u0000\u04e9"+
		"\u01a9\u0001\u0000\u0000\u0000\u04e9\u01ad\u0001\u0000\u0000\u0000\u04e9"+
		"\u01b3\u0001\u0000\u0000\u0000\u04e9\u01c5\u0001\u0000\u0000\u0000\u04e9"+
		"\u01cc\u0001\u0000\u0000\u0000\u04e9\u01d2\u0001\u0000\u0000\u0000\u04e9"+
		"\u01dc\u0001\u0000\u0000\u0000\u04e9\u01e8\u0001\u0000\u0000\u0000\u04e9"+
		"\u01f9\u0001\u0000\u0000\u0000\u04e9\u020e\u0001\u0000\u0000\u0000\u04e9"+
		"\u021f\u0001\u0000\u0000\u0000\u04e9\u0230\u0001\u0000\u0000\u0000\u04e9"+
		"\u023b\u0001\u0000\u0000\u0000\u04e9\u0242\u0001\u0000\u0000\u0000\u04e9"+
		"\u024b\u0001\u0000\u0000\u0000\u04e9\u0254\u0001\u0000\u0000\u0000\u04e9"+
		"\u0261\u0001\u0000\u0000\u0000\u04e9\u026c\u0001\u0000\u0000\u0000\u04e9"+
		"\u0273\u0001\u0000\u0000\u0000\u04e9\u027a\u0001\u0000\u0000\u0000\u04e9"+
		"\u0285\u0001\u0000\u0000\u0000\u04e9\u0290\u0001\u0000\u0000\u0000\u04e9"+
		"\u029f\u0001\u0000\u0000\u0000\u04e9\u02ab\u0001\u0000\u0000\u0000\u04e9"+
		"\u02b9\u0001\u0000\u0000\u0000\u04e9\u02c3\u0001\u0000\u0000\u0000\u04e9"+
		"\u02d1\u0001\u0000\u0000\u0000\u04e9\u02d9\u0001\u0000\u0000\u0000\u04e9"+
		"\u02ec\u0001\u0000\u0000\u0000\u04e9\u02f5\u0001\u0000\u0000\u0000\u04e9"+
		"\u02fb\u0001\u0000\u0000\u0000\u04e9\u0305\u0001\u0000\u0000\u0000\u04e9"+
		"\u030c\u0001\u0000\u0000\u0000\u04e9\u032f\u0001\u0000\u0000\u0000\u04e9"+
		"\u0345\u0001\u0000\u0000\u0000\u04e9\u034d\u0001\u0000\u0000\u0000\u04e9"+
		"\u0369\u0001\u0000\u0000\u0000\u04e9\u0373\u0001\u0000\u0000\u0000\u04e9"+
		"\u0382\u0001\u0000\u0000\u0000\u04e9\u038a\u0001\u0000\u0000\u0000\u04e9"+
		"\u038f\u0001\u0000\u0000\u0000\u04e9\u039b\u0001\u0000\u0000\u0000\u04e9"+
		"\u03a7\u0001\u0000\u0000\u0000\u04e9\u03b0\u0001\u0000\u0000\u0000\u04e9"+
		"\u03b8\u0001\u0000\u0000\u0000\u04e9\u03c4\u0001\u0000\u0000\u0000\u04e9"+
		"\u03ca\u0001\u0000\u0000\u0000\u04e9\u03dc\u0001\u0000\u0000\u0000\u04e9"+
		"\u03e4\u0001\u0000\u0000\u0000\u04e9\u03e7\u0001\u0000\u0000\u0000\u04e9"+
		"\u03ef\u0001\u0000\u0000\u0000\u04e9\u03f5\u0001\u0000\u0000\u0000\u04e9"+
		"\u03fc\u0001\u0000\u0000\u0000\u04e9\u040a\u0001\u0000\u0000\u0000\u04e9"+
		"\u040f\u0001\u0000\u0000\u0000\u04e9\u0416\u0001\u0000\u0000\u0000\u04e9"+
		"\u041d\u0001\u0000\u0000\u0000\u04e9\u0420\u0001\u0000\u0000\u0000\u04e9"+
		"\u0423\u0001\u0000\u0000\u0000\u04e9\u042d\u0001\u0000\u0000\u0000\u04e9"+
		"\u043d\u0001\u0000\u0000\u0000\u04e9\u0444\u0001\u0000\u0000\u0000\u04e9"+
		"\u0446\u0001\u0000\u0000\u0000\u04e9\u0456\u0001\u0000\u0000\u0000\u04e9"+
		"\u045d\u0001\u0000\u0000\u0000\u04e9\u0466\u0001\u0000\u0000\u0000\u04e9"+
		"\u046e\u0001\u0000\u0000\u0000\u04e9\u0476\u0001\u0000\u0000\u0000\u04e9"+
		"\u047a\u0001\u0000\u0000\u0000\u04e9\u047e\u0001\u0000\u0000\u0000\u04e9"+
		"\u0487\u0001\u0000\u0000\u0000\u04e9\u048a\u0001\u0000\u0000\u0000\u04e9"+
		"\u0494\u0001\u0000\u0000\u0000\u04e9\u0499\u0001\u0000\u0000\u0000\u04e9"+
		"\u04a4\u0001\u0000\u0000\u0000\u04e9\u04ad\u0001\u0000\u0000\u0000\u04e9"+
		"\u04b4\u0001\u0000\u0000\u0000\u04e9\u04b6\u0001\u0000\u0000\u0000\u04e9"+
		"\u04bd\u0001\u0000\u0000\u0000\u04e9\u04d5\u0001\u0000\u0000\u0000\u04e9"+
		"\u04e2\u0001\u0000\u0000\u0000\u04ea\u000f\u0001\u0000\u0000\u0000\u04eb"+
		"\u04ec\u0005\u012e\u0000\u0000\u04ec\u04ed\u0005\u0089\u0000\u0000\u04ed"+
		"\u04f0\u0003\u0014\n\u0000\u04ee\u04ef\u0005\u0097\u0000\u0000\u04ef\u04f1"+
		"\u0003\u00f2y\u0000\u04f0\u04ee\u0001\u0000\u0000\u0000\u04f0\u04f1\u0001"+
		"\u0000\u0000\u0000\u04f1\u04f3\u0001\u0000\u0000\u0000\u04f2\u04f4\u0003"+
		"\u0012\t\u0000\u04f3\u04f2\u0001\u0000\u0000\u0000\u04f3\u04f4\u0001\u0000"+
		"\u0000\u0000\u04f4\u0011\u0001\u0000\u0000\u0000\u04f5\u04f6\u0005\u0145"+
		"\u0000\u0000\u04f6\u04f7\u0005\u0002\u0000\u0000\u04f7\u04f8\u0003\u0100"+
		"\u0080\u0000\u04f8\u04f9\u0005\u0003\u0000\u0000\u04f9\u04fd\u0001\u0000"+
		"\u0000\u0000\u04fa\u04fb\u0005\u0145\u0000\u0000\u04fb\u04fd\u0003\u0100"+
		"\u0080\u0000\u04fc\u04f5\u0001\u0000\u0000\u0000\u04fc\u04fa\u0001\u0000"+
		"\u0000\u0000\u04fd\u0013\u0001\u0000\u0000\u0000\u04fe\u0501\u0003\u017a"+
		"\u00bd\u0000\u04ff\u0501\u0003\u00f4z\u0000\u0500\u04fe\u0001\u0000\u0000"+
		"\u0000\u0500\u04ff\u0001\u0000\u0000\u0000\u0501\u0015\u0001\u0000\u0000"+
		"\u0000\u0502\u0505\u0003\u011e\u008f\u0000\u0503\u0505\u0003\u00f4z\u0000"+
		"\u0504\u0502\u0001\u0000\u0000\u0000\u0504\u0503\u0001\u0000\u0000\u0000"+
		"\u0505\u0508\u0001\u0000\u0000\u0000\u0506\u0507\u0005\u0014\u0000\u0000"+
		"\u0507\u0509\u0003\u016a\u00b5\u0000\u0508\u0506\u0001\u0000\u0000\u0000"+
		"\u0508\u0509\u0001\u0000\u0000\u0000\u0509\u0017\u0001\u0000\u0000\u0000"+
		"\u050a\u050f\u0003\u0016\u000b\u0000\u050b\u050c\u0005\u0004\u0000\u0000"+
		"\u050c\u050e\u0003\u0016\u000b\u0000\u050d\u050b\u0001\u0000\u0000\u0000"+
		"\u050e\u0511\u0001\u0000\u0000\u0000\u050f\u050d\u0001\u0000\u0000\u0000"+
		"\u050f\u0510\u0001\u0000\u0000\u0000\u0510\u0019\u0001\u0000\u0000\u0000"+
		"\u0511\u050f\u0001\u0000\u0000\u0000\u0512\u0515\u0003\u017a\u00bd\u0000"+
		"\u0513\u0515\u0005\u00a7\u0000\u0000\u0514\u0512\u0001\u0000\u0000\u0000"+
		"\u0514\u0513\u0001\u0000\u0000\u0000\u0515\u001b\u0001\u0000\u0000\u0000"+
		"\u0516\u0517\u0003\u0172\u00b9\u0000\u0517\u001d\u0001\u0000\u0000\u0000"+
		"\u0518\u0519\u0003\u0174\u00ba\u0000\u0519\u001f\u0001\u0000\u0000\u0000"+
		"\u051a\u051b\u0005;\u0000\u0000\u051b\u05c3\u0005\u00f6\u0000\u0000\u051c"+
		"\u051d\u0005_\u0000\u0000\u051d\u05c3\u0005\u00f6\u0000\u0000\u051e\u0520"+
		"\u0005\u007f\u0000\u0000\u051f\u0521\u0005\u00f6\u0000\u0000\u0520\u051f"+
		"\u0001\u0000\u0000\u0000\u0520\u0521\u0001\u0000\u0000\u0000\u0521\u05c3"+
		"\u0001\u0000\u0000\u0000\u0522\u0524\u0005\u00f3\u0000\u0000\u0523\u0525"+
		"\u0005\u00f6\u0000\u0000\u0524\u0523\u0001\u0000\u0000\u0000\u0524\u0525"+
		"\u0001\u0000\u0000\u0000\u0525\u05c3\u0001\u0000\u0000\u0000\u0526\u0527"+
		"\u0005\u010a\u0000\u0000\u0527\u05c3\u0005\u007f\u0000\u0000\u0528\u0529"+
		"\u0005\u010a\u0000\u0000\u0529\u052b\u0005\u00f6\u0000\u0000\u052a\u052c"+
		"\u0005\u007f\u0000\u0000\u052b\u052a\u0001\u0000\u0000\u0000\u052b\u052c"+
		"\u0001\u0000\u0000\u0000\u052c\u05c3\u0001\u0000\u0000\u0000\u052d\u052e"+
		"\u0005\u010a\u0000\u0000\u052e\u05c3\u0005\u00df\u0000\u0000\u052f\u0530"+
		"\u0005\u010a\u0000\u0000\u0530\u05c3\u0005\u00f7\u0000\u0000\u0531\u0532"+
		"\u0005\u010a\u0000\u0000\u0532\u0533\u0005>\u0000\u0000\u0533\u05c3\u0005"+
		"\u00f7\u0000\u0000\u0534\u0535\u0005i\u0000\u0000\u0535\u05c3\u0005\u011d"+
		"\u0000\u0000\u0536\u0537\u0005\u008a\u0000\u0000\u0537\u05c3\u0005\u011d"+
		"\u0000\u0000\u0538\u0539\u0005\u010a\u0000\u0000\u0539\u05c3\u00056\u0000"+
		"\u0000\u053a\u053b\u0005\u010a\u0000\u0000\u053b\u053c\u0005;\u0000\u0000"+
		"\u053c\u05c3\u0005\u011d\u0000\u0000\u053d\u053e\u0005\u010a\u0000\u0000"+
		"\u053e\u05c3\u0005\u0132\u0000\u0000\u053f\u0540\u0005\u010a\u0000\u0000"+
		"\u0540\u05c3\u0005\u008e\u0000\u0000\u0541\u0542\u0005\u010a\u0000\u0000"+
		"\u0542\u05c3\u0005\u00aa\u0000\u0000\u0543\u0544\u0005;\u0000\u0000\u0544"+
		"\u05c3\u0005\u008d\u0000\u0000\u0545\u0546\u0005_\u0000\u0000\u0546\u05c3"+
		"\u0005\u008d\u0000\u0000\u0547\u0548\u0005\u000b\u0000\u0000\u0548\u05c3"+
		"\u0005\u008d\u0000\u0000\u0549\u054a\u0005\u00a9\u0000\u0000\u054a\u05c3"+
		"\u0005\u011d\u0000\u0000\u054b\u054c\u0005\u00a9\u0000\u0000\u054c\u05c3"+
		"\u0005H\u0000\u0000\u054d\u054e\u0005\u013f\u0000\u0000\u054e\u05c3\u0005"+
		"\u011d\u0000\u0000\u054f\u0550\u0005\u013f\u0000\u0000\u0550\u05c3\u0005"+
		"H\u0000\u0000\u0551\u0552\u0005;\u0000\u0000\u0552\u0553\u0005\u0122\u0000"+
		"\u0000\u0553\u05c3\u0005\u00ad\u0000\u0000\u0554\u0555\u0005_\u0000\u0000"+
		"\u0555\u0556\u0005\u0122\u0000\u0000\u0556\u05c3\u0005\u00ad\u0000\u0000"+
		"\u0557\u0558\u0005\u000b\u0000\u0000\u0558\u0559\u0005\u011d\u0000\u0000"+
		"\u0559\u055a\u0003\u00fa}\u0000\u055a\u055b\u0005\u00c1\u0000\u0000\u055b"+
		"\u055c\u0005-\u0000\u0000\u055c\u05c3\u0001\u0000\u0000\u0000\u055d\u055e"+
		"\u0005\u000b\u0000\u0000\u055e\u055f\u0005\u011d\u0000\u0000\u055f\u0560"+
		"\u0003\u00fa}\u0000\u0560\u0561\u0005-\u0000\u0000\u0561\u0562\u0005\u001f"+
		"\u0000\u0000\u0562\u05c3\u0001\u0000\u0000\u0000\u0563\u0564\u0005\u000b"+
		"\u0000\u0000\u0564\u0565\u0005\u011d\u0000\u0000\u0565\u0566\u0003\u00fa"+
		"}\u0000\u0566\u0567\u0005\u00c1\u0000\u0000\u0567\u0568\u0005\u0110\u0000"+
		"\u0000\u0568\u05c3\u0001\u0000\u0000\u0000\u0569\u056a\u0005\u000b\u0000"+
		"\u0000\u056a\u056b\u0005\u011d\u0000\u0000\u056b\u056c\u0003\u00fa}\u0000"+
		"\u056c\u056d\u0005\u010c\u0000\u0000\u056d\u056e\u0005\u001f\u0000\u0000"+
		"\u056e\u05c3\u0001\u0000\u0000\u0000\u056f\u0570\u0005\u000b\u0000\u0000"+
		"\u0570\u0571\u0005\u011d\u0000\u0000\u0571\u0572\u0003\u00fa}\u0000\u0572"+
		"\u0573\u0005\u00c1\u0000\u0000\u0573\u0574\u0005\u010c\u0000\u0000\u0574"+
		"\u05c3\u0001\u0000\u0000\u0000\u0575\u0576\u0005\u000b\u0000\u0000\u0576"+
		"\u0577\u0005\u011d\u0000\u0000\u0577\u0578\u0003\u00fa}\u0000\u0578\u0579"+
		"\u0005\u00c1\u0000\u0000\u0579\u057a\u0005\u0114\u0000\u0000\u057a\u057b"+
		"\u0005\u0014\u0000\u0000\u057b\u057c\u0005Y\u0000\u0000\u057c\u05c3\u0001"+
		"\u0000\u0000\u0000\u057d\u057e\u0005\u000b\u0000\u0000\u057e\u057f\u0005"+
		"\u011d\u0000\u0000\u057f\u0580\u0003\u00fa}\u0000\u0580\u0581\u0005\u0106"+
		"\u0000\u0000\u0581\u0582\u0005\u010c\u0000\u0000\u0582\u0583\u0005\u00a8"+
		"\u0000\u0000\u0583\u05c3\u0001\u0000\u0000\u0000\u0584\u0585\u0005\u000b"+
		"\u0000\u0000\u0585\u0586\u0005\u011d\u0000\u0000\u0586\u0587\u0003\u00fa"+
		"}\u0000\u0587\u0588\u0005e\u0000\u0000\u0588\u0589\u0005\u00d4\u0000\u0000"+
		"\u0589\u05c3\u0001\u0000\u0000\u0000\u058a\u058b\u0005\u000b\u0000\u0000"+
		"\u058b\u058c\u0005\u011d\u0000\u0000\u058c\u058d\u0003\u00fa}\u0000\u058d"+
		"\u058e\u0005\u0012\u0000\u0000\u058e\u058f\u0005\u00d4\u0000\u0000\u058f"+
		"\u05c3\u0001\u0000\u0000\u0000\u0590\u0591\u0005\u000b\u0000\u0000\u0591"+
		"\u0592\u0005\u011d\u0000\u0000\u0592\u0593\u0003\u00fa}\u0000\u0593\u0594"+
		"\u0005\u0139\u0000\u0000\u0594\u0595\u0005\u00d4\u0000\u0000\u0595\u05c3"+
		"\u0001\u0000\u0000\u0000\u0596\u0597\u0005\u000b\u0000\u0000\u0597\u0598"+
		"\u0005\u011d\u0000\u0000\u0598\u0599\u0003\u00fa}\u0000\u0599\u059a\u0005"+
		"\u012f\u0000\u0000\u059a\u05c3\u0001\u0000\u0000\u0000\u059b\u059c\u0005"+
		"\u000b\u0000\u0000\u059c\u059d\u0005\u011d\u0000\u0000\u059d\u059f\u0003"+
		"\u00fa}\u0000\u059e\u05a0\u00036\u001b\u0000\u059f\u059e\u0001\u0000\u0000"+
		"\u0000\u059f\u05a0\u0001\u0000\u0000\u0000\u05a0\u05a1\u0001\u0000\u0000"+
		"\u0000\u05a1\u05a2\u00055\u0000\u0000\u05a2\u05c3\u0001\u0000\u0000\u0000"+
		"\u05a3\u05a4\u0005\u000b\u0000\u0000\u05a4\u05a5\u0005\u011d\u0000\u0000"+
		"\u05a5\u05a7\u0003\u00fa}\u0000\u05a6\u05a8\u00036\u001b\u0000\u05a7\u05a6"+
		"\u0001\u0000\u0000\u0000\u05a7\u05a8\u0001\u0000\u0000\u0000\u05a8\u05a9"+
		"\u0001\u0000\u0000\u0000\u05a9\u05aa\u00058\u0000\u0000\u05aa\u05c3\u0001"+
		"\u0000\u0000\u0000\u05ab\u05ac\u0005\u000b\u0000\u0000\u05ac\u05ad\u0005"+
		"\u011d\u0000\u0000\u05ad\u05af\u0003\u00fa}\u0000\u05ae\u05b0\u00036\u001b"+
		"\u0000\u05af\u05ae\u0001\u0000\u0000\u0000\u05af\u05b0\u0001\u0000\u0000"+
		"\u0000\u05b0\u05b1\u0001\u0000\u0000\u0000\u05b1\u05b2\u0005\u0106\u0000"+
		"\u0000\u05b2\u05b3\u0005q\u0000\u0000\u05b3\u05c3\u0001\u0000\u0000\u0000"+
		"\u05b4\u05b5\u0005\u000b\u0000\u0000\u05b5\u05b6\u0005\u011d\u0000\u0000"+
		"\u05b6\u05b8\u0003\u00fa}\u0000\u05b7\u05b9\u00036\u001b\u0000\u05b8\u05b7"+
		"\u0001\u0000\u0000\u0000\u05b8\u05b9\u0001\u0000\u0000\u0000\u05b9\u05ba"+
		"\u0001\u0000\u0000\u0000\u05ba\u05bb\u0005\u00ef\u0000\u0000\u05bb\u05bc"+
		"\u00052\u0000\u0000\u05bc\u05c3\u0001\u0000\u0000\u0000\u05bd\u05be\u0005"+
		"\u0112\u0000\u0000\u05be\u05c3\u0005\u0131\u0000\u0000\u05bf\u05c3\u0005"+
		"4\u0000\u0000\u05c0\u05c3\u0005\u00f8\u0000\u0000\u05c1\u05c3\u0005X\u0000"+
		"\u0000\u05c2\u051a\u0001\u0000\u0000\u0000\u05c2\u051c\u0001\u0000\u0000"+
		"\u0000\u05c2\u051e\u0001\u0000\u0000\u0000\u05c2\u0522\u0001\u0000\u0000"+
		"\u0000\u05c2\u0526\u0001\u0000\u0000\u0000\u05c2\u0528\u0001\u0000\u0000"+
		"\u0000\u05c2\u052d\u0001\u0000\u0000\u0000\u05c2\u052f\u0001\u0000\u0000"+
		"\u0000\u05c2\u0531\u0001\u0000\u0000\u0000\u05c2\u0534\u0001\u0000\u0000"+
		"\u0000\u05c2\u0536\u0001\u0000\u0000\u0000\u05c2\u0538\u0001\u0000\u0000"+
		"\u0000\u05c2\u053a\u0001\u0000\u0000\u0000\u05c2\u053d\u0001\u0000\u0000"+
		"\u0000\u05c2\u053f\u0001\u0000\u0000\u0000\u05c2\u0541\u0001\u0000\u0000"+
		"\u0000\u05c2\u0543\u0001\u0000\u0000\u0000\u05c2\u0545\u0001\u0000\u0000"+
		"\u0000\u05c2\u0547\u0001\u0000\u0000\u0000\u05c2\u0549\u0001\u0000\u0000"+
		"\u0000\u05c2\u054b\u0001\u0000\u0000\u0000\u05c2\u054d\u0001\u0000\u0000"+
		"\u0000\u05c2\u054f\u0001\u0000\u0000\u0000\u05c2\u0551\u0001\u0000\u0000"+
		"\u0000\u05c2\u0554\u0001\u0000\u0000\u0000\u05c2\u0557\u0001\u0000\u0000"+
		"\u0000\u05c2\u055d\u0001\u0000\u0000\u0000\u05c2\u0563\u0001\u0000\u0000"+
		"\u0000\u05c2\u0569\u0001\u0000\u0000\u0000\u05c2\u056f\u0001\u0000\u0000"+
		"\u0000\u05c2\u0575\u0001\u0000\u0000\u0000\u05c2\u057d\u0001\u0000\u0000"+
		"\u0000\u05c2\u0584\u0001\u0000\u0000\u0000\u05c2\u058a\u0001\u0000\u0000"+
		"\u0000\u05c2\u0590\u0001\u0000\u0000\u0000\u05c2\u0596\u0001\u0000\u0000"+
		"\u0000\u05c2\u059b\u0001\u0000\u0000\u0000\u05c2\u05a3\u0001\u0000\u0000"+
		"\u0000\u05c2\u05ab\u0001\u0000\u0000\u0000\u05c2\u05b4\u0001\u0000\u0000"+
		"\u0000\u05c2\u05bd\u0001\u0000\u0000\u0000\u05c2\u05bf\u0001\u0000\u0000"+
		"\u0000\u05c2\u05c0\u0001\u0000\u0000\u0000\u05c2\u05c1\u0001\u0000\u0000"+
		"\u0000\u05c3!\u0001\u0000\u0000\u0000\u05c4\u05c6\u0005;\u0000\u0000\u05c5"+
		"\u05c7\u0005\u0122\u0000\u0000\u05c6\u05c5\u0001\u0000\u0000\u0000\u05c6"+
		"\u05c7\u0001\u0000\u0000\u0000\u05c7\u05c9\u0001\u0000\u0000\u0000\u05c8"+
		"\u05ca\u0005k\u0000\u0000\u05c9\u05c8\u0001\u0000\u0000\u0000\u05c9\u05ca"+
		"\u0001\u0000\u0000\u0000\u05ca\u05cb\u0001\u0000\u0000\u0000\u05cb\u05cf"+
		"\u0005\u011d\u0000\u0000\u05cc\u05cd\u0005\u0087\u0000\u0000\u05cd\u05ce"+
		"\u0005\u00c1\u0000\u0000\u05ce\u05d0\u0005g\u0000\u0000\u05cf\u05cc\u0001"+
		"\u0000\u0000\u0000\u05cf\u05d0\u0001\u0000\u0000\u0000\u05d0\u05d1\u0001"+
		"\u0000\u0000\u0000\u05d1\u05d2\u0003d2\u0000\u05d2#\u0001\u0000\u0000"+
		"\u0000\u05d3\u05d4\u0005;\u0000\u0000\u05d4\u05d6\u0005\u00cb\u0000\u0000"+
		"\u05d5\u05d3\u0001\u0000\u0000\u0000\u05d5\u05d6\u0001\u0000\u0000\u0000"+
		"\u05d6\u05d7\u0001\u0000\u0000\u0000\u05d7\u05d8\u0005\u00ef\u0000\u0000"+
		"\u05d8\u05d9\u0005\u011d\u0000\u0000\u05d9\u05da\u0003d2\u0000\u05da%"+
		"\u0001\u0000\u0000\u0000\u05db\u05dc\u0005,\u0000\u0000\u05dc\u05dd\u0005"+
		"\u001f\u0000\u0000\u05dd\u05de\u0005\u0002\u0000\u0000\u05de\u05df\u0003"+
		"\u00f2y\u0000\u05df\u05e0\u0005\u0003\u0000\u0000\u05e0\'\u0001\u0000"+
		"\u0000\u0000\u05e1\u05e2\u0005-\u0000\u0000\u05e2\u05e3\u0005\u001f\u0000"+
		"\u0000\u05e3\u05e7\u0003\u00d2i\u0000\u05e4\u05e5\u0005\u0110\u0000\u0000"+
		"\u05e5\u05e6\u0005\u001f\u0000\u0000\u05e6\u05e8\u0003\u00d6k\u0000\u05e7"+
		"\u05e4\u0001\u0000\u0000\u0000\u05e7\u05e8\u0001\u0000\u0000\u0000\u05e8"+
		"\u05e9\u0001\u0000\u0000\u0000\u05e9\u05ea\u0005\u0097\u0000\u0000\u05ea"+
		"\u05eb\u0005\u0177\u0000\u0000\u05eb\u05ec\u0005\u001e\u0000\u0000\u05ec"+
		")\u0001\u0000\u0000\u0000\u05ed\u05ee\u0005\u010c\u0000\u0000\u05ee\u05ef"+
		"\u0005\u001f\u0000\u0000\u05ef\u05f0\u0003\u00d2i\u0000\u05f0\u05f3\u0005"+
		"\u00c7\u0000\u0000\u05f1\u05f4\u0003V+\u0000\u05f2\u05f4\u0003X,\u0000"+
		"\u05f3\u05f1\u0001\u0000\u0000\u0000\u05f3\u05f2\u0001\u0000\u0000\u0000"+
		"\u05f4\u05f8\u0001\u0000\u0000\u0000\u05f5\u05f6\u0005\u0114\u0000\u0000"+
		"\u05f6\u05f7\u0005\u0014\u0000\u0000\u05f7\u05f9\u0005Y\u0000\u0000\u05f8"+
		"\u05f5\u0001\u0000\u0000\u0000\u05f8\u05f9\u0001\u0000\u0000\u0000\u05f9"+
		"+\u0001\u0000\u0000\u0000\u05fa\u05fb\u0005\u00a8\u0000\u0000\u05fb\u05fc"+
		"\u0003\u017a\u00bd\u0000\u05fc-\u0001\u0000\u0000\u0000\u05fd\u05fe\u0005"+
		"3\u0000\u0000\u05fe\u05ff\u0003\u017a\u00bd\u0000\u05ff/\u0001\u0000\u0000"+
		"\u0000\u0600\u0602\u0003B!\u0000\u0601\u0600\u0001\u0000\u0000\u0000\u0601"+
		"\u0602\u0001\u0000\u0000\u0000\u0602\u0603\u0001\u0000\u0000\u0000\u0603"+
		"\u0604\u0003j5\u0000\u0604\u0605\u0003f3\u0000\u06051\u0001\u0000\u0000"+
		"\u0000\u0606\u0607\u0005\u0092\u0000\u0000\u0607\u0609\u0005\u00d3\u0000"+
		"\u0000\u0608\u060a\u0005\u011d\u0000\u0000\u0609\u0608\u0001\u0000\u0000"+
		"\u0000\u0609\u060a\u0001\u0000\u0000\u0000\u060a\u060b\u0001\u0000\u0000"+
		"\u0000\u060b\u0612\u0003d2\u0000\u060c\u0610\u00036\u001b\u0000\u060d"+
		"\u060e\u0005\u0087\u0000\u0000\u060e\u060f\u0005\u00c1\u0000\u0000\u060f"+
		"\u0611\u0005g\u0000\u0000\u0610\u060d\u0001\u0000\u0000\u0000\u0610\u0611"+
		"\u0001\u0000\u0000\u0000\u0611\u0613\u0001\u0000\u0000\u0000\u0612\u060c"+
		"\u0001\u0000\u0000\u0000\u0612\u0613\u0001\u0000\u0000\u0000\u0613\u0617"+
		"\u0001\u0000\u0000\u0000\u0614\u0615\u0005\u001f\u0000\u0000\u0615\u0618"+
		"\u0005\u00ba\u0000\u0000\u0616\u0618\u0003\u00d2i\u0000\u0617\u0614\u0001"+
		"\u0000\u0000\u0000\u0617\u0616\u0001\u0000\u0000\u0000\u0617\u0618\u0001"+
		"\u0000\u0000\u0000\u0618\u0651\u0001\u0000\u0000\u0000\u0619\u061a\u0005"+
		"\u0092\u0000\u0000\u061a\u061c\u0005\u0097\u0000\u0000\u061b\u061d\u0005"+
		"\u011d\u0000\u0000\u061c\u061b\u0001\u0000\u0000\u0000\u061c\u061d\u0001"+
		"\u0000\u0000\u0000\u061d\u061e\u0001\u0000\u0000\u0000\u061e\u0620\u0003"+
		"d2\u0000\u061f\u0621\u00036\u001b\u0000\u0620\u061f\u0001\u0000\u0000"+
		"\u0000\u0620\u0621\u0001\u0000\u0000\u0000\u0621\u0625\u0001\u0000\u0000"+
		"\u0000\u0622\u0623\u0005\u0087\u0000\u0000\u0623\u0624\u0005\u00c1\u0000"+
		"\u0000\u0624\u0626\u0005g\u0000\u0000\u0625\u0622\u0001\u0000\u0000\u0000"+
		"\u0625\u0626\u0001\u0000\u0000\u0000\u0626\u062a\u0001\u0000\u0000\u0000"+
		"\u0627\u0628\u0005\u001f\u0000\u0000\u0628\u062b\u0005\u00ba\u0000\u0000"+
		"\u0629\u062b\u0003\u00d2i\u0000\u062a\u0627\u0001\u0000\u0000\u0000\u062a"+
		"\u0629\u0001\u0000\u0000\u0000\u062a\u062b\u0001\u0000\u0000\u0000\u062b"+
		"\u0651\u0001\u0000\u0000\u0000\u062c\u062d\u0005\u0092\u0000\u0000\u062d"+
		"\u062f\u0005\u0097\u0000\u0000\u062e\u0630\u0005\u011d\u0000\u0000\u062f"+
		"\u062e\u0001\u0000\u0000\u0000\u062f\u0630\u0001\u0000\u0000\u0000\u0630"+
		"\u0631\u0001\u0000\u0000\u0000\u0631\u0632\u0003d2\u0000\u0632\u0633\u0005"+
		"\u00ef\u0000\u0000\u0633\u0634\u0003\u008eG\u0000\u0634\u0651\u0001\u0000"+
		"\u0000\u0000\u0635\u0636\u0005\u0092\u0000\u0000\u0636\u0638\u0005\u00d3"+
		"\u0000\u0000\u0637\u0639\u0005\u00a7\u0000\u0000\u0638\u0637\u0001\u0000"+
		"\u0000\u0000\u0638\u0639\u0001\u0000\u0000\u0000\u0639\u063a\u0001\u0000"+
		"\u0000\u0000\u063a\u063b\u0005Z\u0000\u0000\u063b\u063d\u0003\u017a\u00bd"+
		"\u0000\u063c\u063e\u0003\u00f0x\u0000\u063d\u063c\u0001\u0000\u0000\u0000"+
		"\u063d\u063e\u0001\u0000\u0000\u0000\u063e\u0640\u0001\u0000\u0000\u0000"+
		"\u063f\u0641\u0003Z-\u0000\u0640\u063f\u0001\u0000\u0000\u0000\u0640\u0641"+
		"\u0001\u0000\u0000\u0000\u0641\u0651\u0001\u0000\u0000\u0000\u0642\u0643"+
		"\u0005\u0092\u0000\u0000\u0643\u0645\u0005\u00d3\u0000\u0000\u0644\u0646"+
		"\u0005\u00a7\u0000\u0000\u0645\u0644\u0001\u0000\u0000\u0000\u0645\u0646"+
		"\u0001\u0000\u0000\u0000\u0646\u0647\u0001\u0000\u0000\u0000\u0647\u0649"+
		"\u0005Z\u0000\u0000\u0648\u064a\u0003\u017a\u00bd\u0000\u0649\u0648\u0001"+
		"\u0000\u0000\u0000\u0649\u064a\u0001\u0000\u0000\u0000\u064a\u064b\u0001"+
		"\u0000\u0000\u0000\u064b\u064e\u0003F#\u0000\u064c\u064d\u0005\u00ca\u0000"+
		"\u0000\u064d\u064f\u0003J%\u0000\u064e\u064c\u0001\u0000\u0000\u0000\u064e"+
		"\u064f\u0001\u0000\u0000\u0000\u064f\u0651\u0001\u0000\u0000\u0000\u0650"+
		"\u0606\u0001\u0000\u0000\u0000\u0650\u0619\u0001\u0000\u0000\u0000\u0650"+
		"\u062c\u0001\u0000\u0000\u0000\u0650\u0635\u0001\u0000\u0000\u0000\u0650"+
		"\u0642\u0001\u0000\u0000\u0000\u06513\u0001\u0000\u0000\u0000\u0652\u0654"+
		"\u00036\u001b\u0000\u0653\u0655\u0003,\u0016\u0000\u0654\u0653\u0001\u0000"+
		"\u0000\u0000\u0654\u0655\u0001\u0000\u0000\u0000\u06555\u0001\u0000\u0000"+
		"\u0000\u0656\u0657\u0005\u00d4\u0000\u0000\u0657\u0658\u0005\u0002\u0000"+
		"\u0000\u0658\u065d\u00038\u001c\u0000\u0659\u065a\u0005\u0004\u0000\u0000"+
		"\u065a\u065c\u00038\u001c\u0000\u065b\u0659\u0001\u0000\u0000\u0000\u065c"+
		"\u065f\u0001\u0000\u0000\u0000\u065d\u065b\u0001\u0000\u0000\u0000\u065d"+
		"\u065e\u0001\u0000\u0000\u0000\u065e\u0660\u0001\u0000\u0000\u0000\u065f"+
		"\u065d\u0001\u0000\u0000\u0000\u0660\u0661\u0005\u0003\u0000\u0000\u0661"+
		"7\u0001\u0000\u0000\u0000\u0662\u0665\u0003\u016e\u00b7\u0000\u0663\u0664"+
		"\u0005\u0159\u0000\u0000\u0664\u0666\u0003\u011e\u008f\u0000\u0665\u0663"+
		"\u0001\u0000\u0000\u0000\u0665\u0666\u0001\u0000\u0000\u0000\u0666\u066c"+
		"\u0001\u0000\u0000\u0000\u0667\u0668\u0003\u016e\u00b7\u0000\u0668\u0669"+
		"\u0005\u0159\u0000\u0000\u0669\u066a\u0005R\u0000\u0000\u066a\u066c\u0001"+
		"\u0000\u0000\u0000\u066b\u0662\u0001\u0000\u0000\u0000\u066b\u0667\u0001"+
		"\u0000\u0000\u0000\u066c9\u0001\u0000\u0000\u0000\u066d\u066e\u0007\f"+
		"\u0000\u0000\u066e;\u0001\u0000\u0000\u0000\u066f\u0670\u0007\r\u0000"+
		"\u0000\u0670=\u0001\u0000\u0000\u0000\u0671\u0677\u0003d2\u0000\u0672"+
		"\u0677\u0003\u017a\u00bd\u0000\u0673\u0677\u0003\u0120\u0090\u0000\u0674"+
		"\u0677\u0003\u0122\u0091\u0000\u0675\u0677\u0003\u0124\u0092\u0000\u0676"+
		"\u0671\u0001\u0000\u0000\u0000\u0676\u0672\u0001\u0000\u0000\u0000\u0676"+
		"\u0673\u0001\u0000\u0000\u0000\u0676\u0674\u0001\u0000\u0000\u0000\u0676"+
		"\u0675\u0001\u0000\u0000\u0000\u0677?\u0001\u0000\u0000\u0000\u0678\u067d"+
		"\u0003\u016e\u00b7\u0000\u0679\u067a\u0005\u0005\u0000\u0000\u067a\u067c"+
		"\u0003\u016e\u00b7\u0000\u067b\u0679\u0001\u0000\u0000\u0000\u067c\u067f"+
		"\u0001\u0000\u0000\u0000\u067d\u067b\u0001\u0000\u0000\u0000\u067d\u067e"+
		"\u0001\u0000\u0000\u0000\u067eA\u0001\u0000\u0000\u0000\u067f\u067d\u0001"+
		"\u0000\u0000\u0000\u0680\u0681\u0005\u0154\u0000\u0000\u0681\u0686\u0003"+
		"D\"\u0000\u0682\u0683\u0005\u0004\u0000\u0000\u0683\u0685\u0003D\"\u0000"+
		"\u0684\u0682\u0001\u0000\u0000\u0000\u0685\u0688\u0001\u0000\u0000\u0000"+
		"\u0686\u0684\u0001\u0000\u0000\u0000\u0686\u0687\u0001\u0000\u0000\u0000"+
		"\u0687C\u0001\u0000\u0000\u0000\u0688\u0686\u0001\u0000\u0000\u0000\u0689"+
		"\u068b\u0003\u016a\u00b5\u0000\u068a\u068c\u0003\u00d2i\u0000\u068b\u068a"+
		"\u0001\u0000\u0000\u0000\u068b\u068c\u0001\u0000\u0000\u0000\u068c\u068e"+
		"\u0001\u0000\u0000\u0000\u068d\u068f\u0005\u0014\u0000\u0000\u068e\u068d"+
		"\u0001\u0000\u0000\u0000\u068e\u068f\u0001\u0000\u0000\u0000\u068f\u0690"+
		"\u0001\u0000\u0000\u0000\u0690\u0691\u0005\u0002\u0000\u0000\u0691\u0692"+
		"\u00030\u0018\u0000\u0692\u0693\u0005\u0003\u0000\u0000\u0693E\u0001\u0000"+
		"\u0000\u0000\u0694\u0695\u0005\u0145\u0000\u0000\u0695\u0696\u0003\u00f4"+
		"z\u0000\u0696G\u0001\u0000\u0000\u0000\u0697\u0698\u0005\u00ca\u0000\u0000"+
		"\u0698\u06a6\u0003R)\u0000\u0699\u069a\u0005\u00d5\u0000\u0000\u069a\u069b"+
		"\u0005\u001f\u0000\u0000\u069b\u06a6\u0003\u0102\u0081\u0000\u069c\u06a6"+
		"\u0003*\u0015\u0000\u069d\u06a6\u0003&\u0013\u0000\u069e\u06a6\u0003("+
		"\u0014\u0000\u069f\u06a6\u0003\u00f0x\u0000\u06a0\u06a6\u0003Z-\u0000"+
		"\u06a1\u06a6\u0003,\u0016\u0000\u06a2\u06a6\u0003.\u0017\u0000\u06a3\u06a4"+
		"\u0005\u0121\u0000\u0000\u06a4\u06a6\u0003J%\u0000\u06a5\u0697\u0001\u0000"+
		"\u0000\u0000\u06a5\u0699\u0001\u0000\u0000\u0000\u06a5\u069c\u0001\u0000"+
		"\u0000\u0000\u06a5\u069d\u0001\u0000\u0000\u0000\u06a5\u069e\u0001\u0000"+
		"\u0000\u0000\u06a5\u069f\u0001\u0000\u0000\u0000\u06a5\u06a0\u0001\u0000"+
		"\u0000\u0000\u06a5\u06a1\u0001\u0000\u0000\u0000\u06a5\u06a2\u0001\u0000"+
		"\u0000\u0000\u06a5\u06a3\u0001\u0000\u0000\u0000\u06a6\u06a9\u0001\u0000"+
		"\u0000\u0000\u06a7\u06a5\u0001\u0000\u0000\u0000\u06a7\u06a8\u0001\u0000"+
		"\u0000\u0000\u06a8I\u0001\u0000\u0000\u0000\u06a9\u06a7\u0001\u0000\u0000"+
		"\u0000\u06aa\u06ab\u0005\u0002\u0000\u0000\u06ab\u06b0\u0003L&\u0000\u06ac"+
		"\u06ad\u0005\u0004\u0000\u0000\u06ad\u06af\u0003L&\u0000\u06ae\u06ac\u0001"+
		"\u0000\u0000\u0000\u06af\u06b2\u0001\u0000\u0000\u0000\u06b0\u06ae\u0001"+
		"\u0000\u0000\u0000\u06b0\u06b1\u0001\u0000\u0000\u0000\u06b1\u06b3\u0001"+
		"\u0000\u0000\u0000\u06b2\u06b0\u0001\u0000\u0000\u0000\u06b3\u06b4\u0005"+
		"\u0003\u0000\u0000\u06b4K\u0001\u0000\u0000\u0000\u06b5\u06ba\u0003N\'"+
		"\u0000\u06b6\u06b8\u0005\u0159\u0000\u0000\u06b7\u06b6\u0001\u0000\u0000"+
		"\u0000\u06b7\u06b8\u0001\u0000\u0000\u0000\u06b8\u06b9\u0001\u0000\u0000"+
		"\u0000\u06b9\u06bb\u0003P(\u0000\u06ba\u06b7\u0001\u0000\u0000\u0000\u06ba"+
		"\u06bb\u0001\u0000\u0000\u0000\u06bbM\u0001\u0000\u0000\u0000\u06bc\u06c1"+
		"\u0003\u016e\u00b7\u0000\u06bd\u06be\u0005\u0005\u0000\u0000\u06be\u06c0"+
		"\u0003\u016e\u00b7\u0000\u06bf\u06bd\u0001\u0000\u0000\u0000\u06c0\u06c3"+
		"\u0001\u0000\u0000\u0000\u06c1\u06bf\u0001\u0000\u0000\u0000\u06c1\u06c2"+
		"\u0001\u0000\u0000\u0000\u06c2\u06c6\u0001\u0000\u0000\u0000\u06c3\u06c1"+
		"\u0001\u0000\u0000\u0000\u06c4\u06c6\u0003\u017a\u00bd\u0000\u06c5\u06bc"+
		"\u0001\u0000\u0000\u0000\u06c5\u06c4\u0001\u0000\u0000\u0000\u06c6O\u0001"+
		"\u0000\u0000\u0000\u06c7\u06cc\u0005\u0177\u0000\u0000\u06c8\u06cc\u0005"+
		"\u0179\u0000\u0000\u06c9\u06cc\u0003\u0126\u0093\u0000\u06ca\u06cc\u0003"+
		"\u017a\u00bd\u0000\u06cb\u06c7\u0001\u0000\u0000\u0000\u06cb\u06c8\u0001"+
		"\u0000\u0000\u0000\u06cb\u06c9\u0001\u0000\u0000\u0000\u06cb\u06ca\u0001"+
		"\u0000\u0000\u0000\u06ccQ\u0001\u0000\u0000\u0000\u06cd\u06ce\u0005\u0002"+
		"\u0000\u0000\u06ce\u06d3\u0003T*\u0000\u06cf\u06d0\u0005\u0004\u0000\u0000"+
		"\u06d0\u06d2\u0003T*\u0000\u06d1\u06cf\u0001\u0000\u0000\u0000\u06d2\u06d5"+
		"\u0001\u0000\u0000\u0000\u06d3\u06d1\u0001\u0000\u0000\u0000\u06d3\u06d4"+
		"\u0001\u0000\u0000\u0000\u06d4\u06d6\u0001\u0000\u0000\u0000\u06d5\u06d3"+
		"\u0001\u0000\u0000\u0000\u06d6\u06d7\u0005\u0003\u0000\u0000\u06d7S\u0001"+
		"\u0000\u0000\u0000\u06d8\u06dd\u0003N\'\u0000\u06d9\u06db\u0005\u0159"+
		"\u0000\u0000\u06da\u06d9\u0001\u0000\u0000\u0000\u06da\u06db\u0001\u0000"+
		"\u0000\u0000\u06db\u06dc\u0001\u0000\u0000\u0000\u06dc\u06de\u0003\u010a"+
		"\u0085\u0000\u06dd\u06da\u0001\u0000\u0000\u0000\u06dd\u06de\u0001\u0000"+
		"\u0000\u0000\u06deU\u0001\u0000\u0000\u0000\u06df\u06e0\u0005\u0002\u0000"+
		"\u0000\u06e0\u06e5\u0003\u011e\u008f\u0000\u06e1\u06e2\u0005\u0004\u0000"+
		"\u0000\u06e2\u06e4\u0003\u011e\u008f\u0000\u06e3\u06e1\u0001\u0000\u0000"+
		"\u0000\u06e4\u06e7\u0001\u0000\u0000\u0000\u06e5\u06e3\u0001\u0000\u0000"+
		"\u0000\u06e5\u06e6\u0001\u0000\u0000\u0000\u06e6\u06e8\u0001\u0000\u0000"+
		"\u0000\u06e7\u06e5\u0001\u0000\u0000\u0000\u06e8\u06e9\u0005\u0003\u0000"+
		"\u0000\u06e9W\u0001\u0000\u0000\u0000\u06ea\u06eb\u0005\u0002\u0000\u0000"+
		"\u06eb\u06f0\u0003V+\u0000\u06ec\u06ed\u0005\u0004\u0000\u0000\u06ed\u06ef"+
		"\u0003V+\u0000\u06ee\u06ec\u0001\u0000\u0000\u0000\u06ef\u06f2\u0001\u0000"+
		"\u0000\u0000\u06f0\u06ee\u0001\u0000\u0000\u0000\u06f0\u06f1\u0001\u0000"+
		"\u0000\u0000\u06f1\u06f3\u0001\u0000\u0000\u0000\u06f2\u06f0\u0001\u0000"+
		"\u0000\u0000\u06f3\u06f4\u0005\u0003\u0000\u0000\u06f4Y\u0001\u0000\u0000"+
		"\u0000\u06f5\u06f6\u0005\u0114\u0000\u0000\u06f6\u06f7\u0005\u0014\u0000"+
		"\u0000\u06f7\u06fc\u0003\\.\u0000\u06f8\u06f9\u0005\u0114\u0000\u0000"+
		"\u06f9\u06fa\u0005\u001f\u0000\u0000\u06fa\u06fc\u0003^/\u0000\u06fb\u06f5"+
		"\u0001\u0000\u0000\u0000\u06fb\u06f8\u0001\u0000\u0000\u0000\u06fc[\u0001"+
		"\u0000\u0000\u0000\u06fd\u06fe\u0005\u0091\u0000\u0000\u06fe\u06ff\u0003"+
		"\u017a\u00bd\u0000\u06ff\u0700\u0005\u00cf\u0000\u0000\u0700\u0701\u0003"+
		"\u017a\u00bd\u0000\u0701\u0704\u0001\u0000\u0000\u0000\u0702\u0704\u0003"+
		"\u016e\u00b7\u0000\u0703\u06fd\u0001\u0000\u0000\u0000\u0703\u0702\u0001"+
		"\u0000\u0000\u0000\u0704]\u0001\u0000\u0000\u0000\u0705\u0709\u0003\u017a"+
		"\u00bd\u0000\u0706\u0707\u0005\u0154\u0000\u0000\u0707\u0708\u0005\u0104"+
		"\u0000\u0000\u0708\u070a\u0003J%\u0000\u0709\u0706\u0001\u0000\u0000\u0000"+
		"\u0709\u070a\u0001\u0000\u0000\u0000\u070a_\u0001\u0000\u0000\u0000\u070b"+
		"\u070c\u0003\u016e\u00b7\u0000\u070c\u070d\u0003\u017a\u00bd\u0000\u070d"+
		"a\u0001\u0000\u0000\u0000\u070e\u070f\u00032\u0019\u0000\u070f\u0710\u0003"+
		"0\u0018\u0000\u0710\u0747\u0001\u0000\u0000\u0000\u0711\u0713\u0003\u0096"+
		"K\u0000\u0712\u0714\u0003h4\u0000\u0713\u0712\u0001\u0000\u0000\u0000"+
		"\u0714\u0715\u0001\u0000\u0000\u0000\u0715\u0713\u0001\u0000\u0000\u0000"+
		"\u0715\u0716\u0001\u0000\u0000\u0000\u0716\u0747\u0001\u0000\u0000\u0000"+
		"\u0717\u0718\u0005T\u0000\u0000\u0718\u0719\u0005y\u0000\u0000\u0719\u071a"+
		"\u0003d2\u0000\u071a\u071c\u0003\u00eew\u0000\u071b\u071d\u0003\u008e"+
		"G\u0000\u071c\u071b\u0001\u0000\u0000\u0000\u071c\u071d\u0001\u0000\u0000"+
		"\u0000\u071d\u0747\u0001\u0000\u0000\u0000\u071e\u071f\u0005\u0142\u0000"+
		"\u0000\u071f\u0720\u0003d2\u0000\u0720\u0721\u0003\u00eew\u0000\u0721"+
		"\u0723\u0003z=\u0000\u0722\u0724\u0003\u008eG\u0000\u0723\u0722\u0001"+
		"\u0000\u0000\u0000\u0723\u0724\u0001\u0000\u0000\u0000\u0724\u0747\u0001"+
		"\u0000\u0000\u0000\u0725\u0726\u0005\u00b0\u0000\u0000\u0726\u0727\u0005"+
		"\u0097\u0000\u0000\u0727\u0728\u0003d2\u0000\u0728\u0729\u0003\u00eew"+
		"\u0000\u0729\u072f\u0005\u0145\u0000\u0000\u072a\u0730\u0003d2\u0000\u072b"+
		"\u072c\u0005\u0002\u0000\u0000\u072c\u072d\u00030\u0018\u0000\u072d\u072e"+
		"\u0005\u0003\u0000\u0000\u072e\u0730\u0001\u0000\u0000\u0000\u072f\u072a"+
		"\u0001\u0000\u0000\u0000\u072f\u072b\u0001\u0000\u0000\u0000\u0730\u0731"+
		"\u0001\u0000\u0000\u0000\u0731\u0732\u0003\u00eew\u0000\u0732\u0733\u0005"+
		"\u00c7\u0000\u0000\u0733\u0737\u0003\u0112\u0089\u0000\u0734\u0736\u0003"+
		"|>\u0000\u0735\u0734\u0001\u0000\u0000\u0000\u0736\u0739\u0001\u0000\u0000"+
		"\u0000\u0737\u0735\u0001\u0000\u0000\u0000\u0737\u0738\u0001\u0000\u0000"+
		"\u0000\u0738\u073d\u0001\u0000\u0000\u0000\u0739\u0737\u0001\u0000\u0000"+
		"\u0000\u073a\u073c\u0003~?\u0000\u073b\u073a\u0001\u0000\u0000\u0000\u073c"+
		"\u073f\u0001\u0000\u0000\u0000\u073d\u073b\u0001\u0000\u0000\u0000\u073d"+
		"\u073e\u0001\u0000\u0000\u0000\u073e\u0743\u0001\u0000\u0000\u0000\u073f"+
		"\u073d\u0001\u0000\u0000\u0000\u0740\u0742\u0003\u0080@\u0000\u0741\u0740"+
		"\u0001\u0000\u0000\u0000\u0742\u0745\u0001\u0000\u0000\u0000\u0743\u0741"+
		"\u0001\u0000\u0000\u0000\u0743\u0744\u0001\u0000\u0000\u0000\u0744\u0747"+
		"\u0001\u0000\u0000\u0000\u0745\u0743\u0001\u0000\u0000\u0000\u0746\u070e"+
		"\u0001\u0000\u0000\u0000\u0746\u0711\u0001\u0000\u0000\u0000\u0746\u0717"+
		"\u0001\u0000\u0000\u0000\u0746\u071e\u0001\u0000\u0000\u0000\u0746\u0725"+
		"\u0001\u0000\u0000\u0000\u0747c\u0001\u0000\u0000\u0000\u0748\u0749\u0005"+
		"\u0086\u0000\u0000\u0749\u074a\u0005\u0002\u0000\u0000\u074a\u074b\u0003"+
		"\u010a\u0085\u0000\u074b\u074c\u0005\u0003\u0000\u0000\u074c\u074f\u0001"+
		"\u0000\u0000\u0000\u074d\u074f\u0003\u00f4z\u0000\u074e\u0748\u0001\u0000"+
		"\u0000\u0000\u074e\u074d\u0001\u0000\u0000\u0000\u074fe\u0001\u0000\u0000"+
		"\u0000\u0750\u0751\u0005\u00cc\u0000\u0000\u0751\u0752\u0005\u001f\u0000"+
		"\u0000\u0752\u0757\u0003n7\u0000\u0753\u0754\u0005\u0004\u0000\u0000\u0754"+
		"\u0756\u0003n7\u0000\u0755\u0753\u0001\u0000\u0000\u0000\u0756\u0759\u0001"+
		"\u0000\u0000\u0000\u0757\u0755\u0001\u0000\u0000\u0000\u0757\u0758\u0001"+
		"\u0000\u0000\u0000\u0758\u075b\u0001\u0000\u0000\u0000\u0759\u0757\u0001"+
		"\u0000\u0000\u0000\u075a\u0750\u0001\u0000\u0000\u0000\u075a\u075b\u0001"+
		"\u0000\u0000\u0000\u075b\u0766\u0001\u0000\u0000\u0000\u075c\u075d\u0005"+
		",\u0000\u0000\u075d\u075e\u0005\u001f\u0000\u0000\u075e\u0763\u0003\u010a"+
		"\u0085\u0000\u075f\u0760\u0005\u0004\u0000\u0000\u0760\u0762\u0003\u010a"+
		"\u0085\u0000\u0761\u075f\u0001\u0000\u0000\u0000\u0762\u0765\u0001\u0000"+
		"\u0000\u0000\u0763\u0761\u0001\u0000\u0000\u0000\u0763\u0764\u0001\u0000"+
		"\u0000\u0000\u0764\u0767\u0001\u0000\u0000\u0000\u0765\u0763\u0001\u0000"+
		"\u0000\u0000\u0766\u075c\u0001\u0000\u0000\u0000\u0766\u0767\u0001\u0000"+
		"\u0000\u0000\u0767\u0772\u0001\u0000\u0000\u0000\u0768\u0769\u0005\\\u0000"+
		"\u0000\u0769\u076a\u0005\u001f\u0000\u0000\u076a\u076f\u0003\u010a\u0085"+
		"\u0000\u076b\u076c\u0005\u0004\u0000\u0000\u076c\u076e\u0003\u010a\u0085"+
		"\u0000\u076d\u076b\u0001\u0000\u0000\u0000\u076e\u0771\u0001\u0000\u0000"+
		"\u0000\u076f\u076d\u0001\u0000\u0000\u0000\u076f\u0770\u0001\u0000\u0000"+
		"\u0000\u0770\u0773\u0001\u0000\u0000\u0000\u0771\u076f\u0001\u0000\u0000"+
		"\u0000\u0772\u0768\u0001\u0000\u0000\u0000\u0772\u0773\u0001\u0000\u0000"+
		"\u0000\u0773\u077e\u0001\u0000\u0000\u0000\u0774\u0775\u0005\u010f\u0000"+
		"\u0000\u0775\u0776\u0005\u001f\u0000\u0000\u0776\u077b\u0003n7\u0000\u0777"+
		"\u0778\u0005\u0004\u0000\u0000\u0778\u077a\u0003n7\u0000\u0779\u0777\u0001"+
		"\u0000\u0000\u0000\u077a\u077d\u0001\u0000\u0000\u0000\u077b\u0779\u0001"+
		"\u0000\u0000\u0000\u077b\u077c\u0001\u0000\u0000\u0000\u077c\u077f\u0001"+
		"\u0000\u0000\u0000\u077d\u077b\u0001\u0000\u0000\u0000\u077e\u0774\u0001"+
		"\u0000\u0000\u0000\u077e\u077f\u0001\u0000\u0000\u0000\u077f\u0781\u0001"+
		"\u0000\u0000\u0000\u0780\u0782\u0003\u015a\u00ad\u0000\u0781\u0780\u0001"+
		"\u0000\u0000\u0000\u0781\u0782\u0001\u0000\u0000\u0000\u0782\u0788\u0001"+
		"\u0000\u0000\u0000\u0783\u0786\u0005\u00a3\u0000\u0000\u0784\u0787\u0005"+
		"\n\u0000\u0000\u0785\u0787\u0003\u010a\u0085\u0000\u0786\u0784\u0001\u0000"+
		"\u0000\u0000\u0786\u0785\u0001\u0000\u0000\u0000\u0787\u0789\u0001\u0000"+
		"\u0000\u0000\u0788\u0783\u0001\u0000\u0000\u0000\u0788\u0789\u0001\u0000"+
		"\u0000\u0000\u0789\u078c\u0001\u0000\u0000\u0000\u078a\u078b\u0005\u00c6"+
		"\u0000\u0000\u078b\u078d\u0003\u010a\u0085\u0000\u078c\u078a\u0001\u0000"+
		"\u0000\u0000\u078c\u078d\u0001\u0000\u0000\u0000\u078dg\u0001\u0000\u0000"+
		"\u0000\u078e\u078f\u00032\u0019\u0000\u078f\u0790\u0003r9\u0000\u0790"+
		"i\u0001\u0000\u0000\u0000\u0791\u0792\u00065\uffff\uffff\u0000\u0792\u0793"+
		"\u0003l6\u0000\u0793\u07ab\u0001\u0000\u0000\u0000\u0794\u0795\n\u0003"+
		"\u0000\u0000\u0795\u0796\u00045\u0001\u0000\u0796\u0798\u0007\u000e\u0000"+
		"\u0000\u0797\u0799\u0003\u00c2a\u0000\u0798\u0797\u0001\u0000\u0000\u0000"+
		"\u0798\u0799\u0001\u0000\u0000\u0000\u0799\u079a\u0001\u0000\u0000\u0000"+
		"\u079a\u07aa\u0003j5";
	private static final String _serializedATNSegment1 =
		"\u0004\u079b\u079c\n\u0002\u0000\u0000\u079c\u079d\u00045\u0003\u0000"+
		"\u079d\u079f\u0005\u0093\u0000\u0000\u079e\u07a0\u0003\u00c2a\u0000\u079f"+
		"\u079e\u0001\u0000\u0000\u0000\u079f\u07a0\u0001\u0000\u0000\u0000\u07a0"+
		"\u07a1\u0001\u0000\u0000\u0000\u07a1\u07aa\u0003j5\u0003\u07a2\u07a3\n"+
		"\u0001\u0000\u0000\u07a3\u07a4\u00045\u0005\u0000\u07a4\u07a6\u0007\u000f"+
		"\u0000\u0000\u07a5\u07a7\u0003\u00c2a\u0000\u07a6\u07a5\u0001\u0000\u0000"+
		"\u0000\u07a6\u07a7\u0001\u0000\u0000\u0000\u07a7\u07a8\u0001\u0000\u0000"+
		"\u0000\u07a8\u07aa\u0003j5\u0002\u07a9\u0794\u0001\u0000\u0000\u0000\u07a9"+
		"\u079b\u0001\u0000\u0000\u0000\u07a9\u07a2\u0001\u0000\u0000\u0000\u07aa"+
		"\u07ad\u0001\u0000\u0000\u0000\u07ab\u07a9\u0001\u0000\u0000\u0000\u07ab"+
		"\u07ac\u0001\u0000\u0000\u0000\u07ack\u0001\u0000\u0000\u0000\u07ad\u07ab"+
		"\u0001\u0000\u0000\u0000\u07ae\u07b8\u0003t:\u0000\u07af\u07b8\u0003p"+
		"8\u0000\u07b0\u07b1\u0005\u011d\u0000\u0000\u07b1\u07b8\u0003d2\u0000"+
		"\u07b2\u07b8\u0003\u00e0p\u0000\u07b3\u07b4\u0005\u0002\u0000\u0000\u07b4"+
		"\u07b5\u00030\u0018\u0000\u07b5\u07b6\u0005\u0003\u0000\u0000\u07b6\u07b8"+
		"\u0001\u0000\u0000\u0000\u07b7\u07ae\u0001\u0000\u0000\u0000\u07b7\u07af"+
		"\u0001\u0000\u0000\u0000\u07b7\u07b0\u0001\u0000\u0000\u0000\u07b7\u07b2"+
		"\u0001\u0000\u0000\u0000\u07b7\u07b3\u0001\u0000\u0000\u0000\u07b8m\u0001"+
		"\u0000\u0000\u0000\u07b9\u07bb\u0003\u010a\u0085\u0000\u07ba\u07bc\u0007"+
		"\u0010\u0000\u0000\u07bb\u07ba\u0001\u0000\u0000\u0000\u07bb\u07bc\u0001"+
		"\u0000\u0000\u0000\u07bc\u07bf\u0001\u0000\u0000\u0000\u07bd\u07be\u0005"+
		"\u00c3\u0000\u0000\u07be\u07c0\u0007\u0011\u0000\u0000\u07bf\u07bd\u0001"+
		"\u0000\u0000\u0000\u07bf\u07c0\u0001\u0000\u0000\u0000\u07c0o\u0001\u0000"+
		"\u0000\u0000\u07c1\u07c3\u0003\u0096K\u0000\u07c2\u07c4\u0003r9\u0000"+
		"\u07c3\u07c2\u0001\u0000\u0000\u0000\u07c4\u07c5\u0001\u0000\u0000\u0000"+
		"\u07c5\u07c3\u0001\u0000\u0000\u0000\u07c5\u07c6\u0001\u0000\u0000\u0000"+
		"\u07c6q\u0001\u0000\u0000\u0000\u07c7\u07c9\u0003v;\u0000\u07c8\u07ca"+
		"\u0003\u008eG\u0000\u07c9\u07c8\u0001\u0000\u0000\u0000\u07c9\u07ca\u0001"+
		"\u0000\u0000\u0000\u07ca\u07cb\u0001\u0000\u0000\u0000\u07cb\u07cc\u0003"+
		"f3\u0000\u07cc\u07e3\u0001\u0000\u0000\u0000\u07cd\u07d1\u0003x<\u0000"+
		"\u07ce\u07d0\u0003\u00c0`\u0000\u07cf\u07ce\u0001\u0000\u0000\u0000\u07d0"+
		"\u07d3\u0001\u0000\u0000\u0000\u07d1\u07cf\u0001\u0000\u0000\u0000\u07d1"+
		"\u07d2\u0001\u0000\u0000\u0000\u07d2\u07d5\u0001\u0000\u0000\u0000\u07d3"+
		"\u07d1\u0001\u0000\u0000\u0000\u07d4\u07d6\u0003\u008eG\u0000\u07d5\u07d4"+
		"\u0001\u0000\u0000\u0000\u07d5\u07d6\u0001\u0000\u0000\u0000\u07d6\u07d8"+
		"\u0001\u0000\u0000\u0000\u07d7\u07d9\u0003\u009aM\u0000\u07d8\u07d7\u0001"+
		"\u0000\u0000\u0000\u07d8\u07d9\u0001\u0000\u0000\u0000\u07d9\u07db\u0001"+
		"\u0000\u0000\u0000\u07da\u07dc\u0003\u0090H\u0000\u07db\u07da\u0001\u0000"+
		"\u0000\u0000\u07db\u07dc\u0001\u0000\u0000\u0000\u07dc\u07de\u0001\u0000"+
		"\u0000\u0000\u07dd\u07df\u0003\u015a\u00ad\u0000\u07de\u07dd\u0001\u0000"+
		"\u0000\u0000\u07de\u07df\u0001\u0000\u0000\u0000\u07df\u07e0\u0001\u0000"+
		"\u0000\u0000\u07e0\u07e1\u0003f3\u0000\u07e1\u07e3\u0001\u0000\u0000\u0000"+
		"\u07e2\u07c7\u0001\u0000\u0000\u0000\u07e2\u07cd\u0001\u0000\u0000\u0000"+
		"\u07e3s\u0001\u0000\u0000\u0000\u07e4\u07e6\u0003v;\u0000\u07e5\u07e7"+
		"\u0003\u0096K\u0000\u07e6\u07e5\u0001\u0000\u0000\u0000\u07e6\u07e7\u0001"+
		"\u0000\u0000\u0000\u07e7\u07eb\u0001\u0000\u0000\u0000\u07e8\u07ea\u0003"+
		"\u00c0`\u0000\u07e9\u07e8\u0001\u0000\u0000\u0000\u07ea\u07ed\u0001\u0000"+
		"\u0000\u0000\u07eb\u07e9\u0001\u0000\u0000\u0000\u07eb\u07ec\u0001\u0000"+
		"\u0000\u0000\u07ec\u07ef\u0001\u0000\u0000\u0000\u07ed\u07eb\u0001\u0000"+
		"\u0000\u0000\u07ee\u07f0\u0003\u008eG\u0000\u07ef\u07ee\u0001\u0000\u0000"+
		"\u0000\u07ef\u07f0\u0001\u0000\u0000\u0000\u07f0\u07f2\u0001\u0000\u0000"+
		"\u0000\u07f1\u07f3\u0003\u009aM\u0000\u07f2\u07f1\u0001\u0000\u0000\u0000"+
		"\u07f2\u07f3\u0001\u0000\u0000\u0000\u07f3\u07f5\u0001\u0000\u0000\u0000"+
		"\u07f4\u07f6\u0003\u0090H\u0000\u07f5\u07f4\u0001\u0000\u0000\u0000\u07f5"+
		"\u07f6\u0001\u0000\u0000\u0000\u07f6\u07f8\u0001\u0000\u0000\u0000\u07f7"+
		"\u07f9\u0003\u015a\u00ad\u0000\u07f8\u07f7\u0001\u0000\u0000\u0000\u07f8"+
		"\u07f9\u0001\u0000\u0000\u0000\u07f9\u0811\u0001\u0000\u0000\u0000\u07fa"+
		"\u07fc\u0003x<\u0000\u07fb\u07fd\u0003\u0096K\u0000\u07fc\u07fb\u0001"+
		"\u0000\u0000\u0000\u07fc\u07fd\u0001\u0000\u0000\u0000\u07fd\u0801\u0001"+
		"\u0000\u0000\u0000\u07fe\u0800\u0003\u00c0`\u0000\u07ff\u07fe\u0001\u0000"+
		"\u0000\u0000\u0800\u0803\u0001\u0000\u0000\u0000\u0801\u07ff\u0001\u0000"+
		"\u0000\u0000\u0801\u0802\u0001\u0000\u0000\u0000\u0802\u0805\u0001\u0000"+
		"\u0000\u0000\u0803\u0801\u0001\u0000\u0000\u0000\u0804\u0806\u0003\u008e"+
		"G\u0000\u0805\u0804\u0001\u0000\u0000\u0000\u0805\u0806\u0001\u0000\u0000"+
		"\u0000\u0806\u0808\u0001\u0000\u0000\u0000\u0807\u0809\u0003\u009aM\u0000"+
		"\u0808\u0807\u0001\u0000\u0000\u0000\u0808\u0809\u0001\u0000\u0000\u0000"+
		"\u0809\u080b\u0001\u0000\u0000\u0000\u080a\u080c\u0003\u0090H\u0000\u080b"+
		"\u080a\u0001\u0000\u0000\u0000\u080b\u080c\u0001\u0000\u0000\u0000\u080c"+
		"\u080e\u0001\u0000\u0000\u0000\u080d\u080f\u0003\u015a\u00ad\u0000\u080e"+
		"\u080d\u0001\u0000\u0000\u0000\u080e\u080f\u0001\u0000\u0000\u0000\u080f"+
		"\u0811\u0001\u0000\u0000\u0000\u0810\u07e4\u0001\u0000\u0000\u0000\u0810"+
		"\u07fa\u0001\u0000\u0000\u0000\u0811u\u0001\u0000\u0000\u0000\u0812\u0813"+
		"\u0005\u0100\u0000\u0000\u0813\u0814\u0005\u0133\u0000\u0000\u0814\u0816"+
		"\u0005\u0002\u0000\u0000\u0815\u0817\u0003\u00c2a\u0000\u0816\u0815\u0001"+
		"\u0000\u0000\u0000\u0816\u0817\u0001\u0000\u0000\u0000\u0817\u0818\u0001"+
		"\u0000\u0000\u0000\u0818\u0819\u0003\u0110\u0088\u0000\u0819\u081a\u0005"+
		"\u0003\u0000\u0000\u081a\u0826\u0001\u0000\u0000\u0000\u081b\u081d\u0005"+
		"\u00ae\u0000\u0000\u081c\u081e\u0003\u00c2a\u0000\u081d\u081c\u0001\u0000"+
		"\u0000\u0000\u081d\u081e\u0001\u0000\u0000\u0000\u081e\u081f\u0001\u0000"+
		"\u0000\u0000\u081f\u0826\u0003\u0110\u0088\u0000\u0820\u0822\u0005\u00e9"+
		"\u0000\u0000\u0821\u0823\u0003\u00c2a\u0000\u0822\u0821\u0001\u0000\u0000"+
		"\u0000\u0822\u0823\u0001\u0000\u0000\u0000\u0823\u0824\u0001\u0000\u0000"+
		"\u0000\u0824\u0826\u0003\u0110\u0088\u0000\u0825\u0812\u0001\u0000\u0000"+
		"\u0000\u0825\u081b\u0001\u0000\u0000\u0000\u0825\u0820\u0001\u0000\u0000"+
		"\u0000\u0826\u0828\u0001\u0000\u0000\u0000\u0827\u0829\u0003\u00f0x\u0000"+
		"\u0828\u0827\u0001\u0000\u0000\u0000\u0828\u0829\u0001\u0000\u0000\u0000"+
		"\u0829\u082c\u0001\u0000\u0000\u0000\u082a\u082b\u0005\u00e7\u0000\u0000"+
		"\u082b\u082d\u0003\u017a\u00bd\u0000\u082c\u082a\u0001\u0000\u0000\u0000"+
		"\u082c\u082d\u0001\u0000\u0000\u0000\u082d\u082e\u0001\u0000\u0000\u0000"+
		"\u082e\u082f\u0005\u0145\u0000\u0000\u082f\u083c\u0003\u017a\u00bd\u0000"+
		"\u0830\u083a\u0005\u0014\u0000\u0000\u0831\u083b\u0003\u00d4j\u0000\u0832"+
		"\u083b\u0003\u0148\u00a4\u0000\u0833\u0836\u0005\u0002\u0000\u0000\u0834"+
		"\u0837\u0003\u00d4j\u0000\u0835\u0837\u0003\u0148\u00a4\u0000\u0836\u0834"+
		"\u0001\u0000\u0000\u0000\u0836\u0835\u0001\u0000\u0000\u0000\u0837\u0838"+
		"\u0001\u0000\u0000\u0000\u0838\u0839\u0005\u0003\u0000\u0000\u0839\u083b"+
		"\u0001\u0000\u0000\u0000\u083a\u0831\u0001\u0000\u0000\u0000\u083a\u0832"+
		"\u0001\u0000\u0000\u0000\u083a\u0833\u0001\u0000\u0000\u0000\u083b\u083d"+
		"\u0001\u0000\u0000\u0000\u083c\u0830\u0001\u0000\u0000\u0000\u083c\u083d"+
		"\u0001\u0000\u0000\u0000\u083d\u083f\u0001\u0000\u0000\u0000\u083e\u0840"+
		"\u0003\u00f0x\u0000\u083f\u083e\u0001\u0000\u0000\u0000\u083f\u0840\u0001"+
		"\u0000\u0000\u0000\u0840\u0843\u0001\u0000\u0000\u0000\u0841\u0842\u0005"+
		"\u00e6\u0000\u0000\u0842\u0844\u0003\u017a\u00bd\u0000\u0843\u0841\u0001"+
		"\u0000\u0000\u0000\u0843\u0844\u0001\u0000\u0000\u0000\u0844w\u0001\u0000"+
		"\u0000\u0000\u0845\u0849\u0005\u0100\u0000\u0000\u0846\u0848\u0003\u0092"+
		"I\u0000\u0847\u0846\u0001\u0000\u0000\u0000\u0848\u084b\u0001\u0000\u0000"+
		"\u0000\u0849\u0847\u0001\u0000\u0000\u0000\u0849\u084a\u0001\u0000\u0000"+
		"\u0000\u084a\u084d\u0001\u0000\u0000\u0000\u084b\u0849\u0001\u0000\u0000"+
		"\u0000\u084c\u084e\u0003\u00c2a\u0000\u084d\u084c\u0001\u0000\u0000\u0000"+
		"\u084d\u084e\u0001\u0000\u0000\u0000\u084e\u084f\u0001\u0000\u0000\u0000"+
		"\u084f\u0850\u0003\u0100\u0080\u0000\u0850y\u0001\u0000\u0000\u0000\u0851"+
		"\u0852\u0005\u0106\u0000\u0000\u0852\u0853\u0003\u008aE\u0000\u0853{\u0001"+
		"\u0000\u0000\u0000\u0854\u0855\u0005\u0151\u0000\u0000\u0855\u0858\u0005"+
		"\u00af\u0000\u0000\u0856\u0857\u0005\u000e\u0000\u0000\u0857\u0859\u0003"+
		"\u0112\u0089\u0000\u0858\u0856\u0001\u0000\u0000\u0000\u0858\u0859\u0001"+
		"\u0000\u0000\u0000\u0859\u085a\u0001\u0000\u0000\u0000\u085a\u085b\u0005"+
		"\u0124\u0000\u0000\u085b\u085c\u0003\u0082A\u0000\u085c}\u0001\u0000\u0000"+
		"\u0000\u085d\u085e\u0005\u0151\u0000\u0000\u085e\u085f\u0005\u00c1\u0000"+
		"\u0000\u085f\u0862\u0005\u00af\u0000\u0000\u0860\u0861\u0005\u001f\u0000"+
		"\u0000\u0861\u0863\u0005\u0120\u0000\u0000\u0862\u0860\u0001\u0000\u0000"+
		"\u0000\u0862\u0863\u0001\u0000\u0000\u0000\u0863\u0866\u0001\u0000\u0000"+
		"\u0000\u0864\u0865\u0005\u000e\u0000\u0000\u0865\u0867\u0003\u0112\u0089"+
		"\u0000\u0866\u0864\u0001\u0000\u0000\u0000\u0866\u0867\u0001\u0000\u0000"+
		"\u0000\u0867\u0868\u0001\u0000\u0000\u0000\u0868\u0869\u0005\u0124\u0000"+
		"\u0000\u0869\u086a\u0003\u0084B\u0000\u086a\u007f\u0001\u0000\u0000\u0000"+
		"\u086b\u086c\u0005\u0151\u0000\u0000\u086c\u086d\u0005\u00c1\u0000\u0000"+
		"\u086d\u086e\u0005\u00af\u0000\u0000\u086e\u086f\u0005\u001f\u0000\u0000"+
		"\u086f\u0872\u0005\u0111\u0000\u0000\u0870\u0871\u0005\u000e\u0000\u0000"+
		"\u0871\u0873\u0003\u0112\u0089\u0000\u0872\u0870\u0001\u0000\u0000\u0000"+
		"\u0872\u0873\u0001\u0000\u0000\u0000\u0873\u0874\u0001\u0000\u0000\u0000"+
		"\u0874\u0875\u0005\u0124\u0000\u0000\u0875\u0876\u0003\u0086C\u0000\u0876"+
		"\u0081\u0001\u0000\u0000\u0000\u0877\u087f\u0005T\u0000\u0000\u0878\u0879"+
		"\u0005\u0142\u0000\u0000\u0879\u087a\u0005\u0106\u0000\u0000\u087a\u087f"+
		"\u0005\u0163\u0000\u0000\u087b\u087c\u0005\u0142\u0000\u0000\u087c\u087d"+
		"\u0005\u0106\u0000\u0000\u087d\u087f\u0003\u008aE\u0000\u087e\u0877\u0001"+
		"\u0000\u0000\u0000\u087e\u0878\u0001\u0000\u0000\u0000\u087e\u087b\u0001"+
		"\u0000\u0000\u0000\u087f\u0083\u0001\u0000\u0000\u0000\u0880\u0881\u0005"+
		"\u0092\u0000\u0000\u0881\u0893\u0005\u0163\u0000\u0000\u0882\u0883\u0005"+
		"\u0092\u0000\u0000\u0883\u0884\u0005\u0002\u0000\u0000\u0884\u0885\u0003"+
		"\u00f2y\u0000\u0885\u0886\u0005\u0003\u0000\u0000\u0886\u0887\u0005\u0146"+
		"\u0000\u0000\u0887\u0888\u0005\u0002\u0000\u0000\u0888\u088d\u0003\u010a"+
		"\u0085\u0000\u0889\u088a\u0005\u0004\u0000\u0000\u088a\u088c\u0003\u010a"+
		"\u0085\u0000\u088b\u0889\u0001\u0000\u0000\u0000\u088c\u088f\u0001\u0000"+
		"\u0000\u0000\u088d\u088b\u0001\u0000\u0000\u0000\u088d\u088e\u0001\u0000"+
		"\u0000\u0000\u088e\u0890\u0001\u0000\u0000\u0000\u088f\u088d\u0001\u0000"+
		"\u0000\u0000\u0890\u0891\u0005\u0003\u0000\u0000\u0891\u0893\u0001\u0000"+
		"\u0000\u0000\u0892\u0880\u0001\u0000\u0000\u0000\u0892\u0882\u0001\u0000"+
		"\u0000\u0000\u0893\u0085\u0001\u0000\u0000\u0000\u0894\u0899\u0005T\u0000"+
		"\u0000\u0895\u0896\u0005\u0142\u0000\u0000\u0896\u0897\u0005\u0106\u0000"+
		"\u0000\u0897\u0899\u0003\u008aE\u0000\u0898\u0894\u0001\u0000\u0000\u0000"+
		"\u0898\u0895\u0001\u0000\u0000\u0000\u0899\u0087\u0001\u0000\u0000\u0000"+
		"\u089a\u089b\u0005d\u0000\u0000\u089b\u089c\u0005\u0002\u0000\u0000\u089c"+
		"\u089d\u0003\u00f2y\u0000\u089d\u089e\u0005\u0003\u0000\u0000\u089e\u0089"+
		"\u0001\u0000\u0000\u0000\u089f\u08a4\u0003\u008cF\u0000\u08a0\u08a1\u0005"+
		"\u0004\u0000\u0000\u08a1\u08a3\u0003\u008cF\u0000\u08a2\u08a0\u0001\u0000"+
		"\u0000\u0000\u08a3\u08a6\u0001\u0000\u0000\u0000\u08a4\u08a2\u0001\u0000"+
		"\u0000\u0000\u08a4\u08a5\u0001\u0000\u0000\u0000\u08a5\u008b\u0001\u0000"+
		"\u0000\u0000\u08a6\u08a4\u0001\u0000\u0000\u0000\u08a7\u08a8\u0003\u00f4"+
		"z\u0000\u08a8\u08a9\u0005\u0159\u0000\u0000\u08a9\u08aa\u0003\u010a\u0085"+
		"\u0000\u08aa\u008d\u0001\u0000\u0000\u0000\u08ab\u08ac\u0005\u0152\u0000"+
		"\u0000\u08ac\u08ad\u0003\u0112\u0089\u0000\u08ad\u008f\u0001\u0000\u0000"+
		"\u0000\u08ae\u08af\u0005\u0082\u0000\u0000\u08af\u08b0\u0003\u0112\u0089"+
		"\u0000\u08b0\u0091\u0001\u0000\u0000\u0000\u08b1\u08b2\u0005\u016f\u0000"+
		"\u0000\u08b2\u08b9\u0003\u0094J\u0000\u08b3\u08b5\u0005\u0004\u0000\u0000"+
		"\u08b4\u08b3\u0001\u0000\u0000\u0000\u08b4\u08b5\u0001\u0000\u0000\u0000"+
		"\u08b5\u08b6\u0001\u0000\u0000\u0000\u08b6\u08b8\u0003\u0094J\u0000\u08b7"+
		"\u08b4\u0001\u0000\u0000\u0000\u08b8\u08bb\u0001\u0000\u0000\u0000\u08b9"+
		"\u08b7\u0001\u0000\u0000\u0000\u08b9\u08ba\u0001\u0000\u0000\u0000\u08ba"+
		"\u08bc\u0001\u0000\u0000\u0000\u08bb\u08b9\u0001\u0000\u0000\u0000\u08bc"+
		"\u08bd\u0005\u0170\u0000\u0000\u08bd\u0093\u0001\u0000\u0000\u0000\u08be"+
		"\u08cc\u0003\u016e\u00b7\u0000\u08bf\u08c0\u0003\u016e\u00b7\u0000\u08c0"+
		"\u08c1\u0005\u0002\u0000\u0000\u08c1\u08c6\u0003\u011a\u008d\u0000\u08c2"+
		"\u08c3\u0005\u0004\u0000\u0000\u08c3\u08c5\u0003\u011a\u008d\u0000\u08c4"+
		"\u08c2\u0001\u0000\u0000\u0000\u08c5\u08c8\u0001\u0000\u0000\u0000\u08c6"+
		"\u08c4\u0001\u0000\u0000\u0000\u08c6\u08c7\u0001\u0000\u0000\u0000\u08c7"+
		"\u08c9\u0001\u0000\u0000\u0000\u08c8\u08c6\u0001\u0000\u0000\u0000\u08c9"+
		"\u08ca\u0005\u0003\u0000\u0000\u08ca\u08cc\u0001\u0000\u0000\u0000\u08cb"+
		"\u08be\u0001\u0000\u0000\u0000\u08cb\u08bf\u0001\u0000\u0000\u0000\u08cc"+
		"\u0095\u0001\u0000\u0000\u0000\u08cd\u08ce\u0005y\u0000\u0000\u08ce\u08d3"+
		"\u0003\u00c4b\u0000\u08cf\u08d0\u0005\u0004\u0000\u0000\u08d0\u08d2\u0003"+
		"\u00c4b\u0000\u08d1\u08cf\u0001\u0000\u0000\u0000\u08d2\u08d5\u0001\u0000"+
		"\u0000\u0000\u08d3\u08d1\u0001\u0000\u0000\u0000\u08d3\u08d4\u0001\u0000"+
		"\u0000\u0000\u08d4\u08d9\u0001\u0000\u0000\u0000\u08d5\u08d3\u0001\u0000"+
		"\u0000\u0000\u08d6\u08d8\u0003\u00c0`\u0000\u08d7\u08d6\u0001\u0000\u0000"+
		"\u0000\u08d8\u08db\u0001\u0000\u0000\u0000\u08d9\u08d7\u0001\u0000\u0000"+
		"\u0000\u08d9\u08da\u0001\u0000\u0000\u0000\u08da\u08dd\u0001\u0000\u0000"+
		"\u0000\u08db\u08d9\u0001\u0000\u0000\u0000\u08dc\u08de\u0003\u00a4R\u0000"+
		"\u08dd\u08dc\u0001\u0000\u0000\u0000\u08dd\u08de\u0001\u0000\u0000\u0000"+
		"\u08de\u08e0\u0001\u0000\u0000\u0000\u08df\u08e1\u0003\u00aaU\u0000\u08e0"+
		"\u08df\u0001\u0000\u0000\u0000\u08e0\u08e1\u0001\u0000\u0000\u0000\u08e1"+
		"\u0097\u0001\u0000\u0000\u0000\u08e2\u08e4\u0005u\u0000\u0000\u08e3\u08e2"+
		"\u0001\u0000\u0000\u0000\u08e3\u08e4\u0001\u0000\u0000\u0000\u08e4\u08e5"+
		"\u0001\u0000\u0000\u0000\u08e5\u08e6\u0007\u0012\u0000\u0000\u08e6\u08e7"+
		"\u0005\u0014\u0000\u0000\u08e7\u08e8\u0005\u00c5\u0000\u0000\u08e8\u08f1"+
		"\u0003\u017e\u00bf\u0000\u08e9\u08eb\u0005u\u0000\u0000\u08ea\u08e9\u0001"+
		"\u0000\u0000\u0000\u08ea\u08eb\u0001\u0000\u0000\u0000\u08eb\u08ec\u0001"+
		"\u0000\u0000\u0000\u08ec\u08ed\u0007\u0013\u0000\u0000\u08ed\u08ee\u0005"+
		"\u0014\u0000\u0000\u08ee\u08ef\u0005\u00c5\u0000\u0000\u08ef\u08f1\u0003"+
		"\u0116\u008b\u0000\u08f0\u08e3\u0001\u0000\u0000\u0000\u08f0\u08ea\u0001"+
		"\u0000\u0000\u0000\u08f1\u0099\u0001\u0000\u0000\u0000\u08f2\u08f3\u0005"+
		"\u0080\u0000\u0000\u08f3\u08f4\u0005\u001f\u0000\u0000\u08f4\u08f9\u0003"+
		"\u009cN\u0000\u08f5\u08f6\u0005\u0004\u0000\u0000\u08f6\u08f8\u0003\u009c"+
		"N\u0000\u08f7\u08f5\u0001\u0000\u0000\u0000\u08f8\u08fb\u0001\u0000\u0000"+
		"\u0000\u08f9\u08f7\u0001\u0000\u0000\u0000\u08f9\u08fa\u0001\u0000\u0000"+
		"\u0000\u08fa\u091a\u0001\u0000\u0000\u0000\u08fb\u08f9\u0001\u0000\u0000"+
		"\u0000\u08fc\u08fd\u0005\u0080\u0000\u0000\u08fd\u08fe\u0005\u001f\u0000"+
		"\u0000\u08fe\u0903\u0003\u010a\u0085\u0000\u08ff\u0900\u0005\u0004\u0000"+
		"\u0000\u0900\u0902\u0003\u010a\u0085\u0000\u0901\u08ff\u0001\u0000\u0000"+
		"\u0000\u0902\u0905\u0001\u0000\u0000\u0000\u0903\u0901\u0001\u0000\u0000"+
		"\u0000\u0903\u0904\u0001\u0000\u0000\u0000\u0904\u0917\u0001\u0000\u0000"+
		"\u0000\u0905\u0903\u0001\u0000\u0000\u0000\u0906\u0907\u0005\u0154\u0000"+
		"\u0000\u0907\u0918\u0005\u00f9\u0000\u0000\u0908\u0909\u0005\u0154\u0000"+
		"\u0000\u0909\u0918\u0005=\u0000\u0000\u090a\u090b\u0005\u0081\u0000\u0000"+
		"\u090b\u090c\u0005\u0108\u0000\u0000\u090c\u090d\u0005\u0002\u0000\u0000"+
		"\u090d\u0912\u0003\u00a2Q\u0000\u090e\u090f\u0005\u0004\u0000\u0000\u090f"+
		"\u0911\u0003\u00a2Q\u0000\u0910\u090e\u0001\u0000\u0000\u0000\u0911\u0914"+
		"\u0001\u0000\u0000\u0000\u0912\u0910\u0001\u0000\u0000\u0000\u0912\u0913"+
		"\u0001\u0000\u0000\u0000\u0913\u0915\u0001\u0000\u0000\u0000\u0914\u0912"+
		"\u0001\u0000\u0000\u0000\u0915\u0916\u0005\u0003\u0000\u0000\u0916\u0918"+
		"\u0001\u0000\u0000\u0000\u0917\u0906\u0001\u0000\u0000\u0000\u0917\u0908"+
		"\u0001\u0000\u0000\u0000\u0917\u090a\u0001\u0000\u0000\u0000\u0917\u0918"+
		"\u0001\u0000\u0000\u0000\u0918\u091a\u0001\u0000\u0000\u0000\u0919\u08f2"+
		"\u0001\u0000\u0000\u0000\u0919\u08fc\u0001\u0000\u0000\u0000\u091a\u009b"+
		"\u0001\u0000\u0000\u0000\u091b\u091e\u0003\u009eO\u0000\u091c\u091e\u0003"+
		"\u010a\u0085\u0000\u091d\u091b\u0001\u0000\u0000\u0000\u091d\u091c\u0001"+
		"\u0000\u0000\u0000\u091e\u009d\u0001\u0000\u0000\u0000\u091f\u0920\u0007"+
		"\u0014\u0000\u0000\u0920\u0921\u0005\u0002\u0000\u0000\u0921\u0926\u0003"+
		"\u00a2Q\u0000\u0922\u0923\u0005\u0004\u0000\u0000\u0923\u0925\u0003\u00a2"+
		"Q\u0000\u0924\u0922\u0001\u0000\u0000\u0000\u0925\u0928\u0001\u0000\u0000"+
		"\u0000\u0926\u0924\u0001\u0000\u0000\u0000\u0926\u0927\u0001\u0000\u0000"+
		"\u0000\u0927\u0929\u0001\u0000\u0000\u0000\u0928\u0926\u0001\u0000\u0000"+
		"\u0000\u0929\u092a\u0005\u0003\u0000\u0000\u092a\u0939\u0001\u0000\u0000"+
		"\u0000\u092b\u092c\u0005\u0081\u0000\u0000\u092c\u092d\u0005\u0108\u0000"+
		"\u0000\u092d\u092e\u0005\u0002\u0000\u0000\u092e\u0933\u0003\u00a0P\u0000"+
		"\u092f\u0930\u0005\u0004\u0000\u0000\u0930\u0932\u0003\u00a0P\u0000\u0931"+
		"\u092f\u0001\u0000\u0000\u0000\u0932\u0935\u0001\u0000\u0000\u0000\u0933"+
		"\u0931\u0001\u0000\u0000\u0000\u0933\u0934\u0001\u0000\u0000\u0000\u0934"+
		"\u0936\u0001\u0000\u0000\u0000\u0935\u0933\u0001\u0000\u0000\u0000\u0936"+
		"\u0937\u0005\u0003\u0000\u0000\u0937\u0939\u0001\u0000\u0000\u0000\u0938"+
		"\u091f\u0001\u0000\u0000\u0000\u0938\u092b\u0001\u0000\u0000\u0000\u0939"+
		"\u009f\u0001\u0000\u0000\u0000\u093a\u093d\u0003\u009eO\u0000\u093b\u093d"+
		"\u0003\u00a2Q\u0000\u093c\u093a\u0001\u0000\u0000\u0000\u093c\u093b\u0001"+
		"\u0000\u0000\u0000\u093d\u00a1\u0001\u0000\u0000\u0000\u093e\u0947\u0005"+
		"\u0002\u0000\u0000\u093f\u0944\u0003\u010a\u0085\u0000\u0940\u0941\u0005"+
		"\u0004\u0000\u0000\u0941\u0943\u0003\u010a\u0085\u0000\u0942\u0940\u0001"+
		"\u0000\u0000\u0000\u0943\u0946\u0001\u0000\u0000\u0000\u0944\u0942\u0001"+
		"\u0000\u0000\u0000\u0944\u0945\u0001\u0000\u0000\u0000\u0945\u0948\u0001"+
		"\u0000\u0000\u0000\u0946\u0944\u0001\u0000\u0000\u0000\u0947\u093f\u0001"+
		"\u0000\u0000\u0000\u0947\u0948\u0001\u0000\u0000\u0000\u0948\u0949\u0001"+
		"\u0000\u0000\u0000\u0949\u094c\u0005\u0003\u0000\u0000\u094a\u094c\u0003"+
		"\u010a\u0085\u0000\u094b\u093e\u0001\u0000\u0000\u0000\u094b\u094a\u0001"+
		"\u0000\u0000\u0000\u094c\u00a3\u0001\u0000\u0000\u0000\u094d\u094e\u0005"+
		"\u00da\u0000\u0000\u094e\u094f\u0005\u0002\u0000\u0000\u094f\u0950\u0003"+
		"\u0100\u0080\u0000\u0950\u0951\u0005u\u0000\u0000\u0951\u0952\u0003\u00a6"+
		"S\u0000\u0952\u0953\u0005\u008b\u0000\u0000\u0953\u0954\u0005\u0002\u0000"+
		"\u0000\u0954\u0959\u0003\u00a8T\u0000\u0955\u0956\u0005\u0004\u0000\u0000"+
		"\u0956\u0958\u0003\u00a8T\u0000\u0957\u0955\u0001\u0000\u0000\u0000\u0958"+
		"\u095b\u0001\u0000\u0000\u0000\u0959\u0957\u0001\u0000\u0000\u0000\u0959"+
		"\u095a\u0001\u0000\u0000\u0000\u095a\u095c\u0001\u0000\u0000\u0000\u095b"+
		"\u0959\u0001\u0000\u0000\u0000\u095c\u095d\u0005\u0003\u0000\u0000\u095d"+
		"\u095e\u0005\u0003\u0000\u0000\u095e\u00a5\u0001\u0000\u0000\u0000\u095f"+
		"\u096c\u0003\u016e\u00b7\u0000\u0960\u0961\u0005\u0002\u0000\u0000\u0961"+
		"\u0966\u0003\u016e\u00b7\u0000\u0962\u0963\u0005\u0004\u0000\u0000\u0963"+
		"\u0965\u0003\u016e\u00b7\u0000\u0964\u0962\u0001\u0000\u0000\u0000\u0965"+
		"\u0968\u0001\u0000\u0000\u0000\u0966\u0964\u0001\u0000\u0000\u0000\u0966"+
		"\u0967\u0001\u0000\u0000\u0000\u0967\u0969\u0001\u0000\u0000\u0000\u0968"+
		"\u0966\u0001\u0000\u0000\u0000\u0969\u096a\u0005\u0003\u0000\u0000\u096a"+
		"\u096c\u0001\u0000\u0000\u0000\u096b\u095f\u0001\u0000\u0000\u0000\u096b"+
		"\u0960\u0001\u0000\u0000\u0000\u096c\u00a7\u0001\u0000\u0000\u0000\u096d"+
		"\u0972\u0003\u010a\u0085\u0000\u096e\u0970\u0005\u0014\u0000\u0000\u096f"+
		"\u096e\u0001\u0000\u0000\u0000\u096f\u0970\u0001\u0000\u0000\u0000\u0970"+
		"\u0971\u0001\u0000\u0000\u0000\u0971\u0973\u0003\u016e\u00b7\u0000\u0972"+
		"\u096f\u0001\u0000\u0000\u0000\u0972\u0973\u0001\u0000\u0000\u0000\u0973"+
		"\u00a9\u0001\u0000\u0000\u0000\u0974\u0976\u0005\u0140\u0000\u0000\u0975"+
		"\u0977\u0003\u00acV\u0000\u0976\u0975\u0001\u0000\u0000\u0000\u0976\u0977"+
		"\u0001\u0000\u0000\u0000\u0977\u0978\u0001\u0000\u0000\u0000\u0978\u0979"+
		"\u0005\u0002\u0000\u0000\u0979\u097a\u0003\u00aeW\u0000\u097a\u097f\u0005"+
		"\u0003\u0000\u0000\u097b\u097d\u0005\u0014\u0000\u0000\u097c\u097b\u0001"+
		"\u0000\u0000\u0000\u097c\u097d\u0001\u0000\u0000\u0000\u097d\u097e\u0001"+
		"\u0000\u0000\u0000\u097e\u0980\u0003\u016e\u00b7\u0000\u097f\u097c\u0001"+
		"\u0000\u0000\u0000\u097f\u0980\u0001\u0000\u0000\u0000\u0980\u00ab\u0001"+
		"\u0000\u0000\u0000\u0981\u0982\u0007\u0015\u0000\u0000\u0982\u0983\u0005"+
		"\u00c3\u0000\u0000\u0983\u00ad\u0001\u0000\u0000\u0000\u0984\u0987\u0003"+
		"\u00b0X\u0000\u0985\u0987\u0003\u00b2Y\u0000\u0986\u0984\u0001\u0000\u0000"+
		"\u0000\u0986\u0985\u0001\u0000\u0000\u0000\u0987\u00af\u0001\u0000\u0000"+
		"\u0000\u0988\u0989\u0003\u00b6[\u0000\u0989\u098a\u0005u\u0000\u0000\u098a"+
		"\u098b\u0003\u00b8\\\u0000\u098b\u098c\u0005\u008b\u0000\u0000\u098c\u098d"+
		"\u0005\u0002\u0000\u0000\u098d\u0992\u0003\u00ba]\u0000\u098e\u098f\u0005"+
		"\u0004\u0000\u0000\u098f\u0991\u0003\u00ba]\u0000\u0990\u098e\u0001\u0000"+
		"\u0000\u0000\u0991\u0994\u0001\u0000\u0000\u0000\u0992\u0990\u0001\u0000"+
		"\u0000\u0000\u0992\u0993\u0001\u0000\u0000\u0000\u0993\u0995\u0001\u0000"+
		"\u0000\u0000\u0994\u0992\u0001\u0000\u0000\u0000\u0995\u0996\u0005\u0003"+
		"\u0000\u0000\u0996\u00b1\u0001\u0000\u0000\u0000\u0997\u0998\u0005\u0002"+
		"\u0000\u0000\u0998\u099d\u0003\u00b6[\u0000\u0999\u099a\u0005\u0004\u0000"+
		"\u0000\u099a\u099c\u0003\u00b6[\u0000\u099b\u0999\u0001\u0000\u0000\u0000"+
		"\u099c\u099f\u0001\u0000\u0000\u0000\u099d\u099b\u0001\u0000\u0000\u0000"+
		"\u099d\u099e\u0001\u0000\u0000\u0000\u099e\u09a0\u0001\u0000\u0000\u0000"+
		"\u099f\u099d\u0001\u0000\u0000\u0000\u09a0\u09a1\u0005\u0003\u0000\u0000"+
		"\u09a1\u09a2\u0005u\u0000\u0000\u09a2\u09a3\u0003\u00b8\\\u0000\u09a3"+
		"\u09a4\u0005\u008b\u0000\u0000\u09a4\u09a5\u0005\u0002\u0000\u0000\u09a5"+
		"\u09aa\u0003\u00b4Z\u0000\u09a6\u09a7\u0005\u0004\u0000\u0000\u09a7\u09a9"+
		"\u0003\u00b4Z\u0000\u09a8\u09a6\u0001\u0000\u0000\u0000\u09a9\u09ac\u0001"+
		"\u0000\u0000\u0000\u09aa\u09a8\u0001\u0000\u0000\u0000\u09aa\u09ab\u0001"+
		"\u0000\u0000\u0000\u09ab\u09ad\u0001\u0000\u0000\u0000\u09ac\u09aa\u0001"+
		"\u0000\u0000\u0000\u09ad\u09ae\u0005\u0003\u0000\u0000\u09ae\u00b3\u0001"+
		"\u0000\u0000\u0000\u09af\u09b0\u0005\u0002\u0000\u0000\u09b0\u09b5\u0003"+
		"\u00bc^\u0000\u09b1\u09b2\u0005\u0004\u0000\u0000\u09b2\u09b4\u0003\u00bc"+
		"^\u0000\u09b3\u09b1\u0001\u0000\u0000\u0000\u09b4\u09b7\u0001\u0000\u0000"+
		"\u0000\u09b5\u09b3\u0001\u0000\u0000\u0000\u09b5\u09b6\u0001\u0000\u0000"+
		"\u0000\u09b6\u09b8\u0001\u0000\u0000\u0000\u09b7\u09b5\u0001\u0000\u0000"+
		"\u0000\u09b8\u09ba\u0005\u0003\u0000\u0000\u09b9\u09bb\u0003\u00be_\u0000"+
		"\u09ba\u09b9\u0001\u0000\u0000\u0000\u09ba\u09bb\u0001\u0000\u0000\u0000"+
		"\u09bb\u00b5\u0001\u0000\u0000\u0000\u09bc\u09bd\u0003\u016e\u00b7\u0000"+
		"\u09bd\u00b7\u0001\u0000\u0000\u0000\u09be\u09bf\u0003\u016e\u00b7\u0000"+
		"\u09bf\u00b9\u0001\u0000\u0000\u0000\u09c0\u09c2\u0003\u00bc^\u0000\u09c1"+
		"\u09c3\u0003\u00be_\u0000\u09c2\u09c1\u0001\u0000\u0000\u0000\u09c2\u09c3"+
		"\u0001\u0000\u0000\u0000\u09c3\u00bb\u0001\u0000\u0000\u0000\u09c4\u09c5"+
		"\u0003\u00f4z\u0000\u09c5\u00bd\u0001\u0000\u0000\u0000\u09c6\u09c8\u0005"+
		"\u0014\u0000\u0000\u09c7\u09c6\u0001\u0000\u0000\u0000\u09c7\u09c8\u0001"+
		"\u0000\u0000\u0000\u09c8\u09c9\u0001\u0000\u0000\u0000\u09c9\u09ca\u0003"+
		"\u016e\u00b7\u0000\u09ca\u00bf\u0001\u0000\u0000\u0000\u09cb\u09cc\u0005"+
		"\u009d\u0000\u0000\u09cc\u09ce\u0005\u014c\u0000\u0000\u09cd\u09cf\u0005"+
		"\u00ce\u0000\u0000\u09ce\u09cd\u0001\u0000\u0000\u0000\u09ce\u09cf\u0001"+
		"\u0000\u0000\u0000\u09cf\u09d0\u0001\u0000\u0000\u0000\u09d0\u09d1\u0003"+
		"\u0168\u00b4\u0000\u09d1\u09da\u0005\u0002\u0000\u0000\u09d2\u09d7\u0003"+
		"\u010a\u0085\u0000\u09d3\u09d4\u0005\u0004\u0000\u0000\u09d4\u09d6\u0003"+
		"\u010a\u0085\u0000\u09d5\u09d3\u0001\u0000\u0000\u0000\u09d6\u09d9\u0001"+
		"\u0000\u0000\u0000\u09d7\u09d5\u0001\u0000\u0000\u0000\u09d7\u09d8\u0001"+
		"\u0000\u0000\u0000\u09d8\u09db\u0001\u0000\u0000\u0000\u09d9\u09d7\u0001"+
		"\u0000\u0000\u0000\u09da\u09d2\u0001\u0000\u0000\u0000\u09da\u09db\u0001"+
		"\u0000\u0000\u0000\u09db\u09dc\u0001\u0000\u0000\u0000\u09dc\u09dd\u0005"+
		"\u0003\u0000\u0000\u09dd\u09e9\u0003\u016e\u00b7\u0000\u09de\u09e0\u0005"+
		"\u0014\u0000\u0000\u09df\u09de\u0001\u0000\u0000\u0000\u09df\u09e0\u0001"+
		"\u0000\u0000\u0000\u09e0\u09e1\u0001\u0000\u0000\u0000\u09e1\u09e6\u0003"+
		"\u016e\u00b7\u0000\u09e2\u09e3\u0005\u0004\u0000\u0000\u09e3\u09e5\u0003"+
		"\u016e\u00b7\u0000\u09e4\u09e2\u0001\u0000\u0000\u0000\u09e5\u09e8\u0001"+
		"\u0000\u0000\u0000\u09e6\u09e4\u0001\u0000\u0000\u0000\u09e6\u09e7\u0001"+
		"\u0000\u0000\u0000\u09e7\u09ea\u0001\u0000\u0000\u0000\u09e8\u09e6\u0001"+
		"\u0000\u0000\u0000\u09e9\u09df\u0001\u0000\u0000\u0000\u09e9\u09ea\u0001"+
		"\u0000\u0000\u0000\u09ea\u00c1\u0001\u0000\u0000\u0000\u09eb\u09ec\u0007"+
		"\u0016\u0000\u0000\u09ec\u00c3\u0001\u0000\u0000\u0000\u09ed\u09ef\u0005"+
		"\u009d\u0000\u0000\u09ee\u09ed\u0001\u0000\u0000\u0000\u09ee\u09ef\u0001"+
		"\u0000\u0000\u0000\u09ef\u09f0\u0001\u0000\u0000\u0000\u09f0\u09f4\u0003"+
		"\u00deo\u0000\u09f1\u09f3\u0003\u00c6c\u0000\u09f2\u09f1\u0001\u0000\u0000"+
		"\u0000\u09f3\u09f6\u0001\u0000\u0000\u0000\u09f4\u09f2\u0001\u0000\u0000"+
		"\u0000\u09f4\u09f5\u0001\u0000\u0000\u0000\u09f5\u00c5\u0001\u0000\u0000"+
		"\u0000\u09f6\u09f4\u0001\u0000\u0000\u0000\u09f7\u09fb\u0003\u00c8d\u0000"+
		"\u09f8\u09fb\u0003\u00a4R\u0000\u09f9\u09fb\u0003\u00aaU\u0000\u09fa\u09f7"+
		"\u0001\u0000\u0000\u0000\u09fa\u09f8\u0001\u0000\u0000\u0000\u09fa\u09f9"+
		"\u0001\u0000\u0000\u0000\u09fb\u00c7\u0001\u0000\u0000\u0000\u09fc\u09fd"+
		"\u0003\u00cae\u0000\u09fd\u09ff\u0005\u009a\u0000\u0000\u09fe\u0a00\u0005"+
		"\u009d\u0000\u0000\u09ff\u09fe\u0001\u0000\u0000\u0000\u09ff\u0a00\u0001"+
		"\u0000\u0000\u0000\u0a00\u0a01\u0001\u0000\u0000\u0000\u0a01\u0a03\u0003"+
		"\u00deo\u0000\u0a02\u0a04\u0003\u00ccf\u0000\u0a03\u0a02\u0001\u0000\u0000"+
		"\u0000\u0a03\u0a04\u0001\u0000\u0000\u0000\u0a04\u0a0e\u0001\u0000\u0000"+
		"\u0000\u0a05\u0a06\u0005\u00bf\u0000\u0000\u0a06\u0a07\u0003\u00cae\u0000"+
		"\u0a07\u0a09\u0005\u009a\u0000\u0000\u0a08\u0a0a\u0005\u009d\u0000\u0000"+
		"\u0a09\u0a08\u0001\u0000\u0000\u0000\u0a09\u0a0a\u0001\u0000\u0000\u0000"+
		"\u0a0a\u0a0b\u0001\u0000\u0000\u0000\u0a0b\u0a0c\u0003\u00deo\u0000\u0a0c"+
		"\u0a0e\u0001\u0000\u0000\u0000\u0a0d\u09fc\u0001\u0000\u0000\u0000\u0a0d"+
		"\u0a05\u0001\u0000\u0000\u0000\u0a0e\u00c9\u0001\u0000\u0000\u0000\u0a0f"+
		"\u0a11\u0005\u008f\u0000\u0000\u0a10\u0a0f\u0001\u0000\u0000\u0000\u0a10"+
		"\u0a11\u0001\u0000\u0000\u0000\u0a11\u0a28\u0001\u0000\u0000\u0000\u0a12"+
		"\u0a28\u0005<\u0000\u0000\u0a13\u0a15\u0005\u00a0\u0000\u0000\u0a14\u0a16"+
		"\u0005\u00ce\u0000\u0000\u0a15\u0a14\u0001\u0000\u0000\u0000\u0a15\u0a16"+
		"\u0001\u0000\u0000\u0000\u0a16\u0a28\u0001\u0000\u0000\u0000\u0a17\u0a19"+
		"\u0005\u00a0\u0000\u0000\u0a18\u0a17\u0001\u0000\u0000\u0000\u0a18\u0a19"+
		"\u0001\u0000\u0000\u0000\u0a19\u0a1a\u0001\u0000\u0000\u0000\u0a1a\u0a28"+
		"\u0005\u0101\u0000\u0000\u0a1b\u0a1d\u0005\u00f4\u0000\u0000\u0a1c\u0a1e"+
		"\u0005\u00ce\u0000\u0000\u0a1d\u0a1c\u0001\u0000\u0000\u0000\u0a1d\u0a1e"+
		"\u0001\u0000\u0000\u0000\u0a1e\u0a28\u0001\u0000\u0000\u0000\u0a1f\u0a21"+
		"\u0005z\u0000\u0000\u0a20\u0a22\u0005\u00ce\u0000\u0000\u0a21\u0a20\u0001"+
		"\u0000\u0000\u0000\u0a21\u0a22\u0001\u0000\u0000\u0000\u0a22\u0a28\u0001"+
		"\u0000\u0000\u0000\u0a23\u0a25\u0005\u00a0\u0000\u0000\u0a24\u0a23\u0001"+
		"\u0000\u0000\u0000\u0a24\u0a25\u0001\u0000\u0000\u0000\u0a25\u0a26\u0001"+
		"\u0000\u0000\u0000\u0a26\u0a28\u0005\u000f\u0000\u0000\u0a27\u0a10\u0001"+
		"\u0000\u0000\u0000\u0a27\u0a12\u0001\u0000\u0000\u0000\u0a27\u0a13\u0001"+
		"\u0000\u0000\u0000\u0a27\u0a18\u0001\u0000\u0000\u0000\u0a27\u0a1b\u0001"+
		"\u0000\u0000\u0000\u0a27\u0a1f\u0001\u0000\u0000\u0000\u0a27\u0a24\u0001"+
		"\u0000\u0000\u0000\u0a28\u00cb\u0001\u0000\u0000\u0000\u0a29\u0a2a\u0005"+
		"\u00c7\u0000\u0000\u0a2a\u0a2e\u0003\u0112\u0089\u0000\u0a2b\u0a2c\u0005"+
		"\u0145\u0000\u0000\u0a2c\u0a2e\u0003\u00d2i\u0000\u0a2d\u0a29\u0001\u0000"+
		"\u0000\u0000\u0a2d\u0a2b\u0001\u0000\u0000\u0000\u0a2e\u00cd\u0001\u0000"+
		"\u0000\u0000\u0a2f\u0a30\u0005\u011f\u0000\u0000\u0a30\u0a32\u0005\u0002"+
		"\u0000\u0000\u0a31\u0a33\u0003\u00d0h\u0000\u0a32\u0a31\u0001\u0000\u0000"+
		"\u0000\u0a32\u0a33\u0001\u0000\u0000\u0000\u0a33\u0a34\u0001\u0000\u0000"+
		"\u0000\u0a34\u0a39\u0005\u0003\u0000\u0000\u0a35\u0a36\u0005\u00ee\u0000"+
		"\u0000\u0a36\u0a37\u0005\u0002\u0000\u0000\u0a37\u0a38\u0005\u0177\u0000"+
		"\u0000\u0a38\u0a3a\u0005\u0003\u0000\u0000\u0a39\u0a35\u0001\u0000\u0000"+
		"\u0000\u0a39\u0a3a\u0001\u0000\u0000\u0000\u0a3a\u00cf\u0001\u0000\u0000"+
		"\u0000\u0a3b\u0a3d\u0005\u0162\u0000\u0000\u0a3c\u0a3b\u0001\u0000\u0000"+
		"\u0000\u0a3c\u0a3d\u0001\u0000\u0000\u0000\u0a3d\u0a3e\u0001\u0000\u0000"+
		"\u0000\u0a3e\u0a3f\u0007\u0017\u0000\u0000\u0a3f\u0a54\u0005\u00d9\u0000"+
		"\u0000\u0a40\u0a41\u0003\u010a\u0085\u0000\u0a41\u0a42\u0005\u00fb\u0000"+
		"\u0000\u0a42\u0a54\u0001\u0000\u0000\u0000\u0a43\u0a44\u0005\u001d\u0000"+
		"\u0000\u0a44\u0a45\u0005\u0177\u0000\u0000\u0a45\u0a46\u0005\u00cd\u0000"+
		"\u0000\u0a46\u0a47\u0005\u00c5\u0000\u0000\u0a47\u0a50\u0005\u0177\u0000"+
		"\u0000\u0a48\u0a4e\u0005\u00c7\u0000\u0000\u0a49\u0a4f\u0003\u016e\u00b7"+
		"\u0000\u0a4a\u0a4b\u0003\u0168\u00b4\u0000\u0a4b\u0a4c\u0005\u0002\u0000"+
		"\u0000\u0a4c\u0a4d\u0005\u0003\u0000\u0000\u0a4d\u0a4f\u0001\u0000\u0000"+
		"\u0000\u0a4e\u0a49\u0001\u0000\u0000\u0000\u0a4e\u0a4a\u0001\u0000\u0000"+
		"\u0000\u0a4f\u0a51\u0001\u0000\u0000\u0000\u0a50\u0a48\u0001\u0000\u0000"+
		"\u0000\u0a50\u0a51\u0001\u0000\u0000\u0000\u0a51\u0a54\u0001\u0000\u0000"+
		"\u0000\u0a52\u0a54\u0003\u010a\u0085\u0000\u0a53\u0a3c\u0001\u0000\u0000"+
		"\u0000\u0a53\u0a40\u0001\u0000\u0000\u0000\u0a53\u0a43\u0001\u0000\u0000"+
		"\u0000\u0a53\u0a52\u0001\u0000\u0000\u0000\u0a54\u00d1\u0001\u0000\u0000"+
		"\u0000\u0a55\u0a56\u0005\u0002\u0000\u0000\u0a56\u0a57\u0003\u00d4j\u0000"+
		"\u0a57\u0a58\u0005\u0003\u0000\u0000\u0a58\u00d3\u0001\u0000\u0000\u0000"+
		"\u0a59\u0a5e\u0003\u016a\u00b5\u0000\u0a5a\u0a5b\u0005\u0004\u0000\u0000"+
		"\u0a5b\u0a5d\u0003\u016a\u00b5\u0000\u0a5c\u0a5a\u0001\u0000\u0000\u0000"+
		"\u0a5d\u0a60\u0001\u0000\u0000\u0000\u0a5e\u0a5c\u0001\u0000\u0000\u0000"+
		"\u0a5e\u0a5f\u0001\u0000\u0000\u0000\u0a5f\u00d5\u0001\u0000\u0000\u0000"+
		"\u0a60\u0a5e\u0001\u0000\u0000\u0000\u0a61\u0a62\u0005\u0002\u0000\u0000"+
		"\u0a62\u0a67\u0003\u00d8l\u0000\u0a63\u0a64\u0005\u0004\u0000\u0000\u0a64"+
		"\u0a66\u0003\u00d8l\u0000\u0a65\u0a63\u0001\u0000\u0000\u0000\u0a66\u0a69"+
		"\u0001\u0000\u0000\u0000\u0a67\u0a65\u0001\u0000\u0000\u0000\u0a67\u0a68"+
		"\u0001\u0000\u0000\u0000\u0a68\u0a6a\u0001\u0000\u0000\u0000\u0a69\u0a67"+
		"\u0001\u0000\u0000\u0000\u0a6a\u0a6b\u0005\u0003\u0000\u0000\u0a6b\u00d7"+
		"\u0001\u0000\u0000\u0000\u0a6c\u0a6e\u0003\u016a\u00b5\u0000\u0a6d\u0a6f"+
		"\u0007\u0010\u0000\u0000\u0a6e\u0a6d\u0001\u0000\u0000\u0000\u0a6e\u0a6f"+
		"\u0001\u0000\u0000\u0000\u0a6f\u00d9\u0001\u0000\u0000\u0000\u0a70\u0a71"+
		"\u0005\u0002\u0000\u0000\u0a71\u0a76\u0003\u00dcn\u0000\u0a72\u0a73\u0005"+
		"\u0004\u0000\u0000\u0a73\u0a75\u0003\u00dcn\u0000\u0a74\u0a72\u0001\u0000"+
		"\u0000\u0000\u0a75\u0a78\u0001\u0000\u0000\u0000\u0a76\u0a74\u0001\u0000"+
		"\u0000\u0000\u0a76\u0a77\u0001\u0000\u0000\u0000\u0a77\u0a79\u0001\u0000"+
		"\u0000\u0000\u0a78\u0a76\u0001\u0000\u0000\u0000\u0a79\u0a7a\u0005\u0003"+
		"\u0000\u0000\u0a7a\u00db\u0001\u0000\u0000\u0000\u0a7b\u0a7d\u0003\u016e"+
		"\u00b7\u0000\u0a7c\u0a7e\u0003.\u0017\u0000\u0a7d\u0a7c\u0001\u0000\u0000"+
		"\u0000\u0a7d\u0a7e\u0001\u0000\u0000\u0000\u0a7e\u00dd\u0001\u0000\u0000"+
		"\u0000\u0a7f\u0a81\u0003d2\u0000\u0a80\u0a82\u0003\u0098L\u0000\u0a81"+
		"\u0a80\u0001\u0000\u0000\u0000\u0a81\u0a82\u0001\u0000\u0000\u0000\u0a82"+
		"\u0a84\u0001\u0000\u0000\u0000\u0a83\u0a85\u0003\u00ceg\u0000\u0a84\u0a83"+
		"\u0001\u0000\u0000\u0000\u0a84\u0a85\u0001\u0000\u0000\u0000\u0a85\u0a86"+
		"\u0001\u0000\u0000\u0000\u0a86\u0a87\u0003\u00eew\u0000\u0a87\u0a9b\u0001"+
		"\u0000\u0000\u0000\u0a88\u0a89\u0005\u0002\u0000\u0000\u0a89\u0a8a\u0003"+
		"0\u0018\u0000\u0a8a\u0a8c\u0005\u0003\u0000\u0000\u0a8b\u0a8d\u0003\u00ce"+
		"g\u0000\u0a8c\u0a8b\u0001\u0000\u0000\u0000\u0a8c\u0a8d\u0001\u0000\u0000"+
		"\u0000\u0a8d\u0a8e\u0001\u0000\u0000\u0000\u0a8e\u0a8f\u0003\u00eew\u0000"+
		"\u0a8f\u0a9b\u0001\u0000\u0000\u0000\u0a90\u0a91\u0005\u0002\u0000\u0000"+
		"\u0a91\u0a92\u0003\u00c4b\u0000\u0a92\u0a94\u0005\u0003\u0000\u0000\u0a93"+
		"\u0a95\u0003\u00ceg\u0000\u0a94\u0a93\u0001\u0000\u0000\u0000\u0a94\u0a95"+
		"\u0001\u0000\u0000\u0000\u0a95\u0a96\u0001\u0000\u0000\u0000\u0a96\u0a97"+
		"\u0003\u00eew\u0000\u0a97\u0a9b\u0001\u0000\u0000\u0000\u0a98\u0a9b\u0003"+
		"\u00e0p\u0000\u0a99\u0a9b\u0003\u00ecv\u0000\u0a9a\u0a7f\u0001\u0000\u0000"+
		"\u0000\u0a9a\u0a88\u0001\u0000\u0000\u0000\u0a9a\u0a90\u0001\u0000\u0000"+
		"\u0000\u0a9a\u0a98\u0001\u0000\u0000\u0000\u0a9a\u0a99\u0001\u0000\u0000"+
		"\u0000\u0a9b\u00df\u0001\u0000\u0000\u0000\u0a9c\u0a9d\u0005\u0146\u0000"+
		"\u0000\u0a9d\u0aa2\u0003\u010a\u0085\u0000\u0a9e\u0a9f\u0005\u0004\u0000"+
		"\u0000\u0a9f\u0aa1\u0003\u010a\u0085\u0000\u0aa0\u0a9e\u0001\u0000\u0000"+
		"\u0000\u0aa1\u0aa4\u0001\u0000\u0000\u0000\u0aa2\u0aa0\u0001\u0000\u0000"+
		"\u0000\u0aa2\u0aa3\u0001\u0000\u0000\u0000\u0aa3\u0aa5\u0001\u0000\u0000"+
		"\u0000\u0aa4\u0aa2\u0001\u0000\u0000\u0000\u0aa5\u0aa6\u0003\u00eew\u0000"+
		"\u0aa6\u00e1\u0001\u0000\u0000\u0000\u0aa7\u0aa8\u0005\u011d\u0000\u0000"+
		"\u0aa8\u0aaa\u0003d2\u0000\u0aa9\u0aab\u0003\u00e4r\u0000\u0aaa\u0aa9"+
		"\u0001\u0000\u0000\u0000\u0aaa\u0aab\u0001\u0000\u0000\u0000\u0aab\u0abb"+
		"\u0001\u0000\u0000\u0000\u0aac\u0aad\u0005\u011d\u0000\u0000\u0aad\u0aae"+
		"\u0005\u0002\u0000\u0000\u0aae\u0aaf\u0003d2\u0000\u0aaf\u0ab1\u0005\u0003"+
		"\u0000\u0000\u0ab0\u0ab2\u0003\u00e4r\u0000\u0ab1\u0ab0\u0001\u0000\u0000"+
		"\u0000\u0ab1\u0ab2\u0001\u0000\u0000\u0000\u0ab2\u0abb\u0001\u0000\u0000"+
		"\u0000\u0ab3\u0ab4\u0005\u011d\u0000\u0000\u0ab4\u0ab5\u0005\u0002\u0000"+
		"\u0000\u0ab5\u0ab6\u00030\u0018\u0000\u0ab6\u0ab8\u0005\u0003\u0000\u0000"+
		"\u0ab7\u0ab9\u0003\u00e4r\u0000\u0ab8\u0ab7\u0001\u0000\u0000\u0000\u0ab8"+
		"\u0ab9\u0001\u0000\u0000\u0000\u0ab9\u0abb\u0001\u0000\u0000\u0000\u0aba"+
		"\u0aa7\u0001\u0000\u0000\u0000\u0aba\u0aac\u0001\u0000\u0000\u0000\u0aba"+
		"\u0ab3\u0001\u0000\u0000\u0000\u0abb\u00e3\u0001\u0000\u0000\u0000\u0abc"+
		"\u0abd\u0005\u0154\u0000\u0000\u0abd\u0abe\u0005\u010b\u0000\u0000\u0abe"+
		"\u0ad0\u0005\u00d4\u0000\u0000\u0abf\u0ac0\u0007\u0018\u0000\u0000\u0ac0"+
		"\u0acd\u0005\u001f\u0000\u0000\u0ac1\u0ac2\u0005\u0002\u0000\u0000\u0ac2"+
		"\u0ac7\u0003\u010a\u0085\u0000\u0ac3\u0ac4\u0005\u0004\u0000\u0000\u0ac4"+
		"\u0ac6\u0003\u010a\u0085\u0000\u0ac5\u0ac3\u0001\u0000\u0000\u0000\u0ac6"+
		"\u0ac9\u0001\u0000\u0000\u0000\u0ac7\u0ac5\u0001\u0000\u0000\u0000\u0ac7"+
		"\u0ac8\u0001\u0000\u0000\u0000\u0ac8\u0aca\u0001\u0000\u0000\u0000\u0ac9"+
		"\u0ac7\u0001\u0000\u0000\u0000\u0aca\u0acb\u0005\u0003\u0000\u0000\u0acb"+
		"\u0ace\u0001\u0000\u0000\u0000\u0acc\u0ace\u0003\u010a\u0085\u0000\u0acd"+
		"\u0ac1\u0001\u0000\u0000\u0000\u0acd\u0acc\u0001\u0000\u0000\u0000\u0ace"+
		"\u0ad0\u0001\u0000\u0000\u0000\u0acf\u0abc\u0001\u0000\u0000\u0000\u0acf"+
		"\u0abf\u0001\u0000\u0000\u0000\u0ad0\u0ae1\u0001\u0000\u0000\u0000\u0ad1"+
		"\u0ad2\u0007\u0019\u0000\u0000\u0ad2\u0adf\u0005\u001f\u0000\u0000\u0ad3"+
		"\u0ad4\u0005\u0002\u0000\u0000\u0ad4\u0ad9\u0003n7\u0000\u0ad5\u0ad6\u0005"+
		"\u0004\u0000\u0000\u0ad6\u0ad8\u0003n7\u0000\u0ad7\u0ad5\u0001\u0000\u0000"+
		"\u0000\u0ad8\u0adb\u0001\u0000\u0000\u0000\u0ad9\u0ad7\u0001\u0000\u0000"+
		"\u0000\u0ad9\u0ada\u0001\u0000\u0000\u0000\u0ada\u0adc\u0001\u0000\u0000"+
		"\u0000\u0adb\u0ad9\u0001\u0000\u0000\u0000\u0adc\u0add\u0005\u0003\u0000"+
		"\u0000\u0add\u0ae0\u0001\u0000\u0000\u0000\u0ade\u0ae0\u0003n7\u0000\u0adf"+
		"\u0ad3\u0001\u0000\u0000\u0000\u0adf\u0ade\u0001\u0000\u0000\u0000\u0ae0"+
		"\u0ae2\u0001\u0000\u0000\u0000\u0ae1\u0ad1\u0001\u0000\u0000\u0000\u0ae1"+
		"\u0ae2\u0001\u0000\u0000\u0000\u0ae2\u00e5\u0001\u0000\u0000\u0000\u0ae3"+
		"\u0ae4\u0003\u016e\u00b7\u0000\u0ae4\u0ae5\u0005\u016e\u0000\u0000\u0ae5"+
		"\u0ae6\u0003\u00e2q\u0000\u0ae6\u00e7\u0001\u0000\u0000\u0000\u0ae7\u0aea"+
		"\u0003\u00e2q\u0000\u0ae8\u0aea\u0003\u00e6s\u0000\u0ae9\u0ae7\u0001\u0000"+
		"\u0000\u0000\u0ae9\u0ae8\u0001\u0000\u0000\u0000\u0aea\u00e9\u0001\u0000"+
		"\u0000\u0000\u0aeb\u0aee\u0003\u00e8t\u0000\u0aec\u0aee\u0003\u010e\u0087"+
		"\u0000\u0aed\u0aeb\u0001\u0000\u0000\u0000\u0aed\u0aec\u0001\u0000\u0000"+
		"\u0000\u0aee\u00eb\u0001\u0000\u0000\u0000\u0aef\u0af0\u0003\u0166\u00b3"+
		"\u0000\u0af0\u0af9\u0005\u0002\u0000\u0000\u0af1\u0af6\u0003\u00eau\u0000"+
		"\u0af2\u0af3\u0005\u0004\u0000\u0000\u0af3\u0af5\u0003\u00eau\u0000\u0af4"+
		"\u0af2\u0001\u0000\u0000\u0000\u0af5\u0af8\u0001\u0000\u0000\u0000\u0af6"+
		"\u0af4\u0001\u0000\u0000\u0000\u0af6\u0af7\u0001\u0000\u0000\u0000\u0af7"+
		"\u0afa\u0001\u0000\u0000\u0000\u0af8\u0af6\u0001\u0000\u0000\u0000\u0af9"+
		"\u0af1\u0001\u0000\u0000\u0000\u0af9\u0afa\u0001\u0000\u0000\u0000\u0afa"+
		"\u0afb\u0001\u0000\u0000\u0000\u0afb\u0afc\u0005\u0003\u0000\u0000\u0afc"+
		"\u0afd\u0003\u00eew\u0000\u0afd\u00ed\u0001\u0000\u0000\u0000\u0afe\u0b00"+
		"\u0005\u0014\u0000\u0000\u0aff\u0afe\u0001\u0000\u0000\u0000\u0aff\u0b00"+
		"\u0001\u0000\u0000\u0000\u0b00\u0b01\u0001\u0000\u0000\u0000\u0b01\u0b03"+
		"\u0003\u0170\u00b8\u0000\u0b02\u0b04\u0003\u00d2i\u0000\u0b03\u0b02\u0001"+
		"\u0000\u0000\u0000\u0b03\u0b04\u0001\u0000\u0000\u0000\u0b04\u0b06\u0001"+
		"\u0000\u0000\u0000\u0b05\u0aff\u0001\u0000\u0000\u0000\u0b05\u0b06\u0001"+
		"\u0000\u0000\u0000\u0b06\u00ef\u0001\u0000\u0000\u0000\u0b07\u0b08\u0005"+
		"\u00fa\u0000\u0000\u0b08\u0b09\u0005w\u0000\u0000\u0b09\u0b0a\u0005\u0103"+
		"\u0000\u0000\u0b0a\u0b0e\u0003\u017a\u00bd\u0000\u0b0b\u0b0c\u0005\u0154"+
		"\u0000\u0000\u0b0c\u0b0d\u0005\u0104\u0000\u0000\u0b0d\u0b0f\u0003J%\u0000"+
		"\u0b0e\u0b0b\u0001\u0000\u0000\u0000\u0b0e\u0b0f\u0001\u0000\u0000\u0000"+
		"\u0b0f\u0b39\u0001\u0000\u0000\u0000\u0b10\u0b11\u0005\u00fa\u0000\u0000"+
		"\u0b11\u0b12\u0005w\u0000\u0000\u0b12\u0b1c\u0005U\u0000\u0000\u0b13\u0b14"+
		"\u0005o\u0000\u0000\u0b14\u0b15\u0005\u0123\u0000\u0000\u0b15\u0b16\u0005"+
		"\u001f\u0000\u0000\u0b16\u0b1a\u0003\u017a\u00bd\u0000\u0b17\u0b18\u0005"+
		"c\u0000\u0000\u0b18\u0b19\u0005\u001f\u0000\u0000\u0b19\u0b1b\u0003\u017a"+
		"\u00bd\u0000\u0b1a\u0b17\u0001\u0000\u0000\u0000\u0b1a\u0b1b\u0001\u0000"+
		"\u0000\u0000\u0b1b\u0b1d\u0001\u0000\u0000\u0000\u0b1c\u0b13\u0001\u0000"+
		"\u0000\u0000\u0b1c\u0b1d\u0001\u0000\u0000\u0000\u0b1d\u0b23\u0001\u0000"+
		"\u0000\u0000\u0b1e\u0b1f\u00050\u0000\u0000\u0b1f\u0b20\u0005\u0099\u0000"+
		"\u0000\u0b20\u0b21\u0005\u0123\u0000\u0000\u0b21\u0b22\u0005\u001f\u0000"+
		"\u0000\u0b22\u0b24\u0003\u017a\u00bd\u0000\u0b23\u0b1e\u0001\u0000\u0000"+
		"\u0000\u0b23\u0b24\u0001\u0000\u0000\u0000\u0b24\u0b2a\u0001\u0000\u0000"+
		"\u0000\u0b25\u0b26\u0005\u00ae\u0000\u0000\u0b26\u0b27\u0005\u009b\u0000"+
		"\u0000\u0b27\u0b28\u0005\u0123\u0000\u0000\u0b28\u0b29\u0005\u001f\u0000"+
		"\u0000\u0b29\u0b2b\u0003\u017a\u00bd\u0000\u0b2a\u0b25\u0001\u0000\u0000"+
		"\u0000\u0b2a\u0b2b\u0001\u0000\u0000\u0000\u0b2b\u0b30\u0001\u0000\u0000"+
		"\u0000\u0b2c\u0b2d\u0005\u00a4\u0000\u0000\u0b2d\u0b2e\u0005\u0123\u0000"+
		"\u0000\u0b2e\u0b2f\u0005\u001f\u0000\u0000\u0b2f\u0b31\u0003\u017a\u00bd"+
		"\u0000\u0b30\u0b2c\u0001\u0000\u0000\u0000\u0b30\u0b31\u0001\u0000\u0000"+
		"\u0000\u0b31\u0b36\u0001\u0000\u0000\u0000\u0b32\u0b33\u0005\u00c2\u0000"+
		"\u0000\u0b33\u0b34\u0005S\u0000\u0000\u0b34\u0b35\u0005\u0014\u0000\u0000"+
		"\u0b35\u0b37\u0003\u017a\u00bd\u0000\u0b36\u0b32\u0001\u0000\u0000\u0000"+
		"\u0b36\u0b37\u0001\u0000\u0000\u0000\u0b37\u0b39\u0001\u0000\u0000\u0000"+
		"\u0b38\u0b07\u0001\u0000\u0000\u0000\u0b38\u0b10\u0001\u0000\u0000\u0000"+
		"\u0b39\u00f1\u0001\u0000\u0000\u0000\u0b3a\u0b3f\u0003\u00f4z\u0000\u0b3b"+
		"\u0b3c\u0005\u0004\u0000\u0000\u0b3c\u0b3e\u0003\u00f4z\u0000\u0b3d\u0b3b"+
		"\u0001\u0000\u0000\u0000\u0b3e\u0b41\u0001\u0000\u0000\u0000\u0b3f\u0b3d"+
		"\u0001\u0000\u0000\u0000\u0b3f\u0b40\u0001\u0000\u0000\u0000\u0b40\u00f3"+
		"\u0001\u0000\u0000\u0000\u0b41\u0b3f\u0001\u0000\u0000\u0000\u0b42\u0b47"+
		"\u0003\u016a\u00b5\u0000\u0b43\u0b44\u0005\u0005\u0000\u0000\u0b44\u0b46"+
		"\u0003\u016a\u00b5\u0000\u0b45\u0b43\u0001\u0000\u0000\u0000\u0b46\u0b49"+
		"\u0001\u0000\u0000\u0000\u0b47\u0b45\u0001\u0000\u0000\u0000\u0b47\u0b48"+
		"\u0001\u0000\u0000\u0000\u0b48\u00f5\u0001\u0000\u0000\u0000\u0b49\u0b47"+
		"\u0001\u0000\u0000\u0000\u0b4a\u0b4f\u0003\u00f8|\u0000\u0b4b\u0b4c\u0005"+
		"\u0004\u0000\u0000\u0b4c\u0b4e\u0003\u00f8|\u0000\u0b4d\u0b4b\u0001\u0000"+
		"\u0000\u0000\u0b4e\u0b51\u0001\u0000\u0000\u0000\u0b4f\u0b4d\u0001\u0000"+
		"\u0000\u0000\u0b4f\u0b50\u0001\u0000\u0000\u0000\u0b50\u00f7\u0001\u0000"+
		"\u0000\u0000\u0b51\u0b4f\u0001\u0000\u0000\u0000\u0b52\u0b55\u0003\u00f4"+
		"z\u0000\u0b53\u0b54\u0005\u00ca\u0000\u0000\u0b54\u0b56\u0003J%\u0000"+
		"\u0b55\u0b53\u0001\u0000\u0000\u0000\u0b55\u0b56\u0001\u0000\u0000\u0000"+
		"\u0b56\u00f9\u0001\u0000\u0000\u0000\u0b57\u0b58\u0003\u016a\u00b5\u0000"+
		"\u0b58\u0b59\u0005\u0005\u0000\u0000\u0b59\u0b5b\u0001\u0000\u0000\u0000"+
		"\u0b5a\u0b57\u0001\u0000\u0000\u0000\u0b5a\u0b5b\u0001\u0000\u0000\u0000"+
		"\u0b5b\u0b5c\u0001\u0000\u0000\u0000\u0b5c\u0b5d\u0003\u016a\u00b5\u0000"+
		"\u0b5d\u00fb\u0001\u0000\u0000\u0000\u0b5e\u0b5f\u0003\u016a\u00b5\u0000"+
		"\u0b5f\u0b60\u0005\u0005\u0000\u0000\u0b60\u0b62\u0001\u0000\u0000\u0000"+
		"\u0b61\u0b5e\u0001\u0000\u0000\u0000\u0b61\u0b62\u0001\u0000\u0000\u0000"+
		"\u0b62\u0b63\u0001\u0000\u0000\u0000\u0b63\u0b64\u0003\u016a\u00b5\u0000"+
		"\u0b64\u00fd\u0001\u0000\u0000\u0000\u0b65\u0b6d\u0003\u010a\u0085\u0000"+
		"\u0b66\u0b68\u0005\u0014\u0000\u0000\u0b67\u0b66\u0001\u0000\u0000\u0000"+
		"\u0b67\u0b68\u0001\u0000\u0000\u0000\u0b68\u0b6b\u0001\u0000\u0000\u0000"+
		"\u0b69\u0b6c\u0003\u016a\u00b5\u0000\u0b6a\u0b6c\u0003\u00d2i\u0000\u0b6b"+
		"\u0b69\u0001\u0000\u0000\u0000\u0b6b\u0b6a\u0001\u0000\u0000\u0000\u0b6c"+
		"\u0b6e\u0001\u0000\u0000\u0000\u0b6d\u0b67\u0001\u0000\u0000\u0000\u0b6d"+
		"\u0b6e\u0001\u0000\u0000\u0000\u0b6e\u00ff\u0001\u0000\u0000\u0000\u0b6f"+
		"\u0b74\u0003\u00fe\u007f\u0000\u0b70\u0b71\u0005\u0004\u0000\u0000\u0b71"+
		"\u0b73\u0003\u00fe\u007f\u0000\u0b72\u0b70\u0001\u0000\u0000\u0000\u0b73"+
		"\u0b76\u0001\u0000\u0000\u0000\u0b74\u0b72\u0001\u0000\u0000\u0000\u0b74"+
		"\u0b75\u0001\u0000\u0000\u0000\u0b75\u0101\u0001\u0000\u0000\u0000\u0b76"+
		"\u0b74\u0001\u0000\u0000\u0000\u0b77\u0b78\u0005\u0002\u0000\u0000\u0b78"+
		"\u0b7d\u0003\u0104\u0082\u0000\u0b79\u0b7a\u0005\u0004\u0000\u0000\u0b7a"+
		"\u0b7c\u0003\u0104\u0082\u0000\u0b7b\u0b79\u0001\u0000\u0000\u0000\u0b7c"+
		"\u0b7f\u0001\u0000\u0000\u0000\u0b7d\u0b7b\u0001\u0000\u0000\u0000\u0b7d"+
		"\u0b7e\u0001\u0000\u0000\u0000\u0b7e\u0b80\u0001\u0000\u0000\u0000\u0b7f"+
		"\u0b7d\u0001\u0000\u0000\u0000\u0b80\u0b81\u0005\u0003\u0000\u0000\u0b81"+
		"\u0103\u0001\u0000\u0000\u0000\u0b82\u0b85\u0003\u0106\u0083\u0000\u0b83"+
		"\u0b85\u0003\u014a\u00a5\u0000\u0b84\u0b82\u0001\u0000\u0000\u0000\u0b84"+
		"\u0b83\u0001\u0000\u0000\u0000\u0b85\u0105\u0001\u0000\u0000\u0000\u0b86"+
		"\u0b94\u0003\u0168\u00b4\u0000\u0b87\u0b88\u0003\u016e\u00b7\u0000\u0b88"+
		"\u0b89\u0005\u0002\u0000\u0000\u0b89\u0b8e\u0003\u0108\u0084\u0000\u0b8a"+
		"\u0b8b\u0005\u0004\u0000\u0000\u0b8b\u0b8d\u0003\u0108\u0084\u0000\u0b8c"+
		"\u0b8a\u0001\u0000\u0000\u0000\u0b8d\u0b90\u0001\u0000\u0000\u0000\u0b8e"+
		"\u0b8c\u0001\u0000\u0000\u0000\u0b8e\u0b8f\u0001\u0000\u0000\u0000\u0b8f"+
		"\u0b91\u0001\u0000\u0000\u0000\u0b90\u0b8e\u0001\u0000\u0000\u0000\u0b91"+
		"\u0b92\u0005\u0003\u0000\u0000\u0b92\u0b94\u0001\u0000\u0000\u0000\u0b93"+
		"\u0b86\u0001\u0000\u0000\u0000\u0b93\u0b87\u0001\u0000\u0000\u0000\u0b94"+
		"\u0107\u0001\u0000\u0000\u0000\u0b95\u0b98\u0003\u0168\u00b4\u0000\u0b96"+
		"\u0b98\u0003\u011e\u008f\u0000\u0b97\u0b95\u0001\u0000\u0000\u0000\u0b97"+
		"\u0b96\u0001\u0000\u0000\u0000\u0b98\u0109\u0001\u0000\u0000\u0000\u0b99"+
		"\u0b9a\u0003\u0112\u0089\u0000\u0b9a\u010b\u0001\u0000\u0000\u0000\u0b9b"+
		"\u0b9c\u0003\u016e\u00b7\u0000\u0b9c\u0b9d\u0005\u016e\u0000\u0000\u0b9d"+
		"\u0b9e\u0003\u010a\u0085\u0000\u0b9e\u010d\u0001\u0000\u0000\u0000\u0b9f"+
		"\u0ba2\u0003\u010a\u0085\u0000\u0ba0\u0ba2\u0003\u010c\u0086\u0000\u0ba1"+
		"\u0b9f\u0001\u0000\u0000\u0000\u0ba1\u0ba0\u0001\u0000\u0000\u0000\u0ba2"+
		"\u010f\u0001\u0000\u0000\u0000\u0ba3\u0ba8\u0003\u010a\u0085\u0000\u0ba4"+
		"\u0ba5\u0005\u0004\u0000\u0000\u0ba5\u0ba7\u0003\u010a\u0085\u0000\u0ba6"+
		"\u0ba4\u0001\u0000\u0000\u0000\u0ba7\u0baa\u0001\u0000\u0000\u0000\u0ba8"+
		"\u0ba6\u0001\u0000\u0000\u0000\u0ba8\u0ba9\u0001\u0000\u0000\u0000\u0ba9"+
		"\u0111\u0001\u0000\u0000\u0000\u0baa\u0ba8\u0001\u0000\u0000\u0000\u0bab"+
		"\u0bac\u0006\u0089\uffff\uffff\u0000\u0bac\u0bad\u0005\u00c1\u0000\u0000"+
		"\u0bad\u0bb8\u0003\u0112\u0089\u0005\u0bae\u0baf\u0005g\u0000\u0000\u0baf"+
		"\u0bb0\u0005\u0002\u0000\u0000\u0bb0\u0bb1\u00030\u0018\u0000\u0bb1\u0bb2"+
		"\u0005\u0003\u0000\u0000\u0bb2\u0bb8\u0001\u0000\u0000\u0000\u0bb3\u0bb5"+
		"\u0003\u0116\u008b\u0000\u0bb4\u0bb6\u0003\u0114\u008a\u0000\u0bb5\u0bb4"+
		"\u0001\u0000\u0000\u0000\u0bb5\u0bb6\u0001\u0000\u0000\u0000\u0bb6\u0bb8"+
		"\u0001\u0000\u0000\u0000\u0bb7\u0bab\u0001\u0000\u0000\u0000\u0bb7\u0bae"+
		"\u0001\u0000\u0000\u0000\u0bb7\u0bb3\u0001\u0000\u0000\u0000\u0bb8\u0bc1"+
		"\u0001\u0000\u0000\u0000\u0bb9\u0bba\n\u0002\u0000\u0000\u0bba\u0bbb\u0005"+
		"\u000e\u0000\u0000\u0bbb\u0bc0\u0003\u0112\u0089\u0003\u0bbc\u0bbd\n\u0001"+
		"\u0000\u0000\u0bbd\u0bbe\u0005\u00cb\u0000\u0000\u0bbe\u0bc0\u0003\u0112"+
		"\u0089\u0002\u0bbf\u0bb9\u0001\u0000\u0000\u0000\u0bbf\u0bbc\u0001\u0000"+
		"\u0000\u0000\u0bc0\u0bc3\u0001\u0000\u0000\u0000\u0bc1\u0bbf\u0001\u0000"+
		"\u0000\u0000\u0bc1\u0bc2\u0001\u0000\u0000\u0000\u0bc2\u0113\u0001\u0000"+
		"\u0000\u0000\u0bc3\u0bc1\u0001\u0000\u0000\u0000\u0bc4\u0bc6\u0005\u00c1"+
		"\u0000\u0000\u0bc5\u0bc4\u0001\u0000\u0000\u0000\u0bc5\u0bc6\u0001\u0000"+
		"\u0000\u0000\u0bc6\u0bc7\u0001\u0000\u0000\u0000\u0bc7\u0bc8\u0005\u0018"+
		"\u0000\u0000\u0bc8\u0bc9\u0003\u0116\u008b\u0000\u0bc9\u0bca\u0005\u000e"+
		"\u0000\u0000\u0bca\u0bcb\u0003\u0116\u008b\u0000\u0bcb\u0c17\u0001\u0000"+
		"\u0000\u0000\u0bcc\u0bce\u0005\u00c1\u0000\u0000\u0bcd\u0bcc\u0001\u0000"+
		"\u0000\u0000\u0bcd\u0bce\u0001\u0000\u0000\u0000\u0bce\u0bcf\u0001\u0000"+
		"\u0000\u0000\u0bcf\u0bd0\u0005\u008b\u0000\u0000\u0bd0\u0bd1\u0005\u0002"+
		"\u0000\u0000\u0bd1\u0bd6\u0003\u010a\u0085\u0000\u0bd2\u0bd3\u0005\u0004"+
		"\u0000\u0000\u0bd3\u0bd5\u0003\u010a\u0085\u0000\u0bd4\u0bd2\u0001\u0000"+
		"\u0000\u0000\u0bd5\u0bd8\u0001\u0000\u0000\u0000\u0bd6\u0bd4\u0001\u0000"+
		"\u0000\u0000\u0bd6\u0bd7\u0001\u0000\u0000\u0000\u0bd7\u0bd9\u0001\u0000"+
		"\u0000\u0000\u0bd8\u0bd6\u0001\u0000\u0000\u0000\u0bd9\u0bda\u0005\u0003"+
		"\u0000\u0000\u0bda\u0c17\u0001\u0000\u0000\u0000\u0bdb\u0bdd\u0005\u00c1"+
		"\u0000\u0000\u0bdc\u0bdb\u0001\u0000\u0000\u0000\u0bdc\u0bdd\u0001\u0000"+
		"\u0000\u0000\u0bdd\u0bde\u0001\u0000\u0000\u0000\u0bde\u0bdf\u0005\u008b"+
		"\u0000\u0000\u0bdf\u0be0\u0005\u0002\u0000\u0000\u0be0\u0be1\u00030\u0018"+
		"\u0000\u0be1\u0be2\u0005\u0003\u0000\u0000\u0be2\u0c17\u0001\u0000\u0000"+
		"\u0000\u0be3\u0be5\u0005\u00c1\u0000\u0000\u0be4\u0be3\u0001\u0000\u0000"+
		"\u0000\u0be4\u0be5\u0001\u0000\u0000\u0000\u0be5\u0be6\u0001\u0000\u0000"+
		"\u0000\u0be6\u0be7\u0005\u00f5\u0000\u0000\u0be7\u0c17\u0003\u0116\u008b"+
		"\u0000\u0be8\u0bea\u0005\u00c1\u0000\u0000\u0be9\u0be8\u0001\u0000\u0000"+
		"\u0000\u0be9\u0bea\u0001\u0000\u0000\u0000\u0bea\u0beb\u0001\u0000\u0000"+
		"\u0000\u0beb\u0bec\u0007\u001a\u0000\u0000\u0bec\u0bfa\u0007\u001b\u0000"+
		"\u0000\u0bed\u0bee\u0005\u0002\u0000\u0000\u0bee\u0bfb\u0005\u0003\u0000"+
		"\u0000\u0bef\u0bf0\u0005\u0002\u0000\u0000\u0bf0\u0bf5\u0003\u010a\u0085"+
		"\u0000\u0bf1\u0bf2\u0005\u0004\u0000\u0000\u0bf2\u0bf4\u0003\u010a\u0085"+
		"\u0000\u0bf3\u0bf1\u0001\u0000\u0000\u0000\u0bf4\u0bf7\u0001\u0000\u0000"+
		"\u0000\u0bf5\u0bf3\u0001\u0000\u0000\u0000\u0bf5\u0bf6\u0001\u0000\u0000"+
		"\u0000\u0bf6\u0bf8\u0001\u0000\u0000\u0000\u0bf7\u0bf5\u0001\u0000\u0000"+
		"\u0000\u0bf8\u0bf9\u0005\u0003\u0000\u0000\u0bf9\u0bfb\u0001\u0000\u0000"+
		"\u0000\u0bfa\u0bed\u0001\u0000\u0000\u0000\u0bfa\u0bef\u0001\u0000\u0000"+
		"\u0000\u0bfb\u0c17\u0001\u0000\u0000\u0000\u0bfc\u0bfe\u0005\u00c1\u0000"+
		"\u0000\u0bfd\u0bfc\u0001\u0000\u0000\u0000\u0bfd\u0bfe\u0001\u0000\u0000"+
		"\u0000\u0bfe\u0bff\u0001\u0000\u0000\u0000\u0bff\u0c00\u0007\u001a\u0000"+
		"\u0000\u0c00\u0c03\u0003\u0116\u008b\u0000\u0c01\u0c02\u0005b\u0000\u0000"+
		"\u0c02\u0c04\u0003\u017a\u00bd\u0000\u0c03\u0c01\u0001\u0000\u0000\u0000"+
		"\u0c03\u0c04\u0001\u0000\u0000\u0000\u0c04\u0c17\u0001\u0000\u0000\u0000"+
		"\u0c05\u0c07\u0005\u0098\u0000\u0000\u0c06\u0c08\u0005\u00c1\u0000\u0000"+
		"\u0c07\u0c06\u0001\u0000\u0000\u0000\u0c07\u0c08\u0001\u0000\u0000\u0000"+
		"\u0c08\u0c09\u0001\u0000\u0000\u0000\u0c09\u0c17\u0005\u00c2\u0000\u0000"+
		"\u0c0a\u0c0c\u0005\u0098\u0000\u0000\u0c0b\u0c0d\u0005\u00c1\u0000\u0000"+
		"\u0c0c\u0c0b\u0001\u0000\u0000\u0000\u0c0c\u0c0d\u0001\u0000\u0000\u0000"+
		"\u0c0d\u0c0e\u0001\u0000\u0000\u0000\u0c0e\u0c17\u0007\u001c\u0000\u0000"+
		"\u0c0f\u0c11\u0005\u0098\u0000\u0000\u0c10\u0c12\u0005\u00c1\u0000\u0000"+
		"\u0c11\u0c10\u0001\u0000\u0000\u0000\u0c11\u0c12\u0001\u0000\u0000\u0000"+
		"\u0c12\u0c13\u0001\u0000\u0000\u0000\u0c13\u0c14\u0005[\u0000\u0000\u0c14"+
		"\u0c15\u0005y\u0000\u0000\u0c15\u0c17\u0003\u0116\u008b\u0000\u0c16\u0bc5"+
		"\u0001\u0000\u0000\u0000\u0c16\u0bcd\u0001\u0000\u0000\u0000\u0c16\u0bdc"+
		"\u0001\u0000\u0000\u0000\u0c16\u0be4\u0001\u0000\u0000\u0000\u0c16\u0be9"+
		"\u0001\u0000\u0000\u0000\u0c16\u0bfd\u0001\u0000\u0000\u0000\u0c16\u0c05"+
		"\u0001\u0000\u0000\u0000\u0c16\u0c0a\u0001\u0000\u0000\u0000\u0c16\u0c0f"+
		"\u0001\u0000\u0000\u0000\u0c17\u0115\u0001\u0000\u0000\u0000\u0c18\u0c19"+
		"\u0006\u008b\uffff\uffff\u0000\u0c19\u0c1d\u0003\u011a\u008d\u0000\u0c1a"+
		"\u0c1b\u0007\u001d\u0000\u0000\u0c1b\u0c1d\u0003\u0116\u008b\u0007\u0c1c"+
		"\u0c18\u0001\u0000\u0000\u0000\u0c1c\u0c1a\u0001\u0000\u0000\u0000\u0c1d"+
		"\u0c33\u0001\u0000\u0000\u0000\u0c1e\u0c1f\n\u0006\u0000\u0000\u0c1f\u0c20"+
		"\u0007\u001e\u0000\u0000\u0c20\u0c32\u0003\u0116\u008b\u0007\u0c21\u0c22"+
		"\n\u0005\u0000\u0000\u0c22\u0c23\u0007\u001f\u0000\u0000\u0c23\u0c32\u0003"+
		"\u0116\u008b\u0006\u0c24\u0c25\n\u0004\u0000\u0000\u0c25\u0c26\u0005\u0167"+
		"\u0000\u0000\u0c26\u0c32\u0003\u0116\u008b\u0005\u0c27\u0c28\n\u0003\u0000"+
		"\u0000\u0c28\u0c29\u0005\u016a\u0000\u0000\u0c29\u0c32\u0003\u0116\u008b"+
		"\u0004\u0c2a\u0c2b\n\u0002\u0000\u0000\u0c2b\u0c2c\u0005\u0168\u0000\u0000"+
		"\u0c2c\u0c32\u0003\u0116\u008b\u0003\u0c2d\u0c2e\n\u0001\u0000\u0000\u0c2e"+
		"\u0c2f\u0003\u0120\u0090\u0000\u0c2f\u0c30\u0003\u0116\u008b\u0002\u0c30"+
		"\u0c32\u0001\u0000\u0000\u0000\u0c31\u0c1e\u0001\u0000\u0000\u0000\u0c31"+
		"\u0c21\u0001\u0000\u0000\u0000\u0c31\u0c24\u0001\u0000\u0000\u0000\u0c31"+
		"\u0c27\u0001\u0000\u0000\u0000\u0c31\u0c2a\u0001\u0000\u0000\u0000\u0c31"+
		"\u0c2d\u0001\u0000\u0000\u0000\u0c32\u0c35\u0001\u0000\u0000\u0000\u0c33"+
		"\u0c31\u0001\u0000\u0000\u0000\u0c33\u0c34\u0001\u0000\u0000\u0000\u0c34"+
		"\u0117\u0001\u0000\u0000\u0000\u0c35\u0c33\u0001\u0000\u0000\u0000\u0c36"+
		"\u0c37\u0007 \u0000\u0000\u0c37\u0119\u0001\u0000\u0000\u0000\u0c38\u0c39"+
		"\u0006\u008d\uffff\uffff\u0000\u0c39\u0d2c\u0007!\u0000\u0000\u0c3a\u0c3b"+
		"\u0007\"\u0000\u0000\u0c3b\u0c3e\u0005\u0002\u0000\u0000\u0c3c\u0c3f\u0003"+
		"\u0118\u008c\u0000\u0c3d\u0c3f\u0003\u017a\u00bd\u0000\u0c3e\u0c3c\u0001"+
		"\u0000\u0000\u0000\u0c3e\u0c3d\u0001\u0000\u0000\u0000\u0c3f\u0c40\u0001"+
		"\u0000\u0000\u0000\u0c40\u0c41\u0005\u0004\u0000\u0000\u0c41\u0c42\u0003"+
		"\u0116\u008b\u0000\u0c42\u0c43\u0005\u0004\u0000\u0000\u0c43\u0c44\u0003"+
		"\u0116\u008b\u0000\u0c44\u0c45\u0005\u0003\u0000\u0000\u0c45\u0d2c\u0001"+
		"\u0000\u0000\u0000\u0c46\u0c47\u0007#\u0000\u0000\u0c47\u0c4a\u0005\u0002"+
		"\u0000\u0000\u0c48\u0c4b\u0003\u0118\u008c\u0000\u0c49\u0c4b\u0003\u017a"+
		"\u00bd\u0000\u0c4a\u0c48\u0001\u0000\u0000\u0000\u0c4a\u0c49\u0001\u0000"+
		"\u0000\u0000\u0c4b\u0c4c\u0001\u0000\u0000\u0000\u0c4c\u0c4d\u0005\u0004"+
		"\u0000\u0000\u0c4d\u0c4e\u0003\u0116\u008b\u0000\u0c4e\u0c4f\u0005\u0004"+
		"\u0000\u0000\u0c4f\u0c50\u0003\u0116\u008b\u0000\u0c50\u0c51\u0005\u0003"+
		"\u0000\u0000\u0c51\u0d2c\u0001\u0000\u0000\u0000\u0c52\u0c54\u0005#\u0000"+
		"\u0000\u0c53\u0c55\u0003\u0158\u00ac\u0000\u0c54\u0c53\u0001\u0000\u0000"+
		"\u0000\u0c55\u0c56\u0001\u0000\u0000\u0000\u0c56\u0c54\u0001\u0000\u0000"+
		"\u0000\u0c56\u0c57\u0001\u0000\u0000\u0000\u0c57\u0c5a\u0001\u0000\u0000"+
		"\u0000\u0c58\u0c59\u0005`\u0000\u0000\u0c59\u0c5b\u0003\u010a\u0085\u0000"+
		"\u0c5a\u0c58\u0001\u0000\u0000\u0000\u0c5a\u0c5b\u0001\u0000\u0000\u0000"+
		"\u0c5b\u0c5c\u0001\u0000\u0000\u0000\u0c5c\u0c5d\u0005a\u0000\u0000\u0c5d"+
		"\u0d2c\u0001\u0000\u0000\u0000\u0c5e\u0c5f\u0005#\u0000\u0000\u0c5f\u0c61"+
		"\u0003\u010a\u0085\u0000\u0c60\u0c62\u0003\u0158\u00ac\u0000\u0c61\u0c60"+
		"\u0001\u0000\u0000\u0000\u0c62\u0c63\u0001\u0000\u0000\u0000\u0c63\u0c61"+
		"\u0001\u0000\u0000\u0000\u0c63\u0c64\u0001\u0000\u0000\u0000\u0c64\u0c67"+
		"\u0001\u0000\u0000\u0000\u0c65\u0c66\u0005`\u0000\u0000\u0c66\u0c68\u0003"+
		"\u010a\u0085\u0000\u0c67\u0c65\u0001\u0000\u0000\u0000\u0c67\u0c68\u0001"+
		"\u0000\u0000\u0000\u0c68\u0c69\u0001\u0000\u0000\u0000\u0c69\u0c6a\u0005"+
		"a\u0000\u0000\u0c6a\u0d2c\u0001\u0000\u0000\u0000\u0c6b\u0c6c\u0007$\u0000"+
		"\u0000\u0c6c\u0c6d\u0005\u0002\u0000\u0000\u0c6d\u0c6e\u0003\u010a\u0085"+
		"\u0000\u0c6e\u0c6f\u0005\u0014\u0000\u0000\u0c6f\u0c70\u0003\u013c\u009e"+
		"\u0000\u0c70\u0c71\u0005\u0003\u0000\u0000\u0c71\u0d2c\u0001\u0000\u0000"+
		"\u0000\u0c72\u0c73\u0005\u0117\u0000\u0000\u0c73\u0c7c\u0005\u0002\u0000"+
		"\u0000\u0c74\u0c79\u0003\u00fe\u007f\u0000\u0c75\u0c76\u0005\u0004\u0000"+
		"\u0000\u0c76\u0c78\u0003\u00fe\u007f\u0000\u0c77\u0c75\u0001\u0000\u0000"+
		"\u0000\u0c78\u0c7b\u0001\u0000\u0000\u0000\u0c79\u0c77\u0001\u0000\u0000"+
		"\u0000\u0c79\u0c7a\u0001\u0000\u0000\u0000\u0c7a\u0c7d\u0001\u0000\u0000"+
		"\u0000\u0c7b\u0c79\u0001\u0000\u0000\u0000\u0c7c\u0c74\u0001\u0000\u0000"+
		"\u0000\u0c7c\u0c7d\u0001\u0000\u0000\u0000\u0c7d\u0c7e\u0001\u0000\u0000"+
		"\u0000\u0c7e\u0d2c\u0005\u0003\u0000\u0000\u0c7f\u0c80\u0005r\u0000\u0000"+
		"\u0c80\u0c81\u0005\u0002\u0000\u0000\u0c81\u0c84\u0003\u010a\u0085\u0000"+
		"\u0c82\u0c83\u0005\u0088\u0000\u0000\u0c83\u0c85\u0005\u00c3\u0000\u0000"+
		"\u0c84\u0c82\u0001\u0000\u0000\u0000\u0c84\u0c85\u0001\u0000\u0000\u0000"+
		"\u0c85\u0c86\u0001\u0000\u0000\u0000\u0c86\u0c87\u0005\u0003\u0000\u0000"+
		"\u0c87\u0d2c\u0001\u0000\u0000\u0000\u0c88\u0c89\u0005\u0011\u0000\u0000"+
		"\u0c89\u0c8a\u0005\u0002\u0000\u0000\u0c8a\u0c8d\u0003\u010a\u0085\u0000"+
		"\u0c8b\u0c8c\u0005\u0088\u0000\u0000\u0c8c\u0c8e\u0005\u00c3\u0000\u0000"+
		"\u0c8d\u0c8b\u0001\u0000\u0000\u0000\u0c8d\u0c8e\u0001\u0000\u0000\u0000"+
		"\u0c8e\u0c8f\u0001\u0000\u0000\u0000\u0c8f\u0c90\u0005\u0003\u0000\u0000"+
		"\u0c90\u0d2c\u0001\u0000\u0000\u0000\u0c91\u0c92\u0005\u009c\u0000\u0000"+
		"\u0c92\u0c93\u0005\u0002\u0000\u0000\u0c93\u0c96\u0003\u010a\u0085\u0000"+
		"\u0c94\u0c95\u0005\u0088\u0000\u0000\u0c95\u0c97\u0005\u00c3\u0000\u0000"+
		"\u0c96\u0c94\u0001\u0000\u0000\u0000\u0c96\u0c97\u0001\u0000\u0000\u0000"+
		"\u0c97\u0c98\u0001\u0000\u0000\u0000\u0c98\u0c99\u0005\u0003\u0000\u0000"+
		"\u0c99\u0d2c\u0001\u0000\u0000\u0000\u0c9a\u0c9b\u0005\u00dc\u0000\u0000"+
		"\u0c9b\u0c9c\u0005\u0002\u0000\u0000\u0c9c\u0c9d\u0003\u0116\u008b\u0000"+
		"\u0c9d\u0c9e\u0005\u008b\u0000\u0000\u0c9e\u0c9f\u0003\u0116\u008b\u0000"+
		"\u0c9f\u0ca0\u0005\u0003\u0000\u0000\u0ca0\u0d2c\u0001\u0000\u0000\u0000"+
		"\u0ca1\u0d2c\u0003\u011e\u008f\u0000\u0ca2\u0ca4\u0005\u0163\u0000\u0000"+
		"\u0ca3\u0ca5\u0003\u0088D\u0000\u0ca4\u0ca3\u0001\u0000\u0000\u0000\u0ca4"+
		"\u0ca5\u0001\u0000\u0000\u0000\u0ca5\u0d2c\u0001\u0000\u0000\u0000\u0ca6"+
		"\u0ca7\u0003\u0168\u00b4\u0000\u0ca7\u0ca8\u0005\u0005\u0000\u0000\u0ca8"+
		"\u0caa\u0005\u0163\u0000\u0000\u0ca9\u0cab\u0003\u0088D\u0000\u0caa\u0ca9"+
		"\u0001\u0000\u0000\u0000\u0caa\u0cab\u0001\u0000\u0000\u0000\u0cab\u0d2c"+
		"\u0001\u0000\u0000\u0000\u0cac\u0cad\u0005\u0002\u0000\u0000\u0cad\u0cb0"+
		"\u0003\u00fe\u007f\u0000\u0cae\u0caf\u0005\u0004\u0000\u0000\u0caf\u0cb1"+
		"\u0003\u00fe\u007f\u0000\u0cb0\u0cae\u0001\u0000\u0000\u0000\u0cb1\u0cb2"+
		"\u0001\u0000\u0000\u0000\u0cb2\u0cb0\u0001\u0000\u0000\u0000\u0cb2\u0cb3"+
		"\u0001\u0000\u0000\u0000\u0cb3\u0cb4\u0001\u0000\u0000\u0000\u0cb4\u0cb5"+
		"\u0005\u0003\u0000\u0000\u0cb5\u0d2c\u0001\u0000\u0000\u0000\u0cb6\u0cb7"+
		"\u0005\u0002\u0000\u0000\u0cb7\u0cb8\u00030\u0018\u0000\u0cb8\u0cb9\u0005"+
		"\u0003\u0000\u0000\u0cb9\u0d2c\u0001\u0000\u0000\u0000\u0cba\u0cbb\u0003"+
		"\u0166\u00b3\u0000\u0cbb\u0cc7\u0005\u0002\u0000\u0000\u0cbc\u0cbe\u0003"+
		"\u00c2a\u0000\u0cbd\u0cbc\u0001\u0000\u0000\u0000\u0cbd\u0cbe\u0001\u0000"+
		"\u0000\u0000\u0cbe\u0cbf\u0001\u0000\u0000\u0000\u0cbf\u0cc4\u0003\u010e"+
		"\u0087\u0000\u0cc0\u0cc1\u0005\u0004\u0000\u0000\u0cc1\u0cc3\u0003\u010e"+
		"\u0087\u0000\u0cc2\u0cc0\u0001\u0000\u0000\u0000\u0cc3\u0cc6\u0001\u0000"+
		"\u0000\u0000\u0cc4\u0cc2\u0001\u0000\u0000\u0000\u0cc4\u0cc5\u0001\u0000"+
		"\u0000\u0000\u0cc5\u0cc8\u0001\u0000\u0000\u0000\u0cc6\u0cc4\u0001\u0000"+
		"\u0000\u0000\u0cc7\u0cbd\u0001\u0000\u0000\u0000\u0cc7\u0cc8\u0001\u0000"+
		"\u0000\u0000\u0cc8\u0cc9\u0001\u0000\u0000\u0000\u0cc9\u0cd9\u0005\u0003"+
		"\u0000\u0000\u0cca\u0ccb\u0005\u0155\u0000\u0000\u0ccb\u0ccc\u0005\u0080"+
		"\u0000\u0000\u0ccc\u0ccd\u0005\u0002\u0000\u0000\u0ccd\u0cce\u0005\u00cc"+
		"\u0000\u0000\u0cce\u0ccf\u0005\u001f\u0000\u0000\u0ccf\u0cd4\u0003n7\u0000"+
		"\u0cd0\u0cd1\u0005\u0004\u0000\u0000\u0cd1\u0cd3\u0003n7\u0000\u0cd2\u0cd0"+
		"\u0001\u0000\u0000\u0000\u0cd3\u0cd6\u0001\u0000\u0000\u0000\u0cd4\u0cd2"+
		"\u0001\u0000\u0000\u0000\u0cd4\u0cd5\u0001\u0000\u0000\u0000\u0cd5\u0cd7"+
		"\u0001\u0000\u0000\u0000\u0cd6\u0cd4\u0001\u0000\u0000\u0000\u0cd7\u0cd8"+
		"\u0005\u0003\u0000\u0000\u0cd8\u0cda\u0001\u0000\u0000\u0000\u0cd9\u0cca"+
		"\u0001\u0000\u0000\u0000\u0cd9\u0cda\u0001\u0000\u0000\u0000\u0cda\u0ce1"+
		"\u0001\u0000\u0000\u0000\u0cdb\u0cdc\u0005p\u0000\u0000\u0cdc\u0cdd\u0005"+
		"\u0002\u0000\u0000\u0cdd\u0cde\u0005\u0152\u0000\u0000\u0cde\u0cdf\u0003"+
		"\u0112\u0089\u0000\u0cdf\u0ce0\u0005\u0003\u0000\u0000\u0ce0\u0ce2\u0001"+
		"\u0000\u0000\u0000\u0ce1\u0cdb\u0001\u0000\u0000\u0000\u0ce1\u0ce2\u0001"+
		"\u0000\u0000\u0000\u0ce2\u0ce5\u0001\u0000\u0000\u0000\u0ce3\u0ce4\u0007"+
		"%\u0000\u0000\u0ce4\u0ce6\u0005\u00c3\u0000\u0000\u0ce5\u0ce3\u0001\u0000"+
		"\u0000\u0000\u0ce5\u0ce6\u0001\u0000\u0000\u0000\u0ce6\u0ce9\u0001\u0000"+
		"\u0000\u0000\u0ce7\u0ce8\u0005\u00d0\u0000\u0000\u0ce8\u0cea\u0003\u015e"+
		"\u00af\u0000\u0ce9\u0ce7\u0001\u0000\u0000\u0000\u0ce9\u0cea\u0001\u0000"+
		"\u0000\u0000\u0cea\u0d2c\u0001\u0000\u0000\u0000\u0ceb\u0cec\u0003\u016e"+
		"\u00b7\u0000\u0cec\u0ced\u0005\u016d\u0000\u0000\u0ced\u0cee\u0003\u010a"+
		"\u0085\u0000\u0cee\u0d2c\u0001\u0000\u0000\u0000\u0cef\u0cf0\u0005\u0002"+
		"\u0000\u0000\u0cf0\u0cf3\u0003\u016e\u00b7\u0000\u0cf1\u0cf2\u0005\u0004"+
		"\u0000\u0000\u0cf2\u0cf4\u0003\u016e\u00b7\u0000\u0cf3\u0cf1\u0001\u0000"+
		"\u0000\u0000\u0cf4\u0cf5\u0001\u0000\u0000\u0000\u0cf5\u0cf3\u0001\u0000"+
		"\u0000\u0000\u0cf5\u0cf6\u0001\u0000\u0000\u0000\u0cf6\u0cf7\u0001\u0000"+
		"\u0000\u0000\u0cf7\u0cf8\u0005\u0003\u0000\u0000\u0cf8\u0cf9\u0005\u016d"+
		"\u0000\u0000\u0cf9\u0cfa\u0003\u010a\u0085\u0000\u0cfa\u0d2c\u0001\u0000"+
		"\u0000\u0000\u0cfb\u0d2c\u0003\u016e\u00b7\u0000\u0cfc\u0cfd\u0005\u0002"+
		"\u0000\u0000\u0cfd\u0cfe\u0003\u010a\u0085\u0000\u0cfe\u0cff\u0005\u0003"+
		"\u0000\u0000\u0cff\u0d2c\u0001\u0000\u0000\u0000\u0d00\u0d01\u0005l\u0000"+
		"\u0000\u0d01\u0d02\u0005\u0002\u0000\u0000\u0d02\u0d03\u0003\u016e\u00b7"+
		"\u0000\u0d03\u0d04\u0005y\u0000\u0000\u0d04\u0d05\u0003\u0116\u008b\u0000"+
		"\u0d05\u0d06\u0005\u0003\u0000\u0000\u0d06\u0d2c\u0001\u0000\u0000\u0000"+
		"\u0d07\u0d08\u0007&\u0000\u0000\u0d08\u0d09\u0005\u0002\u0000\u0000\u0d09"+
		"\u0d0a\u0003\u0116\u008b\u0000\u0d0a\u0d0b\u0007\'\u0000\u0000\u0d0b\u0d0e"+
		"\u0003\u0116\u008b\u0000\u0d0c\u0d0d\u0007(\u0000\u0000\u0d0d\u0d0f\u0003"+
		"\u0116\u008b\u0000\u0d0e\u0d0c\u0001\u0000\u0000\u0000\u0d0e\u0d0f\u0001"+
		"\u0000\u0000\u0000\u0d0f\u0d10\u0001\u0000\u0000\u0000\u0d10\u0d11\u0005"+
		"\u0003\u0000\u0000\u0d11\u0d2c\u0001\u0000\u0000\u0000\u0d12\u0d13\u0005"+
		"\u0134\u0000\u0000\u0d13\u0d15\u0005\u0002\u0000\u0000\u0d14\u0d16\u0007"+
		")\u0000\u0000\u0d15\u0d14\u0001\u0000\u0000\u0000\u0d15\u0d16\u0001\u0000"+
		"\u0000\u0000\u0d16\u0d18\u0001\u0000\u0000\u0000\u0d17\u0d19\u0003\u0116"+
		"\u008b\u0000\u0d18\u0d17\u0001\u0000\u0000\u0000\u0d18\u0d19\u0001\u0000"+
		"\u0000\u0000\u0d19\u0d1a\u0001\u0000\u0000\u0000\u0d1a\u0d1b\u0005y\u0000"+
		"\u0000\u0d1b\u0d1c\u0003\u0116\u008b\u0000\u0d1c\u0d1d\u0005\u0003\u0000"+
		"\u0000\u0d1d\u0d2c\u0001\u0000\u0000\u0000\u0d1e\u0d1f\u0005\u00d2\u0000"+
		"\u0000\u0d1f\u0d20\u0005\u0002\u0000\u0000\u0d20\u0d21\u0003\u0116\u008b"+
		"\u0000\u0d21\u0d22\u0005\u00db\u0000\u0000\u0d22\u0d23\u0003\u0116\u008b"+
		"\u0000\u0d23\u0d24\u0005y\u0000\u0000\u0d24\u0d27\u0003\u0116\u008b\u0000"+
		"\u0d25\u0d26\u0005u\u0000\u0000\u0d26\u0d28\u0003\u0116\u008b\u0000\u0d27"+
		"\u0d25\u0001\u0000\u0000\u0000\u0d27\u0d28\u0001\u0000\u0000\u0000\u0d28"+
		"\u0d29\u0001\u0000\u0000\u0000\u0d29\u0d2a\u0005\u0003\u0000\u0000\u0d2a"+
		"\u0d2c\u0001\u0000\u0000\u0000\u0d2b\u0c38\u0001\u0000\u0000\u0000\u0d2b"+
		"\u0c3a\u0001\u0000\u0000\u0000\u0d2b\u0c46\u0001\u0000\u0000\u0000\u0d2b"+
		"\u0c52\u0001\u0000\u0000\u0000\u0d2b\u0c5e\u0001\u0000\u0000\u0000\u0d2b"+
		"\u0c6b\u0001\u0000\u0000\u0000\u0d2b\u0c72\u0001\u0000\u0000\u0000\u0d2b"+
		"\u0c7f\u0001\u0000\u0000\u0000\u0d2b\u0c88\u0001\u0000\u0000\u0000\u0d2b"+
		"\u0c91\u0001\u0000\u0000\u0000\u0d2b\u0c9a\u0001\u0000\u0000\u0000\u0d2b"+
		"\u0ca1\u0001\u0000\u0000\u0000\u0d2b\u0ca2\u0001\u0000\u0000\u0000\u0d2b"+
		"\u0ca6\u0001\u0000\u0000\u0000\u0d2b\u0cac\u0001\u0000\u0000\u0000\u0d2b"+
		"\u0cb6\u0001\u0000\u0000\u0000\u0d2b\u0cba\u0001\u0000\u0000\u0000\u0d2b"+
		"\u0ceb\u0001\u0000\u0000\u0000\u0d2b\u0cef\u0001\u0000\u0000\u0000\u0d2b"+
		"\u0cfb\u0001\u0000\u0000\u0000\u0d2b\u0cfc\u0001\u0000\u0000\u0000\u0d2b"+
		"\u0d00\u0001\u0000\u0000\u0000\u0d2b\u0d07\u0001\u0000\u0000\u0000\u0d2b"+
		"\u0d12\u0001\u0000\u0000\u0000\u0d2b\u0d1e\u0001\u0000\u0000\u0000\u0d2c"+
		"\u0d3a\u0001\u0000\u0000\u0000\u0d2d\u0d2e\n\u0016\u0000\u0000\u0d2e\u0d2f"+
		"\u0005\u016c\u0000\u0000\u0d2f\u0d39\u0003\u013c\u009e\u0000\u0d30\u0d31"+
		"\n\b\u0000\u0000\u0d31\u0d32\u0005\u0006\u0000\u0000\u0d32\u0d33\u0003"+
		"\u0116\u008b\u0000\u0d33\u0d34\u0005\u0007\u0000\u0000\u0d34\u0d39\u0001"+
		"\u0000\u0000\u0000\u0d35\u0d36\n\u0006\u0000\u0000\u0d36\u0d37\u0005\u0005"+
		"\u0000\u0000\u0d37\u0d39\u0003\u016e\u00b7\u0000\u0d38\u0d2d\u0001\u0000"+
		"\u0000\u0000\u0d38\u0d30\u0001\u0000\u0000\u0000\u0d38\u0d35\u0001\u0000"+
		"\u0000\u0000\u0d39\u0d3c\u0001\u0000\u0000\u0000\u0d3a\u0d38\u0001\u0000"+
		"\u0000\u0000\u0d3a\u0d3b\u0001\u0000\u0000\u0000\u0d3b\u011b\u0001\u0000"+
		"\u0000\u0000\u0d3c\u0d3a\u0001\u0000\u0000\u0000\u0d3d\u0d45\u0005G\u0000"+
		"\u0000\u0d3e\u0d45\u0005\u0127\u0000\u0000\u0d3f\u0d45\u0005\u0128\u0000"+
		"\u0000\u0d40\u0d45\u0005\u0129\u0000\u0000\u0d41\u0d45\u0005\u0094\u0000"+
		"\u0000\u0d42\u0d45\u0005\u0083\u0000\u0000\u0d43\u0d45\u0003\u016e\u00b7"+
		"\u0000\u0d44\u0d3d\u0001\u0000\u0000\u0000\u0d44\u0d3e\u0001\u0000\u0000"+
		"\u0000\u0d44\u0d3f\u0001\u0000\u0000\u0000\u0d44\u0d40\u0001\u0000\u0000"+
		"\u0000\u0d44\u0d41\u0001\u0000\u0000\u0000\u0d44\u0d42\u0001\u0000\u0000"+
		"\u0000\u0d44\u0d43\u0001\u0000\u0000\u0000\u0d45\u011d\u0001\u0000\u0000"+
		"\u0000\u0d46\u0d56\u0005\u00c2\u0000\u0000\u0d47\u0d56\u0005\u0171\u0000"+
		"\u0000\u0d48\u0d49\u0005\u016b\u0000\u0000\u0d49\u0d56\u0003\u016e\u00b7"+
		"\u0000\u0d4a\u0d56\u0003\u0128\u0094\u0000\u0d4b\u0d4c\u0003\u011c\u008e"+
		"\u0000\u0d4c\u0d4d\u0003\u017a\u00bd\u0000\u0d4d\u0d56\u0001\u0000\u0000"+
		"\u0000\u0d4e\u0d56\u0003\u0176\u00bb\u0000\u0d4f\u0d56\u0003\u0126\u0093"+
		"\u0000\u0d50\u0d52\u0003\u017a\u00bd\u0000\u0d51\u0d50\u0001\u0000\u0000"+
		"\u0000\u0d52\u0d53\u0001\u0000\u0000\u0000\u0d53\u0d51\u0001\u0000\u0000"+
		"\u0000\u0d53\u0d54\u0001\u0000\u0000\u0000\u0d54\u0d56\u0001\u0000\u0000"+
		"\u0000\u0d55\u0d46\u0001\u0000\u0000\u0000\u0d55\u0d47\u0001\u0000\u0000"+
		"\u0000\u0d55\u0d48\u0001\u0000\u0000\u0000\u0d55\u0d4a\u0001\u0000\u0000"+
		"\u0000\u0d55\u0d4b\u0001\u0000\u0000\u0000\u0d55\u0d4e\u0001\u0000\u0000"+
		"\u0000\u0d55\u0d4f\u0001\u0000\u0000\u0000\u0d55\u0d51\u0001\u0000\u0000"+
		"\u0000\u0d56\u011f\u0001\u0000\u0000\u0000\u0d57\u0d58\u0007*\u0000\u0000"+
		"\u0d58\u0121\u0001\u0000\u0000\u0000\u0d59\u0d5a\u0007+\u0000\u0000\u0d5a"+
		"\u0123\u0001\u0000\u0000\u0000\u0d5b\u0d5c\u0007,\u0000\u0000\u0d5c\u0125"+
		"\u0001\u0000\u0000\u0000\u0d5d\u0d5e\u0007-\u0000\u0000\u0d5e\u0127\u0001"+
		"\u0000\u0000\u0000\u0d5f\u0d62\u0005\u0094\u0000\u0000\u0d60\u0d63\u0003"+
		"\u012a\u0095\u0000\u0d61\u0d63\u0003\u012e\u0097\u0000\u0d62\u0d60\u0001"+
		"\u0000\u0000\u0000\u0d62\u0d61\u0001\u0000\u0000\u0000\u0d63\u0129\u0001"+
		"\u0000\u0000\u0000\u0d64\u0d66\u0003\u012c\u0096\u0000\u0d65\u0d67\u0003"+
		"\u0130\u0098\u0000\u0d66\u0d65\u0001\u0000\u0000\u0000\u0d66\u0d67\u0001"+
		"\u0000\u0000\u0000\u0d67\u012b\u0001\u0000\u0000\u0000\u0d68\u0d69\u0003"+
		"\u0132\u0099\u0000\u0d69\u0d6a\u0003\u0134\u009a\u0000\u0d6a\u0d6c\u0001"+
		"\u0000\u0000\u0000\u0d6b\u0d68\u0001\u0000\u0000\u0000\u0d6c\u0d6d\u0001"+
		"\u0000\u0000\u0000\u0d6d\u0d6b\u0001\u0000\u0000\u0000\u0d6d\u0d6e\u0001"+
		"\u0000\u0000\u0000\u0d6e\u012d\u0001\u0000\u0000\u0000\u0d6f\u0d72\u0003"+
		"\u0130\u0098\u0000\u0d70\u0d73\u0003\u012c\u0096\u0000\u0d71\u0d73\u0003"+
		"\u0130\u0098\u0000\u0d72\u0d70\u0001\u0000\u0000\u0000\u0d72\u0d71\u0001"+
		"\u0000\u0000\u0000\u0d72\u0d73\u0001\u0000\u0000\u0000\u0d73\u012f\u0001"+
		"\u0000\u0000\u0000\u0d74\u0d75\u0003\u0132\u0099\u0000\u0d75\u0d76\u0003"+
		"\u0136\u009b\u0000\u0d76\u0d77\u0005\u012d\u0000\u0000\u0d77\u0d78\u0003"+
		"\u0136\u009b\u0000\u0d78\u0131\u0001\u0000\u0000\u0000\u0d79\u0d7b\u0007"+
		".\u0000\u0000\u0d7a\u0d79\u0001\u0000\u0000\u0000\u0d7a\u0d7b\u0001\u0000"+
		"\u0000\u0000\u0d7b\u0d7f\u0001\u0000\u0000\u0000\u0d7c\u0d80\u0005\u0177"+
		"\u0000\u0000\u0d7d\u0d80\u0005\u0179\u0000\u0000\u0d7e\u0d80\u0003\u017a"+
		"\u00bd\u0000\u0d7f\u0d7c\u0001\u0000\u0000\u0000\u0d7f\u0d7d\u0001\u0000"+
		"\u0000\u0000\u0d7f\u0d7e\u0001\u0000\u0000\u0000\u0d80\u0133\u0001\u0000"+
		"\u0000\u0000\u0d81\u0d82\u0007/\u0000\u0000\u0d82\u0135\u0001\u0000\u0000"+
		"\u0000\u0d83\u0d84\u00070\u0000\u0000\u0d84\u0137\u0001\u0000\u0000\u0000"+
		"\u0d85\u0d89\u0005r\u0000\u0000\u0d86\u0d87\u0005\t\u0000\u0000\u0d87"+
		"\u0d89\u0003\u016a\u00b5\u0000\u0d88\u0d85\u0001\u0000\u0000\u0000\u0d88"+
		"\u0d86\u0001\u0000\u0000\u0000\u0d89\u0139\u0001\u0000\u0000\u0000\u0d8a"+
		"\u0daa\u0005\u001b\u0000\u0000\u0d8b\u0daa\u0005\u012c\u0000\u0000\u0d8c"+
		"\u0daa\u0005 \u0000\u0000\u0d8d\u0daa\u0005\u010d\u0000\u0000\u0d8e\u0daa"+
		"\u0005\u0109\u0000\u0000\u0d8f\u0daa\u0005\u0095\u0000\u0000\u0d90\u0daa"+
		"\u0005\u0096\u0000\u0000\u0d91\u0daa\u0005\u0019\u0000\u0000\u0d92\u0daa"+
		"\u0005\u00ac\u0000\u0000\u0d93\u0daa\u0005s\u0000\u0000\u0d94\u0daa\u0005"+
		"\u00e5\u0000\u0000\u0d95\u0daa\u0005^\u0000\u0000\u0d96\u0daa\u0005G\u0000"+
		"\u0000\u0d97\u0daa\u0005\u0127\u0000\u0000\u0d98\u0daa\u0005\u0129\u0000"+
		"\u0000\u0d99\u0daa\u0005\u0128\u0000\u0000\u0d9a\u0daa\u0005\u0116\u0000"+
		"\u0000\u0d9b\u0daa\u0005)\u0000\u0000\u0d9c\u0daa\u0005(\u0000\u0000\u0d9d"+
		"\u0daa\u0005\u0147\u0000\u0000\u0d9e\u0daa\u0005\u001a\u0000\u0000\u0d9f"+
		"\u0daa\u0005P\u0000\u0000\u0da0\u0daa\u0005O\u0000\u0000\u0da1\u0daa\u0005"+
		"\u00c4\u0000\u0000\u0da2\u0daa\u0005\u014e\u0000\u0000\u0da3\u0daa\u0005"+
		"\u0094\u0000\u0000\u0da4\u0daa\u0005\u014a\u0000\u0000\u0da5\u0daa\u0005"+
		"\u0013\u0000\u0000\u0da6\u0daa\u0005\u0117\u0000\u0000\u0da7\u0daa\u0005"+
		"\u00ae\u0000\u0000\u0da8\u0daa\u0003\u016e\u00b7\u0000\u0da9\u0d8a\u0001"+
		"\u0000\u0000\u0000\u0da9\u0d8b\u0001\u0000\u0000\u0000\u0da9\u0d8c\u0001"+
		"\u0000\u0000\u0000\u0da9\u0d8d\u0001\u0000\u0000\u0000\u0da9\u0d8e\u0001"+
		"\u0000\u0000\u0000\u0da9\u0d8f\u0001\u0000\u0000\u0000\u0da9\u0d90\u0001"+
		"\u0000\u0000\u0000\u0da9\u0d91\u0001\u0000\u0000\u0000\u0da9\u0d92\u0001"+
		"\u0000\u0000\u0000\u0da9\u0d93\u0001\u0000\u0000\u0000\u0da9\u0d94\u0001"+
		"\u0000\u0000\u0000\u0da9\u0d95\u0001\u0000\u0000\u0000\u0da9\u0d96\u0001"+
		"\u0000\u0000\u0000\u0da9\u0d97\u0001\u0000\u0000\u0000\u0da9\u0d98\u0001"+
		"\u0000\u0000\u0000\u0da9\u0d99\u0001\u0000\u0000\u0000\u0da9\u0d9a\u0001"+
		"\u0000\u0000\u0000\u0da9\u0d9b\u0001\u0000\u0000\u0000\u0da9\u0d9c\u0001"+
		"\u0000\u0000\u0000\u0da9\u0d9d\u0001\u0000\u0000\u0000\u0da9\u0d9e\u0001"+
		"\u0000\u0000\u0000\u0da9\u0d9f\u0001\u0000\u0000\u0000\u0da9\u0da0\u0001"+
		"\u0000\u0000\u0000\u0da9\u0da1\u0001\u0000\u0000\u0000\u0da9\u0da2\u0001"+
		"\u0000\u0000\u0000\u0da9\u0da3\u0001\u0000\u0000\u0000\u0da9\u0da4\u0001"+
		"\u0000\u0000\u0000\u0da9\u0da5\u0001\u0000\u0000\u0000\u0da9\u0da6\u0001"+
		"\u0000\u0000\u0000\u0da9\u0da7\u0001\u0000\u0000\u0000\u0da9\u0da8\u0001"+
		"\u0000\u0000\u0000\u0daa\u013b\u0001\u0000\u0000\u0000\u0dab\u0dac\u0005"+
		"\u0013\u0000\u0000\u0dac\u0dad\u0005\u015d\u0000\u0000\u0dad\u0dae\u0003"+
		"\u013c\u009e\u0000\u0dae\u0daf\u0005\u015f\u0000\u0000\u0daf\u0dda\u0001"+
		"\u0000\u0000\u0000\u0db0\u0db1\u0005\u00ae\u0000\u0000\u0db1\u0db2\u0005"+
		"\u015d\u0000\u0000\u0db2\u0db3\u0003\u013c\u009e\u0000\u0db3\u0db4\u0005"+
		"\u0004\u0000\u0000\u0db4\u0db5\u0003\u013c\u009e\u0000\u0db5\u0db6\u0005"+
		"\u015f\u0000\u0000\u0db6\u0dda\u0001\u0000\u0000\u0000\u0db7\u0dbe\u0005"+
		"\u0117\u0000\u0000\u0db8\u0dba\u0005\u015d\u0000\u0000\u0db9\u0dbb\u0003"+
		"\u0154\u00aa\u0000\u0dba\u0db9\u0001\u0000\u0000\u0000\u0dba\u0dbb\u0001"+
		"\u0000\u0000\u0000\u0dbb\u0dbc\u0001\u0000\u0000\u0000\u0dbc\u0dbf\u0005"+
		"\u015f\u0000\u0000\u0dbd\u0dbf\u0005\u015b\u0000\u0000\u0dbe\u0db8\u0001"+
		"\u0000\u0000\u0000\u0dbe\u0dbd\u0001\u0000\u0000\u0000\u0dbf\u0dda\u0001"+
		"\u0000\u0000\u0000\u0dc0\u0dc1\u0005\u0094\u0000\u0000\u0dc1\u0dc4\u0007"+
		"1\u0000\u0000\u0dc2\u0dc3\u0005\u012d\u0000\u0000\u0dc3\u0dc5\u0005\u00b7"+
		"\u0000\u0000\u0dc4\u0dc2\u0001\u0000\u0000\u0000\u0dc4\u0dc5\u0001\u0000"+
		"\u0000\u0000\u0dc5\u0dda\u0001\u0000\u0000\u0000\u0dc6\u0dc7\u0005\u0094"+
		"\u0000\u0000\u0dc7\u0dca\u00072\u0000\u0000\u0dc8\u0dc9\u0005\u012d\u0000"+
		"\u0000\u0dc9\u0dcb\u00073\u0000\u0000\u0dca\u0dc8\u0001\u0000\u0000\u0000"+
		"\u0dca\u0dcb\u0001\u0000\u0000\u0000\u0dcb\u0dda\u0001\u0000\u0000\u0000"+
		"\u0dcc\u0dd7\u0003\u013a\u009d\u0000\u0dcd\u0dce\u0005\u0002\u0000\u0000"+
		"\u0dce\u0dd3\u0005\u0177\u0000\u0000\u0dcf\u0dd0\u0005\u0004\u0000\u0000"+
		"\u0dd0\u0dd2\u0005\u0177\u0000\u0000\u0dd1\u0dcf\u0001\u0000\u0000\u0000"+
		"\u0dd2\u0dd5\u0001\u0000\u0000\u0000\u0dd3\u0dd1\u0001\u0000\u0000\u0000"+
		"\u0dd3\u0dd4\u0001\u0000\u0000\u0000\u0dd4\u0dd6\u0001\u0000\u0000\u0000"+
		"\u0dd5\u0dd3\u0001\u0000\u0000\u0000\u0dd6\u0dd8\u0005\u0003\u0000\u0000"+
		"\u0dd7\u0dcd\u0001\u0000\u0000\u0000\u0dd7\u0dd8\u0001\u0000\u0000\u0000"+
		"\u0dd8\u0dda\u0001\u0000\u0000\u0000\u0dd9\u0dab\u0001\u0000\u0000\u0000"+
		"\u0dd9\u0db0\u0001\u0000\u0000\u0000\u0dd9\u0db7\u0001\u0000\u0000\u0000"+
		"\u0dd9\u0dc0\u0001\u0000\u0000\u0000\u0dd9\u0dc6\u0001\u0000\u0000\u0000"+
		"\u0dd9\u0dcc\u0001\u0000\u0000\u0000\u0dda\u013d\u0001\u0000\u0000\u0000"+
		"\u0ddb\u0de0\u0003\u0140\u00a0\u0000\u0ddc\u0ddd\u0005\u0004\u0000\u0000"+
		"\u0ddd\u0ddf\u0003\u0140\u00a0\u0000\u0dde\u0ddc\u0001\u0000\u0000\u0000"+
		"\u0ddf\u0de2\u0001\u0000\u0000\u0000\u0de0\u0dde\u0001\u0000\u0000\u0000"+
		"\u0de0\u0de1\u0001\u0000\u0000\u0000\u0de1\u013f\u0001\u0000\u0000\u0000"+
		"\u0de2\u0de0\u0001\u0000\u0000\u0000\u0de3\u0de4\u0003\u00f4z\u0000\u0de4"+
		"\u0de8\u0003\u013c\u009e\u0000\u0de5\u0de7\u0003\u0142\u00a1\u0000\u0de6"+
		"\u0de5\u0001\u0000\u0000\u0000\u0de7\u0dea\u0001\u0000\u0000\u0000\u0de8"+
		"\u0de6\u0001\u0000\u0000\u0000\u0de8\u0de9\u0001\u0000\u0000\u0000\u0de9"+
		"\u0141\u0001\u0000\u0000\u0000\u0dea\u0de8\u0001\u0000\u0000\u0000\u0deb"+
		"\u0dec\u0005\u00c1\u0000\u0000\u0dec\u0df1\u0005\u00c2\u0000\u0000\u0ded"+
		"\u0df1\u0003\u0144\u00a2\u0000\u0dee\u0df1\u0003.\u0017\u0000\u0def\u0df1"+
		"\u0003\u0138\u009c\u0000\u0df0\u0deb\u0001\u0000\u0000\u0000\u0df0\u0ded"+
		"\u0001\u0000\u0000\u0000\u0df0\u0dee\u0001\u0000\u0000\u0000\u0df0\u0def"+
		"\u0001\u0000\u0000\u0000\u0df1\u0143\u0001\u0000\u0000\u0000\u0df2\u0df3"+
		"\u0005R\u0000\u0000\u0df3\u0df4\u0003\u010a\u0085\u0000\u0df4\u0145\u0001"+
		"\u0000\u0000\u0000\u0df5\u0df6\u00074\u0000\u0000\u0df6\u0df7\u0003\u010a"+
		"\u0085\u0000\u0df7\u0147\u0001\u0000\u0000\u0000\u0df8\u0dfd\u0003\u014a"+
		"\u00a5\u0000\u0df9\u0dfa\u0005\u0004\u0000\u0000\u0dfa\u0dfc\u0003\u014a"+
		"\u00a5\u0000\u0dfb\u0df9\u0001\u0000\u0000\u0000\u0dfc\u0dff\u0001\u0000"+
		"\u0000\u0000\u0dfd\u0dfb\u0001\u0000\u0000\u0000\u0dfd\u0dfe\u0001\u0000"+
		"\u0000\u0000\u0dfe\u0149\u0001\u0000\u0000\u0000\u0dff\u0dfd\u0001\u0000"+
		"\u0000\u0000\u0e00\u0e01\u0003\u016a\u00b5\u0000\u0e01\u0e04\u0003\u013c"+
		"\u009e\u0000\u0e02\u0e03\u0005\u00c1\u0000\u0000\u0e03\u0e05\u0005\u00c2"+
		"\u0000\u0000\u0e04\u0e02\u0001\u0000\u0000\u0000\u0e04\u0e05\u0001\u0000"+
		"\u0000\u0000\u0e05\u0e07\u0001\u0000\u0000\u0000\u0e06\u0e08\u0003.\u0017"+
		"\u0000\u0e07\u0e06\u0001\u0000\u0000\u0000\u0e07\u0e08\u0001\u0000\u0000"+
		"\u0000\u0e08\u014b\u0001\u0000\u0000\u0000\u0e09\u0e0e\u0003\u014e\u00a7"+
		"\u0000\u0e0a\u0e0b\u0005\u0004\u0000\u0000\u0e0b\u0e0d\u0003\u014e\u00a7"+
		"\u0000\u0e0c\u0e0a\u0001\u0000\u0000\u0000\u0e0d\u0e10\u0001\u0000\u0000"+
		"\u0000\u0e0e\u0e0c\u0001\u0000\u0000\u0000\u0e0e\u0e0f\u0001\u0000\u0000"+
		"\u0000\u0e0f\u014d\u0001\u0000\u0000\u0000\u0e10\u0e0e\u0001\u0000\u0000"+
		"\u0000\u0e11\u0e12\u0003\u016a\u00b5\u0000\u0e12\u0e16\u0003\u013c\u009e"+
		"\u0000\u0e13\u0e15\u0003\u0150\u00a8\u0000\u0e14\u0e13\u0001\u0000\u0000"+
		"\u0000\u0e15\u0e18\u0001\u0000\u0000\u0000\u0e16\u0e14\u0001\u0000\u0000"+
		"\u0000\u0e16\u0e17\u0001\u0000\u0000\u0000\u0e17\u014f\u0001\u0000\u0000"+
		"\u0000\u0e18\u0e16\u0001\u0000\u0000\u0000\u0e19\u0e1a\u0005\u00c1\u0000"+
		"\u0000\u0e1a\u0e1f\u0005\u00c2\u0000\u0000\u0e1b\u0e1f\u0003\u0144\u00a2"+
		"\u0000\u0e1c\u0e1f\u0003\u0152\u00a9\u0000\u0e1d\u0e1f\u0003.\u0017\u0000"+
		"\u0e1e\u0e19\u0001\u0000\u0000\u0000\u0e1e\u0e1b\u0001\u0000\u0000\u0000"+
		"\u0e1e\u0e1c\u0001\u0000\u0000\u0000\u0e1e\u0e1d\u0001\u0000\u0000\u0000"+
		"\u0e1f\u0151\u0001\u0000\u0000\u0000\u0e20\u0e21\u0005}\u0000\u0000\u0e21"+
		"\u0e22\u0005\f\u0000\u0000\u0e22\u0e23\u0005\u0014\u0000\u0000\u0e23\u0e24"+
		"\u0005\u0002\u0000\u0000\u0e24\u0e25\u0003\u010a\u0085\u0000\u0e25\u0e26"+
		"\u0005\u0003\u0000\u0000\u0e26\u0153\u0001\u0000\u0000\u0000\u0e27\u0e2c"+
		"\u0003\u0156\u00ab\u0000\u0e28\u0e29\u0005\u0004\u0000\u0000\u0e29\u0e2b"+
		"\u0003\u0156\u00ab\u0000\u0e2a\u0e28\u0001\u0000\u0000\u0000\u0e2b\u0e2e"+
		"\u0001\u0000\u0000\u0000\u0e2c\u0e2a\u0001\u0000\u0000\u0000\u0e2c\u0e2d"+
		"\u0001\u0000\u0000\u0000\u0e2d\u0155\u0001\u0000\u0000\u0000\u0e2e\u0e2c"+
		"\u0001\u0000\u0000\u0000\u0e2f\u0e31\u0003\u016e\u00b7\u0000\u0e30\u0e32"+
		"\u0005\u016b\u0000\u0000\u0e31\u0e30\u0001\u0000\u0000\u0000\u0e31\u0e32"+
		"\u0001\u0000\u0000\u0000\u0e32\u0e33\u0001\u0000\u0000\u0000\u0e33\u0e36"+
		"\u0003\u013c\u009e\u0000\u0e34\u0e35\u0005\u00c1\u0000\u0000\u0e35\u0e37"+
		"\u0005\u00c2\u0000\u0000\u0e36\u0e34\u0001\u0000\u0000\u0000\u0e36\u0e37"+
		"\u0001\u0000\u0000\u0000\u0e37\u0e39\u0001\u0000\u0000\u0000\u0e38\u0e3a"+
		"\u0003.\u0017\u0000\u0e39\u0e38\u0001\u0000\u0000\u0000\u0e39\u0e3a\u0001"+
		"\u0000\u0000\u0000\u0e3a\u0157\u0001\u0000\u0000\u0000\u0e3b\u0e3c\u0005"+
		"\u0151\u0000\u0000\u0e3c\u0e3d\u0003\u010a\u0085\u0000\u0e3d\u0e3e\u0005"+
		"\u0124\u0000\u0000\u0e3e\u0e3f\u0003\u010a\u0085\u0000\u0e3f\u0159\u0001"+
		"\u0000\u0000\u0000\u0e40\u0e41\u0005\u0153\u0000\u0000\u0e41\u0e46\u0003"+
		"\u015c\u00ae\u0000\u0e42\u0e43\u0005\u0004\u0000\u0000\u0e43\u0e45\u0003"+
		"\u015c\u00ae\u0000\u0e44\u0e42\u0001\u0000\u0000\u0000\u0e45\u0e48\u0001"+
		"\u0000\u0000\u0000\u0e46\u0e44\u0001\u0000\u0000\u0000\u0e46\u0e47\u0001"+
		"\u0000\u0000\u0000\u0e47\u015b\u0001\u0000\u0000\u0000\u0e48\u0e46\u0001"+
		"\u0000\u0000\u0000\u0e49\u0e4a\u0003\u016a\u00b5\u0000\u0e4a\u0e4b\u0005"+
		"\u0014\u0000\u0000\u0e4b\u0e4c\u0003\u015e\u00af\u0000\u0e4c\u015d\u0001"+
		"\u0000\u0000\u0000\u0e4d\u0e7c\u0003\u016a\u00b5\u0000\u0e4e\u0e4f\u0005"+
		"\u0002\u0000\u0000\u0e4f\u0e50\u0003\u016a\u00b5\u0000\u0e50\u0e51\u0005"+
		"\u0003\u0000\u0000\u0e51\u0e7c\u0001\u0000\u0000\u0000\u0e52\u0e75\u0005"+
		"\u0002\u0000\u0000\u0e53\u0e54\u0005,\u0000\u0000\u0e54\u0e55\u0005\u001f"+
		"\u0000\u0000\u0e55\u0e5a\u0003\u010a\u0085\u0000\u0e56\u0e57\u0005\u0004"+
		"\u0000\u0000\u0e57\u0e59\u0003\u010a\u0085\u0000\u0e58\u0e56\u0001\u0000"+
		"\u0000\u0000\u0e59\u0e5c\u0001\u0000\u0000\u0000\u0e5a\u0e58\u0001\u0000"+
		"\u0000\u0000\u0e5a\u0e5b\u0001\u0000\u0000\u0000\u0e5b\u0e76\u0001\u0000"+
		"\u0000\u0000\u0e5c\u0e5a\u0001\u0000\u0000\u0000\u0e5d\u0e5e\u0007\u0018"+
		"\u0000\u0000\u0e5e\u0e5f\u0005\u001f\u0000\u0000\u0e5f\u0e64\u0003\u010a"+
		"\u0085\u0000\u0e60\u0e61\u0005\u0004\u0000\u0000\u0e61\u0e63\u0003\u010a"+
		"\u0085\u0000\u0e62\u0e60\u0001\u0000\u0000\u0000\u0e63\u0e66\u0001\u0000"+
		"\u0000\u0000\u0e64\u0e62\u0001\u0000\u0000\u0000\u0e64\u0e65\u0001\u0000"+
		"\u0000\u0000\u0e65\u0e68\u0001\u0000\u0000\u0000\u0e66\u0e64\u0001\u0000"+
		"\u0000\u0000\u0e67\u0e5d\u0001\u0000\u0000\u0000\u0e67\u0e68\u0001\u0000"+
		"\u0000\u0000\u0e68\u0e73\u0001\u0000\u0000\u0000\u0e69\u0e6a\u0007\u0019"+
		"\u0000\u0000\u0e6a\u0e6b\u0005\u001f\u0000\u0000\u0e6b\u0e70\u0003n7\u0000"+
		"\u0e6c\u0e6d\u0005\u0004\u0000\u0000\u0e6d\u0e6f\u0003n7\u0000\u0e6e\u0e6c"+
		"\u0001\u0000\u0000\u0000\u0e6f\u0e72\u0001\u0000\u0000\u0000\u0e70\u0e6e"+
		"\u0001\u0000\u0000\u0000\u0e70\u0e71\u0001\u0000\u0000\u0000\u0e71\u0e74"+
		"\u0001\u0000\u0000\u0000\u0e72\u0e70\u0001\u0000\u0000\u0000\u0e73\u0e69"+
		"\u0001\u0000\u0000\u0000\u0e73\u0e74\u0001\u0000\u0000\u0000\u0e74\u0e76"+
		"\u0001\u0000\u0000\u0000\u0e75\u0e53\u0001\u0000\u0000\u0000\u0e75\u0e67"+
		"\u0001\u0000\u0000\u0000\u0e76\u0e78\u0001\u0000\u0000\u0000\u0e77\u0e79"+
		"\u0003\u0160\u00b0\u0000\u0e78\u0e77\u0001\u0000\u0000\u0000\u0e78\u0e79"+
		"\u0001\u0000\u0000\u0000\u0e79\u0e7a\u0001\u0000\u0000\u0000\u0e7a\u0e7c"+
		"\u0005\u0003\u0000\u0000\u0e7b\u0e4d\u0001\u0000\u0000\u0000\u0e7b\u0e4e"+
		"\u0001\u0000\u0000\u0000\u0e7b\u0e52\u0001\u0000\u0000\u0000\u0e7c\u015f"+
		"\u0001\u0000\u0000\u0000\u0e7d\u0e7e\u0005\u00e4\u0000\u0000\u0e7e\u0e8e"+
		"\u0003\u0162\u00b1\u0000\u0e7f\u0e80\u0005\u00fb\u0000\u0000\u0e80\u0e8e"+
		"\u0003\u0162\u00b1\u0000\u0e81\u0e82\u0005\u00e4\u0000\u0000\u0e82\u0e83"+
		"\u0005\u0018\u0000\u0000\u0e83\u0e84\u0003\u0162\u00b1\u0000\u0e84\u0e85"+
		"\u0005\u000e\u0000\u0000\u0e85\u0e86\u0003\u0162\u00b1\u0000\u0e86\u0e8e"+
		"\u0001\u0000\u0000\u0000\u0e87\u0e88\u0005\u00fb\u0000\u0000\u0e88\u0e89"+
		"\u0005\u0018\u0000\u0000\u0e89\u0e8a\u0003\u0162\u00b1\u0000\u0e8a\u0e8b"+
		"\u0005\u000e\u0000\u0000\u0e8b\u0e8c\u0003\u0162\u00b1\u0000\u0e8c\u0e8e"+
		"\u0001\u0000\u0000\u0000\u0e8d\u0e7d\u0001\u0000\u0000\u0000\u0e8d\u0e7f"+
		"\u0001\u0000\u0000\u0000\u0e8d\u0e81\u0001\u0000\u0000\u0000\u0e8d\u0e87"+
		"\u0001\u0000\u0000\u0000\u0e8e\u0161\u0001\u0000\u0000\u0000\u0e8f\u0e90"+
		"\u0005\u013a\u0000\u0000\u0e90\u0e97\u00075\u0000\u0000\u0e91\u0e92\u0005"+
		">\u0000\u0000\u0e92\u0e97\u0005\u00fa\u0000\u0000\u0e93\u0e94\u0003\u010a"+
		"\u0085\u0000\u0e94\u0e95\u00075\u0000\u0000\u0e95\u0e97\u0001\u0000\u0000"+
		"\u0000\u0e96\u0e8f\u0001\u0000\u0000\u0000\u0e96\u0e91\u0001\u0000\u0000"+
		"\u0000\u0e96\u0e93\u0001\u0000\u0000\u0000\u0e97\u0163\u0001\u0000\u0000"+
		"\u0000\u0e98\u0e9d\u0003\u0168\u00b4\u0000\u0e99\u0e9a\u0005\u0004\u0000"+
		"\u0000\u0e9a\u0e9c\u0003\u0168\u00b4\u0000\u0e9b\u0e99\u0001\u0000\u0000"+
		"\u0000\u0e9c\u0e9f\u0001\u0000\u0000\u0000\u0e9d\u0e9b\u0001\u0000\u0000"+
		"\u0000\u0e9d\u0e9e\u0001\u0000\u0000\u0000\u0e9e\u0165\u0001\u0000\u0000"+
		"\u0000\u0e9f\u0e9d\u0001\u0000\u0000\u0000\u0ea0\u0ea1\u0005\u0086\u0000"+
		"\u0000\u0ea1\u0ea2\u0005\u0002\u0000\u0000\u0ea2\u0ea3\u0003\u010a\u0085"+
		"\u0000\u0ea3\u0ea4\u0005\u0003\u0000\u0000\u0ea4\u0eab\u0001\u0000\u0000"+
		"\u0000\u0ea5\u0eab\u0005\u0086\u0000\u0000\u0ea6\u0eab\u0003\u0168\u00b4"+
		"\u0000\u0ea7\u0eab\u0005p\u0000\u0000\u0ea8\u0eab\u0005\u00a0\u0000\u0000"+
		"\u0ea9\u0eab\u0005\u00f4\u0000\u0000\u0eaa\u0ea0\u0001\u0000\u0000\u0000"+
		"\u0eaa\u0ea5\u0001\u0000\u0000\u0000\u0eaa\u0ea6\u0001\u0000\u0000\u0000"+
		"\u0eaa\u0ea7\u0001\u0000\u0000\u0000\u0eaa\u0ea8\u0001\u0000\u0000\u0000"+
		"\u0eaa\u0ea9\u0001\u0000\u0000\u0000\u0eab\u0167\u0001\u0000\u0000\u0000"+
		"\u0eac\u0eb1\u0003\u016e\u00b7\u0000\u0ead\u0eae\u0005\u0005\u0000\u0000"+
		"\u0eae\u0eb0\u0003\u016e\u00b7\u0000\u0eaf\u0ead\u0001\u0000\u0000\u0000"+
		"\u0eb0\u0eb3\u0001\u0000\u0000\u0000\u0eb1\u0eaf\u0001\u0000\u0000\u0000"+
		"\u0eb1\u0eb2\u0001\u0000\u0000\u0000\u0eb2\u0169\u0001\u0000\u0000\u0000"+
		"\u0eb3\u0eb1\u0001\u0000\u0000\u0000\u0eb4\u0eb5\u0003\u016e\u00b7\u0000"+
		"\u0eb5\u0eb6\u0003\u016c\u00b6\u0000\u0eb6\u016b\u0001\u0000\u0000\u0000"+
		"\u0eb7\u0eb8\u0005\u0162\u0000\u0000\u0eb8\u0eba\u0003\u016e\u00b7\u0000"+
		"\u0eb9\u0eb7\u0001\u0000\u0000\u0000\u0eba\u0ebb\u0001\u0000\u0000\u0000"+
		"\u0ebb\u0eb9\u0001\u0000\u0000\u0000\u0ebb\u0ebc\u0001\u0000\u0000\u0000"+
		"\u0ebc\u0ebf\u0001\u0000\u0000\u0000\u0ebd\u0ebf\u0001\u0000\u0000\u0000"+
		"\u0ebe\u0eb9\u0001\u0000\u0000\u0000\u0ebe\u0ebd\u0001\u0000\u0000\u0000"+
		"\u0ebf\u016d\u0001\u0000\u0000\u0000\u0ec0\u0ec4\u0003\u0170\u00b8\u0000"+
		"\u0ec1\u0ec2\u0004\u00b7\u0011\u0000\u0ec2\u0ec4\u0003\u0182\u00c1\u0000"+
		"\u0ec3\u0ec0\u0001\u0000\u0000\u0000\u0ec3\u0ec1\u0001\u0000\u0000\u0000"+
		"\u0ec4\u016f\u0001\u0000\u0000\u0000\u0ec5\u0ecc\u0005\u017d\u0000\u0000"+
		"\u0ec6\u0ecc\u0003\u0172\u00b9\u0000\u0ec7\u0ec8\u0004\u00b8\u0012\u0000"+
		"\u0ec8\u0ecc\u0003\u0180\u00c0\u0000\u0ec9\u0eca\u0004\u00b8\u0013\u0000"+
		"\u0eca\u0ecc\u0003\u0184\u00c2\u0000\u0ecb\u0ec5\u0001\u0000\u0000\u0000"+
		"\u0ecb\u0ec6\u0001\u0000\u0000\u0000\u0ecb\u0ec7\u0001\u0000\u0000\u0000"+
		"\u0ecb\u0ec9\u0001\u0000\u0000\u0000\u0ecc\u0171\u0001\u0000\u0000\u0000"+
		"\u0ecd\u0ed1\u0005\u017e\u0000\u0000\u0ece\u0ecf\u0004\u00b9\u0014\u0000"+
		"\u0ecf\u0ed1\u0005\u0173\u0000\u0000\u0ed0\u0ecd\u0001\u0000\u0000\u0000"+
		"\u0ed0\u0ece\u0001\u0000\u0000\u0000\u0ed1\u0173\u0001\u0000\u0000\u0000"+
		"\u0ed2\u0ed3\u0005\u017e\u0000\u0000\u0ed3\u0175\u0001\u0000\u0000\u0000"+
		"\u0ed4\u0ed6\u0004\u00bb\u0015\u0000\u0ed5\u0ed7\u0005\u0162\u0000\u0000"+
		"\u0ed6\u0ed5\u0001\u0000\u0000\u0000\u0ed6\u0ed7\u0001\u0000\u0000\u0000"+
		"\u0ed7\u0ed8\u0001\u0000\u0000\u0000\u0ed8\u0f00\u0005\u0178\u0000\u0000"+
		"\u0ed9\u0edb\u0004\u00bb\u0016\u0000\u0eda\u0edc\u0005\u0162\u0000\u0000"+
		"\u0edb\u0eda\u0001\u0000\u0000\u0000\u0edb\u0edc\u0001\u0000\u0000\u0000"+
		"\u0edc\u0edd\u0001\u0000\u0000\u0000\u0edd\u0f00\u0005\u0179\u0000\u0000"+
		"\u0ede\u0ee0\u0004\u00bb\u0017\u0000\u0edf\u0ee1\u0005\u0162\u0000\u0000"+
		"\u0ee0\u0edf\u0001\u0000\u0000\u0000\u0ee0\u0ee1\u0001\u0000\u0000\u0000"+
		"\u0ee1\u0ee2\u0001\u0000\u0000\u0000\u0ee2\u0f00\u00076\u0000\u0000\u0ee3"+
		"\u0ee5\u0005\u0162\u0000\u0000\u0ee4\u0ee3\u0001\u0000\u0000\u0000\u0ee4"+
		"\u0ee5\u0001\u0000\u0000\u0000\u0ee5\u0ee6\u0001\u0000\u0000\u0000\u0ee6"+
		"\u0f00\u0005\u0177\u0000\u0000\u0ee7\u0ee9\u0005\u0162\u0000\u0000\u0ee8"+
		"\u0ee7\u0001\u0000\u0000\u0000\u0ee8\u0ee9\u0001\u0000\u0000\u0000\u0ee9"+
		"\u0eea\u0001\u0000\u0000\u0000\u0eea\u0f00\u0005\u0174\u0000\u0000\u0eeb"+
		"\u0eed\u0005\u0162\u0000\u0000\u0eec\u0eeb\u0001\u0000\u0000\u0000\u0eec"+
		"\u0eed\u0001\u0000\u0000\u0000\u0eed\u0eee\u0001\u0000\u0000\u0000\u0eee"+
		"\u0f00\u0005\u0175\u0000\u0000\u0eef\u0ef1\u0005\u0162\u0000\u0000\u0ef0"+
		"\u0eef\u0001\u0000\u0000\u0000\u0ef0\u0ef1\u0001\u0000\u0000\u0000\u0ef1"+
		"\u0ef2\u0001\u0000\u0000\u0000\u0ef2\u0f00\u0005\u0176\u0000\u0000\u0ef3"+
		"\u0ef5\u0005\u0162\u0000\u0000\u0ef4\u0ef3\u0001\u0000\u0000\u0000\u0ef4"+
		"\u0ef5\u0001\u0000\u0000\u0000\u0ef5\u0ef6\u0001\u0000\u0000\u0000\u0ef6"+
		"\u0f00\u0005\u017b\u0000\u0000\u0ef7\u0ef9\u0005\u0162\u0000\u0000\u0ef8"+
		"\u0ef7\u0001\u0000\u0000\u0000\u0ef8\u0ef9\u0001\u0000\u0000\u0000\u0ef9"+
		"\u0efa\u0001\u0000\u0000\u0000\u0efa\u0f00\u0005\u017a\u0000\u0000\u0efb"+
		"\u0efd\u0005\u0162\u0000\u0000\u0efc\u0efb\u0001\u0000\u0000\u0000\u0efc"+
		"\u0efd\u0001\u0000\u0000\u0000\u0efd\u0efe\u0001\u0000\u0000\u0000\u0efe"+
		"\u0f00\u0005\u017c\u0000\u0000\u0eff\u0ed4\u0001\u0000\u0000\u0000\u0eff"+
		"\u0ed9\u0001\u0000\u0000\u0000\u0eff\u0ede\u0001\u0000\u0000\u0000\u0eff"+
		"\u0ee4\u0001\u0000\u0000\u0000\u0eff\u0ee8\u0001\u0000\u0000\u0000\u0eff"+
		"\u0eec\u0001\u0000\u0000\u0000\u0eff\u0ef0\u0001\u0000\u0000\u0000\u0eff"+
		"\u0ef4\u0001\u0000\u0000\u0000\u0eff\u0ef8\u0001\u0000\u0000\u0000\u0eff"+
		"\u0efc\u0001\u0000\u0000\u0000\u0f00\u0177\u0001\u0000\u0000\u0000\u0f01"+
		"\u0f02\u0005\u0138\u0000\u0000\u0f02\u0f0d\u0003\u013c\u009e\u0000\u0f03"+
		"\u0f0d\u0003.\u0017\u0000\u0f04\u0f0d\u0003\u0138\u009c\u0000\u0f05\u0f06"+
		"\u00077\u0000\u0000\u0f06\u0f07\u0005\u00c1\u0000\u0000\u0f07\u0f0d\u0005"+
		"\u00c2\u0000\u0000\u0f08\u0f09\u0005\u0106\u0000\u0000\u0f09\u0f0d\u0003"+
		"\u0144\u00a2\u0000\u0f0a\u0f0b\u0005_\u0000\u0000\u0f0b\u0f0d\u0005R\u0000"+
		"\u0000\u0f0c\u0f01\u0001\u0000\u0000\u0000\u0f0c\u0f03\u0001\u0000\u0000"+
		"\u0000\u0f0c\u0f04\u0001\u0000\u0000\u0000\u0f0c\u0f05\u0001\u0000\u0000"+
		"\u0000\u0f0c\u0f08\u0001\u0000\u0000\u0000\u0f0c\u0f0a\u0001\u0000\u0000"+
		"\u0000\u0f0d\u0179\u0001\u0000\u0000\u0000\u0f0e\u0f12\u0005\u0172\u0000"+
		"\u0000\u0f0f\u0f10\u0004\u00bd\u0018\u0000\u0f10\u0f12\u0005\u0173\u0000"+
		"\u0000\u0f11\u0f0e\u0001\u0000\u0000\u0000\u0f11\u0f0f\u0001\u0000\u0000"+
		"\u0000\u0f12\u017b\u0001\u0000\u0000\u0000\u0f13\u0f16\u0003\u017a\u00bd"+
		"\u0000\u0f14\u0f16\u0005\u00c2\u0000\u0000\u0f15\u0f13\u0001\u0000\u0000"+
		"\u0000\u0f15\u0f14\u0001\u0000\u0000\u0000\u0f16\u017d\u0001\u0000\u0000"+
		"\u0000\u0f17\u0f1a\u0005\u0177\u0000\u0000\u0f18\u0f1a\u0003\u017a\u00bd"+
		"\u0000\u0f19\u0f17\u0001\u0000\u0000\u0000\u0f19\u0f18\u0001\u0000\u0000"+
		"\u0000\u0f1a\u017f\u0001\u0000\u0000\u0000\u0f1b\u0f1c\u00078\u0000\u0000"+
		"\u0f1c\u0181\u0001\u0000\u0000\u0000\u0f1d\u0f1e\u00079\u0000\u0000\u0f1e"+
		"\u0183\u0001\u0000\u0000\u0000\u0f1f\u0f20\u0007:\u0000\u0000\u0f20\u0185"+
		"\u0001\u0000\u0000\u0000\u01f4\u018a\u01a4\u01b1\u01b8\u01c0\u01c2\u01d6"+
		"\u01da\u01e0\u01e3\u01e6\u01ed\u01f0\u01f4\u01f7\u01fe\u0209\u020b\u0213"+
		"\u0216\u021a\u021d\u0223\u022e\u0234\u0239\u025b\u0268\u0281\u028a\u028e"+
		"\u0294\u0298\u029d\u02a3\u02af\u02b7\u02bd\u02ca\u02cf\u02df\u02e6\u02ea"+
		"\u02f0\u02ff\u0303\u0309\u030f\u0312\u0315\u031b\u031f\u0327\u0329\u0332"+
		"\u0335\u033e\u0343\u0349\u0350\u0353\u0359\u0364\u0367\u036b\u0370\u0376"+
		"\u0379\u037d\u0380\u0387\u038c\u0393\u0396\u0399\u03a0\u03a5\u03ae\u03b6"+
		"\u03bc\u03bf\u03c2\u03c8\u03cc\u03d1\u03d4\u03d8\u03da\u03e2\u03ea\u03ed"+
		"\u03f2\u03f8\u03fe\u0401\u0405\u0408\u040c\u0428\u042b\u042f\u0435\u0438"+
		"\u043b\u0441\u0449\u044e\u0454\u045a\u045d\u0464\u046b\u0473\u0484\u049f"+
		"\u04a2\u04a8\u04b1\u04ba\u04c2\u04c7\u04cc\u04d3\u04d9\u04de\u04e6\u04e9"+
		"\u04f0\u04f3\u04fc\u0500\u0504\u0508\u050f\u0514\u0520\u0524\u052b\u059f"+
		"\u05a7\u05af\u05b8\u05c2\u05c6\u05c9\u05cf\u05d5\u05e7\u05f3\u05f8\u0601"+
		"\u0609\u0610\u0612\u0617\u061c\u0620\u0625\u062a\u062f\u0638\u063d\u0640"+
		"\u0645\u0649\u064e\u0650\u0654\u065d\u0665\u066b\u0676\u067d\u0686\u068b"+
		"\u068e\u06a5\u06a7\u06b0\u06b7\u06ba\u06c1\u06c5\u06cb\u06d3\u06da\u06dd"+
		"\u06e5\u06f0\u06fb\u0703\u0709\u0715\u071c\u0723\u072f\u0737\u073d\u0743"+
		"\u0746\u074e\u0757\u075a\u0763\u0766\u076f\u0772\u077b\u077e\u0781\u0786"+
		"\u0788\u078c\u0798\u079f\u07a6\u07a9\u07ab\u07b7\u07bb\u07bf\u07c5\u07c9"+
		"\u07d1\u07d5\u07d8\u07db\u07de\u07e2\u07e6\u07eb\u07ef\u07f2\u07f5\u07f8"+
		"\u07fc\u0801\u0805\u0808\u080b\u080e\u0810\u0816\u081d\u0822\u0825\u0828"+
		"\u082c\u0836\u083a\u083c\u083f\u0843\u0849\u084d\u0858\u0862\u0866\u0872"+
		"\u087e\u088d\u0892\u0898\u08a4\u08b4\u08b9\u08c6\u08cb\u08d3\u08d9\u08dd"+
		"\u08e0\u08e3\u08ea\u08f0\u08f9\u0903\u0912\u0917\u0919\u091d\u0926\u0933"+
		"\u0938\u093c\u0944\u0947\u094b\u0959\u0966\u096b\u096f\u0972\u0976\u097c"+
		"\u097f\u0986\u0992\u099d\u09aa\u09b5\u09ba\u09c2\u09c7\u09ce\u09d7\u09da"+
		"\u09df\u09e6\u09e9\u09ee\u09f4\u09fa\u09ff\u0a03\u0a09\u0a0d\u0a10\u0a15"+
		"\u0a18\u0a1d\u0a21\u0a24\u0a27\u0a2d\u0a32\u0a39\u0a3c\u0a4e\u0a50\u0a53"+
		"\u0a5e\u0a67\u0a6e\u0a76\u0a7d\u0a81\u0a84\u0a8c\u0a94\u0a9a\u0aa2\u0aaa"+
		"\u0ab1\u0ab8\u0aba\u0ac7\u0acd\u0acf\u0ad9\u0adf\u0ae1\u0ae9\u0aed\u0af6"+
		"\u0af9\u0aff\u0b03\u0b05\u0b0e\u0b1a\u0b1c\u0b23\u0b2a\u0b30\u0b36\u0b38"+
		"\u0b3f\u0b47\u0b4f\u0b55\u0b5a\u0b61\u0b67\u0b6b\u0b6d\u0b74\u0b7d\u0b84"+
		"\u0b8e\u0b93\u0b97\u0ba1\u0ba8\u0bb5\u0bb7\u0bbf\u0bc1\u0bc5\u0bcd\u0bd6"+
		"\u0bdc\u0be4\u0be9\u0bf5\u0bfa\u0bfd\u0c03\u0c07\u0c0c\u0c11\u0c16\u0c1c"+
		"\u0c31\u0c33\u0c3e\u0c4a\u0c56\u0c5a\u0c63\u0c67\u0c79\u0c7c\u0c84\u0c8d"+
		"\u0c96\u0ca4\u0caa\u0cb2\u0cbd\u0cc4\u0cc7\u0cd4\u0cd9\u0ce1\u0ce5\u0ce9"+
		"\u0cf5\u0d0e\u0d15\u0d18\u0d27\u0d2b\u0d38\u0d3a\u0d44\u0d53\u0d55\u0d62"+
		"\u0d66\u0d6d\u0d72\u0d7a\u0d7f\u0d88\u0da9\u0dba\u0dbe\u0dc4\u0dca\u0dd3"+
		"\u0dd7\u0dd9\u0de0\u0de8\u0df0\u0dfd\u0e04\u0e07\u0e0e\u0e16\u0e1e\u0e2c"+
		"\u0e31\u0e36\u0e39\u0e46\u0e5a\u0e64\u0e67\u0e70\u0e73\u0e75\u0e78\u0e7b"+
		"\u0e8d\u0e96\u0e9d\u0eaa\u0eb1\u0ebb\u0ebe\u0ec3\u0ecb\u0ed0\u0ed6\u0edb"+
		"\u0ee0\u0ee4\u0ee8\u0eec\u0ef0\u0ef4\u0ef8\u0efc\u0eff\u0f0c\u0f11\u0f15"+
		"\u0f19";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}