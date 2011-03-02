/*******************************************************************************
 * <copyright>
 *
 * Copyright (c) 2005, 2011 SAP AG.
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
package org.eclipse.graphiti.services;

import org.eclipse.graphiti.mm.pictograms.Diagram;

/**
 * Migration support for converting models from older to newer versions.
 * 
 * @since 0.8.0
 */
public interface IMigrationService {

	/**
	 * Moves fonts which, in 0.7.0, were aggregated by AbstractText and Style to
	 * the diagram which aggregates fonts centrally as of 0.8.0. Possibly
	 * modifies the diagram. Has to be called from within a write transaction.
	 * 
	 * @param diagram
	 *            the diagram to be migrated.
	 * 
	 */
	public abstract void migrate070To080(Diagram diagram);

}