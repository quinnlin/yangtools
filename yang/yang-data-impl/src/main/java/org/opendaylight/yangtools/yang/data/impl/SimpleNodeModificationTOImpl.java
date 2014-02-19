/*
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.yangtools.yang.data.impl;

import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.data.api.CompositeNode;
import org.opendaylight.yangtools.yang.data.api.ModifyAction;

/**
 * @author michal.rehak
 * @param <T> type of node value
 *
 */
public class SimpleNodeModificationTOImpl<T> extends SimpleNodeTOImpl<T> {
    private static final long serialVersionUID = 1L;

    /**
     * @param qname
     * @param parent
     * @param value
     * @param modifyAction
     */
    public SimpleNodeModificationTOImpl(QName qname, CompositeNode parent,
            T value, ModifyAction modifyAction) {
        super(qname, parent, value);
        setModificationAction(modifyAction);
    }
}
