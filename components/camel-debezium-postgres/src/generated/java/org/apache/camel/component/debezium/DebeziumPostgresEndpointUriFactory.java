/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.debezium;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class DebeziumPostgresEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":name";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(87);
        set.add("name");
        set.add("additionalProperties");
        set.add("bridgeErrorHandler");
        set.add("internalKeyConverter");
        set.add("internalValueConverter");
        set.add("offsetCommitPolicy");
        set.add("offsetCommitTimeoutMs");
        set.add("offsetFlushIntervalMs");
        set.add("offsetStorage");
        set.add("offsetStorageFileName");
        set.add("offsetStoragePartitions");
        set.add("offsetStorageReplicationFactor");
        set.add("offsetStorageTopic");
        set.add("exceptionHandler");
        set.add("exchangePattern");
        set.add("basicPropertyBinding");
        set.add("synchronous");
        set.add("binaryHandlingMode");
        set.add("columnBlacklist");
        set.add("columnExcludeList");
        set.add("columnIncludeList");
        set.add("columnPropagateSourceType");
        set.add("columnWhitelist");
        set.add("converters");
        set.add("databaseDbname");
        set.add("databaseHistoryFileFilename");
        set.add("databaseHostname");
        set.add("databaseInitialStatements");
        set.add("databasePassword");
        set.add("databasePort");
        set.add("databaseServerName");
        set.add("databaseSslcert");
        set.add("databaseSslfactory");
        set.add("databaseSslkey");
        set.add("databaseSslmode");
        set.add("databaseSslpassword");
        set.add("databaseSslrootcert");
        set.add("databaseTcpkeepalive");
        set.add("databaseUser");
        set.add("datatypePropagateSourceType");
        set.add("decimalHandlingMode");
        set.add("eventProcessingFailureHandlingMode");
        set.add("heartbeatActionQuery");
        set.add("heartbeatIntervalMs");
        set.add("heartbeatTopicsPrefix");
        set.add("hstoreHandlingMode");
        set.add("includeUnknownDatatypes");
        set.add("intervalHandlingMode");
        set.add("maxBatchSize");
        set.add("maxQueueSize");
        set.add("messageKeyColumns");
        set.add("pluginName");
        set.add("pollIntervalMs");
        set.add("provideTransactionMetadata");
        set.add("publicationAutocreateMode");
        set.add("publicationName");
        set.add("queryFetchSize");
        set.add("retriableRestartConnectorWaitMs");
        set.add("sanitizeFieldNames");
        set.add("schemaBlacklist");
        set.add("schemaExcludeList");
        set.add("schemaIncludeList");
        set.add("schemaRefreshMode");
        set.add("schemaWhitelist");
        set.add("skippedOperations");
        set.add("slotDropOnStop");
        set.add("slotMaxRetries");
        set.add("slotName");
        set.add("slotRetryDelayMs");
        set.add("slotStreamParams");
        set.add("snapshotCustomClass");
        set.add("snapshotDelayMs");
        set.add("snapshotFetchSize");
        set.add("snapshotLockTimeoutMs");
        set.add("snapshotMode");
        set.add("snapshotSelectStatementOverrides");
        set.add("sourceStructVersion");
        set.add("statusUpdateIntervalMs");
        set.add("tableBlacklist");
        set.add("tableExcludeList");
        set.add("tableIgnoreBuiltin");
        set.add("tableIncludeList");
        set.add("tableWhitelist");
        set.add("timePrecisionMode");
        set.add("toastedValuePlaceholder");
        set.add("tombstonesOnDelete");
        set.add("xminFetchIntervalMs");
        PROPERTY_NAMES = set;
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "debezium-postgres".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "name", null, true, copy);
        uri = buildQueryParameters(uri, copy);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

