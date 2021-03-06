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
 *    mwenz - Bug 323155 - Check usage scenarios for DefaultPrintFeature and
 *            DefaultSaveImageFeature
 *
 * </copyright>
 *
 *******************************************************************************/
package org.eclipse.graphiti.features;

import org.eclipse.graphiti.features.context.ISaveImageContext;
import org.eclipse.graphiti.features.impl.DefaultSaveImageFeature;

/**
 * The Interface ISaveImageFeature. It is planned to use this for save as image
 * support. Not yet supported perfectly.
 * 
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients,
 *              extend {@link DefaultSaveImageFeature} instead.
 */
public interface ISaveImageFeature extends IFeature {

	/**
	 * Can save.
	 * 
	 * @param context
	 *            the context
	 * 
	 * @return true, if successful
	 */
	boolean canSave(ISaveImageContext context);

	/**
	 * Pre-save hook. Called before the actual save process starts. You may use
	 * this hook to influence the current state of the diagram or the selection.
	 * 
	 * @param context
	 *            the context
	 */
	void preSave(ISaveImageContext context);

	/**
	 * Post-save hook. Called after the actual save process. You may use this
	 * hook to set back the changes done in the preSave method.
	 * 
	 * @param context
	 *            the context
	 */
	void postSave(ISaveImageContext context);
}
