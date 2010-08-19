/*******************************************************************************
 * <copyright>
 *
 * Copyright (c) 2005, 2010 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    SAP AG - initial API, implementation and documentation
 *
 * </copyright>
 *
 *******************************************************************************/
package org.eclipse.graphiti.pattern;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Connection;

/**
 * The Class CreateConnectionFeatureForPattern.
 */
public class CreateConnectionFeatureForPattern extends AbstractCreateConnectionFeature {
	private IConnectionPattern delegate;

	/**
	 * Creates a new {@link CreateConnectionFeatureForPattern}.
	 * 
	 * @param featureProvider
	 *            the feature provider
	 * @param pattern
	 *            the connection pattern
	 */
	public CreateConnectionFeatureForPattern(IFeatureProvider featureProvider, IConnectionPattern pattern) {
		super(featureProvider, pattern.getCreateName(), pattern.getCreateDescription());
		delegate = pattern;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.graphiti.func.ICreateConnection#canCreate(org.eclipse.graphiti.features.context.ICreateConnectionContext)
	 */
	public boolean canCreate(ICreateConnectionContext context) {
		boolean ret = delegate.canCreate(context);
		return ret;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.graphiti.func.ICreateConnection#canStartConnection(org.eclipse.graphiti.features.context.ICreateConnectionContext)
	 */
	public boolean canStartConnection(ICreateConnectionContext context) {
		return delegate.canStartConnection(context);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.graphiti.func.ICreateConnection#create(org.eclipse.graphiti.features.context.ICreateConnectionContext)
	 */
	public Connection create(ICreateConnectionContext context) {
		return delegate.create(context);
	}

	@Override
	public String getCreateImageId() {
		return delegate.getCreateImageId();
	}

	@Override
	public String getCreateLargeImageId() {
		return delegate.getCreateLargeImageId();
	}

}
