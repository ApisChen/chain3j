package org.chain3j.protocol.core.methods.response;

import org.chain3j.protocol.core.Response;

/**
 * vnode_address.
 */
public class McCompileLLL extends Response<String> {
    public String getCompiledSourceCode() {
        return getResult();
    }
}
